package X;

import java.util.TimerTask;

/* renamed from: X.Ilo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47576Ilo extends TimerTask {
    public final /* synthetic */ C47581Ilt LJLIL;

    public final void LIZ() {
        int i;
        InterfaceC47100Ie8 interfaceC47100Ie8 = this.LJLIL.LJ;
        int i2 = -1;
        if (interfaceC47100Ie8 != null) {
            i = ((C47089Idx) interfaceC47100Ie8).LIZ.LJIJJLI.getNetworkType();
        } else {
            i = -1;
        }
        InterfaceC47100Ie8 interfaceC47100Ie82 = this.LJLIL.LJ;
        if (interfaceC47100Ie82 != null) {
            i2 = ((C47089Idx) interfaceC47100Ie82).LIZ.LJIJJLI.getNetworkRttMs();
        }
        C47906Ir8 LIZLLL = C47906Ir8.LIZLLL();
        String str = "unknown";
        if (LIZLLL.LIZ != 1000) {
            int i3 = LIZLLL.LIZIZ;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 == 4) {
                            str = "excellent";
                        }
                    } else {
                        str = "good";
                    }
                } else {
                    str = "medium";
                }
            } else {
                str = "weak";
            }
        }
        synchronized (this) {
            if (this.LJLIL.LIZ.size() >= this.LJLIL.LJII) {
                this.LJLIL.LIZ.remove(0);
                this.LJLIL.LIZIZ.remove(0);
                this.LJLIL.LIZJ.remove(0);
            }
            this.LJLIL.LIZ.add(Integer.valueOf(i));
            this.LJLIL.LIZIZ.add(Integer.valueOf(i2));
            this.LJLIL.LIZJ.add(str);
        }
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public C47576Ilo(C47581Ilt c47581Ilt) {
        this.LJLIL = c47581Ilt;
    }
}
