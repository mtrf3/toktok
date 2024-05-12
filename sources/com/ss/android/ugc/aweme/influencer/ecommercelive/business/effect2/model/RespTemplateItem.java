package com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model;

import X.AnonymousClass391;
import X.C1NE;
import X.C279017q;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.S7W;
import X.UC7;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RespTemplateItem implements Parcelable {
    public static final Parcelable.Creator<RespTemplateItem> CREATOR = new S7W();

    @InterfaceC65349Pkn("background_url")
    public final String backgroundUrl;

    @InterfaceC65349Pkn("field_list")
    public final List<TemplateField> fieldList;

    @InterfaceC65349Pkn("introduction")
    public final String introduction;

    @InterfaceC65349Pkn("is_changed")
    public final boolean isChanged;

    @InterfaceC65349Pkn("display")
    public final boolean isUsing;

    @InterfaceC65349Pkn("key_message")
    public final String keyMessage;

    @InterfaceC65349Pkn("template_decoration_list")
    public final List<TemplateDecoration> templateDecorationList;

    @InterfaceC65349Pkn("template_id")
    public final String templateId;

    @InterfaceC65349Pkn("template_url")
    public final String templateUrl;

    @InterfaceC65349Pkn("template_type")
    public final int type;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RespTemplateItem)) {
            return false;
        }
        RespTemplateItem respTemplateItem = (RespTemplateItem) obj;
        return o.LJ(this.templateId, respTemplateItem.templateId) && this.type == respTemplateItem.type && o.LJ(this.fieldList, respTemplateItem.fieldList) && o.LJ(this.backgroundUrl, respTemplateItem.backgroundUrl) && o.LJ(this.templateUrl, respTemplateItem.templateUrl) && this.isChanged == respTemplateItem.isChanged && o.LJ(this.keyMessage, respTemplateItem.keyMessage) && o.LJ(this.introduction, respTemplateItem.introduction) && this.isUsing == respTemplateItem.isUsing && o.LJ(this.templateDecorationList, respTemplateItem.templateDecorationList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int LJ = C79062V1e.LJ(this.backgroundUrl, AnonymousClass391.LIZIZ(this.fieldList, ((this.templateId.hashCode() * 31) + this.type) * 31, 31), 31);
        String str = this.templateUrl;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        boolean z = this.isChanged;
        int i3 = 1;
        int i4 = z;
        if (z != 0) {
            i4 = 1;
        }
        int i5 = (i2 + i4) * 31;
        String str2 = this.keyMessage;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i6 = (i5 + hashCode2) * 31;
        String str3 = this.introduction;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i7 = (i6 + hashCode3) * 31;
        if (!this.isUsing) {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        List<TemplateDecoration> list = this.templateDecorationList;
        if (list != null) {
            i = list.hashCode();
        }
        return i8 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RespTemplateItem(templateId=");
        LIZ.append(this.templateId);
        LIZ.append(", type=");
        LIZ.append(this.type);
        LIZ.append(", fieldList=");
        LIZ.append(this.fieldList);
        LIZ.append(", backgroundUrl=");
        LIZ.append(this.backgroundUrl);
        LIZ.append(", templateUrl=");
        LIZ.append(this.templateUrl);
        LIZ.append(", isChanged=");
        LIZ.append(this.isChanged);
        LIZ.append(", keyMessage=");
        LIZ.append(this.keyMessage);
        LIZ.append(", introduction=");
        LIZ.append(this.introduction);
        LIZ.append(", isUsing=");
        LIZ.append(this.isUsing);
        LIZ.append(", templateDecorationList=");
        return C1NE.LIZIZ(LIZ, this.templateDecorationList, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.templateId);
        out.writeInt(this.type);
        Iterator LIZJ = UC7.LIZJ(this.fieldList, out);
        while (LIZJ.hasNext()) {
            ((TemplateField) LIZJ.next()).writeToParcel(out, i);
        }
        out.writeString(this.backgroundUrl);
        out.writeString(this.templateUrl);
        out.writeInt(this.isChanged ? 1 : 0);
        out.writeString(this.keyMessage);
        out.writeString(this.introduction);
        out.writeInt(this.isUsing ? 1 : 0);
        List<TemplateDecoration> list = this.templateDecorationList;
        if (list == null) {
            out.writeInt(0);
            return;
        }
        Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
        while (LIZIZ.hasNext()) {
            TemplateDecoration templateDecoration = (TemplateDecoration) LIZIZ.next();
            if (templateDecoration == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                templateDecoration.writeToParcel(out, i);
            }
        }
    }

    public RespTemplateItem(String templateId, int i, List<TemplateField> fieldList, String backgroundUrl, String str, boolean z, String str2, String str3, boolean z2, List<TemplateDecoration> list) {
        o.LJIIIZ(templateId, "templateId");
        o.LJIIIZ(fieldList, "fieldList");
        o.LJIIIZ(backgroundUrl, "backgroundUrl");
        this.templateId = templateId;
        this.type = i;
        this.fieldList = fieldList;
        this.backgroundUrl = backgroundUrl;
        this.templateUrl = str;
        this.isChanged = z;
        this.keyMessage = str2;
        this.introduction = str3;
        this.isUsing = z2;
        this.templateDecorationList = list;
    }
}
