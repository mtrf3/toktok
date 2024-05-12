package X;

import com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility;

/* renamed from: X.LQy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC54252LQy implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ LR0 LJLJJI;

    public RunnableC54252LQy(int i, int i2, int i3, LR0 lr0) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = i3;
        this.LJLJJI = lr0;
    }

    public final void LIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("showTabBadge exec ");
        LIZ.append(this.LJLIL);
        LIZ.append(' ');
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(' ');
        LIZ.append(this.LJLJI);
        C221018lt.LJFF("NCTBPManager", X1D.LIZIZ(LIZ));
        boolean z = true;
        this.LJLJJI.LJJI = true;
        if (C53765L8f.LJIIL("NOTIFICATION")) {
            this.LJLJJI.getClass();
            if (LR0.LJIILJJIL()) {
                LR0 lr0 = this.LJLJJI;
                if (lr0.LJJIJLIJ) {
                    LLQ LJIIIIZZ = lr0.LJIIIIZZ();
                    if (LJIIIIZZ != null) {
                        LJIIIIZZ.LJFF(this.LJLIL, this.LJLJJI.LJJIL, true);
                    }
                    this.LJLJJI.LJJIJLIJ = false;
                }
            }
            LLQ LJIIIIZZ2 = this.LJLJJI.LJIIIIZZ();
            if (LJIIIIZZ2 != null) {
                LJIIIIZZ2.LJ(this.LJLIL, this.LJLJJI.LJJIL);
            }
        }
        if (this.LJLIL == 0 && this.LJLILLLLZI > 0) {
            LLQ LJIIIIZZ3 = this.LJLJJI.LJIIIIZZ();
            if (LJIIIIZZ3 != null) {
                LJIIIIZZ3.LJJIJIIJIL(this.LJLJJI.LJJIL);
            }
        } else {
            LLQ LJIIIIZZ4 = this.LJLJJI.LJIIIIZZ();
            if (LJIIIIZZ4 != null) {
                LJIIIIZZ4.LJIILL(this.LJLJJI.LJJIL);
            }
        }
        LR0 lr02 = this.LJLJJI;
        if (lr02.LJJII || lr02.LJJIFFI) {
            int i = this.LJLIL;
            if (i <= 0 && this.LJLILLLLZI <= 0) {
                z = false;
            }
            LR4.LIZ(i, z);
        }
        LR0 lr03 = this.LJLJJI;
        int i2 = this.LJLIL;
        int i3 = this.LJLILLLLZI;
        lr03.getClass();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("handleTopIconCountIfNeed numCount = ");
        LIZ2.append(i2);
        LIZ2.append(", dotCount = ");
        LIZ2.append(i3);
        C221018lt.LJFF("NCTBPManager", X1D.LIZIZ(LIZ2));
        if (!C53765L8f.LJIIL(lr03.LJJIL)) {
            C221018lt.LJFF("NCTBPManager", "handleTopIconCountIfNeed perform");
            if (i2 > 0) {
                if (LR0.LJIILJJIL() && lr03.LJJIJLIJ) {
                    IMFToolBarAbility LJIIJJI = lr03.LJIIJJI();
                    if (LJIIJJI != null) {
                        LJIIJJI.Hq(i2, lr03.LJJIL);
                    }
                    lr03.LJJIJLIJ = false;
                } else {
                    IMFToolBarAbility LJIIJJI2 = lr03.LJIIJJI();
                    if (LJIIJJI2 != null) {
                        LJIIJJI2.S3(i2, lr03.LJJIL);
                    }
                }
                IMFToolBarAbility LJIIJJI3 = lr03.LJIIJJI();
                if (LJIIJJI3 != null) {
                    LJIIJJI3.LLJ(lr03.LJJIL);
                }
            } else if (i3 > 0) {
                IMFToolBarAbility LJIIJJI4 = lr03.LJIIJJI();
                if (LJIIJJI4 != null) {
                    LJIIJJI4.LLIZ(lr03.LJJIL);
                }
                IMFToolBarAbility LJIIJJI5 = lr03.LJIIJJI();
                if (LJIIJJI5 != null) {
                    LJIIJJI5.LLZLLIL(lr03.LJJIL);
                }
            } else {
                IMFToolBarAbility LJIIJJI6 = lr03.LJIIJJI();
                if (LJIIJJI6 != null) {
                    LJIIJJI6.LLIZ(lr03.LJJIL);
                }
                IMFToolBarAbility LJIIJJI7 = lr03.LJIIJJI();
                if (LJIIJJI7 != null) {
                    LJIIJJI7.LLJ(lr03.LJJIL);
                }
            }
        }
        this.LJLJJI.LIZLLL().onUnreadBadgeShow();
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
}
