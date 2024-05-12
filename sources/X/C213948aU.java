package X;

import kotlin.jvm.internal.o;

/* renamed from: X.8aU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C213948aU {
    public static boolean LIZ() {
        try {
            Boolean enableChangeNicknameNotice = C2YJ.LIZIZ.LIZ.getMtcertSettings().getEnableChangeNicknameNotice();
            o.LJIIIIZZ(enableChangeNicknameNotice, "{\n                Settin…knameNotice\n            }");
            return enableChangeNicknameNotice.booleanValue();
        } catch (C158056If unused) {
            return false;
        }
    }
}
