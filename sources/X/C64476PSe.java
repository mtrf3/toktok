package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: X.PSe, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64476PSe {
    public static <T extends SafeParcelable> T LIZ(byte[] bArr, Parcelable.Creator<T> creator) {
        QH7.LJIIIIZZ(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        T createFromParcel = creator.createFromParcel(obtain);
        obtain.recycle();
        return createFromParcel;
    }
}
