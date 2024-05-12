package X;

import Y.ACListenerS30S0100000_10;
import Y.AObserverS78S0100000_10;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.music.ui.MusicLandingPageViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import kotlin.jvm.internal.o;

/* renamed from: X.Nia, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60116Nia extends AbstractC60117Nib {
    public C252709vu LJLIL;
    public String LJLILLLLZI = "";
    public String LJLJI = "safe";
    public SparkContext LJLJJI;
    public SparkActivity LJLJJL;
    public MusicLandingPageViewModel LJLJJLL;
    public C9KF LJLJL;

    @Override // X.InterfaceC60844NuK
    public final void LJJIJIIJI(int i) {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r1.equals("not_secure") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if (r1.equals("protection") == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZJ() {
        /*
            r2 = this;
            java.lang.String r1 = r2.LJLJI
            int r0 = r1.hashCode()
            switch(r0) {
                case -1684858151: goto L37;
                case -1095865757: goto L2e;
                case 226612223: goto L18;
                case 336650556: goto Lc;
                default: goto L9;
            }
        L9:
            java.lang.String r1 = r2.LJLILLLLZI
        Lb:
            return r1
        Lc:
            java.lang.String r0 = "loading"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L15
            goto L9
        L15:
            java.lang.String r1 = ""
            goto Lb
        L18:
            java.lang.String r0 = "no_internet"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L21
            goto L9
        L21:
            r0 = 2131833174(0x7f113156, float:1.9299423E38)
            java.lang.String r1 = X.C86V.LJFF(r0)
            java.lang.String r0 = "{\n                getStr…no_network)\n            }"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            goto Lb
        L2e:
            java.lang.String r0 = "not_secure"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L40
            goto L9
        L37:
            java.lang.String r0 = "protection"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L40
            goto L9
        L40:
            r0 = 2131846637(0x7f1165ed, float:1.9326729E38)
            java.lang.String r1 = X.C86V.LJFF(r0)
            java.lang.String r0 = "{\n                getStr…_pageTitle)\n            }"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60116Nia.LIZJ():java.lang.String");
    }

    @Override // X.AbstractC60117Nib
    public final void LIZIZ(SparkContext sparkContext) {
        SparkActivity sparkActivity;
        this.LJLJJI = sparkContext;
        InterfaceC40159FpT LJIILL = sparkContext.LJIILL();
        if (LJIILL != null && (LJIILL instanceof SparkActivity)) {
            sparkActivity = (SparkActivity) LJIILL;
        } else {
            sparkActivity = null;
        }
        this.LJLJJL = sparkActivity;
        o.LJII(sparkActivity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        MusicLandingPageViewModel musicLandingPageViewModel = (MusicLandingPageViewModel) ViewModelProviders.of(sparkActivity).get(MusicLandingPageViewModel.class);
        this.LJLJJLL = musicLandingPageViewModel;
        if (musicLandingPageViewModel != null) {
            MutableLiveData mutableLiveData = musicLandingPageViewModel.LJLJJI;
            SparkActivity sparkActivity2 = this.LJLJJL;
            o.LJII(sparkActivity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            mutableLiveData.observe(sparkActivity2, new AObserverS78S0100000_10(this, 42));
            MusicLandingPageViewModel musicLandingPageViewModel2 = this.LJLJJLL;
            if (musicLandingPageViewModel2 != null) {
                MutableLiveData mutableLiveData2 = musicLandingPageViewModel2.LJLILLLLZI;
                SparkActivity sparkActivity3 = this.LJLJJL;
                o.LJII(sparkActivity3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                mutableLiveData2.observe(sparkActivity3, new AObserverS78S0100000_10(this, 43));
                return;
            }
            o.LJIJI("safeStatusViewModel");
            throw null;
        }
        o.LJIJI("safeStatusViewModel");
        throw null;
    }

    @Override // X.InterfaceC60844NuK
    public final View LJI(Context context) {
        o.LJIIIZ(context, "context");
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.bvk, C16880lQ.LLZIL(context), null);
        this.LJLIL = (C252709vu) LLLZIIL.findViewById(R.id.ffh);
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
        LIZJ3.LIZJ = R.raw.icon_ellipsis_horizontal;
        LIZJ3.LIZIZ = "more";
        LIZJ3.LJI = false;
        c235119Kp.LIZIZ(LIZJ3);
        C252709vu c252709vu = this.LJLIL;
        if (c252709vu != null) {
            c252709vu.setNavActions(c235119Kp);
            c252709vu.LJIILJJIL(true);
        }
        return LLLZIIL;
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
        C60119Nid.LIZJ = subTitle;
        try {
            String host = UriProtector.parse(subTitle).getHost();
            if (host != null) {
                subTitle = host;
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        if (this.LJLJL == null) {
            this.LJLJL = new C9KF();
        }
        if (subTitle.length() > 0) {
            String LJFF = C86V.LJFF(R.string.bqa);
            o.LJIIIIZZ(LJFF, "getString(R.string.ancho…webview_you_are_visiting)");
            subTitle = ujb.o.LJJJJZ(LJFF, "%@", subTitle, false);
        }
        C9KF c9kf = this.LJLJL;
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
        o.LJIIIZ(navBtnType, "navBtnType");
        int i = C60091NiB.LIZ[navBtnType.ordinal()];
        View view = null;
        if (i != 1) {
            if (i != 2) {
                C252709vu c252709vu = this.LJLIL;
                if (c252709vu != null) {
                    view = c252709vu.LJI("more");
                }
                KL2.LJIILLIIL(8, view);
            } else {
                C252709vu c252709vu2 = this.LJLIL;
                if (c252709vu2 != null) {
                    view = c252709vu2.LJI("more");
                }
                KL2.LJIILLIIL(0, view);
            }
        } else {
            C252709vu c252709vu3 = this.LJLIL;
            if (c252709vu3 != null) {
                view = c252709vu3.LJI("more");
            }
            KL2.LJIILLIIL(8, view);
        }
        C252709vu c252709vu4 = this.LJLIL;
        if (c252709vu4 != null && (LJI = c252709vu4.LJI("more")) != null) {
            C16880lQ.LJIIJ(new ACListenerS30S0100000_10(this, 123), LJI);
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
        this.LJLILLLLZI = title;
        if (this.LJLJL == null) {
            this.LJLJL = new C9KF();
        }
        C9KF c9kf = this.LJLJL;
        if (c9kf != null) {
            c9kf.LIZ(LIZJ());
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
}
