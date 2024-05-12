package Y;

import X.C70922qO;
import X.C71042qa;
import X.C71052qb;
import X.C71082qe;
import X.C76800UCe;
import X.C90459Zep;
import X.InterfaceC64672gJ;
import X.InterfaceC67352kd;
import android.view.View;
import com.ss.android.ugc.aweme.casting.ui.playback.feed.InteractInfoTVCastAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AqS148S0200000_1;

/* loaded from: classes2.dex */
public class IDfS21S0200000_1 implements InterfaceC64672gJ {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC64672gJ
    public final Object emit(Boolean bool, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        switch (this.$t) {
            case 0:
                return emit$0(this, bool, interfaceC67352kd);
            case 1:
                return emit$1(this, bool, interfaceC67352kd);
            case 2:
                return emit$2(this, bool, interfaceC67352kd);
            case 3:
                return emit$3(this, bool, interfaceC67352kd);
            default:
                return null;
        }
    }

    public IDfS21S0200000_1(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final Object emit$0(IDfS21S0200000_1 iDfS21S0200000_1, Object obj, InterfaceC67352kd interfaceC67352kd) {
        if (((Boolean) obj).booleanValue()) {
            C90459Zep c90459Zep = ((C71052qb) iDfS21S0200000_1.l0).LIZIZ;
            if (c90459Zep != null) {
                c90459Zep.LJIILJJIL();
            }
        } else {
            C71052qb c71052qb = (C71052qb) iDfS21S0200000_1.l0;
            AqS148S0200000_1 aqS148S0200000_1 = new AqS148S0200000_1(c71052qb, (Aweme) iDfS21S0200000_1.l1, 8);
            c71052qb.getClass();
            C71052qb.LJIIL(aqS148S0200000_1);
            C70922qO.LIZ("CastingManager", "startBrowseService initSDK fail");
        }
        return C76800UCe.LIZ;
    }

    public static final Object emit$1(IDfS21S0200000_1 iDfS21S0200000_1, Object obj, InterfaceC67352kd interfaceC67352kd) {
        C71082qe c71082qe;
        if (((Boolean) obj).booleanValue() && (c71082qe = C71042qa.LIZIZ) != null) {
            ((InteractInfoTVCastAssem) iDfS21S0200000_1.l0).q4((View) iDfS21S0200000_1.l1, c71082qe);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$2(Y.IDfS21S0200000_1 r13, java.lang.Object r14, X.InterfaceC67352kd r15) {
        /*
            boolean r0 = r15 instanceof X.C3F8
            if (r0 == 0) goto L6c
            r10 = r15
            X.3F8 r10 = (X.C3F8) r10
            int r2 = r10.LJLILLLLZI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6c
            int r2 = r2 - r1
            r10.LJLILLLLZI = r2
        L12:
            java.lang.Object r1 = r10.LJLIL
            X.NAu r9 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r10.LJLILLLLZI
            r11 = 1
            if (r0 == 0) goto L23
            if (r0 != r11) goto L72
            X.C141335gf.LIZJ(r1)
        L20:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L23:
            X.C141335gf.LIZJ(r1)
            java.lang.Object r8 = r13.l0
            X.2gJ r8 = (X.InterfaceC64672gJ) r8
            java.util.List r14 = (java.util.List) r14
            java.lang.Object r0 = r13.l1
            X.2tw r0 = (X.C73122tw) r0
            java.util.List<java.lang.Long> r0 = r0.LIZ
            java.util.Iterator r13 = r0.iterator()
        L36:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L63
            java.lang.Object r0 = r13.next()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            java.util.List r12 = X.ORZ.LLJILJILJ(r14)
            long r6 = java.lang.Math.abs(r0)
            int r5 = r14.size()
            r4 = 0
        L54:
            if (r4 >= r5) goto L61
            int r3 = r4 + 1
            long r0 = (long) r3
            long r1 = r6 % r0
            int r0 = (int) r1
            java.util.Collections.swap(r12, r4, r0)
            r4 = r3
            goto L54
        L61:
            r14 = r12
            goto L36
        L63:
            r10.LJLILLLLZI = r11
            java.lang.Object r0 = r8.emit(r14, r10)
            if (r0 != r9) goto L20
            return r9
        L6c:
            X.3F8 r10 = new X.3F8
            r10.<init>(r13, r15)
            goto L12
        L72:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDfS21S0200000_1.emit$2(Y.IDfS21S0200000_1, java.lang.Object, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$3(Y.IDfS21S0200000_1 r5, java.lang.Object r6, X.InterfaceC67352kd r7) {
        /*
            boolean r0 = r7 instanceof X.C3BK
            if (r0 == 0) goto L47
            r4 = r7
            X.3BK r4 = (X.C3BK) r4
            int r2 = r4.LJLILLLLZI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L47
            int r2 = r2 - r1
            r4.LJLILLLLZI = r2
        L12:
            java.lang.Object r1 = r4.LJLIL
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLILLLLZI
            r2 = 1
            if (r0 == 0) goto L23
            if (r0 != r2) goto L4d
            X.C141335gf.LIZJ(r1)
        L20:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L23:
            X.C141335gf.LIZJ(r1)
            java.lang.Number r6 = (java.lang.Number) r6
            int r0 = r6.intValue()
            if (r0 <= 0) goto L20
            java.lang.Object r1 = r5.l0
            X.34K r1 = (X.C34K) r1
            boolean r0 = r1.element
            if (r0 != 0) goto L20
            r1.element = r2
            java.lang.Object r1 = r5.l1
            X.2gJ r1 = (X.InterfaceC64672gJ) r1
            X.3BM r0 = X.C3BM.START
            r4.LJLILLLLZI = r2
            java.lang.Object r0 = r1.emit(r0, r4)
            if (r0 != r3) goto L20
            return r3
        L47:
            X.3BK r4 = new X.3BK
            r4.<init>(r5, r7)
            goto L12
        L4d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDfS21S0200000_1.emit$3(Y.IDfS21S0200000_1, java.lang.Object, X.2kd):java.lang.Object");
    }
}
