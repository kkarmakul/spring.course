package edu.sibinfo.spring.basic.module09.service;

import edu.sibinfo.spring.basic.common09.domain.Client;

public interface ClientService {
	Client register(String firstName, String familyName, String phone);

	void setPassword(Client client, String password);
}
