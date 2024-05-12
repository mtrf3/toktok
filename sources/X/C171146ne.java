package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;

/* renamed from: X.6ne, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C171146ne extends AbstractC56012Ht<C171166ng, C45955I1v> {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 257));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 254));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 256));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 255));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 258));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 259));

    public final C133765Mu LLJILJIL() {
        return (C133765Mu) this.LJLJJLL.getValue();
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        LLJILJIL().destroy();
    }

    @Override // X.WM7
    public final void onPause() {
        super.onPause();
        LLJILJIL().pause();
    }

    @Override // X.AbstractC56012Ht, X.WM7
    public final void onResume() {
        super.onResume();
        if (isVisible() && C78983UzD.LJJJJIZL(LLJILJIL())) {
            LLJILJIL().play();
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.6nf
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C171166ng) obj).LIZ;
            }
        }, null, new AqS168S0100000_2(this, 194), 2, null);
        AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.6nh
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C171166ng) obj).LIZIZ;
            }
        }, null, new AqS168S0100000_2(this, 195), 2, null);
        C146035oF.LIZJ((View) this.LJLIL.getValue(), C171186ni.LJLIL);
        C146035oF.LIZJ((View) this.LJLILLLLZI.getValue(), new AqS152S0100000_2(this, 260));
        C146035oF.LIZJ((View) this.LJLJI.getValue(), new AqS152S0100000_2(this, 261));
        C146035oF.LIZJ((View) this.LJLJJI.getValue(), new AqS152S0100000_2(this, 262));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.dqx, viewGroup, false, "null cannot be cast to non-null type android.view.ViewGroup");
    }
}
