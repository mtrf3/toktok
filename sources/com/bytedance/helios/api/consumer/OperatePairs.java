package com.bytedance.helios.api.consumer;

import X.X1D;
import defpackage.b1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class OperatePairs {
    public final String changedKey;
    public final transient String changedValue;
    public final String originKey;
    public final transient String originValue;

    /* JADX WARN: Multi-variable type inference failed */
    public OperatePairs() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ OperatePairs copy$default(OperatePairs operatePairs, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = operatePairs.originKey;
        }
        if ((i & 2) != 0) {
            str2 = operatePairs.originValue;
        }
        if ((i & 4) != 0) {
            str3 = operatePairs.changedKey;
        }
        if ((i & 8) != 0) {
            str4 = operatePairs.changedValue;
        }
        return operatePairs.copy(str, str2, str3, str4);
    }

    public final OperatePairs copy(String str, String str2, String str3, String str4) {
        return new OperatePairs(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OperatePairs)) {
            return false;
        }
        OperatePairs operatePairs = (OperatePairs) obj;
        return o.LJ(this.originKey, operatePairs.originKey) && o.LJ(this.originValue, operatePairs.originValue) && o.LJ(this.changedKey, operatePairs.changedKey) && o.LJ(this.changedValue, operatePairs.changedValue);
    }

    public int hashCode() {
        String str = this.originKey;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.originValue;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.changedKey;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.changedValue;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        boolean z;
        String str;
        boolean z2;
        String str2;
        String str3;
        String str4 = this.originKey;
        if (str4 == null || ujb.o.LJJJJJL(str4)) {
            z = true;
        } else {
            z = false;
        }
        String str5 = "";
        if (z) {
            str = "";
        } else {
            StringBuilder LIZJ = b1.LIZJ("", "originKey: ");
            LIZJ.append(this.originKey);
            str = X1D.LIZIZ(LIZJ);
        }
        String str6 = this.changedKey;
        if (str6 == null || ujb.o.LJJJJJL(str6)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            if (!(!ujb.o.LJJJJJL(str))) {
                str3 = "";
            } else {
                str3 = ", ";
            }
            LIZ.append(str3);
            LIZ.append("changedKey: ");
            LIZ.append(this.changedKey);
            str = X1D.LIZIZ(LIZ);
        }
        String str7 = this.originValue;
        if (str7 != null && !ujb.o.LJJJJJL(str7)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str);
            if (!(!ujb.o.LJJJJJL(str))) {
                str2 = "";
            } else {
                str2 = ", ";
            }
            LIZ2.append(str2);
            LIZ2.append("originValue: ");
            LIZ2.append(this.originValue);
            str = X1D.LIZIZ(LIZ2);
        }
        String str8 = this.changedValue;
        if (str8 == null || ujb.o.LJJJJJL(str8)) {
            return str;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(str);
        if (!ujb.o.LJJJJJL(str)) {
            str5 = ", ";
        }
        LIZ3.append(str5);
        LIZ3.append("changedValue: ");
        LIZ3.append(this.changedValue);
        return X1D.LIZIZ(LIZ3);
    }

    public final String getChangedKey() {
        return this.changedKey;
    }

    public final String getChangedValue() {
        return this.changedValue;
    }

    public final String getOriginKey() {
        return this.originKey;
    }

    public final String getOriginValue() {
        return this.originValue;
    }

    public OperatePairs(String str, String str2, String str3, String str4) {
        this.originKey = str;
        this.originValue = str2;
        this.changedKey = str3;
        this.changedValue = str4;
    }

    public /* synthetic */ OperatePairs(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
