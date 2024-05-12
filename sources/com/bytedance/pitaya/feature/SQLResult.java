package com.bytedance.pitaya.feature;

import X.F9E;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes30.dex */
public final class SQLResult extends F9E implements ReflectionCall {
    public final List<List<SQLColumn>> data;
    public final int errorCode;
    public final String errorMessage;
    public final boolean success;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SQLResult copy$default(SQLResult sQLResult, boolean z, int i, String str, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = sQLResult.success;
        }
        if ((i2 & 2) != 0) {
            i = sQLResult.errorCode;
        }
        if ((i2 & 4) != 0) {
            str = sQLResult.errorMessage;
        }
        if ((i2 & 8) != 0) {
            list = sQLResult.data;
        }
        return sQLResult.copy(z, i, str, list);
    }

    public final SQLResult copy(boolean z, int i, String errorMessage, List<? extends List<SQLColumn>> list) {
        o.LJIIJ(errorMessage, "errorMessage");
        return new SQLResult(z, i, errorMessage, list);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.success), Integer.valueOf(this.errorCode), this.errorMessage, this.data};
    }

    public final List<List<SQLColumn>> getData() {
        return this.data;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SQLResult(boolean z, int i, String errorMessage, List<? extends List<SQLColumn>> list) {
        o.LJIIJ(errorMessage, "errorMessage");
        this.success = z;
        this.errorCode = i;
        this.errorMessage = errorMessage;
        this.data = list;
    }
}
