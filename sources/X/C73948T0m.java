package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.T0m, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73948T0m extends AbstractC73945T0j {
    public final C73319Sq3 LJLIL;
    public final C73318Sq2 LJLILLLLZI;
    public final C73319Sq3 LJLJI;
    public final T13 LJLJJI;
    public volatile boolean LJLJJL;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        if (!this.LJLJJL) {
            this.LJLJJL = true;
            this.LJLJI.dispose();
        }
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLJJL;
    }

    public C73948T0m(T13 t13) {
        this.LJLJJI = t13;
        C73319Sq3 c73319Sq3 = new C73319Sq3();
        this.LJLIL = c73319Sq3;
        C73318Sq2 c73318Sq2 = new C73318Sq2();
        this.LJLILLLLZI = c73318Sq2;
        C73319Sq3 c73319Sq32 = new C73319Sq3();
        this.LJLJI = c73319Sq32;
        c73319Sq32.LIZ(c73319Sq3);
        c73319Sq32.LIZ(c73318Sq2);
    }

    @Override // X.AbstractC73945T0j
    public final InterfaceC92693kP LIZIZ(Runnable runnable) {
        if (this.LJLJJL) {
            return EnumC73538Sta.INSTANCE;
        }
        return this.LJLJJI.LJ(runnable, 0L, TimeUnit.MILLISECONDS, this.LJLIL);
    }

    @Override // X.AbstractC73945T0j
    public final InterfaceC92693kP LIZJ(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.LJLJJL) {
            return EnumC73538Sta.INSTANCE;
        }
        return this.LJLJJI.LJ(runnable, j, timeUnit, this.LJLILLLLZI);
    }
}
