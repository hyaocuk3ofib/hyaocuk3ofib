package com.coffeewx.service;
import com.coffeewx.model.Dept;
import com.coffeewx.core.Service;
import java.util.List;

/**
 * Created by CodeGenerator on 2019/03/27.
 */
public interface DeptService extends Service<Dept> {

    List<Dept> findList(Dept sysDept);

}
