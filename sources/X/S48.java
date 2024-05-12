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
public final class S48 extends FrameLayout {
    public final ConstraintLayout LJLIL;
    public final ConstraintLayout LJLILLLLZI;
    public final SmartImageView LJLJI;
    public final SG3 LJLJJI;
    public final TuxTextView LJLJJL;
    public final C71897SJp LJLJJLL;
    public final TuxTextView LJLJL;
    public final TuxTextView LJLJLJ;
    public int LJLJLLL;
    public C27959AyB LJLL;

    public final int getOrder() {
        return this.LJLJLLL;
    }

    public final C27959AyB getSkuInfo() {
        return this.LJLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S48(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.a8l, this, true);
        View findViewById = findViewById(R.id.etn);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.item_container)");
        this.LJLIL = (ConstraintLayout) findViewById;
        View findViewById2 = findViewById(R.id.btg);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.content_container)");
        this.LJLILLLLZI = (ConstraintLayout) findViewById2;
        View findViewById3 = findViewById(R.id.i5y);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.product_img)");
        this.LJLJI = (SmartImageView) findViewById3;
        View findViewById4 = findViewById(R.id.i6k);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.product_title)");
        this.LJLJJI = (SG3) findViewById4;
        View findViewById5 = findViewById(R.id.i6i);
        o.LJIIIIZZ(findViewById5, "findViewById(R.id.product_spec)");
        this.LJLJJL = (TuxTextView) findViewById5;
        View findViewById6 = findViewById(R.id.wu);
        o.LJIIIIZZ(findViewById6, "findViewById(R.id.addon_checkbox)");
        this.LJLJJLL = (C71897SJp) findViewById6;
        View findViewById7 = findViewById(R.id.ip8);
        o.LJIIIIZZ(findViewById7, "findViewById(R.id.real_price)");
        this.LJLJL = (TuxTextView) findViewById7;
        View findViewById8 = findViewById(R.id.hdr);
        o.LJIIIIZZ(findViewById8, "findViewById(R.id.original_price)");
        this.LJLJLJ = (TuxTextView) findViewById8;
    }
}
