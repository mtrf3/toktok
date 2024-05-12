package X;

import android.content.Context;
import com.bytedance.common.utility.Logger;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Ed3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36841Ed3 {
    public static final AtomicInteger LIZ = new AtomicInteger(0);
    public static volatile String LIZIZ = null;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(android.content.Context r6) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36841Ed3.LIZ(android.content.Context):java.lang.String");
    }

    public static boolean LIZIZ(Context context) {
        String LIZ2 = LIZ(context);
        if (LIZ2 == null || LIZ2.contains(":") || !LIZ2.equals(context.getPackageName())) {
            return false;
        }
        return true;
    }

    public static boolean LIZJ(Context context) {
        Logger.debug();
        int i = LIZ.get();
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            return LIZIZ(context);
        }
        return false;
    }
}
