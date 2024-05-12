package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class JKR implements InterfaceC49337JXx {
    public final /* synthetic */ View LIZ;
    public final /* synthetic */ ViewOnAttachStateChangeListenerC49251JUp LIZIZ;
    public final /* synthetic */ Aweme LIZJ;

    @Override // X.InterfaceC49337JXx
    public final void LIZ() {
        String desc;
        View view = this.LIZ;
        ViewOnAttachStateChangeListenerC49251JUp viewOnAttachStateChangeListenerC49251JUp = this.LIZIZ;
        Aweme aweme = this.LIZJ;
        viewOnAttachStateChangeListenerC49251JUp.getClass();
        C51652KOy c51652KOy = null;
        JYG jyg = new JYG(viewOnAttachStateChangeListenerC49251JUp.LJLJJLL, null, null, null, null, null, null, 126, null);
        jyg.setImgCover(aweme.getVideo().getCover());
        if (aweme.getSearchDesc() != null) {
            desc = aweme.getSearchDesc();
        } else {
            desc = aweme.getDesc();
        }
        jyg.setTitle(desc);
        String title = jyg.getTitle();
        if (title == null || title.length() == 0) {
            jyg.setTitle(viewOnAttachStateChangeListenerC49251JUp.getActivity().getResources().getString(R.string.tl_));
        }
        jyg.setMultipleChoices(C51757KSz.LIZLLL(jyg.getFeedbackType()));
        java.util.Map<String, String> LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("enter_from", viewOnAttachStateChangeListenerC49251JUp.LJLJL().LJFF), new OSZ("search_result_id", aweme.getGroupId()), new OSZ("token_type", "video"), new OSZ("is_aladdin", CardStruct.IStatusCode.DEFAULT), new OSZ("rank", String.valueOf(viewOnAttachStateChangeListenerC49251JUp.LJLJL().LJIIL)));
        List<AnchorCommonStruct> anchors = aweme.getAnchors();
        Long l = null;
        if (anchors != null && (true ^ anchors.isEmpty())) {
            c51652KOy = OJ4.LJJJJL(OJ4.LJJJJZ(ORZ.LJLIIIL(anchors), C49048JMu.LJLIL), JKS.LJLIL);
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
            }
            LJJLIIIIJ.put("ad_id", String.valueOf(l));
        }
        jyg.setLogParams(LJJLIIIIJ);
        jyg.setAwemeId(aweme.getAid());
        jyg.setAuthorId(aweme.getAuthorUid());
        C51757KSz.LIZIZ(view, jyg);
    }

    public JKR(C48887JGp c48887JGp, ViewOnAttachStateChangeListenerC49251JUp viewOnAttachStateChangeListenerC49251JUp, Aweme aweme) {
        this.LIZ = c48887JGp;
        this.LIZIZ = viewOnAttachStateChangeListenerC49251JUp;
        this.LIZJ = aweme;
    }
}
