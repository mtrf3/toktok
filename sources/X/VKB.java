package X;

import Y.IDBReceiverS10S0100000_14;
import android.content.Context;

/* loaded from: classes15.dex */
public final class VKB {
    public static VKB LIZLLL;
    public final Context LIZ;
    public EnumC48011Isp LIZIZ;
    public final OJM<VKC> LIZJ = new OJM<>();

    public VKB(Context context) {
        this.LIZIZ = EnumC48011Isp.MOBILE;
        Context LLLLL = C16880lQ.LLLLL(context);
        this.LIZ = LLLLL;
        try {
            C16880lQ.LJJLIIIJILLIZJL(new IDBReceiverS10S0100000_14(this, 2), LLLLL, AnonymousClass028.LIZ("android.net.conn.CONNECTIVITY_CHANGE"));
        } catch (Throwable unused) {
        }
        this.LIZIZ = C48012Isq.LIZIZ(this.LIZ);
    }

    public static synchronized VKB LIZ(Context context) {
        VKB vkb;
        synchronized (VKB.class) {
            if (LIZLLL == null) {
                LIZLLL = new VKB(context);
            }
            vkb = LIZLLL;
        }
        return vkb;
    }
}
