package X;

import android.os.SystemClock;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout$DrawerListener;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.drawerfeed.LiveDrawerDialogV3;
import com.bytedance.android.livesdkapi.depend.event.LiveExploreDrawerShowChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BOE implements DrawerLayout$DrawerListener {
    public final /* synthetic */ LiveDrawerDialogV3 LIZ;

    @Override // androidx.drawerlayout.widget.DrawerLayout$DrawerListener
    public final void onDrawerStateChanged(int i) {
    }

    public BOE(LiveDrawerDialogV3 liveDrawerDialogV3) {
        this.LIZ = liveDrawerDialogV3;
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout$DrawerListener
    public final void onDrawerClosed(View view) {
        Fragment fragment;
        o.LJIIIZ(view, "view");
        DataChannel dataChannel = this.LIZ.LJLJJLL;
        if (dataChannel != null) {
            dataChannel.rv0(LiveExploreDrawerShowChannel.class, Boolean.FALSE);
        }
        C08680Vs c08680Vs = C08680Vs.LJIILJJIL;
        c08680Vs.LJ = C08680Vs.LJIILLIIL;
        if (this.LIZ.getUserVisibleHint()) {
            c08680Vs.LJIIIIZZ(this.LIZ.LJLJJLL, false);
            LiveDrawerDialogV3 liveDrawerDialogV3 = this.LIZ;
            liveDrawerDialogV3.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - liveDrawerDialogV3.LJLJJL;
            BZI LIZ = C28787BRn.LIZ("livesdk_explore_duration");
            LIZ.LJIJJ(String.valueOf(elapsedRealtime), "duration");
            LIZ.LJIJJ(C28594BKc.LIZJ().LIZLLL(), "request_page");
            LIZ.LJIJJ(C28594BKc.LIZJ().LIZLLL(), "enter_live_method");
            LIZ.LJIIL(c08680Vs.LIZLLL);
            LIZ.LJIILLIIL(liveDrawerDialogV3.LJLJJLL);
            LIZ.LJIJJ(c08680Vs.LJII, "tab_type");
            String str = C08680Vs.LJIIZILJ;
            LIZ.LJIJJ(Integer.valueOf(c08680Vs.LJFF()), str);
            String str2 = C08680Vs.LJIJ;
            LIZ.LJIJJ(C08660Vq.LIZ(), str2);
            LIZ.LJIJJ(c08680Vs.LIZIZ(), "entrance_type");
            LIZ.LJJIIJZLJL();
            BZI LIZ2 = C28787BRn.LIZ("livesdk_explore_close");
            LIZ2.LJIILLIIL(liveDrawerDialogV3.LJLJJLL);
            LIZ2.LJIJJ(c08680Vs.LIZJ, "close_type");
            LIZ2.LJIJJ(Integer.valueOf(c08680Vs.LJII()), "has_banner");
            LIZ2.LJIJJ(c08680Vs.LJII, "tab_type");
            LIZ2.LJIJJ(c08680Vs.LJIIJJI, "landing_reason");
            LIZ2.LJIJJ(Integer.valueOf(c08680Vs.LJFF()), str);
            LIZ2.LJIJJ(C08660Vq.LIZ(), str2);
            LIZ2.LJIJJ(c08680Vs.LIZIZ(), "entrance_type");
            LIZ2.LJJIIJZLJL();
            c08680Vs.LIZJ = "scroll";
            String str3 = this.LIZ.LJZI;
            if (o.LJ(str3, "game_drawer") || o.LJ(str3, "game_drawer_drops")) {
                LiveDrawerDialogV3 liveDrawerDialogV32 = this.LIZ;
                Fragment wl = liveDrawerDialogV32.wl(liveDrawerDialogV32.LJZI, true);
                if (wl != null) {
                    wl.setUserVisibleHint(false);
                }
            } else {
                BOO boo = this.LIZ.LJLJL;
                if (boo != null && (fragment = boo.LJLLI) != null) {
                    fragment.setUserVisibleHint(false);
                }
            }
        }
        BJB.LJFF(null);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout$DrawerListener
    public final void onDrawerOpened(View view) {
        o.LJIIIZ(view, "view");
        BJB.LJFF((Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class));
        if (this.LIZ.getUserVisibleHint()) {
            C08680Vs c08680Vs = C08680Vs.LJIILJJIL;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (c08680Vs.LJ() == 0) {
                c08680Vs.LJFF = elapsedRealtime;
            }
            LiveDrawerDialogV3 liveDrawerDialogV3 = this.LIZ;
            liveDrawerDialogV3.getClass();
            liveDrawerDialogV3.LJLJJL = SystemClock.elapsedRealtime();
            BZI LIZ = C28787BRn.LIZ("livesdk_more_anchor_show");
            LIZ.LJIJJ(C28594BKc.LIZJ().LIZLLL(), "request_page");
            LIZ.LJIIL(c08680Vs.LIZLLL);
            LIZ.LJIILLIIL(liveDrawerDialogV3.LJLJJLL);
            LIZ.LJJIIJZLJL();
            DataChannel dataChannel = this.LIZ.LJLJJLL;
            if (dataChannel != null) {
                dataChannel.rv0(LiveExploreDrawerShowChannel.class, Boolean.TRUE);
            }
        }
        if (this.LIZ.getView() != null) {
            this.LIZ.Kl(false);
            this.LIZ.LJLLJ = null;
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout$DrawerListener
    public final void onDrawerSlide(View view, float f) {
        o.LJIIIZ(view, "view");
        if (0.0f == f) {
            BJB.LIZLLL(true);
        }
        if (BJB.LIZ > 0 || BJB.LJ) {
            return;
        }
        BJB.LIZ = System.currentTimeMillis();
        BJB.LIZIZ().put("enter_timestamp", String.valueOf(BJB.LIZ));
    }
}
