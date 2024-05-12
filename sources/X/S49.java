package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S49 extends FrameLayout {
    public final ConstraintLayout LJLIL;
    public final SmartImageView LJLILLLLZI;
    public final SG3 LJLJI;
    public final TuxTextView LJLJJI;
    public final C71897SJp LJLJJL;
    public final TuxTextView LJLJJLL;
    public final TuxTextView LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S49(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.wo, this, true);
        View findViewById = findViewById(R.id.etn);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.item_container)");
        this.LJLIL = (ConstraintLayout) findViewById;
        View findViewById2 = findViewById(R.id.i5y);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.product_img)");
        this.LJLILLLLZI = (SmartImageView) findViewById2;
        View findViewById3 = findViewById(R.id.i6k);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.product_title)");
        this.LJLJI = (SG3) findViewById3;
        View findViewById4 = findViewById(R.id.i6i);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.product_spec)");
        this.LJLJJI = (TuxTextView) findViewById4;
        View findViewById5 = findViewById(R.id.wu);
        o.LJIIIIZZ(findViewById5, "findViewById(R.id.addon_checkbox)");
        this.LJLJJL = (C71897SJp) findViewById5;
        View findViewById6 = findViewById(R.id.ip8);
        o.LJIIIIZZ(findViewById6, "findViewById(R.id.real_price)");
        this.LJLJJLL = (TuxTextView) findViewById6;
        View findViewById7 = findViewById(R.id.hdr);
        o.LJIIIIZZ(findViewById7, "findViewById(R.id.original_price)");
        this.LJLJL = (TuxTextView) findViewById7;
    }
}
