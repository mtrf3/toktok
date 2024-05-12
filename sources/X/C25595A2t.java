package X;

import Y.ACListenerS24S0100000_4;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.A2t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25595A2t extends LinearLayout {
    public final TuxTextView LJLIL;
    public final TuxIconView LJLILLLLZI;
    public final TuxIconView LJLJI;
    public final TuxTextView LJLJJI;
    public final View LJLJJL;
    public View.OnClickListener LJLJJLL;

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.LJLJJLL = onClickListener;
    }

    public final void setStartIconRes(int i) {
        this.LJLJI.setIconRes(i);
    }

    public final void setSubtitle(String subtitle) {
        o.LJIIIZ(subtitle, "subtitle");
        this.LJLJJI.setText(subtitle);
    }

    public final void setTitle(String title) {
        o.LJIIIZ(title, "title");
        this.LJLIL.setText(title);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25595A2t(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.aiq, this, true);
        setOrientation(1);
        View findViewById = findViewById(R.id.lai);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.title_text)");
        this.LJLIL = (TuxTextView) findViewById;
        View findViewById2 = findViewById(R.id.l_t);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.title_expand_icon)");
        this.LJLILLLLZI = (TuxIconView) findViewById2;
        View findViewById3 = findViewById(R.id.lag);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.title_start_icon)");
        this.LJLJI = (TuxIconView) findViewById3;
        View findViewById4 = findViewById(R.id.ks9);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.subtitle_text)");
        this.LJLJJI = (TuxTextView) findViewById4;
        View findViewById5 = findViewById(R.id.l_j);
        o.LJIIIIZZ(findViewById5, "findViewById(R.id.title_container)");
        this.LJLJJL = findViewById5;
        C16880lQ.LJIIJ(new ACListenerS24S0100000_4(this, 211), findViewById5);
    }
}
