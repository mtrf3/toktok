package X;

import android.content.Context;
import android.os.Binder;

/* renamed from: X.Qad, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class BinderC67267Qad extends AbstractBinderC67693QhV {
    public final Context LJLIL;

    public final void LLJI() {
        if (C67265Qab.LIZ(Binder.getCallingUid(), this.LJLIL)) {
        } else {
            throw new SecurityException(C0NY.LIZIZ("Calling UID ", Binder.getCallingUid(), " is not Google Play services."));
        }
    }

    public BinderC67267Qad(Context context) {
        this.LJLIL = context;
    }
}
