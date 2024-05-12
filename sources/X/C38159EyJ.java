package X;

import Y.ARunnableS0S1200100_6;
import android.os.SystemClock;

/* renamed from: X.EyJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38159EyJ implements InterfaceC38140Ey0 {
    public final AbstractC38143Ey3 LIZ;

    public static final int LIZLLL(int i) {
        if (i != 1) {
            return i != 2 ? 0 : -2;
        }
        return -1;
    }

    @Override // X.InterfaceC38140Ey0
    public final /* synthetic */ void LIZJ(C38117Exd c38117Exd, int i) {
    }

    public C38159EyJ(C38141Ey1 c38141Ey1) {
        this.LIZ = c38141Ey1;
    }

    @Override // X.InterfaceC38140Ey0
    public final void LIZ(String str, String str2, C17230lz c17230lz) {
        C38160EyK.LIZIZ(new ARunnableS0S1200100_6(this, str2, c17230lz, SystemClock.elapsedRealtime(), 2));
    }

    @Override // X.InterfaceC38140Ey0
    public final void LIZIZ(String str, String str2, int i, String str3, C17230lz c17230lz) {
        C38160EyK.LIZIZ(new RunnableC38158EyI(this, str2, c17230lz, i, str3, SystemClock.elapsedRealtime()));
    }
}
