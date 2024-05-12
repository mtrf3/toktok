package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.commerce.tools.sticker.CommerceToolsStickerContext;
import kotlin.jvm.internal.o;

/* renamed from: X.Glk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42476Glk implements Parcelable.Creator<CommerceToolsStickerContext> {
    @Override // android.os.Parcelable.Creator
    public final CommerceToolsStickerContext createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        parcel.readInt();
        return new CommerceToolsStickerContext();
    }

    @Override // android.os.Parcelable.Creator
    public final CommerceToolsStickerContext[] newArray(int i) {
        return new CommerceToolsStickerContext[i];
    }
}
