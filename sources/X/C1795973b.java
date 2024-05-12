package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.73b, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1795973b extends FrameLayout {
    public final C1797273o LJLIL;
    public final TuxTextView LJLILLLLZI;
    public final TuxIconView LJLJI;
    public final LinearLayout LJLJJI;
    public final C119804n2 LJLJJL;
    public boolean LJLJJLL;
    public C1796773j LJLJL;
    public boolean LJLJLJ;

    public final C119804n2 getFlowView() {
        return this.LJLJJL;
    }

    public final void LIZ(boolean z) {
        if (!this.LJLJLJ) {
            this.LJLILLLLZI.setText((CharSequence) null);
            C78886Uxe.LJJLIIIJILLIZJL(this.LJLJI);
            return;
        }
        if (z) {
            this.LJLILLLLZI.setText(getContext().getString(R.string.diw));
            C78886Uxe.LJJLIIIJILLIZJL(this.LJLJI);
            return;
        }
        C78886Uxe.LJJLIIIJJI(this.LJLJI);
        TuxTextView tuxTextView = this.LJLILLLLZI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('+');
        LIZ.append(this.LJLJJL.getChildCount() - this.LJLJJL.getFirstLineCount());
        LIZ.append(' ');
        LIZ.append(getContext().getString(R.string.i7q));
        tuxTextView.setText(X1D.LIZIZ(LIZ));
    }

    public final void setViewMoreVisible(boolean z) {
        this.LJLJLJ = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1795973b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = new C1797273o();
        this.LJLJJLL = true;
        this.LJLJLJ = true;
        FrameLayout.inflate(context, R.layout.qo, this);
        View findViewById = findViewById(R.id.kzz);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.tag_flow_layout)");
        C119804n2 c119804n2 = (C119804n2) findViewById;
        this.LJLJJL = c119804n2;
        c119804n2.setGravity(-1);
        c119804n2.setMaxTagLines(1);
        View findViewById2 = findViewById(R.id.d19);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.expand_anchor_tv)");
        this.LJLILLLLZI = (TuxTextView) findViewById2;
        View findViewById3 = findViewById(R.id.d18);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.expand_anchor_iv)");
        this.LJLJI = (TuxIconView) findViewById3;
        View findViewById4 = findViewById(R.id.d1h);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.expand_view)");
        this.LJLJJI = (LinearLayout) findViewById4;
    }
}
