package com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C27090AkA;
import X.C27739Aud;
import X.C47117IeP;
import X.C52299Kfn;
import X.C64622gE;
import X.C64632gF;
import X.C65330PkU;
import X.C65352Pkq;
import X.C68322mC;
import X.C71132Rvs;
import X.C71289RyP;
import X.C71290RyQ;
import X.C71295RyV;
import X.C71296RyW;
import X.C780334l;
import X.C78613UtF;
import X.C78983UzD;
import X.C79057V0z;
import X.HG3;
import X.InterfaceC71291RyR;
import X.InterfaceC71293RyT;
import X.RBX;
import X.XKX;
import X.XXB;
import Y.ARunnableS46S0100000_10;
import android.app.Activity;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.dto.OrderEntranceType;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.dto.TradeEntranceInfo;
import defpackage.e1;
import java.util.Iterator;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public final class OrderCenterEntry implements GenericLifecycleObserver, InterfaceC71291RyR {
    public InterfaceC71293RyT LJLJI;
    public boolean LJLJJL;
    public final Handler LJLIL = new Handler(C16880lQ.LLJJJJ());
    public final Keva LJLILLLLZI = Keva.getRepo("ec_order_center_entrance_infos");
    public final C71290RyQ LJLJJI = new C71290RyQ(this);

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        C71132Rvs.LIZJ(new AqS178S0100000_12(this, 114));
        LJ();
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestory();
        } else if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        }
    }

    public final TradeEntranceInfo LIZLLL() {
        TradeEntranceInfo tradeEntranceInfo;
        Keva keva = this.LJLILLLLZI;
        o.LJIIIIZZ(keva, "keva");
        try {
            Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), C79057V0z.LJJIFFI(keva, LIZIZ()), C65330PkU.LIZJ(C65352Pkq.LIZLLL(TradeEntranceInfo.class)));
            if (!(fromJson instanceof TradeEntranceInfo)) {
                fromJson = null;
            }
            tradeEntranceInfo = (TradeEntranceInfo) fromJson;
        } catch (s e) {
            C78983UzD.LJIIZILJ(e);
        }
        if (tradeEntranceInfo == null) {
            return new TradeEntranceInfo(null, null, null, null, null, null, null, null, 255, null);
        }
        return tradeEntranceInfo;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestory() {
        this.LJLILLLLZI.unRegisterChangeListener(this.LJLJJI);
        this.LJLIL.removeCallbacksAndMessages(null);
        this.LJLJI = null;
    }

    public static String LIZIZ() {
        String uid = ((RBX) HG3.LJIILL()).getCurUserId();
        if (uid == null || uid.length() == 0) {
            return "unknown";
        }
        o.LJIIIIZZ(uid, "uid");
        return uid;
    }

    public final void LJ() {
        boolean z;
        TradeEntranceInfo LIZLLL = LIZLLL();
        Integer type = LIZLLL.getType();
        int ordinal = OrderEntranceType.OPEN.ordinal();
        if (type == null || type.intValue() != ordinal) {
            z = false;
        } else {
            z = true;
        }
        String tips = LIZLLL.getTips();
        if (tips == null) {
            tips = "";
        }
        C71289RyP c71289RyP = new C71289RyP(this, z, LIZLLL, tips);
        if (o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
            c71289RyP.invoke();
        } else {
            this.LJLIL.post(new ARunnableS46S0100000_10((Object) c71289RyP, 98));
        }
        if (z && !this.LJLJJL) {
            new C71296RyW(LIZLLL.getToReviewCount(), LIZLLL.getEntryName()).LIZIZ();
            this.LJLJJL = true;
        }
    }

    @Override // X.InterfaceC71291RyR
    public final void LIZ(ActivityC45651qj activityC45651qj) {
        TradeEntranceInfo LIZLLL = LIZLLL();
        C27090AkA c27090AkA = C27090AkA.LJLIL;
        if (!EventBus.LIZJ().LJI(c27090AkA)) {
            EventBus.LIZJ().LJIILJJIL(c27090AkA);
        }
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(activityC45651qj), C78613UtF.LIZJ, null, new C64632gF(null), 2);
        String schema = LIZLLL.getSchema();
        if (schema == null || schema.length() == 0) {
            C71132Rvs.LIZJ(new AqS143S0200000_12(this, activityC45651qj, 87));
        } else {
            LJFF(activityC45651qj, LIZLLL);
        }
    }

    public final void LJI(TradeEntranceInfo tradeEntranceInfo) {
        TradeEntranceInfo tradeEntranceInfo2 = tradeEntranceInfo;
        Keva keva = this.LJLILLLLZI;
        o.LJIIIIZZ(keva, "keva");
        String LIZIZ = LIZIZ();
        if (tradeEntranceInfo2 == null) {
            tradeEntranceInfo2 = new TradeEntranceInfo(null, null, null, null, null, null, null, null, 255, null);
        }
        C79057V0z.LJJJJJ(keva, LIZIZ, C27739Aud.LJI(tradeEntranceInfo2));
    }

    public final void LIZJ(Lifecycle lifecycle, XXB xxb) {
        o.LJIIIZ(lifecycle, "lifecycle");
        if (this.LJLJI == null) {
            this.LJLJI = xxb;
            lifecycle.addObserver(this);
            this.LJLILLLLZI.registerChangeListener(this.LJLJJI);
            return;
        }
        throw new RuntimeException("Do not init reduplicative!");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.String] */
    public final void LJFF(Activity activity, TradeEntranceInfo tradeEntranceInfo) {
        ?? r1;
        C68322mC c68322mC = new C68322mC();
        String schema = tradeEntranceInfo.getSchema();
        if (schema == null || schema.length() == 0) {
            SettingsManager LIZLLL = SettingsManager.LIZLLL();
            String str = C52299Kfn.LIZ;
            String str2 = (String) LIZLLL.LJIIIIZZ("ecom_order_center_default_schema", String.class, str);
            r1 = str;
            if (str2 != null) {
                r1 = str2;
            }
        } else {
            r1 = tradeEntranceInfo.getSchema();
        }
        c68322mC.element = r1;
        Uri parse = UriProtector.parse(r1);
        Uri.Builder encodedPath = new Uri.Builder().scheme(parse.getScheme()).encodedAuthority(parse.getAuthority()).encodedPath(parse.getPath());
        Iterator LIZ = C47117IeP.LIZ(parse, "this.queryParameterNames");
        while (LIZ.hasNext()) {
            String str3 = (String) LIZ.next();
            encodedPath.appendQueryParameter(str3, UriProtector.getQueryParameter(parse, str3));
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("start_click_time", System.currentTimeMillis());
        encodedPath.appendQueryParameter("trackParams", jSONObject.toString());
        if (!UriProtector.getQueryParameterNames(parse).contains("previous_page")) {
            encodedPath.appendQueryParameter("previous_page", "navigation_panel");
        }
        c68322mC.element = encodedPath.build().toString();
        if (e1.LIZ(31744, "ecom_order_center_first_screen_optimize_precise_setting", true, false)) {
            XKX.LIZLLL(C780334l.LJLIL, null, null, new C64622gE(c68322mC, null), 3);
        }
        SmartRouter.buildRoute(activity, (String) c68322mC.element).open();
        tradeEntranceInfo.setTips("");
        tradeEntranceInfo.setSchema("");
        LJI(tradeEntranceInfo);
        new C71295RyV(tradeEntranceInfo.getToReviewCount(), tradeEntranceInfo.getEntryName()).LIZIZ();
    }
}
