package X;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Fve, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40542Fve implements InterfaceC38394F5a {
    public static final long LJIILIIL = TimeUnit.SECONDS.toMillis(1);
    public static final /* synthetic */ int LJIILJJIL = 0;
    public final Handler LIZ;
    public final Context LIZIZ;
    public final C37109EhN LIZJ;
    public final C40545Fvh LIZLLL;
    public final C74127T7j LJ;
    public final C74127T7j LJFF;
    public final Executor LJI;
    public final EnumC39661FhR LJII;
    public final File LJIIIIZZ;
    public final AtomicReference<AbstractC40550Fvm> LJIIIZ;
    public final java.util.Set<String> LJIIJ;
    public final java.util.Set<String> LJIIJJI;
    public final AtomicBoolean LJIIL;

    @Override // X.InterfaceC38394F5a
    public final boolean LIZLLL(AbstractC40550Fvm abstractC40550Fvm, Activity activity, int i) {
        return false;
    }

    @Override // X.InterfaceC38394F5a
    public final java.util.Set<String> LJ() {
        HashSet hashSet = new HashSet();
        if (this.LIZJ.LIZIZ() != null) {
            hashSet.addAll(this.LIZJ.LIZIZ());
        }
        hashSet.addAll(this.LJIIJJI);
        return hashSet;
    }

    @Override // X.InterfaceC38394F5a
    public final java.util.Set<String> getInstalledModules() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.LIZJ.LIZ());
        hashSet.addAll(this.LJIIJ);
        return hashSet;
    }

    @Override // X.InterfaceC38394F5a
    public final void LIZ() {
        C37102EhG c37102EhG = C37102EhG.LIZ;
        C74127T7j c74127T7j = this.LJFF;
        synchronized (c74127T7j) {
            ((HashSet) c74127T7j.LIZ).add(c37102EhG);
        }
    }

    @Override // X.InterfaceC38394F5a
    public final C40561Fvx LIZIZ(final int i) {
        try {
            AbstractC40550Fvm LJFF = LJFF(new InterfaceC40548Fvk(i) { // from class: X.Fvg
                public final int LIZ;

                {
                    this.LIZ = i;
                }

                @Override // X.InterfaceC40548Fvk
                public final C40549Fvl LIZ(AbstractC40550Fvm abstractC40550Fvm) {
                    int LJIIJJI;
                    int i2 = this.LIZ;
                    if (abstractC40550Fvm != null && i2 == abstractC40550Fvm.LJIIJ() && ((LJIIJJI = abstractC40550Fvm.LJIIJJI()) == 1 || LJIIJJI == 2 || LJIIJJI == 8 || LJIIJJI == 9 || LJIIJJI == 7)) {
                        return AbstractC40550Fvm.LJ(i2, 7, abstractC40550Fvm.LJI(), abstractC40550Fvm.LIZJ(), abstractC40550Fvm.LJIIL(), abstractC40550Fvm.LJIIIIZZ(), abstractC40550Fvm.LJII());
                    }
                    throw new C35481DwD(-3);
                }
            });
            if (LJFF != null) {
                this.LIZ.post(new RunnableC40547Fvj(this, LJFF));
            }
            return C40560Fvw.LIZ(null);
        } catch (C35481DwD e) {
            C40561Fvx c40561Fvx = new C40561Fvx();
            synchronized (c40561Fvx.LIZ) {
                if (!c40561Fvx.LIZJ) {
                    c40561Fvx.LIZJ = true;
                    c40561Fvx.LJ = e;
                    c40561Fvx.LIZIZ.LIZ(c40561Fvx);
                    return c40561Fvx;
                }
                throw new IllegalStateException("Task is already complete");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x015a, code lost:
    
        if (r1.contains(r11) == false) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x024f: INVOKE (r0 I:X.Fvx) = (r2 I:X.Fve), (r0 I:int) VIRTUAL call: X.Fve.LJII(int):X.Fvx A[MD:(int):X.Fvx (m)] (LINE:16777807), block:B:106:0x024b */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r20v0, types: [X.Fve] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.Fve] */
    /* JADX WARN: Type inference failed for: r4v2, types: [ResultT, java.lang.Integer] */
    @Override // X.InterfaceC38394F5a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C40561Fvx LIZJ(X.C38398F5e r21) {
        /*
            Method dump skipped, instructions count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40542Fve.LIZJ(X.F5e):X.Fvx");
    }

    public final synchronized AbstractC40550Fvm LJFF(InterfaceC40548Fvk interfaceC40548Fvk) {
        C40549Fvl LIZ;
        boolean z;
        AbstractC40550Fvm abstractC40550Fvm = this.LJIIIZ.get();
        LIZ = interfaceC40548Fvk.LIZ(abstractC40550Fvm);
        AtomicReference<AbstractC40550Fvm> atomicReference = this.LJIIIZ;
        while (true) {
            if (!atomicReference.compareAndSet(abstractC40550Fvm, LIZ)) {
                if (atomicReference.get() != abstractC40550Fvm) {
                    z = false;
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        if (z) {
            return LIZ;
        }
        return null;
    }

    public final C40561Fvx LJII(final int i) {
        LJFF(new InterfaceC40548Fvk(i) { // from class: X.Fvi
            public final int LIZ;

            {
                this.LIZ = i;
            }

            @Override // X.InterfaceC40548Fvk
            public final C40549Fvl LIZ(AbstractC40550Fvm abstractC40550Fvm) {
                int i2 = this.LIZ;
                if (abstractC40550Fvm == null) {
                    return null;
                }
                return AbstractC40550Fvm.LJ(abstractC40550Fvm.LJIIJ(), 6, i2, abstractC40550Fvm.LIZJ(), abstractC40550Fvm.LJIIL(), abstractC40550Fvm.LJIIIIZZ(), abstractC40550Fvm.LJII());
            }
        });
        C35481DwD c35481DwD = new C35481DwD(i);
        C40561Fvx c40561Fvx = new C40561Fvx();
        synchronized (c40561Fvx.LIZ) {
            if (!c40561Fvx.LIZJ) {
                c40561Fvx.LIZJ = true;
                c40561Fvx.LJ = c35481DwD;
            } else {
                throw new IllegalStateException("Task is already complete");
            }
        }
        c40561Fvx.LIZIZ.LIZ(c40561Fvx);
        return c40561Fvx;
    }

    public C40542Fve(Context context, File file, C37109EhN c37109EhN) {
        Executor LJIIIZ = C78948Uye.LJIIIZ();
        C40545Fvh c40545Fvh = new C40545Fvh(context);
        this.LIZ = new Handler(C16880lQ.LLJJJJ());
        this.LJIIIZ = new AtomicReference<>();
        this.LJIIJ = Q4K.LIZLLL();
        this.LJIIJJI = Q4K.LIZLLL();
        this.LJIIL = new AtomicBoolean(false);
        this.LIZIZ = context;
        this.LJIIIIZZ = file;
        this.LIZJ = c37109EhN;
        this.LJI = LJIIIZ;
        this.LIZLLL = c40545Fvh;
        this.LJFF = new C74127T7j(0);
        this.LJ = new C74127T7j(0);
        this.LJII = EnumC39661FhR.a;
    }

    public final boolean LJI(final int i, final int i2, final Integer num, final Long l, final Long l2, final List list, final List list2) {
        AbstractC40550Fvm LJFF = LJFF(new InterfaceC40548Fvk(i, i2, num, l, l2, list, list2) { // from class: X.Fvf
            public final Integer LIZ;
            public final int LIZIZ;
            public final int LIZJ;
            public final Long LIZLLL;
            public final Long LJ;
            public final List LJFF;
            public final List LJI;

            {
                this.LIZ = num;
                this.LIZIZ = i;
                this.LIZJ = i2;
                this.LIZLLL = l;
                this.LJ = l2;
                this.LJFF = list;
                this.LJI = list2;
            }

            @Override // X.InterfaceC40548Fvk
            public final C40549Fvl LIZ(AbstractC40550Fvm abstractC40550Fvm) {
                int intValue;
                long longValue;
                long longValue2;
                Integer num2 = this.LIZ;
                int i3 = this.LIZIZ;
                int i4 = this.LIZJ;
                Long l3 = this.LIZLLL;
                Long l4 = this.LJ;
                List<String> list3 = this.LJFF;
                List<String> list4 = this.LJI;
                if (abstractC40550Fvm == null) {
                    abstractC40550Fvm = AbstractC40550Fvm.LJ(0, 0, 0, 0L, 0L, new ArrayList(), new ArrayList());
                }
                if (num2 == null) {
                    intValue = abstractC40550Fvm.LJIIJ();
                } else {
                    intValue = num2.intValue();
                }
                if (l3 == null) {
                    longValue = abstractC40550Fvm.LIZJ();
                } else {
                    longValue = l3.longValue();
                }
                if (l4 == null) {
                    longValue2 = abstractC40550Fvm.LJIIL();
                } else {
                    longValue2 = l4.longValue();
                }
                if (list3 == null) {
                    list3 = abstractC40550Fvm.LJIIIIZZ();
                }
                if (list4 == null) {
                    list4 = abstractC40550Fvm.LJII();
                }
                return AbstractC40550Fvm.LJ(intValue, i3, i4, longValue, longValue2, list3, list4);
            }
        });
        if (LJFF != null) {
            this.LIZ.post(new RunnableC40547Fvj(this, LJFF));
            return true;
        }
        return false;
    }
}
