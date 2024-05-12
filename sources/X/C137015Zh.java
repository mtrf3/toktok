package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.5Zh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C137015Zh extends WMH {
    public final int LJLIL = R.id.dm7;

    @Override // X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.mView.setBackgroundColor(0);
    }

    @Override // X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.cei, viewGroup, false, "null cannot be cast to non-null type android.view.ViewGroup");
    }

    @Override // X.WMH, X.WM7
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }
}
