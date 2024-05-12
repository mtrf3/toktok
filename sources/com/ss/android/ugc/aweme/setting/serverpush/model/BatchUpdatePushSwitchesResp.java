package com.ss.android.ugc.aweme.setting.serverpush.model;

import X.C15890jp;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class BatchUpdatePushSwitchesResp extends BaseResponse {

    @InterfaceC65349Pkn("push_settings")
    public final Map<String, Integer> updatedSwitches;

    /* JADX WARN: Multi-variable type inference failed */
    public BatchUpdatePushSwitchesResp() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BatchUpdatePushSwitchesResp) && o.LJ(this.updatedSwitches, ((BatchUpdatePushSwitchesResp) obj).updatedSwitches);
    }

    public final int hashCode() {
        Map<String, Integer> map = this.updatedSwitches;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BatchUpdatePushSwitchesResp(updatedSwitches=");
        return C15890jp.LIZ(LIZ, this.updatedSwitches, ')', LIZ);
    }

    public BatchUpdatePushSwitchesResp(Map<String, Integer> map) {
        this.updatedSwitches = map;
    }

    public /* synthetic */ BatchUpdatePushSwitchesResp(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : map);
    }
}
