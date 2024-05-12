package com.ss.android.ugc.aweme.im.message.template.card;

import X.C63714OzW;
import X.C64528PUe;
import X.C64537PUn;
import X.C79098V2o;
import X.C79113V3d;
import X.C79114V3e;
import X.C79118V3i;
import X.C79128V3s;
import X.C79135V3z;
import X.RUF;
import X.V3G;
import X.V3X;
import X.V44;
import X.V4Q;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.ugc.aweme.im.message.template.card.dynamic.DynamicInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.card.dynamic.DynamicUiLocationType;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.FallbackInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class DynamicCardTemplate implements BaseTemplate {
    public static final Parcelable.Creator<DynamicCardTemplate> CREATOR = new C79098V2o();
    public final BaseRequestComponent baseRequestComponent;
    public final BaseResponseComponent baseResponseComponent;
    public final DynamicInfoComponent dynamicInfo;
    public final FallbackInfoComponent fallbackInfo;
    public final int messageType;
    public final PreviewHintComponent previewHintComponent;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        DynamicInfoComponent dynamicInfoComponent = this.dynamicInfo;
        if (dynamicInfoComponent == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            dynamicInfoComponent.writeToParcel(out, i);
        }
        FallbackInfoComponent fallbackInfoComponent = this.fallbackInfo;
        if (fallbackInfoComponent == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            fallbackInfoComponent.writeToParcel(out, i);
        }
        this.previewHintComponent.writeToParcel(out, i);
        this.baseResponseComponent.writeToParcel(out, i);
        this.baseRequestComponent.writeToParcel(out, i);
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final C64537PUn encode() {
        V44 v44;
        C63714OzW c63714OzW;
        C79135V3z c79135V3z;
        V3G v3g;
        C64528PUe c64528PUe = C64537PUn.Companion;
        ProtoAdapter<C79128V3s> protoAdapter = C79128V3s.ADAPTER;
        V3X v3x = new V3X();
        C79114V3e c79114V3e = new C79114V3e();
        DynamicInfoComponent dynamicInfoComponent = this.dynamicInfo;
        V4Q v4q = null;
        RUF ruf = null;
        if (dynamicInfoComponent != null) {
            C79113V3d c79113V3d = new C79113V3d();
            c79113V3d.LIZLLL = dynamicInfoComponent.cardKey;
            c79113V3d.LJ = dynamicInfoComponent.schema;
            c79113V3d.LJFF = dynamicInfoComponent.cardTemplate;
            c79113V3d.LJIIJJI = dynamicInfoComponent.rawData;
            c79113V3d.LJI = dynamicInfoComponent.businessType;
            c79113V3d.LJII = dynamicInfoComponent.businessId;
            c79113V3d.LJIIIIZZ = Integer.valueOf(dynamicInfoComponent.defaultHeight);
            c79113V3d.LJIIIZ = Integer.valueOf(dynamicInfoComponent.defaultWidth);
            DynamicUiLocationType dynamicUiLocationType = dynamicInfoComponent.uiLocationType;
            if (dynamicUiLocationType != null) {
                v3g = dynamicUiLocationType.m127toProto();
            } else {
                v3g = null;
            }
            c79113V3d.LJIIJ = v3g;
            v44 = c79113V3d.build();
        } else {
            v44 = null;
        }
        c79114V3e.LIZLLL = v44;
        FallbackInfoComponent fallbackInfoComponent = this.fallbackInfo;
        if (fallbackInfoComponent != null) {
            C79118V3i c79118V3i = new C79118V3i();
            ActionLinkComponent actionLinkComponent = fallbackInfoComponent.linkComponent;
            if (actionLinkComponent != null) {
                c63714OzW = actionLinkComponent.M();
            } else {
                c63714OzW = null;
            }
            c79118V3i.LJFF = c63714OzW;
            ImageComponent imageComponent = fallbackInfoComponent.imageComponent;
            if (imageComponent != null) {
                c79135V3z = imageComponent.LIZIZ();
            } else {
                c79135V3z = null;
            }
            c79118V3i.LIZLLL = c79135V3z;
            TextComponent textComponent = fallbackInfoComponent.textComponent;
            if (textComponent != null) {
                ruf = textComponent.L();
            }
            c79118V3i.LJ = ruf;
            v4q = c79118V3i.build();
        }
        c79114V3e.LJ = v4q;
        c79114V3e.LJFF = this.previewHintComponent.LIZ();
        c79114V3e.LJI = this.baseRequestComponent.L();
        c79114V3e.LJII = this.baseResponseComponent.L();
        v3x.LJIIL = c79114V3e.build();
        byte[] encode = protoAdapter.encode(v3x.build());
        o.LJIIIIZZ(encode, "ADAPTER\n            .enc…  .build(),\n            )");
        return C64528PUe.LIZJ(c64528PUe, encode);
    }

    public final int hashCode() {
        int hashCode;
        DynamicInfoComponent dynamicInfoComponent = this.dynamicInfo;
        int i = 0;
        if (dynamicInfoComponent == null) {
            hashCode = 0;
        } else {
            hashCode = dynamicInfoComponent.hashCode();
        }
        int i2 = hashCode * 31;
        FallbackInfoComponent fallbackInfoComponent = this.fallbackInfo;
        if (fallbackInfoComponent != null) {
            i = fallbackInfoComponent.hashCode();
        }
        return this.baseRequestComponent.hashCode() + ((this.baseResponseComponent.hashCode() + ((this.previewHintComponent.hashCode() + ((i2 + i) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DynamicCardTemplate(dynamicInfo=");
        LIZ.append(this.dynamicInfo);
        LIZ.append(", fallbackInfo=");
        LIZ.append(this.fallbackInfo);
        LIZ.append(", previewHintComponent=");
        LIZ.append(this.previewHintComponent);
        LIZ.append(", baseResponseComponent=");
        LIZ.append(this.baseResponseComponent);
        LIZ.append(", baseRequestComponent=");
        LIZ.append(this.baseRequestComponent);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final BaseResponseComponent LLILLJJLI() {
        return this.baseResponseComponent;
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final BaseRequestComponent LLLL() {
        return this.baseRequestComponent;
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final PreviewHintComponent LLZLL() {
        return this.previewHintComponent;
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final int getMessageType() {
        return this.messageType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicCardTemplate)) {
            return false;
        }
        DynamicCardTemplate dynamicCardTemplate = (DynamicCardTemplate) obj;
        if (o.LJ(this.dynamicInfo, dynamicCardTemplate.dynamicInfo) && o.LJ(this.fallbackInfo, dynamicCardTemplate.fallbackInfo) && o.LJ(this.previewHintComponent, dynamicCardTemplate.previewHintComponent) && o.LJ(this.baseResponseComponent, dynamicCardTemplate.baseResponseComponent) && o.LJ(this.baseRequestComponent, dynamicCardTemplate.baseRequestComponent)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final BaseTemplate LLLLZLLLI(PreviewHintComponent preview, BaseRequestComponent request, BaseResponseComponent response) {
        o.LJIIIZ(preview, "preview");
        o.LJIIIZ(request, "request");
        o.LJIIIZ(response, "response");
        return new DynamicCardTemplate(this.dynamicInfo, this.fallbackInfo, preview, response, request);
    }

    public DynamicCardTemplate(DynamicInfoComponent dynamicInfoComponent, FallbackInfoComponent fallbackInfoComponent, PreviewHintComponent previewHintComponent, BaseResponseComponent baseResponseComponent, BaseRequestComponent baseRequestComponent) {
        o.LJIIIZ(previewHintComponent, "previewHintComponent");
        o.LJIIIZ(baseResponseComponent, "baseResponseComponent");
        o.LJIIIZ(baseRequestComponent, "baseRequestComponent");
        this.dynamicInfo = dynamicInfoComponent;
        this.fallbackInfo = fallbackInfoComponent;
        this.previewHintComponent = previewHintComponent;
        this.baseResponseComponent = baseResponseComponent;
        this.baseRequestComponent = baseRequestComponent;
        this.messageType = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
    }
}
