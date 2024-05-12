package X;

import java.util.concurrent.CancellationException;
import ujb.o;

/* renamed from: X.2lE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67722lE {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZIZ(Object obj) {
        Object LIZ2;
        try {
            LIZ2 = C75792yF.LIZJ(obj);
            C3C5.m7constructorimpl(LIZ2);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
        }
        if (C3C5.m12isFailureimpl(LIZ2)) {
            LIZ2 = null;
        }
        return (String) LIZ2;
    }

    public static Object LIZ(Class cls, String str) {
        boolean z;
        Object LIZ2;
        if (str == null || o.LJJJJJL(str)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        try {
            LIZ2 = C75792yF.LIZ(str, cls);
            C3C5.m7constructorimpl(LIZ2);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
        }
        if (C3C5.m12isFailureimpl(LIZ2)) {
            return null;
        }
        return LIZ2;
    }
}
