package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ies.nle.ui_base.IBinderWrapper;
import kotlin.jvm.internal.o;

/* renamed from: X.X5w, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84280X5w implements Parcelable.Creator<IBinderWrapper> {
    @Override // android.os.Parcelable.Creator
    public final IBinderWrapper createFromParcel(Parcel parcel) {
        o.LJIIJ(parcel, "parcel");
        return new IBinderWrapper(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final IBinderWrapper[] newArray(int i) {
        return new IBinderWrapper[i];
    }
}
