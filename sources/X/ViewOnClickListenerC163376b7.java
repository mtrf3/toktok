package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.6b7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ViewOnClickListenerC163376b7 extends LinearLayout implements View.OnClickListener {
    public final C62846OlW LJLIL;
    public final TextView LJLILLLLZI;
    public final ImageView LJLJI;
    public C6YD LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC163376b7(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.acn, this, true);
        setPadding(C17N.LJIILL(5.0d), getTopPaddingOffset(), C17N.LJIILL(5.0d), getBottomPaddingOffset());
        setBackgroundResource(R.drawable.bnm);
        setGravity(16);
        View findViewById = findViewById(R.id.ft5);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.link_icon)");
        this.LJLIL = (C62846OlW) findViewById;
        View findViewById2 = findViewById(R.id.ft1);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.link_desc)");
        this.LJLILLLLZI = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.ft9);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.link_naming_close)");
        this.LJLJI = (ImageView) findViewById3;
        setOnClickListener(new ViewOnClickListenerC13880ga(this));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v) {
        o.LJIIIZ(v, "v");
        C6YD c6yd = this.LJLJJI;
        if (c6yd != null) {
            o.LJI(c6yd);
            c6yd.LIZIZ();
        }
    }
}
