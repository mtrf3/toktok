package X;

import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.Xst, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractC86235Xst implements InterfaceC86245Xt3, InterfaceC27436Apk {
    public InterfaceC86247Xt5 LJLIL;

    public AbstractC86235Xst(WeakReference<Context> weakReference) {
    }

    @Override // X.InterfaceC27436Apk
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        if (i != 1 && i != 700 && i != 800 && i != 10003 && i != 10004) {
            ((C86233Xsr) this).LIZ(0, "Unrecognized request code");
        } else {
            InterfaceC86247Xt5 interfaceC86247Xt5 = this.LJLIL;
            if (interfaceC86247Xt5 != null) {
                interfaceC86247Xt5.onActivityResult(i, i2, intent);
            } else {
                o.LJIJI("mIFileMediaFeature");
                throw null;
            }
        }
        return true;
    }
}
