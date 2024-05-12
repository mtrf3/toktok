package X;

import com.ss.android.ugc.aweme.feed.landscape.LandscapeFragmentPanel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.JDc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48796JDc implements InterfaceC87433YTd {
    public final /* synthetic */ LandscapeFragmentPanel LIZ;

    @Override // X.InterfaceC87433YTd
    public final String LIZIZ() {
        return "landscape_feed";
    }

    @Override // X.InterfaceC87433YTd
    public final void LIZ() {
        String str;
        String str2;
        InterfaceC46330IGg interfaceC46330IGg = this.LIZ.LJZI;
        if (interfaceC46330IGg != null && !interfaceC46330IGg.isPlaying()) {
            C188727au c188727au = new C188727au();
            M89 m89 = this.LIZ.LJLLLLLL;
            Boolean bool = null;
            if (m89 != null) {
                c188727au.LJIIIZ("enter_from", m89.getEventType());
                Aweme currentPlayAweme = this.LIZ.getCurrentPlayAweme();
                if (currentPlayAweme != null) {
                    str = currentPlayAweme.getAid();
                } else {
                    str = null;
                }
                c188727au.LJIIIZ("group_id", str);
                Aweme currentPlayAweme2 = this.LIZ.getCurrentPlayAweme();
                if (currentPlayAweme2 != null) {
                    str2 = currentPlayAweme2.getAuthorUid();
                } else {
                    str2 = null;
                }
                c188727au.LJIIIZ("author_id", str2);
                FMX.LJIIL("earphone_play_continue", c188727au.LIZ);
                YTW.LIZLLL("landscape_feed");
                LandscapeFragmentPanel landscapeFragmentPanel = this.LIZ;
                landscapeFragmentPanel.handlePlay(landscapeFragmentPanel.LJIIJJI());
                InterfaceC46330IGg interfaceC46330IGg2 = this.LIZ.LJZI;
                if (interfaceC46330IGg2 != null) {
                    bool = Boolean.valueOf(interfaceC46330IGg2.isPlaying());
                }
                YTW.LIZJ(bool, "landscape_feed");
                return;
            }
            o.LJIJI("param");
            throw null;
        }
    }

    public C48796JDc(LandscapeFragmentPanel landscapeFragmentPanel) {
        this.LIZ = landscapeFragmentPanel;
    }
}
