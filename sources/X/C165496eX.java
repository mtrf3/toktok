package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6eX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C165496eX extends AbstractC56012Ht<C165506eY, TMC> {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 452));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 451));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 453));

    public final C29701Eo LLJILJIL() {
        return (C29701Eo) this.LJLILLLLZI.getValue();
    }

    public final ConstraintLayout LLJILJILJ() {
        return (ConstraintLayout) this.LJLIL.getValue();
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.6eW
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C165506eY) obj).LJLIL);
            }
        }, null, new AqS168S0100000_2(this, 252), 2, null);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        return LLJILJILJ();
    }
}
