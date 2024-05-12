package X;

import Y.ACListenerS21S0100000_1;
import Y.ACListenerS30S0100000_10;
import android.content.Context;
import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.NdE, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59784NdE extends AbstractC60117Nib {
    public C252709vu LJLIL;
    public final String LJLILLLLZI = "more";
    public SparkContext LJLJI;
    public C9KF LJLJJI;

    @Override // X.InterfaceC60844NuK
    public final void LJJIJIIJI(int i) {
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZLLL() {
        /*
            r5 = this;
            X.Ch9 r1 = X.C31999Ch9.LIZJ
            com.bytedance.hybrid.spark.SparkContext r0 = r5.LJLJI
            java.lang.String r4 = "sparkContext"
            r3 = 0
            if (r0 == 0) goto L57
            java.lang.String r0 = r0.containerId
            r1.getClass()
            X.Nsz r1 = X.C31999Ch9.LIZIZ(r0)
            if (r1 == 0) goto L3b
            boolean r0 = r1 instanceof com.bytedance.lynx.hybrid.webkit.WebKitView
            if (r0 == 0) goto L39
        L18:
            if (r1 == 0) goto L3b
            android.webkit.WebView r1 = (android.webkit.WebView) r1
        L1c:
            if (r1 == 0) goto L24
            java.lang.String r2 = r1.getUrl()
            if (r2 != 0) goto L2a
        L24:
            com.bytedance.hybrid.spark.SparkContext r0 = r5.LJLJI
            if (r0 == 0) goto L53
            java.lang.String r2 = r0.url
        L2a:
            java.lang.String r0 = "webView?.url ?: sparkContext.getUrl()"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            r1 = 0
            java.lang.String r0 = "target="
            boolean r0 = ujb.s.LJJJLZIJ(r2, r0, r1)
            if (r0 == 0) goto L52
            goto L3d
        L39:
            r1 = r3
            goto L18
        L3b:
            r1 = r3
            goto L1c
        L3d:
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r2)     // Catch: java.lang.Exception -> L4a
            java.lang.String r0 = "target"
            java.lang.String r2 = com.bytedance.mt.protector.impl.UriProtector.getQueryParameter(r1, r0)     // Catch: java.lang.Exception -> L4a
            if (r2 != 0) goto L52
            goto L50
        L4a:
            r1 = move-exception
            java.lang.String r0 = "profile_bio_link"
            X.C221018lt.LIZLLL(r0, r1)
        L50:
            java.lang.String r2 = ""
        L52:
            return r2
        L53:
            kotlin.jvm.internal.o.LJIJI(r4)
            throw r3
        L57:
            kotlin.jvm.internal.o.LJIJI(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59784NdE.LIZLLL():java.lang.String");
    }

    public final String LJ() {
        SparkContext sparkContext = this.LJLJI;
        if (sparkContext != null) {
            String str = sparkContext.defaultParams.get("previous_page");
            if (str == null) {
                return "";
            }
            return str;
        }
        o.LJIJI("sparkContext");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        if (r6 != null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL() {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59784NdE.LJIILIIL():void");
    }

    @Override // X.AbstractC60117Nib
    public final void LIZIZ(SparkContext sparkContext) {
        this.LJLJI = sparkContext;
    }

    @Override // X.InterfaceC60844NuK
    public final View LJI(Context context) {
        o.LJIIIZ(context, "context");
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.c3n, C16880lQ.LLZIL(context), null);
        LLLZIIL.setMinimumHeight((int) context.getResources().getDimension(R.dimen.a8q));
        this.LJLIL = (C252709vu) LLLZIIL.findViewById(R.id.gwg);
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_arrow_left_ltr;
        LIZJ.LIZIZ = "back_btn";
        c235119Kp.LIZLLL(LIZJ);
        C234529Ii LIZJ2 = s1.LIZJ();
        LIZJ2.LIZJ = R.raw.icon_x_mark;
        LIZJ2.LIZIZ = "close_all_btn";
        LIZJ2.LJI = false;
        c235119Kp.LIZLLL(LIZJ2);
        C234529Ii LIZJ3 = s1.LIZJ();
        LIZJ3.LIZJ = R.raw.icon_flag;
        LIZJ3.LIZIZ = "report_normal";
        LIZJ3.LJI = false;
        c235119Kp.LIZIZ(LIZJ3);
        C234529Ii LIZJ4 = s1.LIZJ();
        LIZJ4.LIZJ = R.raw.icon_ellipsis_horizontal;
        LIZJ4.LIZLLL(this.LJLILLLLZI);
        LIZJ4.LJI = false;
        c235119Kp.LIZIZ(LIZJ4);
        C252709vu c252709vu = this.LJLIL;
        if (c252709vu != null) {
            c252709vu.setNavActions(c235119Kp);
        }
        return this.LJLIL;
    }

    @Override // X.InterfaceC60844NuK
    public final void LJIIJJI(View.OnClickListener onClickListener) {
        View LJI;
        C252709vu c252709vu = this.LJLIL;
        if (c252709vu != null && (LJI = c252709vu.LJI("back_btn")) != null) {
            C16880lQ.LJIIJ(onClickListener, LJI);
        }
    }

    @Override // X.AbstractC60117Nib, X.InterfaceC60844NuK
    public final void LJIILJJIL(String subTitle) {
        o.LJIIIZ(subTitle, "subTitle");
        if (this.LJLJJI == null) {
            this.LJLJJI = new C9KF();
        }
        C9KF c9kf = this.LJLJJI;
        if (c9kf != null) {
            c9kf.LIZLLL = subTitle;
            C252709vu c252709vu = this.LJLIL;
            if (c252709vu != null) {
                c252709vu.LJIILLIIL(c9kf);
            }
        }
    }

    @Override // X.InterfaceC60844NuK
    public final void LJIIZILJ(EnumC60084Ni4 navBtnType) {
        View LJI;
        View LJI2;
        o.LJIIIZ(navBtnType, "navBtnType");
        int i = C60085Ni5.LIZ[navBtnType.ordinal()];
        View view = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    C252709vu c252709vu = this.LJLIL;
                    if (c252709vu != null) {
                        view = c252709vu.LJI("report_normal");
                    }
                    KL2.LJIILLIIL(8, view);
                } else {
                    C252709vu c252709vu2 = this.LJLIL;
                    if (c252709vu2 != null) {
                        view = c252709vu2.LJI(this.LJLILLLLZI);
                    }
                    KL2.LJIILLIIL(0, view);
                }
            } else {
                SparkContext sparkContext = this.LJLJI;
                if (sparkContext != null) {
                    String queryParameter = UriProtector.getQueryParameter(UriProtector.parse(sparkContext.url), "need_report");
                    if (queryParameter == null) {
                        SparkContext sparkContext2 = this.LJLJI;
                        if (sparkContext2 != null) {
                            queryParameter = sparkContext2.defaultParams.get("need_report");
                        } else {
                            o.LJIJI("sparkContext");
                            throw null;
                        }
                    }
                    if (o.LJ(queryParameter, "true") || o.LJ(queryParameter, "1")) {
                        C252709vu c252709vu3 = this.LJLIL;
                        if (c252709vu3 != null) {
                            view = c252709vu3.LJI("report_normal");
                        }
                        KL2.LJIILLIIL(0, view);
                    } else {
                        C252709vu c252709vu4 = this.LJLIL;
                        if (c252709vu4 != null) {
                            view = c252709vu4.LJI("report_normal");
                        }
                        KL2.LJIILLIIL(8, view);
                    }
                } else {
                    o.LJIJI("sparkContext");
                    throw null;
                }
            }
        } else {
            C252709vu c252709vu5 = this.LJLIL;
            if (c252709vu5 != null) {
                view = c252709vu5.LJI("report_normal");
            }
            KL2.LJIILLIIL(8, view);
        }
        C252709vu c252709vu6 = this.LJLIL;
        if (c252709vu6 != null && (LJI2 = c252709vu6.LJI("report_normal")) != null) {
            C16880lQ.LJIIJ(new ACListenerS30S0100000_10(this, 191), LJI2);
        }
        C252709vu c252709vu7 = this.LJLIL;
        if (c252709vu7 != null && (LJI = c252709vu7.LJI(this.LJLILLLLZI)) != null) {
            C16880lQ.LJIIJ(new ACListenerS30S0100000_10(this, 192), LJI);
        }
    }

    @Override // X.AbstractC60117Nib, X.InterfaceC60844NuK
    public final void LJIJJ(boolean z) {
        if (z) {
            KL2.LJIILLIIL(0, this.LJLIL);
        } else {
            KL2.LJIILLIIL(8, this.LJLIL);
        }
    }

    @Override // X.InterfaceC60844NuK
    public final void LJJII(ACListenerS30S0100000_10 aCListenerS30S0100000_10) {
        View LJI;
        C252709vu c252709vu = this.LJLIL;
        if (c252709vu != null && (LJI = c252709vu.LJI("close_all_btn")) != null) {
            C16880lQ.LJIIJ(aCListenerS30S0100000_10, LJI);
        }
    }

    @Override // X.InterfaceC60844NuK
    public final void LJJIII(String title) {
        o.LJIIIZ(title, "title");
        if (this.LJLJJI == null) {
            this.LJLJJI = new C9KF();
        }
        C9KF c9kf = this.LJLJJI;
        if (c9kf != null) {
            c9kf.LIZJ = title;
            C252709vu c252709vu = this.LJLIL;
            if (c252709vu != null) {
                c252709vu.LJIILLIIL(c9kf);
            }
        }
    }

    @Override // X.InterfaceC60844NuK
    public final void LJJIL(int i) {
        C252709vu c252709vu = this.LJLIL;
        if (c252709vu != null) {
            c252709vu.setNavBackground(i);
        }
    }

    @Override // X.InterfaceC60844NuK
    public final void LJJJ(boolean z) {
        View view = null;
        if (z) {
            C252709vu c252709vu = this.LJLIL;
            if (c252709vu != null) {
                view = c252709vu.LJI("close_all_btn");
            }
            KL2.LJIILLIIL(0, view);
            return;
        }
        C252709vu c252709vu2 = this.LJLIL;
        if (c252709vu2 != null) {
            view = c252709vu2.LJI("close_all_btn");
        }
        KL2.LJIILLIIL(8, view);
    }

    public static C252659vp LIZJ(int i, int i2, InterfaceC65784Pro interfaceC65784Pro) {
        C252659vp LIZIZ = C49606JdS.LIZIZ(i, i2);
        LIZIZ.LJ = new ACListenerS21S0100000_1(new AqS176S0100000_10(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 246), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
        return LIZIZ;
    }
}
