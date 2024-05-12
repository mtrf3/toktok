package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KEH {
    public final C74053T4n LIZ;
    public final KOV LIZIZ;
    public final KEV LIZJ;
    public InterfaceC222788ok LIZLLL;
    public boolean LJ;

    public final void LIZ() {
        if (this.LIZ.getTabCount() > 0) {
            int tabCount = this.LIZ.getTabCount() - 1;
            int currentItem = this.LIZIZ.getCurrentItem();
            if (currentItem <= tabCount) {
                tabCount = currentItem;
            }
            if (tabCount != this.LIZ.getSelectedTabPosition()) {
                C74053T4n c74053T4n = this.LIZ;
                c74053T4n.LJIIJJI(c74053T4n.LJI(tabCount), true);
            }
        }
    }

    public final void LIZJ() {
        this.LIZ.LJIIIZ();
        InterfaceC222788ok interfaceC222788ok = this.LIZLLL;
        if (interfaceC222788ok != null) {
            int LJIIIIZZ = interfaceC222788ok.getState().LJIIIIZZ();
            for (int i = 0; i < LJIIIIZZ; i++) {
                KEI LJII = this.LIZ.LJII();
                this.LIZJ.LIZ(LJII, i);
                C74053T4n.LIZJ(this.LIZ, LJII, 0, false, 2);
            }
            if (LJIIIIZZ > 0) {
                int tabCount = this.LIZ.getTabCount() - 1;
                int currentItem = this.LIZIZ.getCurrentItem();
                if (currentItem <= tabCount) {
                    tabCount = currentItem;
                }
                if (tabCount != this.LIZ.getSelectedTabPosition()) {
                    C74053T4n c74053T4n = this.LIZ;
                    c74053T4n.LJIIJJI(c74053T4n.LJI(tabCount), true);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        if (r1 > r5) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(int r4, int r5) {
        /*
            r3 = this;
            if (r4 < 0) goto Lc
            X.T4n r0 = r3.LIZ
            int r0 = r0.getTabCount()
            if (r4 > r0) goto Lc
            if (r5 > 0) goto Ld
        Lc:
            return
        Ld:
            X.8ok r0 = r3.LIZLLL
            if (r0 != 0) goto L12
            return
        L12:
            X.Sho r0 = r0.getState()
            int r1 = r0.LJIIIIZZ()
            X.T4n r0 = r3.LIZ
            int r0 = r0.getTabCount()
            int r1 = r1 - r0
            r2 = 0
            if (r1 >= 0) goto L3c
            r1 = 0
        L25:
            r5 = r1
        L26:
            int r5 = r5 + r4
        L27:
            if (r4 >= r5) goto Lc
            X.T4n r0 = r3.LIZ
            X.KEI r1 = r0.LJII()
            X.KEV r0 = r3.LIZJ
            r0.LIZ(r1, r4)
            X.T4n r0 = r3.LIZ
            r0.LIZIZ(r1, r4, r2)
            int r4 = r4 + 1
            goto L27
        L3c:
            if (r1 <= r5) goto L25
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KEH.LIZIZ(int, int):void");
    }

    public final void LIZLLL(int i, int i2) {
        int i3;
        if (i < 0) {
            return;
        }
        while (i < this.LIZ.getTabCount() && i2 > 0) {
            C74053T4n c74053T4n = this.LIZ;
            KEI kei = c74053T4n.LJLJL;
            if (kei != null) {
                i3 = kei.LIZLLL;
            } else {
                i3 = 0;
            }
            c74053T4n.LJIIJ(i);
            Object remove = ListProtector.remove(c74053T4n.LJLJJLL, i);
            o.LJIIIIZZ(remove, "tabs.removeAt(position)");
            KEI kei2 = (KEI) remove;
            KEI kei3 = null;
            kei2.LJ = null;
            kei2.LJFF = null;
            kei2.LIZ = null;
            kei2.LIZIZ = null;
            kei2.LIZJ = null;
            kei2.LIZLLL = -1;
            C74053T4n.LLFZ.LIZ(kei2);
            int size = c74053T4n.LJLJJLL.size();
            for (int i4 = i; i4 < size; i4++) {
                ((KEI) ListProtector.get(c74053T4n.LJLJJLL, i4)).LIZLLL = i4;
            }
            if (i3 == i) {
                if (!c74053T4n.LJLJJLL.isEmpty()) {
                    kei3 = (KEI) ListProtector.get(c74053T4n.LJLJJLL, Math.max(0, i - 1));
                }
                c74053T4n.LJIIJJI(kei3, true);
            }
            i2--;
        }
    }

    public KEH(C74053T4n c74053T4n, KOV kov, C51364KDw c51364KDw) {
        this.LIZ = c74053T4n;
        this.LIZIZ = kov;
        this.LIZJ = c51364KDw;
    }
}
