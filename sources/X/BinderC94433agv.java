package X;

import android.os.Bundle;
import com.google.ar.core.ArCoreApk;

/* renamed from: X.agv, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class BinderC94433agv extends AbstractBinderC94367afr {
    public final /* synthetic */ RunnableC93545aSb LJLIL;

    @Override // X.InterfaceC93987aZj
    public final void LJJJJLL(Bundle bundle) {
    }

    public BinderC94433agv(RunnableC93545aSb runnableC93545aSb) {
        this.LJLIL = runnableC93545aSb;
    }

    @Override // X.InterfaceC93987aZj
    public final void LJJJJJL(Bundle bundle) {
        int i = bundle.getInt("error.code", -100);
        if (i != -5) {
            if (i != -3) {
                if (i != 0) {
                    this.LJLIL.LJLILLLLZI.LIZ(ArCoreApk.Availability.UNKNOWN_ERROR);
                    return;
                } else {
                    this.LJLIL.LJLILLLLZI.LIZ(ArCoreApk.Availability.SUPPORTED_NOT_INSTALLED);
                    return;
                }
            }
            this.LJLIL.LJLILLLLZI.LIZ(ArCoreApk.Availability.UNKNOWN_ERROR);
            return;
        }
        this.LJLIL.LJLILLLLZI.LIZ(ArCoreApk.Availability.UNSUPPORTED_DEVICE_NOT_CAPABLE);
    }
}
