package com.ss.android.ugc.aweme.commercialize.topview;

import X.InterfaceC65349Pkn;
import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import com.ss.android.ugc.aweme.commercialize.model.OmVast;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class TopViewAwemeRawAd extends CommonAdData {
    public Integer LJLIL;

    @InterfaceC65349Pkn("ad_id")
    public final Long adId;

    @InterfaceC65349Pkn("vast")
    public final OmVast omVast;

    @InterfaceC65349Pkn("splash_info")
    public final AwemeSplashInfo splashInfo;

    @Override // com.bytedance.ies.ugc.aweme.rich.model.CommonAdData
    public int getChargeType() {
        Integer num = this.LJLIL;
        if (num != null) {
            return num.intValue();
        }
        return super.getChargeType();
    }

    public final Long getAdId() {
        return this.adId;
    }

    public final OmVast getOmVast() {
        return this.omVast;
    }

    public final AwemeSplashInfo getSplashInfo() {
        return this.splashInfo;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TopViewAwemeRawAd(AwemeRawAd awemeRawAd) {
        this(awemeRawAd.getAdId(), awemeRawAd.getSplashInfo(), awemeRawAd.getOmVast());
        o.LJIIIZ(awemeRawAd, "awemeRawAd");
        setCreativeId(awemeRawAd.getCreativeId());
        setLogExtra(awemeRawAd.getLogExtra());
        setGroupId(awemeRawAd.getGroupId());
        setSystemOrigin(awemeRawAd.getSystemOrigin());
        this.LJLIL = Integer.valueOf(awemeRawAd.getChargeType());
    }

    public TopViewAwemeRawAd(Long l, AwemeSplashInfo awemeSplashInfo, OmVast omVast) {
        this.adId = l;
        this.splashInfo = awemeSplashInfo;
        this.omVast = omVast;
    }

    public /* synthetic */ TopViewAwemeRawAd(Long l, AwemeSplashInfo awemeSplashInfo, OmVast omVast, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, awemeSplashInfo, omVast);
    }
}
