package X;

import Y.ACListenerS27S0100000_7;
import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAAnchorService;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAAnchorServiceImpl;
import com.ss.android.ugc.aweme.commercialize.depend.AdTaskDependImpl;
import com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: X.HSd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44091HSd extends ConstraintLayout {
    public final Aweme LJLIL;
    public final AnchorCommonStruct LJLILLLLZI;
    public final String LJLJI;

    public final void LJJLJLI() {
        String str;
        String schema = this.LJLILLLLZI.getSchema();
        if (schema == null) {
            return;
        }
        LJJLL("multi_anchor_entrance_click");
        if (this.LJLIL.isAd()) {
            AwemeRawAd awemeRawAd = this.LJLIL.getAwemeRawAd();
            if (awemeRawAd != null && o.LJ(awemeRawAd.getEnableSoftAdAnchorClick(), Boolean.TRUE)) {
                str = "click";
            } else {
                str = "otherclick";
            }
            C58655N0h LIZLLL = C58704N2e.LIZLLL("comment_ad", str, this.LJLIL.getAwemeRawAd());
            LIZLLL.LIZJ("product_link_anchor", "refer");
            LIZLLL.LJI();
            IAdTaskDepend LJIIZILJ = AdTaskDependImpl.LJIIZILJ();
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            AwemeRawAd awemeRawAd2 = this.LJLIL.getAwemeRawAd();
            String aid = this.LJLIL.getAid();
            o.LJIIIIZZ(aid, "aweme.aid");
            LJIIZILJ.LJIIJ(context, awemeRawAd2, schema, "", aid, 69);
        } else {
            new C237559Tz().LJJII(this.LJLIL, null, "ttelite_ba_product_link_anchor_click", "comment_anchor");
            IBAAnchorService LJII = BAAnchorServiceImpl.LJII();
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "context");
            LJII.LIZ(context2, this.LJLILLLLZI, this.LJLIL, "comment_anchor");
            new C237559Tz().LJJII(this.LJLIL, null, "ttelite_ba_video_product_anchor_9_exp", "comment_anchor");
        }
        LJJLL("enter_multi_anchor_detail");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        EventBus.LIZJ().LJIJ(this);
    }

    public final void LJJLL(String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_method", "comment_anchor");
        c188727au.LJIIIZ("enter_from", this.LJLJI);
        c188727au.LJIIIZ("group_id", this.LJLIL.getGroupId());
        String authorUid = this.LJLIL.getAuthorUid();
        if (authorUid == null) {
            authorUid = "";
        }
        c188727au.LJIIIZ("author_id", authorUid);
        c188727au.LJIIIZ("music_id", C227768wm.LJIIJJI(this.LJLIL));
        c188727au.LJIIIZ("anchor_type", "TTBA_COMMENT_LINK");
        c188727au.LJIIIZ("anchor_name", "anchor_ba_product_link");
        c188727au.LJIIIZ("anchor_id", this.LJLILLLLZI.getId());
        c188727au.LJIIIZ("main_anchor_type", "TTBA_COMMENT_LINK");
        c188727au.LIZLLL(0, "multi_anchor");
        c188727au.LIZLLL(1, "anchor_number");
        C211648Si.LIZ(c188727au, this.LJLIL, this.LJLJI, ujb.o.LJJJJIZL("multi_anchor_entrance_show", str, true));
        FMX.LJIIL(str, c188727au.LIZ);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onBACommentAnchorShowEvent(C75M event) {
        o.LJIIIZ(event, "event");
        if (!o.LJ(event.LJLIL, this.LJLIL.getAid()) || !o.LJ(event.LJLILLLLZI, this.LJLJI)) {
            return;
        }
        if (this.LJLIL.isAd()) {
            C58655N0h LIZLLL = C58704N2e.LIZLLL("comment_ad", "othershow", this.LJLIL.getAwemeRawAd());
            LIZLLL.LIZJ("product_link_anchor", "refer");
            LIZLLL.LJI();
        } else {
            new C237559Tz().LJJII(this.LJLIL, null, "ttelite_ba_product_link_anchor_show", "comment_anchor");
        }
        LJJLL("multi_anchor_entrance_show");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44091HSd(Context context, AnchorCommonStruct anchorCommonStruct, Aweme aweme, String str) {
        super(context);
        List<String> urlList;
        String str2;
        o.LJIIIZ(aweme, "aweme");
        new LinkedHashMap();
        this.LJLIL = aweme;
        this.LJLILLLLZI = anchorCommonStruct;
        this.LJLJI = str;
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.cu3, this, true);
        SmartImageView smartImageView = (SmartImageView) findViewById(R.id.lmb);
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.lmf);
        TuxTextView tuxTextView2 = (TuxTextView) findViewById(R.id.lmd);
        if (tuxTextView != null) {
            tuxTextView.setText(anchorCommonStruct.getKeyword());
        }
        if (tuxTextView2 != null) {
            tuxTextView2.setText(anchorCommonStruct.getDescription());
        }
        UrlModel icon = anchorCommonStruct.getIcon();
        if (icon != null && (urlList = icon.getUrlList()) != null && (str2 = (String) ORZ.LJLLLLLL(0, urlList)) != null) {
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_anchor_link;
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "context");
            SY9 LIZ = c2068389v.LIZ(context2);
            W5F LJIIIIZZ = W5U.LJIIIIZZ(str2);
            LJIIIIZZ.LJIILIIL = LIZ;
            LJIIIIZZ.LJIILLIIL = LIZ;
            LJIIIIZZ.LJJIIJ = smartImageView;
            C16880lQ.LLJJJ(LJIIIIZZ);
        }
        if (smartImageView != null) {
            C16880lQ.LJJIJLIJ(smartImageView, new ACListenerS27S0100000_7(this, 194));
        }
        if (tuxTextView != null) {
            C16880lQ.LJJJJI(tuxTextView, new ACListenerS27S0100000_7(this, 195));
        }
        if (tuxTextView2 != null) {
            C16880lQ.LJJJJI(tuxTextView2, new ACListenerS27S0100000_7(this, 196));
        }
    }
}
