package X;

import Y.ACListenerS35S0100000_15;
import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.ss.android.ugc.aweme.innerpush.ui.InnerPushPopupWindow;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Xws, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86482Xws extends FrameLayout {
    public final InnerPushPopupWindow LJLIL;
    public final ConstraintLayout LJLILLLLZI;
    public final FrameLayout LJLJI;
    public final FrameLayout LJLJJI;
    public final FrameLayout LJLJJL;
    public final FrameLayout LJLJJLL;
    public final FrameLayout LJLJL;
    public final LinearLayout LJLJLJ;
    public final C86472Xwi LJLJLLL;
    public final C86474Xwk LJLL;
    public final C86473Xwj LJLLI;
    public final C86476Xwm LJLLILLLL;
    public final C86475Xwl LJLLJ;

    public final void LIZJ() {
        LinearLayout linearLayout = this.LJLJLJ;
        int childCount = linearLayout.getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            o.LJIIIIZZ(linearLayout.getChildAt(i2), "getChildAt(i)");
            if (this.LJLLJ.getVisibility() == 0) {
                setPadding(getPaddingLeft(), 0, getPaddingRight(), getPaddingBottom());
            }
            if (this.LJLLILLLL.getVisibility() == 0) {
                setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), 0);
            }
        }
        View findViewById = this.LJLJLJ.findViewById(R.id.en8);
        if (findViewById != null) {
            if (this.LJLLI.getVisibility() == 8) {
                i = C7MY.LIZIZ(16);
            }
            findViewById.setPaddingRelative(findViewById.getPaddingStart(), findViewById.getPaddingTop(), i, findViewById.getPaddingBottom());
        }
    }

    public final void LIZ(C119904nC c119904nC) {
        int i = c119904nC.LIZ;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append("addAreaView area:");
                                LIZ.append(c119904nC.LIZ);
                                LIZ.append(" is unsupport");
                                C86478Xwo.LIZIZ("inner_push_platform", X1D.LIZIZ(LIZ));
                                return;
                            }
                            this.LJLJL.removeAllViews();
                            this.LJLJL.addView(c119904nC.LIZIZ);
                            return;
                        }
                        this.LJLJJLL.removeAllViews();
                        this.LJLJJLL.addView(c119904nC.LIZIZ);
                        return;
                    }
                    this.LJLJJL.removeAllViews();
                    this.LJLJJL.addView(c119904nC.LIZIZ);
                    return;
                }
                this.LJLJJI.removeAllViews();
                this.LJLJJI.addView(c119904nC.LIZIZ);
                return;
            }
            this.LJLJI.removeAllViews();
            this.LJLJI.addView(c119904nC.LIZIZ);
            return;
        }
        this.LJLILLLLZI.removeAllViews();
        this.LJLILLLLZI.addView(c119904nC.LIZIZ);
    }

    public final void LIZIZ(InnerPushMessage message) {
        o.LJIIIZ(message, "message");
        this.LJLJLLL.bindContent(message);
        this.LJLL.bindContent(message);
        this.LJLLI.bindContent(message);
        this.LJLLJ.bindContent(message);
        this.LJLLILLLL.bindContent(message);
        this.LJLLI.bindWindow(this.LJLIL);
        this.LJLJLLL.bindWindow(this.LJLIL);
        this.LJLL.bindWindow(this.LJLIL);
        FrameLayout frameLayout = this.LJLJI;
        frameLayout.removeAllViews();
        frameLayout.addView(this.LJLJLLL);
        C16880lQ.LJIILJJIL(frameLayout, new ACListenerS35S0100000_15(this, 172));
        FrameLayout frameLayout2 = this.LJLJJI;
        frameLayout2.removeAllViews();
        frameLayout2.addView(this.LJLL);
        C16880lQ.LJIILJJIL(frameLayout2, new ACListenerS35S0100000_15(this, 173));
        FrameLayout frameLayout3 = this.LJLJJL;
        frameLayout3.removeAllViews();
        frameLayout3.setVisibility(this.LJLLI.getVisibility());
        frameLayout3.addView(this.LJLLI);
        C16880lQ.LJIILJJIL(frameLayout3, new ACListenerS35S0100000_15(this, 174));
        FrameLayout frameLayout4 = this.LJLJJLL;
        frameLayout4.removeAllViews();
        frameLayout4.setVisibility(this.LJLLJ.getVisibility());
        frameLayout4.addView(this.LJLLJ);
        C16880lQ.LJIILJJIL(frameLayout4, new ACListenerS35S0100000_15(this, 175));
        FrameLayout frameLayout5 = this.LJLJL;
        frameLayout5.removeAllViews();
        frameLayout5.setVisibility(this.LJLLILLLL.getVisibility());
        frameLayout5.addView(this.LJLLILLLL);
        C16880lQ.LJIILJJIL(frameLayout5, new ACListenerS35S0100000_15(this, 176));
        InnerPushUITemplate uiTemplate = message.getUiTemplate();
        if (uiTemplate != null) {
            if (uiTemplate.getTopType() != 0) {
                this.LJLJJLL.setVisibility(0);
            }
            if (uiTemplate.getBottomType() != 0) {
                this.LJLJL.setVisibility(0);
            }
        }
        LIZJ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86482Xws(InnerPushPopupWindow innerPushPopupWindow, ActivityC45651qj activityC45651qj) {
        super(activityC45651qj, null, 0);
        View inflate;
        new LinkedHashMap();
        this.LJLIL = innerPushPopupWindow;
        Activity LJIJJ = C45804HyK.LJIJJ(activityC45651qj);
        if (C53334KwU.LIZIZ() && C16970lZ.LIZ(R.layout.baf, activityC45651qj) && LJIJJ != null) {
            inflate = C16970lZ.LIZJ(R.layout.baf, LJIJJ, this, true);
        } else {
            inflate = FrameLayout.inflate(activityC45651qj, R.layout.baf, this);
        }
        View findViewById = inflate.findViewById(R.id.en9);
        o.LJIIIIZZ(findViewById, "rootView.findViewById(R.…sh_middle_root_container)");
        this.LJLJLJ = (LinearLayout) findViewById;
        View findViewById2 = inflate.findViewById(R.id.en4);
        o.LJIIIIZZ(findViewById2, "rootView.findViewById(R.….inner_push_content_view)");
        this.LJLILLLLZI = (ConstraintLayout) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.en7);
        o.LJIIIIZZ(findViewById3, "rootView.findViewById(R.…nner_push_left_container)");
        this.LJLJI = (FrameLayout) findViewById3;
        View findViewById4 = inflate.findViewById(R.id.en8);
        o.LJIIIIZZ(findViewById4, "rootView.findViewById(R.…er_push_middle_container)");
        this.LJLJJI = (FrameLayout) findViewById4;
        View findViewById5 = inflate.findViewById(R.id.enc);
        o.LJIIIIZZ(findViewById5, "rootView.findViewById(R.…ner_push_right_container)");
        this.LJLJJL = (FrameLayout) findViewById5;
        View findViewById6 = inflate.findViewById(R.id.enh);
        o.LJIIIIZZ(findViewById6, "rootView.findViewById(R.…inner_push_top_container)");
        this.LJLJJLL = (FrameLayout) findViewById6;
        View findViewById7 = inflate.findViewById(R.id.en0);
        o.LJIIIIZZ(findViewById7, "rootView.findViewById(R.…er_push_bottom_container)");
        this.LJLJL = (FrameLayout) findViewById7;
        this.LJLJLLL = new C86472Xwi(activityC45651qj);
        this.LJLL = new C86474Xwk(activityC45651qj);
        this.LJLLI = new C86473Xwj(activityC45651qj);
        this.LJLLILLLL = new C86476Xwm(activityC45651qj);
        this.LJLLJ = new C86475Xwl(activityC45651qj);
    }
}
