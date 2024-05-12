package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.I6m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46076I6m implements I7U {
    public final /* synthetic */ C46072I6i LIZ;

    @Override // X.I7U
    public final void LIZIZ() {
    }

    @Override // X.I7U
    public final void onStart() {
        this.LIZ.LJFF = System.currentTimeMillis();
    }

    public C46076I6m(C46072I6i c46072I6i) {
        this.LIZ = c46072I6i;
    }

    @Override // X.I7U
    public final void LIZ(boolean z, boolean z2) {
        if (z) {
            C46072I6i c46072I6i = this.LIZ;
            c46072I6i.LIZJ = true;
            C5U8 LJIIIZ = c46072I6i.LJIIIZ();
            InterfaceC153045zY interfaceC153045zY = LJIIIZ.LIZ;
            if (interfaceC153045zY != null && LJIIIZ.LIZIZ >= 0 && interfaceC153045zY.updateAlgorithmFromNormal() == 0) {
                InterfaceC153045zY interfaceC153045zY2 = LJIIIZ.LIZ;
                o.LJI(interfaceC153045zY2);
                if (interfaceC153045zY2.genSmartCutting() == 0) {
                    LJIIIZ.LJ(5, -1);
                }
            }
            C5S1 c5s1 = new C5S1(this.LIZ.LIZ);
            c5s1.LIZJ(R.string.rpc);
            c5s1.LJ();
        }
        if (z2) {
            C46072I6i c46072I6i2 = this.LIZ;
            c46072I6i2.LIZIZ.LJJJJJL(c46072I6i2.LIZLLL());
        }
        long currentTimeMillis = System.currentTimeMillis() - this.LIZ.LJFF;
        int i = !z ? 1 : 0;
        C6BK c6bk = new C6BK();
        c6bk.LIZ.put("cast_time", Long.valueOf(currentTimeMillis / 1000));
        c6bk.LIZ.put("cancel", Integer.valueOf(z2 ? 1 : 0));
        C43882HKc.LIZLLL(i, "stickpoint_smart", c6bk.LJ(), true);
    }
}
