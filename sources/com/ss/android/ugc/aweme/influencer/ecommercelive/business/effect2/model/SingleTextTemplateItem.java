package com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model;

import X.AnonymousClass391;
import X.C1NE;
import X.C279017q;
import X.C71579S7j;
import X.C71591S7v;
import X.C71595S7z;
import X.C79062V1e;
import X.InterfaceC57784Mm4;
import X.UC7;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SingleTextTemplateItem implements TemplateItem, Parcelable {
    public final String bgImgUrl;
    public final List<TemplateField> fieldList;
    public final String introduction;
    public final boolean isChanged;
    public final boolean isUsing;
    public final String keyMessage;
    public final List<TemplateDecoration> templateDecorationList;
    public final String templateId;
    public final String templateImgUrl;
    public final int type;
    public static final C71579S7j Companion = new C71579S7j();
    public static final Parcelable.Creator<SingleTextTemplateItem> CREATOR = new C71595S7z();

    public SingleTextTemplateItem() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (List) null, false, false, (List) null, 1023);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int LIZIZ = AnonymousClass391.LIZIZ(this.fieldList, C79062V1e.LJ(this.introduction, C79062V1e.LJ(this.keyMessage, C79062V1e.LJ(this.templateImgUrl, C79062V1e.LJ(this.bgImgUrl, C79062V1e.LJ(this.templateId, this.type * 31, 31), 31), 31), 31), 31), 31);
        boolean z = this.isUsing;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (LIZIZ + i2) * 31;
        if (!this.isChanged) {
            i = 0;
        }
        int i4 = (i3 + i) * 31;
        List<TemplateDecoration> list = this.templateDecorationList;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return i4 + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SingleTextTemplateItem(type=");
        LIZ.append(this.type);
        LIZ.append(", templateId=");
        LIZ.append(this.templateId);
        LIZ.append(", bgImgUrl=");
        LIZ.append(this.bgImgUrl);
        LIZ.append(", templateImgUrl=");
        LIZ.append(this.templateImgUrl);
        LIZ.append(", keyMessage=");
        LIZ.append(this.keyMessage);
        LIZ.append(", introduction=");
        LIZ.append(this.introduction);
        LIZ.append(", fieldList=");
        LIZ.append(this.fieldList);
        LIZ.append(", isUsing=");
        LIZ.append(this.isUsing);
        LIZ.append(", isChanged=");
        LIZ.append(this.isChanged);
        LIZ.append(", templateDecorationList=");
        return C1NE.LIZIZ(LIZ, this.templateDecorationList, ')', LIZ);
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateItem
    public final boolean LJJJLZIJ() {
        return this.isChanged;
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateItem
    public final String LJJJZ() {
        return this.keyMessage;
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateItem
    public final String LJJLIIIJLJLI() {
        return this.templateImgUrl;
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateItem
    public final List<TemplateField> LJJLJLI() {
        return this.fieldList;
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateItem
    public final String LJLL() {
        return this.bgImgUrl;
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateItem
    public final List<TemplateDecoration> LLILIL() {
        return this.templateDecorationList;
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateItem
    public final String LLILL() {
        return this.introduction;
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateItem
    public final boolean LLJLLIL() {
        return this.isUsing;
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateItem
    public final String getTemplateId() {
        return this.templateId;
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateItem
    public final int getType() {
        return this.type;
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateItem, X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return C71591S7v.LIZ(this, interfaceC57784Mm4);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return C71591S7v.LIZIZ(this, interfaceC57784Mm4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SingleTextTemplateItem)) {
            return false;
        }
        SingleTextTemplateItem singleTextTemplateItem = (SingleTextTemplateItem) obj;
        if (this.type == singleTextTemplateItem.type && o.LJ(this.templateId, singleTextTemplateItem.templateId) && o.LJ(this.bgImgUrl, singleTextTemplateItem.bgImgUrl) && o.LJ(this.templateImgUrl, singleTextTemplateItem.templateImgUrl) && o.LJ(this.keyMessage, singleTextTemplateItem.keyMessage) && o.LJ(this.introduction, singleTextTemplateItem.introduction) && o.LJ(this.fieldList, singleTextTemplateItem.fieldList) && this.isUsing == singleTextTemplateItem.isUsing && this.isChanged == singleTextTemplateItem.isChanged && o.LJ(this.templateDecorationList, singleTextTemplateItem.templateDecorationList)) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.type);
        out.writeString(this.templateId);
        out.writeString(this.bgImgUrl);
        out.writeString(this.templateImgUrl);
        out.writeString(this.keyMessage);
        out.writeString(this.introduction);
        Iterator LIZJ = UC7.LIZJ(this.fieldList, out);
        while (LIZJ.hasNext()) {
            ((TemplateField) LIZJ.next()).writeToParcel(out, i);
        }
        out.writeInt(this.isUsing ? 1 : 0);
        out.writeInt(this.isChanged ? 1 : 0);
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

    public static SingleTextTemplateItem LIZ(SingleTextTemplateItem singleTextTemplateItem, List list, boolean z, int i) {
        int i2;
        String templateId;
        String bgImgUrl;
        String templateImgUrl;
        String keyMessage;
        String introduction;
        boolean z2;
        boolean z3 = z;
        List fieldList = list;
        if ((i & 1) != 0) {
            i2 = singleTextTemplateItem.type;
        } else {
            i2 = 0;
        }
        List<TemplateDecoration> list2 = null;
        if ((i & 2) != 0) {
            templateId = singleTextTemplateItem.templateId;
        } else {
            templateId = null;
        }
        if ((i & 4) != 0) {
            bgImgUrl = singleTextTemplateItem.bgImgUrl;
        } else {
            bgImgUrl = null;
        }
        if ((i & 8) != 0) {
            templateImgUrl = singleTextTemplateItem.templateImgUrl;
        } else {
            templateImgUrl = null;
        }
        if ((i & 16) != 0) {
            keyMessage = singleTextTemplateItem.keyMessage;
        } else {
            keyMessage = null;
        }
        if ((i & 32) != 0) {
            introduction = singleTextTemplateItem.introduction;
        } else {
            introduction = null;
        }
        if ((i & 64) != 0) {
            fieldList = singleTextTemplateItem.fieldList;
        }
        if ((i & 128) != 0) {
            z3 = singleTextTemplateItem.isUsing;
        }
        if ((i & 256) != 0) {
            z2 = singleTextTemplateItem.isChanged;
        } else {
            z2 = false;
        }
        if ((i & 512) != 0) {
            list2 = singleTextTemplateItem.templateDecorationList;
        }
        singleTextTemplateItem.getClass();
        o.LJIIIZ(templateId, "templateId");
        o.LJIIIZ(bgImgUrl, "bgImgUrl");
        o.LJIIIZ(templateImgUrl, "templateImgUrl");
        o.LJIIIZ(keyMessage, "keyMessage");
        o.LJIIIZ(introduction, "introduction");
        o.LJIIIZ(fieldList, "fieldList");
        return new SingleTextTemplateItem(templateId, i2, fieldList, bgImgUrl, templateImgUrl, z3, keyMessage, introduction, z2, list2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SingleTextTemplateItem(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.util.List r18, boolean r19, boolean r20, java.util.List r21, int r22) {
        /*
            r12 = this;
            r1 = r22
            r11 = r21
            r5 = r14
            r2 = r13
            r6 = r15
            r8 = r16
            r10 = r20
            r4 = r18
            r7 = r19
            r0 = r1 & 1
            if (r0 == 0) goto L4b
            r3 = 2
        L14:
            r0 = r1 & 2
            java.lang.String r9 = ""
            if (r0 == 0) goto L1b
            r2 = r9
        L1b:
            r0 = r1 & 4
            if (r0 == 0) goto L20
            r5 = r9
        L20:
            r0 = r1 & 8
            if (r0 == 0) goto L25
            r6 = r9
        L25:
            r0 = r1 & 16
            if (r0 == 0) goto L2a
            r8 = r9
        L2a:
            r0 = r1 & 32
            if (r0 == 0) goto L48
        L2e:
            r0 = r1 & 64
            if (r0 == 0) goto L34
            X.OQg r4 = X.C61878OQg.INSTANCE
        L34:
            r0 = r1 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L39
            r7 = 0
        L39:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L3e
            r10 = 0
        L3e:
            r0 = r1 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L43
            r11 = 0
        L43:
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L48:
            r9 = r17
            goto L2e
        L4b:
            r3 = 0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.SingleTextTemplateItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, boolean, boolean, java.util.List, int):void");
    }

    public SingleTextTemplateItem(String templateId, int i, List fieldList, String bgImgUrl, String templateImgUrl, boolean z, String keyMessage, String introduction, boolean z2, List list) {
        o.LJIIIZ(templateId, "templateId");
        o.LJIIIZ(bgImgUrl, "bgImgUrl");
        o.LJIIIZ(templateImgUrl, "templateImgUrl");
        o.LJIIIZ(keyMessage, "keyMessage");
        o.LJIIIZ(introduction, "introduction");
        o.LJIIIZ(fieldList, "fieldList");
        this.type = i;
        this.templateId = templateId;
        this.bgImgUrl = bgImgUrl;
        this.templateImgUrl = templateImgUrl;
        this.keyMessage = keyMessage;
        this.introduction = introduction;
        this.fieldList = fieldList;
        this.isUsing = z;
        this.isChanged = z2;
        this.templateDecorationList = list;
    }
}
