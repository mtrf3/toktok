package com.ss.android.ugc.aweme.placediscovery.model;

import X.InterfaceC57784Mm4;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class PoiCategory implements InterfaceC57784Mm4 {

    @InterfaceC65349Pkn("tab_code")
    public final String tabCode;

    @InterfaceC65349Pkn("tab_color")
    public final String tabColor;

    @InterfaceC65349Pkn("tab_img")
    public final String tabImg;

    @InterfaceC65349Pkn("tab_name")
    public final String tabName;

    @InterfaceC65349Pkn("tab_schema")
    public final String tabSchema;

    /* JADX WARN: Multi-variable type inference failed */
    public PoiCategory() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiCategory)) {
            return false;
        }
        PoiCategory poiCategory = (PoiCategory) obj;
        return o.LJ(this.tabName, poiCategory.tabName) && o.LJ(this.tabImg, poiCategory.tabImg) && o.LJ(this.tabColor, poiCategory.tabColor) && o.LJ(this.tabSchema, poiCategory.tabSchema) && o.LJ(this.tabCode, poiCategory.tabCode);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final int hashCode() {
        String str = this.tabName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tabImg;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tabColor;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.tabSchema;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.tabCode;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PoiCategory(tabName=");
        LIZ.append(this.tabName);
        LIZ.append(", tabImg=");
        LIZ.append(this.tabImg);
        LIZ.append(", tabColor=");
        LIZ.append(this.tabColor);
        LIZ.append(", tabSchema=");
        LIZ.append(this.tabSchema);
        LIZ.append(", tabCode=");
        return q.LIZIZ(LIZ, this.tabCode, ')', LIZ);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    public PoiCategory(String str, String str2, String str3, String str4, String str5) {
        this.tabName = str;
        this.tabImg = str2;
        this.tabColor = str3;
        this.tabSchema = str4;
        this.tabCode = str5;
    }

    public /* synthetic */ PoiCategory(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) == 0 ? str5 : null);
    }
}
