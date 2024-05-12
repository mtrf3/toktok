package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.play.core.appupdate.u;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.27m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C533427m extends C11V implements InterfaceC44261oU, InterfaceC37501da, InterfaceC23370vt {
    public final InterfaceC015404g LJLILLLLZI;
    public final /* synthetic */ InterfaceC23370vt LJLJI;
    public C11H LJLJJI;
    public final C25710zf<C44251oT<?>> LJLJJL;
    public final C25710zf<C44251oT<?>> LJLJJLL;
    public C11H LJLJL;
    public long LJLJLJ;
    public InterfaceC70422pa LJLJLLL;

    @Override // X.InterfaceC07790Sh
    public final /* synthetic */ boolean I(InterfaceC88472Yns interfaceC88472Yns) {
        return C48263Iwt.LIZ(this, interfaceC88472Yns);
    }

    @Override // X.InterfaceC23370vt
    public final long LJIJ(long j) {
        return this.LJLJI.LJIJ(j);
    }

    @Override // X.InterfaceC23370vt
    public final int LJJIJ(float f) {
        return this.LJLJI.LJJIJ(f);
    }

    @Override // X.InterfaceC23370vt
    public final float LJJIJL(long j) {
        return this.LJLJI.LJJIJL(j);
    }

    @Override // X.InterfaceC23370vt
    public final float LJJJJI() {
        return this.LJLJI.LJJJJI();
    }

    @Override // X.InterfaceC23370vt
    public final float LJJJJIZL(float f) {
        return this.LJLJI.LJJJJIZL(f);
    }

    @Override // X.InterfaceC23370vt
    public final float LJJJLL(int i) {
        return this.LJLJI.LJJJLL(i);
    }

    @Override // X.InterfaceC23370vt
    public final float LJJJLZIJ(float f) {
        return this.LJLJI.LJJJLZIJ(f);
    }

    @Override // X.InterfaceC23370vt
    public final long LJJLI(long j) {
        return this.LJLJI.LJJLI(j);
    }

    @Override // X.InterfaceC07790Sh
    public final /* synthetic */ InterfaceC07790Sh LLLIIIL(InterfaceC07790Sh interfaceC07790Sh) {
        return C07780Sg.LIZ(this, interfaceC07790Sh);
    }

    @Override // X.InterfaceC23370vt
    public final float getDensity() {
        return this.LJLJI.getDensity();
    }

    @Override // X.InterfaceC44261oU
    public final C11V p() {
        return this;
    }

    @Override // X.C11V
    public final void LIZLLL() {
        float f;
        C11H c11h = this.LJLJL;
        if (c11h == null) {
            return;
        }
        List<C11P> list = c11h.LIZ;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!(true ^ ((C11P) ListProtector.get(list, i)).LIZLLL)) {
                List<C11P> list2 = c11h.LIZ;
                ArrayList arrayList = new ArrayList(list2.size());
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    C11P c11p = (C11P) ListProtector.get(list2, i2);
                    long j = c11p.LIZ;
                    long j2 = c11p.LIZJ;
                    long j3 = c11p.LIZIZ;
                    Float f2 = c11p.LJIIIZ;
                    if (f2 != null) {
                        f = f2.floatValue();
                    } else {
                        f = 0.0f;
                    }
                    long j4 = c11p.LIZJ;
                    long j5 = c11p.LIZIZ;
                    boolean z = c11p.LIZLLL;
                    arrayList.add(new C11P(j, j3, j2, false, f, j5, j4, z, z, 1, C10370av.LIZIZ));
                }
                C11H c11h2 = new C11H(arrayList);
                this.LJLJJI = c11h2;
                LJJIJIL(c11h2, C11I.Initial);
                LJJIJIL(c11h2, C11I.Main);
                LJJIJIL(c11h2, C11I.Final);
                this.LJLJL = null;
                return;
            }
        }
    }

    public C533427m(InterfaceC015404g viewConfiguration, InterfaceC23370vt density) {
        o.LJIIIZ(viewConfiguration, "viewConfiguration");
        o.LJIIIZ(density, "density");
        this.LJLILLLLZI = viewConfiguration;
        this.LJLJI = density;
        this.LJLJJI = C11F.LIZ;
        this.LJLJJL = new C25710zf<>(new C44251oT[16]);
        this.LJLJJLL = new C25710zf<>(new C44251oT[16]);
        this.LJLJLJ = 0L;
        this.LJLJLLL = C780334l.LJLIL;
    }

    @Override // X.InterfaceC37501da
    public final <R> Object LJIJJLI(InterfaceC88471Ynr<? super InterfaceC37471dX, ? super InterfaceC67352kd<? super R>, ? extends Object> interfaceC88471Ynr, InterfaceC67352kd<? super R> interfaceC67352kd) {
        XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
        xks.LJIIL();
        C44251oT c44251oT = new C44251oT(this, xks);
        synchronized (this.LJLJJL) {
            this.LJLJJL.LIZLLL(c44251oT);
            C84654XKg c84654XKg = new C84654XKg(EnumC58928NAu.COROUTINE_SUSPENDED, C78555UsJ.LJJII(C78555UsJ.LJIILIIL(interfaceC88471Ynr, c44251oT, c44251oT)));
            C76800UCe c76800UCe = C76800UCe.LIZ;
            C3C5.m7constructorimpl(c76800UCe);
            c84654XKg.resumeWith(c76800UCe);
        }
        xks.LJIILIIL(new IDqS416S0100000(c44251oT, 343));
        return xks.LJIIJJI();
    }

    public final void LJJIJIL(C11H c11h, C11I c11i) {
        C25710zf<C44251oT<?>> c25710zf;
        int i;
        synchronized (this.LJLJJL) {
            C25710zf<C44251oT<?>> c25710zf2 = this.LJLJJLL;
            c25710zf2.LJ(c25710zf2.LJLJI, this.LJLJJL);
        }
        try {
            int i2 = C11C.LIZ[c11i.ordinal()];
            if (i2 == 1 || i2 == 2) {
                C25710zf<C44251oT<?>> c25710zf3 = this.LJLJJLL;
                int i3 = c25710zf3.LJLJI;
                if (i3 > 0) {
                    C44251oT<?>[] c44251oTArr = c25710zf3.LJLIL;
                    o.LJII(c44251oTArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                    int i4 = 0;
                    do {
                        c44251oTArr[i4].LJI(c11h, c11i);
                        i4++;
                    } while (i4 < i3);
                }
            } else if (i2 == 3 && (i = (c25710zf = this.LJLJJLL).LJLJI) > 0) {
                int i5 = i - 1;
                C44251oT<?>[] c44251oTArr2 = c25710zf.LJLIL;
                o.LJII(c44251oTArr2, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                do {
                    c44251oTArr2[i5].LJI(c11h, c11i);
                    i5--;
                } while (i5 >= 0);
            }
        } finally {
            this.LJLJJLL.LJII();
        }
    }

    @Override // X.InterfaceC07790Sh
    public final Object LLLZLZ(Object obj, InterfaceC88471Ynr operation) {
        o.LJIIIZ(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // X.C11V
    public final void LJJIIZ(C11H c11h, C11I pass, long j) {
        o.LJIIIZ(pass, "pass");
        this.LJLJLJ = j;
        if (pass == C11I.Initial) {
            this.LJLJJI = c11h;
        }
        LJJIJIL(c11h, pass);
        List<C11P> list = c11h.LIZ;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i < size) {
                if (!u.LIZIZ((C11P) ListProtector.get(list, i))) {
                    break;
                } else {
                    i++;
                }
            } else {
                c11h = null;
                break;
            }
        }
        this.LJLJL = c11h;
    }
}
