package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchVideoHolder;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.creationentrance.ability.SearchTopFragmentAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JKP implements InterfaceC49337JXx {
    public final /* synthetic */ SearchVideoHolder LIZ;

    @Override // X.InterfaceC49337JXx
    public final void LIZ() {
        String desc;
        C51652KOy c51652KOy;
        SearchTopFragmentAbility searchTopFragmentAbility;
        InterfaceC55235Lm3 parentScope = this.LIZ.getParentScope();
        Long l = null;
        if (parentScope != null && (searchTopFragmentAbility = (SearchTopFragmentAbility) C55096Ljo.LIZ(parentScope, SearchTopFragmentAbility.class, null)) != null && searchTopFragmentAbility.jq0(C78939UyV.LJIILJJIL(this.LIZ.LJLIL))) {
            return;
        }
        View itemView = this.LIZ.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        SearchVideoHolder searchVideoHolder = this.LIZ;
        Aweme mData = searchVideoHolder.LJLIL;
        o.LJIIIIZZ(mData, "mData");
        JYG jyg = new JYG(searchVideoHolder.LLJIJIL, null, null, null, null, null, null, 126, null);
        jyg.setImgCover(mData.getVideo().getCover());
        if (mData.getSearchDesc() != null) {
            desc = mData.getSearchDesc();
        } else {
            desc = mData.getDesc();
        }
        jyg.setTitle(desc);
        String title = jyg.getTitle();
        if (title == null || title.length() == 0) {
            jyg.setTitle(searchVideoHolder.LJLJLJ.getResources().getString(R.string.tl_));
        }
        jyg.setMultipleChoices(C51757KSz.LIZLLL(jyg.getFeedbackType()));
        java.util.Map<String, String> LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("enter_from", searchVideoHolder.LJLJL().LJFF), new OSZ("search_result_id", mData.getGroupId()), new OSZ("token_type", "video"), new OSZ("is_aladdin", CardStruct.IStatusCode.DEFAULT), new OSZ("rank", String.valueOf(searchVideoHolder.LJLJL().LJIIL)));
        List<AnchorCommonStruct> anchors = mData.getAnchors();
        if (anchors != null && (true ^ anchors.isEmpty())) {
            c51652KOy = OJ4.LJJJJL(OJ4.LJJJJZ(ORZ.LJLIIIL(anchors), C49049JMv.LJLIL), JKQ.LJLIL);
        } else {
            c51652KOy = null;
        }
        ArrayList arrayList = new ArrayList();
        if (c51652KOy != null) {
            C51651KOx c51651KOx = new C51651KOx(c51652KOy);
            while (c51651KOx.LIZ()) {
                arrayList.add(((Product) c51651KOx.next()).LIZ());
            }
        }
        if (!arrayList.isEmpty()) {
            LJJLIIIIJ.put("product_id", arrayList.toString());
        }
        if (mData.isAd()) {
            AwemeRawAd awemeRawAd = mData.getAwemeRawAd();
            if (awemeRawAd != null) {
                l = awemeRawAd.getAdId();
            }
            LJJLIIIIJ.put("ad_id", String.valueOf(l));
        }
        jyg.setLogParams(LJJLIIIIJ);
        jyg.setAwemeId(mData.getAid());
        jyg.setAuthorId(mData.getAuthorUid());
        C51757KSz.LIZIZ(itemView, jyg);
    }

    public JKP(SearchVideoHolder searchVideoHolder) {
        this.LIZ = searchVideoHolder;
    }
}
