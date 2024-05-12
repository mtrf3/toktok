package X;

import ccb.t;
import com.ss.videoarch.live.LiveIOWrapper;
import java.lang.ref.WeakReference;

/* loaded from: classes15.dex */
public class VAZ implements Runnable {
    public final WeakReference<t> LJLIL;
    public final String LJLILLLLZI;
    public final boolean LJLJI;
    public final /* synthetic */ t LJLJJI;

    public final void LIZ() {
        String str;
        long j;
        t tVar = this.LJLIL.get();
        if (tVar != null && (str = this.LJLILLLLZI) != null && !str.isEmpty()) {
            if (this.LJLJI || this.LJLILLLLZI.equals(tVar.LLLLLLIL)) {
                if (this.LJLJI && !this.LJLILLLLZI.equals(tVar.f107v5)) {
                    return;
                }
                if (tVar.LLIILZL != EnumC48289IxJ.PLAYED) {
                    LIZIZ(500L);
                    return;
                }
                t tVar2 = this.LJLIL.get();
                if (tVar2 != null) {
                    long longOption = tVar2.LJLLL.getLongOption(73, -1L);
                    long longOption2 = tVar2.LJLLL.getLongOption(605, -1L);
                    long longOption3 = tVar2.LJLLL.getLongOption(603, -1L);
                    StringBuilder LIZJ = V10.LIZJ("audioFormaterBuff: ", longOption, ", audioPlayerBuff: ");
                    LIZJ.append(longOption2);
                    LIZJ.append(", audioDecoderBuff: ");
                    LIZJ.append(longOption3);
                    X1D.LIZIZ(LIZJ);
                    C46496IMq.LIZJ();
                    if (longOption >= 0) {
                        j = longOption + 0;
                    } else {
                        j = 0;
                    }
                    if (longOption2 >= 0) {
                        j += longOption2;
                    }
                    if (longOption3 >= 0) {
                        j += longOption3;
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("audioBuff: ");
                    LIZ.append(j);
                    X1D.LIZIZ(LIZ);
                    C46496IMq.LIZJ();
                    if (j >= 0 && j != -1) {
                        if (!this.LJLJI || this.LJLJJI.l4 != 1) {
                            return;
                        }
                        LiveIOWrapper.getInstance().setInt64ValueByStrKey(1002, tVar.f107v5, (int) j);
                        StringBuilder LIZJ2 = V10.LIZJ("sync play cache:", j, "(ms) with session id:");
                        LIZJ2.append(tVar.LLLLLLIL);
                        X1D.LIZIZ(LIZJ2);
                        C46496IMq.LIZ();
                        if (j > 5000) {
                            LIZIZ(500L);
                            return;
                        } else {
                            LIZIZ(300L);
                            return;
                        }
                    }
                }
                LIZIZ(500L);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public final void LIZIZ(long j) {
        t tVar = this.LJLIL.get();
        if (tVar == null) {
            return;
        }
        tVar.LJLJI.postDelayed(new VAZ(this.LJLJJI, tVar, this.LJLILLLLZI, this.LJLJI), j);
    }

    public VAZ(t tVar, t tVar2, String str, boolean z) {
        this.LJLJJI = tVar;
        this.LJLIL = new WeakReference<>(tVar2);
        this.LJLILLLLZI = str;
        this.LJLJI = z;
    }
}
