package com.bytedance.pitaya.feature;

import X.C93277aOH;
import X.F9E;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes30.dex */
public final class SQLColumn extends F9E implements ReflectionCall {
    public static final C93277aOH Companion = new C93277aOH();
    public final double dValue;
    public final long iValue;
    public final String name;
    public final String strValue;
    public final int type;

    public static /* synthetic */ SQLColumn copy$default(SQLColumn sQLColumn, String str, int i, double d, long j, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = sQLColumn.name;
        }
        if ((i2 & 2) != 0) {
            i = sQLColumn.type;
        }
        if ((i2 & 4) != 0) {
            d = sQLColumn.dValue;
        }
        if ((i2 & 8) != 0) {
            j = sQLColumn.iValue;
        }
        if ((i2 & 16) != 0) {
            str2 = sQLColumn.strValue;
        }
        return sQLColumn.copy(str, i, d, j, str2);
    }

    public final SQLColumn copy(String str, int i, double d, long j, String str2) {
        return new SQLColumn(str, i, d, j, str2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.name, Integer.valueOf(this.type), Double.valueOf(this.dValue), Long.valueOf(this.iValue), this.strValue};
    }

    public final double getDValue() {
        return this.dValue;
    }

    public final long getIValue() {
        return this.iValue;
    }

    public final String getName() {
        return this.name;
    }

    public final String getStrValue() {
        return this.strValue;
    }

    public final int getType() {
        return this.type;
    }

    public SQLColumn(String str, int i, double d, long j, String str2) {
        this.name = str;
        this.type = i;
        this.dValue = d;
        this.iValue = j;
        this.strValue = str2;
    }

    public /* synthetic */ SQLColumn(String str, int i, double d, long j, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, i, (i2 & 4) != 0 ? LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX : d, (i2 & 8) != 0 ? 0L : j, (i2 & 16) == 0 ? str2 : null);
    }
}
