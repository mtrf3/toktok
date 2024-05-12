package X;

import Y.ACListenerS24S0100000_4;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AS6 extends ConstraintLayout {
    public C26245ARt LJLIL;
    public final TextView LJLILLLLZI;
    public final ImageView LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AS6(Context context) {
        super(context);
        a1.LJFF(context, "context");
        View.inflate(getContext(), R.layout.abv, this);
        View findViewById = findViewById(R.id.eys);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.iv_back)");
        View findViewById2 = findViewById(R.id.f0h);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.iv_close)");
        this.LJLJI = (ImageView) findViewById2;
        this.LJLILLLLZI = (TextView) findViewById(R.id.text);
        C16880lQ.LJIILLIIL((ImageView) findViewById, new ACListenerS24S0100000_4(this, 251));
        setOnClickListener(new ViewOnClickListenerC13880ga(AS7.LJLIL));
    }

    public final void LJJLJLI(C26276ASy c26276ASy) {
        ASG asg = c26276ASy.LIZIZ;
        o.LJII(asg, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.ui.masklayer2.action.BackPrimaryAction");
        this.LJLIL = (C26245ARt) asg;
        TextView textView = this.LJLILLLLZI;
        if (textView == null) {
            return;
        }
        textView.setText(getContext().getString(c26276ASy.LIZ.LJLILLLLZI));
    }
}
