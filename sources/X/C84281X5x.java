package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.cut_ui.IBinderWrapper;
import kotlin.jvm.internal.o;

/* renamed from: X.X5x, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84281X5x implements Parcelable.Creator<IBinderWrapper> {
    @Override // android.os.Parcelable.Creator
    public final IBinderWrapper createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new IBinderWrapper(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final IBinderWrapper[] newArray(int i) {
        return new IBinderWrapper[i];
    }
}
