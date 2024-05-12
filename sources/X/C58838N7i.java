package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.ad.prerender.IPreRenderLandPageModule;
import com.ss.android.ugc.aweme.ad.prerender.PreRenderWebViewManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.o;

/* renamed from: X.N7i, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58838N7i extends AbstractC58836N7g {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        int intValue;
        int i;
        int i2;
        String str;
        Bundle bundle;
        AwemeRawAd awemeRawAd;
        Context LIZIZ;
        Aweme aweme;
        InterfaceC58837N7h interfaceC58837N7h = (InterfaceC58837N7h) xBaseParamModel;
        o.LJIIIZ(type, "type");
        String url = interfaceC58837N7h.getUrl();
        if (url.length() == 0 || 0 != 0 || (!ujb.o.LJJJLIIL(url, "https://", false) && ujb.o.LJJJLIIL(url, "http://", false))) {
            C31626Cb8.LIZ(c37356ElM, 0, "empty url", 4);
            return;
        }
        Number landingStyle = interfaceC58837N7h.getLandingStyle();
        if (landingStyle == null || (intValue = landingStyle.intValue()) != 1) {
            C31626Cb8.LIZ(c37356ElM, 0, "landing style not support", 4);
            return;
        }
        String title = interfaceC58837N7h.getTitle();
        if (title == null) {
            title = "";
        }
        String cid = interfaceC58837N7h.getCid();
        IPreRenderLandPageModule LIZ = PreRenderWebViewManager.LIZ();
        if (LIZ.LLLLIIL(cid, url)) {
            return;
        }
        Number landingAccessStyle = interfaceC58837N7h.getLandingAccessStyle();
        if (landingAccessStyle != null) {
            i = landingAccessStyle.intValue();
        } else {
            i = 0;
        }
        Number landingExitStyle = interfaceC58837N7h.getLandingExitStyle();
        if (landingExitStyle != null) {
            i2 = landingExitStyle.intValue();
        } else {
            i2 = 0;
        }
        String refer = interfaceC58837N7h.getRefer();
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null) {
            str = interfaceC38263Ezz.LIZIZ();
        } else {
            str = null;
        }
        SparkContext.Companion.getClass();
        C60737Nsb LIZIZ2 = C39359FcZ.LIZIZ(str);
        if (LIZIZ2 != null) {
            bundle = (Bundle) LIZIZ2.LIZIZ(Bundle.class);
        } else {
            bundle = null;
        }
        C59284NOm LIZ2 = C113504cs.LIZ();
        if (LIZ2 != null && (aweme = LIZ2.LJIIL) != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        LIZ.LLLLIILLL(awemeRawAd, url);
        try {
            InterfaceC38263Ezz interfaceC38263Ezz2 = this.LJLIL;
            if (interfaceC38263Ezz2 == null || (LIZIZ = interfaceC38263Ezz2.getContext()) == null) {
                LIZIZ = EF7.LIZIZ();
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (NNC.LIZ(LIZIZ, NON.LIZ(url, title, intValue, i, i2, null, null, bundle, refer, 0, true)).LIZ()) {
                XBaseModel LIZJ = ED5.LIZJ(InterfaceC58834N7e.class, null);
                ((InterfaceC58834N7e) LIZJ).setCode(1);
                c37356ElM.onSuccess((XBaseResultModel) LIZJ, "");
                return;
            }
        } catch (Throwable th2) {
            th = th2;
            C78983UzD.LJIIZILJ(th);
            C31626Cb8.LIZ(c37356ElM, 0, "can not handle url", 4);
        }
        C31626Cb8.LIZ(c37356ElM, 0, "can not handle url", 4);
    }
}
