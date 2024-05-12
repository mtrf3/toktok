package X;

import Y.ACListenerS30S0100000_10;
import Y.ACListenerS45S0200000_10;
import android.content.Context;
import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import kotlin.jvm.internal.o;

/* renamed from: X.NbX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59679NbX extends AbstractC60117Nib {
    public C252709vu LJLIL;
    public View LJLILLLLZI;
    public final String LJLJI = "back_btn";
    public final String LJLJJI = "close_all_btn";
    public final String LJLJJL = "report_normal";
    public final String LJLJJLL = "more";
    public final String LJLJL = "share";
    public SparkContext LJLJLJ;
    public C9KF LJLJLLL;

    @Override // X.InterfaceC60844NuK
    public final void LJJIJIIJI(int i) {
    }

    @Override // X.AbstractC60117Nib
    public final void LIZIZ(SparkContext sparkContext) {
        this.LJLJLJ = sparkContext;
    }

    @Override // X.InterfaceC60844NuK
    public final View LJI(Context context) {
        String str;
        int i;
        o.LJIIIZ(context, "context");
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.cnd, C16880lQ.LLZIL(context), null);
        LLLZIIL.setMinimumHeight((int) context.getResources().getDimension(R.dimen.a8q));
        this.LJLIL = (C252709vu) LLLZIIL.findViewById(R.id.gwg);
        this.LJLILLLLZI = LLLZIIL.findViewById(R.id.frt);
        SparkContext sparkContext = this.LJLJLJ;
        if (sparkContext == null || (str = sparkContext.containerId) == null) {
            str = "";
        }
        java.util.Map<String, String> LIZJ = C75252xN.LIZJ(str);
        View view = this.LJLILLLLZI;
        if (view != null) {
            if (o.LJ(LIZJ.get("show_separate_line"), "1")) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ2 = s1.LIZJ();
        LIZJ2.LIZJ = R.raw.icon_arrow_left_ltr;
        LIZJ2.LIZLLL(this.LJLJI);
        c235119Kp.LIZLLL(LIZJ2);
        C234529Ii LIZJ3 = s1.LIZJ();
        LIZJ3.LIZJ = R.raw.icon_x_mark;
        LIZJ3.LIZLLL(this.LJLJJI);
        LIZJ3.LJI = false;
        c235119Kp.LIZLLL(LIZJ3);
        C234529Ii LIZJ4 = s1.LIZJ();
        LIZJ4.LIZJ = R.raw.icon_flag;
        LIZJ4.LIZLLL(this.LJLJJL);
        LIZJ4.LJI = false;
        c235119Kp.LIZIZ(LIZJ4);
        C234529Ii LIZJ5 = s1.LIZJ();
        LIZJ5.LIZJ = R.raw.icon_ellipsis_horizontal;
        LIZJ5.LIZLLL(this.LJLJJLL);
        LIZJ5.LJI = false;
        c235119Kp.LIZIZ(LIZJ5);
        C234529Ii LIZJ6 = s1.LIZJ();
        LIZJ6.LIZJ = R.raw.icon_arrow_turn_up_right;
        LIZJ6.LIZLLL(this.LJLJL);
        LIZJ6.LJI = false;
        c235119Kp.LIZIZ(LIZJ6);
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
        if (c252709vu != null && (LJI = c252709vu.LJI(this.LJLJI)) != null) {
            C16880lQ.LJIIJ(onClickListener, LJI);
        }
    }

    @Override // X.AbstractC60117Nib, X.InterfaceC60844NuK
    public final void LJIILJJIL(String subTitle) {
        o.LJIIIZ(subTitle, "subTitle");
        if (this.LJLJLLL == null) {
            this.LJLJLLL = new C9KF();
        }
        C9KF c9kf = this.LJLJLLL;
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
        String str;
        boolean z;
        View LJI;
        View LJI2;
        View LJI3;
        o.LJIIIZ(navBtnType, "navBtnType");
        int i = C60083Ni3.LIZ[navBtnType.ordinal()];
        boolean z2 = true;
        View view = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        C252709vu c252709vu = this.LJLIL;
                        if (c252709vu != null) {
                            view = c252709vu.LJI(this.LJLJJL);
                        }
                        KL2.LJIILLIIL(8, view);
                        return;
                    }
                    C252709vu c252709vu2 = this.LJLIL;
                    if (c252709vu2 != null) {
                        view = c252709vu2.LJI(this.LJLJJLL);
                    }
                    KL2.LJIILLIIL(0, view);
                    return;
                }
                C252709vu c252709vu3 = this.LJLIL;
                if (c252709vu3 != null) {
                    view = c252709vu3.LJI(this.LJLJL);
                }
                KL2.LJIILLIIL(0, view);
                C252709vu c252709vu4 = this.LJLIL;
                if (c252709vu4 == null || (LJI3 = c252709vu4.LJI(this.LJLJL)) == null) {
                    return;
                }
                C16880lQ.LJIIJ(new ACListenerS30S0100000_10(this, 154), LJI3);
                return;
            }
            SparkContext sparkContext = this.LJLJLJ;
            if (sparkContext == null || (str = sparkContext.containerId) == null) {
                str = "";
            }
            java.util.Map<String, String> LIZJ = C75252xN.LIZJ(str);
            String str2 = LIZJ.get("aweme_id");
            String str3 = LIZJ.get("legacy_report");
            String str4 = LIZJ.get("report_type");
            Aweme o6 = AwemeService.LIZ().o6(str2);
            if (o.LJ(LIZJ.get("show_report"), "1") && o6 != null) {
                z = true;
            } else {
                z = false;
            }
            if (!o.LJ(str3, "1")) {
                z2 = z;
            }
            if (C78685UuP.LJJJZ(str4) || !z2) {
                C252709vu c252709vu5 = this.LJLIL;
                if (c252709vu5 != null && (LJI2 = c252709vu5.LJI(this.LJLJJL)) != null) {
                    C16880lQ.LJIIJ(new ACListenerS30S0100000_10(this, 153), LJI2);
                }
            } else {
                C252709vu c252709vu6 = this.LJLIL;
                if (c252709vu6 != null && (LJI = c252709vu6.LJI(this.LJLJJL)) != null) {
                    C16880lQ.LJIIJ(new ACListenerS45S0200000_10(this, o6, 29), LJI);
                }
            }
            C252709vu c252709vu7 = this.LJLIL;
            if (c252709vu7 != null) {
                view = c252709vu7.LJI(this.LJLJJL);
            }
            KL2.LJIILLIIL(0, view);
            return;
        }
        C252709vu c252709vu8 = this.LJLIL;
        if (c252709vu8 != null) {
            view = c252709vu8.LJI(this.LJLJJL);
        }
        KL2.LJIILLIIL(8, view);
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
        if (c252709vu != null && (LJI = c252709vu.LJI(this.LJLJJI)) != null) {
            C16880lQ.LJIIJ(new ACListenerS45S0200000_10(aCListenerS30S0100000_10, this, 30), LJI);
        }
    }

    @Override // X.InterfaceC60844NuK
    public final void LJJIII(String title) {
        o.LJIIIZ(title, "title");
        if (this.LJLJLLL == null) {
            this.LJLJLLL = new C9KF();
        }
        C9KF c9kf = this.LJLJLLL;
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
                view = c252709vu.LJI(this.LJLJJI);
            }
            KL2.LJIILLIIL(0, view);
            return;
        }
        C252709vu c252709vu2 = this.LJLIL;
        if (c252709vu2 != null) {
            view = c252709vu2.LJI(this.LJLJJI);
        }
        KL2.LJIILLIIL(8, view);
    }
}
