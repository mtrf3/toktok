package X;

import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPanelLoadingOptimizationSetting;
import java.util.concurrent.TimeUnit;

/* renamed from: X.CsL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32693CsL extends V1B {
    public long LJLJJL;
    public final /* synthetic */ AbstractC32678Cs6 LJLJJLL;

    @Override // X.V1B, X.InterfaceC75158Tec
    public final void LJ() {
        long j;
        C32683CsB c32683CsB = C32783Ctn.LIZ;
        AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ = this.LJLJJLL.LJZ;
        if (abstractC32698CsQ != null) {
            j = abstractC32698CsQ.LIZJ();
        } else {
            j = 0;
        }
        c32683CsB.LJFF(j);
        this.LJLJJL = System.nanoTime();
    }

    public C32693CsL(AbstractC32678Cs6 abstractC32678Cs6) {
        this.LJLJJLL = abstractC32678Cs6;
    }

    @Override // X.V1B, X.InterfaceC75158Tec
    public final void LJIILL(Exception exc, String str) {
        long j;
        String str2;
        String str3;
        String str4;
        InterfaceC32725Csr interfaceC32725Csr;
        AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ = this.LJLJJLL.LJZ;
        if (abstractC32698CsQ != null) {
            if (abstractC32698CsQ.LIZ == 1 || abstractC32698CsQ.LIZ == 9) {
                long j2 = 0;
                if (abstractC32698CsQ != null) {
                    j = abstractC32698CsQ.LIZJ();
                } else {
                    j = 0;
                }
                String str5 = "";
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                if (exc != null) {
                    str3 = exc.getMessage();
                } else {
                    str3 = null;
                }
                C32454CoU.LJI(j, str2, str3);
                long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.LJLJJL);
                if (exc == null || (str4 = exc.getMessage()) == null) {
                    str4 = "";
                }
                AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ2 = this.LJLJJLL.LJZ;
                if (abstractC32698CsQ2 != null) {
                    j2 = abstractC32698CsQ2.LIZJ();
                }
                if (str != null) {
                    str5 = str;
                }
                C32710Csc.LJI(-1, str4, str5, millis, j2, 1);
                AbstractC32678Cs6 abstractC32678Cs6 = this.LJLJJLL;
                AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ3 = abstractC32678Cs6.LJZ;
                if (abstractC32698CsQ3 != null && (interfaceC32725Csr = abstractC32678Cs6.LJZI) != null) {
                    interfaceC32725Csr.LIZLLL(abstractC32698CsQ3);
                }
            }
        }
    }

    @Override // X.V1B, X.InterfaceC75158Tec
    public final void LJIILJJIL(int i, int i2, String str) {
        long j;
        InterfaceC32725Csr interfaceC32725Csr;
        String str2 = str;
        AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ = this.LJLJJLL.LJZ;
        if (abstractC32698CsQ != null && (abstractC32698CsQ.LIZ == 1 || abstractC32698CsQ.LIZ == 9)) {
            long j2 = 0;
            if (abstractC32698CsQ != null) {
                j = abstractC32698CsQ.LIZJ();
            } else {
                j = 0;
            }
            C32454CoU.LJII(j, str2);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.LJLJJL);
            if (abstractC32698CsQ != null) {
                j2 = abstractC32698CsQ.LIZJ();
            }
            if (LiveGiftPanelLoadingOptimizationSetting.INSTANCE.getValue().imageLoadReportOptimization) {
                XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C32706CsY(this.LJLJJLL, millis, true, j2, str2, null), 3);
            } else {
                this.LJLJJLL.getClass();
                if (str2 == null) {
                    str2 = "";
                }
                C32710Csc.LJI(0, "", str2, millis, j2, 1);
            }
            if (abstractC32698CsQ != null && (interfaceC32725Csr = this.LJLJJLL.LJZI) != null) {
                interfaceC32725Csr.LJII(abstractC32698CsQ);
            }
        }
        this.LJLJJLL.T();
    }
}
