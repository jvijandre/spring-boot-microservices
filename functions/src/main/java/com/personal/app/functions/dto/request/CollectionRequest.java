package com.personal.app.functions.dto.request;

import java.util.ArrayList;

public record CollectionRequest(ArrayList<?> list, String message) {
}
