package com.ss.android.ugc.aweme.api.model;

import X.C42737Gpx;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AnchorCell implements Parcelable {
    public static final Parcelable.Creator<AnchorCell> CREATOR = new C42737Gpx();

    @InterfaceC65349Pkn("extra")
    public String extra;

    @InterfaceC65349Pkn("icon")
    public AnchorIcon icon;

    @InterfaceC65349Pkn("id")
    public String id;
    public boolean isEditable;

    @InterfaceC65349Pkn("sub_title")
    public String subTitle;

    @InterfaceC65349Pkn("title")
    public String title;
    public int type;

    @InterfaceC65349Pkn("schema_url")
    public String url;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AnchorCell() {
        /*
            r11 = this;
            r1 = 0
            r7 = 0
            r9 = 255(0xff, float:3.57E-43)
            r0 = r11
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r8 = r7
            r10 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.api.model.AnchorCell.<init>():void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.id);
        AnchorIcon anchorIcon = this.icon;
        if (anchorIcon == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            anchorIcon.writeToParcel(out, i);
        }
        out.writeString(this.title);
        out.writeString(this.subTitle);
        out.writeString(this.url);
        out.writeString(this.extra);
        out.writeInt(this.type);
        out.writeInt(this.isEditable ? 1 : 0);
    }

    public final int hashCode() {
        String str = this.id;
        if (str == null) {
            str = "";
        }
        return CastIntegerProtector.valueOf(str).hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AnchorCell) {
            return TextUtils.equals(this.id, ((AnchorCell) obj).id);
        }
        return false;
    }

    public AnchorCell(String str, AnchorIcon anchorIcon, String str2, String str3, String str4, String str5, int i, boolean z) {
        this.id = str;
        this.icon = anchorIcon;
        this.title = str2;
        this.subTitle = str3;
        this.url = str4;
        this.extra = str5;
        this.type = i;
        this.isEditable = z;
    }

    public /* synthetic */ AnchorCell(String str, AnchorIcon anchorIcon, String str2, String str3, String str4, String str5, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : anchorIcon, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) == 0 ? str5 : null, (i2 & 64) != 0 ? -100 : i, (i2 & 128) != 0 ? false : z);
    }
}
