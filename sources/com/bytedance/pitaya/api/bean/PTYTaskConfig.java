package com.bytedance.pitaya.api.bean;

import X.C7OC;
import X.F9E;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class PTYTaskConfig extends F9E implements ReflectionCall {
    public static final C7OC Companion = new Object() { // from class: X.7OC
    };
    public int callType;
    public final String entrance;
    public final float pendingTimeout;
    public final boolean sync;

    /* JADX WARN: Multi-variable type inference failed */
    public PTYTaskConfig() {
        this(false, null, 0.0f, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PTYTaskConfig copy$default(PTYTaskConfig pTYTaskConfig, boolean z, String str, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            z = pTYTaskConfig.sync;
        }
        if ((i & 2) != 0) {
            str = pTYTaskConfig.entrance;
        }
        if ((i & 4) != 0) {
            f = pTYTaskConfig.pendingTimeout;
        }
        return pTYTaskConfig.copy(z, str, f);
    }

    public final PTYTaskConfig copy(boolean z, String str, float f) {
        return new PTYTaskConfig(z, str, f);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.sync), this.entrance, Float.valueOf(this.pendingTimeout)};
    }

    public final int getCallType() {
        return this.callType;
    }

    public final String getEntrance() {
        return this.entrance;
    }

    public final float getPendingTimeout() {
        return this.pendingTimeout;
    }

    public final boolean getSync() {
        return this.sync;
    }

    public final void setCallType(int i) {
        this.callType = i;
    }

    public PTYTaskConfig(boolean z, String str, float f) {
        this.sync = z;
        this.entrance = str;
        this.pendingTimeout = f;
        this.callType = 1;
    }

    public /* synthetic */ PTYTaskConfig(boolean z, String str, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? -1.0f : f);
    }
}
