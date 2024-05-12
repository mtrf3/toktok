package X;

import Y.ACListenerS23S0100000_3;
import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: X.7qT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C198377qT extends ConstraintLayout {
    public final Aweme LJLIL;
    public final AnchorCommonStruct LJLILLLLZI;
    public final String LJLJI;

    public final void LJJLJLI() {
        String str;
        Aweme aweme = this.LJLIL;
        String str2 = "1";
        if (aweme.isAd()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        C60106NiQ.LJI(aweme, "multi_anchor_entrance_click", str, this.LJLILLLLZI.getId(), String.valueOf(this.LJLILLLLZI.getType()), this.LJLJI);
        C60106NiQ.LIZLLL(this.LJLILLLLZI.getExtra());
        Keva repo = Keva.getRepo("TTCM_KEVA_REPO");
        repo.storeString("anchor_extra", this.LJLILLLLZI.getExtra());
        repo.storeString("group_id", this.LJLIL.getGroupId());
        SmartRouter.buildRoute(getContext(), this.LJLILLLLZI.getSchema()).open();
        Aweme aweme2 = this.LJLIL;
        if (!aweme2.isAd()) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        C60106NiQ.LJI(aweme2, "enter_multi_anchor_detail", str2, this.LJLILLLLZI.getId(), String.valueOf(this.LJLILLLLZI.getType()), this.LJLJI);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C42625Go9.LIZIZ(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C42625Go9.LIZJ(this);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onTcmCommentAnchorShowEvent(C75N event) {
        String str;
        o.LJIIIZ(event, "event");
        if (!o.LJ(event.LJLIL, this.LJLIL.getAuthorUid()) || !o.LJ(event.LJLILLLLZI, this.LJLJI)) {
            return;
        }
        Aweme aweme = this.LJLIL;
        if (aweme.isAd()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        C60106NiQ.LJI(aweme, "multi_anchor_entrance_show", str, this.LJLILLLLZI.getId(), String.valueOf(this.LJLILLLLZI.getType()), this.LJLJI);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C198377qT(Context context, AnchorCommonStruct anchorCommonStruct, Aweme aweme, String str) {
        super(context);
        List<String> urlList;
        String str2;
        o.LJIIIZ(aweme, "aweme");
        new LinkedHashMap();
        this.LJLIL = aweme;
        this.LJLILLLLZI = anchorCommonStruct;
        this.LJLJI = str;
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.cu4, this, true);
        SmartImageView smartImageView = (SmartImageView) findViewById(R.id.lmg);
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.lmi);
        TuxTextView tuxTextView2 = (TuxTextView) findViewById(R.id.lmk);
        if (tuxTextView != null) {
            tuxTextView.setText(anchorCommonStruct.getKeyword());
        }
        if (tuxTextView2 != null) {
            tuxTextView2.setText(anchorCommonStruct.getDescription());
        }
        UrlModel icon = anchorCommonStruct.getIcon();
        if (icon != null && (urlList = icon.getUrlList()) != null && (str2 = (String) ORZ.LJLLLLLL(0, urlList)) != null) {
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_anchor_recommend;
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
            C16880lQ.LJJIJLIJ(smartImageView, new ACListenerS23S0100000_3(this, 191));
        }
        if (tuxTextView != null) {
            C16880lQ.LJJJJI(tuxTextView, new ACListenerS23S0100000_3(this, 192));
        }
        if (tuxTextView2 != null) {
            C16880lQ.LJJJJI(tuxTextView2, new ACListenerS23S0100000_3(this, 193));
        }
    }
}
