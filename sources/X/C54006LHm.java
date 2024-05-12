package X;

import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.LHm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C54006LHm implements InterfaceC54017LHx {
    public final String LIZ;
    public int LIZIZ;

    @Override // X.InterfaceC54017LHx
    public boolean U6() {
        return false;
    }

    @Override // X.InterfaceC54017LHx
    public void V6() {
    }

    @Override // X.InterfaceC54017LHx
    public void W6() {
    }

    public final View LIZJ() {
        ActivityC45651qj LIZLLL = StateOwner.LJLIL.LIZLLL();
        if (LIZLLL == null) {
            return null;
        }
        HomeTabViewModel LIZ = HomeTabViewModel.LJLJLLL.LIZ(LIZLLL);
        View view = LIZ.LJLJI.get(LIZ.LJLILLLLZI.get(this.LIZ));
        if (!(view instanceof View)) {
            return null;
        }
        return view;
    }

    public final void LIZ() {
        View findViewById;
        View LIZJ = LIZJ();
        if (LIZJ != null && (findViewById = LIZJ.findViewById(R.id.mmd)) != null) {
            C78996UzQ.LJJ(findViewById);
        }
        TuxTextView LIZIZ = LIZIZ();
        if (LIZIZ != null) {
            C78996UzQ.LJJ(LIZIZ);
        }
        this.LIZIZ = 0;
    }

    public TuxTextView LIZIZ() {
        View LIZJ = LIZJ();
        if (LIZJ != null) {
            return (TuxTextView) LIZJ.findViewById(R.id.mme);
        }
        return null;
    }

    @Override // X.InterfaceC54017LHx
    public final int getDotCount() {
        return this.LIZIZ;
    }

    public C54006LHm(String tabName) {
        o.LJIIIZ(tabName, "tabName");
        this.LIZ = tabName;
    }

    @Override // X.InterfaceC54017LHx
    public final void LLLIIL(int i) {
        if (i > 99) {
            i = 99;
        } else if (i <= 0) {
            TuxTextView LIZIZ = LIZIZ();
            if (LIZIZ != null) {
                C78996UzQ.LJJ(LIZIZ);
            }
            this.LIZIZ = 0;
            return;
        }
        TuxTextView LIZIZ2 = LIZIZ();
        if (LIZIZ2 != null) {
            C78996UzQ.LJJJJL(LIZIZ2);
        }
        TuxTextView LIZIZ3 = LIZIZ();
        if (LIZIZ3 != null) {
            LIZIZ3.setText(String.valueOf(i));
        }
        this.LIZIZ = i;
    }
}
