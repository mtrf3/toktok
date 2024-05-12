package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.cutsame.SimpleImage;
import kotlin.jvm.internal.o;

/* renamed from: X.HnM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45124HnM implements Parcelable.Creator<SimpleImage> {
    @Override // android.os.Parcelable.Creator
    public final SimpleImage createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        parcel.readInt();
        return new SimpleImage();
    }

    @Override // android.os.Parcelable.Creator
    public final SimpleImage[] newArray(int i) {
        return new SimpleImage[i];
    }
}
