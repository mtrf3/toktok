package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.96V, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C96V extends LinearLayout implements View.OnClickListener {
    public final TextView LJLIL;
    public final TextView LJLILLLLZI;
    public final View LJLJI;
    public final View LJLJJI;
    public C96N LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C96V(Context context) {
        super(context, null, 0);
        a1.LJFF(context, "context");
        C16880lQ.LLLZIIL(R.layout.bgt, C16880lQ.LLZIL(context), this);
        View findViewById = findViewById(R.id.cr0);
        o.LJII(findViewById, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.ui.RemoteImageView");
        C62846OlW c62846OlW = (C62846OlW) findViewById;
        View findViewById2 = findViewById(R.id.cqx);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.edu_close)");
        View findViewById3 = findViewById(R.id.cr1);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.edu_title)");
        this.LJLIL = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.cqz);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.edu_content)");
        this.LJLILLLLZI = (TextView) findViewById4;
        View findViewById5 = findViewById(R.id.cqy);
        o.LJIIIIZZ(findViewById5, "findViewById(R.id.edu_container)");
        this.LJLJI = findViewById5;
        View findViewById6 = findViewById(R.id.h3w);
        o.LJIIIIZZ(findViewById6, "findViewById(R.id.notice_bg)");
        this.LJLJJI = findViewById6;
        C16880lQ.LJIILLIIL((ImageView) findViewById2, this);
        C16880lQ.LJIIJ(this, findViewById5);
        c62846OlW.setClickable(true);
        C16880lQ.LJJJJJL(c62846OlW, this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v) {
        o.LJIIIZ(v, "v");
        if (this.LJLJJL == null) {
            return;
        }
        if (v.getId() == R.id.cqx) {
            C96N c96n = this.LJLJJL;
            if (c96n != null) {
                c96n.LIZ();
                return;
            }
            return;
        }
        C96N c96n2 = this.LJLJJL;
        if (c96n2 == null) {
            return;
        }
        c96n2.LIZIZ();
    }

    public final void setContextText(CharSequence charSequence) {
        TextView textView = this.LJLILLLLZI;
        if (textView == null) {
            return;
        }
        textView.setText(charSequence);
    }

    public final void setOnInternalClickListener(C96N c96n) {
        this.LJLJJL = c96n;
    }

    public final void setTitleText(String str) {
        TextView textView = this.LJLIL;
        if (textView == null) {
            return;
        }
        textView.setText(str);
    }
}
