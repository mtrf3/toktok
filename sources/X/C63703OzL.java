package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.StickerCardFallbackInfoComponent;
import kotlin.jvm.internal.o;

/* renamed from: X.OzL, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63703OzL implements Parcelable.Creator<StickerCardFallbackInfoComponent> {
    @Override // android.os.Parcelable.Creator
    public final StickerCardFallbackInfoComponent createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new StickerCardFallbackInfoComponent(ImageComponent.CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public final StickerCardFallbackInfoComponent[] newArray(int i) {
        return new StickerCardFallbackInfoComponent[i];
    }
}
