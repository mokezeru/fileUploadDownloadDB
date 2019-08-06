package com.charter.fileUploadDownloadDB.repository;

import com.charter.fileUploadDownloadDB.model.DBFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DBFileRepository extends JpaRepository<DBFile, String> {

}
