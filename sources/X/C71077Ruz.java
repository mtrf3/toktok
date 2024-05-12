package X;

import android.text.TextPaint;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Ruz, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71077Ruz extends AbstractC71081Rv3 {
    public final SmartImageView LJLIL;
    public final TuxTextView LJLILLLLZI;
    public final LinearLayout LJLJI;
    public final TuxTextView LJLJJI;
    public final TuxTextView LJLJJL;
    public final TuxTextView LJLJJLL;
    public final SY4 LJLJL;

    public C71077Ruz(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.f92);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.iv_product_cover)");
        this.LJLIL = (SmartImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.mfc);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.tv_product_title)");
        this.LJLILLLLZI = (TuxTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.g5g);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.ll_product_sales_price)");
        this.LJLJI = (LinearLayout) findViewById3;
        View findViewById4 = view.findViewById(R.id.mex);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.tv_product_currency)");
        this.LJLJJI = (TuxTextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.mfb);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.tv_product_sales_price)");
        this.LJLJJL = (TuxTextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.mf2);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.…v_product_original_price)");
        TuxTextView tuxTextView = (TuxTextView) findViewById6;
        this.LJLJJLL = tuxTextView;
        View findViewById7 = view.findViewById(R.id.ay6);
        o.LJIIIIZZ(findViewById7, "itemView.findViewById(R.id.btn_product_buy)");
        this.LJLJL = (SY4) findViewById7;
        TextPaint paint = tuxTextView.getPaint();
        if (paint != null) {
            paint.setFlags(16);
            paint.setAntiAlias(true);
        }
    }
}
