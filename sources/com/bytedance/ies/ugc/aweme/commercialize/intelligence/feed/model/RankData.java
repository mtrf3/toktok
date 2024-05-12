package com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed.model;

import X.C72074SQk;
import X.InterfaceC65349Pkn;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.pitaya.model.RollAdData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RankData implements Serializable {
    public static final C72074SQk Companion = new C72074SQk();
    public final transient Aweme LJLIL;
    public final transient boolean LJLILLLLZI;

    @InterfaceC65349Pkn("aweme_id")
    public final String aid;

    @InterfaceC65349Pkn("aweme_type")
    public final int awemeType;

    @InterfaceC65349Pkn("commerce_rerank_info")
    public final CommerceRerankInfo commerceRerankInfo;

    @InterfaceC65349Pkn("music_begin_time_in_ms")
    public final int musicBeginTimeInMs;

    @InterfaceC65349Pkn("music_end_time_in_ms")
    public final int musicEndTimeInMs;

    @InterfaceC65349Pkn("raw_ad_data")
    public final RawAdData rawAd;

    @InterfaceC65349Pkn("roll_ad_data")
    public RollAdData rollAdData;

    @InterfaceC65349Pkn("roll_type")
    public final int rollType;

    public static final RankData transAwemeToRankData(Aweme aweme) {
        Companion.getClass();
        return C72074SQk.LIZ(aweme);
    }

    public final String getAid() {
        return this.aid;
    }

    public final int getAwemeType() {
        return this.awemeType;
    }

    public final CommerceRerankInfo getCommerceRerankInfo() {
        return this.commerceRerankInfo;
    }

    public final int getMusicBeginTimeInMs() {
        return this.musicBeginTimeInMs;
    }

    public final int getMusicEndTimeInMs() {
        return this.musicEndTimeInMs;
    }

    public final Aweme getOriginItem() {
        return this.LJLIL;
    }

    public final RawAdData getRawAd() {
        return this.rawAd;
    }

    public final RollAdData getRollAdData() {
        return this.rollAdData;
    }

    public final int getRollType() {
        return this.rollType;
    }

    public final boolean isAd() {
        return this.LJLILLLLZI;
    }

    public final void setRollAdData(RollAdData rollAdData) {
        this.rollAdData = rollAdData;
    }

    public RankData(String aid, int i, int i2, int i3, CommerceRerankInfo commerceRerankInfo, Aweme originItem, RawAdData rawAdData, int i4, RollAdData rollAdData) {
        boolean z;
        o.LJIIIZ(aid, "aid");
        o.LJIIIZ(commerceRerankInfo, "commerceRerankInfo");
        o.LJIIIZ(originItem, "originItem");
        this.aid = aid;
        this.awemeType = i;
        this.musicBeginTimeInMs = i2;
        this.musicEndTimeInMs = i3;
        this.commerceRerankInfo = commerceRerankInfo;
        this.LJLIL = originItem;
        this.rawAd = rawAdData;
        this.rollType = i4;
        this.rollAdData = rollAdData;
        if (rawAdData != null) {
            z = true;
        } else {
            z = false;
        }
        this.LJLILLLLZI = z;
    }

    public /* synthetic */ RankData(String str, int i, int i2, int i3, CommerceRerankInfo commerceRerankInfo, Aweme aweme, RawAdData rawAdData, int i4, RollAdData rollAdData, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, i3, commerceRerankInfo, aweme, (i5 & 64) != 0 ? null : rawAdData, (i5 & 128) != 0 ? 0 : i4, (i5 & 256) == 0 ? rollAdData : null);
    }
}
