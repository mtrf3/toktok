package com.bytedance.globalpayment.iap.common.ability.model.api.entity;

/* loaded from: classes14.dex */
public class CreateOrderResponseEntity extends ResponseEntity {

    @JsonName("data")
    public Data data;

    /* loaded from: classes14.dex */
    public static class Data {

        @JsonName("request_id")
        public String requestId;

        @JsonName("pay_in_track_id")
        public String trackId;
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.model.api.entity.ResponseEntity
    public boolean isSuccess() {
        if (this.errorCode == 0) {
            return true;
        }
        return false;
    }
}
