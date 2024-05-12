package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Fpa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40166Fpa extends G46 {
    public boolean LIZJ;

    @Override // X.G48, X.InterfaceC86124Xr6
    public final void onWindowFocusChanged(ActivityC86117Xqz activity, boolean z) {
        o.LJIIIZ(activity, "activity");
        if (this.LIZJ != z) {
            if (z) {
                AKZ.LIZIZ(activity);
            } else {
                AKZ.LIZ();
            }
            this.LIZJ = z;
        }
    }
}
