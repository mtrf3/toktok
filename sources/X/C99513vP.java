package X;

import android.content.Context;
import android.os.Build;

/* renamed from: X.3vP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C99513vP {
    public final Context LIZ;
    public final C99033ud LIZIZ;

    public final void LIZ() {
        C99033ud c99033ud = this.LIZIZ;
        if (c99033ud == null || c99033ud.getConversationId().length() == 0 || Build.VERSION.SDK_INT < 23) {
            return;
        }
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C4F9(this, null), 3);
    }

    public C99513vP(Context context, C99033ud c99033ud) {
        this.LIZ = context;
        this.LIZIZ = c99033ud;
    }
}
