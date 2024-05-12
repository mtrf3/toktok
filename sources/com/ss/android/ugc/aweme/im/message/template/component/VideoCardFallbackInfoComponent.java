package com.ss.android.ugc.aweme.im.message.template.component;

import X.C78944Uya;
import X.F9E;
import X.V3A;
import X.V3B;
import X.V4W;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class VideoCardFallbackInfoComponent extends F9E implements BaseComponent {
    public final ImageComponent image;
    public final ActionLinkComponent linkInfo;
    public final TextComponent text;
    public static final C78944Uya Companion = new C78944Uya();
    public static final Parcelable.Creator<VideoCardFallbackInfoComponent> CREATOR = new V3A();
    public static final VideoCardFallbackInfoComponent EMPTY_FALLBACK = new VideoCardFallbackInfoComponent(7, null);

    public VideoCardFallbackInfoComponent() {
        this(7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.image, this.text, this.linkInfo};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        this.image.writeToParcel(out, i);
        this.text.writeToParcel(out, i);
        this.linkInfo.writeToParcel(out, i);
    }

    public final V4W L() {
        V3B v3b = new V3B();
        v3b.LIZLLL = this.image.LIZIZ();
        v3b.LJ = this.text.L();
        v3b.LJFF = this.linkInfo.M();
        return v3b.build();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ VideoCardFallbackInfoComponent(int r4, com.ss.android.ugc.aweme.im.message.template.component.TextComponent r5) {
        /*
            r3 = this;
            r0 = r4 & 1
            r2 = 0
            if (r0 == 0) goto L2c
            X.V2l r0 = com.ss.android.ugc.aweme.im.message.template.component.ImageComponent.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.im.message.template.component.ImageComponent r1 = X.C79095V2l.LIZ()
        Le:
            r0 = r4 & 2
            if (r0 == 0) goto L1b
            X.V2z r0 = com.ss.android.ugc.aweme.im.message.template.component.TextComponent.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.im.message.template.component.TextComponent r5 = X.C79109V2z.LIZ()
        L1b:
            r0 = r4 & 4
            if (r0 == 0) goto L28
            X.OzX r0 = com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent r2 = X.C63715OzX.LIZ()
        L28:
            r3.<init>(r2, r1, r5)
            return
        L2c:
            r1 = r2
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.message.template.component.VideoCardFallbackInfoComponent.<init>(int, com.ss.android.ugc.aweme.im.message.template.component.TextComponent):void");
    }

    public VideoCardFallbackInfoComponent(ActionLinkComponent linkInfo, ImageComponent image, TextComponent text) {
        o.LJIIIZ(image, "image");
        o.LJIIIZ(text, "text");
        o.LJIIIZ(linkInfo, "linkInfo");
        this.image = image;
        this.text = text;
        this.linkInfo = linkInfo;
    }
}
