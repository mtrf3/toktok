package com.ss.android.ugc.aweme.settings;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PopupBlockList {

    @InterfaceC65349Pkn("dimensional")
    public final int dimensional;

    @InterfaceC65349Pkn("keyword_list")
    public final String[] keywordList;

    /* JADX WARN: Multi-variable type inference failed */
    public PopupBlockList() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PopupBlockList)) {
            return false;
        }
        PopupBlockList popupBlockList = (PopupBlockList) obj;
        return this.dimensional == popupBlockList.dimensional && o.LJ(this.keywordList, popupBlockList.keywordList);
    }

    public final int hashCode() {
        int i = this.dimensional * 31;
        String[] strArr = this.keywordList;
        return i + (strArr == null ? 0 : Arrays.hashCode(strArr));
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PopupBlockList(dimensional=");
        LIZ.append(this.dimensional);
        LIZ.append(", keywordList=");
        return q.LIZIZ(LIZ, Arrays.toString(this.keywordList), ')', LIZ);
    }

    public PopupBlockList(int i, String[] strArr) {
        this.dimensional = i;
        this.keywordList = strArr;
    }

    public /* synthetic */ PopupBlockList(int i, String[] strArr, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : strArr);
    }
}
