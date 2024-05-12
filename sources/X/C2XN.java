package X;

import android.os.Handler;
import android.os.Message;

/* renamed from: X.2XN, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2XN implements C2XQ {
    public C2XP LIZ;
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C2XK.LJLIL);

    @Override // X.C2XQ
    public final boolean LIZ(Handler handler, Message message, long j) {
        C2XP c2xp;
        if (handler == null || message == null || message.getCallback() == null || (c2xp = this.LIZ) == null) {
            return false;
        }
        c2xp.LIZJ(j);
        return ((C2XO) this.LIZIZ.getValue()).LIZ(message, j);
    }
}
