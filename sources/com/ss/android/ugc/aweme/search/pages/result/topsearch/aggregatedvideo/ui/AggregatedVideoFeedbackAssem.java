package com.ss.android.ugc.aweme.search.pages.result.topsearch.aggregatedvideo.ui;

import X.ActivityC45651qj;
import X.C1JI;
import X.C212428Vi;
import X.C49098JOs;
import X.C49587Jd9;
import X.C61328O5c;
import X.C61878OQg;
import X.C78939UyV;
import X.InterfaceC49014JLm;
import X.JYG;
import android.content.res.Resources;
import android.view.View;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardFeedbackAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.core.model.SearchCardInfo;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class AggregatedVideoFeedbackAssem extends SearchCardFeedbackAssem<InterfaceC49014JLm> {
    public InterfaceC49014JLm LLD;
    public View LLF;

    @Override // X.JY1
    public final int LLJJJIL() {
        return R.id.j7m;
    }

    public AggregatedVideoFeedbackAssem() {
        new LinkedHashMap();
    }

    @Override // X.JY1
    public final String LLLLZIL() {
        SearchMixFeed LIZ;
        InterfaceC49014JLm interfaceC49014JLm = this.LLD;
        if (interfaceC49014JLm != null && (LIZ = interfaceC49014JLm.LIZ()) != null) {
            return LIZ.feedbackType;
        }
        return null;
    }

    @Override // X.JY1
    public final List<Integer> LLLLLLL() {
        return C61878OQg.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardFeedbackAssem
    public final View b4() {
        return this.LLF;
    }

    @Override // X.JY1
    public final List<Integer> l2() {
        return C61878OQg.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardFeedbackAssem, X.C8XO
    /* renamed from: F0 */
    public final void q4(Object obj) {
        InterfaceC49014JLm item = (InterfaceC49014JLm) obj;
        o.LJIIIZ(item, "item");
        super.F0(item);
        this.LLD = item;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardFeedbackAssem
    /* renamed from: e4 */
    public final void F0(InterfaceC49014JLm interfaceC49014JLm) {
        InterfaceC49014JLm item = interfaceC49014JLm;
        o.LJIIIZ(item, "item");
        super.F0(item);
        this.LLD = item;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardFeedbackAssem
    public final void g4(View view) {
        int i;
        this.LLF = view;
        if (view != null) {
            C49098JOs.LIZ.getClass();
            Integer valueOf = Integer.valueOf(C49098JOs.LIZJ());
            if (valueOf.intValue() > 0) {
                i = valueOf.intValue();
            } else {
                i = 4;
            }
            C1JI.LJJIIZ(view, C61328O5c.LIZJ(i), null, null, null, null, 30);
        }
    }

    @Override // X.JY1
    public final void n2(JYG jyg) {
        Aweme aweme;
        UrlModel urlModel;
        String desc;
        Resources resources;
        SearchMixFeed LIZ;
        SearchCardInfo searchCardInfo;
        String str;
        String str2;
        InterfaceC49014JLm interfaceC49014JLm = this.LLD;
        if (interfaceC49014JLm == null || (aweme = interfaceC49014JLm.getAweme()) == null) {
            return;
        }
        Video video = aweme.getVideo();
        String str3 = null;
        if (video != null) {
            urlModel = video.getCover();
        } else {
            urlModel = null;
        }
        jyg.setImgCover(urlModel);
        if (aweme.getSearchDesc() != null) {
            desc = aweme.getSearchDesc();
        } else {
            desc = aweme.getDesc();
        }
        jyg.setTitle(desc);
        String title = jyg.getTitle();
        if (title == null || title.length() == 0) {
            ActivityC45651qj LIZ2 = C212428Vi.LIZ(this);
            if (LIZ2 != null && (resources = LIZ2.getResources()) != null) {
                str3 = resources.getString(R.string.tl_);
            }
            jyg.setTitle(str3);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C49587Jd9 LIZJ = ((ISearchContextAbility) this.LJZL.getValue()).ut0().LIZJ();
        linkedHashMap.put("enter_from", LIZJ.LJLJI);
        linkedHashMap.put("rank", String.valueOf(LIZJ.LJLJJI));
        linkedHashMap.put("list_result_type", "video");
        String aid = aweme.getAid();
        String str4 = "";
        if (aid == null) {
            aid = "";
        }
        linkedHashMap.put("list_item_id", aid);
        InterfaceC49014JLm interfaceC49014JLm2 = this.LLD;
        if (interfaceC49014JLm2 != null && (LIZ = interfaceC49014JLm2.LIZ()) != null) {
            Map<String, String> searchExtraParams = aweme.getSearchExtraParams();
            if ((searchExtraParams == null || (str = searchExtraParams.get("search_result_id")) == null) && ((searchCardInfo = LIZ.searchCardInfo) == null || (str = searchCardInfo.docId) == null)) {
                str = "";
            }
            linkedHashMap.put("search_result_id", str);
            SearchCardInfo searchCardInfo2 = LIZ.searchCardInfo;
            if (searchCardInfo2 != null && (str2 = searchCardInfo2.alasrc) != null) {
                str4 = str2;
            }
            linkedHashMap.put("token_type", str4);
            linkedHashMap.put("item_rank", String.valueOf(C78939UyV.LIZJ(LIZ, aweme)));
        }
        jyg.setLogParams(linkedHashMap);
        jyg.setAwemeId(aweme.getAid());
        jyg.setAuthorId(aweme.getAuthorUid());
    }
}
