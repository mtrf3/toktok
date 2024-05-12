package com.ss.android.ugc.aweme.ecommerce.mall.lynxhome.ui;

import X.ActivityC45651qj;
import X.C113554cx;
import X.C141335gf;
import X.C16880lQ;
import X.C17N;
import X.C212428Vi;
import X.C214298b3;
import X.C27570Aru;
import X.C278517l;
import X.C34233Dc5;
import X.C36746EbW;
import X.C38943FQd;
import X.C39468FeK;
import X.C3C5;
import X.C47261Igj;
import X.C51029K0z;
import X.C51437KGr;
import X.C51739KSh;
import X.C52904KpY;
import X.C53221Kuf;
import X.C53286Kvi;
import X.C54251LQx;
import X.C54262LRi;
import X.C54362LVe;
import X.C54741Le5;
import X.C55096Ljo;
import X.C55230Lly;
import X.C56092Lzs;
import X.C56093Lzt;
import X.C56111M0l;
import X.C56112M0m;
import X.C56113M0n;
import X.C56118M0s;
import X.C56123M0x;
import X.C56133M1h;
import X.C61269O2v;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78565UsT;
import X.C78613UtF;
import X.C78926UyI;
import X.C78983UzD;
import X.C79081V1x;
import X.C87020YDg;
import X.C9BE;
import X.EF7;
import X.EnumC56032Lyu;
import X.EnumC56082Lzi;
import X.EnumC56110M0k;
import X.EnumC56115M0p;
import X.EnumC56124M0y;
import X.HG3;
import X.IK7;
import X.KSH;
import X.M0B;
import X.M0E;
import X.M0F;
import X.M0H;
import X.M0L;
import X.M0M;
import X.M1T;
import X.M1U;
import X.M1V;
import X.M2D;
import X.N9W;
import X.N9X;
import X.O3U;
import X.O5Y;
import X.O9C;
import X.OSZ;
import X.QD3;
import X.RBX;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import X.VNS;
import X.X1D;
import X.XIA;
import X.YDJ;
import X.YDK;
import Y.ARunnableS45S0100000_9;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.ugc.statisticlogger.btm.BTMTrackerServiceImpl;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.ecommerce.mall.ShopMainFragment;
import com.ss.android.ugc.aweme.ecommerce.mall.lynxhome.api.GetShopLynxVMAbility;
import com.ss.android.ugc.aweme.ecommerce.mall.lynxhome.vm.ShopMainLynxViewModel;
import com.ss.android.ugc.aweme.ecommerce.mall.settings.EcMallConfigSettings;
import com.ss.android.ugc.aweme.ecommerce.ug.newinstall.service.EcUgNewInstallService;
import com.ss.android.ugc.aweme.ecommerce.ug.popup.service.EcUgPopupService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS191S0100000_9;
import kotlin.jvm.internal.IDqS431S0100000_6;
import kotlin.jvm.internal.IDqS434S0100000_9;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import yq4.a;

/* loaded from: classes10.dex */
public final class ShopMainLynxAssem extends UIContentAssem implements GetShopLynxVMAbility {
    public final C214298b3 LJLIL;
    public View LJLILLLLZI;
    public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJLJI;
    public volatile C56123M0x LJLJJI;
    public final M0B LJLJJL;
    public final C56111M0l LJLJJLL;
    public final M1V LJLJL;
    public final Map<Integer, View> LJLJLJ = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLJLJ;
        Integer valueOf = Integer.valueOf(R.id.gb_);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(R.id.gb_)) == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    public ShopMainLynxAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ShopMainLynxViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS159S0100000_9(LIZ, 128), M1T.INSTANCE, null);
        this.LJLJJL = new M0B(this);
        this.LJLJJLL = new C56111M0l(this);
        M1U predicate = M1U.LJLIL;
        C56113M0n loadSuccessBlock = C56113M0n.LJLIL;
        C56118M0s c56118M0s = C56118M0s.LJLIL;
        C56112M0m c56112M0m = C56112M0m.LJLIL;
        o.LJIIIZ(predicate, "predicate");
        o.LJIIIZ(loadSuccessBlock, "loadSuccessBlock");
        this.LJLJL = new M1V(predicate, loadSuccessBlock, c56118M0s, c56112M0m);
    }

    public final ShopMainLynxViewModel v3() {
        return (ShopMainLynxViewModel) this.LJLIL.getValue();
    }

    public final void A3() {
        v3().getClass();
        int LJIILIIL = C54362LVe.LJIILIIL(210);
        int LJIILIIL2 = C54362LVe.LJIILIIL(214);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("210", LJIILIIL);
        jSONObject.put("214", LJIILIIL2);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("red_dot_message", jSONObject);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShopTabV3 messageNotify ");
        LIZ.append(jSONObject2);
        C36746EbW.LIZ(3, X1D.LIZIZ(LIZ));
        v3().hv0().LIZ(jSONObject2, EnumC56110M0k.LYNX_ON_PAGE_START);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.lynxhome.api.GetShopLynxVMAbility
    public final ShopMainLynxViewModel Io() {
        return v3();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        EventBus LIZJ = EventBus.LIZJ();
        if (LIZJ.LJI(this)) {
            LIZJ.LJIJ(this);
        }
        M1V monitor = this.LJLJL;
        o.LJIIJ(monitor, "monitor");
        C61269O2v.LIZ.remove(monitor);
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            C55096Ljo.LJIILL(C55230Lly.LIZLLL(LIZ, null), GetShopLynxVMAbility.class, null);
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJFF(true);
        }
        this.LJLJI = null;
    }

    public final void x3() {
        Object obj;
        String str;
        Object obj2;
        Object obj3;
        Object obj4;
        String str2;
        EcUgPopupService.LJIILJJIL().LIZ();
        v3().LJLILLLLZI.LJLJJI = false;
        Context context = getContext();
        if (context != null) {
            M0H hv0 = v3().hv0();
            M0B m0b = this.LJLJJL;
            C56111M0l c56111M0l = this.LJLJJLL;
            hv0.getClass();
            C56092Lzs.LJIIJJI(C56092Lzs.LIZ, EnumC56115M0p.STAGE_CREATE_SPARKVIEW.getStage(), System.currentTimeMillis() - M0M.LIZ, false, 28);
            M0F m0f = M0F.LIZ;
            M0F.LIZIZ("createSparkView start");
            if (m0f.LIZ() != null) {
                hv0.LIZ.LJLJI = true;
            }
            String str3 = EcMallConfigSettings.getValue().fullPageCardSchema;
            if (str3 == null) {
                str3 = "sslocal://lynxview?use_new_container=1&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_ecommerce_ttmall_v3%2Fpages%2Fhome.js&use_spark=1&__live_platform__=webcast&trans_status_bar=1&hide_nav_bar=1&previous_page=mall&enter_from=mall&business_from=ecom&target_handler=webcast&enable_code_cache=1&ab_params=ec_mall_card_hypothesis_order,ttmall_feed_use_global_exposure,ec_mall_appear_directly,ec_mall_old_user_base_layout_height_type";
            }
            String LIZJ = a.LJIIZILJ().LIZJ();
            if (LIZJ == null) {
                LIZJ = "";
            }
            ShopMainFragment.LJZ.getClass();
            String str4 = ShopMainFragment.LLFII;
            if (str4 != null) {
                String value = EnumC56032Lyu.FIRST_SCREEN.getValue();
                String str5 = ShopMainFragment.LJZI;
                if (str5 == null) {
                    str5 = "";
                }
                C56092Lzs.LJI(str4, value, C51029K0z.LJJIIZI(new OSZ("previous_page", str5)));
            }
            OSZ[] oszArr = new OSZ[12];
            oszArr[0] = new OSZ("init_time", String.valueOf(System.currentTimeMillis()));
            String str6 = "1";
            if (((Boolean) hv0.LIZJ.getValue()).booleanValue()) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            oszArr[1] = new OSZ("is_use_cache", obj);
            oszArr[2] = new OSZ("enter_from", C56092Lzs.LIZJ());
            String str7 = ShopMainFragment.LL;
            if (str7 == null) {
                str7 = "";
            }
            oszArr[3] = new OSZ("enter_method", str7);
            String str8 = ShopMainFragment.LJZI;
            if (str8 == null) {
                str8 = "unknown";
            }
            oszArr[4] = new OSZ("previous_page", str8);
            oszArr[5] = new OSZ("tt_mall_live_lifecycle_opt", String.valueOf(((Number) C34233Dc5.LIZ.getValue()).intValue()));
            String str9 = EcMallConfigSettings.getValue().videoScene;
            if (str9 == null) {
                str9 = "";
            }
            oszArr[6] = new OSZ("video_scene", str9);
            Object value2 = C52904KpY.LIZ.getValue();
            o.LJIIIIZZ(value2, "<get-value>(...)");
            if (!TextUtils.equals((String) value2, "1")) {
                str = "1";
            } else {
                str = "2";
            }
            oszArr[7] = new OSZ("video_aweme", str);
            oszArr[8] = new OSZ("tt_mall_live_singleton_opt", "1");
            OSZ[] oszArr2 = new OSZ[10];
            if (M0M.LJFF == null) {
                M0M.LJFF = Boolean.valueOf(O3U.LJIILL("tiktok_live_ecommerce_ttmall_v3"));
            }
            if (o.LJ(M0M.LJFF, Boolean.TRUE)) {
                obj2 = "1";
            } else {
                obj2 = CardStruct.IStatusCode.DEFAULT;
            }
            oszArr2[0] = new OSZ("is_offline", obj2);
            if (M0M.LIZ()) {
                obj3 = "1";
            } else {
                obj3 = CardStruct.IStatusCode.DEFAULT;
            }
            oszArr2[1] = new OSZ("is_first_install_launch", obj3);
            if (M0M.LIZIZ()) {
                obj4 = "1";
            } else {
                obj4 = CardStruct.IStatusCode.DEFAULT;
            }
            oszArr2[2] = new OSZ("is_first_show_mall", obj4);
            if (M0M.LJII == null) {
                M0M.LJII = O3U.LJIIJ(C38943FQd.LIZ(), "tiktok_live_ecommerce_ttmall_v3");
            }
            Long l = M0M.LJII;
            if (l == null || (str2 = l.toString()) == null) {
                str2 = "";
            }
            oszArr2[3] = new OSZ("gecko_version_id", str2);
            long j = hv0.LIZ.LJLJJL;
            if (j <= 0) {
                j = System.currentTimeMillis();
            }
            oszArr2[4] = new OSZ("tab_clicked_time", String.valueOf(j));
            oszArr2[5] = new OSZ("is_ug_allowlist_user", EcUgNewInstallService.LIZLLL().LIZ().getSecond());
            oszArr2[6] = new OSZ("top_tab_height", String.valueOf(hv0.LIZLLL));
            oszArr2[7] = new OSZ("status_bar_height", String.valueOf(C17N.LJJJJI(C63081OpJ.LJJJJLI(EF7.LIZIZ()))));
            oszArr2[8] = new OSZ("tt_mall_page_theme", String.valueOf(((Number) C53286Kvi.LIZIZ.getValue()).intValue()));
            if (!((RBX) HG3.LJIILL()).isLogin()) {
                str6 = CardStruct.IStatusCode.DEFAULT;
            }
            oszArr2[9] = new OSZ("is_login", str6);
            oszArr[9] = new OSZ("mall_native_constant_data", C113554cx.LJJJLZIJ(oszArr2));
            oszArr[10] = new OSZ("cmpl_enc", LIZJ);
            String str10 = ShopMainFragment.LLFII;
            if (str10 == null) {
                str10 = "";
            }
            oszArr[11] = new OSZ("extra_route_schema", str10);
            HashMap LJJJLZIJ = C113554cx.LJJJLZIJ(oszArr);
            Map<String, String> LIZ = KSH.LIZ.LIZ();
            if (LIZ != null) {
                LJJJLZIJ.put("injectionData", LIZ);
            }
            TemplateData LIZ2 = m0f.LIZ();
            if (M0F.LJ == null) {
                m0f.LIZ();
            }
            Map<Object, Object> map = M0F.LJ;
            M2D m2d = new M2D();
            m2d.LJIILLIIL = str3;
            m2d.LIZJ.putAll(LJJJLZIJ);
            m2d.LJIIIZ = new AqS175S0100000_9(m0b, 479);
            m2d.LJFF = new AqS175S0100000_9(m0b, 480);
            m2d.LJII = new AqS175S0100000_9(m0b, 481);
            m2d.LJI = new IDqS431S0100000_6(m0b, 1);
            m2d.LJIIIIZZ = new AqS191S0100000_9(m0b, 82);
            m2d.LJIIJ = new AqS175S0100000_9(m0b, 482);
            m2d.LJIIJJI = new IDqS434S0100000_9(m0b, 1);
            if (LIZ2 != null) {
                m2d.LIZ = LIZ2;
                C36746EbW.LIZ(3, "ShopTabV3 DataUpdate setTemplateData");
            }
            if (map != null) {
                m2d.LIZIZ = map;
            }
            if (c56111M0l != null) {
                m2d.LJIILIIL = c56111M0l;
            }
            C36746EbW.LIZ(3, "ShopTabV3 SparkPre returnSpark");
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZ3 = O9C.LIZ(context, m2d);
            this.LJLJI = LIZ3;
            SparkContext sparkContext = LIZ3.getSparkContext();
            if (sparkContext != null) {
                if (C54741Le5.LIZIZ()) {
                    View lynx_container = _$_findCachedViewById(R.id.gb_);
                    o.LJIIIIZZ(lynx_container, "lynx_container");
                    C39468FeK.LJIIIZ(sparkContext, lynx_container);
                } else {
                    sparkContext.LJJIIZ(BTMTrackerServiceImpl.LJFF().LIZJ(), "btm_route_data");
                }
            }
        }
        M0F.LIZIZ("createSparkView finish");
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            Iterator it = C47261Igj.LJJIJIIJI(YDK.class, YDJ.class, N9X.class, C51437KGr.class, C87020YDg.class, C56133M1h.class, N9W.class).iterator();
            while (it.hasNext()) {
                C79081V1x.LJJIJIIJI(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, (Class) it.next());
            }
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = this.LJLJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        try {
            ((FrameLayout) _$_findCachedViewById(R.id.gb_)).addView(this.LJLJI, Math.max(0, ((FrameLayout) _$_findCachedViewById(R.id.gb_)).getChildCount() - 1));
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3 = this.LJLJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3 != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3.setVisibility(0);
        }
        M0F.LIZIZ("loadUrl start");
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS4 = this.LJLJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS4 != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS4.LIZIZ();
        }
        M0F.LIZIZ("loadUrl finish");
        M0F.LIZJ("loadUrl finish");
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void loadShopTabSparkView(IK7 event) {
        o.LJIIIZ(event, "event");
        C36746EbW.LIZ(3, "ShopTabV3 HalfScreen loadSparkView");
        x3();
    }

    @QD3(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onRedPointUpdate(C54251LQx event) {
        o.LJIIIZ(event, "event");
        A3();
    }

    @QD3(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onRedPointUpdateRefactor(C54262LRi event) {
        o.LJIIIZ(event, "event");
        A3();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        View LLLLIILL;
        int i;
        o.LJIIIZ(view, "view");
        View view2 = null;
        O5Y.LJJJJLL(EnumC56082Lzi.STAGE_CREATE_VIEW_END.getStage(), v3().LJLILLLLZI, null);
        EventBus LIZJ = EventBus.LIZJ();
        if (!LIZJ.LJI(this)) {
            LIZJ.LJIILJJIL(this);
        }
        M1V monitor = this.LJLJL;
        o.LJIIJ(monitor, "monitor");
        C61269O2v.LIZ.add(monitor);
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            C55096Ljo.LJIIJJI(C55230Lly.LIZLLL(LIZ, null), this, GetShopLynxVMAbility.class, null);
        }
        v3().LJLIL = new M0E(this);
        XIA xia = C78613UtF.LIZJ;
        C78565UsT.LJJIIZI(this, xia, new C56093Lzt(null));
        ShopMainLynxViewModel v3 = v3();
        v3.getClass();
        C78565UsT.LJJIJIIJI(v3, xia, new C51739KSh(null));
        v3().jv0(EnumC56124M0y.FIRST_REQUEST);
        int i2 = v3().LJLILLLLZI.LJLJLJ;
        if (i2 != 0) {
            C36746EbW.LIZ(3, "ShopTabV3 HalfScreen delayLoad");
            EcUgPopupService.LJIILJJIL().LJII(i2);
        } else {
            _$_findCachedViewById(R.id.gb_).post(new ARunnableS45S0100000_9(this, 27));
        }
        if (this.LJLILLLLZI == null) {
            C62822Ol8 c62822Ol8 = C53221Kuf.LIZ;
            if (((Number) c62822Ol8.getValue()).intValue() == 1) {
                LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(_$_findCachedViewById(R.id.gb_).getContext()), R.layout.a75, (ViewGroup) _$_findCachedViewById(R.id.gb_), false);
            } else {
                LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(_$_findCachedViewById(R.id.gb_).getContext()), R.layout.a74, (ViewGroup) _$_findCachedViewById(R.id.gb_), false);
            }
            this.LJLILLLLZI = LLLLIILL;
            if (LLLLIILL != null) {
                C278517l.LIZIZ(-1, -1, LLLLIILL);
            }
            ShopMainFragment.LJZ.getClass();
            if (C54741Le5.LIZIZ()) {
                View view3 = this.LJLILLLLZI;
                if (view3 != null) {
                    view2 = view3.findViewById(R.id.kel);
                }
                if (((Number) c62822Ol8.getValue()).intValue() == 1) {
                    i = 92;
                } else {
                    i = 88;
                }
                if (view2 != null) {
                    C27570Aru.LJII(C79081V1x.LJII(i), view2);
                }
            }
            View view4 = this.LJLILLLLZI;
            if (view4 != null) {
                try {
                    ((FrameLayout) _$_findCachedViewById(R.id.gb_)).addView(view4, 0);
                    C3C5.m7constructorimpl(C76800UCe.LIZ);
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    C78983UzD.LJIIZILJ(th);
                    C3C5.m7constructorimpl(C141335gf.LIZ(th));
                }
            }
        }
        View view5 = this.LJLILLLLZI;
        if (view5 != null) {
            view5.setVisibility(0);
        }
        try {
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th2) {
            C78983UzD.LJIIZILJ(th2);
            C3C5.m7constructorimpl(C141335gf.LIZ(th2));
        }
    }

    public final void C3(C56123M0x c56123M0x, boolean z) {
        Object obj;
        TemplateData templateData;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            obj = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView();
        } else {
            obj = null;
        }
        if ((obj instanceof VNS) && (templateData = c56123M0x.LIZ) != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ShopTabV3 DataUpdate updateTemplateData data_from: ");
            LIZ.append(v3().LJLILLLLZI.LJLIL);
            C36746EbW.LIZ(3, X1D.LIZIZ(LIZ));
            ((VNS) obj).updateData(templateData);
            String stage = EnumC56082Lzi.STAGE_UPDATE_DATA.getStage();
            M0L m0l = v3().LJLILLLLZI;
            OSZ[] oszArr = new OSZ[2];
            String str = CardStruct.IStatusCode.DEFAULT;
            oszArr[0] = new OSZ("is_data_cache", CardStruct.IStatusCode.DEFAULT);
            if (z) {
                str = "1";
            }
            oszArr[1] = new OSZ("lynx_load_success_earlier", str);
            O5Y.LJJJJLL(stage, m0l, C113554cx.LJJL(oszArr));
            M0F.LIZJ("updateDataJason = enter");
        }
    }
}
