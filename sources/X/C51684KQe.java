package X;

import Y.ARunnableS12S0101000_8;
import com.ss.android.ugc.aweme.feed.landscape.LandscapeFragmentPanel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.KQe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51684KQe implements C0C3 {
    public int LJLIL = -1;
    public final /* synthetic */ LandscapeFragmentPanel LJLILLLLZI;

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
    }

    public C51684KQe(LandscapeFragmentPanel landscapeFragmentPanel) {
        this.LJLILLLLZI = landscapeFragmentPanel;
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        Aweme aweme;
        Aweme aweme2;
        C2MA curViewHolder;
        LandscapeFragmentPanel landscapeFragmentPanel = this.LJLILLLLZI;
        C55083Ljb c55083Ljb = landscapeFragmentPanel.LJLJJL;
        String str = null;
        if (c55083Ljb != null) {
            aweme = c55083Ljb.getItem(i);
        } else {
            aweme = null;
        }
        landscapeFragmentPanel.LJLJLLL = aweme;
        LandscapeFragmentPanel landscapeFragmentPanel2 = this.LJLILLLLZI;
        C55083Ljb c55083Ljb2 = landscapeFragmentPanel2.LJLJJL;
        if (c55083Ljb2 != null) {
            aweme2 = c55083Ljb2.getItem(i);
        } else {
            aweme2 = null;
        }
        boolean z = false;
        if ((aweme2 != null || !C58552Rn.LIZ) && ((curViewHolder = landscapeFragmentPanel2.getCurViewHolder()) != null || !C58552Rn.LIZ)) {
            C48662J7y c48662J7y = landscapeFragmentPanel2.LJLJJLL;
            if (c48662J7y != null) {
                c48662J7y.LJJZZI(curViewHolder, true);
            }
            if (aweme2 != null && !aweme2.isLive() && !aweme2.isCanPlay()) {
                C36922EeM.LIZLLL(6, "LandscapeFragmentPanel", "onPageSelected-> aweme can't play!");
            } else {
                C58152Pz.LIZJ("tryPlay", landscapeFragmentPanel2.LJIIZILJ(curViewHolder, aweme2, false));
            }
        }
        LandscapeFragmentPanel landscapeFragmentPanel3 = this.LJLILLLLZI;
        landscapeFragmentPanel3.LJZL = false;
        C2MA c2ma = landscapeFragmentPanel3.LLD;
        if (c2ma != null) {
            if (i > this.LJLIL) {
                z = true;
            }
            c2ma.t7(z);
        }
        if (this.LJLILLLLZI.getCurViewHolder() == null) {
            LandscapeFragmentPanel landscapeFragmentPanel4 = this.LJLILLLLZI;
            C80796VnM c80796VnM = landscapeFragmentPanel4.LJLIL;
            if (c80796VnM != null) {
                c80796VnM.post(new ARunnableS12S0101000_8(i, landscapeFragmentPanel4, 10));
            } else {
                o.LJIJI("viewPager");
                throw null;
            }
        } else {
            LandscapeFragmentPanel landscapeFragmentPanel5 = this.LJLILLLLZI;
            landscapeFragmentPanel5.LLD = landscapeFragmentPanel5.getCurViewHolder();
            LandscapeFragmentPanel landscapeFragmentPanel6 = this.LJLILLLLZI;
            C2MA c2ma2 = landscapeFragmentPanel6.LLD;
            if (c2ma2 != null) {
                c2ma2.l8(i);
                Aweme aweme3 = c2ma2.getAweme();
                M89 m89 = landscapeFragmentPanel6.LJLLLLLL;
                if (m89 != null) {
                    String eventType = m89.getEventType();
                    M89 m892 = landscapeFragmentPanel6.LJLLLLLL;
                    if (m892 != null) {
                        C2U8.LIZ(new C55391LoZ(aweme3, eventType, m892.getPageType(), landscapeFragmentPanel6));
                    } else {
                        o.LJIJI("param");
                        throw null;
                    }
                } else {
                    o.LJIJI("param");
                    throw null;
                }
            }
        }
        Aweme LJIIJJI = this.LJLILLLLZI.LJIIJJI();
        if (LJIIJJI != null) {
            str = LJIIJJI.getAid();
        }
        C2U8.LIZ(new J8H(str, this.LJLILLLLZI.getEventType(), C79004UzY.LJJIJIIJI(this.LJLILLLLZI.getContext())));
        this.LJLIL = i;
    }

    @Override // X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
        if (this.LJLILLLLZI.LJZL && f == 0.0f && i2 == 0) {
            onPageSelected(i);
        }
    }
}
