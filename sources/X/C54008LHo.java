package X;

import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.LHo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C54008LHo implements InterfaceC54017LHx {
    public final String LIZ;

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

    public static LLQ LIZIZ() {
        ActivityC45651qj LIZLLL = StateOwner.LJLIL.LIZLLL();
        if (LIZLLL != null) {
            return HomeTabViewModel.LJLJLLL.LIZ(LIZLLL).LJLJLJ;
        }
        return null;
    }

    public final void LIZ() {
        LLQ LIZIZ = LIZIZ();
        if (LIZIZ != null) {
            if (LIZIZ.LJIIIZ(this.LIZ) > 0) {
                LIZIZ.LJ(0, this.LIZ);
                return;
            }
            LLQ LIZIZ2 = LIZIZ();
            if (LIZIZ2 == null || !LIZIZ2.LJIIZILJ(this.LIZ)) {
                return;
            }
            LIZIZ.LJIILL(this.LIZ);
        }
    }

    @Override // X.InterfaceC54017LHx
    public final int getDotCount() {
        LLQ LIZIZ = LIZIZ();
        if (LIZIZ != null) {
            return LIZIZ.LJIIIZ(this.LIZ);
        }
        return 0;
    }

    public C54008LHo(String tabName) {
        o.LJIIIZ(tabName, "tabName");
        this.LIZ = tabName;
    }

    @Override // X.InterfaceC54017LHx
    public final void LLLIIL(int i) {
        LLQ LIZIZ = LIZIZ();
        if (LIZIZ != null) {
            LIZIZ.LJ(i, this.LIZ);
        }
    }
}
