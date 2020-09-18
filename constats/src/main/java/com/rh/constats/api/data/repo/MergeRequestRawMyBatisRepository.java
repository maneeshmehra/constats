package com.rh.constats.api.data.repo;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.rh.constats.api.data.MergeRequestRaw;

@Mapper
public interface MergeRequestRawMyBatisRepository {
	
    @Select("select * from mrs_raw")
    public List <MergeRequestRaw> findAll();

    @Select("SELECT * FROM mrs_raw WHERE id = #{id}")
    public MergeRequestRaw findById(long id);

    @Delete("DELETE FROM mrs_raw WHERE id = #{id}")
    public int deleteById(long id);

    @Insert("INSERT INTO mrs_raw(mr_id, page, raw_json) " +
        " VALUES (#{mr_id}, #{page}, #{raw_json})")
    public int insert(MergeRequestRaw mergeRequestRaw);
}
