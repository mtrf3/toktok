package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;

/* renamed from: X.HWy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44216HWy extends WMH {
    public C45848Hz2 LJLIL;
    public boolean LJLILLLLZI;

    @Override // X.WM7
    public final void onDestroy() {
        super.onDestroy();
        C44172HVg.LJI.LJIIJ();
    }

    @Override // X.WM7
    public final void onStart() {
        C45848Hz2 c45848Hz2;
        super.onStart();
        if (!this.LJLILLLLZI && (c45848Hz2 = this.LJLIL) != null) {
            WM7 findSceneByTag = findSceneByTag("PlanC");
            if (findSceneByTag != null) {
                remove(findSceneByTag);
            }
            add(R.id.irq, c45848Hz2, "PlanC");
            this.LJLILLLLZI = true;
        }
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.cej, viewGroup, false, "null cannot be cast to non-null type android.view.ViewGroup");
    }

    @Override // X.WMH, X.WM7
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }
}
