package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Rq9, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70777Rq9 implements InterfaceC71509S4r {
    public final /* synthetic */ DialogC71430S1q LJLIL;

    @Override // X.InterfaceC71509S4r
    public final void LIZJ(int i) {
    }

    public C70777Rq9(DialogC71430S1q dialogC71430S1q) {
        this.LJLIL = dialogC71430S1q;
    }

    @Override // X.InterfaceC71509S4r
    public final void LIZ(int i) {
        if (i == 0) {
            C0A2 layoutManager = this.LJLIL.LJLIL.getLayoutManager();
            o.LJII(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            DialogC71430S1q dialogC71430S1q = this.LJLIL;
            int LLIL = ((LinearLayoutManager) layoutManager).LLIL();
            Iterator it = ((ArrayList) ((DialogC70776Rq8) dialogC71430S1q).LJLJLJ).iterator();
            while (it.hasNext()) {
                ((InterfaceC70779RqB) it.next()).onPageSelected(LLIL);
            }
            return;
        }
        if (i == 2) {
            this.LJLIL.dismiss();
        }
    }

    @Override // X.InterfaceC71509S4r
    public final void LIZIZ(float f, int i) {
        this.LJLIL.LJLILLLLZI.getBackground().setAlpha((int) (255 * f));
        Iterator it = ((ArrayList) this.LJLIL.LJLJJLL).iterator();
        while (it.hasNext()) {
            ((InterfaceC70778RqA) it.next()).setAlpha(f);
        }
    }
}
