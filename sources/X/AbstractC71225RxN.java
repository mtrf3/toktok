package X;

import android.os.Bundle;
import com.bytedance.android.live.slot.AbsSlotWidget;

/* renamed from: X.RxN, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC71225RxN extends AbsSlotWidget {
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ Object LJLJJI;

    public final void LJIIIZ() {
        switch (this.LJLJI) {
            case 0:
                this.LJLJJI.getClass();
                System.currentTimeMillis();
                return;
            default:
                C71250Rxm c71250Rxm = (C71250Rxm) this.LJLJJI;
                c71250Rxm.getClass();
                c71250Rxm.LIZ = System.currentTimeMillis();
                return;
        }
    }

    public final void LJIIJ() {
        switch (this.LJLJI) {
            case 0:
                this.LJLJJI.getClass();
                return;
            default:
                C71250Rxm c71250Rxm = (C71250Rxm) this.LJLJJI;
                c71250Rxm.LIZ = 0L;
                c71250Rxm.LIZIZ = true;
                return;
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public void onDestroy() {
        switch (this.LJLJI) {
            case 0:
                LJIIJ();
                return;
            default:
                LJIIJ();
                return;
        }
    }

    public AbstractC71225RxN(int i) {
        this.LJLJI = i;
        if (i != 1) {
            this.LJLJJI = new C78541Us5();
        } else {
            this.LJLJJI = new C71250Rxm();
        }
    }

    public final void LJIIJJI(C71229RxR c71229RxR) {
        C71250Rxm c71250Rxm = (C71250Rxm) this.LJLJJI;
        c71250Rxm.getClass();
        if (c71250Rxm.LIZIZ) {
            c71250Rxm.LIZIZ = false;
            C48656J7s.LIZ(System.currentTimeMillis() - c71250Rxm.LIZ, c71229RxR.LIZ, c71229RxR.LIZIZ, c71229RxR.LIZJ);
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public void onCreate(Bundle bundle) {
        switch (this.LJLJI) {
            case 0:
                LJIIIZ();
                return;
            default:
                LJIIIZ();
                return;
        }
    }
}
