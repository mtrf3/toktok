package Y;

import X.C36636EZk;
import X.C63272e3;
import X.C64492g1;
import X.C76800UCe;
import X.EnumC58928NAu;
import X.EnumC78982UzC;
import X.InterfaceC64672gJ;
import X.InterfaceC67352kd;
import X.XKX;
import android.content.Context;
import com.ss.android.ugc.aweme.audiomode.fullepisodev2.FullEpisodeDetailsViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* loaded from: classes2.dex */
public class IDfS12S0300000_1 implements InterfaceC64672gJ {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC64672gJ
    public final Object emit(C64492g1 c64492g1, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        switch (this.$t) {
            case 0:
                return emit$0(this, c64492g1, interfaceC67352kd);
            case 1:
                return emit$1(this, c64492g1, interfaceC67352kd);
            default:
                return null;
        }
    }

    public static final Object emit$0(IDfS12S0300000_1 iDfS12S0300000_1, Object obj, InterfaceC67352kd interfaceC67352kd) {
        Object LJI;
        C64492g1 c64492g1 = (C64492g1) obj;
        if (c64492g1 != null) {
            EnumC78982UzC enumC78982UzC = c64492g1.LIZ;
            EnumC78982UzC enumC78982UzC2 = EnumC78982UzC.Optimistic;
            if (enumC78982UzC != enumC78982UzC2) {
                ((FullEpisodeDetailsViewModel) iDfS12S0300000_1.l0).cancelTimer();
            }
            if (c64492g1.LIZIZ == null && c64492g1.LIZ == enumC78982UzC2 && (LJI = XKX.LJI(C36636EZk.LIZ, new C63272e3((FullEpisodeDetailsViewModel) iDfS12S0300000_1.l0, (Aweme) iDfS12S0300000_1.l1, (Context) iDfS12S0300000_1.l2, null), interfaceC67352kd)) == EnumC58928NAu.COROUTINE_SUSPENDED) {
                return LJI;
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$1(Y.IDfS12S0300000_1 r7, java.lang.Object r8, X.InterfaceC67352kd r9) {
        /*
            boolean r0 = r9 instanceof X.C3BQ
            if (r0 == 0) goto L7d
            r5 = r9
            X.3BQ r5 = (X.C3BQ) r5
            int r2 = r5.LJLILLLLZI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7d
            int r2 = r2 - r1
            r5.LJLILLLLZI = r2
        L12:
            java.lang.Object r6 = r5.LJLIL
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLILLLLZI
            r3 = 3
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L2d
            if (r0 == r1) goto L29
            if (r0 == r2) goto L56
            if (r0 != r3) goto L83
            X.C141335gf.LIZJ(r6)
        L26:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L29:
            X.C141335gf.LIZJ(r6)
            goto L26
        L2d:
            X.C141335gf.LIZJ(r6)
            java.lang.Object r0 = r7.l0
            X.34K r0 = (X.C34K) r0
            boolean r0 = r0.element
            if (r0 == 0) goto L45
            java.lang.Object r0 = r7.l1
            X.2gJ r0 = (X.InterfaceC64672gJ) r0
            r5.LJLILLLLZI = r1
            java.lang.Object r0 = r0.emit(r8, r5)
            if (r0 != r4) goto L26
            return r4
        L45:
            java.lang.Object r0 = r7.l2
            X.Ynr r0 = (X.InterfaceC88471Ynr) r0
            r5.LJLJJI = r7
            r5.LJLJJL = r8
            r5.LJLILLLLZI = r2
            java.lang.Object r6 = r0.invoke(r8, r5)
            if (r6 != r4) goto L5d
            return r4
        L56:
            java.lang.Object r8 = r5.LJLJJL
            Y.IDfS12S0300000_1 r7 = r5.LJLJJI
            X.C141335gf.LIZJ(r6)
        L5d:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r0 = r6.booleanValue()
            if (r0 != 0) goto L26
            java.lang.Object r0 = r7.l0
            X.34K r0 = (X.C34K) r0
            r0.element = r1
            java.lang.Object r1 = r7.l1
            X.2gJ r1 = (X.InterfaceC64672gJ) r1
            r0 = 0
            r5.LJLJJI = r0
            r5.LJLJJL = r0
            r5.LJLILLLLZI = r3
            java.lang.Object r0 = r1.emit(r8, r5)
            if (r0 != r4) goto L26
            return r4
        L7d:
            X.3BQ r5 = new X.3BQ
            r5.<init>(r7, r9)
            goto L12
        L83:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDfS12S0300000_1.emit$1(Y.IDfS12S0300000_1, java.lang.Object, X.2kd):java.lang.Object");
    }

    public IDfS12S0300000_1(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj3;
        this.l2 = obj;
    }
}
