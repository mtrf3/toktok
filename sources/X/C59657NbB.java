package X;

import com.ss.android.ugc.aweme.bullet.module.base.CommonBizWebChromeDelegate;
import kotlin.jvm.internal.o;

/* renamed from: X.NbB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59657NbB implements InterfaceC60257Nkr {
    public final /* synthetic */ C40489Fun LIZ;
    public final /* synthetic */ F3T LIZIZ;
    public final /* synthetic */ C59451NUx LIZJ;

    @Override // X.InterfaceC60257Nkr
    public final InterfaceC48694J9e LJI() {
        return null;
    }

    @Override // X.InterfaceC60281NlF
    public final FCR LJIIIIZZ(F3T providerFactory) {
        o.LJIIIZ(providerFactory, "providerFactory");
        return null;
    }

    @Override // X.InterfaceC60257Nkr
    public final InterfaceC59659NbD LJFF() {
        return new C59656NbA(this.LIZJ);
    }

    @Override // X.InterfaceC60257Nkr
    public final C59458NVe LJII() {
        C40489Fun c40489Fun = this.LIZ;
        F3T ctx = this.LIZIZ;
        NUT biz = this.LIZJ.LJLILLLLZI;
        c40489Fun.getClass();
        o.LJIIIZ(ctx, "ctx");
        o.LJIIIZ(biz, "biz");
        return new NUP(ctx, biz);
    }

    @Override // X.InterfaceC60257Nkr
    public final C59827Ndv LJIIIZ() {
        C40489Fun c40489Fun = this.LIZ;
        F3T ctx = this.LIZIZ;
        NUT biz = this.LIZJ.LJLILLLLZI;
        c40489Fun.getClass();
        o.LJIIIZ(ctx, "ctx");
        o.LJIIIZ(biz, "biz");
        return new CommonBizWebChromeDelegate(ctx, biz);
    }

    public C59657NbB(C40489Fun c40489Fun, F3T f3t, C59451NUx c59451NUx) {
        this.LIZ = c40489Fun;
        this.LIZIZ = f3t;
        this.LIZJ = c59451NUx;
    }
}
