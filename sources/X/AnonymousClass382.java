package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.382, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass382 {
    public static final /* synthetic */ int LJFF = 0;
    public final C72582t4 LIZ;
    public final C788837s LIZIZ;
    public final List<C787637g> LIZJ;
    public final List<C787637g> LIZLLL;
    public final JSONObject LJ;

    public AnonymousClass382(C72582t4 context) {
        o.LJIIIZ(context, "context");
        this.LIZ = context;
        this.LIZIZ = new C788837s(context);
        this.LIZJ = new ArrayList();
        this.LIZLLL = new ArrayList();
        this.LJ = new JSONObject();
    }

    public static String LIZJ(C787637g c787637g) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(c787637g.LIZ);
        LIZ.append('_');
        C789537z c789537z = c787637g.LIZJ;
        if (c789537z != null) {
            str = c789537z.LIZIZ;
        } else {
            str = null;
        }
        LIZ.append(str);
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC67352kd<? super X.C76800UCe> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.AnonymousClass383
            if (r0 == 0) goto L3e
            r4 = r6
            X.383 r4 = (X.AnonymousClass383) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3e
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r0 = r4.LJLILLLLZI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r4.LJLJJI
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L44
            java.lang.Object r1 = r4.LJLIL
            java.util.List r1 = (java.util.List) r1
            X.C141335gf.LIZJ(r0)
        L24:
            java.util.Collection r0 = (java.util.Collection) r0
            r1.addAll(r0)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L2c:
            X.C141335gf.LIZJ(r0)
            java.util.List<X.37g> r1 = r5.LIZLLL
            X.37s r0 = r5.LIZIZ
            r4.LJLIL = r1
            r4.LJLJJI = r2
            java.lang.Object r0 = r0.LIZIZ()
            if (r0 != r3) goto L24
            return r3
        L3e:
            X.383 r4 = new X.383
            r4.<init>(r5, r6)
            goto L12
        L44:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass382.LIZ(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC67352kd<? super X.C76800UCe> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof X.AnonymousClass384
            if (r0 == 0) goto L82
            r7 = r11
            X.384 r7 = (X.AnonymousClass384) r7
            int r2 = r7.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L82
            int r2 = r2 - r1
            r7.LJLJJI = r2
        L12:
            java.lang.Object r0 = r7.LJLILLLLZI
            X.NAu r8 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r7.LJLJJI
            r6 = 1
            if (r1 == 0) goto L2c
            if (r1 != r6) goto L88
            java.lang.Object r1 = r7.LJLIL
            java.util.List r1 = (java.util.List) r1
            X.C141335gf.LIZJ(r0)
        L24:
            java.util.Collection r0 = (java.util.Collection) r0
            r1.addAll(r0)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L2c:
            X.C141335gf.LIZJ(r0)
            org.json.JSONObject r9 = r10.LJ
            X.2t4 r0 = r10.LIZ
            X.38i r0 = r0.LIZIZ
            long r4 = r0.LIZ()
            r2 = -1
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 != 0) goto L7b
            r0 = -1
        L41:
            java.lang.String r4 = "full_update_interval"
            org.json.JSONObject r9 = r9.put(r4, r0)
            X.2t4 r0 = r10.LIZ
            X.38i r0 = r0.LIZIZ
            X.34C r4 = r0.LIZJ
            X.TBo<java.lang.Object>[] r1 = X.C790438i.LIZLLL
            r0 = 2
            r0 = r1[r0]
            java.lang.Object r0 = r4.LIZ(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            long r4 = r0.longValue()
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 != 0) goto L74
        L60:
            java.lang.String r0 = "push_update_interval"
            r9.put(r0, r2)
            java.util.List<X.37g> r1 = r10.LIZJ
            X.37s r0 = r10.LIZIZ
            r7.LJLIL = r1
            r7.LJLJJI = r6
            java.lang.Object r0 = r0.LIZIZ()
            if (r0 != r8) goto L24
            return r8
        L74:
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r4
            goto L60
        L7b:
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r4
            goto L41
        L82:
            X.384 r7 = new X.384
            r7.<init>(r10, r11)
            goto L12
        L88:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass382.LIZIZ(X.2kd):java.lang.Object");
    }
}
