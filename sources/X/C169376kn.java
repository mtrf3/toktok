package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6kn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C169376kn extends AbstractC56012Ht<C169356kl, C169316kh> {
    public View LJLIL;
    public View LJLILLLLZI;
    public TuxIconView LJLJI;
    public boolean LJLJJI;

    @Override // X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View requireViewById = requireViewById(R.id.mij);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.tv_save)");
        this.LJLIL = requireViewById;
        View requireViewById2 = requireViewById(R.id.m1c);
        o.LJIIIIZZ(requireViewById2, "requireViewById(R.id.tv_cancel)");
        this.LJLILLLLZI = requireViewById2;
        View view2 = this.LJLIL;
        if (view2 != null) {
            C146035oF.LIZJ(view2, new AqS152S0100000_2(this, 175));
            View view3 = this.LJLILLLLZI;
            if (view3 != null) {
                C146035oF.LIZJ(view3, new AqS152S0100000_2(this, 176));
                View requireViewById3 = requireViewById(R.id.f8p);
                o.LJIIIIZZ(requireViewById3, "requireViewById(R.id.iv_play)");
                TuxIconView tuxIconView = (TuxIconView) requireViewById3;
                this.LJLJI = tuxIconView;
                C146035oF.LIZJ(tuxIconView, new AqS152S0100000_2(this, 177));
                AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.6km
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((C169356kl) obj).LJLIL;
                    }
                }, null, new AqS168S0100000_2(this, 115), 2, null);
                AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.6ko
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((C169356kl) obj).LJLILLLLZI;
                    }
                }, null, new AqS168S0100000_2(this, 116), 2, null);
                return;
            }
            o.LJIJI("cancelTv");
            throw null;
        }
        o.LJIJI("saveTv");
        throw null;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.cc0, viewGroup, false, "null cannot be cast to non-null type android.view.ViewGroup");
    }
}
