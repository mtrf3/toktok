package X;

import com.ss.android.ugc.aweme.ecommerce.ug.common.bean.EcUgProduct;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardConfig;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardStyle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Rur, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC71069Rur implements Runnable {
    public final /* synthetic */ C71076Ruy LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ Aweme LJLJI;
    public final /* synthetic */ FeedEcCardConfig LJLJJI;
    public final /* synthetic */ FeedEcCardStyle LJLJJL;
    public final /* synthetic */ EcUgProduct LJLJJLL;

    public RunnableC71069Rur(EcUgProduct ecUgProduct, C71076Ruy c71076Ruy, FeedEcCardConfig feedEcCardConfig, FeedEcCardStyle feedEcCardStyle, Aweme aweme, boolean z) {
        this.LJLIL = c71076Ruy;
        this.LJLILLLLZI = z;
        this.LJLJI = aweme;
        this.LJLJJI = feedEcCardConfig;
        this.LJLJJL = feedEcCardStyle;
        this.LJLJJLL = ecUgProduct;
    }

    public final void LIZ() {
        List<String> list;
        String str;
        C71076Ruy c71076Ruy = this.LJLIL;
        List<String> list2 = null;
        if (c71076Ruy != null) {
            list = c71076Ruy.LJFF;
        } else {
            list = null;
        }
        if (c71076Ruy != null) {
            str = c71076Ruy.LJI;
        } else {
            str = null;
        }
        C71065Run.LJIIJJI(list, ED2.LIZ(str), this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, "no_interest", this.LJLJJLL);
        C71076Ruy c71076Ruy2 = this.LJLIL;
        if (c71076Ruy2 != null) {
            list2 = c71076Ruy2.LJFF;
        }
        boolean z = this.LJLILLLLZI;
        Aweme aweme = this.LJLJI;
        FeedEcCardConfig cardConfig = this.LJLJJI;
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(cardConfig, "cardConfig");
        C76542zS.LIZ("tiktokec_button_click", C71065Run.LJII(list2, z, aweme, cardConfig, "no_interest"));
        C71066Ruo.LIZIZ(this.LJLILLLLZI, this.LJLIL, this.LJLJI, this.LJLJJI, this.LJLJJL, "click", null, "no_interest", 64);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
