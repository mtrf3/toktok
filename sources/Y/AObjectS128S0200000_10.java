package Y;

import X.C62313Ocv;
import X.C62673Oij;
import X.InterfaceC65784Pro;
import android.app.Activity;
import android.webkit.WebView;
import com.ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer;
import com.ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness;

/* loaded from: classes11.dex */
public class AObjectS128S0200000_10 implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS128S0200000_10 aObjectS128S0200000_10) {
        boolean LIZJ;
        LIZJ = C62673Oij.LIZJ((Activity) aObjectS128S0200000_10.l0, ((C62313Ocv) aObjectS128S0200000_10.l1).LIZIZ, "photo_share", "non_landscape_photo_share", "");
        return Boolean.valueOf(LIZJ);
    }

    public static final Object invoke$1(AObjectS128S0200000_10 aObjectS128S0200000_10) {
        boolean LIZJ;
        LIZJ = C62673Oij.LIZJ((Activity) aObjectS128S0200000_10.l0, ((C62313Ocv) aObjectS128S0200000_10.l1).LIZIZ, "photo_share", "non_landscape_photo_share_v2", "");
        return Boolean.valueOf(LIZJ);
    }

    public static final Object invoke$2(AObjectS128S0200000_10 aObjectS128S0200000_10) {
        boolean LIZJ;
        LIZJ = C62673Oij.LIZJ((Activity) aObjectS128S0200000_10.l0, ((C62313Ocv) aObjectS128S0200000_10.l1).LIZIZ, "photo_share", "landscape_photo_share", "");
        return Boolean.valueOf(LIZJ);
    }

    public static final Object invoke$3(AObjectS128S0200000_10 aObjectS128S0200000_10) {
        MixActivityContainer mixActivityContainer = (MixActivityContainer) aObjectS128S0200000_10.l0;
        Runnable runnable = (Runnable) aObjectS128S0200000_10.l1;
        if (runnable != null) {
            mixActivityContainer.getClass();
            runnable.run();
            return null;
        }
        Runnable runnable2 = mixActivityContainer.LJLJLLL;
        if (runnable2 == null) {
            return null;
        }
        runnable2.run();
        return null;
    }

    public static final Object invoke$4(AObjectS128S0200000_10 aObjectS128S0200000_10) {
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) aObjectS128S0200000_10.l0;
        WebView webView = (WebView) aObjectS128S0200000_10.l1;
        adWebStatBusiness.getClass();
        adWebStatBusiness.LJII(webView, webView.getUrl(), true);
        adWebStatBusiness.LJI.LIZJ(webView.getUrl());
        return null;
    }

    public AObjectS128S0200000_10(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
