package X;

import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.detail.platform.DetailPageComponent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.LjF, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55061LjF extends C78588Usq {
    public final /* synthetic */ DetailPageComponent LJLILLLLZI;

    public C55061LjF(DetailPageComponent detailPageComponent) {
        this.LJLILLLLZI = detailPageComponent;
    }

    @Override // X.C78588Usq, X.PRT
    public final void LIZIZ(String type) {
        InterfaceC55062LjG interfaceC55062LjG;
        InterfaceC55057LjB LIZIZ;
        o.LJIIIZ(type, "type");
        DetailFragmentPanel detailFragmentPanel = this.LJLILLLLZI.LJZL;
        if (detailFragmentPanel == null) {
            return;
        }
        C80796VnM viewPager = detailFragmentPanel.getViewPager();
        DetailFragmentPanel detailFragmentPanel2 = this.LJLILLLLZI.LJZL;
        if (detailFragmentPanel2 != null) {
            interfaceC55062LjG = detailFragmentPanel2.getAdapter();
        } else {
            interfaceC55062LjG = null;
        }
        if (viewPager != null && interfaceC55062LjG != null && (LIZIZ = C40443Fu3.LIZIZ(type)) != null) {
            int currentItem = viewPager.getCurrentItem();
            Aweme item = interfaceC55062LjG.getItem(currentItem);
            String num = Integer.toString(currentItem);
            o.LJIIIIZZ(num, "toString(position)");
            LIZIZ.LIZ("launch_vv", num);
            LIZIZ.LIZ("current_video", C40438Fty.LIZ(item));
            if (this.LJLILLLLZI.LJZ.isStoryPage()) {
                String eventType = this.LJLILLLLZI.LJZ.getEventType();
                o.LJI(eventType);
                LIZIZ.LIZ("enter_from", eventType);
                LIZIZ.LIZ("extra_desc", "story_vertical_viewpager");
            }
        }
    }

    @Override // X.C78588Usq, X.PRT
    public final void onStop(String type) {
        C80796VnM c80796VnM;
        InterfaceC55057LjB LIZIZ;
        o.LJIIIZ(type, "type");
        DetailFragmentPanel detailFragmentPanel = this.LJLILLLLZI.LJZL;
        InterfaceC55062LjG interfaceC55062LjG = null;
        if (detailFragmentPanel != null) {
            c80796VnM = detailFragmentPanel.getViewPager();
        } else {
            c80796VnM = null;
        }
        DetailFragmentPanel detailFragmentPanel2 = this.LJLILLLLZI.LJZL;
        if (detailFragmentPanel2 != null) {
            interfaceC55062LjG = detailFragmentPanel2.getAdapter();
        }
        if (c80796VnM != null && interfaceC55062LjG != null && (LIZIZ = C40443Fu3.LIZIZ(type)) != null) {
            LIZIZ.LIZ("next_video", C40438Fty.LIZ(interfaceC55062LjG.getItem(c80796VnM.getCurrentItem())));
        }
    }
}
