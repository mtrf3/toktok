package com.ss.android.ugc.aweme.experiment;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ApplogDegradeInfoList {

    @InterfaceC65349Pkn("forbidden_param")
    public final Set<String> cuttingProperties;
    public final String event;

    @InterfaceC65349Pkn("chance")
    public final float sampling;

    @InterfaceC65349Pkn("force_alog")
    public final boolean transferStorage;

    /* JADX WARN: Multi-variable type inference failed */
    public ApplogDegradeInfoList() {
        this(0.0f, false, null, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApplogDegradeInfoList copy$default(ApplogDegradeInfoList applogDegradeInfoList, float f, boolean z, Set set, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            f = applogDegradeInfoList.sampling;
        }
        if ((i & 2) != 0) {
            z = applogDegradeInfoList.transferStorage;
        }
        if ((i & 4) != 0) {
            set = applogDegradeInfoList.cuttingProperties;
        }
        if ((i & 8) != 0) {
            str = applogDegradeInfoList.event;
        }
        return applogDegradeInfoList.copy(f, z, set, str);
    }

    public final ApplogDegradeInfoList copy(float f, boolean z, Set<String> set, String event) {
        o.LJIIIZ(event, "event");
        return new ApplogDegradeInfoList(f, z, set, event);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplogDegradeInfoList)) {
            return false;
        }
        ApplogDegradeInfoList applogDegradeInfoList = (ApplogDegradeInfoList) obj;
        return Float.compare(this.sampling, applogDegradeInfoList.sampling) == 0 && this.transferStorage == applogDegradeInfoList.transferStorage && o.LJ(this.cuttingProperties, applogDegradeInfoList.cuttingProperties) && o.LJ(this.event, applogDegradeInfoList.event);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int floatToIntBits = Float.floatToIntBits(this.sampling) * 31;
        boolean z = this.transferStorage;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (floatToIntBits + i) * 31;
        Set<String> set = this.cuttingProperties;
        if (set == null) {
            hashCode = 0;
        } else {
            hashCode = set.hashCode();
        }
        return this.event.hashCode() + ((i2 + hashCode) * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ApplogDegradeInfoList(sampling=");
        LIZ.append(this.sampling);
        LIZ.append(", transferStorage=");
        LIZ.append(this.transferStorage);
        LIZ.append(", cuttingProperties=");
        LIZ.append(this.cuttingProperties);
        LIZ.append(", event=");
        return q.LIZIZ(LIZ, this.event, ')', LIZ);
    }

    public final Set<String> getCuttingProperties() {
        return this.cuttingProperties;
    }

    public final String getEvent() {
        return this.event;
    }

    public final float getSampling() {
        return this.sampling;
    }

    public final boolean getTransferStorage() {
        return this.transferStorage;
    }

    public ApplogDegradeInfoList(float f, boolean z, Set<String> set, String event) {
        o.LJIIIZ(event, "event");
        this.sampling = f;
        this.transferStorage = z;
        this.cuttingProperties = set;
        this.event = event;
    }

    public /* synthetic */ ApplogDegradeInfoList(float f, boolean z, Set set, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : set, (i & 8) != 0 ? "" : str);
    }
}
