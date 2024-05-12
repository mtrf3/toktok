package X;

import Y.ACListenerS21S0100000_1;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.text.Html;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.question.QuestionDetailFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.4jA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C117404jA extends PopupWindow {
    public final InterfaceC117414jB LIZ;
    public final View LIZIZ;
    public final Context LIZJ;
    public final View LIZLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C117404jA(ActivityC45651qj activityC45651qj, View parent, QuestionDetailFragment questionDetailFragment) {
        super(activityC45651qj);
        String str;
        String string;
        String LJJJJZ;
        o.LJIIIZ(parent, "parent");
        this.LIZ = questionDetailFragment;
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.c_d, C16880lQ.LLZIL(activityC45651qj), null);
        this.LIZIZ = LLLZIIL;
        this.LIZJ = activityC45651qj;
        this.LIZLLL = parent;
        setContentView(LLLZIIL);
        setWidth(C63081OpJ.LJJJJL(activityC45651qj) - (((int) KL2.LIZJ(activityC45651qj, 12.0f)) * 2));
        setHeight(-2);
        setTouchable(true);
        setFocusable(false);
        setOutsideTouchable(false);
        setAnimationStyle(R.style.a_8);
        View findViewById = LLLZIIL.findViewById(R.id.c2h);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.d5);
        c110614Vt.LIZJ = C61328O5c.LIZJ(4);
        findViewById.setBackground(c110614Vt.LIZ(activityC45651qj));
        Resources LIZJ = FKM.LIZJ();
        if (LIZJ != null && (string = LIZJ.getString(R.string.ppp)) != null && (LJJJJZ = ujb.o.LJJJJZ(string, "[", "<b><front>", false)) != null) {
            str = ujb.o.LJJJJZ(LJJJJZ, "]", "</front></b>", false);
        } else {
            str = "";
        }
        if (Build.VERSION.SDK_INT >= 24) {
            ((TextView) LLLZIIL.findViewById(R.id.c2j)).setText(Html.fromHtml(str, 63));
        } else {
            ((TextView) LLLZIIL.findViewById(R.id.c2j)).setText(Html.fromHtml(str));
        }
        C16880lQ.LJJJJI((TuxTextView) LLLZIIL.findViewById(R.id.c2j), new ACListenerS21S0100000_1(this, 209));
        setBackgroundDrawable(new ColorDrawable(0));
    }
}
