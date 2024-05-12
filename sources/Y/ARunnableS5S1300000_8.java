package Y;

import X.ActivityC45651qj;
import X.EnumC35454Dvm;
import X.IPG;
import X.IPH;
import X.IUM;
import X.IVN;
import X.JFV;
import X.JG8;
import X.KR2;
import X.X1D;
import android.net.Uri;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.feed.platform.panel.digg.DiggPanelComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.ss.android.ugc.playerkit.radar.SimRadar;

/* loaded from: classes9.dex */
public class ARunnableS5S1300000_8 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        long j;
        ActivityC45651qj LIZ = ((DiggPanelComponent) this.l1).getPanelContext().LIZ();
        if (LIZ == null || LIZ.isFinishing()) {
            return;
        }
        DiggPanelComponent.LJLLJ.storeBoolean("didLike", true);
        Long l = (Long) this.l2;
        if (l != null && l.longValue() > 0) {
            j = ((Long) this.l2).longValue();
        } else {
            j = 3000;
        }
        IViewPagerComponentAbility viewPagerComponentAbility = ((DiggPanelComponent) this.l1).getViewPagerComponentAbility();
        if (viewPagerComponentAbility == null) {
            return;
        }
        viewPagerComponentAbility.postDelayed(new KR2((EnumC35454Dvm) this.l3, LIZ, this.s0, j, (DiggPanelComponent) this.l1), 750L);
    }

    public final void LIZ$1() {
        OnUIPlayListener onUIPlayListener = (OnUIPlayListener) this.l1;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayFailed((IPG) this.l2);
            SimRadar.errorScan("SimplifyPlayerImpl", "onPlayFailed-2", new IUM(((IPG) this.l2).toString()), new Object[0]);
            SimRadar.analyzer().getClass();
            IVN.LIZIZ("PF-2");
            ((OnUIPlayListener) this.l1).onPlayFailed(this.s0, (IPG) this.l2, (IPH) this.l3);
        }
    }

    public final void LIZ$2() {
        try {
            ((JG8) this.l3).LIZ.getContentResolver().notifyChange((Uri) this.l1, null);
        } catch (Exception unused) {
            int[] iArr = (int[]) this.l2;
            int i = iArr[0] + 1;
            iArr[0] = i;
            if (i <= 4) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(this);
                LIZ.append("retry ");
                LIZ.append(((int[]) this.l2)[0]);
                LIZ.append(" times after 1 second");
                X1D.LIZIZ(LIZ);
                JFV.LIZIZ(this.s0).postDelayed(this, 1000L);
            }
        }
    }

    public static final void run$0(ARunnableS5S1300000_8 aRunnableS5S1300000_8) {
        boolean LIZ;
        try {
            aRunnableS5S1300000_8.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS5S1300000_8 aRunnableS5S1300000_8) {
        boolean LIZ;
        try {
            OnUIPlayListener onUIPlayListener = (OnUIPlayListener) aRunnableS5S1300000_8.l1;
            if (onUIPlayListener != null) {
                onUIPlayListener.onPlayFailed((IPG) aRunnableS5S1300000_8.l2);
                ((OnUIPlayListener) aRunnableS5S1300000_8.l1).onPlayFailed(aRunnableS5S1300000_8.s0, (IPG) aRunnableS5S1300000_8.l2, (IPH) aRunnableS5S1300000_8.l3);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS5S1300000_8 aRunnableS5S1300000_8) {
        boolean LIZ;
        try {
            aRunnableS5S1300000_8.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS5S1300000_8 aRunnableS5S1300000_8) {
        boolean LIZ;
        try {
            OnUIPlayListener onUIPlayListener = (OnUIPlayListener) aRunnableS5S1300000_8.l1;
            if (onUIPlayListener != null) {
                onUIPlayListener.onPlayFailed((IPG) aRunnableS5S1300000_8.l2);
                ((OnUIPlayListener) aRunnableS5S1300000_8.l1).onPlayFailed(aRunnableS5S1300000_8.s0, (IPG) aRunnableS5S1300000_8.l2, (IPH) aRunnableS5S1300000_8.l3);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS5S1300000_8 aRunnableS5S1300000_8) {
        boolean LIZ;
        try {
            aRunnableS5S1300000_8.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS5S1300000_8(Object obj, Object obj2, String str, Object obj3, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
        this.l3 = obj3;
    }
}
