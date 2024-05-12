package X;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6jG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C168426jG extends AbstractC56012Ht<C78598Ut0, C168536jR> {
    public View LJLIL;
    public View LJLILLLLZI;
    public InterfaceC45540Hu4 LJLJI;
    public final C168476jL LJLJJI = new C5HC() { // from class: X.6jL
        @Override // X.C5HC
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            if (i == 4 && C168426jG.this.isVisible()) {
                View view = C168426jG.this.LJLILLLLZI;
                if (view != null) {
                    view.performClick();
                    return true;
                }
                o.LJIJI("cancelTv");
                throw null;
            }
            return false;
        }
    };

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.LJLJI = C163756bj.LIZIZ(this);
        C44384HbQ.LJIIIZ(this, new AqS168S0100000_2(this, 96));
        View requireViewById = requireViewById(R.id.mij);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.tv_save)");
        this.LJLIL = requireViewById;
        View requireViewById2 = requireViewById(R.id.m1c);
        o.LJIIIIZZ(requireViewById2, "requireViewById(R.id.tv_cancel)");
        this.LJLILLLLZI = requireViewById2;
        View view = this.LJLIL;
        if (view != null) {
            C146035oF.LIZJ(view, new AqS152S0100000_2(this, 152));
            View view2 = this.LJLILLLLZI;
            if (view2 != null) {
                C146035oF.LIZJ(view2, new AqS152S0100000_2(this, 153));
                return;
            } else {
                o.LJIJI("cancelTv");
                throw null;
            }
        }
        o.LJIJI("saveTv");
        throw null;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "viewGroup", layoutInflater, R.layout.cby, viewGroup, false, "null cannot be cast to non-null type android.view.ViewGroup");
    }
}
