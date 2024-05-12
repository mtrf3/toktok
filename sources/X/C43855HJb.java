package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.cut.BackgroundVideoCompileConfigure;
import kotlin.jvm.internal.o;

/* renamed from: X.HJb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43855HJb implements Parcelable.Creator<BackgroundVideoCompileConfigure> {
    @Override // android.os.Parcelable.Creator
    public final BackgroundVideoCompileConfigure createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new BackgroundVideoCompileConfigure(parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final BackgroundVideoCompileConfigure[] newArray(int i) {
        return new BackgroundVideoCompileConfigure[i];
    }
}
