package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C1FJ;
import X.C27085Ak5;
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
public final class UserRightDesc implements Parcelable {
    public static final Parcelable.Creator<UserRightDesc> CREATOR = new C27085Ak5();

    @InterfaceC65349Pkn("block_list")
    public final List<UserRightDescBlock> block_list;

    @InterfaceC65349Pkn("desc_font_color")
    public final String descFontColor;

    @InterfaceC65349Pkn("desc_font_dark_color")
    public final String descFontDarkColor;

    @InterfaceC65349Pkn("description")
    public final String description;

    @InterfaceC65349Pkn("icon")
    public final Icon icon;

    @InterfaceC65349Pkn("id")
    public final String id;

    @InterfaceC65349Pkn("item_type")
    public final Integer itemType;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("name_en")
    public final String nameEn;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserRightDesc)) {
            return false;
        }
        UserRightDesc userRightDesc = (UserRightDesc) obj;
        return o.LJ(this.id, userRightDesc.id) && o.LJ(this.name, userRightDesc.name) && o.LJ(this.description, userRightDesc.description) && o.LJ(this.itemType, userRightDesc.itemType) && o.LJ(this.nameEn, userRightDesc.nameEn) && o.LJ(this.block_list, userRightDesc.block_list) && o.LJ(this.icon, userRightDesc.icon) && o.LJ(this.descFontColor, userRightDesc.descFontColor) && o.LJ(this.descFontDarkColor, userRightDesc.descFontDarkColor);
    }

    public final int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.itemType;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.nameEn;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<UserRightDescBlock> list = this.block_list;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Icon icon = this.icon;
        int hashCode7 = (hashCode6 + (icon == null ? 0 : icon.hashCode())) * 31;
        String str5 = this.descFontColor;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.descFontDarkColor;
        return hashCode8 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UserRightDesc(id=");
        LIZ.append(this.id);
        LIZ.append(", name=");
        LIZ.append(this.name);
        LIZ.append(", description=");
        LIZ.append(this.description);
        LIZ.append(", itemType=");
        LIZ.append(this.itemType);
        LIZ.append(", nameEn=");
        LIZ.append(this.nameEn);
        LIZ.append(", block_list=");
        LIZ.append(this.block_list);
        LIZ.append(", icon=");
        LIZ.append(this.icon);
        LIZ.append(", descFontColor=");
        LIZ.append(this.descFontColor);
        LIZ.append(", descFontDarkColor=");
        return q.LIZIZ(LIZ, this.descFontDarkColor, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.id);
        out.writeString(this.name);
        out.writeString(this.description);
        Integer num = this.itemType;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        out.writeString(this.nameEn);
        List<UserRightDescBlock> list = this.block_list;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                ((UserRightDescBlock) LIZIZ.next()).writeToParcel(out, i);
            }
        }
        Icon icon = this.icon;
        if (icon == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            icon.writeToParcel(out, i);
        }
        out.writeString(this.descFontColor);
        out.writeString(this.descFontDarkColor);
    }

    public UserRightDesc(String str, String str2, String str3, Integer num, String str4, List<UserRightDescBlock> list, Icon icon, String str5, String str6) {
        this.id = str;
        this.name = str2;
        this.description = str3;
        this.itemType = num;
        this.nameEn = str4;
        this.block_list = list;
        this.icon = icon;
        this.descFontColor = str5;
        this.descFontDarkColor = str6;
    }
}
