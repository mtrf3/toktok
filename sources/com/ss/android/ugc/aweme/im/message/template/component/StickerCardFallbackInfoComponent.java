package com.ss.android.ugc.aweme.im.message.template.component;

import X.C63703OzL;
import X.C79095V2l;
import X.F9E;
import X.K1K;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class StickerCardFallbackInfoComponent extends F9E implements BaseComponent {
    public final ImageComponent placeholder;
    public static final K1K Companion = new K1K();
    public static final Parcelable.Creator<StickerCardFallbackInfoComponent> CREATOR = new C63703OzL();
    public static final StickerCardFallbackInfoComponent EMPTY_FALLBACK = new StickerCardFallbackInfoComponent(0);

    public StickerCardFallbackInfoComponent() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.placeholder};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        this.placeholder.writeToParcel(out, i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StickerCardFallbackInfoComponent(int i) {
        this(C79095V2l.LIZ());
        ImageComponent.Companion.getClass();
    }

    public StickerCardFallbackInfoComponent(ImageComponent placeholder) {
        o.LJIIIZ(placeholder, "placeholder");
        this.placeholder = placeholder;
    }
}
