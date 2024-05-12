package X;

import Y.ARunnableS8S0301000_7;
import Y.IDRunnableS6S0101000;
import Y.IDiS271S0100000_9;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.main.MainPageFragment;

/* loaded from: classes10.dex */
public final class LPJ implements InterfaceC55336Lng {
    public final Context LIZ;
    public final C54206LPe LIZIZ;
    public final C54297LSr LIZJ;
    public final ScrollSwitchStateManager LIZLLL;
    public final HomePageDataViewModel LJ;

    @Override // X.InterfaceC55336Lng
    public final void LIZIZ() {
        LIZLLL(null, false);
    }

    @Override // X.InterfaceC55336Lng
    public final void LIZ(IDiS271S0100000_9 iDiS271S0100000_9) {
        C54206LPe c54206LPe = this.LIZIZ;
        if (c54206LPe != null) {
            c54206LPe.LJFF(iDiS271S0100000_9);
        }
    }

    @Override // X.InterfaceC55336Lng
    public final void l7(String str) {
        if (this.LIZIZ != null) {
            Z8A.LIZIZ.updateProfilePageFragmentParams(this.LIZLLL.iv0("page_profile"), str);
        }
    }

    @Override // X.InterfaceC55336Lng
    public final void J1(Aweme aweme, String str) {
        if (this.LIZIZ != null) {
            if (C53765L8f.LJIJJLI()) {
                C37179EiV.LJFF.post(new ARunnableS8S0301000_7(1, this, aweme, str, 2));
            } else {
                LIZJ(aweme, str);
            }
            this.LJ.LJLL = true;
            ScrollSwitchStateManager scrollSwitchStateManager = this.LIZLLL;
            Z8A.LIZIZ.updateProfilePageFragmentParams(scrollSwitchStateManager.jv0(scrollSwitchStateManager.nv0("page_profile")), str, this.LJ.LJLL);
            if (C53765L8f.LJIJJLI()) {
                C1DH.LJJIJIIJI(new IDRunnableS6S0101000(10, this, 14));
            } else {
                this.LIZLLL.E50("page_profile", true);
            }
        } else {
            C36922EeM.LIZLLL(4, "FeedAvatarView", "mViewPager is null");
        }
        C48027It5.LIZLLL("feed", "hot");
    }

    public final void LIZJ(Aweme aweme, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("toProfilePage() called with: mViewPager = [");
        LIZ.append(this.LIZIZ);
        LIZ.append("], aweme = [");
        LIZ.append(aweme);
        LIZ.append("], enterMethod = [");
        LIZ.append(str);
        LIZ.append("]viewPageSize");
        LIZ.append(this.LIZIZ.getItemCount());
        LIZ.append(" pageType ");
        LIZ.append("page_profile");
        C36922EeM.LIZLLL(4, "FeedAvatarView", X1D.LIZIZ(LIZ));
    }

    public final boolean LIZLLL(Boolean bool, boolean z) {
        boolean z2;
        if (this.LIZIZ != null) {
            if (TextUtils.equals("page_feed", this.LIZLLL.hv0())) {
                boolean equals = TextUtils.equals("page_feed", this.LIZLLL.hv0());
                ScrollSwitchStateManager scrollSwitchStateManager = this.LIZLLL;
                boolean z3 = scrollSwitchStateManager.jv0(scrollSwitchStateManager.nv0("page_feed")) instanceof MainPageFragment;
                if (this.LIZJ != null && z3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!equals || !z2) {
                    ScrollSwitchStateManager scrollSwitchStateManager2 = this.LIZLLL;
                    return scrollSwitchStateManager2.jv0(scrollSwitchStateManager2.nv0("page_feed")) instanceof MainPageFragment;
                }
            } else {
                if (z && C45804HyK.LJJIFFI(this.LIZ) != null) {
                    C54154LNe.LJ("profile_2_feed", C54154LNe.LIZIZ(C45804HyK.LJJIFFI(this.LIZ)));
                }
                if (bool != null) {
                    this.LIZLLL.E50("page_feed", bool.booleanValue());
                } else {
                    ScrollSwitchStateManager scrollSwitchStateManager3 = this.LIZLLL;
                    scrollSwitchStateManager3.LJLIL.setValue(scrollSwitchStateManager3.nv0("page_feed"));
                }
                return true;
            }
        }
        return false;
    }

    public LPJ(Context context, C54206LPe c54206LPe, C54297LSr c54297LSr) {
        boolean z;
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI != null) {
            this.LIZLLL = C84193Sd.LIZ(LJJIFFI);
            this.LJ = C3SZ.LIZ(LJJIFFI);
        }
        this.LIZ = context;
        this.LIZIZ = c54206LPe;
        this.LIZJ = c54297LSr;
        if (c54206LPe != null) {
            try {
                SettingsManager.LIZLLL().getClass();
                z = SettingsManager.LIZ("enable_ad_scroll_judge", true);
            } catch (Throwable unused) {
                z = true;
            }
            c54206LPe.LLJJJJLIIL = z;
            if (LJJIFFI != null) {
                c54206LPe.LLJILJILJ.LIZLLL(LJJIFFI.getWindow(), true);
            }
        }
    }
}
