package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgLoginBanner;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgProfileActivityButton;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LV0 {
    public static boolean LJI;
    public static final LV0 LJII = LV3.LIZ;
    public UgAwemeActivitySetting LIZ;
    public final List<WeakReference<InterfaceC54202LPa>> LIZIZ = new ArrayList();
    public final C54268LRo LIZJ;
    public String LIZLLL;
    public boolean LJ;
    public boolean LJFF;

    public final void LJII() {
        InterfaceC54202LPa interfaceC54202LPa;
        LJI = true;
        LIZJ();
        UgAwemeActivitySetting ugAwemeActivitySetting = this.LIZ;
        if (ugAwemeActivitySetting != null) {
            try {
                if (!ugAwemeActivitySetting.getOverallSwitch().booleanValue()) {
                    C54268LRo c54268LRo = this.LIZJ;
                    c54268LRo.LIZJ = false;
                    c54268LRo.LIZ.storeBoolean("has_showed_pop", false);
                    this.LIZJ.LIZ(0);
                    C54268LRo c54268LRo2 = this.LIZJ;
                    c54268LRo2.LIZLLL = "";
                    c54268LRo2.LIZ.storeString("activity_id_for_deeplink", "");
                }
            } catch (C158056If e) {
                C16880lQ.LLLLIIL(e);
            }
            for (Reference reference : ORZ.LLJI(this.LIZIZ)) {
                if (reference != null && (interfaceC54202LPa = (InterfaceC54202LPa) reference.get()) != null) {
                    interfaceC54202LPa.LIZ(this.LIZ);
                }
            }
        }
        if (this.LJ && !this.LJFF) {
            C2U8.LIZ(new C2L1());
        }
    }

    public final UgLoginBanner LIZIZ() {
        UrlModel urlModel;
        String str;
        List<String> list;
        UgAwemeActivitySetting ugAwemeActivitySetting;
        UgLoginBanner loginBanner;
        UrlModel resourceUrl;
        UgLoginBanner loginBanner2;
        UgLoginBanner loginBanner3;
        if (!LJI) {
            return null;
        }
        try {
            UgAwemeActivitySetting ugAwemeActivitySetting2 = this.LIZ;
            if (ugAwemeActivitySetting2 != null && (loginBanner3 = ugAwemeActivitySetting2.getLoginBanner()) != null) {
                urlModel = loginBanner3.getResourceUrl();
            } else {
                urlModel = null;
            }
        } catch (C158056If e) {
            C16880lQ.LLLLIIL(e);
        }
        if (!LJ(urlModel)) {
            return null;
        }
        try {
            UgAwemeActivitySetting ugAwemeActivitySetting3 = this.LIZ;
            if (ugAwemeActivitySetting3 != null && (loginBanner2 = ugAwemeActivitySetting3.getLoginBanner()) != null) {
                str = loginBanner2.getText();
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            UgAwemeActivitySetting ugAwemeActivitySetting4 = this.LIZ;
            if (ugAwemeActivitySetting4 != null && (loginBanner = ugAwemeActivitySetting4.getLoginBanner()) != null && (resourceUrl = loginBanner.getResourceUrl()) != null) {
                list = resourceUrl.getUrlList();
            } else {
                list = null;
            }
            if (C38891fp.LJJI(list) || (ugAwemeActivitySetting = this.LIZ) == null) {
                return null;
            }
            return ugAwemeActivitySetting.getLoginBanner();
        } catch (C158056If unused) {
            return null;
        }
    }

    public final void LIZJ() {
        UgLoginBanner loginBanner;
        String str;
        UgChannelPopup channelPopup;
        try {
            this.LIZ = C2YJ.LIZIZ.LIZ.getAwemeActivitySetting();
            UrlModel urlModel = null;
            try {
                if (TextUtils.isEmpty(this.LIZLLL)) {
                    UgAwemeActivitySetting ugAwemeActivitySetting = this.LIZ;
                    if (ugAwemeActivitySetting != null && (channelPopup = ugAwemeActivitySetting.getChannelPopup()) != null) {
                        str = channelPopup.getCampaignName();
                    } else {
                        str = null;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        C10K.LIZJ(CallableC42227Ghj.LJLIL);
                    }
                }
            } catch (C158056If e) {
                C16880lQ.LLLLIIL(e);
            }
            if (LJFF()) {
                LJIIIZ();
                LJIIJ();
            }
            try {
                UgAwemeActivitySetting ugAwemeActivitySetting2 = this.LIZ;
                if (ugAwemeActivitySetting2 != null && (loginBanner = ugAwemeActivitySetting2.getLoginBanner()) != null) {
                    urlModel = loginBanner.getResourceUrl();
                }
                LJ(urlModel);
            } catch (C158056If e2) {
                C16880lQ.LLLLIIL(e2);
            }
        } catch (C158056If unused) {
        }
    }

    public final boolean LJFF() {
        int i = this.LIZJ.LIZIZ;
        if (i == 2) {
            return false;
        }
        if (i == 1) {
            return true;
        }
        try {
            String str = this.LIZLLL;
            UgAwemeActivitySetting ugAwemeActivitySetting = this.LIZ;
            String str2 = null;
            if (ugAwemeActivitySetting != null) {
                str2 = ugAwemeActivitySetting.getActivityId();
            }
            if (!TextUtils.equals(str, str2)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("DeepLink not show： DeepLinkID != activityId--->");
                LIZ.append(this.LIZLLL);
                String msg = X1D.LIZIZ(LIZ);
                o.LJIIIZ(msg, "msg");
                return false;
            }
            UgAwemeActivitySetting ugAwemeActivitySetting2 = this.LIZ;
            if (ugAwemeActivitySetting2 != null && ugAwemeActivitySetting2.getChannelPopup() != null) {
                this.LIZJ.LIZ(1);
                return true;
            }
            return false;
        } catch (C158056If unused) {
            return false;
        }
    }

    public final boolean LJIIIZ() {
        UrlModel urlModel;
        UgChannelPopup channelPopup;
        try {
            UgAwemeActivitySetting ugAwemeActivitySetting = this.LIZ;
            if (ugAwemeActivitySetting != null && (channelPopup = ugAwemeActivitySetting.getChannelPopup()) != null) {
                urlModel = channelPopup.getResourceUrl();
            } else {
                urlModel = null;
            }
            return LJ(urlModel);
        } catch (C158056If e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }

    public final void LJIIJ() {
        UrlModel urlModel;
        UgProfileActivityButton profileActivityButton;
        try {
            UgAwemeActivitySetting ugAwemeActivitySetting = this.LIZ;
            if (ugAwemeActivitySetting != null && (profileActivityButton = ugAwemeActivitySetting.getProfileActivityButton()) != null) {
                urlModel = profileActivityButton.getResourceUrl();
            } else {
                urlModel = null;
            }
            LJ(urlModel);
        } catch (C158056If unused) {
        }
    }

    public LV0() {
        C54268LRo c54268LRo = new C54268LRo();
        this.LIZJ = c54268LRo;
        this.LJFF = true;
        LIZJ();
        this.LIZLLL = c54268LRo.LIZLLL;
    }

    public static com.ss.android.ugc.aweme.base.model.UrlModel LJIIIIZZ(UrlModel urlModel) {
        List<String> urlList;
        com.ss.android.ugc.aweme.base.model.UrlModel urlModel2 = new com.ss.android.ugc.aweme.base.model.UrlModel();
        String str = null;
        if (urlModel == null) {
            urlList = null;
        } else {
            try {
                urlList = urlModel.getUrlList();
            } catch (C158056If e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        urlModel2.setUrlList(urlList);
        if (urlModel != null) {
            str = urlModel.getUri();
        }
        urlModel2.setUri(str);
        return urlModel2;
    }

    public final boolean LIZ(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("feacebook DeepLink:");
        LIZ.append(str);
        String msg = X1D.LIZIZ(LIZ);
        o.LJIIIZ(msg, "msg");
        if (TextUtils.indexOf(str, "snssdk1233://growth_activity_dialog") != 0 && TextUtils.indexOf(str, "snssdk1180://growth_activity_dialog") != 0) {
            return false;
        }
        this.LIZLLL = UriProtector.parse(str).getLastPathSegment();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("deepLinkRequestComplete:");
        LIZ2.append(str);
        String msg2 = X1D.LIZIZ(LIZ2);
        o.LJIIIZ(msg2, "msg");
        LJI("facebook");
        String str2 = this.LIZLLL;
        if (str2 != null) {
            C54268LRo c54268LRo = this.LIZJ;
            c54268LRo.LIZLLL = str2;
            c54268LRo.LIZ.storeString("activity_id_for_deeplink", str2);
        }
        this.LJ = true;
        if (!this.LJFF) {
            C2U8.LIZ(new C2L1());
        }
        if (LJFF()) {
            LJIIIZ();
            LJIIJ();
        }
        return true;
    }

    public final boolean LJ(UrlModel urlModel) {
        com.ss.android.ugc.aweme.base.model.UrlModel LJIIIIZZ = LJIIIIZZ(urlModel);
        com.ss.android.ugc.aweme.base.model.UrlModel LJIIIIZZ2 = LJIIIIZZ(urlModel);
        if (!C38891fp.LJJI(LJIIIIZZ2.getUrlList()) && C78765Uvh.LJIILIIL(UriProtector.parse((String) ListProtector.get(LJIIIIZZ2.getUrlList(), 0)))) {
            return true;
        }
        C78765Uvh.LJIILJJIL(LJIIIIZZ, 0, 0, new LV2(this));
        return false;
    }

    public final void LJI(String str) {
        try {
            if (this.LIZJ.LIZIZ == 2) {
                return;
            }
            Boolean isNewUser = C2YJ.LIZIZ.LIZ.getAwemeActivitySetting().getIsNewUser();
            String str2 = "old_user";
            o.LJIIIIZZ(isNewUser, "isNewUser");
            if (isNewUser.booleanValue()) {
                str2 = "new_user";
            }
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("media_source", str);
            c188727au.LJIIIZ("user_type", str2);
            FMX.LJIIL("coupon_targetusers", c188727au.LIZ);
        } catch (C158056If unused) {
        }
    }

    public static void LIZLLL(Context context, String url) {
        o.LJIIIZ(url, "url");
        o.LJIIIZ(context, "context");
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "aweme://webview/");
        buildRoute.withParam("url", url);
        buildRoute.open();
    }
}
