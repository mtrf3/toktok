package X;

import Y.ACListenerS32S0100000_12;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ss.android.ugc.aweme.duet.model.DuetDetailModel;
import com.ss.android.ugc.aweme.utils.Au2S20S0100000_12;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.T8l, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74155T8l implements InterfaceC74150T8g {
    public final Context LIZIZ;
    public final InterfaceC65784Pro<String> LIZJ;
    public C62846OlW LIZLLL;
    public TextView LJ;
    public TextView LJFF;
    public ViewGroup LJI;
    public TextView LJII;
    public View LJIIIIZZ;

    @Override // X.InterfaceC74150T8g
    public final void LIZ(View rootView) {
        o.LJIIIZ(rootView, "rootView");
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(R.id.e3y);
        if (viewGroup != null) {
            View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LIZIZ), R.layout.cqr, viewGroup, true);
            this.LIZLLL = (C62846OlW) LLLLIILL.findViewById(R.id.cif);
            this.LJ = (TextView) LLLLIILL.findViewById(R.id.civ);
            this.LJFF = (TextView) LLLLIILL.findViewById(R.id.ciw);
            this.LJI = (ViewGroup) LLLLIILL.findViewById(R.id.g30);
            this.LJII = (TextView) LLLLIILL.findViewById(R.id.m5u);
            this.LJIIIIZZ = LLLLIILL.findViewById(R.id.cid);
        }
    }

    @Override // X.InterfaceC74150T8g
    public final void LIZIZ(DuetDetailModel duetDetailModel) {
        C78765Uvh.LJFF(this.LIZLLL, duetDetailModel.cover);
        TextView textView = this.LJ;
        if (textView != null) {
            textView.setText(duetDetailModel.pageTitle);
        }
        TextView textView2 = this.LJFF;
        if (textView2 != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(duetDetailModel.videoCount);
            LIZ.append(' ');
            textView2.setText(X1D.LIZIZ(LIZ));
        }
        C74153T8j c74153T8j = EnumC74154T8k.Companion;
        Integer num = duetDetailModel.remindType;
        c74153T8j.getClass();
        EnumC74154T8k LIZ2 = C74153T8j.LIZ(num);
        if (LIZ2 != null) {
            int i = 8;
            if (LIZ2 == EnumC74154T8k.UNKNOWN_REMIND_TYPE) {
                ViewGroup viewGroup = this.LJI;
                if (viewGroup != null) {
                    viewGroup.setVisibility(8);
                }
            } else {
                ViewGroup viewGroup2 = this.LJI;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(0);
                }
                TextView textView3 = this.LJII;
                if (textView3 != null) {
                    textView3.setText(this.LIZIZ.getString(LIZ2.getTextId()));
                }
                View view = this.LJIIIIZZ;
                if (view != null) {
                    if (LIZ2 == EnumC74154T8k.REMIND_SELF_SEE || LIZ2 == EnumC74154T8k.REMIND_FRIEND_SEE || LIZ2 == EnumC74154T8k.REMIND_ANYONE_SEE) {
                        i = 0;
                    }
                    view.setVisibility(i);
                }
            }
        }
        C62846OlW c62846OlW = this.LIZLLL;
        if (c62846OlW != null) {
            C16880lQ.LJJJJJL(c62846OlW, new ACListenerS32S0100000_12(this, 183));
        }
        View view2 = this.LJIIIIZZ;
        if (view2 != null) {
            C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 106), view2);
        }
    }

    public C74155T8l(ActivityC45651qj activityC45651qj, AqS162S0100000_12 aqS162S0100000_12) {
        this.LIZIZ = activityC45651qj;
        this.LIZJ = aqS162S0100000_12;
    }
}
