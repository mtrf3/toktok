package com.ss.android.ugc.aweme.im.message.template.card;

import X.C64528PUe;
import X.C64537PUn;
import X.C79104V2u;
import X.C79111V3b;
import X.C79128V3s;
import X.V3X;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCardFallbackInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class VideoCardTemplate implements BaseTemplate {
    public static final Parcelable.Creator<VideoCardTemplate> CREATOR = new C79104V2u();
    public final BaseRequestComponent baseRequestComponent;
    public final BaseResponseComponent baseResponseComponent;
    public final VideoCoverComponent baseVideoComponent;
    public final VideoCardFallbackInfoComponent fallbackInfo;
    public final int messageType;
    public final PreviewHintComponent previewHintComponent;

    public VideoCardTemplate() {
        this(null, null, null, 31);
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
        v3x.LJFF = c79111V3b.build();
        byte[] encode = protoAdapter.encode(v3x.build());
        o.LJIIIIZZ(encode, "ADAPTER\n            .enc…   .build()\n            )");
        return C64528PUe.LIZJ(c64528PUe, encode);
    }

    public final int hashCode() {
        return this.baseResponseComponent.hashCode() + ((this.baseRequestComponent.hashCode() + ((this.previewHintComponent.hashCode() + ((this.fallbackInfo.hashCode() + (this.baseVideoComponent.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoCardTemplate(baseVideoComponent=");
        LIZ.append(this.baseVideoComponent);
        LIZ.append(", fallbackInfo=");
        LIZ.append(this.fallbackInfo);
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
        if (!(obj instanceof VideoCardTemplate)) {
            return false;
        }
        VideoCardTemplate videoCardTemplate = (VideoCardTemplate) obj;
        if (o.LJ(this.baseVideoComponent, videoCardTemplate.baseVideoComponent) && o.LJ(this.fallbackInfo, videoCardTemplate.fallbackInfo) && o.LJ(this.previewHintComponent, videoCardTemplate.previewHintComponent) && o.LJ(this.baseRequestComponent, videoCardTemplate.baseRequestComponent) && o.LJ(this.baseResponseComponent, videoCardTemplate.baseResponseComponent)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final BaseTemplate LLLLZLLLI(PreviewHintComponent preview, BaseRequestComponent request, BaseResponseComponent response) {
        o.LJIIIZ(preview, "preview");
        o.LJIIIZ(request, "request");
        o.LJIIIZ(response, "response");
        VideoCoverComponent baseVideoComponent = this.baseVideoComponent;
        VideoCardFallbackInfoComponent fallbackInfo = this.fallbackInfo;
        o.LJIIIZ(baseVideoComponent, "baseVideoComponent");
        o.LJIIIZ(fallbackInfo, "fallbackInfo");
        return new VideoCardTemplate(baseVideoComponent, fallbackInfo, preview, request, response);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public VideoCardTemplate(com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent r9, com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent r10, com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent r11, int r12) {
        /*
            r8 = this;
            r6 = r11
            r3 = r9
            r5 = r10
            r0 = r12 & 1
            if (r0 == 0) goto Le
            X.Uyb r0 = com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent r3 = com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent.EMPTY_VIDEO_COVER
        Le:
            r0 = r12 & 2
            r7 = 0
            if (r0 == 0) goto L46
            X.Uya r0 = com.ss.android.ugc.aweme.im.message.template.component.VideoCardFallbackInfoComponent.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.im.message.template.component.VideoCardFallbackInfoComponent r4 = com.ss.android.ugc.aweme.im.message.template.component.VideoCardFallbackInfoComponent.EMPTY_FALLBACK
        L1a:
            r0 = r12 & 4
            if (r0 == 0) goto L27
            X.V2d r0 = com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent r5 = X.C79087V2d.LIZ()
        L27:
            r0 = r12 & 8
            if (r0 == 0) goto L34
            X.RVe r0 = com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent r6 = X.C69650RVe.LIZ()
        L34:
            r0 = r12 & 16
            if (r0 == 0) goto L41
            com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent r7 = new com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent
            r0 = 0
            r2 = 15
            r7.<init>(r0, r2)
        L41:
            r2 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            return
        L46:
            r4 = r7
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.message.template.card.VideoCardTemplate.<init>(com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent, com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent, com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent, int):void");
    }

    public VideoCardTemplate(VideoCoverComponent baseVideoComponent, VideoCardFallbackInfoComponent fallbackInfo, PreviewHintComponent previewHintComponent, BaseRequestComponent baseRequestComponent, BaseResponseComponent baseResponseComponent) {
        o.LJIIIZ(baseVideoComponent, "baseVideoComponent");
        o.LJIIIZ(fallbackInfo, "fallbackInfo");
        o.LJIIIZ(previewHintComponent, "previewHintComponent");
        o.LJIIIZ(baseRequestComponent, "baseRequestComponent");
        o.LJIIIZ(baseResponseComponent, "baseResponseComponent");
        this.baseVideoComponent = baseVideoComponent;
        this.fallbackInfo = fallbackInfo;
        this.previewHintComponent = previewHintComponent;
        this.baseRequestComponent = baseRequestComponent;
        this.baseResponseComponent = baseResponseComponent;
        this.messageType = 1803;
    }
}
