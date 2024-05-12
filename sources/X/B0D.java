package X;

import android.content.Context;
import kotlin.jvm.internal.AqS154S0100000_4;

/* loaded from: classes5.dex */
public final class B0D extends DialogC27439Apn {
    public final C62822Ol8 LJLL;
    public boolean LJLLI;

    @Override // X.OOS, android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        if (this.LJLLI) {
            super.cancel();
        }
    }

    public B0D(Context context, int i) {
        super(context, i);
        this.LJLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 11));
        this.LJLLI = true;
    }
}
