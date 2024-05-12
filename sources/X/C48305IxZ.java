package X;

import Y.IDBReceiverS8S0100000_8;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.IxZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48305IxZ implements InterfaceC66827QKp {
    public static C48305IxZ LIZJ;
    public static final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public final Context LIZ;
    public EnumC48190Ivi LIZIZ;

    public C48305IxZ(Context context) {
        this.LIZIZ = EnumC48190Ivi.MOBILE;
        this.LIZ = context;
        this.LIZIZ = C48189Ivh.LJ(context);
        C16880lQ.LJJLIIIJILLIZJL(new IDBReceiverS8S0100000_8(this, 6), context, AnonymousClass028.LIZ("android.net.conn.CONNECTIVITY_CHANGE"));
    }
}
