package X;

import Y.ACListenerS27S0100000_7;
import Y.IDCListenerS207S0100000_7;
import android.graphics.drawable.Drawable;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.GmS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42520GmS extends LinearLayout {
    public final InterfaceC42521GmT LJLIL;
    public String LJLILLLLZI;
    public final TuxTextView LJLJI;
    public final C71897SJp LJLJJI;

    public final String getDescText() {
        return this.LJLILLLLZI;
    }

    public final InterfaceC42521GmT getListener() {
        return this.LJLIL;
    }

    public final void setDescText(String value) {
        o.LJIIIZ(value, "value");
        this.LJLJI.setText(value);
        this.LJLILLLLZI = value;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42520GmS(C29S context, InterfaceC42521GmT listener) {
        super(context);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(listener, "listener");
        new LinkedHashMap();
        this.LJLIL = listener;
        int LIZJ = (int) KL2.LIZJ(context, 12.0f);
        int LIZJ2 = (int) KL2.LIZJ(context, 14.0f);
        int LIZJ3 = (int) KL2.LIZJ(context, 16.0f);
        Drawable LIZIZ = C04270Et.LIZIZ(context, R.drawable.ajc);
        this.LJLILLLLZI = "";
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setTuxFont(41);
        tuxTextView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.go, context));
        this.LJLJI = tuxTextView;
        C71897SJp c71897SJp = new C71897SJp(context, null, 6);
        c71897SJp.setClickable(false);
        c71897SJp.setSize(1);
        c71897SJp.setOnCheckedChangeListener(new IDCListenerS207S0100000_7(this, 11));
        this.LJLJJI = c71897SJp;
        setBackground(LIZIZ);
        setOrientation(0);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setPadding(LIZJ3, LIZJ2, LIZJ3, LIZJ2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMarginEnd(LIZJ);
        layoutParams.gravity = 8388627;
        layoutParams.weight = 1.0f;
        addView(tuxTextView, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 8388629;
        addView(c71897SJp, layoutParams2);
        setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS27S0100000_7(this, 170)));
    }
}
