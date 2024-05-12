package X;

import Y.ARunnableS12S0101000_8;
import com.ss.android.ugc.aweme.feed.landscape.LandscapeFragmentPanel;
import com.ss.android.ugc.aweme.feed.landscape.component.LandscapeFeedViewPagerComponent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.KQf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51685KQf implements C0C3 {
    public boolean LJLIL = true;
    public int LJLILLLLZI = -1;
    public final /* synthetic */ LandscapeFeedViewPagerComponent LJLJI;

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
    }

    public C51685KQf(LandscapeFeedViewPagerComponent landscapeFeedViewPagerComponent) {
        this.LJLJI = landscapeFeedViewPagerComponent;
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        String str;
        boolean z;
        int i2 = 0;
        this.LJLIL = false;
        LandscapeFeedViewPagerComponent landscapeFeedViewPagerComponent = this.LJLJI;
        landscapeFeedViewPagerComponent.LJLJJL = i;
        landscapeFeedViewPagerComponent.LJLJLLL = landscapeFeedViewPagerComponent.getAwemeByIndex(i);
        C2MA c2ma = this.LJLJI.LJLJLJ;
        if (c2ma != null) {
            if (i > this.LJLILLLLZI) {
                z = true;
            } else {
                z = false;
            }
            c2ma.t7(z);
        }
        String str2 = null;
        if (this.LJLJI.getCurViewHolder() == null) {
            LandscapeFeedViewPagerComponent landscapeFeedViewPagerComponent2 = this.LJLJI;
            C80796VnM c80796VnM = landscapeFeedViewPagerComponent2.LJLJJI;
            if (c80796VnM != null) {
                c80796VnM.post(new ARunnableS12S0101000_8(i, landscapeFeedViewPagerComponent2, 11));
            }
        } else {
            LandscapeFeedViewPagerComponent landscapeFeedViewPagerComponent3 = this.LJLJI;
            landscapeFeedViewPagerComponent3.LJLJLJ = landscapeFeedViewPagerComponent3.getCurViewHolder();
            LandscapeFeedViewPagerComponent landscapeFeedViewPagerComponent4 = this.LJLJI;
            C2MA c2ma2 = landscapeFeedViewPagerComponent4.LJLJLJ;
            if (c2ma2 != null) {
                c2ma2.l8(i);
                LandscapeFragmentPanel landscapeFragmentPanel = (LandscapeFragmentPanel) landscapeFeedViewPagerComponent4.LJLL.getValue();
                if (landscapeFragmentPanel != null) {
                    Aweme aweme = c2ma2.getAweme();
                    M89 m89 = landscapeFeedViewPagerComponent4.getPanelContext().LIZJ;
                    if (m89 != null) {
                        str = m89.getEventType();
                    } else {
                        str = null;
                    }
                    M89 m892 = landscapeFeedViewPagerComponent4.getPanelContext().LIZJ;
                    if (m892 != null) {
                        i2 = m892.getPageType();
                    }
                    C2U8.LIZ(new C55391LoZ(aweme, str, i2, landscapeFragmentPanel));
                }
            }
        }
        Aweme aweme2 = this.LJLJI.LJLJLLL;
        if (aweme2 != null) {
            str2 = aweme2.getAid();
        }
        C2U8.LIZ(new J8H(str2, C56509MFt.LIZLLL(this.LJLJI.getPanelContext()), C79004UzY.LJJIJIIJI(this.LJLJI.getContext())));
        Iterator it = ((ArrayList) this.LJLJI.LJLJJLL).iterator();
        while (it.hasNext()) {
            ((InterfaceC88472Yns) it.next()).invoke(Integer.valueOf(i));
        }
        this.LJLILLLLZI = i;
    }

    @Override // X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
        if (this.LJLIL && f == 0.0f && i2 == 0) {
            onPageSelected(i);
        }
    }
}
