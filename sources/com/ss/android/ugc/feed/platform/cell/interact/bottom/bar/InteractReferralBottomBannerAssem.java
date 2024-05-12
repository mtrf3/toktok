package com.ss.android.ugc.feed.platform.cell.interact.bottom.bar;

import X.C58096Mr6;
import X.C59038NFa;
import X.C79234V7u;
import android.content.Context;
import com.bytedance.touchpoint.core.model.TextLink;
import com.ss.android.ugc.aweme.feed.IFeedSpecActService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.bottom.banner.FeedBottomBannerConfig;
import com.ss.android.ugc.aweme.specact.SpecActServiceImpl;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS191S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class InteractReferralBottomBannerAssem extends InteractBottomBannerAssem<InteractReferralBottomBannerAssem> {
    public final String LLII;

    public InteractReferralBottomBannerAssem() {
        new LinkedHashMap();
        this.LLII = "bottom_banner_referral";
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem
    public final String r4() {
        return this.LLII;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem
    public final void F4(VideoItemParams item) {
        IFeedSpecActService iFeedSpecActService;
        o.LJIIIZ(item, "item");
        super.F4(item);
        Object LIZ = C58096Mr6.LIZ(IFeedSpecActService.class, false);
        if (LIZ != null) {
            iFeedSpecActService = (IFeedSpecActService) LIZ;
        } else {
            if (C58096Mr6.h7 == null) {
                synchronized (IFeedSpecActService.class) {
                    if (C58096Mr6.h7 == null) {
                        C58096Mr6.h7 = new SpecActServiceImpl();
                    }
                }
            }
            iFeedSpecActService = C58096Mr6.h7;
        }
        Context context = getContainerView().getContext();
        o.LJIIIIZZ(context, "containerView.context");
        TextLink textLink = item.textLink;
        Aweme aweme = item.getAweme();
        o.LJIIIIZZ(aweme, "item.aweme");
        iFeedSpecActService.LJJIL(context, textLink, aweme, new AqS175S0100000_9(this, 356), new AqS191S0100000_9(this, 59));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem
    public final boolean P2(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        return C79234V7u.LJJIIJ(item);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem
    public final FeedBottomBannerConfig B4(Context context, FeedBottomBannerConfig.Builder bottomBannerBuilder) {
        o.LJIIIZ(bottomBannerBuilder, "bottomBannerBuilder");
        bottomBannerBuilder.setIconWithRemoteLighten(C59038NFa.INSTANCE);
        bottomBannerBuilder.setUpdateTitleSync(false);
        FeedBottomBannerConfig.Builder.setInteractionWithArrow$default(bottomBannerBuilder, null, 1, null);
        return bottomBannerBuilder.build();
    }
}
