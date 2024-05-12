package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.roomfunction.SchemaHandleReportSetting;
import com.bytedance.ies.ugc.aweme.commercialize.search.core.SearchAdMainService;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategoryExtra;
import com.ss.android.ugc.aweme.tools.beauty.service.BeautyFilterConfig;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.ttvideoengine.TTVideoEngine;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Uyf */
/* loaded from: classes14.dex */
public final class C78949Uyf implements InterfaceC58392Mvs, InterfaceC80692Vlg, InterfaceC31922Cfu, InterfaceC83166WkU {
    public static InterfaceC68819Qzf LJLIL;
    public static final C78949Uyf LJLILLLLZI = new C78949Uyf();

    @Override // X.InterfaceC80692Vlg
    public void LJFF(C164456cr c164456cr) {
    }

    public static final void LJIIIIZZ(InterfaceC30237Btp parentView) {
        o.LJIIIZ(parentView, "parentView");
        if (parentView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.LayoutParams layoutParams = parentView.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.height = C15380j0.LIZ(56.0f);
            marginLayoutParams.width = C15380j0.LIZ(44.0f);
            marginLayoutParams.setMarginStart(0);
            marginLayoutParams.setMarginEnd(0);
            parentView.setLayoutParams(marginLayoutParams);
        }
    }

    public static boolean LJIIJ(Comment comment) {
        if (comment == null || !HG3.LJIILL().isLogin()) {
            return false;
        }
        return true;
    }

    public static C68772Qyu LJIILJJIL(Bitmap bitmap) {
        QH7.LJIIIZ(bitmap, "image must not be null");
        try {
            InterfaceC68819Qzf interfaceC68819Qzf = LJLIL;
            QH7.LJIIIZ(interfaceC68819Qzf, "IBitmapDescriptorFactory is not initialized");
            return new C68772Qyu(interfaceC68819Qzf.LJJZ(bitmap));
        } catch (RemoteException e) {
            throw new C68463Qtv(e);
        }
    }

    public static final Activity LJIILL(Context context) {
        boolean z;
        Context baseContext;
        if (context == null) {
            z = true;
        } else {
            z = context instanceof Application;
        }
        if (z) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper) || (baseContext = ((ContextWrapper) context).getBaseContext()) == null) {
            return null;
        }
        return LJIILL(baseContext);
    }

    public static final String LJIILLIIL(Effect effect) {
        List<String> tags;
        String str;
        if (effect != null && (tags = effect.getTags()) != null) {
            Iterator<String> it = tags.iterator();
            while (true) {
                if (it.hasNext()) {
                    str = it.next();
                    String str2 = str;
                    if (str2 != null && str2.length() > 0) {
                        break;
                    }
                } else {
                    str = null;
                    break;
                }
            }
            String str3 = str;
            if (str3 != null) {
                return str3;
            }
        }
        return "";
    }

    public static final String LJIIZILJ(Aweme aweme) {
        java.util.Map<String, String> searchExtraParams;
        if (aweme != null && (searchExtraParams = aweme.getSearchExtraParams()) != null) {
            return searchExtraParams.get("dual_stream_enter_aid");
        }
        return null;
    }

    public static final String LJIJ(InterfaceC194547kI interfaceC194547kI) {
        o.LJIIIZ(interfaceC194547kI, "<this>");
        switch (interfaceC194547kI.z()) {
            case 0:
            case 3:
            case 6:
            default:
                return "homepage_now";
            case 1:
                return "now_explore_page";
            case 2:
                return "homepage_hot";
            case 4:
                return "now_memories";
            case 5:
                return "homepage_friends";
        }
    }

    public static final String LJIJI(SearchMixFeedList searchMixFeedList) {
        Object LIZ;
        o.LJIIIZ(searchMixFeedList, "<this>");
        Object obj = null;
        try {
            JSONObject optJSONObject = new JSONObject(searchMixFeedList.LJLIL).optJSONObject("extra");
            if (optJSONObject != null) {
                LIZ = optJSONObject.optString("inner_search_id");
            } else {
                LIZ = null;
            }
            if (LIZ == null) {
                LIZ = "";
            }
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (!C3C5.m12isFailureimpl(LIZ)) {
            obj = LIZ;
        }
        return (String) obj;
    }

    public static void LJIJJ(String str) {
        if (TextUtils.isEmpty(str) || str.startsWith("webextension_")) {
            return;
        }
        C1JX.LJIIIIZZ("webextension_", str);
    }

    public static final boolean LJJIFFI(Aweme aweme) {
        String str;
        if (aweme != null) {
            java.util.Map<String, String> searchExtraParams = aweme.getSearchExtraParams();
            if (searchExtraParams != null) {
                str = searchExtraParams.get("dual_stream_inner_item_mark");
            } else {
                str = null;
            }
            if (o.LJ(str, "inner")) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJJIII(Effect effect) {
        String effectId;
        Integer LJJIL;
        if (effect == null || (effectId = effect.getEffectId()) == null || (LJJIL = C38350F3i.LJJIL(effectId)) == null || LJJIL.intValue() < 0) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIIJ(SearchMixFeed searchMixFeed) {
        if (searchMixFeed == null) {
            return false;
        }
        if (!JWA.LIZJ(Integer.valueOf(searchMixFeed.getFeedType()), searchMixFeed.LJI()) && !JWA.LIZLLL(Integer.valueOf(searchMixFeed.getFeedType()), searchMixFeed.LJI())) {
            return false;
        }
        return true;
    }

    public static final void LJJIIZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && aweme.isAd()) {
            NIW LJII = SearchAdMainService.LJIIJJI().LJII();
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            C49763Jfz.LIZ(LJII, awemeRawAd, true, false, 4);
        }
    }

    public static android.net.Uri LJJIIZI(String path) {
        o.LJIIJ(path, "path");
        Uri.Builder path2 = new Uri.Builder().scheme("assets").authority("relative").path(path);
        o.LJFF(path2, "Uri.Builder()\n    .schem…RITY_RELATIVE).path(path)");
        android.net.Uri build = path2.build();
        o.LJFF(build, "Uri.Builder()\n    .schem…raPart(sourceUri).build()");
        return build;
    }

    public static android.net.Uri LJJIJ(String path) {
        o.LJIIJ(path, "path");
        Uri.Builder path2 = new Uri.Builder().scheme("local_file").authority("relative").path(path);
        o.LJFF(path2, "Uri.Builder()\n    .schem…RITY_RELATIVE).path(path)");
        android.net.Uri build = path2.build();
        o.LJFF(build, "Uri.Builder()\n    .schem…raPart(sourceUri).build()");
        return build;
    }

    public static final C98593tv LJJIJIL(C99003ua c99003ua) {
        String str;
        o.LJIIIZ(c99003ua, "<this>");
        C98593tv c98593tv = new C98593tv();
        c98593tv.setEnterFromForMob(c99003ua.getEnterFrom());
        c98593tv.setEnterMethodForMob(c99003ua.getEnterMethod());
        java.util.Map<String, String> takoQueryRequestExtra = c99003ua.getTakoQueryRequestExtra();
        if (takoQueryRequestExtra != null) {
            str = takoQueryRequestExtra.get("gid");
        } else {
            str = null;
        }
        c98593tv.setGroupId(str);
        c98593tv.setImUser(c99003ua.getImUser());
        c98593tv.setChatType(c99003ua.getChatType());
        c98593tv.setSessionId(c99003ua.getSessionId());
        c98593tv.setSearchId(c99003ua.getSearchId());
        c98593tv.setLastVideoPlayDuration(c99003ua.getLastVideoPlayDuration());
        c98593tv.setUnreadCount(c99003ua.getUnreadCount());
        return c98593tv;
    }

    public static final void LJJIJLIJ(C107724Kq c107724Kq) {
        String str;
        if (c107724Kq == null || (str = c107724Kq.LIZJ) == null || str.length() == 0) {
            return;
        }
        C107434Jn.LIZ(IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusAnalytics(), c107724Kq, false, 6);
    }

    public static final void LJIIJJI(VideoPublishEditModel videoPublishEditModel, String str) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        if (!videoPublishEditModel.creativeInfo.isValid()) {
            C41775GaR LJJIIJ = C60903NvH.LJIIJJI().getPublishService().LJJIIJ();
            StringBuilder LIZIZ = C25620zW.LIZIZ("creationId can't be null or empty, scene: ", str, ", model: ");
            LIZIZ.append(C42000Ge4.LIZLLL(videoPublishEditModel));
            LJJIIJ.LIZLLL(X1D.LIZIZ(LIZIZ));
            videoPublishEditModel.creativeInfo = new CreativeInfo(null, 0, null, 7, null);
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("shoot_way", videoPublishEditModel.mShootWay);
            c145995oB.LJI("content_source", H7R.LJJIFFI(videoPublishEditModel));
            c145995oB.LJI("content_type", H7R.LJIIIZ(videoPublishEditModel));
            c145995oB.LJI(WM7.SCENE_SERVICE, str);
            FMX.LJIIL("check_creation_id", c145995oB.LIZ);
        }
    }

    public static String LJIL(String str, String str2) {
        StringBuilder LIZLLL = C06540Nm.LIZLLL(".*(((", str2, "=[^;]*)|(", str2, "=\"[\";]*))|(");
        LIZLLL.append(str2);
        LIZLLL.append("=.*$)).*");
        Matcher matcher = PatternProtector.compile(X1D.LIZIZ(LIZLLL)).matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    public static final boolean LJJI(Effect effect, String str) {
        List<String> tags;
        if (str == null || (tags = effect.getTags()) == null) {
            return false;
        }
        for (String str2 : tags) {
            if (o.LJ(str2, str)) {
                if (str2 == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static final boolean LJJII(Aweme aweme, JTL scene) {
        String str;
        o.LJIIIZ(scene, "scene");
        if (LJJIFFI(aweme)) {
            java.util.Map<String, String> searchExtraParams = aweme.getSearchExtraParams();
            if (searchExtraParams != null) {
                str = searchExtraParams.get("dual_stream_inner_item_enter_scene");
            } else {
                str = null;
            }
            if (o.LJ(str, scene.name())) {
                return true;
            }
        }
        return false;
    }

    public static final void LJJIJIIJIL(int i, Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && aweme.isAd() && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            awemeRawAd.appendExtraParamInCommercializeSearch("inner_ad_position", String.valueOf(i));
        }
    }

    public static final void LJJJI(C3L4 c3l4, C107724Kq c107724Kq) {
        C3L3 c3l3;
        IMUser LJIJI;
        if (c107724Kq == null || !(c3l4 instanceof C3L3) || (c3l3 = (C3L3) c3l4) == null || (LJIJI = c3l3.LJIJI()) == null) {
            return;
        }
        boolean z = false;
        InterfaceC107424Jm activityStatusAnalytics = IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusAnalytics();
        if (AV1.LJIJI(LJIJI.getUid()) || LJIJI.isOnline()) {
            z = true;
        }
        c107724Kq.LJI = Boolean.valueOf(z);
        activityStatusAnalytics.LJFF(c107724Kq);
    }

    public static final void LJJJJ(View view, Fragment fragment) {
        o.LJIIIZ(fragment, "<this>");
        if (view != null && (fragment.mo49getActivity() instanceof C29S)) {
            ViewTreeLifecycleOwner.set(view, fragment.getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(view, fragment);
            C10A.LIZIZ(view, fragment);
            ActivityC45651qj mo49getActivity = fragment.mo49getActivity();
            o.LJII(mo49getActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            ViewTreeLifecycleOwner.set(mo49getActivity.getWindow().getDecorView(), mo49getActivity);
            ViewTreeViewModelStoreOwner.set(mo49getActivity.getWindow().getDecorView(), mo49getActivity);
            C10A.LIZIZ(view, mo49getActivity);
        }
    }

    @Override // X.InterfaceC83166WkU
    public boolean LIZ(BeautyFilterConfig config, BeautyCategoryExtra extra) {
        o.LJIIIZ(config, "config");
        o.LJIIIZ(extra, "extra");
        if (C1DH.LJJJIL(extra.getAbGroup()) == config.getAbGroup() || config.getAbGroup() == -1) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC83166WkU
    public boolean LIZIZ(BeautyFilterConfig config, BeautyCategoryExtra extra) {
        o.LJIIIZ(config, "config");
        o.LJIIIZ(extra, "extra");
        if (C82516Wa0.LJIIJJI.LIZ) {
            return extra.getRegionT();
        }
        return extra.getRegionM();
    }

    @Override // X.InterfaceC58392Mvs
    public TTVideoEngine LJ(Context context, int i) {
        return new TTVideoEngine(context, i);
    }

    @Override // X.InterfaceC83166WkU
    public boolean LJI(BeautyFilterConfig config, List beautyList) {
        Object obj;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        o.LJIIIZ(config, "config");
        o.LJIIIZ(beautyList, "beautyList");
        Iterator it = beautyList.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            obj = it.next();
        } while (!o.LJ(((BeautyCategory) obj).getBeautyCategoryExtra().getPanelType(), ILU.ALL.getFlag()));
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        Iterator it2 = beautyList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (o.LJ(((BeautyCategory) next).getBeautyCategoryExtra().getPanelType(), ILU.MALE.getFlag())) {
                if (next != null) {
                    z2 = true;
                }
            }
        }
        z2 = false;
        Iterator it3 = beautyList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next2 = it3.next();
            if (o.LJ(((BeautyCategory) next2).getBeautyCategoryExtra().getPanelType(), ILU.FEMALE.getFlag())) {
                if (next2 != null) {
                    z3 = true;
                }
            }
        }
        z3 = false;
        Iterator it4 = beautyList.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            Object next3 = it4.next();
            if (LIZ(config, ((BeautyCategory) next3).getBeautyCategoryExtra())) {
                if (next3 != null) {
                    z4 = true;
                }
            }
        }
        z4 = false;
        Iterator it5 = beautyList.iterator();
        while (true) {
            if (!it5.hasNext()) {
                break;
            }
            Object next4 = it5.next();
            if (LIZIZ(config, ((BeautyCategory) next4).getBeautyCategoryExtra())) {
                if (next4 != null) {
                    z5 = true;
                }
            }
        }
        z5 = false;
        if (z || (z2 && z3)) {
            z6 = true;
        } else {
            z6 = false;
        }
        StringBuilder sb = new StringBuilder("LJT isPanelValid: validG:");
        sb.append(z6);
        sb.append(" all:");
        sb.append(z);
        sb.append(" m:");
        C76965UIn.LIZJ(sb, z2, " f:", z3, " group:");
        sb.append(z4);
        sb.append(" region:");
        sb.append(z5);
        C83175Wkd.LIZIZ(sb.toString());
        if (!(!beautyList.isEmpty()) || !z6 || !z4 || !z5) {
            return false;
        }
        return true;
    }

    public static final InterfaceC35811ar LJIIL(C0X9 c0x9, InterfaceC24520xk interfaceC24520xk, int i) {
        o.LJIIIZ(c0x9, "<this>");
        interfaceC24520xk.LJJIIJ(-1805515472);
        interfaceC24520xk.LJJIIJ(-492369756);
        Object LJIILL = interfaceC24520xk.LJIILL();
        InterfaceC24520xk.LIZ.getClass();
        Object obj = C24500xi.LIZIZ;
        if (LJIILL == obj) {
            LJIILL = C78966Uyw.LJJJIL(Boolean.FALSE);
            interfaceC24520xk.LJJIII(LJIILL);
        }
        interfaceC24520xk.LJJIJIIJIL();
        InterfaceC35811ar interfaceC35811ar = (InterfaceC35811ar) LJIILL;
        interfaceC24520xk.LJJIIJ(511388516);
        boolean LJIJJ = interfaceC24520xk.LJIJJ(c0x9) | interfaceC24520xk.LJIJJ(interfaceC35811ar);
        Object LJIILL2 = interfaceC24520xk.LJIILL();
        if (LJIJJ || LJIILL2 == obj) {
            LJIILL2 = new C2DW(c0x9, interfaceC35811ar, null);
            interfaceC24520xk.LJJIII(LJIILL2);
        }
        interfaceC24520xk.LJJIJIIJIL();
        C24610xt.LJ(c0x9, (InterfaceC88471Ynr) LJIILL2, interfaceC24520xk);
        interfaceC24520xk.LJJIJIIJIL();
        return interfaceC35811ar;
    }

    public static final C34C LJJIIJZLJL(Keva keva, String str, Object obj) {
        o.LJIIIZ(obj, "default");
        return new C34C(keva, str, obj);
    }

    public static final C28826BTa LJJIJIIJI(BTZ btz, android.net.Uri uri, java.util.Map map) {
        java.util.Map linkedHashMap;
        o.LJIIIZ(uri, "uri");
        if (map != null) {
            linkedHashMap = C113554cx.LJJLIL(map);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        java.util.Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
        if (queryParameterNames != null) {
            for (String key : queryParameterNames) {
                String queryParameter = UriProtector.getQueryParameter(uri, key);
                if (queryParameter != null) {
                    o.LJIIIIZZ(key, "key");
                    linkedHashMap.put(key, queryParameter);
                }
            }
        }
        Class cls = (Class) btz.LIZ.getValue();
        if (cls == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("schemaModelClass is null,handler class is ");
            LIZ.append(C16880lQ.LJLLJ(btz.getClass()));
            String msg = X1D.LIZIZ(LIZ);
            o.LJIIIZ(msg, "msg");
            try {
                if (SchemaHandleReportSetting.INSTANCE.getValue()) {
                    String uri2 = uri.buildUpon().clearQuery().build().toString();
                    o.LJIIIIZZ(uri2, "uri.buildUpon().clearQuery().build().toString()");
                    String uri3 = uri.toString();
                    o.LJIIIIZZ(uri3, "uri.toString()");
                    String stackTraceString = android.util.Log.getStackTraceString(new Throwable());
                    o.LJIIIIZZ(stackTraceString, "getStackTraceString(Throwable())");
                    C0K2.LJII(1, "livesdk_schema_handle", C113554cx.LJJL(new OSZ("base_uri", uri2), new OSZ("full_uri", uri3), new OSZ("stack_trace", stackTraceString), new OSZ("scheme", uri.getScheme()), new OSZ("host", uri.getHost()), new OSZ("error_message", msg)));
                    C3C5.m7constructorimpl(C76800UCe.LIZ);
                }
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C28826BTa model = (C28826BTa) GsonProtectorUtils.fromJson(C09650Zl.LIZIZ, new JSONObject(linkedHashMap).toString(), cls);
        if (model != null) {
            model.LIZ = uri;
        }
        o.LJIIIIZZ(model, "model");
        return model;
    }

    public static final void LJJJIL(InterfaceC99183us interfaceC99183us, IMUser iMUser, EnumC112364b2 entrance) {
        o.LJIIIZ(interfaceC99183us, "<this>");
        o.LJIIIZ(entrance, "entrance");
        if (iMUser == null) {
            return;
        }
        boolean z = false;
        InterfaceC107424Jm activityStatusAnalytics = IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusAnalytics();
        C107724Kq c107724Kq = new C107724Kq(interfaceC99183us);
        if (AV1.LJIJI(iMUser.getUid()) || iMUser.isOnline()) {
            z = true;
        }
        c107724Kq.LJI = Boolean.valueOf(z);
        c107724Kq.LIZIZ = entrance;
        c107724Kq.LIZJ = iMUser.getUid();
        activityStatusAnalytics.LJFF(c107724Kq);
    }

    public static final void LJJJ(RecyclerView.ViewHolder viewHolder, IMContact iMContact, C107724Kq c107724Kq, int i) {
        IMUser iMUser;
        o.LJIIIZ(viewHolder, "<this>");
        if (c107724Kq == null || !(iMContact instanceof IMUser) || (iMUser = (IMUser) iMContact) == null) {
            return;
        }
        boolean z = false;
        InterfaceC107424Jm activityStatusAnalytics = IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusAnalytics();
        if (AV1.LJIJI(iMUser.getUid()) || iMUser.isOnline()) {
            z = true;
        }
        c107724Kq.LJI = Boolean.valueOf(z);
        c107724Kq.LIZJ = iMUser.getUid();
        c107724Kq.LJFF = Integer.valueOf(viewHolder.getLayoutPosition() - i);
        activityStatusAnalytics.LJFF(c107724Kq);
    }

    public static final void LJIIIZ(byte[] src, int i, int i2, byte[] dst, int i3) {
        o.LJIIJ(src, "src");
        o.LJIIJ(dst, "dst");
        System.arraycopy(src, i, dst, i2, (i3 + i) - i);
    }

    public static final ND9 LJIJJLI(AbstractC58982NCw abstractC58982NCw, ViewGroup viewGroup, View view, String str, boolean z) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        o.LJIIIZ(abstractC58982NCw, "<this>");
        if (view == null || viewGroup == null || str == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
            return null;
        }
        AbstractC78953Uyj LIZ = C78951Uyh.LIZ(str);
        if (!(LIZ instanceof AbstractC78952Uyi) || LIZ == null) {
            return null;
        }
        ND9 nd9 = new ND9(marginLayoutParams.getMarginStart(), marginLayoutParams.getMarginEnd(), marginLayoutParams.bottomMargin, marginLayoutParams.topMargin);
        int i = -view.getLayoutParams().height;
        int height = viewGroup.getHeight();
        int i2 = -view.getLayoutParams().width;
        int width = viewGroup.getWidth();
        abstractC58982NCw.LJII();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("getPanningHidePosition\ntype:");
        LIZ2.append(str);
        LIZ2.append("\nisShowInit:");
        LIZ2.append(z);
        C1EU.LIZJ(LIZ2, "\ntop:", i, "\nbottom:", height);
        C1EU.LIZJ(LIZ2, "\nleft:", i2, "\nright:", width);
        C242549fW.LIZ(X1D.LIZIZ(LIZ2));
        if (z) {
            if (o.LJ(LIZ, C78957Uyn.LIZIZ)) {
                nd9.LIZLLL = height;
            } else if (o.LJ(LIZ, C78958Uyo.LIZIZ)) {
                nd9.LIZ = i2;
            } else if (o.LJ(LIZ, C78959Uyp.LIZIZ)) {
                nd9.LIZ = width;
            } else if (o.LJ(LIZ, C78960Uyq.LIZIZ)) {
                nd9.LIZLLL = i;
            }
        } else if (o.LJ(LIZ, C78957Uyn.LIZIZ)) {
            nd9.LIZLLL = i;
        } else if (o.LJ(LIZ, C78958Uyo.LIZIZ)) {
            nd9.LIZ = width;
        } else if (o.LJ(LIZ, C78959Uyp.LIZIZ)) {
            nd9.LIZ = i2;
        } else if (o.LJ(LIZ, C78960Uyq.LIZIZ)) {
            nd9.LIZLLL = height;
        }
        return nd9;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x021e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.animation.AnimatorSet LJJ(X.AbstractC58982NCw r17, android.view.ViewGroup r18, android.view.View r19, java.util.List r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 935
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78949Uyf.LJJ(X.NCw, android.view.ViewGroup, android.view.View, java.util.List, boolean):android.animation.AnimatorSet");
    }

    public static final void LJJIJL(IMUser iMUser, LifecycleOwner lifecycleOwner, EnumC112364b2 entrance, String enterFrom, boolean z, String pageToEnter) {
        boolean z2;
        o.LJIIIZ(entrance, "entrance");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(pageToEnter, "pageToEnter");
        if (lifecycleOwner == null) {
            return;
        }
        InterfaceC107424Jm activityStatusAnalytics = IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusAnalytics();
        C107724Kq c107724Kq = new C107724Kq(lifecycleOwner);
        if (AV1.LJIJI(iMUser.getUid()) || z) {
            z2 = true;
        } else {
            z2 = false;
        }
        c107724Kq.LJI = Boolean.valueOf(z2);
        c107724Kq.LJ = pageToEnter;
        c107724Kq.LIZIZ = entrance;
        c107724Kq.LIZLLL = enterFrom;
        c107724Kq.LIZJ = iMUser.getUid();
        C107434Jn.LIZ(activityStatusAnalytics, c107724Kq, false, 6);
    }

    public static final void LJJIL(InterfaceC99183us interfaceC99183us, IMUser iMUser, EnumC112364b2 entrance, String enterFrom, boolean z, String pageToEnter, boolean z2) {
        o.LJIIIZ(interfaceC99183us, "<this>");
        o.LJIIIZ(entrance, "entrance");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(pageToEnter, "pageToEnter");
        boolean z3 = false;
        InterfaceC107424Jm activityStatusAnalytics = IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusAnalytics();
        C107724Kq c107724Kq = new C107724Kq(interfaceC99183us);
        if (AV1.LJIJI(iMUser.getUid()) || z) {
            z3 = true;
        }
        c107724Kq.LJI = Boolean.valueOf(z3);
        c107724Kq.LJ = pageToEnter;
        c107724Kq.LIZIZ = entrance;
        c107724Kq.LIZLLL = enterFrom;
        c107724Kq.LIZJ = iMUser.getUid();
        C107434Jn.LIZ(activityStatusAnalytics, c107724Kq, z2, 4);
    }

    public static /* synthetic */ void LJJIZ(InterfaceC99183us interfaceC99183us, IMUser iMUser, EnumC112364b2 enumC112364b2, String str, boolean z, String str2, boolean z2, int i) {
        if ((i & 16) != 0) {
            str2 = "profile";
        }
        if ((i & 32) != 0) {
            z2 = false;
        }
        LJJIL(interfaceC99183us, iMUser, enumC112364b2, str, z, str2, z2);
    }

    public static InterfaceC194547kI LJIILIIL(Aweme aweme, Boolean bool, Boolean bool2, int i, InterfaceC55235Lm3 interfaceC55235Lm3, boolean z, boolean z2, boolean z3, String str, int i2) {
        String recommendPosition = str;
        boolean z4 = z3;
        Boolean bool3 = bool2;
        Boolean bool4 = bool;
        int i3 = i;
        InterfaceC55235Lm3 interfaceC55235Lm32 = interfaceC55235Lm3;
        boolean z5 = z;
        boolean z6 = z2;
        if ((i2 & 2) != 0) {
            bool4 = null;
        }
        if ((i2 & 4) != 0) {
            bool3 = null;
        }
        if ((i2 & 8) != 0) {
            i3 = 0;
        }
        if ((i2 & 16) != 0) {
            interfaceC55235Lm32 = null;
        }
        if ((i2 & 32) != 0) {
            z5 = false;
        }
        if ((i2 & 64) != 0) {
            z6 = false;
        }
        if ((i2 & 128) != 0) {
            z4 = false;
        }
        if ((i2 & 256) != 0) {
            recommendPosition = "bottom";
        }
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(recommendPosition, "recommendPosition");
        if (C195937mX.LJFF(aweme)) {
            return new C195657m5(aweme, bool4, bool3, i3, interfaceC55235Lm32, z5, z6, z4, recommendPosition, null, null);
        }
        return new C195647m4(aweme, bool4, bool3, i3, interfaceC55235Lm32, z5, z6, z4, recommendPosition, null, null);
    }
}
