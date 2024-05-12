package com.bytedance.globalpayment.iap.common.ability.model.api.entity;

/* loaded from: classes14.dex */
public class OneTimeOrderStateResponseEntity extends ResponseEntity {

    @JsonName("data")
    public Data data;

    /* loaded from: classes14.dex */
    public static class Data {

        @JsonName("status")
        public String status;

        @JsonName("track_id")
        public String trackId;
    }
}
