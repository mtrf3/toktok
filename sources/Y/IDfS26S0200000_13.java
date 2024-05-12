package Y;

import X.C76800UCe;
import X.C77172UQm;
import X.C77173UQn;
import X.C77174UQo;
import X.C77175UQp;
import X.C77176UQq;
import X.C77216USe;
import X.EnumC77147UPn;
import X.InterfaceC64672gJ;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel;
import kotlin.jvm.internal.AqS144S0200000_13;

/* loaded from: classes14.dex */
public class IDfS26S0200000_13 implements InterfaceC64672gJ {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC64672gJ
    public final Object emit(C77216USe c77216USe, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        switch (this.$t) {
            case 0:
                return emit$0(this, c77216USe, interfaceC67352kd);
            case 1:
                return emit$1(this, c77216USe, interfaceC67352kd);
            case 2:
                return emit$2(this, c77216USe, interfaceC67352kd);
            case 3:
                return emit$3(this, c77216USe, interfaceC67352kd);
            case 4:
                return emit$4(this, c77216USe, interfaceC67352kd);
            case 5:
                return emit$5(this, c77216USe, interfaceC67352kd);
            default:
                return null;
        }
    }

    public IDfS26S0200000_13(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final Object emit$0(IDfS26S0200000_13 iDfS26S0200000_13, Object obj, InterfaceC67352kd interfaceC67352kd) {
        C77216USe c77216USe = (C77216USe) obj;
        int i = C77172UQm.LIZ[c77216USe.LJLILLLLZI.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    if (c77216USe.LJLIL.LJLJI) {
                        ((SocialRecRequestViewModel) iDfS26S0200000_13.l0).setState(C77175UQp.LJLIL);
                        SocialRecRequestViewModel socialRecRequestViewModel = (SocialRecRequestViewModel) iDfS26S0200000_13.l0;
                        socialRecRequestViewModel.setState(new AqS144S0200000_13((EnumC77147UPn) iDfS26S0200000_13.l1, socialRecRequestViewModel, 19));
                    } else {
                        ((SocialRecRequestViewModel) iDfS26S0200000_13.l0).setState(C77176UQq.LJLIL);
                    }
                }
            } else if (c77216USe.LJLIL.LJLJI) {
                SocialRecRequestViewModel socialRecRequestViewModel2 = (SocialRecRequestViewModel) iDfS26S0200000_13.l0;
                socialRecRequestViewModel2.setState(new AqS144S0200000_13((EnumC77147UPn) iDfS26S0200000_13.l1, socialRecRequestViewModel2, 18));
                ((SocialRecRequestViewModel) iDfS26S0200000_13.l0).LJLJL = true;
            } else {
                ((SocialRecRequestViewModel) iDfS26S0200000_13.l0).setState(C77174UQo.LJLIL);
            }
        } else if (!c77216USe.LJLIL.LJLJI) {
            ((SocialRecRequestViewModel) iDfS26S0200000_13.l0).setState(C77173UQn.LJLIL);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$1(Y.IDfS26S0200000_13 r7, java.lang.Object r8, X.InterfaceC67352kd r9) {
        /*
            boolean r0 = r9 instanceof X.C79059V1b
            if (r0 == 0) goto L4d
            r6 = r9
            X.V1b r6 = (X.C79059V1b) r6
            int r2 = r6.LJLILLLLZI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4d
            int r2 = r2 - r1
            r6.LJLILLLLZI = r2
        L12:
            java.lang.Object r1 = r6.LJLIL
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLILLLLZI
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L26
            if (r0 == r3) goto L3c
            if (r0 != r4) goto L53
            X.C141335gf.LIZJ(r1)
        L23:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L26:
            X.C141335gf.LIZJ(r1)
            java.lang.Object r2 = r7.l0
            X.2gJ r2 = (X.InterfaceC64672gJ) r2
            java.lang.Object r0 = r7.l1
            X.Ynr r0 = (X.InterfaceC88471Ynr) r0
            r6.LJLJI = r2
            r6.LJLILLLLZI = r3
            java.lang.Object r1 = r0.invoke(r8, r6)
            if (r1 != r5) goto L41
            return r5
        L3c:
            X.2gJ r2 = r6.LJLJI
            X.C141335gf.LIZJ(r1)
        L41:
            r0 = 0
            r6.LJLJI = r0
            r6.LJLILLLLZI = r4
            java.lang.Object r0 = r2.emit(r1, r6)
            if (r0 != r5) goto L23
            return r5
        L4d:
            X.V1b r6 = new X.V1b
            r6.<init>(r7, r9)
            goto L12
        L53:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDfS26S0200000_13.emit$1(Y.IDfS26S0200000_13, java.lang.Object, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$2(Y.IDfS26S0200000_13 r5, java.lang.Object r6, X.InterfaceC67352kd r7) {
        /*
            boolean r0 = r7 instanceof X.C79065V1h
            if (r0 == 0) goto L4c
            r4 = r7
            X.V1h r4 = (X.C79065V1h) r4
            int r2 = r4.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4c
            int r2 = r2 - r1
            r4.LJLJI = r2
        L12:
            java.lang.Object r3 = r4.LJLILLLLZI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJI
            r1 = 1
            if (r0 == 0) goto L38
            if (r0 != r1) goto L55
            java.lang.Object r6 = r4.LJLJJL
            Y.IDfS26S0200000_13 r5 = r4.LJLIL
            X.C141335gf.LIZJ(r3)
        L24:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r0 = r3.booleanValue()
            if (r0 == 0) goto L52
            java.lang.Object r0 = r5.l1
            X.2mC r0 = (X.C68322mC) r0
            r0.element = r6
            X.3CM r0 = new X.3CM
            r0.<init>(r5)
            throw r0
        L38:
            X.C141335gf.LIZJ(r3)
            java.lang.Object r0 = r5.l0
            X.Ynr r0 = (X.InterfaceC88471Ynr) r0
            r4.LJLIL = r5
            r4.LJLJJL = r6
            r4.LJLJI = r1
            java.lang.Object r3 = r0.invoke(r6, r4)
            if (r3 != r2) goto L24
            return r2
        L4c:
            X.V1h r4 = new X.V1h
            r4.<init>(r5, r7)
            goto L12
        L52:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L55:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDfS26S0200000_13.emit$2(Y.IDfS26S0200000_13, java.lang.Object, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$3(Y.IDfS26S0200000_13 r5, java.lang.Object r6, X.InterfaceC67352kd r7) {
        /*
            boolean r0 = r7 instanceof X.C79066V1i
            if (r0 == 0) goto L4c
            r4 = r7
            X.V1i r4 = (X.C79066V1i) r4
            int r2 = r4.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4c
            int r2 = r2 - r1
            r4.LJLJI = r2
        L12:
            java.lang.Object r3 = r4.LJLILLLLZI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJI
            r1 = 1
            if (r0 == 0) goto L38
            if (r0 != r1) goto L55
            java.lang.Object r6 = r4.LJLJJL
            Y.IDfS26S0200000_13 r5 = r4.LJLIL
            X.C141335gf.LIZJ(r3)
        L24:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r0 = r3.booleanValue()
            if (r0 == 0) goto L52
            java.lang.Object r0 = r5.l1
            X.2mC r0 = (X.C68322mC) r0
            r0.element = r6
            X.3CM r0 = new X.3CM
            r0.<init>(r5)
            throw r0
        L38:
            X.C141335gf.LIZJ(r3)
            java.lang.Object r0 = r5.l0
            X.Ynr r0 = (X.InterfaceC88471Ynr) r0
            r4.LJLIL = r5
            r4.LJLJJL = r6
            r4.LJLJI = r1
            java.lang.Object r3 = r0.invoke(r6, r4)
            if (r3 != r2) goto L24
            return r2
        L4c:
            X.V1i r4 = new X.V1i
            r4.<init>(r5, r7)
            goto L12
        L52:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L55:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDfS26S0200000_13.emit$3(Y.IDfS26S0200000_13, java.lang.Object, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Throwable, T] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$4(Y.IDfS26S0200000_13 r5, java.lang.Object r6, X.InterfaceC67352kd r7) {
        /*
            boolean r0 = r7 instanceof X.C79060V1c
            if (r0 == 0) goto L20
            r4 = r7
            X.V1c r4 = (X.C79060V1c) r4
            int r2 = r4.LJLILLLLZI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LJLILLLLZI = r2
        L12:
            java.lang.Object r3 = r4.LJLIL
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLILLLLZI
            r1 = 1
            if (r0 == 0) goto L34
            if (r0 != r1) goto L2c
            Y.IDfS26S0200000_13 r5 = r4.LJLJJI
            goto L26
        L20:
            X.V1c r4 = new X.V1c
            r4.<init>(r5, r7)
            goto L12
        L26:
            X.C141335gf.LIZJ(r3)     // Catch: java.lang.Throwable -> L2a
            goto L46
        L2a:
            r1 = move-exception
            goto L4a
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.C141335gf.LIZJ(r3)
            java.lang.Object r0 = r5.l0     // Catch: java.lang.Throwable -> L49
            X.2gJ r0 = (X.InterfaceC64672gJ) r0     // Catch: java.lang.Throwable -> L49
            r4.LJLJJI = r5     // Catch: java.lang.Throwable -> L49
            r4.LJLILLLLZI = r1     // Catch: java.lang.Throwable -> L49
            java.lang.Object r0 = r0.emit(r6, r4)     // Catch: java.lang.Throwable -> L49
            if (r0 != r2) goto L46
            return r2
        L46:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L49:
            r1 = move-exception
        L4a:
            java.lang.Object r0 = r5.l1
            X.2mC r0 = (X.C68322mC) r0
            r0.element = r1
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDfS26S0200000_13.emit$4(Y.IDfS26S0200000_13, java.lang.Object, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0056, code lost:
    
        if ((X.C23450w1.LIZJ(r4.LIZJ()) + X.C23490w5.LIZIZ(r4.LIZ())) <= r5.LJ().LIZLLL()) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$5(Y.IDfS26S0200000_13 r4, java.lang.Object r5, X.InterfaceC67352kd r6) {
        /*
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r5.booleanValue()
            java.lang.Object r0 = r4.l1
            X.1ar r0 = (X.InterfaceC35811ar) r0
            java.lang.Object r3 = r0.getValue()
            X.V6V r3 = (X.V6V) r3
            if (r3 != 0) goto L14
        L11:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L14:
            java.lang.Object r5 = r4.l0
            X.1QP r5 = (X.C1QP) r5
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            X.0cP r0 = r5.LJ()
            java.util.List r0 = r0.LIZIZ()
            java.lang.Object r4 = X.ORZ.LLFII(r0)
            X.0cV r4 = (X.InterfaceC11350cV) r4
            r2 = 1
            if (r4 == 0) goto L58
            int r1 = r4.getIndex()
            X.0cP r0 = r5.LJ()
            int r0 = r0.LIZ()
            int r0 = r0 - r2
            if (r1 != r0) goto L5f
            long r0 = r4.LIZ()
            int r2 = X.C23490w5.LIZIZ(r0)
            long r0 = r4.LIZJ()
            int r1 = X.C23450w1.LIZJ(r0)
            int r1 = r1 + r2
            X.0cP r0 = r5.LJ()
            int r0 = r0.LIZLLL()
            if (r1 > r0) goto L5f
        L58:
            r0 = 1
        L59:
            r0 = r0 ^ 1
            r3.setCanScrollVertically$mention_video_release(r0)
            goto L11
        L5f:
            r0 = 0
            goto L59
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDfS26S0200000_13.emit$5(Y.IDfS26S0200000_13, java.lang.Object, X.2kd):java.lang.Object");
    }
}
