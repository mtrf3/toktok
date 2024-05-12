package com.ss.android.ugc.aweme.editSticker.text.bean;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class TempPublishAnchorModel {

    @InterfaceC65349Pkn("anchor_business_type")
    public int anchorBusinessType;

    @InterfaceC65349Pkn("anchor_content")
    public String anchorContent;

    @InterfaceC65349Pkn("anchor_id")
    public String anchorId;

    @InterfaceC65349Pkn("source")
    public int source;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TempPublishAnchorModel() {
        /*
            r7 = this;
            r1 = 0
            r3 = 0
            r5 = 15
            r0 = r7
            r2 = r1
            r4 = r3
            r6 = r3
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.editSticker.text.bean.TempPublishAnchorModel.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TempPublishAnchorModel)) {
            return false;
        }
        TempPublishAnchorModel tempPublishAnchorModel = (TempPublishAnchorModel) obj;
        return this.anchorBusinessType == tempPublishAnchorModel.anchorBusinessType && this.source == tempPublishAnchorModel.source && o.LJ(this.anchorId, tempPublishAnchorModel.anchorId) && o.LJ(this.anchorContent, tempPublishAnchorModel.anchorContent);
    }

    public final int hashCode() {
        int i = ((this.anchorBusinessType * 31) + this.source) * 31;
        String str = this.anchorId;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.anchorContent;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TempPublishAnchorModel(anchorBusinessType=");
        LIZ.append(this.anchorBusinessType);
        LIZ.append(", source=");
        LIZ.append(this.source);
        LIZ.append(", anchorId=");
        LIZ.append(this.anchorId);
        LIZ.append(", anchorContent=");
        return q.LIZIZ(LIZ, this.anchorContent, ')', LIZ);
    }

    public TempPublishAnchorModel(int i, int i2, String str, String str2) {
        this.anchorBusinessType = i;
        this.source = i2;
        this.anchorId = str;
        this.anchorContent = str2;
    }

    public /* synthetic */ TempPublishAnchorModel(int i, int i2, String str, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? null : str, (i3 & 8) != 0 ? null : str2);
    }
}
