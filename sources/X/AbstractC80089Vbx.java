package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.widget.LiveNewGiftPanelWidget;

/* renamed from: X.Vbx, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC80089Vbx extends C0A4 {
    public RecyclerView LIZ;
    public final C80090Vby LIZIZ = new C80090Vby(this);

    public abstract int[] LIZIZ(C0A2 c0a2, View view);

    public final boolean LIZJ() {
        C0A2 layoutManager;
        View LJ;
        RecyclerView recyclerView = this.LIZ;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return false;
        }
        C80091Vbz c80091Vbz = (C80091Vbz) this;
        if (layoutManager.LJIL()) {
            LJ = C80092Vc0.LJ(layoutManager, c80091Vbz.LJII(layoutManager));
        } else {
            if (layoutManager.LJIJJLI()) {
                LJ = C80092Vc0.LJ(layoutManager, c80091Vbz.LJI(layoutManager));
            }
            return false;
        }
        if (LJ != null) {
            c80091Vbz.LJI.LJLJJI = C0A2.LJJJLL(LJ);
            LiveNewGiftPanelWidget liveNewGiftPanelWidget = c80091Vbz.LJI;
            liveNewGiftPanelWidget.LJZI(liveNewGiftPanelWidget.LJLJJI);
            int[] LIZIZ = LIZIZ(layoutManager, LJ);
            int i = LIZIZ[0];
            if (i == 0 && LIZIZ[1] == 0) {
                return false;
            }
            this.LIZ.LJLIIIL(i, LIZIZ[1]);
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // X.C0A4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(int r12, int r13) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC80089Vbx.LIZ(int, int):boolean");
    }
}
