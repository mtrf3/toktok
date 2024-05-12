package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import d5b.c;
import java.util.LinkedList;

/* renamed from: X.PHk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64196PHk extends AbstractRunnableC64070PCo {
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ double LJLJJLL;
    public final /* synthetic */ double LJLJL;

    public final void LIZ() {
        EnumC64201PHp enumC64201PHp;
        if (!this.LJLJJI) {
            enumC64201PHp = EnumC64201PHp.FRONT;
        } else {
            enumC64201PHp = EnumC64201PHp.BACK;
        }
        C64189PHd c64189PHd = new C64189PHd(enumC64201PHp, this.LJLJJL, this.LJLJJLL, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, this.LJLJL, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, null);
        c64189PHd.LJIIIIZZ = c.LIZJ(C09970aH.LIZ);
        c64189PHd.LJIIIZ = false;
        if (C64202PHq.LIZJ) {
            PC2.LIZ(c64189PHd);
        } else {
            ((LinkedList) C64202PHq.LIZIZ).add(c64189PHd);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public C64196PHk(double d, double d2, String str, boolean z) {
        this.LJLJJI = z;
        this.LJLJJL = str;
        this.LJLJJLL = d;
        this.LJLJL = d2;
    }
}
