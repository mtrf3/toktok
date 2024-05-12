package X;

import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Slk, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73052Slk implements InterfaceC73056Slo {
    public final /* synthetic */ C73051Slj LIZ;

    @Override // X.InterfaceC73056Slo
    public final void LIZ() {
        if (C73059Slr.LIZ == IPY.PLAYER_START) {
            C73051Slj c73051Slj = this.LIZ;
            InterfaceC73054Slm interfaceC73054Slm = c73051Slj.LJLJJLL;
            if (interfaceC73054Slm != null) {
                c73051Slj.LJLJJL = true;
                interfaceC73054Slm.pause();
                c73051Slj.LJFF();
                return;
            }
            return;
        }
        C73051Slj c73051Slj2 = this.LIZ;
        c73051Slj2.LJII(c73051Slj2.getCurrentPercentage().invoke().floatValue(), false);
    }

    @Override // X.InterfaceC73056Slo
    public final void LIZLLL() {
        ((C1AH) ((C73053Sll) this.LIZ.LIZ(R.id.hso)).LIZ(R.id.n7j)).setVisibility(8);
        C73051Slj c73051Slj = this.LIZ;
        InterfaceC73054Slm interfaceC73054Slm = c73051Slj.LJLJJLL;
        if (interfaceC73054Slm != null) {
            c73051Slj.LJLJJL = false;
            interfaceC73054Slm.retry();
            c73051Slj.LJI();
        }
    }

    @Override // X.InterfaceC73056Slo
    public final void LJ() {
        ((C73053Sll) this.LIZ.LIZ(R.id.hso)).LJFF(1);
        this.LIZ.setSliding$live_release(true);
    }

    @Override // X.InterfaceC73056Slo
    public final void LJFF() {
        InterfaceC73054Slm player$live_release = this.LIZ.getPlayer$live_release();
        if (player$live_release != null) {
            C73051Slj c73051Slj = this.LIZ;
            if (player$live_release.isMute()) {
                player$live_release.LJIIIZ();
                ((SK0) c73051Slj.LIZ(R.id.k4s)).LIZ();
            } else {
                player$live_release.LIZIZ();
                ((SK0) c73051Slj.LIZ(R.id.k4s)).LIZIZ();
            }
        }
    }

    public C73052Slk(C73051Slj c73051Slj) {
        this.LIZ = c73051Slj;
    }

    @Override // X.InterfaceC73056Slo
    public final void LIZIZ(float f) {
        String LIZIZ = C73074Sm6.LIZIZ(f, (int) (this.LIZ.getVideoLength$live_release() / 1000));
        this.LIZ.setCurrentProgress(f);
        ((C73053Sll) this.LIZ.LIZ(R.id.hso)).setCurrentProgress(LIZIZ);
        ((TextView) this.LIZ.LIZ(R.id.hs6)).setText(LIZIZ);
    }

    @Override // X.InterfaceC73056Slo
    public final void LIZJ(float f) {
        C73053Sll c73053Sll = (C73053Sll) this.LIZ.LIZ(R.id.hso);
        c73053Sll.LIZ(R.id.l7z).setVisibility(8);
        if (c73053Sll.LJLJI) {
            c73053Sll.LJFF(2);
        } else if (IPZ.LIZIZ != EnumC73069Sm1.PREVIEW) {
            c73053Sll.LJFF(0);
        }
        this.LIZ.LJII(f, false);
        this.LIZ.setSliding$live_release(false);
    }

    @Override // X.InterfaceC73056Slo
    public final void LJI(float f, int i) {
        InterfaceC73054Slm player$live_release = this.LIZ.getPlayer$live_release();
        if (player$live_release != null) {
            player$live_release.LJIIIIZZ(f, i);
        }
    }
}
