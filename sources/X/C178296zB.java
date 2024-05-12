package X;

import android.content.Context;
import com.bytedance.common.utility.Logger;
import kotlin.jvm.internal.o;

/* renamed from: X.6zB */
/* loaded from: classes4.dex */
public final class C178296zB {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context, int i, boolean z) {
        if (z || i == 0) {
            return;
        }
        String string = context.getResources().getString(i);
        o.LJIIIIZZ(string, "context.resources.getString(id)");
        LIZIZ(context, string, z);
    }

    public static void LIZIZ(Context context, String str, boolean z) {
        if (z) {
            return;
        }
        try {
            C5S1 c5s1 = new C5S1(context);
            c5s1.LIZLLL(str);
            c5s1.LJ();
        } catch (Exception e) {
            Logger.throwException(e);
        }
    }

    public static final boolean LIZJ(Context context, Exception exc, int i) {
        return LIZLLL(context, exc, i, false, false);
    }

    public static /* synthetic */ boolean LJ(Context context, Exception exc, int i, int i2) {
        return LIZLLL(context, exc, i, false, false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x0079. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x007c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x007f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x0082. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0110 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0111 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LIZLLL(android.content.Context r7, java.lang.Exception r8, int r9, boolean r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C178296zB.LIZLLL(android.content.Context, java.lang.Exception, int, boolean, boolean):boolean");
    }
}
