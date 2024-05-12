package com.ss.android.ugc.aweme.services.model;

import X.C78685UuP;
import X.X1D;
import android.os.Bundle;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class BindServiceData {
    public final Bundle activityData;
    public final String enterFrom;
    public final String enterFromInfo;
    public final String enterMethod;
    public final Bundle updatedActivityData;

    private final Bundle component1() {
        return this.activityData;
    }

    private final String component2() {
        return this.enterFrom;
    }

    private final String component3() {
        return this.enterFromInfo;
    }

    private final String component4() {
        return this.enterMethod;
    }

    public static /* synthetic */ BindServiceData copy$default(BindServiceData bindServiceData, Bundle bundle, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            bundle = bindServiceData.activityData;
        }
        if ((i & 2) != 0) {
            str = bindServiceData.enterFrom;
        }
        if ((i & 4) != 0) {
            str2 = bindServiceData.enterFromInfo;
        }
        if ((i & 8) != 0) {
            str3 = bindServiceData.enterMethod;
        }
        return bindServiceData.copy(bundle, str, str2, str3);
    }

    public final BindServiceData copy(Bundle bundle, String str, String str2, String str3) {
        return new BindServiceData(bundle, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BindServiceData)) {
            return false;
        }
        BindServiceData bindServiceData = (BindServiceData) obj;
        return o.LJ(this.activityData, bindServiceData.activityData) && o.LJ(this.enterFrom, bindServiceData.enterFrom) && o.LJ(this.enterFromInfo, bindServiceData.enterFromInfo) && o.LJ(this.enterMethod, bindServiceData.enterMethod);
    }

    public int hashCode() {
        Bundle bundle = this.activityData;
        int hashCode = (bundle == null ? 0 : bundle.hashCode()) * 31;
        String str = this.enterFrom;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.enterFromInfo;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.enterMethod;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BindServiceData(activityData=");
        LIZ.append(this.activityData);
        LIZ.append(", enterFrom=");
        LIZ.append(this.enterFrom);
        LIZ.append(", enterFromInfo=");
        LIZ.append(this.enterFromInfo);
        LIZ.append(", enterMethod=");
        return q.LIZIZ(LIZ, this.enterMethod, ')', LIZ);
    }

    public final Bundle getUpdatedActivityData() {
        return this.updatedActivityData;
    }

    public BindServiceData(Bundle bundle, String str, String str2, String str3) {
        this.activityData = bundle;
        this.enterFrom = str;
        this.enterFromInfo = str2;
        this.enterMethod = str3;
        bundle = bundle == null ? new Bundle() : bundle;
        if (C78685UuP.LJJJZ(str)) {
            bundle.putString("enter_from", str);
            if (C78685UuP.LJJJZ(str2)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(str);
                LIZ.append(str2);
                bundle.putString("enter_from_item", X1D.LIZIZ(LIZ));
            }
        }
        if (C78685UuP.LJJJZ(str3)) {
            bundle.putString("enter_method", str3);
        }
        this.updatedActivityData = bundle;
    }
}
