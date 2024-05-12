package X;

import Y.ARunnableS51S0100000_15;
import android.hardware.Camera;

/* loaded from: classes16.dex */
public class Y6F implements Camera.AutoFocusCallback {
    public final /* synthetic */ C86831Y5z LIZ;

    public Y6F(C86831Y5z c86831Y5z) {
        this.LIZ = c86831Y5z;
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public final void onAutoFocus(boolean z, Camera camera) {
        this.LIZ.LJ.post(new ARunnableS51S0100000_15(this, 71));
    }
}
