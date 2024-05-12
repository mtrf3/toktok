package com.ss.android.ugc.aweme.poi.thirdparty;

import X.AbstractC60117Nib;
import X.AnonymousClass636;
import X.C16880lQ;
import X.C35918E7u;
import X.C39906FlO;
import X.C40087FoJ;
import X.C40342FsQ;
import X.C40343FsR;
import X.C60137Niv;
import X.C60160NjI;
import X.C62712d9;
import X.C79045V0n;
import X.InterfaceC60721NsL;
import X.NXF;
import X.OKG;
import Y.ACListenerS24S0100000_4;
import Y.ACListenerS30S0100000_10;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class PoiThirdPartyInterceptor implements IInterceptor {
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
        return TextUtils.equals(str, "poi_third_party");
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(final Context context, RouteIntent routeIntent) {
        Intent extra;
        String str;
        if (context == null || routeIntent == null || (extra = routeIntent.getExtra()) == null) {
            return false;
        }
        String decodeUrl = Uri.decode(C16880lQ.LLJJIJIIJIL(extra, "url"));
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(extra, "mob_extra");
        o.LJIIIIZZ(decodeUrl, "decodeUrl");
        C35918E7u.LIZIZ = LLJJIJIIJIL;
        String builder = UriProtector.parse("aweme://webview").buildUpon().appendQueryParameter("url", decodeUrl).appendQueryParameter("use_spark", "1").toString();
        o.LJIIIIZZ(builder, "parse(HOST_WEBVIEW).buil…)\n            .toString()");
        C40087FoJ c40087FoJ = new C40087FoJ();
        C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
        SparkContext sparkContext = new SparkContext();
        sparkContext.bid = "poi_third_party";
        sparkContext.LJJIJLIJ(builder);
        sparkContext.LJJIIJ("show_web_url", "1");
        Integer LJI = C79045V0n.LJI(R.attr.cl, context);
        if (LJI != null) {
            sparkContext.LJJIFFI(LJI.intValue(), "status_bar_bg_color");
        }
        if (AnonymousClass636.LJIILJJIL(context)) {
            str = "light";
        } else {
            str = "dark";
        }
        sparkContext.LJJIIJ("status_font_mode", str);
        sparkContext.LJJIJL(new AbstractC60117Nib(context) { // from class: X.9xy
            public final Context LJLIL;
            public C252709vu LJLILLLLZI;
            public final C9KF LJLJI;

            @Override // X.InterfaceC60844NuK
            public final void LJIIJJI(View.OnClickListener onClickListener) {
            }

            @Override // X.InterfaceC60844NuK
            public final void LJIIZILJ(EnumC60084Ni4 navBtnType) {
                o.LJIIIZ(navBtnType, "navBtnType");
            }

            @Override // X.InterfaceC60844NuK
            public final void LJJIJIIJI(int i) {
            }

            @Override // X.InterfaceC60844NuK
            public final void LJJIL(int i) {
            }

            @Override // X.InterfaceC60844NuK
            public final void LJJJ(boolean z) {
            }

            {
                o.LJIIIZ(context, "themeContext");
                this.LJLIL = context;
                this.LJLJI = new C9KF();
            }

            @Override // X.InterfaceC60844NuK
            public final View LJI(Context context2) {
                o.LJIIIZ(context2, "context");
                LinearLayout linearLayout = new LinearLayout(this.LJLIL);
                linearLayout.setOrientation(1);
                linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                C252709vu c252709vu = new C252709vu(this.LJLIL, null, 6);
                C235119Kp c235119Kp = new C235119Kp();
                C234529Ii c234529Ii = new C234529Ii();
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = R.raw.icon_x_mark;
                c2068389v.LJ = Integer.valueOf(R.attr.go);
                c234529Ii.LIZ(c2068389v);
                c234529Ii.LIZLLL = true;
                c234529Ii.LIZIZ = "close_all_btn";
                c235119Kp.LIZLLL(c234529Ii);
                C234529Ii c234529Ii2 = new C234529Ii();
                C2068389v c2068389v2 = new C2068389v();
                c2068389v2.LIZ = R.raw.icon_x_mark;
                c2068389v2.LJ = Integer.valueOf(R.attr.h0);
                c234529Ii2.LIZ(c2068389v2);
                c234529Ii2.LIZLLL = false;
                c235119Kp.LIZIZ(c234529Ii2);
                c235119Kp.LIZ(this.LJLJI);
                c252709vu.setNavActions(c235119Kp);
                c252709vu.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                this.LJLILLLLZI = c252709vu;
                View view = new View(this.LJLIL);
                view.setLayoutParams(new LinearLayout.LayoutParams(-1, AnonymousClass391.LIZ(0.5d)));
                Integer LJI2 = C79045V0n.LJI(R.attr.dz, this.LJLIL);
                if (LJI2 != null) {
                    view.setBackgroundColor(LJI2.intValue());
                }
                linearLayout.addView(this.LJLILLLLZI);
                linearLayout.addView(view);
                return linearLayout;
            }

            @Override // X.AbstractC60117Nib, X.InterfaceC60844NuK
            public final void LJIILJJIL(String subTitle) {
                o.LJIIIZ(subTitle, "subTitle");
                C9KF c9kf = this.LJLJI;
                c9kf.getClass();
                c9kf.LIZLLL = subTitle;
                C252709vu c252709vu = this.LJLILLLLZI;
                if (c252709vu != null) {
                    c252709vu.LJIILLIIL(c9kf);
                }
            }

            @Override // X.InterfaceC60844NuK
            public final void LJJII(ACListenerS30S0100000_10 aCListenerS30S0100000_10) {
                View LJI2;
                C252709vu c252709vu = this.LJLILLLLZI;
                if (c252709vu != null && (LJI2 = c252709vu.LJI("close_all_btn")) != null) {
                    C16880lQ.LJIIJ(new ACListenerS24S0100000_4(aCListenerS30S0100000_10, 1), LJI2);
                }
            }

            @Override // X.InterfaceC60844NuK
            public final void LJJIII(String title) {
                o.LJIIIZ(title, "title");
                C9KF c9kf = this.LJLJI;
                c9kf.getClass();
                c9kf.LIZJ = title;
                C252709vu c252709vu = this.LJLILLLLZI;
                if (c252709vu != null) {
                    c252709vu.LJIILLIIL(c9kf);
                }
            }
        });
        sparkContext.LJJIJIL(new C60160NjI(c40087FoJ));
        sparkContext.LJII(InterfaceC60721NsL.class, new NXF(context));
        sparkContext.LJJIJIIJI(c40087FoJ);
        sparkContext.LJJI(new C39906FlO());
        sparkContext.LJJ(new C60137Niv(c40087FoJ));
        OKG.LIZLLL(c40342FsQ, context, sparkContext);
        return true;
    }
}
