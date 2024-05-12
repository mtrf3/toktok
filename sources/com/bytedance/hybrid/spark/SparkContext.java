package com.bytedance.hybrid.spark;

import X.AbstractC60800Ntc;
import X.AbstractC60811Ntn;
import X.AbstractC60815Ntr;
import X.C109464Ri;
import X.C162476Zf;
import X.C17N;
import X.C31999Ch9;
import X.C38518F9u;
import X.C39359FcZ;
import X.C40351FsZ;
import X.C60728NsS;
import X.C60737Nsb;
import X.C60806Nti;
import X.C60808Ntk;
import X.C60809Ntl;
import X.C60869Nuj;
import X.C60902NvG;
import X.C60903NvH;
import X.C60906NvK;
import X.C60917NvV;
import X.C60928Nvg;
import X.C60936Nvo;
import X.C75252xN;
import X.EnumC39924Flg;
import X.EnumC60795NtX;
import X.F1U;
import X.FCG;
import X.FCH;
import X.FD5;
import X.InterfaceC40159FpT;
import X.InterfaceC60761Nsz;
import X.InterfaceC60799Ntb;
import X.InterfaceC60814Ntq;
import X.InterfaceC60831Nu7;
import X.InterfaceC60837NuD;
import X.InterfaceC60844NuK;
import X.InterfaceC60850NuQ;
import X.InterfaceC60949Nw1;
import X.InterfaceC88472Yns;
import Y.IDCreatorS46S0000000_1;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.hybrid.spark.schema.SchemaBundle;
import com.bytedance.lynx.spark.schema.model.SparkPageSchemaParam;
import com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes11.dex */
public class SparkContext extends C60737Nsb implements Parcelable {
    public Bundle bundle;
    public int containerType;
    public String fullUrl;
    public boolean hasBootSSP;
    public boolean hasParseSchema;
    public final InterfaceC88472Yns<Context, InterfaceC60831Nu7> performanceViewInvoke;
    public SchemaBundle schemaBundle;
    public SparkSchemaParam schemaParams;
    public String sessionTag;
    public static final C39359FcZ Companion = new C39359FcZ();
    public static final Map<String, C60737Nsb> hybridContextMap = new LinkedHashMap();
    public static final Parcelable.Creator<SparkContext> CREATOR = new IDCreatorS46S0000000_1(0);
    public int requestCode = -1;
    public Map<String, String> defaultParams = new LinkedHashMap();
    public C38518F9u extraRuntimeInfo = new C38518F9u();

    public final String LJIJ() {
        int i = C60808Ntk.LIZIZ[LJ(null).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return "const";
                }
                throw new C162476Zf();
            }
            return "dark";
        }
        return "light";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void LJIILJJIL() {
        String url;
        SchemaBundle schemaBundle = this.schemaBundle;
        if (schemaBundle != null && (url = schemaBundle.getUrl()) != null) {
            this.url = url;
            this.hasParseSchema = false;
        }
    }

    public final InterfaceC40159FpT LJIILL() {
        InterfaceC40159FpT interfaceC40159FpT;
        String str;
        String str2 = this.containerId;
        Map<String, String> map = F1U.LIZ;
        if (map.containsKey(str2) && (str = (String) ((LinkedHashMap) map).get(str2)) != null) {
            str2 = str;
        }
        Companion.getClass();
        C60737Nsb LIZIZ = C39359FcZ.LIZIZ(str2);
        if (LIZIZ != null && (interfaceC40159FpT = (InterfaceC40159FpT) LIZIZ.LIZIZ(InterfaceC40159FpT.class)) != null) {
            return interfaceC40159FpT;
        }
        return (InterfaceC40159FpT) LIZIZ(InterfaceC40159FpT.class);
    }

    public final String LJIILLIIL() {
        String containerId = this.containerId;
        o.LJIIJ(containerId, "containerId");
        Map<String, String> LIZJ = C75252xN.LIZJ(containerId);
        Uri uri = UriProtector.parse(this.url);
        o.LJFF(uri, "uri");
        if (!uri.isHierarchical()) {
            String str = this.url;
            this.fullUrl = str;
            return str;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
        for (Map.Entry<String, String> entry : LIZJ.entrySet()) {
            if (queryParameterNames == null || !queryParameterNames.contains(entry.getKey())) {
                buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
            }
        }
        String uri2 = buildUpon.build().toString();
        o.LJFF(uri2, "buildUpon.build().toString()");
        this.fullUrl = uri2;
        return uri2;
    }

    public SparkContext() {
        C60737Nsb.Companion.getClass();
        this.containerType = C60737Nsb.CONTAINER_TYPE_SPARK;
        this.fullUrl = "";
        this.performanceViewInvoke = new AqS170S0100000_4(this, UserLevelGeckoUpdateSetting.DEFAULT);
    }

    @Override // X.C60737Nsb
    public final InterfaceC88472Yns<Context, InterfaceC60831Nu7> LIZLLL() {
        return this.performanceViewInvoke;
    }

    @Override // X.C60737Nsb
    public final EnumC60795NtX LJ(Context context) {
        InterfaceC60837NuD LJ;
        EnumC60795NtX LIZ;
        EnumC60795NtX LIZ2;
        EnumC60795NtX LIZ3;
        Context context2;
        EnumC60795NtX LIZ4;
        Context context3;
        EnumC60795NtX LIZ5;
        View LIZJ;
        Context context4;
        EnumC60795NtX LIZ6;
        String forceThemeStyle;
        EnumC60795NtX enumC60795NtX;
        SparkSchemaParam sparkSchemaParam = this.schemaParams;
        if (sparkSchemaParam != null && (forceThemeStyle = sparkSchemaParam.getForceThemeStyle()) != null) {
            if (ujb.o.LJJJJIZL(forceThemeStyle, "dark", true)) {
                enumC60795NtX = EnumC60795NtX.DARK;
            } else if (ujb.o.LJJJJIZL(forceThemeStyle, "light", true)) {
                enumC60795NtX = EnumC60795NtX.LIGHT;
            }
            if (enumC60795NtX != null) {
                return enumC60795NtX;
            }
        }
        C60809Ntl.LIZIZ.getClass();
        InterfaceC60799Ntb interfaceC60799Ntb = C60809Ntl.LIZ;
        if (interfaceC60799Ntb != null && (LJ = interfaceC60799Ntb.LJ()) != null && C60806Nti.LIZ) {
            C31999Ch9 c31999Ch9 = C31999Ch9.LIZJ;
            String str = this.containerId;
            c31999Ch9.getClass();
            InterfaceC60761Nsz LIZIZ = C31999Ch9.LIZIZ(str);
            if (LIZIZ != null && (LIZJ = LIZIZ.LIZJ()) != null && (context4 = LIZJ.getContext()) != null && (LIZ6 = LJ.LIZ(context4)) != null) {
                return LIZ6;
            }
            Object LJIILL = LJIILL();
            if (!(LJIILL instanceof SparkFragment)) {
                LJIILL = null;
            }
            Fragment fragment = (Fragment) LJIILL;
            if (fragment != null && (context3 = fragment.getContext()) != null && (LIZ5 = LJ.LIZ(context3)) != null) {
                return LIZ5;
            }
            Object LJIILL2 = LJIILL();
            if (!(LJIILL2 instanceof SparkPopup)) {
                LJIILL2 = null;
            }
            Fragment fragment2 = (Fragment) LJIILL2;
            if (fragment2 != null && (context2 = fragment2.getContext()) != null && (LIZ4 = LJ.LIZ(context2)) != null) {
                return LIZ4;
            }
            Object LJIILL3 = LJIILL();
            if (!(LJIILL3 instanceof SparkActivity)) {
                LJIILL3 = null;
            }
            Context context5 = (Context) LJIILL3;
            if (context5 != null && (LIZ3 = LJ.LIZ(context5)) != null) {
                return LIZ3;
            }
            if ((context instanceof ContextThemeWrapper) && context != null && (LIZ = LJ.LIZ(context)) != null) {
                return LIZ;
            }
            FCH.LIZIZ.getClass();
            Activity LIZIZ2 = FCG.LIZIZ();
            if (LIZIZ2 != null && (LIZ2 = LJ.LIZ(LIZIZ2)) != null) {
                return LIZ2;
            }
        }
        return EnumC60795NtX.LIGHT;
    }

    public final SparkSchemaParam LJIIZILJ(int i) {
        Long l;
        boolean z;
        EnumC39924Flg enumC39924Flg;
        SparkSchemaParam sparkSchemaParam;
        boolean z2;
        EnumC39924Flg enumC39924Flg2;
        String str;
        int i2 = i;
        if (!this.hasParseSchema) {
            long currentTimeMillis = System.currentTimeMillis();
            C60728NsS c60728NsS = (C60728NsS) LIZIZ(C60728NsS.class);
            EnumC39924Flg enumC39924Flg3 = null;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            if (c60728NsS != null) {
                l = c60728NsS.LIZLLL;
            } else {
                l = null;
            }
            int i3 = 1;
            if (l != null) {
                z = true;
            } else {
                z = false;
                FD5.LIZJ(currentTimeMillis, this.containerId, "prepare_init_data_start");
            }
            C60728NsS c60728NsS2 = (C60728NsS) LIZIZ(C60728NsS.class);
            if (c60728NsS2 != null) {
                c60728NsS2.LIZLLL = Long.valueOf(currentTimeMillis);
            }
            if (i2 <= 0) {
                i2 = C40351FsZ.LIZ(this.url);
            }
            if (this.url.length() > 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                sparkSchemaParam = C60902NvG.LIZIZ(this.url, this.defaultParams, this.bundle, this.containerId);
                            } else {
                                sparkSchemaParam = C60902NvG.LIZJ(this.url, this.defaultParams, this.bundle, this.containerId);
                            }
                        } else {
                            sparkSchemaParam = C60902NvG.LIZ(this.url, this.defaultParams, this.bundle, this.containerId);
                        }
                    } else {
                        String url = this.url;
                        Map<String, String> map = this.defaultParams;
                        Bundle bundle = this.bundle;
                        String containerId = this.containerId;
                        o.LJIIJ(url, "url");
                        o.LJIIJ(containerId, "containerId");
                        Uri LJJJJIZL = C17N.LJJJJIZL(url);
                        Map<String, String> LIZ = C75252xN.LIZ(LJJJJIZL, map, bundle);
                        SparkPopupSchemaParam sparkPopupSchemaParam = new SparkPopupSchemaParam(enumC39924Flg3, i3, z5 ? 1 : 0);
                        C75252xN.LIZLLL(containerId, LIZ);
                        C60917NvV.LIZ(LJJJJIZL, sparkPopupSchemaParam, LIZ);
                        LinkedHashMap linkedHashMap = (LinkedHashMap) LIZ;
                        String str2 = (String) linkedHashMap.get("width_percent");
                        if (str2 != null) {
                            sparkPopupSchemaParam.setWidth((int) ((CastFloatProtector.parseFloat(str2) / 100) * C60936Nvo.LIZLLL(null)));
                        }
                        String str3 = (String) linkedHashMap.get("height_percent");
                        if (str3 != null) {
                            sparkPopupSchemaParam.setHeight((int) ((CastFloatProtector.parseFloat(str3) / 100) * C60936Nvo.LIZJ(null)));
                        }
                        String str4 = (String) linkedHashMap.get("mask_color");
                        if (str4 != null) {
                            sparkPopupSchemaParam.setMaskBgColor(C60906NvK.LIZLLL("mask_color", str4, LIZ, LJJJJIZL));
                        }
                        if (linkedHashMap.get("close_by_mask") != null) {
                            sparkPopupSchemaParam.setDisableOutsideClickClose(!o.LJ(r0, "1"));
                        }
                        Object obj = linkedHashMap.get("close_by_gesture");
                        Object obj2 = linkedHashMap.get("enable_pull_down_close");
                        if (o.LJ(obj, "1") || o.LJ(obj2, "1")) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        sparkPopupSchemaParam.setEnablePullDownClose(z2);
                        String str5 = (String) linkedHashMap.get("popup_enter_type");
                        if (str5 != null) {
                            sparkPopupSchemaParam.setTransitionAnimation(str5);
                        }
                        if (linkedHashMap.get("drag_height") == null && (str = (String) linkedHashMap.get("drag_height_percent")) != null) {
                            sparkPopupSchemaParam.setDragHeight((int) ((CastFloatProtector.parseFloat(str) / 100) * C60936Nvo.LIZJ(null)));
                        }
                        if (sparkPopupSchemaParam.getEnablePullDownClose()) {
                            String str6 = (String) linkedHashMap.get("drag_down_threshold");
                            if (str6 != null && str6.length() > 0) {
                                sparkPopupSchemaParam.setDragDownThreshold(CastIntegerProtector.parseInt(str6));
                            }
                            String str7 = (String) linkedHashMap.get("drag_down_close_threshold");
                            if (str7 != null && str7.length() > 0) {
                                sparkPopupSchemaParam.setDragDownCloseThreshold(CastIntegerProtector.parseInt(str7));
                            }
                            String str8 = (String) linkedHashMap.get("peek_down_close_threshold");
                            if (str8 != null && str8.length() > 0) {
                                sparkPopupSchemaParam.setPeekDownCloseThreshold(CastIntegerProtector.parseInt(str8));
                            }
                        }
                        Object obj3 = linkedHashMap.get("show_loading");
                        if (obj3 != null) {
                            sparkPopupSchemaParam.setHideLoading(o.LJ(obj3, CardStruct.IStatusCode.DEFAULT));
                        }
                        Object obj4 = linkedHashMap.get("disable_mask_click_close");
                        if (obj4 != null) {
                            sparkPopupSchemaParam.setDisableOutsideClickClose(o.LJ(obj4, "1"));
                        }
                        Object obj5 = linkedHashMap.get("should_full_screen");
                        if (obj5 != null) {
                            sparkPopupSchemaParam.setTransStatusBar(o.LJ(obj5, "1"));
                        }
                        C60903NvH.LJJIIJ(sparkPopupSchemaParam, LIZ, LJJJJIZL);
                        String host = LJJJJIZL.getHost();
                        if (host != null) {
                            if (s.LJJJLZIJ(host, "webview", false)) {
                                enumC39924Flg2 = EnumC39924Flg.WEB;
                            } else if (s.LJJJLZIJ(host, "lynxview", false)) {
                                enumC39924Flg2 = EnumC39924Flg.LYNX;
                            }
                            sparkPopupSchemaParam.setEngineType(enumC39924Flg2);
                            sparkPopupSchemaParam.adjustValues();
                            sparkSchemaParam = sparkPopupSchemaParam;
                        }
                        enumC39924Flg2 = EnumC39924Flg.UNKNOWN;
                        sparkPopupSchemaParam.setEngineType(enumC39924Flg2);
                        sparkPopupSchemaParam.adjustValues();
                        sparkSchemaParam = sparkPopupSchemaParam;
                    }
                } else {
                    String url2 = this.url;
                    Map<String, String> map2 = this.defaultParams;
                    Bundle bundle2 = this.bundle;
                    String containerId2 = this.containerId;
                    o.LJIIJ(url2, "url");
                    o.LJIIJ(containerId2, "containerId");
                    Uri LJJJJIZL2 = C17N.LJJJJIZL(url2);
                    Map<String, String> LIZ2 = C75252xN.LIZ(LJJJJIZL2, map2, bundle2);
                    SparkPageSchemaParam sparkPageSchemaParam = new SparkPageSchemaParam(z4 ? 1 : 0, 1, z3 ? 1 : 0);
                    C75252xN.LIZLLL(containerId2, LIZ2);
                    C60917NvV.LIZ(LJJJJIZL2, sparkPageSchemaParam, LIZ2);
                    LinkedHashMap linkedHashMap2 = (LinkedHashMap) LIZ2;
                    String str9 = (String) linkedHashMap2.get("show_close_all");
                    if (str9 != null) {
                        sparkPageSchemaParam.setShowCloseAll(str9);
                    }
                    Object obj6 = linkedHashMap2.get("should_full_screen");
                    if (obj6 != null) {
                        sparkPageSchemaParam.setTransStatusBar(o.LJ(obj6, "1"));
                    }
                    String str10 = (String) linkedHashMap2.get("status_bar_color");
                    if (str10 != null) {
                        sparkPageSchemaParam.setStatusBarBgColor(C60906NvK.LIZLLL("status_bar_color", str10, LIZ2, LJJJJIZL2));
                    }
                    Object obj7 = linkedHashMap2.get("show_loading");
                    if (obj7 != null) {
                        sparkPageSchemaParam.setHideLoading(o.LJ(obj7, CardStruct.IStatusCode.DEFAULT));
                    }
                    String str11 = (String) linkedHashMap2.get("__use_ttnet");
                    if (str11 != null) {
                        sparkPageSchemaParam.set_useTtnet(C60906NvK.LIZIZ("__use_ttnet", str11, LIZ2, LJJJJIZL2, false));
                    }
                    String str12 = (String) linkedHashMap2.get("accessKey");
                    if (str12 != null) {
                        sparkPageSchemaParam.setAccessKey(str12);
                    }
                    String str13 = (String) linkedHashMap2.get("access_key");
                    if (str13 != null) {
                        sparkPageSchemaParam.setAccessKeyBp(str13);
                    }
                    Object obj8 = linkedHashMap2.get("append_common_params");
                    if (obj8 != null) {
                        sparkPageSchemaParam.setAppendCommonParams(o.LJ(obj8, "1"));
                    }
                    String str14 = (String) linkedHashMap2.get("auto_play_bgm");
                    if (str14 != null) {
                        sparkPageSchemaParam.setAutoPlayBgm(C60906NvK.LIZIZ("auto_play_bgm", str14, LIZ2, LJJJJIZL2, false));
                    }
                    String str15 = (String) linkedHashMap2.get("bid");
                    if (str15 != null) {
                        sparkPageSchemaParam.setBid(str15);
                    }
                    Object obj9 = linkedHashMap2.get("block_back_press");
                    if (obj9 != null) {
                        sparkPageSchemaParam.setBlockBackPress(o.LJ(obj9, "1"));
                    }
                    String str16 = (String) linkedHashMap2.get("bundle");
                    if (str16 != null) {
                        sparkPageSchemaParam.setBundle(str16);
                    }
                    Object obj10 = linkedHashMap2.get("redirect_cdn_by_region");
                    if (obj10 != null) {
                        sparkPageSchemaParam.setCdnRegionRedirect(o.LJ(obj10, "1"));
                    }
                    String str17 = (String) linkedHashMap2.get("channel");
                    if (str17 != null) {
                        sparkPageSchemaParam.setChannel(str17);
                    }
                    String str18 = (String) linkedHashMap2.get("click_time");
                    if (str18 != null) {
                        sparkPageSchemaParam.setClickTime(str18);
                    }
                    String str19 = (String) linkedHashMap2.get("container_bg_color");
                    Object obj11 = linkedHashMap2.get("container_bg_color_dark");
                    Object obj12 = linkedHashMap2.get("container_bg_color_light");
                    if (str19 != null || obj11 != null || obj12 != null) {
                        sparkPageSchemaParam.setContainerBgColor(C60906NvK.LIZJ("container_bg_color", str19, LIZ2, LJJJJIZL2));
                    }
                    Object obj13 = linkedHashMap2.get("disable_auto_remove_loading");
                    if (obj13 != null) {
                        sparkPageSchemaParam.setDisableAutoRemoveLoading(o.LJ(obj13, "1"));
                    }
                    Object obj14 = linkedHashMap2.get("disable_back_press");
                    if (obj14 != null) {
                        sparkPageSchemaParam.setDisableBackPress(o.LJ(obj14, "1"));
                    }
                    Object obj15 = linkedHashMap2.get("disable_builtin");
                    if (obj15 != null) {
                        sparkPageSchemaParam.setDisableBuiltin(Boolean.valueOf(o.LJ(obj15, "1")));
                    }
                    Object obj16 = linkedHashMap2.get("disable_cdn");
                    if (obj16 != null) {
                        sparkPageSchemaParam.setDisableCDN(Boolean.valueOf(o.LJ(obj16, "1")));
                    }
                    Object obj17 = linkedHashMap2.get("disable_event_cache");
                    if (obj17 != null) {
                        sparkPageSchemaParam.setDisableEventCache(o.LJ(obj17, "1"));
                    }
                    Object obj18 = linkedHashMap2.get("disable_gecko");
                    if (obj18 != null) {
                        sparkPageSchemaParam.setDisableGecko(Boolean.valueOf(o.LJ(obj18, "1")));
                    }
                    Object obj19 = linkedHashMap2.get("disable_gecko_update");
                    if (obj19 != null) {
                        sparkPageSchemaParam.setDisableGeckoUpdate(Boolean.valueOf(o.LJ(obj19, "1")));
                    }
                    Object obj20 = linkedHashMap2.get("disable_get_resources_callback");
                    if (obj20 != null) {
                        sparkPageSchemaParam.setDisableGetResourcesCallback(o.LJ(obj20, "1"));
                    }
                    Object obj21 = linkedHashMap2.get("disable_hardware_accelerate");
                    if (obj21 != null) {
                        sparkPageSchemaParam.setDisableHardwareAccelerate(o.LJ(obj21, "1"));
                    }
                    Object obj22 = linkedHashMap2.get("disable_offline");
                    if (obj22 != null) {
                        sparkPageSchemaParam.setDisableOffline(Boolean.valueOf(o.LJ(obj22, "1")));
                    }
                    Object obj23 = linkedHashMap2.get("disable_save_image");
                    if (obj23 != null) {
                        sparkPageSchemaParam.setDisableSaveImage(o.LJ(obj23, "1"));
                    }
                    String str20 = (String) linkedHashMap2.get("dynamic");
                    if (str20 != null) {
                        sparkPageSchemaParam.setDynamic(C60906NvK.LIZIZ("dynamic", str20, LIZ2, LJJJJIZL2, false));
                    }
                    Object obj24 = linkedHashMap2.get("enable_canvas");
                    if (obj24 != null) {
                        sparkPageSchemaParam.setEnableCanvas(o.LJ(obj24, "1"));
                    }
                    Object obj25 = linkedHashMap2.get("enable_canvas_optimize");
                    if (obj25 != null) {
                        sparkPageSchemaParam.setEnableCanvasOptimization(Boolean.valueOf(o.LJ(obj25, "1")));
                    }
                    String str21 = (String) linkedHashMap2.get("enable_code_cache");
                    if (str21 != null) {
                        sparkPageSchemaParam.setEnableCodeCache(C60906NvK.LIZIZ("enable_code_cache", str21, LIZ2, LJJJJIZL2, false));
                    }
                    Object obj26 = linkedHashMap2.get("enable_dynamic_v8");
                    if (obj26 != null) {
                        sparkPageSchemaParam.setEnableDynamicV8(o.LJ(obj26, "1"));
                    }
                    String str22 = (String) linkedHashMap2.get("enable_extra_info");
                    if (str22 != null) {
                        sparkPageSchemaParam.setEnableExtraInfo(C60906NvK.LIZIZ("enable_extra_info", str22, LIZ2, LJJJJIZL2, false));
                    }
                    Object obj27 = linkedHashMap2.get("enable_js_runtime");
                    if (obj27 != null) {
                        sparkPageSchemaParam.setEnableJSRuntime(o.LJ(obj27, "1"));
                    }
                    Object obj28 = linkedHashMap2.get("enable_memory_cache");
                    if (obj28 != null) {
                        sparkPageSchemaParam.setEnableMemoryCache(Boolean.valueOf(o.LJ(obj28, "1")));
                    }
                    Object obj29 = linkedHashMap2.get("enable_pending_js_task");
                    if (obj29 != null) {
                        sparkPageSchemaParam.setEnablePendingJsTask(o.LJ(obj29, "1"));
                    }
                    String str23 = (String) linkedHashMap2.get("enable_pre_code_cache");
                    if (str23 != null) {
                        sparkPageSchemaParam.setEnablePreCodeCache(C60906NvK.LIZIZ("enable_pre_code_cache", str23, LIZ2, LJJJJIZL2, false));
                    }
                    String str24 = (String) linkedHashMap2.get("enable_prefetch");
                    if (str24 != null) {
                        sparkPageSchemaParam.setEnablePrefetch(C60906NvK.LIZIZ("enable_prefetch", str24, LIZ2, LJJJJIZL2, false));
                    }
                    Object obj30 = linkedHashMap2.get("enable_scroll_web_view");
                    if (obj30 != null) {
                        sparkPageSchemaParam.setEnableScrollWebView(o.LJ(obj30, "1"));
                    }
                    Object obj31 = linkedHashMap2.get("enable_spark_live_opt");
                    if (obj31 != null) {
                        sparkPageSchemaParam.setEnableSparkLiveOpt(o.LJ(obj31, "1"));
                    }
                    String str25 = (String) linkedHashMap2.get("fallback_url");
                    if (str25 != null) {
                        sparkPageSchemaParam.setFallbackUrl(str25);
                    }
                    Object obj32 = linkedHashMap2.get("forbidden_anim");
                    if (obj32 != null) {
                        sparkPageSchemaParam.setForbiddenAnim(o.LJ(obj32, "1"));
                    }
                    Object obj33 = linkedHashMap2.get("force_h5");
                    if (obj33 != null) {
                        sparkPageSchemaParam.setForceH5(o.LJ(obj33, "1"));
                    }
                    String str26 = (String) linkedHashMap2.get("force_theme_style");
                    if (str26 != null) {
                        sparkPageSchemaParam.setForceThemeStyle(str26);
                    }
                    Object obj34 = linkedHashMap2.get("gecko_url_redirection");
                    if (obj34 != null) {
                        sparkPageSchemaParam.setGeckoUrlRedirection(o.LJ(obj34, "1"));
                    }
                    String str27 = (String) linkedHashMap2.get("group");
                    if (str27 != null) {
                        sparkPageSchemaParam.setGroup(str27);
                    }
                    String str28 = (String) linkedHashMap2.get("hide_error");
                    if (str28 != null) {
                        sparkPageSchemaParam.setHideError(C60906NvK.LIZ("hide_error", str28, LIZ2, LJJJJIZL2));
                    }
                    String str29 = (String) linkedHashMap2.get("hide_loading");
                    if (str29 != null) {
                        sparkPageSchemaParam.setHideLoading(C60906NvK.LIZ("hide_loading", str29, LIZ2, LJJJJIZL2));
                    }
                    String str30 = (String) linkedHashMap2.get("hide_nav_bar");
                    if (str30 != null) {
                        sparkPageSchemaParam.setHideNavBar(C60906NvK.LIZ("hide_nav_bar", str30, LIZ2, LJJJJIZL2));
                    }
                    String str31 = (String) linkedHashMap2.get("hide_status_bar");
                    if (str31 != null) {
                        sparkPageSchemaParam.setHideStatusBar(C60906NvK.LIZ("hide_status_bar", str31, LIZ2, LJJJJIZL2));
                    }
                    String str32 = (String) linkedHashMap2.get("hide_system_video_poster");
                    if (str32 != null) {
                        sparkPageSchemaParam.setHideSystemVideoPoster(C60906NvK.LIZ("hide_system_video_poster", str32, LIZ2, LJJJJIZL2));
                    }
                    String str33 = (String) linkedHashMap2.get("ignore_cache_policy");
                    if (str33 != null) {
                        sparkPageSchemaParam.setIgnoreCachePolicy(C60906NvK.LIZIZ("ignore_cache_policy", str33, LIZ2, LJJJJIZL2, false));
                    }
                    String str34 = (String) linkedHashMap2.get("ignore_cached_theme");
                    if (str34 != null) {
                        sparkPageSchemaParam.setIgnoreCachedTheme(C60906NvK.LIZ("ignore_cached_theme", str34, LIZ2, LJJJJIZL2));
                    }
                    String str35 = (String) linkedHashMap2.get("initial_data");
                    if (str35 != null) {
                        sparkPageSchemaParam.setInitialData(str35);
                    }
                    String str36 = (String) linkedHashMap2.get("keyboard_adjust");
                    if (str36 != null) {
                        sparkPageSchemaParam.setKeyboardAdjust(C60906NvK.LIZIZ("keyboard_adjust", str36, LIZ2, LJJJJIZL2, false));
                    }
                    String str37 = (String) linkedHashMap2.get("keyboard_compat");
                    if (str37 != null) {
                        sparkPageSchemaParam.setKeyboardCompat(C60906NvK.LIZ("keyboard_compat", str37, LIZ2, LJJJJIZL2));
                    }
                    String str38 = (String) linkedHashMap2.get("landscape_screen_size_as_portrait");
                    if (str38 != null) {
                        sparkPageSchemaParam.setLandscapeScreenSizeAsPortrait(C60906NvK.LIZ("landscape_screen_size_as_portrait", str38, LIZ2, LJJJJIZL2));
                    }
                    String str39 = (String) linkedHashMap2.get("loading_bg_color");
                    Object obj35 = linkedHashMap2.get("loading_bg_color_dark");
                    Object obj36 = linkedHashMap2.get("loading_bg_color_light");
                    if (str39 != null || obj35 != null || obj36 != null) {
                        sparkPageSchemaParam.setLoadingBgColor(C60906NvK.LIZJ("loading_bg_color", str39, LIZ2, LJJJJIZL2));
                    }
                    String str40 = (String) linkedHashMap2.get("lock_resource");
                    if (str40 != null) {
                        sparkPageSchemaParam.setLockResource(C60906NvK.LIZ("lock_resource", str40, LIZ2, LJJJJIZL2));
                    }
                    String str41 = (String) linkedHashMap2.get("lynxview_height");
                    if (str41 != null) {
                        sparkPageSchemaParam.setLynxviewHeight(Integer.valueOf(C60906NvK.LIZIZ("lynxview_height", str41, LIZ2, LJJJJIZL2, true)));
                    }
                    String str42 = (String) linkedHashMap2.get("lynxview_width");
                    if (str42 != null) {
                        sparkPageSchemaParam.setLynxviewWidth(Integer.valueOf(C60906NvK.LIZIZ("lynxview_width", str42, LIZ2, LJJJJIZL2, true)));
                    }
                    String str43 = (String) linkedHashMap2.get("nav_bar_color");
                    Object obj37 = linkedHashMap2.get("nav_bar_color_dark");
                    Object obj38 = linkedHashMap2.get("nav_bar_color_light");
                    if (str43 != null || obj37 != null || obj38 != null) {
                        sparkPageSchemaParam.setNavBarColor(C60906NvK.LIZJ("nav_bar_color", str43, LIZ2, LJJJJIZL2));
                    }
                    String str44 = (String) linkedHashMap2.get("nav_btn_type");
                    if (str44 != null) {
                        sparkPageSchemaParam.setNavBtnType(str44);
                    }
                    String str45 = (String) linkedHashMap2.get("navigation_bar_bg_color");
                    Object obj39 = linkedHashMap2.get("navigation_bar_bg_color_dark");
                    Object obj40 = linkedHashMap2.get("navigation_bar_bg_color_light");
                    if (str45 != null || obj39 != null || obj40 != null) {
                        sparkPageSchemaParam.setNavigationBarBgColor(C60906NvK.LIZJ("navigation_bar_bg_color", str45, LIZ2, LJJJJIZL2));
                    }
                    String str46 = (String) linkedHashMap2.get("need_sec_link");
                    if (str46 != null) {
                        sparkPageSchemaParam.setNeedSecLink(C60906NvK.LIZ("need_sec_link", str46, LIZ2, LJJJJIZL2));
                    }
                    String str47 = (String) linkedHashMap2.get("net_worker");
                    if (str47 != null) {
                        sparkPageSchemaParam.setNetWorker(Integer.valueOf(C60906NvK.LIZIZ("net_worker", str47, LIZ2, LJJJJIZL2, false)));
                    }
                    String str48 = (String) linkedHashMap2.get("only_local");
                    if (str48 != null) {
                        sparkPageSchemaParam.setOnlyLocal(Boolean.valueOf(C60906NvK.LIZ("only_local", str48, LIZ2, LJJJJIZL2)));
                    }
                    String str49 = (String) linkedHashMap2.get("opt_title");
                    if (str49 != null) {
                        sparkPageSchemaParam.setOptTitle(C60906NvK.LIZ("opt_title", str49, LIZ2, LJJJJIZL2));
                    }
                    String str50 = (String) linkedHashMap2.get("page_depth_of_report_show");
                    if (str50 != null) {
                        sparkPageSchemaParam.setPageDepthOfReportShow(C60906NvK.LIZIZ("page_depth_of_report_show", str50, LIZ2, LJJJJIZL2, false));
                    }
                    String str51 = (String) linkedHashMap2.get("parallel_fetch_resource");
                    if (str51 != null) {
                        sparkPageSchemaParam.setParallelFetchResource(C60906NvK.LIZ("parallel_fetch_resource", str51, LIZ2, LJJJJIZL2));
                    }
                    String str52 = (String) linkedHashMap2.get("preloadFonts");
                    if (str52 != null) {
                        sparkPageSchemaParam.setPreloadFonts(str52);
                    }
                    String str53 = (String) linkedHashMap2.get("preload_setting_keys");
                    if (str53 != null) {
                        sparkPageSchemaParam.setPreloadSettingsKeys(str53);
                    }
                    String str54 = (String) linkedHashMap2.get("preload_storage_keys");
                    if (str54 != null) {
                        sparkPageSchemaParam.setPreloadStorageKeys(str54);
                    }
                    String str55 = (String) linkedHashMap2.get("preset_height");
                    if (str55 != null) {
                        sparkPageSchemaParam.setPresetHeight(C60906NvK.LIZIZ("preset_height", str55, LIZ2, LJJJJIZL2, true));
                    }
                    String str56 = (String) linkedHashMap2.get("preset_safe_point");
                    if (str56 != null) {
                        sparkPageSchemaParam.setPresetSafePoint(C60906NvK.LIZ("preset_safe_point", str56, LIZ2, LJJJJIZL2));
                    }
                    String str57 = (String) linkedHashMap2.get("preset_width");
                    if (str57 != null) {
                        sparkPageSchemaParam.setPresetWidth(C60906NvK.LIZIZ("preset_width", str57, LIZ2, LJJJJIZL2, true));
                    }
                    String str58 = (String) linkedHashMap2.get("proxy_enabled_runtime_type");
                    if (str58 != null) {
                        sparkPageSchemaParam.setProxyEnabledRuntimeType(C60906NvK.LIZ("proxy_enabled_runtime_type", str58, LIZ2, LJJJJIZL2));
                    }
                    String str59 = (String) linkedHashMap2.get("redirect_regions");
                    if (str59 != null) {
                        sparkPageSchemaParam.setRedirectRegions(str59);
                    }
                    String str60 = (String) linkedHashMap2.get("resource_dynamic");
                    if (str60 != null) {
                        sparkPageSchemaParam.setResourceDynamic(Boolean.valueOf(C60906NvK.LIZ("resource_dynamic", str60, LIZ2, LJJJJIZL2)));
                    }
                    String str61 = (String) linkedHashMap2.get("screen_orientation");
                    if (str61 != null) {
                        sparkPageSchemaParam.setScreenOrientation(str61);
                    }
                    String str62 = (String) linkedHashMap2.get("sec_link_scene");
                    if (str62 != null) {
                        sparkPageSchemaParam.setSecLinkScene(str62);
                    }
                    String str63 = (String) linkedHashMap2.get("session_id");
                    if (str63 != null) {
                        sparkPageSchemaParam.setSessionId(str63);
                    }
                    String str64 = (String) linkedHashMap2.get("share_group");
                    if (str64 != null) {
                        sparkPageSchemaParam.setShareGroup(C60906NvK.LIZ("share_group", str64, LIZ2, LJJJJIZL2));
                    }
                    String str65 = (String) linkedHashMap2.get("show_closeall");
                    if (str65 != null) {
                        sparkPageSchemaParam.setShowCloseAll(str65);
                    }
                    String str66 = (String) linkedHashMap2.get("show_nav_bar_in_trans_status_bar");
                    if (str66 != null) {
                        sparkPageSchemaParam.setShowNavBarInTransStatusBar(C60906NvK.LIZ("show_nav_bar_in_trans_status_bar", str66, LIZ2, LJJJJIZL2));
                    }
                    String str67 = (String) linkedHashMap2.get("show_progress_bar_in_all_page");
                    if (str67 != null) {
                        sparkPageSchemaParam.setShowProgressBarInAllPage(C60906NvK.LIZ("show_progress_bar_in_all_page", str67, LIZ2, LJJJJIZL2));
                    }
                    String str68 = (String) linkedHashMap2.get("show_web_url");
                    if (str68 != null) {
                        sparkPageSchemaParam.setShowWebUrl(C60906NvK.LIZ("show_web_url", str68, LIZ2, LJJJJIZL2));
                    }
                    String str69 = (String) linkedHashMap2.get("skeleton_duration");
                    if (str69 != null) {
                        sparkPageSchemaParam.setSkeletonDuration(Integer.valueOf(C60906NvK.LIZIZ("skeleton_duration", str69, LIZ2, LJJJJIZL2, true)));
                    }
                    String str70 = (String) linkedHashMap2.get("skeleton_from_alpha");
                    if (str70 != null) {
                        sparkPageSchemaParam.setSkeletonFromAlpha(str70);
                    }
                    String str71 = (String) linkedHashMap2.get("skeleton_path");
                    if (str71 != null) {
                        sparkPageSchemaParam.setSkeletonPath(str71);
                    }
                    String str72 = (String) linkedHashMap2.get("skeleton_to_alpha");
                    if (str72 != null) {
                        sparkPageSchemaParam.setSkeletonToAlpha(str72);
                    }
                    String str73 = (String) linkedHashMap2.get("skeleton_with_animation");
                    if (str73 != null) {
                        sparkPageSchemaParam.setSkeletonWithAnimation(C60906NvK.LIZ("skeleton_with_animation", str73, LIZ2, LJJJJIZL2));
                    }
                    String str74 = (String) linkedHashMap2.get("spark_perf_bid");
                    if (str74 != null) {
                        sparkPageSchemaParam.setSparkPerfBid(str74);
                    }
                    String str75 = (String) linkedHashMap2.get("spark_perf_biz");
                    if (str75 != null) {
                        sparkPageSchemaParam.setSparkPerfBiz(str75);
                    }
                    String str76 = (String) linkedHashMap2.get("ssp_config");
                    if (str76 != null) {
                        sparkPageSchemaParam.setSspConfig(C60906NvK.LIZIZ("ssp_config", str76, LIZ2, LJJJJIZL2, false));
                    }
                    String str77 = (String) linkedHashMap2.get("starling_channel");
                    if (str77 != null) {
                        sparkPageSchemaParam.setStarlingChannel(str77);
                    }
                    String str78 = (String) linkedHashMap2.get("starling_fallback");
                    if (str78 != null) {
                        sparkPageSchemaParam.setStarlingFallback(C60906NvK.LIZ("starling_fallback", str78, LIZ2, LJJJJIZL2));
                    }
                    String str79 = (String) linkedHashMap2.get("status_bar_bg_color");
                    Object obj41 = linkedHashMap2.get("status_bar_bg_color_dark");
                    Object obj42 = linkedHashMap2.get("status_bar_bg_color_light");
                    if (str79 != null || obj41 != null || obj42 != null) {
                        sparkPageSchemaParam.setStatusBarBgColor(C60906NvK.LIZJ("status_bar_bg_color", str79, LIZ2, LJJJJIZL2));
                    }
                    String str80 = (String) linkedHashMap2.get("status_font_mode");
                    if (str80 != null) {
                        sparkPageSchemaParam.setStatusFontMode(str80);
                    }
                    String str81 = (String) linkedHashMap2.get("subscribe_network_level");
                    if (str81 != null) {
                        sparkPageSchemaParam.setSubscribeNetworkLevel(C60906NvK.LIZ("subscribe_network_level", str81, LIZ2, LJJJJIZL2));
                    }
                    String str82 = (String) linkedHashMap2.get("surl");
                    if (str82 != null) {
                        sparkPageSchemaParam.setSurl(str82);
                    }
                    String str83 = (String) linkedHashMap2.get("thread_strategy");
                    if (str83 != null) {
                        sparkPageSchemaParam.setThreadStrategy(C60906NvK.LIZIZ("thread_strategy", str83, LIZ2, LJJJJIZL2, false));
                    }
                    String str84 = (String) linkedHashMap2.get("title");
                    if (str84 != null) {
                        sparkPageSchemaParam.setTitle(str84);
                    }
                    String str85 = (String) linkedHashMap2.get("title_color");
                    Object obj43 = linkedHashMap2.get("title_color_dark");
                    Object obj44 = linkedHashMap2.get("title_color_light");
                    if (str85 != null || obj43 != null || obj44 != null) {
                        sparkPageSchemaParam.setTitleColor(C60906NvK.LIZJ("title_color", str85, LIZ2, LJJJJIZL2));
                    }
                    String str86 = (String) linkedHashMap2.get("trans_navigation_bar");
                    if (str86 != null) {
                        sparkPageSchemaParam.setTransNavigationBar(C60906NvK.LIZ("trans_navigation_bar", str86, LIZ2, LJJJJIZL2));
                    }
                    String str87 = (String) linkedHashMap2.get("trans_status_bar");
                    if (str87 != null) {
                        sparkPageSchemaParam.setTransStatusBar(C60906NvK.LIZ("trans_status_bar", str87, LIZ2, LJJJJIZL2));
                    }
                    String str88 = (String) linkedHashMap2.get("ui_running_mode");
                    if (str88 != null) {
                        sparkPageSchemaParam.setUiRunningMode(C60906NvK.LIZ("ui_running_mode", str88, LIZ2, LJJJJIZL2));
                    }
                    String str89 = (String) linkedHashMap2.get("url");
                    if (str89 != null) {
                        sparkPageSchemaParam.setUrl(str89);
                    }
                    String str90 = (String) linkedHashMap2.get("use_forest");
                    if (str90 != null) {
                        sparkPageSchemaParam.setUseForest(C60906NvK.LIZ("use_forest", str90, LIZ2, LJJJJIZL2));
                    }
                    String str91 = (String) linkedHashMap2.get("use_mutable_context");
                    if (str91 != null) {
                        sparkPageSchemaParam.setUseMutableContext(C60906NvK.LIZ("use_mutable_context", str91, LIZ2, LJJJJIZL2));
                    }
                    String str92 = (String) linkedHashMap2.get("use_preload");
                    if (str92 != null) {
                        sparkPageSchemaParam.setUsePreload(C60906NvK.LIZ("use_preload", str92, LIZ2, LJJJJIZL2));
                    }
                    String str93 = (String) linkedHashMap2.get("use_preload_resource_h5");
                    if (str93 != null) {
                        sparkPageSchemaParam.setUsePreloadResourceH5(C60906NvK.LIZ("use_preload_resource_h5", str93, LIZ2, LJJJJIZL2));
                    }
                    String str94 = (String) linkedHashMap2.get("use_webview_title");
                    if (str94 != null) {
                        sparkPageSchemaParam.setUseWebviewTitle(C60906NvK.LIZ("use_webview_title", str94, LIZ2, LJJJJIZL2));
                    }
                    String str95 = (String) linkedHashMap2.get("wait_gecko_update");
                    if (str95 != null) {
                        sparkPageSchemaParam.setWaitGeckoUpdate(Boolean.valueOf(C60906NvK.LIZ("wait_gecko_update", str95, LIZ2, LJJJJIZL2)));
                    }
                    String str96 = (String) linkedHashMap2.get("wait_low_storage_update");
                    if (str96 != null) {
                        sparkPageSchemaParam.setWaitLowStorageUpdate(C60906NvK.LIZ("wait_low_storage_update", str96, LIZ2, LJJJJIZL2));
                    }
                    String str97 = (String) linkedHashMap2.get("webview_progress_bar");
                    if (str97 != null) {
                        sparkPageSchemaParam.setWebviewProgressBar(C60906NvK.LIZ("webview_progress_bar", str97, LIZ2, LJJJJIZL2));
                    }
                    String host2 = LJJJJIZL2.getHost();
                    if (host2 != null) {
                        if (s.LJJJLZIJ(host2, "webview", false)) {
                            enumC39924Flg = EnumC39924Flg.WEB;
                        } else if (s.LJJJLZIJ(host2, "lynxview", false)) {
                            enumC39924Flg = EnumC39924Flg.LYNX;
                        }
                        sparkPageSchemaParam.setEngineType(enumC39924Flg);
                        sparkPageSchemaParam.adjustValues();
                        sparkSchemaParam = sparkPageSchemaParam;
                    }
                    enumC39924Flg = EnumC39924Flg.UNKNOWN;
                    sparkPageSchemaParam.setEngineType(enumC39924Flg);
                    sparkPageSchemaParam.adjustValues();
                    sparkSchemaParam = sparkPageSchemaParam;
                }
                this.schemaParams = sparkSchemaParam;
            }
            this.hasParseSchema = true;
            long currentTimeMillis2 = System.currentTimeMillis();
            if (!z) {
                FD5.LIZJ(currentTimeMillis2, this.containerId, "prepare_init_data_end");
            }
            LIZIZ(C60728NsS.class);
        }
        return this.schemaParams;
    }

    public final Integer LJIJI(Context context) {
        InterfaceC60837NuD LJ;
        C60809Ntl.LIZIZ.getClass();
        InterfaceC60799Ntb interfaceC60799Ntb = C60809Ntl.LIZ;
        if (interfaceC60799Ntb == null || (LJ = interfaceC60799Ntb.LJ()) == null || !C60806Nti.LIZ) {
            return null;
        }
        int i = C60808Ntk.LIZ[LJ(context).ordinal()];
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            LJ.LJ();
            return Integer.valueOf(R.style.ux);
        }
        LJ.LIZIZ();
        return Integer.valueOf(R.style.ul);
    }

    public final void LJIJJ(InterfaceC40159FpT interfaceC40159FpT) {
        LJII(InterfaceC40159FpT.class, interfaceC40159FpT);
    }

    public final void LJIJJLI(Bundle b) {
        o.LJIIJ(b, "b");
        this.bundle = b;
        this.hasParseSchema = false;
    }

    public final void LJIL(AbstractC60800Ntc loadCallback) {
        o.LJIIJ(loadCallback, "loadCallback");
        LJII(AbstractC60800Ntc.class, loadCallback);
    }

    public final void LJJ(AbstractC60815Ntr kitInitParamHandler) {
        o.LJIIJ(kitInitParamHandler, "kitInitParamHandler");
        LJII(AbstractC60815Ntr.class, kitInitParamHandler);
    }

    public final void LJJI(AbstractC60811Ntn loadCallback) {
        o.LJIIJ(loadCallback, "loadCallback");
        LJII(AbstractC60811Ntn.class, loadCallback);
    }

    public final void LJJIJ(Map map) {
        o.LJIIJ(map, "map");
        this.extraRuntimeInfo.putAll(map);
        this.hasParseSchema = false;
    }

    public final synchronized void LJJIJIIJI(InterfaceC60850NuQ sparkActivityCallback) {
        o.LJIIJ(sparkActivityCallback, "sparkActivityCallback");
        C60869Nuj c60869Nuj = (C60869Nuj) LIZIZ(C60869Nuj.class);
        if (c60869Nuj == null) {
            c60869Nuj = new C60869Nuj(new ArrayList());
        }
        c60869Nuj.LIZ.add(sparkActivityCallback);
        LJII(C60869Nuj.class, c60869Nuj);
    }

    public final synchronized void LJJIJIIJIL(InterfaceC60949Nw1 interfaceC60949Nw1) {
        C60928Nvg c60928Nvg = (C60928Nvg) LIZIZ(C60928Nvg.class);
        if (c60928Nvg == null) {
            c60928Nvg = new C60928Nvg(new ArrayList());
        }
        c60928Nvg.LIZ.add(interfaceC60949Nw1);
        LJII(C60928Nvg.class, c60928Nvg);
    }

    public final void LJJIJIL(InterfaceC60814Ntq statusViewProvider) {
        o.LJIIJ(statusViewProvider, "statusViewProvider");
        LJII(InterfaceC60814Ntq.class, statusViewProvider);
    }

    public final void LJJIJL(InterfaceC60844NuK titleBarProvider) {
        o.LJIIJ(titleBarProvider, "titleBarProvider");
        LJII(InterfaceC60844NuK.class, titleBarProvider);
    }

    public final void LJJIJLIJ(String url) {
        o.LJIIJ(url, "url");
        this.url = url;
        this.schemaBundle = null;
        this.hasParseSchema = false;
    }

    public final void LJJIFFI(int i, String key) {
        o.LJIIJ(key, "key");
        this.defaultParams.put(key, String.valueOf(i));
        this.hasParseSchema = false;
    }

    public final void LJJII(String key, double d) {
        o.LJIIJ(key, "key");
        this.defaultParams.put(key, String.valueOf(d));
        this.hasParseSchema = false;
    }

    public final void LJJIIJ(String key, String value) {
        o.LJIIJ(key, "key");
        o.LJIIJ(value, "value");
        this.defaultParams.put(key, value);
        this.hasParseSchema = false;
    }

    public final void LJJIIJZLJL(String key, boolean z) {
        String str;
        o.LJIIJ(key, "key");
        Map<String, String> map = this.defaultParams;
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put(key, str);
        this.hasParseSchema = false;
    }

    public final void LJJIIZ(Object value, String key) {
        o.LJIIJ(key, "key");
        o.LJIIJ(value, "value");
        this.extraRuntimeInfo.put((Object) key, value);
        this.hasParseSchema = false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        o.LJIIJ(parcel, "parcel");
        C109464Ri.LIZ.getClass();
    }
}
