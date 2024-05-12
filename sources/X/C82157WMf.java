package X;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;

/* renamed from: X.WMf, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82157WMf extends C82160WMi {
    public C82157WMf(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }
}
