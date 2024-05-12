package com.ss.android.ugc.aweme.im.message.template.card.imagecard;

import X.C221108m2;
import X.C5H3;
import X.C78998UzS;
import X.C79085V2b;
import X.C79086V2c;
import X.V4R;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.BaseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ButtonComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class ImageCardTitleBar implements BaseComponent<V4R> {
    public final ImageComponent leftImage;
    public final ButtonComponent rightButton;
    public final TextComponent subtitle;
    public final TextComponent title;
    public static final C78998UzS Companion = new C78998UzS();
    public static final Parcelable.Creator<ImageCardTitleBar> CREATOR = new C79085V2b();
    public static final C5H3<ImageCardTitleBar> EMPTY_IMAGE_CARD_TITLE_BAR$delegate = C221108m2.LIZIZ(C79086V2c.LJLIL);

    /* JADX WARN: Multi-variable type inference failed */
    public ImageCardTitleBar() {
        this((ImageComponent) null, (TextComponent) (0 == true ? 1 : 0), (TextComponent) (0 == true ? 1 : 0), 15);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageCardTitleBar)) {
            return false;
        }
        ImageCardTitleBar imageCardTitleBar = (ImageCardTitleBar) obj;
        return o.LJ(this.leftImage, imageCardTitleBar.leftImage) && o.LJ(this.title, imageCardTitleBar.title) && o.LJ(this.subtitle, imageCardTitleBar.subtitle) && o.LJ(this.rightButton, imageCardTitleBar.rightButton);
    }

    public final int hashCode() {
        int hashCode = (this.subtitle.hashCode() + ((this.title.hashCode() + (this.leftImage.hashCode() * 31)) * 31)) * 31;
        ButtonComponent buttonComponent = this.rightButton;
        return hashCode + (buttonComponent == null ? 0 : buttonComponent.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ImageCardTitleBar(leftImage=");
        LIZ.append(this.leftImage);
        LIZ.append(", title=");
        LIZ.append(this.title);
        LIZ.append(", subtitle=");
        LIZ.append(this.subtitle);
        LIZ.append(", rightButton=");
        LIZ.append(this.rightButton);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        this.leftImage.writeToParcel(out, i);
        this.title.writeToParcel(out, i);
        this.subtitle.writeToParcel(out, i);
        ButtonComponent buttonComponent = this.rightButton;
        if (buttonComponent == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            buttonComponent.writeToParcel(out, i);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ ImageCardTitleBar(com.ss.android.ugc.aweme.im.message.template.component.ImageComponent r2, com.ss.android.ugc.aweme.im.message.template.component.TextComponent r3, com.ss.android.ugc.aweme.im.message.template.component.TextComponent r4, int r5) {
        /*
            r1 = this;
            r0 = r5 & 1
            if (r0 == 0) goto Ld
            X.V2l r0 = com.ss.android.ugc.aweme.im.message.template.component.ImageComponent.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.im.message.template.component.ImageComponent r2 = X.C79095V2l.LIZ()
        Ld:
            r0 = r5 & 2
            if (r0 == 0) goto L1a
            X.V2z r0 = com.ss.android.ugc.aweme.im.message.template.component.TextComponent.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.im.message.template.component.TextComponent r3 = X.C79109V2z.LIZ()
        L1a:
            r0 = r5 & 4
            if (r0 == 0) goto L27
            X.V2z r0 = com.ss.android.ugc.aweme.im.message.template.component.TextComponent.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.im.message.template.component.TextComponent r4 = X.C79109V2z.LIZ()
        L27:
            r0 = 0
            r1.<init>(r2, r3, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.message.template.card.imagecard.ImageCardTitleBar.<init>(com.ss.android.ugc.aweme.im.message.template.component.ImageComponent, com.ss.android.ugc.aweme.im.message.template.component.TextComponent, com.ss.android.ugc.aweme.im.message.template.component.TextComponent, int):void");
    }

    public ImageCardTitleBar(ImageComponent leftImage, TextComponent title, TextComponent subtitle, ButtonComponent buttonComponent) {
        o.LJIIIZ(leftImage, "leftImage");
        o.LJIIIZ(title, "title");
        o.LJIIIZ(subtitle, "subtitle");
        this.leftImage = leftImage;
        this.title = title;
        this.subtitle = subtitle;
        this.rightButton = buttonComponent;
    }
}
