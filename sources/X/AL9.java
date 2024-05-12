package X;

import android.view.ViewConfiguration;

/* loaded from: classes5.dex */
public final class AL9 implements InterfaceC25962AGw {
    @Override // X.InterfaceC25962AGw
    public final void LIZ(int i, int i2) {
        boolean z;
        if (Math.abs(i) > Math.abs(i2) && Math.abs(i) >= ViewConfiguration.getTouchSlop()) {
            z = true;
        } else {
            z = false;
        }
        ALA.LIZ = z;
    }
}
