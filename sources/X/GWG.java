package X;

import Y.ARunnableS13S0110000_7;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.PublishFailMsg;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes8.dex */
public final class GWG extends PopupWindow implements InterfaceC81305VvZ, GVB {
    public final ActivityC45651qj LJLIL;
    public final C41474GPm LJLILLLLZI;
    public final boolean LJLJI;
    public final PublishFailMsg LJLJJI;
    public final View LJLJJL;
    public RelativeLayout LJLJJLL;
    public C81302VvW LJLJL;
    public GWH LJLJLJ;
    public final boolean LJLJLLL;
    public boolean LJLL;

    @Override // X.InterfaceC81305VvZ
    public final void LIZ() {
    }

    @Override // X.InterfaceC81305VvZ
    public final void LIZIZ() {
        LIZJ(false, false);
    }

    @Override // X.GVB
    public final void LIZLLL() {
        if (this.LJLIL.isFinishing()) {
            return;
        }
        GWH gwh = this.LJLJLJ;
        if (gwh != null) {
            gwh.onShow();
        }
        C81302VvW c81302VvW = this.LJLJL;
        o.LJI(c81302VvW);
        c81302VvW.LIZIZ();
        try {
            C16880lQ.LLLFFI(this, this.LJLIL.getWindow().getDecorView());
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r1, X.C41958GdO.LJIIIZ()) == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJFF() {
        /*
            r3 = this;
            X.GPm r0 = r3.LJLILLLLZI
            com.ss.android.ugc.aweme.draft.model.AwemeDraft r1 = r0.LIZ
            boolean r0 = r3.LJLJI
            r2 = 0
            if (r0 == 0) goto L44
            boolean r0 = r1.LJIIJ()
            if (r0 != 0) goto L44
            boolean r0 = r1.LJIIIZ()
            if (r0 != 0) goto L44
            X.Ivu r0 = X.C2NU.LIZ     // Catch: java.lang.Exception -> L44
            boolean r0 = r0.LIZIZ()     // Catch: java.lang.Exception -> L44
            if (r0 == 0) goto L44
            X.Ol8 r0 = X.C41792Gai.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L44
            java.lang.String r1 = r1.LIZJ()
            X.HEe r0 = X.C60903NvH.LJIIJJI()
            X.6aW r0 = r0.getPublishService()
            r0.LJIILIIL()
            java.lang.String r0 = X.C41958GdO.LJIIIZ()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L4e
        L44:
            com.ss.android.ugc.aweme.shortvideo.PublishFailMsg r0 = r3.LJLJJI
            java.lang.String r0 = r0.publishFailedString
            boolean r0 = X.C78685UuP.LJJJZ(r0)
            if (r0 == 0) goto L4f
        L4e:
            r2 = 1
        L4f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GWG.LJFF():boolean");
    }

    public final int LJ() {
        if (LJFF()) {
            return C47959Irz.LIZJ(8, C63081OpJ.LJJJJLI(C5L7.LIZ()));
        }
        return C63081OpJ.LJJJJLI(C5L7.LIZ());
    }

    @Override // X.GVB
    public final ActivityC45651qj getActivity() {
        return this.LJLIL;
    }

    @Override // X.GVB
    public final void setText(String str) {
        GWH gwh = this.LJLJLJ;
        if (gwh != null) {
            gwh.setText(str);
        }
    }

    @Override // X.GVB
    public final void setVisibility(boolean z) {
        this.LJLJJL.post(new ARunnableS13S0110000_7(this, z, 0));
    }

    @Override // X.GVB
    public final void LIZJ(boolean z, boolean z2) {
        GVX.LJI = false;
        if (!this.LJLJLLL && !this.LJLL && !z && !z2) {
            C268713r.LIZ().LIZ(C61878OQg.INSTANCE);
        }
        if (isShowing() && !this.LJLIL.isFinishing()) {
            C81302VvW c81302VvW = this.LJLJL;
            o.LJI(c81302VvW);
            if (c81302VvW.hasWindowFocus()) {
                C81302VvW c81302VvW2 = this.LJLJL;
                o.LJI(c81302VvW2);
                c81302VvW2.LIZ(0.0f, true);
            }
        }
        GWH gwh = this.LJLJLJ;
        if (gwh != null) {
            gwh.LIZ(z, false);
        }
        try {
            dismiss();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GWG(ActivityC45651qj mFragmentActivity, C41474GPm c41474GPm, boolean z, boolean z2, PublishFailMsg publishFailMsg) {
        super(mFragmentActivity);
        int i;
        GWH c41641GVx;
        o.LJIIIZ(mFragmentActivity, "mFragmentActivity");
        o.LJIIIZ(publishFailMsg, "publishFailMsg");
        this.LJLIL = mFragmentActivity;
        this.LJLILLLLZI = c41474GPm;
        this.LJLJI = z2;
        this.LJLJJI = publishFailMsg;
        LayoutInflater layoutInflater = mFragmentActivity.getLayoutInflater();
        o.LJIIIIZZ(layoutInflater, "mFragmentActivity.layoutInflater");
        C5L7.LIZIZ();
        boolean LJ = a.LJ().LJ(1);
        this.LJLJLLL = LJ;
        if (LJFF()) {
            i = R.layout.bo4;
        } else if (LJ) {
            i = R.layout.bo0;
        } else {
            i = R.layout.bo3;
        }
        View LLLZIIL = C16880lQ.LLLZIIL(i, layoutInflater, null);
        o.LJIIIIZZ(LLLZIIL, "inflater.inflate(getLayoutResource(), null)");
        this.LJLJJL = LLLZIIL;
        View findViewById = LLLZIIL.findViewById(R.id.j5n);
        o.LJII(findViewById, "null cannot be cast to non-null type android.widget.RelativeLayout");
        this.LJLJJLL = (RelativeLayout) findViewById;
        View findViewById2 = LLLZIIL.findViewById(R.id.ig1);
        o.LJII(findViewById2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.ui.PullUpDismissLayout");
        C81302VvW c81302VvW = (C81302VvW) findViewById2;
        this.LJLJL = c81302VvW;
        c81302VvW.LJLJI = this.LJLJJLL;
        c81302VvW.setPullUpListener(this);
        if (LJ) {
            AwemeDraft awemeDraft = c41474GPm.LIZ;
            RelativeLayout relativeLayout = this.LJLJJLL;
            if (relativeLayout != null) {
                c41641GVx = new GW6(mFragmentActivity, awemeDraft, this, relativeLayout);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            RelativeLayout relativeLayout2 = this.LJLJJLL;
            if (relativeLayout2 != null) {
                c41641GVx = new C41641GVx(mFragmentActivity, c41474GPm, this, relativeLayout2, z, publishFailMsg);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        this.LJLJLJ = c41641GVx;
        C81302VvW c81302VvW2 = this.LJLJL;
        if (c81302VvW2 != null) {
            c81302VvW2.setWindowHeight(LJ());
        }
        RelativeLayout relativeLayout3 = this.LJLJJLL;
        o.LJI(relativeLayout3);
        ViewGroup.LayoutParams layoutParams = relativeLayout3.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((FrameLayout.LayoutParams) layoutParams).topMargin = LJ();
        setBackgroundDrawable(new ColorDrawable(0));
        setClippingEnabled(false);
        setContentView(LLLZIIL);
        setWidth(KL2.LJIIJJI(C5L7.LIZ()));
        setHeight(-2);
        setAnimationStyle(R.style.a_l);
        GVX.LJI = true;
    }
}
