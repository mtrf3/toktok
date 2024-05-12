package X;

import android.content.Context;
import androidx.lifecycle.LifecycleCoroutineScope;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class W36 implements C0C3 {
    public static final int LJLJJLL = O6R.LJJIIZ(C32151Nz.LJIIZILJ(75));
    public final C80766Vms LJLIL;
    public final Context LJLILLLLZI;
    public final InterfaceC70422pa LJLJI;
    public W34 LJLJJI;
    public XKQ LJLJJL;

    @Override // X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC67352kd<? super X.C76800UCe> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof X.W38
            if (r0 == 0) goto La5
            r4 = r13
            X.W38 r4 = (X.W38) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La5
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r1 = r4.LJLILLLLZI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJI
            r7 = 0
            java.lang.String r2 = "<set-?>"
            r11 = 0
            r6 = 3
            r9 = 2
            r5 = 1
            java.lang.String r10 = "scroller"
            if (r0 == 0) goto L42
            if (r0 == r5) goto L3c
            if (r0 == r9) goto L83
            if (r0 != r6) goto Lb0
            X.W36 r5 = r4.LJLIL
            X.C141335gf.LIZJ(r1)
        L2e:
            X.W34 r1 = r5.LJLJJI
            if (r1 == 0) goto Lac
            X.W39 r0 = X.W39.IDLE
            kotlin.jvm.internal.o.LJIIIZ(r0, r2)
            r1.LIZ = r0
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L3c:
            X.W36 r5 = r4.LJLIL
            X.C141335gf.LIZJ(r1)
            goto L5e
        L42:
            X.C141335gf.LIZJ(r1)
            X.W34 r1 = r12.LJLJJI
            if (r1 == 0) goto Lbc
            X.W39 r0 = X.W39.ANIMATING_IN
            kotlin.jvm.internal.o.LJIIIZ(r0, r2)
            r1.LIZ = r0
            r4.LJLIL = r12
            r4.LJLJJI = r5
            r0 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r0 = X.C1JD.LIZJ(r0, r4)
            if (r0 != r3) goto L5d
            return r3
        L5d:
            r5 = r12
        L5e:
            r5.getClass()
            X.C150745vq.LIZIZ()
            X.Vms r8 = r5.LJLIL
            int r1 = X.W36.LJLJJLL
            boolean r0 = r8.LJJIJL()
            if (r0 == 0) goto L7f
            int r0 = -r1
            r8.LJJIJIIJI(r0, r7)
        L72:
            r4.LJLIL = r5
            r4.LJLJJI = r9
            r0 = 1200(0x4b0, double:5.93E-321)
            java.lang.Object r0 = X.C1JD.LIZJ(r0, r4)
            if (r0 != r3) goto L88
            return r3
        L7f:
            r8.LJJIJIIJI(r1, r7)
            goto L72
        L83:
            X.W36 r5 = r4.LJLIL
            X.C141335gf.LIZJ(r1)
        L88:
            X.W34 r1 = r5.LJLJJI
            if (r1 == 0) goto Lb8
            X.W39 r0 = X.W39.ANIMATING_OUT
            kotlin.jvm.internal.o.LJIIIZ(r0, r2)
            r1.LIZ = r0
            X.Vms r0 = r5.LJLIL
            r0.LJJIJIIJI(r7, r7)
            r4.LJLIL = r5
            r4.LJLJJI = r6
            r0 = 400(0x190, double:1.976E-321)
            java.lang.Object r0 = X.C1JD.LIZJ(r0, r4)
            if (r0 != r3) goto L2e
            return r3
        La5:
            X.W38 r4 = new X.W38
            r4.<init>(r12, r13)
            goto L12
        Lac:
            kotlin.jvm.internal.o.LJIJI(r10)
            throw r11
        Lb0:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lb8:
            kotlin.jvm.internal.o.LJIJI(r10)
            throw r11
        Lbc:
            kotlin.jvm.internal.o.LJIJI(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W36.LIZ(X.2kd):java.lang.Object");
    }

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
        if (i == 1) {
            XKQ xkq = this.LJLJJL;
            if (xkq != null) {
                xkq.LIZIZ(null);
            }
            W34 w34 = this.LJLJJI;
            if (w34 != null) {
                W39 w39 = W39.IDLE;
                o.LJIIIZ(w39, "<set-?>");
                w34.LIZ = w39;
                return;
            }
            o.LJIJI("scroller");
            throw null;
        }
    }

    public W36(C152175y9 viewPager, Context context, LifecycleCoroutineScope scope) {
        o.LJIIIZ(viewPager, "viewPager");
        o.LJIIIZ(scope, "scope");
        this.LJLIL = viewPager;
        this.LJLILLLLZI = context;
        this.LJLJI = scope;
    }
}
