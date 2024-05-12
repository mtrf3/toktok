package X;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7fV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C191577fV extends ConstraintLayout implements S1U {
    public final /* synthetic */ C191557fT LJLIL;

    @Override // X.S1U
    public final String LIZJ() {
        return this.LJLIL.LIZJ();
    }

    @Override // X.S1U
    public final void LJIJI(Aweme aweme, String enterMethod, String enterFrom, boolean z, boolean z2, String trackInfo, C188727au c188727au) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(trackInfo, "trackInfo");
        this.LJLIL.LJIJI(aweme, enterMethod, enterFrom, z, z2, trackInfo, c188727au);
    }

    @Override // X.S1U
    public final void LJJI(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        this.LJLIL.LJJI(aweme);
    }

    @Override // X.S1U
    public final void LJJIJ(Aweme aweme, String enterMethod, String enterFrom, boolean z, String trackInfo, C188727au c188727au) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(trackInfo, "trackInfo");
        this.LJLIL.LJJIJ(aweme, enterMethod, enterFrom, z, trackInfo, c188727au);
    }

    @Override // X.S1U
    public final void LJJJJZI(int i, int i2, int i3, int i4, int i5, int i6) {
        this.LJLIL.LJJJJZI(i, i2, i3, i4, i5, i6);
    }

    @Override // X.S1U
    public final void LJJL(Context context, Aweme aweme, String enterMethod, String enterFrom, C188727au c188727au, boolean z, String trackInfo) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(trackInfo, "trackInfo");
        this.LJLIL.LJJL(context, aweme, enterMethod, enterFrom, c188727au, z, trackInfo);
    }

    @Override // X.S1U
    public final boolean enable() {
        this.LJLIL.getClass();
        return true;
    }

    private final InterfaceC191587fW getStrategy() {
        return new C71421S1h();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C191577fV(Context context, Aweme aweme) {
        super(context);
        UrlModel icon;
        List<String> urlList;
        String str;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(aweme, "aweme");
        new LinkedHashMap();
        C191557fT c191557fT = new C191557fT();
        this.LJLIL = c191557fT;
        InterfaceC191587fW strategy = getStrategy();
        LJJI(aweme);
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.c0_, this, true);
        PoiAnchorData poiAnchorData = c191557fT.LJLILLLLZI;
        if (poiAnchorData != null && (icon = poiAnchorData.getIcon()) != null && (urlList = icon.getUrlList()) != null && (str = (String) ORZ.LJLLLLLL(0, urlList)) != null) {
            W5F LJIIIIZZ = W5U.LJIIIIZZ(str);
            LJIIIIZZ.LJJIIJ = (InterfaceC85013Vh) findViewById(R.id.htg);
            C16880lQ.LLJJJ(LJIIIIZZ);
        }
        strategy.LIZ(aweme, this, this);
    }
}
