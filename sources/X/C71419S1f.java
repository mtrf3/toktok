package X;

import Y.ACListenerS46S0200000_12;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.PoiAnchorInfo;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: X.S1f, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71419S1f extends ConstraintLayout implements S1U {
    public final Aweme LJLIL;
    public final String LJLILLLLZI;
    public final /* synthetic */ C191557fT LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;
    public final InterfaceC71425S1l LJLLILLLL;

    @Override // X.S1U
    public final String LIZJ() {
        return this.LJLJI.LIZJ();
    }

    @Override // X.S1U
    public final void LJIJI(Aweme aweme, String enterMethod, String enterFrom, boolean z, boolean z2, String trackInfo, C188727au c188727au) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(trackInfo, "trackInfo");
        this.LJLJI.LJIJI(aweme, enterMethod, enterFrom, z, z2, trackInfo, c188727au);
    }

    @Override // X.S1U
    public final void LJJI(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        this.LJLJI.LJJI(aweme);
    }

    @Override // X.S1U
    public final void LJJIJ(Aweme aweme, String enterMethod, String enterFrom, boolean z, String trackInfo, C188727au c188727au) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(trackInfo, "trackInfo");
        this.LJLJI.LJJIJ(aweme, enterMethod, enterFrom, z, trackInfo, c188727au);
    }

    @Override // X.S1U
    public final void LJJJJZI(int i, int i2, int i3, int i4, int i5, int i6) {
        this.LJLJI.LJJJJZI(i, i2, i3, i4, i5, i6);
    }

    @Override // X.S1U
    public final void LJJL(Context context, Aweme aweme, String enterMethod, String enterFrom, C188727au c188727au, boolean z, String trackInfo) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(trackInfo, "trackInfo");
        this.LJLJI.LJJL(context, aweme, enterMethod, enterFrom, c188727au, z, trackInfo);
    }

    @Override // X.S1U
    public final boolean enable() {
        this.LJLJI.getClass();
        return true;
    }

    private final TuxIconView getIconMoreView() {
        return (TuxIconView) this.LJLLI.getValue();
    }

    private final ViewGroup getPoiTagLayout() {
        return (ViewGroup) this.LJLJJL.getValue();
    }

    private final ViewGroup getPoiTitleLayout() {
        return (ViewGroup) this.LJLJJI.getValue();
    }

    public final TextView getPoiNameTv() {
        return (TextView) this.LJLJJLL.getValue();
    }

    public final TextView getPoiSuffixTv() {
        return (TextView) this.LJLJL.getValue();
    }

    public final TextView getPoiTag1Tv() {
        return (TextView) this.LJLJLJ.getValue();
    }

    public final TextView getPoiTag2Tv() {
        return (TextView) this.LJLJLLL.getValue();
    }

    public final TextView getPoiTagDividerView() {
        return (TextView) this.LJLL.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C42625Go9.LIZIZ(this);
        if (this.LJLLILLLL.LIZ(this)) {
            return;
        }
        getPoiTagLayout().post(new RunnableC71423S1j(this, LC5.LIZIZ(getPoiNameTv()), LC5.LIZIZ(getPoiSuffixTv()), LC5.LIZIZ(getPoiTagDividerView()) + LC5.LIZIZ(getPoiTag2Tv()) + LC5.LIZIZ(getPoiTag1Tv())));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C42625Go9.LIZJ(this);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onPoiCommentAnchorShowEvent(C174056sL event) {
        String str;
        PoiAnchorInfo commentAnchor;
        o.LJIIIZ(event, "event");
        if (o.LJ(event.LJLIL, this.LJLIL.getAid())) {
            Aweme aweme = this.LJLIL;
            String str2 = this.LJLILLLLZI;
            PoiDataStruct poiDataStruct = aweme.getPoiDataStruct();
            if (poiDataStruct == null || (commentAnchor = poiDataStruct.getCommentAnchor()) == null || (str = commentAnchor.getTrackInfo()) == null) {
                str = "";
            }
            S1V.LIZJ(this, aweme, "comment_anchor", str2, true, str, null, 32);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71419S1f(Context context, Aweme aweme, String str) {
        super(context);
        InterfaceC71425S1l c71422S1i;
        PoiAnchorData poiAnchorData;
        UrlModel icon;
        List<String> urlList;
        String str2;
        o.LJIIIZ(aweme, "aweme");
        new LinkedHashMap();
        this.LJLIL = aweme;
        this.LJLILLLLZI = str;
        C191557fT c191557fT = new C191557fT();
        this.LJLJI = c191557fT;
        this.LJLJJI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1137));
        this.LJLJJL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1136));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1131));
        this.LJLJL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1132));
        this.LJLJLJ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1133));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1134));
        this.LJLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1135));
        this.LJLLI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1130));
        List<AnchorCommonStruct> anchors = aweme.getAnchors();
        if (anchors != null && anchors.size() != 0) {
            if (!((RBX) HG3.LJIILL()).isMe(aweme.getAuthorUid()) && aweme.getPoiDataStruct() != null) {
                c71422S1i = new C71420S1g(str);
                this.LJLLILLLL = c71422S1i;
                LJJI(aweme);
                C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.c0e, this, true);
                poiAnchorData = c191557fT.LJLILLLLZI;
                if (poiAnchorData != null && (icon = poiAnchorData.getIcon()) != null && (urlList = icon.getUrlList()) != null && (str2 = (String) ORZ.LJLLLLLL(0, urlList)) != null) {
                    W5F LJIIIIZZ = W5U.LJIIIIZZ(str2);
                    LJIIIIZZ.LJJIIJ = (InterfaceC85013Vh) findViewById(R.id.huf);
                    C16880lQ.LLJJJ(LJIIIIZZ);
                }
                c71422S1i.LIZIZ(aweme, this, this);
                setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS46S0200000_12(this, context, 47)));
            }
        }
        c71422S1i = new C71422S1i();
        this.LJLLILLLL = c71422S1i;
        LJJI(aweme);
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.c0e, this, true);
        poiAnchorData = c191557fT.LJLILLLLZI;
        if (poiAnchorData != null) {
            W5F LJIIIIZZ2 = W5U.LJIIIIZZ(str2);
            LJIIIIZZ2.LJJIIJ = (InterfaceC85013Vh) findViewById(R.id.huf);
            C16880lQ.LLJJJ(LJIIIIZZ2);
        }
        c71422S1i.LIZIZ(aweme, this, this);
        setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS46S0200000_12(this, context, 47)));
    }
}
