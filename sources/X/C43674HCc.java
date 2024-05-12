package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.photomovie.PhotoMvConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.HCc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43674HCc implements Parcelable.Creator<PhotoMvConfig> {
    @Override // android.os.Parcelable.Creator
    public final PhotoMvConfig createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new PhotoMvConfig(parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final PhotoMvConfig[] newArray(int i) {
        return new PhotoMvConfig[i];
    }
}
