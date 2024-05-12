package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T3B extends TK7 {
    public final TextView LJLJJL;
    public final TextView LJLJJLL;
    public final Space LJLJL;
    public final Space LJLJLJ;

    @Override // X.TK7
    public final void LIZLLL() {
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        OSZ LJJI = C78596Usy.LJJI(context);
        String str = (String) LJJI.getFirst();
        String str2 = (String) LJJI.getSecond();
        this.LJLJJL.setText(str);
        this.LJLJJLL.setText(str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T3B(Context context) {
        super(context, null, 0);
        o.LJIIIZ(context, "context");
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.crq, this, true);
        View findViewById = findViewById(R.id.md6);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.tv_panel_error_title)");
        this.LJLJJL = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.md5);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.tv_panel_error_subtitle)");
        this.LJLJJLL = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.k8i);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.space_top)");
        this.LJLJL = (Space) findViewById3;
        View findViewById4 = findViewById(R.id.k87);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.space_bottom)");
        this.LJLJLJ = (Space) findViewById4;
    }

    public final void setVerticalAlign(float f) {
        ViewGroup.LayoutParams layoutParams = this.LJLJL.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = null;
        if (!(layoutParams instanceof LinearLayout.LayoutParams)) {
            layoutParams = null;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams;
        if (layoutParams3 != null) {
            layoutParams3.weight = 1.0f;
        }
        ViewGroup.LayoutParams layoutParams4 = this.LJLJLJ.getLayoutParams();
        if (layoutParams4 instanceof LinearLayout.LayoutParams) {
            layoutParams2 = layoutParams4;
        }
        LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) layoutParams2;
        if (layoutParams5 != null) {
            layoutParams5.weight = f;
        }
        requestLayout();
    }
}
