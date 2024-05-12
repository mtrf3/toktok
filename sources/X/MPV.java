package X;

import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import java.util.List;

/* loaded from: classes10.dex */
public final class MPV implements InterfaceC56756MPg<MRU, List<? extends MusNotice>> {
    public boolean LIZ = true;
    public final /* synthetic */ MPY LIZIZ;

    @Override // X.InterfaceC56756MPg
    public final boolean hasMore() {
        return false;
    }

    @Override // X.InterfaceC56756MPg
    public final List<? extends MusNotice> LIZIZ() {
        return C61878OQg.INSTANCE;
    }

    public MPV(MPY mpy) {
        this.LIZIZ = mpy;
    }

    @Override // X.InterfaceC56756MPg
    public final AbstractC73672Svk<C56769MPt<List<? extends MusNotice>>> LIZ(MRU mru) {
        boolean z;
        MPU mpu;
        if ((mru instanceof MPU) && (mpu = (MPU) mru) != null) {
            z = mpu.LIZ;
        } else {
            z = false;
        }
        if (L0H.LIZ()) {
            this.LIZIZ.LIZ().LJIILIIL().removeObserver((Observer) this.LIZIZ.LIZLLL.getValue());
        }
        return AbstractC73672Svk.LJIIJ(new MPX(this.LIZIZ, z, this));
    }

    public final C56769MPt LIZJ(Object obj, Throwable th) {
        return new C56769MPt(this, obj, null);
    }

    public final void LIZLLL(EnumC94693nd enumC94693nd, InterfaceC73573Su9<C56769MPt<List<MusNotice>>> interfaceC73573Su9) {
        if (enumC94693nd != null) {
            int i = C56751MPb.LIZ[enumC94693nd.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    this.LIZ = true;
                    C38891fp.LJJIJ(interfaceC73573Su9, LIZJ(C61878OQg.INSTANCE, null));
                    return;
                }
            } else {
                this.LIZ = false;
                C38891fp.LJJIJ(interfaceC73573Su9, LIZJ(C61878OQg.INSTANCE, null));
                return;
            }
        }
        C38891fp.LJJIIZI(interfaceC73573Su9, new IllegalStateException("refresh error!"));
    }
}
