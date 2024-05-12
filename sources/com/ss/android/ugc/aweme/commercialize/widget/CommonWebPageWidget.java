package com.ss.android.ugc.aweme.commercialize.widget;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C169696lJ;
import X.C207668Da;
import X.C227768wm;
import X.C45804HyK;
import X.C59517NXl;
import X.C59518NXm;
import X.C59528NXw;
import X.C59529NXx;
import X.C59530NXy;
import X.C62712d9;
import X.C63081OpJ;
import X.C78857UxB;
import X.FMX;
import X.IWF;
import X.NTH;
import X.NWW;
import X.NY0;
import X.NYL;
import X.NYM;
import X.NZQ;
import X.O6R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.jvm.internal.AqS157S0200000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class CommonWebPageWidget extends AbsAdFeedWidget {
    public static boolean LJLLLLLL;
    public C59518NXm LJLLI;
    public long LJLLILLLL;
    public final C59517NXl LJLLJ = new C59517NXl(this);
    public final NY0 LJLLL = new NY0();
    public final NYM LJLLLL = new NYM();

    @Override // com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget
    public final void LJIILJJIL() {
        super.LJIILJJIL();
        DataCenter dataCenter = this.LJLJJI;
        if (dataCenter != null) {
            dataCenter.iv0("ad_feed_on_page_selected", this, false);
            dataCenter.iv0("ad_feed_on_page_unselected", this, false);
            dataCenter.iv0("ad_video_on_resume_play", this, false);
            dataCenter.iv0("video_params", this, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onCreate() {
        super.onCreate();
        NYL.LIZ = new WeakReference<>(this);
        if (!NYL.LIZIZ) {
            SmartRouter.addInterceptor(new IInterceptor() { // from class: com.ss.android.ugc.aweme.commercialize.widget.OverlaySchemaProxy$setCurrentWidget$1
                @Override // com.bytedance.router.interceptor.IInterceptor
                public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
                    return C62712d9.LIZ(this, routeIntent);
                }

                @Override // com.bytedance.router.interceptor.IInterceptor
                public final boolean matchInterceptRules(RouteIntent routeIntent) {
                    String str;
                    if (routeIntent != null) {
                        str = routeIntent.getHost();
                    } else {
                        str = null;
                    }
                    if (o.LJ(str, "overlay_webview") && NYL.LIZ.get() != null) {
                        return true;
                    }
                    return false;
                }

                @Override // com.bytedance.router.interceptor.IInterceptor
                public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
                    String str;
                    String str2;
                    String str3;
                    Activity LJIJJ;
                    C59518NXm LIZ;
                    ActivityC45651qj mo49getActivity;
                    Fragment fragment;
                    Context context2;
                    Intent extra;
                    Bundle bundle = null;
                    if (routeIntent != null) {
                        str = routeIntent.getOriginUrl();
                    } else {
                        str = null;
                    }
                    if (!C78857UxB.LJJJIL(str)) {
                        str = null;
                    }
                    if (str == null) {
                        return false;
                    }
                    String queryParameter = UriProtector.getQueryParameter(UriProtector.parse(str), "url");
                    if (!C78857UxB.LJJJIL(queryParameter) || queryParameter == null) {
                        return false;
                    }
                    HashMap hashMap = new HashMap();
                    if (routeIntent != null && (extra = routeIntent.getExtra()) != null) {
                        bundle = C16880lQ.LLJJIJI(extra);
                    }
                    if (bundle != null) {
                        for (String queryKey : bundle.keySet()) {
                            o.LJIIIIZZ(queryKey, "queryKey");
                            String string = bundle.getString(queryKey);
                            if (string == null) {
                                string = "";
                            }
                            hashMap.put(queryKey, string);
                        }
                    }
                    CommonWebPageWidget commonWebPageWidget = NYL.LIZ.get();
                    if (commonWebPageWidget != null) {
                        String str4 = commonWebPageWidget.LJLL;
                        if (str4 == null) {
                            str4 = "";
                        }
                        hashMap.put("enter_from", str4);
                        Aweme aweme = commonWebPageWidget.LJLJLJ;
                        if (aweme == null || (str2 = aweme.getAid()) == null) {
                            str2 = "";
                        }
                        hashMap.put("group_id", str2);
                        Aweme aweme2 = commonWebPageWidget.LJLJLJ;
                        if (aweme2 == null || (str3 = aweme2.getAuthorUid()) == null) {
                            str3 = "";
                        }
                        hashMap.put("author_id", str3);
                        hashMap.put("music_id", String.valueOf(C227768wm.LJIIJ(commonWebPageWidget.LJLJLJ)));
                        Fragment fragment2 = commonWebPageWidget.LJLJLLL;
                        if (fragment2 != null && (mo49getActivity = fragment2.mo49getActivity()) != null && (fragment = commonWebPageWidget.LJLJLLL) != null && (context2 = fragment.getContext()) != null) {
                            NTH nth = new NTH();
                            nth.LIZ = queryParameter;
                            nth.LJFF = commonWebPageWidget.LJLJLLL;
                            nth.LIZIZ = O6R.LJJIIJZLJL(C63081OpJ.LJJJJLI(context2));
                            nth.LIZJ = "";
                            nth.LIZLLL = new Bundle();
                            NWW LIZ2 = nth.LIZ();
                            C59517NXl c59517NXl = commonWebPageWidget.LJLLJ;
                            NYM nym = commonWebPageWidget.LJLLLL;
                            C59518NXm LIZ3 = C59528NXw.LIZ(mo49getActivity);
                            if (LIZ3 == null) {
                                LIZ3 = new C59518NXm(mo49getActivity);
                                LIZ3.setId(R.id.bq6);
                                LIZ3.setParams(LIZ2);
                                LIZ3.setMBehaviorCallback(c59517NXl);
                                LIZ3.setKeyDownCallBack(nym);
                                FrameLayout LIZIZ = C59528NXw.LIZIZ(mo49getActivity);
                                if (LIZIZ != null) {
                                    LIZIZ.addView(LIZ3);
                                }
                            }
                            commonWebPageWidget.LJLLI = LIZ3;
                            LIZ3.setTitleBarCallback(commonWebPageWidget.LJLLL);
                        }
                        C59530NXy c59530NXy = new C59530NXy();
                        c59530NXy.LIZ = context;
                        c59530NXy.LIZIZ = queryParameter;
                        c59530NXy.LIZJ.putAll(hashMap);
                        C59529NXx c59529NXx = new C59529NXx(c59530NXy.LIZ, c59530NXy.LIZIZ, c59530NXy.LIZJ);
                        Context context3 = c59529NXx.LIZ;
                        if (context3 == null || (LJIJJ = C45804HyK.LJIJJ(context3)) == null || (LIZ = C59528NXw.LIZ(LJIJJ)) == null || LIZ.LIZLLL()) {
                            return true;
                        }
                        AqS157S0200000_10 aqS157S0200000_10 = new AqS157S0200000_10(LIZ, c59529NXx, 9);
                        if (LIZ.LIZIZ(R.id.hfe) == null) {
                            LIZ.LJLJLJ = aqS157S0200000_10;
                            return true;
                        }
                        aqS157S0200000_10.invoke();
                        return true;
                    }
                    return true;
                }
            });
            NYL.LIZIZ = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onPause() {
        long currentTimeMillis = System.currentTimeMillis() - this.LJLLILLLL;
        if (this.LJLLI != null) {
            FMX.LJIIL("h5_stay_time", C169696lJ.LJ(currentTimeMillis, "duration").LIZ);
        }
        super.onPause();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onResume() {
        this.LJLLILLLL = System.currentTimeMillis();
        super.onResume();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget
    /* renamed from: LJIILL */
    public final void onChanged(C207668Da c207668Da) {
        String str;
        Fragment fragment;
        ActivityC45651qj mo49getActivity;
        Fragment fragment2;
        ActivityC45651qj mo49getActivity2;
        C59518NXm LIZ;
        super.onChanged(c207668Da);
        if (c207668Da != null && (str = c207668Da.LIZ) != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1540531799) {
                if (hashCode != 2040441990 || !str.equals("ad_video_on_resume_play") || this.LJLLI == null || (fragment2 = this.LJLJLLL) == null || (mo49getActivity2 = fragment2.mo49getActivity()) == null || (LIZ = C59528NXw.LIZ(mo49getActivity2)) == null || !LIZ.LIZLLL() || !IWF.LJJLIIIIJ().isPlaying()) {
                    return;
                }
                IWF.LJJLIIIIJ().LJIILJJIL();
                LJLLLLLL = true;
                return;
            }
            if (!str.equals("ad_feed_on_page_unselected") || this.LJLLI == null || (fragment = this.LJLJLLL) == null || (mo49getActivity = fragment.mo49getActivity()) == null) {
                return;
            }
            C59518NXm LIZ2 = C59528NXw.LIZ(mo49getActivity);
            if (LIZ2 != null) {
                NZQ pop_up_web_page_webview = (NZQ) LIZ2.LIZIZ(R.id.hxh);
                o.LJIIIIZZ(pop_up_web_page_webview, "pop_up_web_page_webview");
                NZQ.LJIJI(pop_up_web_page_webview, "about:blank", false, null, 14);
                LIZ2.LJLJLLL.LIZJ();
                FrameLayout LIZIZ = C59528NXw.LIZIZ(mo49getActivity);
                if (LIZIZ != null) {
                    C16880lQ.LJLLLL(LIZ2, LIZIZ);
                }
            }
            this.LJLLI = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget, androidx.lifecycle.Observer
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        onChanged((C207668Da) obj);
    }
}
