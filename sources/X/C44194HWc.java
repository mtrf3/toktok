package X;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.jsb.comment.IBinderWrapper;
import kotlin.jvm.internal.o;

/* renamed from: X.HWc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44194HWc implements Parcelable.Creator<IBinderWrapper> {
    @Override // android.os.Parcelable.Creator
    public final IBinderWrapper createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        IBinder readStrongBinder = parcel.readStrongBinder();
        o.LJIIIIZZ(readStrongBinder, "parcel.readStrongBinder()");
        return new IBinderWrapper(readStrongBinder);
    }

    @Override // android.os.Parcelable.Creator
    public final IBinderWrapper[] newArray(int i) {
        return new IBinderWrapper[i];
    }
}
