package X;

import android.content.Context;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS5S0600000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.V5a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79162V5a {
    public static final TextView LIZJ(InterfaceC35811ar<TextView> interfaceC35811ar) {
        return interfaceC35811ar.getValue();
    }

    public static final void LIZIZ(V6O<?> pagingLazyState, C1QP state, InterfaceC07790Sh interfaceC07790Sh, InterfaceC65784Pro<C76800UCe> onLoadMore, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        InterfaceC07790Sh interfaceC07790Sh2 = interfaceC07790Sh;
        o.LJIIIZ(pagingLazyState, "pagingLazyState");
        o.LJIIIZ(state, "state");
        o.LJIIIZ(onLoadMore, "onLoadMore");
        C35931b3 LJIL = interfaceC24520xk.LJIL(-1192969981);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (LJIL.LJIJJ(pagingLazyState)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (LJIL.LJIJJ(state)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (LJIL.LJIJJ(interfaceC07790Sh2)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (LJIL.LJIJJ(onLoadMore)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i3 & 5851) != 1170 || !LJIL.LIZ()) {
            if (i8 != 0) {
                interfaceC07790Sh2 = InterfaceC07790Sh.LJJJI;
            }
            Context context = (Context) LJIL.LJIILLIIL(C04Q.LIZJ);
            LJIL.LJJIIJ(-492369756);
            Object LJJJZ = LJIL.LJJJZ();
            InterfaceC24520xk.LIZ.getClass();
            C24490xh c24490xh = C24500xi.LIZIZ;
            if (LJJJZ == c24490xh) {
                LJJJZ = C78966Uyw.LJJJIL(null);
                LJIL.LJLJLLL(LJJJZ);
            }
            LJIL.LJJJJJ(false);
            InterfaceC35811ar interfaceC35811ar = (InterfaceC35811ar) LJJJZ;
            Boolean bool = Boolean.TRUE;
            int i9 = i3 >> 3;
            LJIL.LJJIIJ(511388516);
            boolean LJIJJ = LJIL.LJIJJ(state) | LJIL.LJIJJ(interfaceC35811ar);
            Object LJJJZ2 = LJIL.LJJJZ();
            if (LJIJJ || LJJJZ2 == c24490xh) {
                LJJJZ2 = new C79180V5s(state, interfaceC35811ar, null);
                LJIL.LJLJLLL(LJJJZ2);
            }
            LJIL.LJJJJJ(false);
            C24610xt.LJ(bool, (InterfaceC88471Ynr) LJJJZ2, LJIL);
            LJIL.LJJIIJ(-492369756);
            Object LJJJZ3 = LJIL.LJJJZ();
            if (LJJJZ3 == c24490xh) {
                LJJJZ3 = C78966Uyw.LJJJIL(C16880lQ.LLLZIIL(R.layout.dsq, C16880lQ.LLZIL(context), null));
                LJIL.LJLJLLL(LJJJZ3);
            }
            LJIL.LJJJJJ(false);
            InterfaceC35811ar interfaceC35811ar2 = (InterfaceC35811ar) LJJJZ3;
            LJIL.LJJIIJ(-492369756);
            Object LJJJZ4 = LJIL.LJJJZ();
            if (LJJJZ4 == c24490xh) {
                LJJJZ4 = C78966Uyw.LJJJIL(new C223338pd(context, null, 6));
                LJIL.LJLJLLL(LJJJZ4);
            }
            LJIL.LJJJJJ(false);
            C24920yO.LIZ(C79189V6b.LJLJL, interfaceC07790Sh2, new AqS5S0600000_13(context, (Context) onLoadMore, (InterfaceC65784Pro<C76800UCe>) pagingLazyState, (V6O<?>) interfaceC35811ar, (InterfaceC35811ar<V6V>) interfaceC35811ar2, (InterfaceC35811ar<TextView>) LJJJZ4, (InterfaceC35811ar<C223338pd>) 1), LJIL, i9 & 112, 0);
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C73980T1s(pagingLazyState, state, interfaceC07790Sh2, onLoadMore, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0345, code lost:
    
        if (r2 == X.C24500xi.LIZIZ) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0065, code lost:
    
        if (r3 == X.C24500xi.LIZIZ) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(X.C9QW r37, boolean r38, X.InterfaceC65784Pro<X.C76800UCe> r39, X.InterfaceC07790Sh r40, X.InterfaceC65784Pro<X.C76800UCe> r41, X.InterfaceC24520xk r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 920
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79162V5a.LIZ(X.9QW, boolean, X.Pro, X.0Sh, X.Pro, X.0xk, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0174, code lost:
    
        if (r2 == X.C24500xi.LIZIZ) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZLLL(com.ss.android.ugc.aweme.viewmodel.MentionFavoriteVideoVM r39, X.InterfaceC65784Pro<X.C76800UCe> r40, X.InterfaceC65784Pro<X.C76800UCe> r41, X.InterfaceC07790Sh r42, X.InterfaceC65784Pro<X.C76800UCe> r43, X.InterfaceC24520xk r44, int r45, int r46) {
        /*
            Method dump skipped, instructions count: 1034
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79162V5a.LIZLLL(com.ss.android.ugc.aweme.viewmodel.MentionFavoriteVideoVM, X.Pro, X.Pro, X.0Sh, X.Pro, X.0xk, int, int):void");
    }
}
