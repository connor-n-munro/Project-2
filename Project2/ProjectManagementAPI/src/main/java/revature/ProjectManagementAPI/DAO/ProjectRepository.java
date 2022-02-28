package revature.ProjectManagementAPI.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import revature.ProjectManagementAPI.models.Project;

@Repository
@Transactional
public interface ProjectRepository extends JpaRepository<Project, Integer> {
}
