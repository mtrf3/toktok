package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C1FJ;
import X.C26689Adh;
import X.C279017q;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import defpackage.q;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ExposeUserRightPanel implements Parcelable {
    public static final Parcelable.Creator<ExposeUserRightPanel> CREATOR = new C26689Adh();

    @InterfaceC65349Pkn("background_image")
    public final Icon background;

    @InterfaceC65349Pkn("background_color")
    public final Integer backgroundColor;

    @InterfaceC65349Pkn("description")
    public final String description;

    @InterfaceC65349Pkn("expose_user_rights")
    public final List<ExposeUserRight> exposeUserRights;

    @InterfaceC65349Pkn("icon")
    public final Icon icon;

    @InterfaceC65349Pkn("schema")
    public final String schema;

    @InterfaceC65349Pkn("style")
    public final Integer style;

    @InterfaceC65349Pkn("title")
    public final String title;

    @InterfaceC65349Pkn("title_en")
    public final String titleEn;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExposeUserRightPanel)) {
            return false;
        }
        ExposeUserRightPanel exposeUserRightPanel = (ExposeUserRightPanel) obj;
        return o.LJ(this.title, exposeUserRightPanel.title) && o.LJ(this.icon, exposeUserRightPanel.icon) && o.LJ(this.background, exposeUserRightPanel.background) && o.LJ(this.exposeUserRights, exposeUserRightPanel.exposeUserRights) && o.LJ(this.titleEn, exposeUserRightPanel.titleEn) && o.LJ(this.style, exposeUserRightPanel.style) && o.LJ(this.backgroundColor, exposeUserRightPanel.backgroundColor) && o.LJ(this.description, exposeUserRightPanel.description) && o.LJ(this.schema, exposeUserRightPanel.schema);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Icon icon = this.icon;
        int hashCode2 = (hashCode + (icon == null ? 0 : icon.hashCode())) * 31;
        Icon icon2 = this.background;
        int hashCode3 = (hashCode2 + (icon2 == null ? 0 : icon2.hashCode())) * 31;
        List<ExposeUserRight> list = this.exposeUserRights;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.titleEn;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.style;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.backgroundColor;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.description;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.schema;
        return hashCode8 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ExposeUserRightPanel(title=");
        LIZ.append(this.title);
        LIZ.append(", icon=");
        LIZ.append(this.icon);
        LIZ.append(", background=");
        LIZ.append(this.background);
        LIZ.append(", exposeUserRights=");
        LIZ.append(this.exposeUserRights);
        LIZ.append(", titleEn=");
        LIZ.append(this.titleEn);
        LIZ.append(", style=");
        LIZ.append(this.style);
        LIZ.append(", backgroundColor=");
        LIZ.append(this.backgroundColor);
        LIZ.append(", description=");
        LIZ.append(this.description);
        LIZ.append(", schema=");
        return q.LIZIZ(LIZ, this.schema, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.title);
        Icon icon = this.icon;
        if (icon == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            icon.writeToParcel(out, i);
        }
        Icon icon2 = this.background;
        if (icon2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            icon2.writeToParcel(out, i);
        }
        List<ExposeUserRight> list = this.exposeUserRights;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                ((ExposeUserRight) LIZIZ.next()).writeToParcel(out, i);
            }
        }
        out.writeString(this.titleEn);
        Integer num = this.style;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        Integer num2 = this.backgroundColor;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num2);
        }
        out.writeString(this.description);
        out.writeString(this.schema);
    }

    public ExposeUserRightPanel(String str, Icon icon, Icon icon2, List<ExposeUserRight> list, String str2, Integer num, Integer num2, String str3, String str4) {
        this.title = str;
        this.icon = icon;
        this.background = icon2;
        this.exposeUserRights = list;
        this.titleEn = str2;
        this.style = num;
        this.backgroundColor = num2;
        this.description = str3;
        this.schema = str4;
    }
}
