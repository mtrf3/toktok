package X;

import Y.IDHandlerS13S0100000;
import android.os.Message;
import android.util.Pair;

/* renamed from: X.0nY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18200nY {
    public static final IDHandlerS13S0100000 LIZ = new IDHandlerS13S0100000(C16880lQ.LLJJJJ(), 2);

    public static void LIZ(String str, String str2) {
        IDHandlerS13S0100000 iDHandlerS13S0100000 = LIZ;
        Message obtain = Message.obtain(iDHandlerS13S0100000, 2);
        obtain.obj = new Pair(str, str2);
        iDHandlerS13S0100000.sendMessage(obtain);
    }
}
