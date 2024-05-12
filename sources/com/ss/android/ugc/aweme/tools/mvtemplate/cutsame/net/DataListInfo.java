package com.ss.android.ugc.aweme.tools.mvtemplate.cutsame.net;

import X.C48339Iy7;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class DataListInfo {

    @InterfaceC65349Pkn("category")
    public final List<Object> category;

    @InterfaceC65349Pkn("cursor")
    public final long cursor;

    @InterfaceC65349Pkn("data_type")
    public final int dataType;

    @InterfaceC65349Pkn("filtered_template")
    public final List<Object> filterMessage;

    @InterfaceC65349Pkn("has_next")
    public final boolean hasNext;

    @InterfaceC65349Pkn("template")
    public final List<TemplateInfo> template;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DataListInfo() {
        /*
            r10 = this;
            r1 = 0
            r2 = 0
            r4 = 0
            r8 = 63
            r0 = r10
            r5 = r4
            r6 = r4
            r7 = r1
            r9 = r4
            r0.<init>(r1, r2, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.mvtemplate.cutsame.net.DataListInfo.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataListInfo)) {
            return false;
        }
        DataListInfo dataListInfo = (DataListInfo) obj;
        return this.dataType == dataListInfo.dataType && this.cursor == dataListInfo.cursor && o.LJ(this.category, dataListInfo.category) && o.LJ(this.template, dataListInfo.template) && o.LJ(this.filterMessage, dataListInfo.filterMessage) && this.hasNext == dataListInfo.hasNext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int LIZJ = JBR.LIZJ(this.cursor, this.dataType * 31, 31);
        List<Object> list = this.category;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = (LIZJ + hashCode) * 31;
        List<TemplateInfo> list2 = this.template;
        if (list2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        List<Object> list3 = this.filterMessage;
        if (list3 != null) {
            i = list3.hashCode();
        }
        int i4 = (i3 + i) * 31;
        boolean z = this.hasNext;
        int i5 = z;
        if (z != 0) {
            i5 = 1;
        }
        return i4 + i5;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DataListInfo(dataType=");
        LIZ.append(this.dataType);
        LIZ.append(", cursor=");
        LIZ.append(this.cursor);
        LIZ.append(", category=");
        LIZ.append(this.category);
        LIZ.append(", template=");
        LIZ.append(this.template);
        LIZ.append(", filterMessage=");
        LIZ.append(this.filterMessage);
        LIZ.append(", hasNext=");
        return C48339Iy7.LIZJ(LIZ, this.hasNext, ')', LIZ);
    }

    public DataListInfo(int i, long j, List<Object> list, List<TemplateInfo> list2, List<Object> list3, boolean z) {
        this.dataType = i;
        this.cursor = j;
        this.category = list;
        this.template = list2;
        this.filterMessage = list3;
        this.hasNext = z;
    }

    public /* synthetic */ DataListInfo(int i, long j, List list, List list2, List list3, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0L : j, (i2 & 4) != 0 ? null : list, (i2 & 8) != 0 ? null : list2, (i2 & 16) == 0 ? list3 : null, (i2 & 32) != 0 ? false : z);
    }
}
