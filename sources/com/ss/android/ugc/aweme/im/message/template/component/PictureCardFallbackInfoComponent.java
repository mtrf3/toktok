package com.ss.android.ugc.aweme.im.message.template.component;

import X.C70658RoE;
import X.F9E;
import X.V3K;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class PictureCardFallbackInfoComponent extends F9E implements BaseComponent {
    public final ImageComponent image;
    public final ActionLinkComponent linkInfo;
    public final TextComponent text;
    public static final C70658RoE Companion = new C70658RoE();
    public static final Parcelable.Creator<PictureCardFallbackInfoComponent> CREATOR = new V3K();
    public static final PictureCardFallbackInfoComponent EMPTY_FALLBACK = new PictureCardFallbackInfoComponent(0);

    public PictureCardFallbackInfoComponent() {
        this(0);
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

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ PictureCardFallbackInfoComponent(int r4) {
        /*
            r3 = this;
            X.V2l r0 = com.ss.android.ugc.aweme.im.message.template.component.ImageComponent.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.im.message.template.component.ImageComponent r2 = X.C79095V2l.LIZ()
            X.V2z r0 = com.ss.android.ugc.aweme.im.message.template.component.TextComponent.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.im.message.template.component.TextComponent r1 = X.C79109V2z.LIZ()
            X.OzX r0 = com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent r0 = X.C63715OzX.LIZ()
            r3.<init>(r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.message.template.component.PictureCardFallbackInfoComponent.<init>(int):void");
    }

    public PictureCardFallbackInfoComponent(ActionLinkComponent linkInfo, ImageComponent image, TextComponent text) {
        o.LJIIIZ(image, "image");
        o.LJIIIZ(text, "text");
        o.LJIIIZ(linkInfo, "linkInfo");
        this.image = image;
        this.text = text;
        this.linkInfo = linkInfo;
    }
}
