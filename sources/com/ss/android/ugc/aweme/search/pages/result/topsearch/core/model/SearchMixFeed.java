package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model;

import X.C35670DzG;
import X.C70657RoD;
import X.InterfaceC65349Pkn;
import X.JPA;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase;
import com.ss.android.ugc.aweme.search.pages.result.bot.model.PollingInfo;
import com.ss.android.ugc.aweme.search.pages.result.bot.model.TakoInfo;
import com.ss.android.ugc.aweme.search.pages.result.common.core.model.CollectionLive;
import com.ss.android.ugc.aweme.search.pages.result.common.core.model.SearchCardInfo;
import com.ss.android.ugc.aweme.search.pages.result.common.core.model.SearchOperationInfo;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.aggregatedvideo.model.AggregatedVideo;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.model.SearchHubEntityCard;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.precisead.core.model.SearchPreciseAd;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.rs.core.model.RelatedWord;
import com.ss.android.ugc.aweme.search.performance.core.model.PreloadImg;
import java.util.List;

/* loaded from: classes9.dex */
public class SearchMixFeed extends SearchMixFeedBase {
    public C35670DzG LJLIL;
    public boolean LJLJI;
    public boolean LJLJJL;
    public LogPbBean LJLJJLL;
    public transient boolean LJLJL;
    public final int LJLJLLL;

    @InterfaceC65349Pkn("featured_aggregated")
    public AggregatedVideo aggregatedVideo;

    @InterfaceC65349Pkn("aweme_info")
    public Aweme aweme;

    @InterfaceC65349Pkn("tikbot")
    public TakoInfo bot;

    @InterfaceC65349Pkn("card_title")
    public String cardTitle;

    @InterfaceC65349Pkn("challenge_list")
    public List<SearchChallenge> challengeList;

    @InterfaceC65349Pkn("collection_live")
    public CollectionLive collectionLive;

    @InterfaceC65349Pkn("comment_list")
    public List<Comment> commentList;

    @InterfaceC65349Pkn("common_aladdin")
    public CommonAladdin commonAladdin;

    @InterfaceC65349Pkn("doc_id")
    public long docId;

    @InterfaceC65349Pkn("dynamic_patch")
    public DynamicPatch dynamicPatch;

    @InterfaceC65349Pkn("entity_card")
    public SearchHubEntityCard entityCard;

    @InterfaceC65349Pkn("feature_account_title")
    public String featuredAccountTitle;

    @InterfaceC65349Pkn("featured_answer")
    public FeaturedAnswer featuredAnswer;

    @InterfaceC65349Pkn("related_search_card_group_position")
    public int groupPosition;

    @InterfaceC65349Pkn("has_top_user")
    public boolean hasTopUser;

    @InterfaceC65349Pkn("hotspot_info")
    public SearchSpot hotSpot;

    @InterfaceC65349Pkn("lynx_ssr_info")
    public LynxSSRInfo lynxSSRInfo;

    @InterfaceC65349Pkn("words_query_record")
    public RecommendWordMob mRecommendWordMob;

    @InterfaceC65349Pkn("activity_info")
    public SearchOperationInfo operation;

    @InterfaceC65349Pkn("polling")
    public PollingInfo polling;

    @InterfaceC65349Pkn("precise_ad")
    public SearchPreciseAd preciseAd;

    @InterfaceC65349Pkn("preload_img")
    public PreloadImg preloadImg;

    @InterfaceC65349Pkn("provider_doc_id_str")
    public String providerDocIdStr;

    @InterfaceC65349Pkn("qrec_virtual_enable")
    public String qrecVirtualEnable;

    @InterfaceC65349Pkn("related_word_list")
    public List<RelatedWord> relatedWordList;

    @InterfaceC65349Pkn("search_aweme_info")
    public SearchAwemeInfo searchAwemeInfo;

    @InterfaceC65349Pkn("card_info")
    public SearchCardInfo searchCardInfo;

    @InterfaceC65349Pkn("should_hide_title")
    public Boolean shouldHideTitle;

    @InterfaceC65349Pkn("user_list")
    public List<SearchUser> users;

    @InterfaceC65349Pkn("view_more")
    public boolean isShowViewMore = true;
    public int LJLILLLLZI = -1;
    public int LJLJJI = 1;
    public transient int LJLJLJ = -1;

    public final String LJ() {
        if (TextUtils.isEmpty(this.cardTitle)) {
            return "";
        }
        return this.cardTitle;
    }

    public final DynamicPatch LJI() {
        DynamicPatch dynamicPatch = this.dynamicPatch;
        if (dynamicPatch != null) {
            dynamicPatch.setDocId(this.providerDocIdStr);
        }
        return this.dynamicPatch;
    }

    public final boolean LJII() {
        if (this.feedType == 36) {
            return true;
        }
        return false;
    }

    public final boolean LJIIIIZZ() {
        if (this.preciseAd != null) {
            this.feedType = 555;
        }
        if (this.feedType == 1) {
            return true;
        }
        return false;
    }

    public final boolean LJIIIZ() {
        return "1".equals(this.qrecVirtualEnable);
    }

    public final boolean LJIIJ() {
        if (this.feedType == 35) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase, X.AbstractC49325JXl
    public final int getFeedType() {
        int i = this.feedType;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i != 6) {
                        if (i != 12) {
                            if (i != 46) {
                                if (i != 998) {
                                    if (i != 999) {
                                        return i;
                                    }
                                    return 65514;
                                }
                                if (this.searchCardInfo != null) {
                                    return 998;
                                }
                                return -1;
                            }
                            return 65515;
                        }
                        return 65467;
                    }
                    return 37;
                }
                return 65458;
            }
            return 65456;
        }
        if (this.preciseAd != null) {
            return 555;
        }
        return 65280;
    }

    public SearchMixFeed() {
        int i = JPA.LIZ;
        JPA.LIZ = i + 1;
        this.LJLJLLL = i;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase
    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int hashCode = super.hashCode() * 31;
        Aweme aweme = this.aweme;
        int i10 = 0;
        if (aweme != null) {
            i = aweme.hashCode();
        } else {
            i = 0;
        }
        int i11 = (hashCode + i) * 31;
        List<SearchUser> list = this.users;
        if (list != null) {
            i2 = list.hashCode();
        } else {
            i2 = 0;
        }
        int i12 = (i11 + i2) * 31;
        List<Comment> list2 = this.commentList;
        if (list2 != null) {
            i3 = list2.hashCode();
        } else {
            i3 = 0;
        }
        int i13 = (i12 + i3) * 31;
        List<SearchChallenge> list3 = this.challengeList;
        if (list3 != null) {
            i4 = list3.hashCode();
        } else {
            i4 = 0;
        }
        int i14 = (i13 + i4) * 31;
        List<RelatedWord> list4 = this.relatedWordList;
        if (list4 != null) {
            i5 = list4.hashCode();
        } else {
            i5 = 0;
        }
        int i15 = (i14 + i5) * 31;
        DynamicPatch dynamicPatch = this.dynamicPatch;
        if (dynamicPatch != null) {
            i6 = dynamicPatch.hashCode();
        } else {
            i6 = 0;
        }
        int i16 = (i15 + i6) * 31;
        String str = this.featuredAccountTitle;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i17 = (i16 + i7) * 31;
        SearchCardInfo searchCardInfo = this.searchCardInfo;
        if (searchCardInfo != null) {
            i8 = searchCardInfo.hashCode();
        } else {
            i8 = 0;
        }
        int i18 = (i17 + i8) * 31;
        SearchSpot searchSpot = this.hotSpot;
        if (searchSpot != null) {
            i9 = searchSpot.hashCode();
        } else {
            i9 = 0;
        }
        int i19 = (i18 + i9) * 31;
        CollectionLive collectionLive = this.collectionLive;
        if (collectionLive != null) {
            i10 = collectionLive.hashCode();
        }
        return i19 + i10;
    }

    @Override // X.InterfaceC49871Jhj
    public final int LIZ() {
        return this.LJLJLLL;
    }

    @Override // X.AbstractC49325JXl
    public final Aweme getAweme() {
        return this.aweme;
    }

    @Override // X.AbstractC49325JXl
    public final List<Comment> getCommentList() {
        return this.commentList;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase
    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchMixFeed)) {
            return false;
        }
        SearchMixFeed searchMixFeed = (SearchMixFeed) obj;
        if (this.feedType != searchMixFeed.feedType || !C70657RoD.LJII(this.aweme, searchMixFeed.aweme) || !C70657RoD.LJII(this.users, searchMixFeed.users) || !C70657RoD.LJII(this.commentList, searchMixFeed.commentList) || !C70657RoD.LJII(this.challengeList, searchMixFeed.challengeList) || !C70657RoD.LJII(this.relatedWordList, searchMixFeed.relatedWordList) || !C70657RoD.LJII(this.dynamicPatch, searchMixFeed.dynamicPatch) || !C70657RoD.LJII(this.featuredAccountTitle, searchMixFeed.featuredAccountTitle) || !C70657RoD.LJII(this.hotSpot, searchMixFeed.hotSpot) || !C70657RoD.LJII(this.aggregatedVideo, searchMixFeed.aggregatedVideo)) {
            return false;
        }
        return C70657RoD.LJII(this.collectionLive, searchMixFeed.collectionLive);
    }

    @Override // X.AbstractC49325JXl
    public final void setAweme(Aweme aweme) {
        this.aweme = aweme;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase, X.AbstractC49325JXl
    public final void setFeedType(int i) {
        this.feedType = i;
    }

    @Override // X.AbstractC49325JXl, X.InterfaceC65316PkG
    public final void setRequestId(String str) {
        super.setRequestId(str);
        Aweme aweme = this.aweme;
        if (aweme != null) {
            aweme.setRequestId(str);
        }
    }
}
