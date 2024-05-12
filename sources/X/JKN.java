package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.SearchPhotoFeedbackAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.SearchPhotoViewModel;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.creationentrance.ability.SearchTopFragmentAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class JKN implements InterfaceC49337JXx {
    public final /* synthetic */ SearchPhotoFeedbackAssem LIZ;
    public final /* synthetic */ View LIZIZ;

    @Override // X.InterfaceC49337JXx
    public final void LIZ() {
        String desc;
        String str;
        Resources resources;
        C51652KOy c51652KOy;
        Long l;
        SearchTopFragmentAbility searchTopFragmentAbility;
        SearchPhotoFeedbackAssem searchPhotoFeedbackAssem = this.LIZ;
        FrameLayout frameLayout = searchPhotoFeedbackAssem.LLD;
        if (frameLayout != null) {
            Fragment LJIIIZ = C79234V7u.LJIIIZ(this.LIZIZ);
            JYG jyg = null;
            if (LJIIIZ != null && (searchTopFragmentAbility = (SearchTopFragmentAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(LJIIIZ, null), SearchTopFragmentAbility.class, null)) != null && searchTopFragmentAbility.jq0(C78939UyV.LJIILJJIL(searchPhotoFeedbackAssem.LL))) {
                return;
            }
            Aweme aweme = searchPhotoFeedbackAssem.LL;
            if (aweme != null) {
                String str2 = ((SearchPhotoViewModel) searchPhotoFeedbackAssem.LJZL.getValue()).LJLJI;
                if (str2 == null) {
                    str2 = "pics";
                }
                jyg = r10;
                JYG jyg2 = new JYG(str2, null, null, null, null, null, null, 126, null);
                jyg.setImgCover(aweme.getVideo().getCover());
                if (aweme.getSearchDesc() != null) {
                    desc = aweme.getSearchDesc();
                } else {
                    desc = aweme.getDesc();
                }
                jyg.setTitle(desc);
                String title = jyg.getTitle();
                if (title == null || title.length() == 0) {
                    Context context = searchPhotoFeedbackAssem.getContext();
                    if (context != null && (resources = context.getResources()) != null) {
                        str = resources.getString(R.string.tl_);
                    } else {
                        str = null;
                    }
                    jyg.setTitle(str);
                }
                jyg.setMultipleChoices(C51757KSz.LIZLLL(jyg.getFeedbackType()));
                java.util.Map<String, String> LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("search_result_id", aweme.getGroupId()), new OSZ("token_type", "photo"), new OSZ("is_aladdin", CardStruct.IStatusCode.DEFAULT));
                JQA jqa = ((SearchPhotoViewModel) searchPhotoFeedbackAssem.LJZL.getValue()).LJLILLLLZI;
                if (jqa != null) {
                    LJJLIIIIJ.put("enter_from", jqa.LJFF);
                    LJJLIIIIJ.put("rank", String.valueOf(jqa.LJIIL));
                }
                List<AnchorCommonStruct> anchors = aweme.getAnchors();
                if (anchors != null && (!anchors.isEmpty())) {
                    c51652KOy = OJ4.LJJJJL(OJ4.LJJJJZ(ORZ.LJLIIIL(anchors), C49047JMt.LJLIL), JKO.LJLIL);
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
                if (aweme.isAd()) {
                    AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                    if (awemeRawAd != null) {
                        l = awemeRawAd.getAdId();
                    } else {
                        l = null;
                    }
                    LJJLIIIIJ.put("ad_id", String.valueOf(l));
                }
                jyg.setLogParams(LJJLIIIIJ);
                jyg.setAwemeId(aweme.getAid());
                jyg.setAuthorId(aweme.getAuthorUid());
            }
            C51757KSz.LIZIZ(frameLayout, jyg);
        }
    }

    public JKN(View view, SearchPhotoFeedbackAssem searchPhotoFeedbackAssem) {
        this.LIZ = searchPhotoFeedbackAssem;
        this.LIZIZ = view;
    }
}
