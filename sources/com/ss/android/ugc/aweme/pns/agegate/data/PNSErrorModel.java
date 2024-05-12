package com.ss.android.ugc.aweme.pns.agegate.data;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class PNSErrorModel implements Serializable {

    @InterfaceC65349Pkn("error_message")
    public final String errorMessage;

    @InterfaceC65349Pkn("error_type")
    public final Integer errorType;

    /* JADX WARN: Multi-variable type inference failed */
    public PNSErrorModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PNSErrorModel copy$default(PNSErrorModel pNSErrorModel, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = pNSErrorModel.errorType;
        }
        if ((i & 2) != 0) {
            str = pNSErrorModel.errorMessage;
        }
        return pNSErrorModel.copy(num, str);
    }

    public final PNSErrorModel copy(Integer num, String str) {
        return new PNSErrorModel(num, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PNSErrorModel)) {
            return false;
        }
        PNSErrorModel pNSErrorModel = (PNSErrorModel) obj;
        return o.LJ(this.errorType, pNSErrorModel.errorType) && o.LJ(this.errorMessage, pNSErrorModel.errorMessage);
    }

    public int hashCode() {
        Integer num = this.errorType;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.errorMessage;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PNSErrorModel(errorType=");
        LIZ.append(this.errorType);
        LIZ.append(", errorMessage=");
        LIZ.append((Object) this.errorMessage);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final Integer getErrorType() {
        return this.errorType;
    }

    public PNSErrorModel(Integer num, String str) {
        this.errorType = num;
        this.errorMessage = str;
    }

    public /* synthetic */ PNSErrorModel(Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
    }
}
