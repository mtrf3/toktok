package com.ss.android.ugc.feed.platform.cell.interact.bottom.bar;

import X.C221108m2;
import X.C47261Igj;
import X.C52376Kh2;
import X.C62822Ol8;
import X.C8T8;
import X.NK7;
import Y.ACListenerS29S1200000_10;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.bottom.banner.FeedBottomBannerConfig;
import com.ss.android.ugc.aweme.feed.model.bottom.banner.FeedBottomBannerUIProps;
import com.ss.android.ugc.aweme.feed.model.live.RelatedLiveTagStruct;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class GameLiveBottomBarAssem extends InteractBottomBannerAssem<GameLiveBottomBarAssem> {
    public NK7 LLII;
    public final C62822Ol8 LLIIII;

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem
    public final String r4() {
        return "bottom_banner_game_live";
    }

    public GameLiveBottomBarAssem() {
        new LinkedHashMap();
        this.LLIIII = C221108m2.LIZIZ(C52376Kh2.LJLIL);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem
    public final void F4(VideoItemParams item) {
        String str;
        String str2;
        o.LJIIIZ(item, "item");
        super.F4(item);
        RelatedLiveTagStruct relatedLiveTag = item.getAweme().getRelatedLiveTag();
        String str3 = null;
        if (relatedLiveTag != null) {
            str = relatedLiveTag.getContent();
        } else {
            str = null;
        }
        RelatedLiveTagStruct relatedLiveTag2 = item.getAweme().getRelatedLiveTag();
        if (relatedLiveTag2 != null) {
            str2 = relatedLiveTag2.getRelatedLiveTag();
        } else {
            str2 = null;
        }
        RelatedLiveTagStruct relatedLiveTag3 = item.getAweme().getRelatedLiveTag();
        if (relatedLiveTag3 != null) {
            str3 = relatedLiveTag3.getTagName();
        }
        if (str2 == null || str2.length() == 0 || str == null || str.length() == 0 || str3 == null || str3.length() == 0) {
            getContainerView().setVisibility(8);
        } else {
            G4(C47261Igj.LJJIJ(new FeedBottomBannerUIProps.Title(str)));
            q4(new ACListenerS29S1200000_10(this, item, str2, 0));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem
    public final boolean P2(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        return C8T8.LIZIZ(item);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.InteractBottomBannerAssem
    public final FeedBottomBannerConfig B4(Context context, FeedBottomBannerConfig.Builder bottomBannerBuilder) {
        o.LJIIIZ(bottomBannerBuilder, "bottomBannerBuilder");
        bottomBannerBuilder.setIconWithLocalRes(R.raw.icon_live_tv_fill);
        bottomBannerBuilder.setUpdateTitleSync(false);
        FeedBottomBannerConfig.Builder.setInteractionWithArrow$default(bottomBannerBuilder, null, 1, null);
        return bottomBannerBuilder.build();
    }
}
