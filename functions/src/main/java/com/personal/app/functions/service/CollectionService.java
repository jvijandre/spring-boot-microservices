package com.personal.app.functions.service;

import com.personal.app.functions.dto.request.CollectionRequest;
import com.personal.app.functions.dto.response.CollectionResponse;

public interface CollectionService {
    CollectionResponse filterBy(CollectionRequest request);
}
