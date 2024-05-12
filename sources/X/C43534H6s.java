package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.H6s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43534H6s extends AbstractC43539H6x {
    public final H4O LIZJ;

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC67352kd<? super X.C142385iM> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C43538H6w
            if (r0 == 0) goto L36
            r4 = r6
            X.H6w r4 = (X.C43538H6w) r4
            int r2 = r4.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L36
            int r2 = r2 - r1
            r4.LJLJI = r2
        L12:
            java.lang.Object r3 = r4.LJLIL
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r4.LJLJI
            r0 = 1
            if (r1 == 0) goto L2a
            if (r1 != r0) goto L3c
            X.C141335gf.LIZJ(r3)
        L20:
            X.5iM r1 = new X.5iM
            java.util.List r0 = X.C47261Igj.LJJIJ(r3)
            r1.<init>(r0)
            return r1
        L2a:
            X.C141335gf.LIZJ(r3)
            r4.LJLJI = r0
            java.lang.Object r3 = r5.LIZLLL(r4)
            if (r3 != r2) goto L20
            return r2
        L36:
            X.H6w r4 = new X.H6w
            r4.<init>(r5, r6)
            goto L12
        L3c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43534H6s.LIZIZ(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x01ac A[LOOP:0: B:39:0x01ac->B:43:0x01ba, LOOP_START, PHI: r3
      0x01ac: PHI (r3v10 int) = (r3v3 int), (r3v12 int) binds: [B:38:0x01aa, B:43:0x01ba] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.InterfaceC67352kd<? super X.C142375iL> r18) {
        /*
            Method dump skipped, instructions count: 737
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43534H6s.LIZLLL(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.InterfaceC67352kd<? super com.ss.android.ugc.effectmanager.effect.model.Effect> r13) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43534H6s.LJ(X.2kd):java.lang.Object");
    }

    public static String LIZ(Effect effect, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(effect.getUnzipPath());
        String separator = File.separator;
        o.LJIIIIZZ(separator, "separator");
        if (!s.LJJLI(sb, separator)) {
            sb.append(separator);
        }
        sb.append("image");
        sb.append(separator);
        sb.append(str);
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "StringBuilder()\n        …)\n            .toString()");
        return sb2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(com.ss.android.ugc.effectmanager.effect.model.Effect r14, X.InterfaceC67352kd<? super X.C76800UCe> r15) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43534H6s.LIZJ(com.ss.android.ugc.effectmanager.effect.model.Effect, X.2kd):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43534H6s(LifecycleOwner lifecycleOwner, Context context, H4O h4o) {
        super(context, lifecycleOwner);
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(context, "context");
        this.LIZJ = h4o;
    }
}
