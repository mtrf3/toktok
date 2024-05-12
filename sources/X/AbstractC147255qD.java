package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.5qD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC147255qD extends WMH {
    public Bundle LLJILJILJ() {
        Bundle bundle = this.mArguments;
        if (bundle != null) {
            return bundle;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Scene ");
        LIZ.append(this);
        LIZ.append(" does not have any arguments.");
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    @Override // X.WM7
    public void onDestroyView() {
        String string;
        super.onDestroyView();
        C42326GjK.LIZ.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LargeTransaction: clear scene memory bundles for ");
        LIZ.append(this);
        H78.LJI(X1D.LIZIZ(LIZ));
        Bundle bundle = this.mArguments;
        if (bundle == null || (string = bundle.getString("scene_bundle_uuid")) == null || string.length() == 0) {
            return;
        }
        ((ConcurrentHashMap) C42326GjK.LIZIZ).remove(string);
    }

    public final Bundle LLJILJIL() {
        return this.mArguments;
    }

    @Override // X.WMH, X.WM7
    public /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }
}
