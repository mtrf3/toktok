package com.ss.android.ugc.aweme.im.message.template.card;

import X.C64528PUe;
import X.C64537PUn;
import X.C79103V2t;
import X.C79111V3b;
import X.C79128V3s;
import X.V3X;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseUserComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCardFallbackInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class AwemeCardTemplate implements BaseTemplate {
    public static final Parcelable.Creator<AwemeCardTemplate> CREATOR = new C79103V2t();
    public final BaseRequestComponent baseRequestComponent;
    public final BaseResponseComponent baseResponseComponent;
    public final BaseUserComponent baseUserComponent;
    public final VideoCoverComponent baseVideoComponent;
    public final VideoCardFallbackInfoComponent fallbackInfo;
    public final int messageType;
    public final PreviewHintComponent previewHintComponent;

    public AwemeCardTemplate() {
        this((VideoCoverComponent) null, (VideoCardFallbackInfoComponent) null, (BaseUserComponent) null, (PreviewHintComponent) null, (BaseRequestComponent) null, 63);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        this.baseVideoComponent.writeToParcel(out, i);
        this.fallbackInfo.writeToParcel(out, i);
        this.baseUserComponent.writeToParcel(out, i);
        this.previewHintComponent.writeToParcel(out, i);
        this.baseRequestComponent.writeToParcel(out, i);
        this.baseResponseComponent.writeToParcel(out, i);
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final C64537PUn encode() {
        C64528PUe c64528PUe = C64537PUn.Companion;
        ProtoAdapter<C79128V3s> protoAdapter = C79128V3s.ADAPTER;
        V3X v3x = new V3X();
        C79111V3b c79111V3b = new C79111V3b();
        c79111V3b.LIZLLL = this.baseVideoComponent.LIZ();
        c79111V3b.LJ = this.previewHintComponent.LIZ();
        c79111V3b.LJIIIIZZ = this.baseRequestComponent.L();
        c79111V3b.LJI = this.fallbackInfo.L();
        c79111V3b.LJII = this.baseUserComponent.LIZ();
        v3x.LJFF = c79111V3b.build();
        byte[] encode = protoAdapter.encode(v3x.build());
        o.LJIIIIZZ(encode, "ADAPTER\n            .enc…   .build()\n            )");
        return C64528PUe.LIZJ(c64528PUe, encode);
    }

    public final int hashCode() {
        return this.baseResponseComponent.hashCode() + ((this.baseRequestComponent.hashCode() + ((this.previewHintComponent.hashCode() + ((this.baseUserComponent.hashCode() + ((this.fallbackInfo.hashCode() + (this.baseVideoComponent.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AwemeCardTemplate(baseVideoComponent=");
        LIZ.append(this.baseVideoComponent);
        LIZ.append(", fallbackInfo=");
        LIZ.append(this.fallbackInfo);
        LIZ.append(", baseUserComponent=");
        LIZ.append(this.baseUserComponent);
        LIZ.append(", previewHintComponent=");
        LIZ.append(this.previewHintComponent);
        LIZ.append(", baseRequestComponent=");
        LIZ.append(this.baseRequestComponent);
        LIZ.append(", baseResponseComponent=");
        LIZ.append(this.baseResponseComponent);
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
        if (!(obj instanceof AwemeCardTemplate)) {
            return false;
        }
        AwemeCardTemplate awemeCardTemplate = (AwemeCardTemplate) obj;
        if (o.LJ(this.baseVideoComponent, awemeCardTemplate.baseVideoComponent) && o.LJ(this.fallbackInfo, awemeCardTemplate.fallbackInfo) && o.LJ(this.baseUserComponent, awemeCardTemplate.baseUserComponent) && o.LJ(this.previewHintComponent, awemeCardTemplate.previewHintComponent) && o.LJ(this.baseRequestComponent, awemeCardTemplate.baseRequestComponent) && o.LJ(this.baseResponseComponent, awemeCardTemplate.baseResponseComponent)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final BaseTemplate LLLLZLLLI(PreviewHintComponent preview, BaseRequestComponent request, BaseResponseComponent response) {
        o.LJIIIZ(preview, "preview");
        o.LJIIIZ(request, "request");
        o.LJIIIZ(response, "response");
        return LIZ(this, null, null, preview, request, response, 7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AwemeCardTemplate(com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent r4, com.ss.android.ugc.aweme.im.message.template.component.VideoCardFallbackInfoComponent r5, com.ss.android.ugc.aweme.im.message.template.component.BaseUserComponent r6, com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent r7, com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent r8, int r9) {
        /*
            r3 = this;
            r0 = r9 & 1
            if (r0 == 0) goto Lb
            X.Uyb r0 = com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent r4 = com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent.EMPTY_VIDEO_COVER
        Lb:
            r0 = r9 & 2
            if (r0 == 0) goto L16
            X.Uya r0 = com.ss.android.ugc.aweme.im.message.template.component.VideoCardFallbackInfoComponent.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.im.message.template.component.VideoCardFallbackInfoComponent r5 = com.ss.android.ugc.aweme.im.message.template.component.VideoCardFallbackInfoComponent.EMPTY_FALLBACK
        L16:
            r0 = r9 & 4
            if (r0 == 0) goto L27
            X.OlZ r0 = com.ss.android.ugc.aweme.im.message.template.component.BaseUserComponent.Companion
            r0.getClass()
            X.5H3<com.ss.android.ugc.aweme.im.message.template.component.BaseUserComponent> r0 = com.ss.android.ugc.aweme.im.message.template.component.BaseUserComponent.EMPTY_USER_INFO$delegate
            java.lang.Object r6 = r0.getValue()
            com.ss.android.ugc.aweme.im.message.template.component.BaseUserComponent r6 = (com.ss.android.ugc.aweme.im.message.template.component.BaseUserComponent) r6
        L27:
            r0 = r9 & 8
            if (r0 == 0) goto L34
            X.V2d r0 = com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent r7 = X.C79087V2d.LIZ()
        L34:
            r0 = r9 & 16
            if (r0 == 0) goto L41
            X.RVe r0 = com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent r8 = X.C69650RVe.LIZ()
        L41:
            r0 = r9 & 32
            if (r0 == 0) goto L52
            com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent r9 = new com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent
            r0 = 0
            r2 = 15
            r9.<init>(r0, r2)
        L4e:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        L52:
            r9 = 0
            goto L4e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.message.template.card.AwemeCardTemplate.<init>(com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent, com.ss.android.ugc.aweme.im.message.template.component.VideoCardFallbackInfoComponent, com.ss.android.ugc.aweme.im.message.template.component.BaseUserComponent, com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent, com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent, int):void");
    }

    public AwemeCardTemplate(VideoCoverComponent baseVideoComponent, VideoCardFallbackInfoComponent fallbackInfo, BaseUserComponent baseUserComponent, PreviewHintComponent previewHintComponent, BaseRequestComponent baseRequestComponent, BaseResponseComponent baseResponseComponent) {
        o.LJIIIZ(baseVideoComponent, "baseVideoComponent");
        o.LJIIIZ(fallbackInfo, "fallbackInfo");
        o.LJIIIZ(baseUserComponent, "baseUserComponent");
        o.LJIIIZ(previewHintComponent, "previewHintComponent");
        o.LJIIIZ(baseRequestComponent, "baseRequestComponent");
        o.LJIIIZ(baseResponseComponent, "baseResponseComponent");
        this.baseVideoComponent = baseVideoComponent;
        this.fallbackInfo = fallbackInfo;
        this.baseUserComponent = baseUserComponent;
        this.previewHintComponent = previewHintComponent;
        this.baseRequestComponent = baseRequestComponent;
        this.baseResponseComponent = baseResponseComponent;
        this.messageType = 1809;
    }

    public static AwemeCardTemplate LIZ(AwemeCardTemplate awemeCardTemplate, VideoCoverComponent videoCoverComponent, VideoCardFallbackInfoComponent videoCardFallbackInfoComponent, PreviewHintComponent previewHintComponent, BaseRequestComponent baseRequestComponent, BaseResponseComponent baseResponseComponent, int i) {
        BaseUserComponent baseUserComponent;
        BaseResponseComponent baseResponseComponent2 = baseResponseComponent;
        BaseRequestComponent baseRequestComponent2 = baseRequestComponent;
        PreviewHintComponent previewHintComponent2 = previewHintComponent;
        VideoCoverComponent baseVideoComponent = videoCoverComponent;
        VideoCardFallbackInfoComponent fallbackInfo = videoCardFallbackInfoComponent;
        if ((i & 1) != 0) {
            baseVideoComponent = awemeCardTemplate.baseVideoComponent;
        }
        if ((i & 2) != 0) {
            fallbackInfo = awemeCardTemplate.fallbackInfo;
        }
        if ((i & 4) != 0) {
            baseUserComponent = awemeCardTemplate.baseUserComponent;
        } else {
            baseUserComponent = null;
        }
        if ((i & 8) != 0) {
            previewHintComponent2 = awemeCardTemplate.previewHintComponent;
        }
        if ((i & 16) != 0) {
            baseRequestComponent2 = awemeCardTemplate.baseRequestComponent;
        }
        if ((i & 32) != 0) {
            baseResponseComponent2 = awemeCardTemplate.baseResponseComponent;
        }
        awemeCardTemplate.getClass();
        o.LJIIIZ(baseVideoComponent, "baseVideoComponent");
        o.LJIIIZ(fallbackInfo, "fallbackInfo");
        o.LJIIIZ(baseUserComponent, "baseUserComponent");
        o.LJIIIZ(previewHintComponent2, "previewHintComponent");
        o.LJIIIZ(baseRequestComponent2, "baseRequestComponent");
        o.LJIIIZ(baseResponseComponent2, "baseResponseComponent");
        return new AwemeCardTemplate(baseVideoComponent, fallbackInfo, baseUserComponent, previewHintComponent2, baseRequestComponent2, baseResponseComponent2);
    }
}
