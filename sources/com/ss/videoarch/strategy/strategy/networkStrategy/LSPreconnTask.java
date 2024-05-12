package com.ss.videoarch.strategy.strategy.networkStrategy;

import X.C79312VAu;
import X.C79321VBd;
import X.VBD;
import X.VBE;
import X.VBK;

/* loaded from: classes15.dex */
public class LSPreconnTask implements Runnable {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final int LJLJJI;
    public final boolean LJLJJL;
    public final VBK LJLJJLL;

    private native int nativeConnect(String str, String str2, int i, String str3, boolean z);

    public final void LIZ() {
        int nativeConnect = nativeConnect(this.LJLIL, this.LJLILLLLZI, this.LJLJJI, this.LJLJI, this.LJLJJL);
        VBK vbk = this.LJLJJLL;
        if (vbk != null) {
            String str = this.LJLIL;
            String str2 = this.LJLILLLLZI;
            VBE vbe = (VBE) vbk;
            synchronized (C79321VBd.class) {
                C79321VBd c79321VBd = vbe.LIZ;
                if (!c79321VBd.LIZLLL && nativeConnect == 0) {
                    c79321VBd.LIZLLL = true;
                }
                C79312VAu c79312VAu = c79321VBd.LJII;
                if (c79312VAu != null) {
                    c79312VAu.LIZ(new VBD(str, str2, nativeConnect));
                }
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

    public LSPreconnTask(VBE vbe, String str, String str2, String str3, boolean z) {
        this.LJLIL = "";
        this.LJLILLLLZI = "";
        this.LJLJI = "";
        this.LJLJJI = -1;
        this.LJLJJL = true;
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = 80;
        this.LJLJJL = z;
        this.LJLJJLL = vbe;
    }
}
