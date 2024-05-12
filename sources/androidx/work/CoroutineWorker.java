package androidx.work;

import X.C0CS;
import X.C0VT;
import X.C1NI;
import X.C2DL;
import X.C35591aV;
import X.C43731nd;
import X.C48841JEv;
import X.C537829e;
import X.C64962gm;
import X.C76L;
import X.C78613UtF;
import X.C79146V4k;
import X.C84673XKz;
import X.XIC;
import X.XKX;
import Y.IDRunnableS85S0100000;
import android.content.Context;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public abstract class CoroutineWorker extends ListenableWorker {
    public final C84673XKz LJLJJLL;
    public final C43731nd<C0CS> LJLJL;
    public final XIC LJLJLJ;

    public abstract Object LJII();

    @Override // androidx.work.ListenableWorker
    public final void LIZJ() {
        this.LJLJL.cancel(false);
    }

    @Override // androidx.work.ListenableWorker
    public final C43731nd LJ() {
        XKX.LIZLLL(C48841JEv.LIZ(this.LJLJLJ.plus(this.LJLJJLL)), null, null, new C2DL(this, null), 3);
        return this.LJLJL;
    }

    @Override // androidx.work.ListenableWorker
    public final C76L<C0VT> LIZ() {
        C84673XKz LJIILIIL = C79146V4k.LJIILIIL();
        C64962gm LIZ = C48841JEv.LIZ(this.LJLJLJ.plus(LJIILIIL));
        C1NI c1ni = new C1NI(LJIILIIL);
        XKX.LIZLLL(LIZ, null, null, new C537829e(c1ni, this, null), 3);
        return c1ni;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context appContext, WorkerParameters params) {
        super(appContext, params);
        o.LJIIIZ(appContext, "appContext");
        o.LJIIIZ(params, "params");
        this.LJLJJLL = C79146V4k.LJIILIIL();
        C43731nd<C0CS> c43731nd = new C43731nd<>();
        this.LJLJL = c43731nd;
        c43731nd.LJFF(new IDRunnableS85S0100000(this, 34), ((C35591aV) this.LJLILLLLZI.LIZLLL).LIZ);
        this.LJLJLJ = C78613UtF.LIZ;
    }
}
