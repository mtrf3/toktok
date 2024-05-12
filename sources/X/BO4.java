package X;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.livesdk.feed.drawerfeed.DrawerFeedLiveFragmentV2;

/* loaded from: classes6.dex */
public final class BO4 implements C44 {
    public final /* synthetic */ DrawerFeedLiveFragmentV2 LIZ;

    @Override // X.C44
    public final void onFailed(Throwable th) {
    }

    public BO4(DrawerFeedLiveFragmentV2 drawerFeedLiveFragmentV2) {
        this.LIZ = drawerFeedLiveFragmentV2;
    }

    @Override // X.C44
    public final void LIZ(Boolean bool, C29180Bcm c29180Bcm, BUT but) {
        boolean z;
        View view;
        DrawerFeedLiveFragmentV2 drawerFeedLiveFragmentV2 = this.LIZ;
        if (bool.booleanValue() && TextUtils.equals(this.LIZ.LJLLL, "foru")) {
            z = true;
        } else {
            z = false;
        }
        drawerFeedLiveFragmentV2.LJLLI = z;
        DrawerFeedLiveFragmentV2 drawerFeedLiveFragmentV22 = this.LIZ;
        if (drawerFeedLiveFragmentV22.LJLLI && (view = drawerFeedLiveFragmentV22.LJLJI) != null) {
            view.setVisibility(0);
            this.LIZ.getClass();
            DrawerFeedLiveFragmentV2.Al("show");
        }
    }
}
