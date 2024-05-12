package com.bytedance.pitaya.api.feature.store;

import X.F9E;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class PTYFeatureQuery extends F9E implements ReflectionCall {
    public final String extParams;
    public final String featureName;

    /* renamed from: n, reason: collision with root package name */
    public final int f118n;
    public final int queryType;
    public final String returnFeatureName;
    public final int returnType;
    public final String subFeatureName;

    public static /* synthetic */ PTYFeatureQuery copy$default(PTYFeatureQuery pTYFeatureQuery, String str, String str2, String str3, int i, int i2, int i3, String str4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = pTYFeatureQuery.returnFeatureName;
        }
        if ((i4 & 2) != 0) {
            str2 = pTYFeatureQuery.featureName;
        }
        if ((i4 & 4) != 0) {
            str3 = pTYFeatureQuery.subFeatureName;
        }
        if ((i4 & 8) != 0) {
            i = pTYFeatureQuery.f118n;
        }
        if ((i4 & 16) != 0) {
            i2 = pTYFeatureQuery.queryType;
        }
        if ((i4 & 32) != 0) {
            i3 = pTYFeatureQuery.returnType;
        }
        if ((i4 & 64) != 0) {
            str4 = pTYFeatureQuery.extParams;
        }
        return pTYFeatureQuery.copy(str, str2, str3, i, i2, i3, str4);
    }

    public final PTYFeatureQuery copy(String returnFeatureName, String featureName, String str, int i, int i2, int i3, String str2) {
        o.LJIIJ(returnFeatureName, "returnFeatureName");
        o.LJIIJ(featureName, "featureName");
        return new PTYFeatureQuery(returnFeatureName, featureName, str, i, i2, i3, str2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.returnFeatureName, this.featureName, this.subFeatureName, Integer.valueOf(this.f118n), Integer.valueOf(this.queryType), Integer.valueOf(this.returnType), this.extParams};
    }

    public final String getExtParams() {
        return this.extParams;
    }

    public final String getFeatureName() {
        return this.featureName;
    }

    public final int getN() {
        return this.f118n;
    }

    public final int getQueryType() {
        return this.queryType;
    }

    public final String getReturnFeatureName() {
        return this.returnFeatureName;
    }

    public final int getReturnType() {
        return this.returnType;
    }

    public final String getSubFeatureName() {
        return this.subFeatureName;
    }

    public PTYFeatureQuery(String returnFeatureName, String featureName, String str, int i, int i2, int i3, String str2) {
        o.LJIIJ(returnFeatureName, "returnFeatureName");
        o.LJIIJ(featureName, "featureName");
        this.returnFeatureName = returnFeatureName;
        this.featureName = featureName;
        this.subFeatureName = str;
        this.f118n = i;
        this.queryType = i2;
        this.returnType = i3;
        this.extParams = str2;
    }

    public /* synthetic */ PTYFeatureQuery(String str, String str2, String str3, int i, int i2, int i3, String str4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i4 & 4) != 0 ? null : str3, (i4 & 8) != 0 ? 0 : i, i2, i3, (i4 & 64) == 0 ? str4 : null);
    }
}
