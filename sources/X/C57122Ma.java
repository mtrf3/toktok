package X;

import android.content.SharedPreferences;
import kotlin.jvm.internal.o;

/* renamed from: X.2Ma, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57122Ma {
    public static boolean LIZ = LIZ().getBoolean("hasSwipedUp", false);

    public static SharedPreferences LIZ() {
        SharedPreferences LIZIZ = F9J.LIZIZ(EF7.LIZIZ(), 0, "MainTabPreferences");
        o.LJIIIIZZ(LIZIZ, "AppContextManager.getApp…ME, Context.MODE_PRIVATE)");
        return LIZIZ;
    }
}
