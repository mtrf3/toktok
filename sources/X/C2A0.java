package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* renamed from: X.2A0, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2A0 extends WMH {
    @Override // X.WMH
    public final void onPostActivityCreated() {
        super.onPostActivityCreated();
    }

    @Override // X.WMH
    public final void onPostResume() {
        super.onPostResume();
    }

    @Override // X.WMH
    public final void onPostStart() {
        super.onPostStart();
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, requireArguments().getInt("layoutId"), container, false);
        if (LLLLIILL != null) {
            return (ViewGroup) LLLLIILL;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    @Override // X.WMH, X.WM7
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }
}
