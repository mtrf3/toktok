package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS168S0100000_2;

/* renamed from: X.5ZZ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5ZZ extends WMH {
    public final View LLJILJIL() {
        View findViewById = findViewById(R.id.nd);
        if (findViewById != null) {
            return findViewById;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C44384HbQ.LJIIIZ(this, new AqS168S0100000_2(this, 42));
    }

    @Override // X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.cb6, viewGroup, false, "null cannot be cast to non-null type android.view.ViewGroup");
    }

    @Override // X.WMH, X.WM7
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }
}
