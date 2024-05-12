package X;

import android.content.Context;
import android.text.TextUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.Xp5, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85999Xp5 implements InterfaceC64313PLx, InterfaceC76546U2k, InterfaceC48038ItG {
    public static final C85999Xp5 LJLIL = new C85999Xp5();

    @Override // X.InterfaceC76546U2k
    public void LIZ() {
    }

    public static String LIZIZ() {
        String LIZIZ = C39392Fd6.LIZIZ("key_current_locale", "");
        if (TextUtils.isEmpty(LIZIZ)) {
            return "en";
        }
        return LIZIZ;
    }

    public static void LJFF(Context context) {
        if (context == null) {
            context = EF7.LIZIZ();
        }
        C39386Fd0.LIZJ(context, LIZJ(context, null, null), false, null);
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object it) {
        o.LJIIIZ(it, "it");
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f1, code lost:
    
        if (android.text.TextUtils.equals(X.C39567Ffv.LIZIZ(r11), "CN") != false) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Locale LIZJ(android.content.Context r12, java.lang.String r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85999Xp5.LIZJ(android.content.Context, java.lang.String, java.lang.String):java.util.Locale");
    }

    public static final C66531Q9f LJ(Q9D q9d, InterfaceC88472Yns block, InterfaceC65784Pro interfaceC65784Pro) {
        o.LJIIIZ(block, "block");
        C86031Xpb LIZ = C86021XpR.LIZ(q9d);
        if (LIZ.LIZ != 0) {
            return (C66531Q9f) block.invoke(LIZ);
        }
        return (C66531Q9f) interfaceC65784Pro.invoke();
    }

    public static final C66531Q9f LIZLLL(String str, String str2, java.util.Map map, InterfaceC88472Yns block, InterfaceC65784Pro interfaceC65784Pro) {
        o.LJIIIZ(block, "block");
        Q96 q96 = new Q96();
        q96.LIZ = str;
        q96.LIZIZ = str2;
        q96.LIZJ = map;
        C86031Xpb LIZ = C86021XpR.LIZ(new Q9D(q96));
        if (LIZ.LIZ != 0) {
            return (C66531Q9f) block.invoke(LIZ);
        }
        return (C66531Q9f) interfaceC65784Pro.invoke();
    }
}
