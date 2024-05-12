package X;

import Y.IDBReceiverS6S0100000_6;
import android.content.Context;
import android.content.IntentFilter;

/* loaded from: classes7.dex */
public final class F7B {
    public final Context LIZ;
    public boolean LIZIZ;
    public EnumC48190Ivi LIZJ;

    public F7B(Context context) {
        this.LIZJ = EnumC48190Ivi.MOBILE;
        this.LIZ = context;
        if (!this.LIZIZ) {
            IntentFilter LIZ = AnonymousClass028.LIZ("android.net.conn.CONNECTIVITY_CHANGE");
            IDBReceiverS6S0100000_6 iDBReceiverS6S0100000_6 = new IDBReceiverS6S0100000_6(this, 6);
            this.LIZIZ = true;
            try {
                C16880lQ.LJJLIIIJILLIZJL(iDBReceiverS6S0100000_6, context, LIZ);
            } catch (Throwable unused) {
            }
        }
        this.LIZJ = C48189Ivh.LJ(this.LIZ);
    }
}
