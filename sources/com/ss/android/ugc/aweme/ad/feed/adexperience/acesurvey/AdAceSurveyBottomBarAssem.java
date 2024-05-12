package com.ss.android.ugc.aweme.ad.feed.adexperience.acesurvey;

import X.AbstractC59064NGa;
import X.C0M6;
import X.C141335gf;
import X.C1E4;
import X.C221108m2;
import X.C26045AKb;
import X.C3C5;
import X.C45804HyK;
import X.C47261Igj;
import X.C51029K0z;
import X.C56642Ke;
import X.C59027NEp;
import X.C59028NEq;
import X.C59030NEs;
import X.C62822Ol8;
import X.C76800UCe;
import X.C79057V0z;
import X.NFM;
import X.NFN;
import X.NFP;
import X.QD3;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.ad.feed.adexperience.event.AdExperienceEventLogger;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.bottom.banner.FeedBottomBannerConfig;
import com.ss.android.ugc.aweme.feed.model.bottom.banner.FeedBottomBannerUIProps;
import com.ss.android.ugc.aweme.feed.model.commercialize.adexperience.CommerceAceSurveyInfo;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS32S1300000_10;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes11.dex */
public final class AdAceSurveyBottomBarAssem extends InteractBottomBannerAssem<AdAceSurveyBottomBarAssem> {
    public final AdExperienceEventLogger LLII;
    public final C62822Ol8 LLIIII;
    public final String LLIIIILZ;

    public AdAceSurveyBottomBarAssem() {
        new LinkedHashMap();
        this.LLII = new AdExperienceEventLogger();
        this.LLIIII = C221108m2.LIZIZ(NFM.LJLIL);
        this.LLIIIILZ = "bottom_banner_commerce_ace_disclaimer";
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem
    public final boolean E4() {
        if (this.LJLLLL) {
            if (getContainerView().getVisibility() == 8 || Y3().getVisibility() == 8) {
                getContainerView().setVisibility(0);
                Y3().setVisibility(0);
            }
            ViewGroup.LayoutParams layoutParams = Y3().getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null && marginLayoutParams.bottomMargin < 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void Z3() {
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem
    public final String r4() {
        return this.LLIIIILZ;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem
    /* renamed from: C4 */
    public final void F0(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        super.F0(item);
        this.LLII.LJIIJ(item.getAweme());
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem, X.C8XO
    /* renamed from: F0 */
    public final /* bridge */ /* synthetic */ void q4(Object obj) {
        F0((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem
    public final void F4(VideoItemParams item) {
        String str;
        String str2;
        o.LJIIIZ(item, "item");
        super.F4(item);
        getContainerView().setVisibility(0);
        Aweme aweme = item.getAweme();
        o.LJIIIIZZ(aweme, "item.aweme");
        CommerceAceSurveyInfo LJIJI = C79057V0z.LJIJI(aweme);
        if (LJIJI == null || (str = LJIJI.getText()) == null) {
            str = "How was your last shopping experience";
        }
        CommerceAceSurveyInfo LJIJI2 = C79057V0z.LJIJI(aweme);
        if (LJIJI2 == null || (str2 = LJIJI2.getButtonText()) == null) {
            str2 = "Review";
        }
        FeedBottomBannerConfig.Builder builder = u4().toBuilder();
        builder.setInteractionWithButton(new AqS32S1300000_10(str2, this, aweme, item, 0));
        D4(builder);
        G4(C47261Igj.LJJIJ(new FeedBottomBannerUIProps.Title(str)));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem
    public final boolean P2(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        Aweme aweme = item.getAweme();
        o.LJIIIIZZ(aweme, "item.aweme");
        return C1E4.LJJIJ(aweme);
    }

    @QD3
    public final void onEvent$commercialize_feed_impl_release(C56642Ke c56642Ke) {
        Activity LJIJJ;
        if (c56642Ke == null) {
            return;
        }
        try {
            if (TextUtils.equals("commerce_ace_star_scored", JSONObjectProtectorUtils.getString(c56642Ke.LJLIL, "eventName"))) {
                int i = JSONObjectProtectorUtils.getInt(JSONObjectProtectorUtils.getJSONObject(c56642Ke.LJLIL, "data"), "score");
                C59028NEq LIZ = C59027NEp.LIZ();
                String LJIJJ2 = C79057V0z.LJIJJ(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme());
                if (LJIJJ2 == null) {
                    LIZ.getClass();
                } else {
                    C0M6<String, C59030NEs> c0m6 = LIZ.LIZIZ;
                    if (c0m6 != null) {
                        c0m6.LIZJ(LJIJJ2, new C59030NEs(i, false, 4));
                    }
                }
                Context context = getContext();
                if (context != null && (LJIJJ = C45804HyK.LJIJJ(context)) != null) {
                    C26045AKb c26045AKb = new C26045AKb(LJIJJ);
                    c26045AKb.LJIIIIZZ(R.string.b67);
                    c26045AKb.LJIIJ();
                }
                AbstractC59064NGa abstractC59064NGa = ((NFN) this.LLIIII.getValue()).LIZ;
                if (abstractC59064NGa != null) {
                    abstractC59064NGa.LJFF();
                }
                ((NFN) this.LLIIII.getValue()).LIZIZ(NFP.LIZ(), getContext(), C79057V0z.LJIIIIZZ(i, "followup1", ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme()), null);
            }
            if (TextUtils.equals("card_rate_feedback_submit", JSONObjectProtectorUtils.getString(c56642Ke.LJLIL, "eventName"))) {
                C59028NEq LIZ2 = C59027NEp.LIZ();
                String LJIJJ3 = C79057V0z.LJIJJ(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme());
                if (LJIJJ3 == null) {
                    LIZ2.getClass();
                } else {
                    C0M6<String, C59030NEs> c0m62 = LIZ2.LIZIZ;
                    if (c0m62 != null) {
                        c0m62.LIZJ(LJIJJ3, new C59030NEs(0, true, 3));
                    }
                }
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem, com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8MQ
    public final void B2(int i, Aweme aweme) {
        super.B2(i, aweme);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem
    public final FeedBottomBannerConfig B4(Context context, FeedBottomBannerConfig.Builder bottomBannerBuilder) {
        o.LJIIIZ(bottomBannerBuilder, "bottomBannerBuilder");
        bottomBannerBuilder.setIconWithLocalRes(R.raw.icon_script_fill);
        bottomBannerBuilder.setUpdateTitleSync(false);
        return bottomBannerBuilder.build();
    }
}
