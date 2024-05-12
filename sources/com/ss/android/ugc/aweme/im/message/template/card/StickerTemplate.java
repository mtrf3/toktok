package com.ss.android.ugc.aweme.im.message.template.card;

import X.C64528PUe;
import X.C64537PUn;
import X.C79112V3c;
import X.C79121V3l;
import X.C79123V3n;
import X.C79126V3q;
import X.C79128V3s;
import X.V3L;
import X.V3X;
import X.V4Y;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.StickerCardFallbackInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.UserInfoComponent;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class StickerTemplate implements BaseTemplate {
    public final BaseRequestComponent baseRequestComponent;
    public final BaseResponseComponent baseResponseComponent;
    public final StickerCardFallbackInfoComponent fallbackInfo;
    public final ImageComponent imageComponent;
    public final int messageType;
    public final PreviewHintComponent previewHintComponent;
    public final UserInfoComponent userInfo;
    public static final C79126V3q Companion = new C79126V3q();
    public static final Parcelable.Creator<StickerTemplate> CREATOR = new V3L();

    public StickerTemplate() {
        this(null, null, null, null, 63);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        this.imageComponent.writeToParcel(out, i);
        this.fallbackInfo.writeToParcel(out, i);
        UserInfoComponent userInfoComponent = this.userInfo;
        if (userInfoComponent == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            userInfoComponent.writeToParcel(out, i);
        }
        this.previewHintComponent.writeToParcel(out, i);
        this.baseRequestComponent.writeToParcel(out, i);
        this.baseResponseComponent.writeToParcel(out, i);
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final C64537PUn encode() {
        V4Y v4y;
        C64528PUe c64528PUe = C64537PUn.Companion;
        ProtoAdapter<C79128V3s> protoAdapter = C79128V3s.ADAPTER;
        V3X v3x = new V3X();
        C79112V3c c79112V3c = new C79112V3c();
        c79112V3c.LIZLLL = this.imageComponent.LIZIZ();
        StickerCardFallbackInfoComponent stickerCardFallbackInfoComponent = this.fallbackInfo;
        stickerCardFallbackInfoComponent.getClass();
        C79123V3n c79123V3n = new C79123V3n();
        c79123V3n.LIZLLL = stickerCardFallbackInfoComponent.placeholder.LIZIZ();
        c79112V3c.LJFF = c79123V3n.build();
        UserInfoComponent userInfoComponent = this.userInfo;
        if (userInfoComponent != null) {
            C79121V3l c79121V3l = new C79121V3l();
            c79121V3l.LIZLLL = Long.valueOf(userInfoComponent.userId);
            c79121V3l.LJ = userInfoComponent.nickName;
            c79121V3l.LJFF = userInfoComponent.avatarThumb.LIZIZ();
            v4y = c79121V3l.build();
        } else {
            v4y = null;
        }
        c79112V3c.LJI = v4y;
        c79112V3c.LJ = this.previewHintComponent.LIZ();
        c79112V3c.LJII = this.baseRequestComponent.L();
        v3x.LJII = c79112V3c.build();
        byte[] encode = protoAdapter.encode(v3x.build());
        o.LJIIIIZZ(encode, "ADAPTER\n            .enc…   .build()\n            )");
        return C64528PUe.LIZJ(c64528PUe, encode);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.fallbackInfo.hashCode() + (this.imageComponent.hashCode() * 31)) * 31;
        UserInfoComponent userInfoComponent = this.userInfo;
        if (userInfoComponent == null) {
            hashCode = 0;
        } else {
            hashCode = userInfoComponent.hashCode();
        }
        return this.baseResponseComponent.hashCode() + ((this.baseRequestComponent.hashCode() + ((this.previewHintComponent.hashCode() + ((hashCode2 + hashCode) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StickerTemplate(imageComponent=");
        LIZ.append(this.imageComponent);
        LIZ.append(", fallbackInfo=");
        LIZ.append(this.fallbackInfo);
        LIZ.append(", userInfo=");
        LIZ.append(this.userInfo);
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
        if (!(obj instanceof StickerTemplate)) {
            return false;
        }
        StickerTemplate stickerTemplate = (StickerTemplate) obj;
        if (o.LJ(this.imageComponent, stickerTemplate.imageComponent) && o.LJ(this.fallbackInfo, stickerTemplate.fallbackInfo) && o.LJ(this.userInfo, stickerTemplate.userInfo) && o.LJ(this.previewHintComponent, stickerTemplate.previewHintComponent) && o.LJ(this.baseRequestComponent, stickerTemplate.baseRequestComponent) && o.LJ(this.baseResponseComponent, stickerTemplate.baseResponseComponent)) {
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
    public StickerTemplate(com.ss.android.ugc.aweme.im.message.template.component.ImageComponent r10, com.ss.android.ugc.aweme.im.message.template.component.UserInfoComponent r11, com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent r12, com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent r13, int r14) {
        /*
            r9 = this;
            r7 = r13
            r6 = r12
            r3 = r10
            r5 = r11
            r0 = r14 & 1
            if (r0 == 0) goto L11
            X.V2l r0 = com.ss.android.ugc.aweme.im.message.template.component.ImageComponent.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.im.message.template.component.ImageComponent r3 = X.C79095V2l.LIZ()
        L11:
            r0 = r14 & 2
            r8 = 0
            if (r0 == 0) goto L54
            X.K1K r0 = com.ss.android.ugc.aweme.im.message.template.component.StickerCardFallbackInfoComponent.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.im.message.template.component.StickerCardFallbackInfoComponent r4 = com.ss.android.ugc.aweme.im.message.template.component.StickerCardFallbackInfoComponent.EMPTY_FALLBACK
        L1d:
            r0 = r14 & 4
            if (r0 == 0) goto L28
            X.K1I r0 = com.ss.android.ugc.aweme.im.message.template.component.UserInfoComponent.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.im.message.template.component.UserInfoComponent r5 = com.ss.android.ugc.aweme.im.message.template.component.UserInfoComponent.EMPTY_USER_INFO
        L28:
            r0 = r14 & 8
            if (r0 == 0) goto L35
            X.V2d r0 = com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent r6 = X.C79087V2d.LIZ()
        L35:
            r0 = r14 & 16
            if (r0 == 0) goto L42
            X.RVe r0 = com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent r7 = X.C69650RVe.LIZ()
        L42:
            r0 = r14 & 32
            if (r0 == 0) goto L4f
            com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent r8 = new com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent
            r0 = 0
            r2 = 15
            r8.<init>(r0, r2)
        L4f:
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return
        L54:
            r4 = r8
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate.<init>(com.ss.android.ugc.aweme.im.message.template.component.ImageComponent, com.ss.android.ugc.aweme.im.message.template.component.UserInfoComponent, com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent, com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent, int):void");
    }

    public StickerTemplate(ImageComponent imageComponent, StickerCardFallbackInfoComponent fallbackInfo, UserInfoComponent userInfoComponent, PreviewHintComponent previewHintComponent, BaseRequestComponent baseRequestComponent, BaseResponseComponent baseResponseComponent) {
        o.LJIIIZ(imageComponent, "imageComponent");
        o.LJIIIZ(fallbackInfo, "fallbackInfo");
        o.LJIIIZ(previewHintComponent, "previewHintComponent");
        o.LJIIIZ(baseRequestComponent, "baseRequestComponent");
        o.LJIIIZ(baseResponseComponent, "baseResponseComponent");
        this.imageComponent = imageComponent;
        this.fallbackInfo = fallbackInfo;
        this.userInfo = userInfoComponent;
        this.previewHintComponent = previewHintComponent;
        this.baseRequestComponent = baseRequestComponent;
        this.baseResponseComponent = baseResponseComponent;
        this.messageType = 1805;
    }

    public static StickerTemplate LIZ(StickerTemplate stickerTemplate, ImageComponent imageComponent, StickerCardFallbackInfoComponent stickerCardFallbackInfoComponent, PreviewHintComponent previewHintComponent, BaseRequestComponent baseRequestComponent, BaseResponseComponent baseResponseComponent, int i) {
        UserInfoComponent userInfoComponent;
        BaseResponseComponent baseResponseComponent2 = baseResponseComponent;
        BaseRequestComponent baseRequestComponent2 = baseRequestComponent;
        PreviewHintComponent previewHintComponent2 = previewHintComponent;
        ImageComponent imageComponent2 = imageComponent;
        StickerCardFallbackInfoComponent fallbackInfo = stickerCardFallbackInfoComponent;
        if ((i & 1) != 0) {
            imageComponent2 = stickerTemplate.imageComponent;
        }
        if ((i & 2) != 0) {
            fallbackInfo = stickerTemplate.fallbackInfo;
        }
        if ((i & 4) != 0) {
            userInfoComponent = stickerTemplate.userInfo;
        } else {
            userInfoComponent = null;
        }
        if ((i & 8) != 0) {
            previewHintComponent2 = stickerTemplate.previewHintComponent;
        }
        if ((i & 16) != 0) {
            baseRequestComponent2 = stickerTemplate.baseRequestComponent;
        }
        if ((i & 32) != 0) {
            baseResponseComponent2 = stickerTemplate.baseResponseComponent;
        }
        stickerTemplate.getClass();
        o.LJIIIZ(imageComponent2, "imageComponent");
        o.LJIIIZ(fallbackInfo, "fallbackInfo");
        o.LJIIIZ(previewHintComponent2, "previewHintComponent");
        o.LJIIIZ(baseRequestComponent2, "baseRequestComponent");
        o.LJIIIZ(baseResponseComponent2, "baseResponseComponent");
        return new StickerTemplate(imageComponent2, fallbackInfo, userInfoComponent, previewHintComponent2, baseRequestComponent2, baseResponseComponent2);
    }
}
