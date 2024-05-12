package X;

import Y.IDObjectS0S0101000;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModel;
import com.bytedance.als.dsl.AlsVMContainer;
import com.bytedance.als.dsl.OCAdapterViewModel;
import com.bytedance.android.livesdk.chatroom.utils.LastLiveActionInfo;
import com.bytedance.android.livesdk.livesetting.other.EnableLiveEcRecordsSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tux.input.TuxTextView;
import com.lynx.tasm.base.TraceEvent;
import com.ss.android.ugc.aweme.base.HomePageViewPagerAbility;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.im.sdk.privacy.data.model.ChatUserSetting;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.UuS, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78688UuS implements InterfaceC76645U6f, InterfaceC71445S2f, InterfaceC73459SsJ, InterfaceC83712WtI, InterfaceC67212QZk {
    public static boolean LJLIL;
    public static String LJLILLLLZI;
    public static J8Y LJLJI;
    public static Boolean LJLJJI;
    public static final C78688UuS LJLJJL = new C78688UuS();

    @Override // X.InterfaceC71445S2f
    public void LIZLLL(InterfaceC71480S3o style) {
        o.LJIIIZ(style, "style");
    }

    public static final void LJFF() {
        OJT ojt = OJT.LIZ;
        Application application = C60903NvH.LJ;
        o.LJIIIIZZ(application, "getApplication()");
        OR7.LLLIIL(new File(OJT.LIZJ(ojt, application)));
        C16880lQ.LLLZZIL(LJJJIL());
    }

    public static final boolean LJJIJIIJIL() {
        return ((Boolean) C45400Hro.LIZ.LIZIZ.getValue()).booleanValue();
    }

    public static final void LJJJLL() {
        if (!LJLIL) {
            LJLIL = true;
            CZB.LIZ.getClass();
            CZB.LJ(C77967Uip.class, R.layout.d7p, 1, 1);
            CZB.LJ(CZ8.class, R.layout.d7o, 7, 7);
        }
    }

    @Override // X.InterfaceC76645U6f
    public UB9 create() {
        Object LIZ = C75559Tl5.LIZIZ.LIZ("LIVE_VIDEO_CLIENT_FACTORY");
        if (LIZ instanceof UB9) {
            return (UB9) LIZ;
        }
        return null;
    }

    public static String LJJIIJ() {
        if (LiveOuterService.LJJJLL().LJJIJIIJI()) {
            C29245Bdp c29245Bdp = (C29245Bdp) LiveOuterService.LJJJLL().LJJIZ().LJJIJIL().T7();
            String json = GsonProtectorUtils.toJson(C09650Zl.LIZIZ, c29245Bdp.LIZJ(c29245Bdp.LIZJ, c29245Bdp.LIZLLL));
            o.LJIIIIZZ(json, "get().toJson(list)");
            return json;
        }
        return "";
    }

    public static String LJJIIJZLJL() {
        if (LiveOuterService.LJJJLL().LJJIJIIJI()) {
            C29245Bdp c29245Bdp = (C29245Bdp) LiveOuterService.LJJJLL().LJJIZ().LJJIJIL().T7();
            String json = GsonProtectorUtils.toJson(C09650Zl.LIZIZ, c29245Bdp.LIZJ(c29245Bdp.LIZ, c29245Bdp.LIZIZ));
            o.LJIIIIZZ(json, "get().toJson(list)");
            return json;
        }
        return "";
    }

    public static final File LJJJIL() {
        return C62850Ola.LJ().LJI(HB7.LIZ, EnumC43652HBg.TT_CAP_CUT, false);
    }

    public static void LJJJJLI() {
        LiveOuterService.LJJJLL().LJIIJJI();
        C55902Lwo.LJIIIIZZ();
        if (C55902Lwo.LJII) {
            return;
        }
        C55661Lsv.LJIJJ();
        if (C55661Lsv.LJIIJ(true)) {
            HashMap hashMap = new HashMap();
            hashMap.put("widget_type", "medium");
            FMX.LJIIL("livesdk_launch_widget", hashMap);
        }
        if (C55661Lsv.LJIIJ(false)) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("widget_type", "small");
            FMX.LJIIL("livesdk_launch_widget", hashMap2);
        }
    }

    public static final Bitmap LJ(InterfaceC12040dc interfaceC12040dc) {
        o.LJIIIZ(interfaceC12040dc, "<this>");
        if (interfaceC12040dc instanceof C1QV) {
            return ((C1QV) interfaceC12040dc).LIZIZ;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final List LJI(FragmentManager fragmentManager) {
        ArrayList arrayList = new ArrayList();
        for (Fragment fragment : fragmentManager.LJJJJLI()) {
            o.LJIIIIZZ(fragment, "fragment");
            arrayList.add(fragment);
            try {
                FragmentManager childFragmentManager = fragment.getChildFragmentManager();
                o.LJIIIIZZ(childFragmentManager, "fragment.childFragmentManager");
                arrayList.addAll(LJI(childFragmentManager));
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return arrayList;
    }

    public static final int LJIILIIL(float f) {
        float f2;
        DisplayMetrics displayMetrics;
        Resources resources = C58127Mrb.LIZIZ.getApplicationContext().getResources();
        if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            f2 = displayMetrics.density;
        } else {
            f2 = 0.0f;
        }
        return (int) ((f * f2) + 0.5f);
    }

    public static final IFeedFragmentAbility LJIILL(InterfaceC55235Lm3 interfaceC55235Lm3) {
        o.LJIIIZ(interfaceC55235Lm3, "<this>");
        return (IFeedFragmentAbility) C55096Ljo.LIZ(interfaceC55235Lm3, IFeedFragmentAbility.class, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Activity LJIJJ(AbstractC29891Fh activity) {
        o.LJIIIZ(activity, "$this$activity");
        return (Activity) ((InterfaceC135635Tz) activity).getDiContainer().LJ(Activity.class, null);
    }

    public static final List LJIJJLI(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AnoleModel anoleModel;
        java.util.Map<String, AnoleComponentModel> components;
        Collection<AnoleComponentModel> values;
        ArrayList arrayList = new ArrayList();
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (anoleModel = awemeRawAd.getAnoleModel()) != null && (components = anoleModel.getComponents()) != null && (values = components.values()) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (AnoleComponentModel anoleComponentModel : values) {
                if (arrayList.add(anoleComponentModel.getSlotID())) {
                    arrayList2.add(anoleComponentModel);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Context LJIL(AbstractC29891Fh applicationContext) {
        o.LJIIIZ(applicationContext, "$this$applicationContext");
        return (Context) ((InterfaceC135635Tz) applicationContext).getDiContainer().LJ(Context.class, "applicationContext");
    }

    public static UrlModel LJJ(User user) {
        if (user == null) {
            return null;
        }
        if (user.getAvatarThumb() != null) {
            return user.getAvatarThumb();
        }
        if (user.getAvatarMedium() != null) {
            return user.getAvatarMedium();
        }
        if (user.getAvatarLarger() == null) {
            return null;
        }
        C36922EeM.LIZ(new IllegalStateException("Your avatar image is too large !"));
        return user.getAvatarLarger();
    }

    public static UrlModel LJJI(User user) {
        if (user == null) {
            return null;
        }
        if (user.getAvatarMedium() != null) {
            return user.getAvatarMedium();
        }
        if (user.getAvatarThumb() != null) {
            return user.getAvatarThumb();
        }
        if (user.getAvatarLarger() == null) {
            return null;
        }
        return user.getAvatarLarger();
    }

    public static String[] LJJII(String str) {
        if (str == null || str.equalsIgnoreCase("")) {
            return null;
        }
        String[] split = str.split(" ");
        if (split.length > 4) {
            return null;
        }
        boolean z = true;
        for (int i = 0; i < Math.min(split.length, 4); i++) {
            if (split[i].endsWith("px") || split[i].endsWith("%")) {
                if (split[i].endsWith("px")) {
                    if (split[i].length() > 2) {
                        String str2 = split[i];
                        z = str2.substring(0, str2.length() - 2).matches("[+]?[0-9]*\\.?[0-9]+");
                    }
                } else {
                    if (split[i].endsWith("%")) {
                        if (split[i].length() > 1) {
                            String str3 = split[i];
                            z = str3.substring(0, str3.length() - 1).matches("[+]?[0-9]*\\.?[0-9]+");
                        }
                    }
                }
            }
            z = false;
        }
        if (!z) {
            return null;
        }
        return split;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Context LJJIII(AbstractC29891Fh context) {
        o.LJIIIZ(context, "$this$context");
        return (Context) ((InterfaceC135635Tz) context).getDiContainer().LJ(Context.class, null);
    }

    public static final int LJJIIZ(Throwable th) {
        o.LJIIIZ(th, "<this>");
        if (th instanceof C38306F1q) {
            return ((C38306F1q) th).getErrorCode();
        }
        return -1;
    }

    public static final HomePageViewPagerAbility LJJIJIIJI(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        return (HomePageViewPagerAbility) C55096Ljo.LIZIZ(C55230Lly.LIZLLL(activity, null), HomePageViewPagerAbility.class);
    }

    public static final String LJJIJL(Throwable th) {
        boolean z;
        String str;
        o.LJIIIZ(th, "<this>");
        if (!(th instanceof C38333F2r)) {
            return "unknown";
        }
        String response = ((C38333F2r) th).getResponse();
        if (response == null || response.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "unknown";
        }
        try {
            JSONObject optJSONObject = new JSONObject(response).optJSONObject("log_pb");
            if (optJSONObject != null) {
                str = optJSONObject.optString("impr_id");
            } else {
                str = null;
            }
            if (str == null) {
                return "unknown";
            }
            return str;
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    public static final String LJJIL(int i) {
        if (i == C9JT.SHOP.getId()) {
            return "shop";
        }
        if (i == C9JT.SHOWCASE.getId()) {
            return "showcase";
        }
        if (i == C9JT.LiveEvent.getId()) {
            return "live";
        }
        if (i == C9JT.SUBSCRIBE.getId()) {
            return "subscription";
        }
        if (i == C9JT.QA.getId()) {
            return "qa";
        }
        if (i == C9JT.Supporting.getId()) {
            return "supporting";
        }
        if (i == C9JT.Shoutouts.getId()) {
            return "shoutouts";
        }
        if (i == C9JT.Tipping.getId()) {
            return "tipping";
        }
        if (i == C9JT.COLLECTIONS.getId()) {
            return "collections";
        }
        return "";
    }

    public static WebViewClient LJJIZ(WebViewClient webViewClient) {
        if (webViewClient != null && "android.webkit.WebViewClient".equals(webViewClient.getClass().getName())) {
            return new C78691UuV();
        }
        return webViewClient;
    }

    public static final String LJJJI(int i) {
        String string = C44172HVg.LIZ.getString(i);
        o.LJIIIIZZ(string, "application.getString(this)");
        return string;
    }

    public static final HomePageViewPagerAbility LJJJJ(MainActivityScope mainActivityScope) {
        InterfaceC55235Lm3 interfaceC55235Lm3 = mainActivityScope.LJLIL;
        if (interfaceC55235Lm3 == null) {
            return null;
        }
        return (HomePageViewPagerAbility) C55096Ljo.LIZ(interfaceC55235Lm3, HomePageViewPagerAbility.class, null);
    }

    public static final boolean LJJJJIZL(String str) {
        Integer LJJIL;
        if (str != null && str.length() != 0 && (LJJIL = C38350F3i.LJJIL(str)) != null && LJJIL.intValue() > 0) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJJJ(Aweme aweme) {
        Boolean bool;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("isCastable: isAd: ");
        Integer num = null;
        if (aweme != null) {
            bool = Boolean.valueOf(aweme.isAd());
        } else {
            bool = null;
        }
        LIZ.append(bool);
        LIZ.append(", type: ");
        if (aweme != null) {
            num = Integer.valueOf(aweme.getAwemeType());
        }
        LIZ.append(num);
        LIZ.append(' ');
        X1D.LIZIZ(LIZ);
        if (aweme == null) {
            return false;
        }
        if (aweme.getAwemeType() == 101) {
            z = true;
        } else {
            z = false;
        }
        if (aweme.getAwemeType() == 4000) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean isWithSurvey = aweme.isWithSurvey();
        if (aweme.getAwemeType() == 150 || aweme.getAwemeType() == 501) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (aweme.getAwemeType() == 40 || aweme.getAwemeType() == 14 || aweme.getAwemeType() == 15) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (aweme.getAwemeType() == 41 || aweme.getAwemeType() == 43) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (aweme.getAwemeType() == 160) {
            z6 = true;
        } else {
            z6 = false;
        }
        boolean isReferralFakeAweme = aweme.isReferralFakeAweme();
        if (aweme.getAwemeType() == 4000 || aweme.getAwemeType() == 4001 || aweme.getAwemeType() == 4002 || aweme.getAwemeType() == 4003 || aweme.getAwemeType() == 4004) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!aweme.isPublic() || aweme.getAuthor().isAccuratePrivateAccount()) {
            z8 = true;
        } else {
            z8 = false;
        }
        boolean isDelete = aweme.isDelete();
        boolean LJIIIIZZ = C220858ld.LJIIIIZZ(aweme);
        if (isDelete || LJIIIIZZ || z8 || isReferralFakeAweme || z || z2 || z3 || z4 || z5 || isWithSurvey || z6 || z7) {
            return false;
        }
        return true;
    }

    public static final C81926WDi LJJJJJL(InterfaceC65784Pro initializer) {
        o.LJIIJ(initializer, "initializer");
        return new C81926WDi(initializer);
    }

    public static void LJJJJL(String str) {
        HashMap LIZ = C45243HpH.LIZ("enter_from_merge", str, "_param_live_platform", "live");
        if (!TextUtils.isEmpty("")) {
            LIZ.put("gd_label", "");
        }
        FMX.LJIIL("livesdk_enter_live_merge", LIZ);
    }

    public static void LJJJJZ(java.util.Map map) {
        String str;
        LastLiveActionInfo LIZIZ;
        if (C15380j0.LJIILLIIL()) {
            str = " portrait";
        } else {
            str = "landscape";
        }
        map.put("room_orientation", str);
        FMX.LJIIL("livesdk_live_show", map);
        C29245Bdp c29245Bdp = (C29245Bdp) LiveOuterService.LJJJLL().LJJIZ().LJJIJIL().T7();
        c29245Bdp.getClass();
        if (EnableLiveEcRecordsSetting.INSTANCE.getValue() && (LIZIZ = C29245Bdp.LIZIZ(map)) != null) {
            c29245Bdp.LIZ(LIZIZ, c29245Bdp.LIZ, c29245Bdp.LIZIZ);
        }
    }

    public static String LJJJLIIL(IY3 iy3) {
        if (iy3 == null) {
            return "parse-null";
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(iy3.LIZ());
        LIZ.append(",");
        LIZ.append(iy3.LJ());
        LIZ.append(",");
        LIZ.append(iy3.LIZIZ());
        LIZ.append(",");
        LIZ.append(iy3.LIZLLL());
        LIZ.append(",");
        LIZ.append(iy3.LIZJ());
        return X1D.LIZIZ(LIZ);
    }

    public static final int LJJJLZIJ(int i) {
        float f;
        DisplayMetrics displayMetrics;
        float f2 = i;
        Resources resources = C58127Mrb.LIZIZ.getApplicationContext().getResources();
        if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            f = displayMetrics.density;
        } else {
            f = 0.0f;
        }
        return (int) ((f2 / f) + 0.5f);
    }

    public static void LJJLIIIJ(Context context) {
        if (!FCD.LJI(context)) {
            return;
        }
        try {
            FFL.LJIIIZ().getClass();
            boolean LJ = FFL.LJ(31744, "keva_load_opt_enable_v3", true, false);
            File file = new File(C16880lQ.LLIIJLIL(context) + "/is_keva_load_opt_enabled_v3.cfg");
            if (LJ) {
                if (!file.exists() && !file.createNewFile()) {
                    file.createNewFile();
                }
            } else if (!C16880lQ.LLLZZIL(file)) {
                C16880lQ.LLLZZIL(file);
            }
        } catch (Throwable unused) {
        }
    }

    public static final Bitmap.Config LJJLIIIJJI(int i) {
        if (i == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i == 2) {
            return Bitmap.Config.RGB_565;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (i == 3) {
                return Bitmap.Config.RGBA_F16;
            }
            if (i == 4) {
                return Bitmap.Config.HARDWARE;
            }
        }
        return Bitmap.Config.ARGB_8888;
    }

    @Override // X.InterfaceC71445S2f
    public TuxTextView LIZ(Object obj) {
        ViewGroup containerView = (ViewGroup) obj;
        o.LJIIIZ(containerView, "containerView");
        Context context = containerView.getContext();
        o.LJIIIIZZ(context, "containerView.context");
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setId(R.id.cmt);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setMaxLines(1);
        tuxTextView.setTextAlignment(5);
        containerView.addView(tuxTextView, 0, new ViewGroup.LayoutParams(-2, -2));
        return tuxTextView;
    }

    @Override // X.InterfaceC71445S2f
    public TuxTextView LIZIZ(Object containerView) {
        o.LJIIIZ(containerView, "containerView");
        return null;
    }

    @Override // X.InterfaceC71445S2f
    public TuxTextView LIZJ(Object containerView) {
        o.LJIIIZ(containerView, "containerView");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001e, code lost:
    
        r4 = r4 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJII(org.json.JSONArray r8, java.lang.Object[] r9) {
        /*
            r7 = 1
            if (r9 != 0) goto L4
            return r7
        L4:
            int r6 = r9.length
            r5 = 0
            r4 = 0
        L7:
            if (r4 >= r6) goto L25
            r3 = r9[r4]
            int r2 = r8.length()
            r1 = 0
        L10:
            if (r1 >= r2) goto L24
            if (r3 == 0) goto L21
            java.lang.Object r0 = r8.opt(r1)
            boolean r0 = kotlin.jvm.internal.o.LJ(r3, r0)
            if (r0 == 0) goto L21
            int r4 = r4 + 1
            goto L7
        L21:
            int r1 = r1 + 1
            goto L10
        L24:
            return r5
        L25:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78688UuS.LJII(org.json.JSONArray, java.lang.Object[]):boolean");
    }

    public static final C5DY LJIIIIZZ(C1290754t c1290754t, String fileId) {
        o.LJIIIZ(fileId, "fileId");
        return new C5DY(c1290754t.LJLIL, c1290754t.LJLILLLLZI, fileId);
    }

    public static final void LJIIJ(C29S data, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(data, "$this$data");
        OCAdapterViewModel LJIILLIIL = LJIILLIIL(data, null);
        if (LJIILLIIL.LJLILLLLZI != null) {
            throw new IllegalStateException("Can't invoke data{} because previous ObjectContainer has already created");
        }
        C82621Wbh c82621Wbh = LJIILLIIL.LJLIL;
        C82624Wbk LIZJ = c82621Wbh.LIZJ(C29S.class, null, data);
        LIZJ.LIZ(ActivityC45651qj.class);
        LIZJ.LIZ(Activity.class);
        c82621Wbh.LIZJ(Context.class, null, data);
        Context applicationContext = C16880lQ.LLLLLIL(data);
        o.LJIIIIZZ(applicationContext, "applicationContext");
        c82621Wbh.LIZJ(Context.class, "applicationContext", applicationContext);
        interfaceC88472Yns.invoke(c82621Wbh);
        LJIILLIIL.gv0();
        LJIILLIIL.hv0();
    }

    public static final void LJIIJJI(AbstractC40841iy data, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(data, "$this$data");
        OCAdapterViewModel LJIIZILJ = LJIIZILJ(data, null);
        C82621Wbh c82621Wbh = LJIIZILJ.LJLIL;
        c82621Wbh.LIZJ(AbstractC40841iy.class, null, data);
        interfaceC88472Yns.invoke(c82621Wbh);
        LJIIZILJ.gv0();
        LJIIZILJ.hv0();
    }

    public static final OCAdapterViewModel LJIILLIIL(ActivityC45651qj activity, StackTraceElement[] stackTraceElementArr) {
        o.LJIIIZ(activity, "activity");
        AlsVMContainer alsVMContainer = (AlsVMContainer) C09260Xy.LIZ(activity, AlsVMContainer.class);
        alsVMContainer.gv0(activity);
        if (alsVMContainer.LJLJI == null) {
            String LJFF = C65352Pkq.LIZ(activity.getClass()).LJFF();
            if (LJFF == null) {
                LJFF = "";
            }
            alsVMContainer.LJLJI = new OCAdapterViewModel(LJFF, null, alsVMContainer.LJLIL, stackTraceElementArr);
        }
        OCAdapterViewModel oCAdapterViewModel = alsVMContainer.LJLJI;
        o.LJI(oCAdapterViewModel);
        return oCAdapterViewModel;
    }

    public static final OCAdapterViewModel LJIIZILJ(AbstractC40841iy component, StackTraceElement[] stackTraceElementArr) {
        o.LJIIIZ(component, "component");
        ViewModel viewModel = C0I9.LIZ(component).get(AlsVMContainer.class);
        o.LJIIIIZZ(viewModel, "ComponentViewModelProvid…sVMContainer::class.java]");
        AlsVMContainer alsVMContainer = (AlsVMContainer) viewModel;
        if (alsVMContainer.LJLJI == null) {
            String LJFF = C65352Pkq.LIZ(component.getClass()).LJFF();
            if (LJFF == null) {
                LJFF = "";
            }
            alsVMContainer.LJLJI = new OCAdapterViewModel(LJFF, component.LJLILLLLZI, alsVMContainer.LJLIL, stackTraceElementArr);
        }
        OCAdapterViewModel oCAdapterViewModel = alsVMContainer.LJLJI;
        o.LJI(oCAdapterViewModel);
        return oCAdapterViewModel;
    }

    public static final boolean LJIJI(View view, View view2) {
        ViewGroup viewGroup;
        if (view == view2) {
            return true;
        }
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            Iterator<View> it = C78924UyG.LIZLLL(viewGroup).iterator();
            while (true) {
                IDObjectS0S0101000 iDObjectS0S0101000 = (IDObjectS0S0101000) it;
                if (!iDObjectS0S0101000.hasNext()) {
                    break;
                }
                Object next = iDObjectS0S0101000.next();
                if (LJIJI((View) next, view2)) {
                    if (next != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final EnumC78689UuT LJJIFFI(int i, boolean z) {
        switch (i) {
            case 1:
                if (!z) {
                    return EnumC78689UuT.IS_LINKING;
                }
                return EnumC78689UuT.IS_LINKING_TOAST;
            case 2:
                if (!z) {
                    return EnumC78689UuT.INVITATION_DENIED;
                }
                return EnumC78689UuT.INVITATION_DENIED_TOAST;
            case 3:
                return EnumC78689UuT.PERMISSION_DENIED;
            case 4:
                return EnumC78689UuT.LOW_CLIENT_VERSION;
            case 5:
                return EnumC78689UuT.ROOM_PAUSED;
            case 6:
                return EnumC78689UuT.POS_FULL;
            case 7:
                return EnumC78689UuT.MATURE_THEME_NOT_MATCH;
            default:
                return null;
        }
    }

    public static final Fragment LJJIJ(ActivityC45651qj activityC45651qj, View v) {
        o.LJIIIZ(v, "v");
        InterfaceC78692UuW interfaceC78692UuW = C78693UuX.LIZ;
        if (interfaceC78692UuW != null) {
            return interfaceC78692UuW.LIZ(activityC45651qj, v);
        }
        FragmentManager supportFragmentManager = activityC45651qj.getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "this.supportFragmentManager");
        List LJI = LJI(supportFragmentManager);
        int size = ((ArrayList) LJI).size() - 1;
        if (size < 0) {
            return null;
        }
        while (true) {
            int i = size - 1;
            Fragment fragment = (Fragment) ListProtector.get(LJI, size);
            if (LJIJI(fragment.getView(), v)) {
                return fragment;
            }
            if (i < 0) {
                return null;
            }
            size = i;
        }
    }

    public static final C177336xd LJJJ(C174366sq c174366sq, Aweme aweme) {
        String str;
        C177336xd c177336xd = new C177336xd();
        c177336xd.LJLLI = aweme;
        c177336xd.LJLLILLLL = Boolean.TRUE;
        String str2 = null;
        if (c174366sq != null) {
            str = c174366sq.getEnterFrom();
        } else {
            str = null;
        }
        c177336xd.LJLJJLL = str;
        if (c174366sq != null) {
            str2 = c174366sq.getEventType();
        }
        c177336xd.LJLJL = str2;
        c177336xd.LJLJLJ = c174366sq;
        return c177336xd;
    }

    public static boolean LJJJJI(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        J8Y j8y = LJLJI;
        if (j8y != null) {
            j8y.LIZ(webView, renderProcessGoneDetail);
        }
        return true;
    }

    public static final android.net.Uri LJJLI(android.net.Uri uri, List list) {
        if (!uri.isHierarchical()) {
            return uri;
        }
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        o.LJIIIIZZ(clearQuery, "this.buildUpon().clearQuery()");
        for (String str : UriProtector.getQueryParameterNames(uri)) {
            if (!list.contains(str)) {
                Iterator<String> it = UriProtector.getQueryParameters(uri, str).iterator();
                while (it.hasNext()) {
                    clearQuery.appendQueryParameter(str, it.next());
                }
            }
        }
        android.net.Uri build = clearQuery.build();
        o.LJIIIIZZ(build, "builder.build()");
        return build;
    }

    public static final void LJJLIIIJILLIZJL(TextPaint textPaint, float f) {
        o.LJIIIZ(textPaint, "<this>");
        if (!Float.isNaN(f)) {
            textPaint.setAlpha(O6R.LJJIIZ(C78842Uww.LJIIJJI(f, 0.0f, 1.0f) * 255));
        }
    }

    @Override // X.InterfaceC73459SsJ
    public void accept(Object obj, Object obj2) {
        PushSettings pushSettings = (PushSettings) obj;
        if (pushSettings != null) {
            C80993Fv.LIZ().LIZJ(new ChatUserSetting(pushSettings.chatSet, pushSettings.chatSettingsPanel, pushSettings.chatUserType));
        }
    }

    public static final C82622Wbi LJIIIZ(WMH data, boolean z, InterfaceC88472Yns init) {
        o.LJIIIZ(data, "$this$data");
        o.LJIIIZ(init, "init");
        OCAdapterViewModel LJIJ = LJIJ(data, z, null, 4);
        if (LJIJ.LJLILLLLZI != null) {
            throw new IllegalStateException("Can't invoke data{} because previous ObjectContainer has already created");
        }
        C82621Wbh c82621Wbh = LJIJ.LJLIL;
        c82621Wbh.LIZJ(WMH.class, null, data);
        init.invoke(c82621Wbh);
        LJIJ.gv0();
        return LJIJ.hv0();
    }

    public static float[] LJJIIZI(String[] strArr, int i, int i2) {
        if (strArr == null || strArr.length > 4) {
            return null;
        }
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f};
        for (int i3 = 0; i3 < strArr.length; i3++) {
            if (strArr[i3].endsWith("px")) {
                String str = strArr[i3];
                fArr[i3] = CastFloatProtector.parseFloat(str.substring(0, str.length() - 2));
            } else if (strArr[i3].endsWith("%")) {
                if (i3 == 0 || i3 == 2) {
                    String str2 = strArr[i3];
                    fArr[i3] = CastFloatProtector.parseFloat(str2.substring(0, str2.length() - 2)) * i2;
                } else {
                    String str3 = strArr[i3];
                    fArr[i3] = CastFloatProtector.parseFloat(str3.substring(0, str3.length() - 2)) * i;
                }
            }
        }
        return fArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        if (android.text.TextUtils.equals(r3, "message") != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject LJJIJIL(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
        /*
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r0 = "position"
            r1.put(r0, r3)     // Catch: org.json.JSONException -> L60
            java.lang.String r2 = X.EF7.LIZ()     // Catch: org.json.JSONException -> L60
            java.lang.String r0 = "musical_ly"
            boolean r0 = android.text.TextUtils.equals(r2, r0)     // Catch: org.json.JSONException -> L60
            if (r0 == 0) goto L5a
            java.lang.String r0 = "push"
            boolean r0 = android.text.TextUtils.equals(r3, r0)     // Catch: org.json.JSONException -> L60
            if (r0 == 0) goto L2b
            java.lang.String r4 = "click_push"
        L20:
            java.lang.String r0 = "enter_method"
            r1.put(r0, r4)     // Catch: org.json.JSONException -> L60
        L25:
            java.lang.String r0 = "request_id"
            r1.put(r0, r5)     // Catch: org.json.JSONException -> L60
            goto L64
        L2b:
            java.lang.String r0 = "homepage_follow"
            boolean r0 = android.text.TextUtils.equals(r3, r0)     // Catch: org.json.JSONException -> L60
            if (r0 == 0) goto L3c
            java.lang.String r0 = "head"
            boolean r0 = android.text.TextUtils.equals(r4, r0)     // Catch: org.json.JSONException -> L60
            if (r0 == 0) goto L3c
            goto L57
        L3c:
            java.lang.String r0 = "others_homepage"
            boolean r0 = android.text.TextUtils.equals(r3, r0)     // Catch: org.json.JSONException -> L60
            if (r0 != 0) goto L4c
            java.lang.String r0 = "video"
            boolean r0 = android.text.TextUtils.equals(r4, r0)     // Catch: org.json.JSONException -> L60
            if (r0 == 0) goto L4f
        L4c:
            java.lang.String r4 = "click_head"
            goto L20
        L4f:
            java.lang.String r0 = "message"
            boolean r0 = android.text.TextUtils.equals(r3, r0)     // Catch: org.json.JSONException -> L60
            if (r0 == 0) goto L20
        L57:
            java.lang.String r4 = "click_watch_button"
            goto L20
        L5a:
            java.lang.String r0 = "style"
            r1.put(r0, r4)     // Catch: org.json.JSONException -> L60
            goto L25
        L60:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L64:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78688UuS.LJJIJIL(java.lang.String, java.lang.String, java.lang.String):org.json.JSONObject");
    }

    public static void LJJJJZI(long j, String str, String str2) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("anchor_id", str);
        c188727au.LJIIIZ("anchor_status", str2);
        if (j <= 0) {
            j = 0;
        }
        c188727au.LJIIIZ("room_id", String.valueOf(j));
        FMX.LJIIL("livesdk_push_click_lookup_anchor", c188727au.LIZ);
    }

    public static OCAdapterViewModel LJIJ(WM7 scene, boolean z, C82622Wbi c82622Wbi, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            c82622Wbi = null;
        }
        o.LJIIIZ(scene, "scene");
        ViewModel viewModel = C165716et.LIZ(scene).get(AlsVMContainer.class);
        o.LJIIIIZZ(viewModel, "SceneViewModelProviders.…sVMContainer::class.java]");
        AlsVMContainer alsVMContainer = (AlsVMContainer) viewModel;
        if (alsVMContainer.LJLJI == null) {
            if (c82622Wbi == null) {
                if (z) {
                    WM7 wm7 = scene.mParentScene;
                    while (true) {
                        if (wm7 != null) {
                            if (wm7 instanceof WMH) {
                                ViewModel viewModel2 = C165716et.LIZ(wm7).get(AlsVMContainer.class);
                                o.LJIIIIZZ(viewModel2, "SceneViewModelProviders.…sVMContainer::class.java]");
                                if (((AlsVMContainer) viewModel2).LJLILLLLZI != null) {
                                    c82622Wbi = C44384HbQ.LJJLIIIJJI((WMH) wm7);
                                    break;
                                }
                            }
                            wm7 = wm7.mParentScene;
                        } else {
                            Activity requireActivity = scene.requireActivity();
                            if (requireActivity != null) {
                                ActivityC45651qj activityC45651qj = (ActivityC45651qj) requireActivity;
                                if (((AlsVMContainer) C09260Xy.LIZ(activityC45651qj, AlsVMContainer.class)).LJLILLLLZI != null) {
                                    c82622Wbi = C44384HbQ.LJJIZ(activityC45651qj).LJLLL;
                                }
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                            }
                        }
                    }
                } else {
                    WM7 wm72 = scene.mParentScene;
                    if (wm72 != null && (wm72 instanceof WMH)) {
                        c82622Wbi = C44384HbQ.LJJLIIIJJI((WMH) wm72);
                    } else {
                        Activity requireActivity2 = scene.requireActivity();
                        if (requireActivity2 != null) {
                            ActivityC45651qj activityC45651qj2 = (ActivityC45651qj) requireActivity2;
                            if (((AlsVMContainer) C09260Xy.LIZ(activityC45651qj2, AlsVMContainer.class)).LJLILLLLZI != null) {
                                c82622Wbi = C44384HbQ.LJJIZ(activityC45651qj2).LJLLL;
                            }
                            c82622Wbi = null;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                        }
                    }
                }
            }
            String LJFF = C65352Pkq.LIZ(scene.getClass()).LJFF();
            if (LJFF == null) {
                LJFF = "";
            }
            alsVMContainer.LJLJI = new OCAdapterViewModel(LJFF, c82622Wbi, alsVMContainer.LJLIL, null);
        }
        OCAdapterViewModel oCAdapterViewModel = alsVMContainer.LJLJI;
        o.LJI(oCAdapterViewModel);
        return oCAdapterViewModel;
    }

    public static void LJJJJLL(int i, String str, long j, JSONObject jSONObject) {
        if (i == 0) {
            FMX.LJI(j, "impression", "live", str, jSONObject);
        } else {
            if (i != 1) {
                return;
            }
            FMX.LJI(j, "enter_detail", "live_aud", str, jSONObject);
        }
    }

    public static final void LJJLIIIIJ(MotionEvent event, View view, JQA jqa, Aweme aweme) {
        String str;
        o.LJIIIZ(event, "event");
        String str2 = null;
        if (jqa != null) {
            str2 = jqa.LJFF;
        }
        if (!o.LJ(str2, "general_search")) {
            return;
        }
        Context LIZIZ = EF7.LIZIZ();
        int LJJJJI = C17N.LJJJJI(C60996Nwm.LJIIIIZZ(LIZIZ));
        int LJJJJI2 = C17N.LJJJJI(C60996Nwm.LJ(LIZIZ));
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        int LJJJJI3 = C17N.LJJJJI(event.getRawX() - iArr[0]);
        int LJJJJI4 = C17N.LJJJJI(event.getRawY() - iArr[1]);
        C49076JNw c49076JNw = new C49076JNw();
        c49076JNw.LJIJI(jqa.LJFF);
        if (aweme == null || (str = aweme.getGroupId()) == null) {
            str = "";
        }
        c49076JNw.LJIJ("search_result_id", str);
        c49076JNw.LJIIZILJ("btm", "a2270.b6880.c8153.d0");
        c49076JNw.LJIIZILJ("x", String.valueOf(LJJJJI3));
        c49076JNw.LJIIZILJ("y", String.valueOf(LJJJJI4));
        c49076JNw.LJIIZILJ("rank", String.valueOf(jqa.LJIIL));
        c49076JNw.LJIIZILJ("screen_width", String.valueOf(LJJJJI));
        c49076JNw.LJIIZILJ("screen_height", String.valueOf(LJJJJI2));
        c49076JNw.LJIILIIL();
    }

    public static Matrix LJJIJLIJ(int i, int i2, int i3, int i4, EnumC78690UuU enumC78690UuU) {
        TraceEvent.LIZIZ("image.NinePatchHelper.getMatrix");
        Matrix matrix = new Matrix();
        float f = i;
        float f2 = i3;
        float f3 = (f * 1.0f) / f2;
        float f4 = i2;
        float f5 = i4;
        float f6 = (f4 * 1.0f) / f5;
        if (enumC78690UuU == EnumC78690UuU.SCALE_TO_FILL) {
            matrix.preScale(f3, f6);
        } else if (enumC78690UuU == EnumC78690UuU.ASPECT_FIT) {
            if (f3 > f6) {
                matrix.setScale(f6, f6);
                matrix.postTranslate((f - (f2 * f6)) / 2.0f, 0.0f);
            } else {
                matrix.setScale(f3, f3);
                matrix.postTranslate(0.0f, (f4 - (f5 * f3)) / 2.0f);
            }
        } else if (enumC78690UuU == EnumC78690UuU.ASPECT_FILL) {
            if (f3 > f6) {
                matrix.setScale(f3, f3);
                matrix.postTranslate(0.0f, (f4 - (f5 * f3)) / 2.0f);
            } else {
                matrix.setScale(f6, f6);
                matrix.postTranslate((f - (f2 * f6)) / 2.0f, 0.0f);
            }
        } else {
            float LIZ = V9Y.LIZ(1.0f);
            float round = Math.round((f - (f2 * LIZ)) * 0.5f);
            float round2 = Math.round((f4 - (f5 * LIZ)) * 0.5f);
            matrix.setScale(LIZ, LIZ);
            matrix.postTranslate(round, round2);
        }
        TraceEvent.LJ("image.NinePatchHelper.getMatrix");
        return matrix;
    }

    public static final void LJJL(DataChannel dataChannel, String str, String anchor_id, String room_id, String live_type, String page_level, String red_dot_id) {
        o.LJIIIZ(anchor_id, "anchor_id");
        o.LJIIIZ(room_id, "room_id");
        o.LJIIIZ(live_type, "live_type");
        o.LJIIIZ(page_level, "page_level");
        o.LJIIIZ(red_dot_id, "red_dot_id");
        HashMap hashMap = new HashMap();
        hashMap.put("anchor_id", anchor_id);
        hashMap.put("room_id", room_id);
        hashMap.put("live_type", live_type);
        hashMap.put("page_level", page_level);
        hashMap.put("red_dot_id", red_dot_id);
        BZI LIZ = C28787BRn.LIZ(str);
        LIZ.LJIILLIIL(dataChannel);
        LIZ.LJJIFFI(hashMap);
        LIZ.LJJIIJZLJL();
    }

    public static void LJJJZ(DataChannel dataChannel, String str, String anchor_id, String room_id, String live_type, String str2, String page_level, String red_dot_id) {
        o.LJIIIZ(anchor_id, "anchor_id");
        o.LJIIIZ(room_id, "room_id");
        o.LJIIIZ(live_type, "live_type");
        o.LJIIIZ(page_level, "page_level");
        o.LJIIIZ(red_dot_id, "red_dot_id");
        HashMap hashMap = new HashMap();
        hashMap.put("anchor_id", anchor_id);
        hashMap.put("room_id", room_id);
        hashMap.put("live_type", live_type);
        hashMap.put("event_page", str2);
        hashMap.put("page_level", page_level);
        hashMap.put("red_dot_id", red_dot_id);
        BZI LIZ = C28787BRn.LIZ(str);
        LIZ.LJIILLIIL(dataChannel);
        LIZ.LJJIFFI(hashMap);
        LIZ.LJJIIJZLJL();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x020c, code lost:
    
        r9 = r9 * r0;
        r11 = X.C1I0.LIZ(r3, r9, 2.0f, 0.0f);
        r0 = 0.0f;
        r3 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x020a, code lost:
    
        if (r0 > r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x00f5, code lost:
    
        if (r0 > r0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x00f7, code lost:
    
        r11 = r11 * r0;
        r0 = X.C1I0.LIZ(r2, r11, 2.0f, 0.0f);
        r2 = r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIILJJIL(int r29, int r30, int r31, int r32, X.EnumC78690UuU r33, float[] r34, float r35, android.graphics.Canvas r36, android.graphics.Bitmap r37) {
        /*
            Method dump skipped, instructions count: 579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78688UuS.LJIILJJIL(int, int, int, int, X.UuU, float[], float, android.graphics.Canvas, android.graphics.Bitmap):void");
    }
}
