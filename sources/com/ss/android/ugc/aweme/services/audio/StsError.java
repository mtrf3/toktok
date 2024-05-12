package com.ss.android.ugc.aweme.services.audio;

import X.F9E;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class StsError extends F9E {
    public final int errorCode;
    public final String errorMsg;
    public final Map<String, String> extraMap;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StsError copy$default(StsError stsError, int i, String str, Map map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = stsError.errorCode;
        }
        if ((i2 & 2) != 0) {
            str = stsError.errorMsg;
        }
        if ((i2 & 4) != 0) {
            map = stsError.extraMap;
        }
        return stsError.copy(i, str, map);
    }

    public final StsError copy(int i, String errorMsg, Map<String, String> extraMap) {
        o.LJIIIZ(errorMsg, "errorMsg");
        o.LJIIIZ(extraMap, "extraMap");
        return new StsError(i, errorMsg, extraMap);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.errorCode), this.errorMsg, this.extraMap};
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMsg() {
        return this.errorMsg;
    }

    public final Map<String, String> getExtraMap() {
        return this.extraMap;
    }

    public StsError(int i, String errorMsg, Map<String, String> extraMap) {
        o.LJIIIZ(errorMsg, "errorMsg");
        o.LJIIIZ(extraMap, "extraMap");
        this.errorCode = i;
        this.errorMsg = errorMsg;
        this.extraMap = extraMap;
    }

    public /* synthetic */ StsError(int i, String str, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? new LinkedHashMap() : map);
    }
}
