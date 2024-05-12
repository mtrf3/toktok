package Y;

import X.C0A6;
import X.C16880lQ;
import X.C1DD;
import X.C87031YDr;
import X.C87033YDt;
import X.X1D;
import X.XX6;
import X.XXC;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.feed.drawerfeed.DrawerFeedLiveFragmentV2;
import com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity;
import com.ss.android.ugc.aweme.poi.detail.discovery.category.PoiDetailDiscoveryCategoryAssem;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class IDrS53S0100000_15 extends C0A6 {
    public final int $t;
    public Object l0;

    public static final void LJIILJJIL$1(IDrS53S0100000_15 iDrS53S0100000_15, int i, RecyclerView recyclerView) {
    }

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        switch (this.$t) {
            case 0:
                LJIILJJIL$0(this, i, recyclerView);
                return;
            case 1:
                LJIILJJIL$1(this, i, recyclerView);
                return;
            case 2:
                LJIILJJIL$2(this, i, recyclerView);
                return;
            case 3:
                LJIILJJIL$3(this, i, recyclerView);
                return;
            default:
                super.LJIILJJIL(i, recyclerView);
                return;
        }
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        switch (this.$t) {
            case 0:
                LJIILL$0(this, recyclerView, i, i2);
                return;
            case 1:
                LJIILL$1(this, recyclerView, i, i2);
                return;
            case 2:
                LJIILL$2(this, recyclerView, i, i2);
                return;
            case 3:
                o.LJIIIZ(recyclerView, "recyclerView");
                return;
            case 4:
                LJIILL$4(this, recyclerView, i, i2);
                return;
            case 5:
                LJIILL$5(this, recyclerView, i, i2);
                return;
            default:
                super.LJIILL(recyclerView, i, i2);
                return;
        }
    }

    public IDrS53S0100000_15(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJIILJJIL$0(IDrS53S0100000_15 iDrS53S0100000_15, int i, RecyclerView recyclerView) {
        if (i == 0) {
            AvatarCutActivity avatarCutActivity = (AvatarCutActivity) iDrS53S0100000_15.l0;
            avatarCutActivity.LLFII();
            avatarCutActivity.LLII();
        }
    }

    public static final void LJIILJJIL$2(IDrS53S0100000_15 iDrS53S0100000_15, int i, RecyclerView recyclerView) {
        C87031YDr c87031YDr = C87033YDt.LIZ;
        if (i == 0) {
            c87031YDr.getClass();
            try {
                C16880lQ.LLIIIJ().removeFrameCallback(c87031YDr.LJFF);
                if (c87031YDr.LIZLLL) {
                    c87031YDr.LIZ(false);
                }
            } catch (Throwable unused) {
            }
            c87031YDr.LIZLLL = false;
            c87031YDr.LIZIZ = 0L;
            c87031YDr.LIZ = 0L;
            c87031YDr.LIZJ = 0L;
            return;
        }
        if (!c87031YDr.LIZLLL) {
            if (c87031YDr.LJ > 10) {
                if (C87031YDr.LJI) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("stop because over max count, cur count = ");
                    C1DD.LJFF(LIZ, c87031YDr.LJ, LIZ, "FPSMonitor");
                    return;
                }
                return;
            }
            try {
                C16880lQ.LLIIIJ().removeFrameCallback(c87031YDr.LJFF);
                if (c87031YDr.LIZLLL) {
                    c87031YDr.LIZ(false);
                }
            } catch (Throwable unused2) {
            }
            try {
                c87031YDr.LIZIZ = 0L;
                c87031YDr.LIZ = 0L;
                c87031YDr.LIZJ = 0L;
                c87031YDr.LIZLLL = true;
                C16880lQ.LLIIIJ().postFrameCallback(c87031YDr.LJFF);
            } catch (Throwable unused3) {
                c87031YDr.LIZLLL = false;
            }
        }
    }

    public static final void LJIILJJIL$3(IDrS53S0100000_15 iDrS53S0100000_15, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 0) {
            ((PoiDetailDiscoveryCategoryAssem) iDrS53S0100000_15.l0).v2(null);
        }
    }

    public static final void LJIILL$0(IDrS53S0100000_15 iDrS53S0100000_15, RecyclerView recyclerView, int i, int i2) {
        ((AvatarCutActivity) iDrS53S0100000_15.l0).LLIIZ += i;
    }

    public static final void LJIILL$1(IDrS53S0100000_15 iDrS53S0100000_15, RecyclerView recyclerView, int i, int i2) {
        AvatarCutActivity avatarCutActivity = (AvatarCutActivity) iDrS53S0100000_15.l0;
        avatarCutActivity.LLIIZ += i;
        avatarCutActivity.LLFII();
        avatarCutActivity.LLII();
    }

    public static final void LJIILL$2(IDrS53S0100000_15 iDrS53S0100000_15, RecyclerView recyclerView, int i, int i2) {
        if (i2 > 20) {
            DrawerFeedLiveFragmentV2 drawerFeedLiveFragmentV2 = (DrawerFeedLiveFragmentV2) iDrS53S0100000_15.l0;
            drawerFeedLiveFragmentV2.wl(0, drawerFeedLiveFragmentV2.LJLJI);
        } else {
            if (i2 >= -20) {
                return;
            }
            DrawerFeedLiveFragmentV2 drawerFeedLiveFragmentV22 = (DrawerFeedLiveFragmentV2) iDrS53S0100000_15.l0;
            drawerFeedLiveFragmentV22.wl(1, drawerFeedLiveFragmentV22.LJLJI);
        }
    }

    public static final void LJIILL$4(IDrS53S0100000_15 iDrS53S0100000_15, RecyclerView recyclerView, int i, int i2) {
        ((XX6) iDrS53S0100000_15.l0).LJLZ(false);
    }

    public static final void LJIILL$5(IDrS53S0100000_15 iDrS53S0100000_15, RecyclerView recyclerView, int i, int i2) {
        ((XXC) iDrS53S0100000_15.l0).LJLZ(false);
    }
}
