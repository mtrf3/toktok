package X;

import android.os.SystemClock;
import com.bytedance.pumbaa.PumbaaServiceImpl;

/* renamed from: X.Pyz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66229Pyz implements InterfaceC65954PuY {
    public final /* synthetic */ long LIZ;
    public final /* synthetic */ PumbaaServiceImpl LIZIZ;

    @Override // X.InterfaceC65954PuY
    public final void LIZ() {
        InterfaceC65954PuY interfaceC65954PuY;
        C66243PzD c66243PzD = this.LIZIZ.LIZJ;
        if (c66243PzD != null && (interfaceC65954PuY = c66243PzD.LJLIL) != null) {
            interfaceC65954PuY.LIZ();
        }
        SystemClock.elapsedRealtimeNanos();
    }

    public C66229Pyz(long j, PumbaaServiceImpl pumbaaServiceImpl) {
        this.LIZ = j;
        this.LIZIZ = pumbaaServiceImpl;
    }
}
