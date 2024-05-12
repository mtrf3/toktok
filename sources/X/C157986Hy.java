package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.6Hy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C157986Hy {
    public static final boolean LIZ(Effect effect) {
        File[] listFiles;
        String str;
        o.LJIIIZ(effect, "<this>");
        try {
            File file = new File(effect.getUnzipPath());
            if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    if (file2 != null) {
                        str = file2.getName();
                    } else {
                        str = null;
                    }
                    if (o.LJ(str, "config.json")) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e) {
            InterfaceC1554368d LIZJ = C6PB.LIZJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EffectExt isUnzipEffectResExistSync, effect id : ");
            LIZ.append(effect.getEffectId());
            LIZ.append(" , exception : ");
            LIZ.append(android.util.Log.getStackTraceString(e));
            LIZJ.LIZ(X1D.LIZIZ(LIZ));
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZIZ(com.ss.android.ugc.effectmanager.effect.model.Effect r7, X.InterfaceC67352kd<? super X.C76800UCe> r8) {
        /*
            boolean r0 = r8 instanceof X.C6I0
            if (r0 == 0) goto L5c
            r6 = r8
            X.6I0 r6 = (X.C6I0) r6
            int r2 = r6.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5c
            int r2 = r2 - r1
            r6.LJLJI = r2
        L12:
            java.lang.Object r5 = r6.LJLILLLLZI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r6.LJLJI
            r3 = 0
            r2 = 2
            r0 = 1
            if (r1 == 0) goto L25
            if (r1 == r0) goto L3a
            if (r1 != r2) goto L62
            X.C141335gf.LIZJ(r5)
        L24:
            return r5
        L25:
            X.C141335gf.LIZJ(r5)
            r6.LJLIL = r7
            r6.LJLJI = r0
            X.XIA r1 = X.C78613UtF.LIZJ
            X.6Fe r0 = new X.6Fe
            r0.<init>(r7, r3)
            java.lang.Object r5 = X.XKX.LJI(r1, r0, r6)
            if (r5 != r4) goto L3f
            return r4
        L3a:
            com.ss.android.ugc.effectmanager.effect.model.Effect r7 = r6.LJLIL
            X.C141335gf.LIZJ(r5)
        L3f:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            if (r0 == 0) goto L4a
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L4a:
            X.XIA r1 = X.C78613UtF.LIZJ
            X.6Hz r0 = new X.6Hz
            r0.<init>(r7, r3)
            r6.LJLIL = r3
            r6.LJLJI = r2
            java.lang.Object r5 = X.XKX.LJI(r1, r0, r6)
            if (r5 != r4) goto L24
            return r4
        L5c:
            X.6I0 r6 = new X.6I0
            r6.<init>(r8)
            goto L12
        L62:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C157986Hy.LIZIZ(com.ss.android.ugc.effectmanager.effect.model.Effect, X.2kd):java.lang.Object");
    }
}
