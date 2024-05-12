package com.ss.android.ugc.aweme.ecommerce.smartcheck.core.roma;

import X.C61878OQg;
import X.F9E;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class RomaApiData extends F9E {
    public List<RomaPattern> data;
    public int feCount;
    public int nativeCount;

    public RomaApiData() {
        this(0, 0, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RomaApiData copy$default(RomaApiData romaApiData, int i, int i2, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = romaApiData.nativeCount;
        }
        if ((i3 & 2) != 0) {
            i2 = romaApiData.feCount;
        }
        if ((i3 & 4) != 0) {
            list = romaApiData.data;
        }
        return romaApiData.copy(i, i2, list);
    }

    public final RomaApiData copy(int i, int i2, List<RomaPattern> data) {
        o.LJIIIZ(data, "data");
        return new RomaApiData(i, i2, data);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.nativeCount), Integer.valueOf(this.feCount), this.data};
    }

    public final List<RomaPattern> getData() {
        return this.data;
    }

    public final int getFeCount() {
        return this.feCount;
    }

    public final int getNativeCount() {
        return this.nativeCount;
    }

    public final void setData(List<RomaPattern> list) {
        o.LJIIIZ(list, "<set-?>");
        this.data = list;
    }

    public final void setFeCount(int i) {
        this.feCount = i;
    }

    public final void setNativeCount(int i) {
        this.nativeCount = i;
    }

    public RomaApiData(int i, int i2, List<RomaPattern> data) {
        o.LJIIIZ(data, "data");
        this.nativeCount = i;
        this.feCount = i2;
        this.data = data;
    }

    public RomaApiData(int i, int i2, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? C61878OQg.INSTANCE : list);
    }
}
