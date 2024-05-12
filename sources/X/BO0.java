package X;

import androidx.lifecycle.Observer;
import com.bytedance.android.livesdk.feed.drawerfeed.DrawerFeedLiveFragmentV2;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public final class BO0 implements Observer<C06900Ow> {
    public boolean LJLIL = true;
    public final /* synthetic */ DrawerFeedLiveFragmentV2 LJLILLLLZI;

    public BO0(DrawerFeedLiveFragmentV2 drawerFeedLiveFragmentV2) {
        this.LJLILLLLZI = drawerFeedLiveFragmentV2;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C06900Ow c06900Ow) {
        boolean z;
        C06900Ow c06900Ow2 = c06900Ow;
        boolean z2 = false;
        if (c06900Ow2.LIZ == EnumC06890Ov.RUNNING) {
            z = true;
        } else {
            z = false;
        }
        DrawerFeedLiveFragmentV2 drawerFeedLiveFragmentV2 = this.LJLILLLLZI;
        C223318pb c223318pb = drawerFeedLiveFragmentV2.LJLIL;
        boolean z3 = c223318pb.LLIIIZ;
        if (z) {
            BL7 bl7 = drawerFeedLiveFragmentV2.LJLL;
            if (bl7 != null && !z3 && drawerFeedLiveFragmentV2.LJLLLLLL) {
                bl7.LJII();
            }
            if (!this.LJLIL) {
                BZI LIZ = C28787BRn.LIZ("livesdk_explore_refresh");
                C08680Vs c08680Vs = C08680Vs.LJIILJJIL;
                LIZ.LJIJJ(Integer.valueOf(c08680Vs.LJII()), "has_banner");
                LIZ.LJIJJ(this.LJLILLLLZI.LJLLL, "tab_type");
                LIZ.LJIJJ(c08680Vs.LJIIJJI, "landing_reason");
                LIZ.LJIJJ(Integer.valueOf(c08680Vs.LJFF()), C08680Vs.LJIIZILJ);
                LIZ.LJIJJ(C08660Vq.LIZ(), C08680Vs.LJIJ);
                LIZ.LJIJJ(c08680Vs.LIZIZ(), "entrance_type");
                LIZ.LJIIZILJ();
                LIZ.LJJIIJZLJL();
            }
            this.LJLIL = false;
            return;
        }
        c223318pb.setRefreshing(false);
        BL7 bl72 = this.LJLILLLLZI.LJLL;
        if (bl72 != null) {
            bl72.LJIJ();
        }
        DrawerFeedLiveFragmentV2 drawerFeedLiveFragmentV22 = this.LJLILLLLZI;
        if (!drawerFeedLiveFragmentV22.LJLLLL) {
            drawerFeedLiveFragmentV22.LJLLLL = true;
            if (drawerFeedLiveFragmentV22.LJLLLLLL) {
                drawerFeedLiveFragmentV22.xl();
            }
        }
        if (c06900Ow2.LIZ != EnumC06890Ov.FAILED) {
            return;
        }
        this.LJLILLLLZI.getContext();
        try {
            z2 = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
        }
        if (z2) {
            return;
        }
        C30868C9o.LIZLLL(R.string.sqr, this.LJLILLLLZI.getContext());
    }
}
