package X;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.ad.prerender.IPreRenderLandPageModule;
import com.ss.android.ugc.aweme.ad.prerender.PreRenderWebViewManager;
import com.ss.android.ugc.aweme.commercialize.utils.AdPopUpWebPageHelper;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.AqS157S0200000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NOI implements Runnable {
    public final /* synthetic */ ActivityC45651qj LJLIL;
    public final /* synthetic */ AdPopUpWebPageHelper LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ int LJLJLJ;
    public final /* synthetic */ boolean LJLJLLL;
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LJLL;

    /* JADX WARN: Multi-variable type inference failed */
    public NOI(ActivityC45651qj activityC45651qj, AdPopUpWebPageHelper adPopUpWebPageHelper, String str, String str2, String str3, boolean z, String str4, int i, boolean z2, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = adPopUpWebPageHelper;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = str3;
        this.LJLJJLL = z;
        this.LJLJL = str4;
        this.LJLJLJ = i;
        this.LJLJLLL = z2;
        this.LJLL = interfaceC88472Yns;
    }

    public final void LIZ() {
        AwemeRawAd awemeRawAd;
        boolean z;
        Activity LJIJJ;
        NWF LIZ;
        NOD nod = new NOD();
        nod.LIZ = this.LJLIL;
        Aweme LIZ2 = this.LJLILLLLZI.LIZ();
        String str = null;
        if (LIZ2 != null) {
            awemeRawAd = LIZ2.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        nod.LIZIZ = awemeRawAd;
        String webUrl = this.LJLJI;
        o.LJIIIZ(webUrl, "webUrl");
        nod.LJFF = webUrl;
        String webTitle = this.LJLJJI;
        o.LJIIIZ(webTitle, "webTitle");
        nod.LJI = webTitle;
        Aweme LIZ3 = this.LJLILLLLZI.LIZ();
        if (LIZ3 != null) {
            str = LIZ3.getAid();
        }
        String str2 = "";
        if (str == null) {
            str = "";
        }
        nod.LIZ(str);
        nod.LJIIIIZZ = this.LJLILLLLZI.LIZ();
        nod.LJ = this.LJLJJL;
        nod.LIZLLL = 25;
        nod.LJIIJ = this.LJLJJLL;
        String sessionId = this.LJLJL;
        o.LJIIIZ(sessionId, "sessionId");
        nod.LJIIJJI = sessionId;
        nod.LJIIL = this.LJLJLJ;
        nod.LJIILIIL = this.LJLJLLL;
        AdPopUpWebPageHelper adPopUpWebPageHelper = this.LJLILLLLZI;
        boolean z2 = false;
        if (this.LJLJJLL && o.LJ(this.LJLJJL, "landing_page")) {
            z = true;
        } else {
            z = false;
        }
        adPopUpWebPageHelper.LJLJJLL = z;
        NOJ LIZIZ = nod.LIZIZ();
        Context context = LIZIZ.LIZ;
        if (context != null && (LJIJJ = C45804HyK.LJIJJ(context)) != null && (LIZ = C42391GkN.LIZ(LJIJJ)) != null && !LIZ.LJIIJJI()) {
            FrameLayout LIZIZ2 = C42391GkN.LIZIZ(LJIJJ);
            NPE npe = new NPE(LIZIZ2, LIZ, LIZIZ);
            if (LIZIZ.LJIIL) {
                IPreRenderLandPageModule LIZ4 = PreRenderWebViewManager.LIZ();
                AwemeRawAd awemeRawAd2 = LIZIZ.LIZIZ;
                String str3 = LIZIZ.LJFF;
                if (str3 != null) {
                    str2 = str3;
                }
                LIZ4.LLLL(awemeRawAd2, str2, npe);
            } else {
                LIZIZ2.setVisibility(0);
            }
            LIZ.getActionMode().LJIIIIZZ = LIZIZ.LIZLLL;
            LIZ.LJIIIIZZ(new AqS157S0200000_10(LIZIZ, LIZ, 27));
            z2 = true;
            if (!this.LJLILLLLZI.LJLJJLL) {
                C2U8.LIZ(new C174416sv(1));
                C2U8.LIZ(new C232659Bd());
            }
        }
        InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns = this.LJLL;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Boolean.valueOf(z2));
        }
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
