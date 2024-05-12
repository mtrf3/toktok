package com.ss.android.ugc.effectmanager.effect.model.net;

import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.ss.android.ugc.effectmanager.effect.model.PlatformEffect;
import java.util.List;

/* loaded from: classes16.dex */
public class ScanQRCodeResponse extends BaseNetResponse {
    public DataNode data;

    /* loaded from: classes16.dex */
    public static class DataNode {
        public PlatformEffect effect;
        public List<String> url_prefix;
    }

    @Override // com.ss.android.ugc.effectmanager.common.model.BaseNetResponse
    public boolean checkValue() {
        if (this.data != null) {
            return true;
        }
        return false;
    }
}
