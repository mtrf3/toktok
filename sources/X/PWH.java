package X;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* loaded from: classes12.dex */
public final class PWH extends AbstractRunnableC64621PXt {
    public final /* synthetic */ boolean LJLJI = false;
    public final /* synthetic */ C64579PWd LJLJJI;
    public final /* synthetic */ PWO LJLJJL;

    @Override // X.AbstractRunnableC64621PXt
    public final void LIZIZ() {
        PWF[] pwfArr;
        long j;
        PWO pwo = this.LJLJJL;
        boolean z = this.LJLJI;
        C64579PWd c64579PWd = this.LJLJJI;
        synchronized (pwo.LJLJJI.LL) {
            synchronized (pwo.LJLJJI) {
                int LIZ = pwo.LJLJJI.LJZI.LIZ();
                if (z) {
                    C64579PWd c64579PWd2 = pwo.LJLJJI.LJZI;
                    c64579PWd2.LIZ = 0;
                    Arrays.fill(c64579PWd2.LIZIZ, 0);
                }
                C64579PWd c64579PWd3 = pwo.LJLJJI.LJZI;
                c64579PWd3.getClass();
                for (int i = 0; i < 10; i++) {
                    if (((1 << i) & c64579PWd.LIZ) != 0) {
                        c64579PWd3.LIZIZ(i, c64579PWd.LIZIZ[i]);
                    }
                }
                int LIZ2 = pwo.LJLJJI.LJZI.LIZ();
                pwfArr = null;
                if (LIZ2 == -1 || LIZ2 == LIZ) {
                    j = 0;
                } else {
                    j = LIZ2 - LIZ;
                    if (!pwo.LJLJJI.LJLJI.isEmpty()) {
                        pwfArr = (PWF[]) ((LinkedHashMap) pwo.LJLJJI.LJLJI).values().toArray(new PWF[pwo.LJLJJI.LJLJI.size()]);
                    }
                }
            }
            try {
                PWE pwe = pwo.LJLJJI;
                pwe.LL.LIZ(pwe.LJZI);
            } catch (IOException unused) {
                PWE pwe2 = pwo.LJLJJI;
                pwe2.getClass();
                try {
                    PWT pwt = PWT.PROTOCOL_ERROR;
                    pwe2.LIZ(pwt, pwt);
                } catch (IOException unused2) {
                }
            }
        }
        if (pwfArr != null) {
            for (PWF pwf : pwfArr) {
                synchronized (pwf) {
                    pwf.LIZIZ += j;
                    if (j > 0) {
                        pwf.notifyAll();
                    }
                }
            }
        }
        PWE.LLFF.execute(new C64577PWb(pwo, pwo.LJLJJI.LJLJJI));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PWH(PWO pwo, Object[] objArr, C64579PWd c64579PWd) {
        super("OkHttp %s ACK Settings", objArr);
        this.LJLJJL = pwo;
        this.LJLJJI = c64579PWd;
    }
}
