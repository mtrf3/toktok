package X;

import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WG6 implements Runnable {
    public final /* synthetic */ WG7 LJLIL;
    public final /* synthetic */ float LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    public WG6(WG7 wg7, float f, boolean z) {
        this.LJLIL = wg7;
        this.LJLILLLLZI = f;
        this.LJLJI = z;
    }

    public final void LIZ() {
        WG9 wg9 = this.LJLIL.LLLF;
        if (wg9 != null) {
            int startX = wg9.getStartX();
            if (this.LJLIL.LLLF != null) {
                int viewWidth = (int) (r0.getViewWidth() * this.LJLILLLLZI);
                int width = (this.LJLIL.getWidth() - this.LJLIL.getPaddingStart()) - this.LJLIL.getPaddingEnd();
                if (this.LJLJI) {
                    WG9 wg92 = this.LJLIL.LLLF;
                    if (wg92 != null) {
                        if (wg92.getViewWidth() - viewWidth < width && width > 0) {
                            int width2 = viewWidth % this.LJLIL.getWidth();
                            this.LJLIL.getLayoutParams();
                            WG7 wg7 = this.LJLIL;
                            wg7.setPadding(wg7.getPaddingStart(), wg7.getPaddingTop(), width2, wg7.getPaddingBottom());
                        }
                    } else {
                        o.LJIJI("cutMusicView");
                        throw null;
                    }
                }
                this.LJLIL.scrollBy(viewWidth - startX, 0);
                return;
            }
            o.LJIJI("cutMusicView");
            throw null;
        }
        o.LJIJI("cutMusicView");
        throw null;
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
