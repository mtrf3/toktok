package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel;
import kotlin.jvm.internal.o;

/* renamed from: X.LjD, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C55059LjD extends C78588Usq {
    public final /* synthetic */ FullFeedFragmentPanel LJLILLLLZI;

    public C55059LjD(FullFeedFragmentPanel fullFeedFragmentPanel) {
        this.LJLILLLLZI = fullFeedFragmentPanel;
    }

    @Override // X.C78588Usq, X.PRT
    public final void LIZIZ(String type) {
        C80796VnM c80796VnM;
        o.LJIIIZ(type, "type");
        InterfaceC55057LjB LIZIZ = C40443Fu3.LIZIZ(type);
        if (LIZIZ != null && (c80796VnM = this.LJLILLLLZI.mViewPager) != null) {
            int currentItem = c80796VnM.getCurrentItem();
            Aweme item = this.LJLILLLLZI.mAdapter.getItem(currentItem);
            LIZIZ.LIZ("launch_vv", Integer.toString(currentItem));
            LIZIZ.LIZ("current_video", C40438Fty.LIZ(item));
        }
    }

    @Override // X.C78588Usq, X.PRT
    public final void onStop(String type) {
        o.LJIIIZ(type, "type");
        InterfaceC55057LjB LIZIZ = C40443Fu3.LIZIZ(type);
        if (LIZIZ != null) {
            LIZIZ.LIZ("next_video", C40438Fty.LIZ(this.LJLILLLLZI.mAdapter.getItem(this.LJLILLLLZI.mViewPager.getCurrentItem())));
        }
    }
}
