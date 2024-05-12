package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.cut.DiyPropVideoCompileConfigure;
import kotlin.jvm.internal.o;

/* renamed from: X.HJa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43854HJa implements Parcelable.Creator<DiyPropVideoCompileConfigure> {
    @Override // android.os.Parcelable.Creator
    public final DiyPropVideoCompileConfigure createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new DiyPropVideoCompileConfigure(parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final DiyPropVideoCompileConfigure[] newArray(int i) {
        return new DiyPropVideoCompileConfigure[i];
    }
}
