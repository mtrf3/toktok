package X;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.UUID;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JY8 implements InterfaceC80653En {
    public final WeakReference<View> LJLIL;

    public JY8() {
        this(null);
    }

    public JY8(WeakReference<View> weakReference) {
        this.LJLIL = weakReference;
        o.LJIIIIZZ(UUID.randomUUID().toString(), "randomUUID().toString()");
    }
}
