package X;

import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.landscape.component.LandscapeFeedEarphonePlayerControlComponent;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedPlayerAbility;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.JDd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48797JDd implements InterfaceC87433YTd {
    public final /* synthetic */ LandscapeFeedEarphonePlayerControlComponent LIZ;

    @Override // X.InterfaceC87433YTd
    public final String LIZIZ() {
        return "landscape_feed";
    }

    @Override // X.InterfaceC87433YTd
    public final void LIZ() {
        Boolean bool;
        Aweme aweme;
        String str;
        Aweme currentPlayAweme;
        LandscapeFeedPlayerAbility x3 = this.LIZ.x3();
        if (x3 != null && x3.isPaused()) {
            YTW.LIZLLL("landscape_feed");
            LandscapeFeedPlayerAbility x32 = this.LIZ.x3();
            String str2 = null;
            if (x32 != null) {
                LandscapeFeedViewPagerAbility A3 = this.LIZ.A3();
                if (A3 != null && (currentPlayAweme = A3.getCurrentPlayAweme()) != null) {
                    x32.Ft0(currentPlayAweme);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            LandscapeFeedPlayerAbility x33 = this.LIZ.x3();
            if (x33 != null) {
                bool = Boolean.valueOf(x33.isPlaying());
            } else {
                bool = null;
            }
            YTW.LIZJ(bool, "landscape_feed");
            IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this.LIZ), IFeedPanelPlatformAbility.class, null);
            if (iFeedPanelPlatformAbility != null) {
                aweme = iFeedPanelPlatformAbility.getCurrentAweme();
            } else {
                aweme = null;
            }
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", C56509MFt.LIZLLL(this.LIZ.getPanelContext()));
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            c188727au.LJIIIZ("group_id", str);
            if (aweme != null) {
                str2 = aweme.getAuthorUid();
            }
            c188727au.LJIIIZ("author_id", str2);
            FMX.LJIIL("earphone_play_continue", c188727au.LIZ);
        }
    }

    public C48797JDd(LandscapeFeedEarphonePlayerControlComponent landscapeFeedEarphonePlayerControlComponent) {
        this.LIZ = landscapeFeedEarphonePlayerControlComponent;
    }
}
