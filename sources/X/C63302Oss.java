package X;

import android.os.SystemClock;
import com.bytedance.im.core.proto.GetRecentMessageRespBody;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.Oss, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63302Oss implements InterfaceC63353Oth<C63303Ost> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ C63622Oy2 LJLILLLLZI;
    public final /* synthetic */ GetRecentMessageRespBody LJLJI;
    public final /* synthetic */ C63301Osr LJLJJI;

    @Override // X.InterfaceC63353Oth
    public final void LIZLLL(C63303Ost c63303Ost) {
        boolean z;
        C63303Ost c63303Ost2 = c63303Ost;
        this.LJLJJI.LJIILJJIL = SystemClock.uptimeMillis() - this.LJLIL;
        long uptimeMillis = SystemClock.uptimeMillis();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GetRecentMsgHandler handleResponse onCallback, seqId:");
        LIZ.append(this.LJLILLLLZI.LJLIL);
        LIZ.append(", result:");
        LIZ.append(c63303Ost2);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        this.LJLJJI.getClass();
        C63301Osr.LJIILL(c63303Ost2);
        this.LJLJJI.LJIILL += SystemClock.uptimeMillis() - uptimeMillis;
        long uptimeMillis2 = SystemClock.uptimeMillis();
        boolean z2 = false;
        if (c63303Ost2.LJFF > 0 && this.LJLJI.has_more.booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        if (C63308Osy.LJI().LIZLLL().LJIJJLI == 1 || !z) {
            if (this.LJLJJI.LJ == 0) {
                z2 = true;
            }
            C63269OsL.LIZLLL(z2);
            if (!z) {
                ((CopyOnWriteArraySet) C63269OsL.LIZLLL).remove(Integer.valueOf(this.LJLJJI.LIZJ));
                C63337OtR.LJII(this.LJLILLLLZI, true).LIZ();
                this.LJLJJI.LJIILLIIL += SystemClock.uptimeMillis() - uptimeMillis2;
                long uptimeMillis3 = SystemClock.uptimeMillis();
                C63301Osr c63301Osr = this.LJLJJI;
                C63272OsO.LIZLLL(true, true, uptimeMillis3 - c63301Osr.LJIIIIZZ, c63301Osr.LJFF, 0, c63301Osr.LJI, c63301Osr.LJII, null, c63301Osr.LJIIJ, c63301Osr.LJIIJJI, c63301Osr.LJIIL, c63301Osr.LJIILIIL, c63301Osr.LJIILJJIL, c63301Osr.LJIILL, c63301Osr.LJIILLIIL, c63301Osr.LJ, false);
                this.LJLJJI.LIZLLL(Boolean.TRUE);
                C63305Osv.LIZIZ().LIZ();
                this.LJLJJI.LJIILIIL(true);
                return;
            }
        }
        this.LJLJJI.LJIILLIIL += SystemClock.uptimeMillis() - uptimeMillis2;
        C63301Osr c63301Osr2 = this.LJLJJI;
        c63301Osr2.LJIIZILJ(c63303Ost2.LJFF, c63301Osr2.LIZLLL);
    }

    public C63302Oss(C63301Osr c63301Osr, long j, C63622Oy2 c63622Oy2, GetRecentMessageRespBody getRecentMessageRespBody) {
        this.LJLJJI = c63301Osr;
        this.LJLIL = j;
        this.LJLILLLLZI = c63622Oy2;
        this.LJLJI = getRecentMessageRespBody;
    }
}
