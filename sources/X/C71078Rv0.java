package X;

import android.text.TextPaint;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Rv0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71078Rv0 extends AbstractC71081Rv3 {
    public final SmartImageView LJLIL;
    public final TuxTextView LJLILLLLZI;
    public final TuxTextView LJLJI;
    public final TuxTextView LJLJJI;

    public C71078Rv0(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.f92);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.iv_product_cover)");
        this.LJLIL = (SmartImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.mex);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.tv_product_currency)");
        this.LJLILLLLZI = (TuxTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.mfb);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.tv_product_sales_price)");
        this.LJLJI = (TuxTextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.mf2);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.…v_product_original_price)");
        TuxTextView tuxTextView = (TuxTextView) findViewById4;
        this.LJLJJI = tuxTextView;
        view.setOutlineProvider(new C42162Ggg(C32151Nz.LJIIZILJ(6)));
        view.setClipToOutline(true);
        TextPaint paint = tuxTextView.getPaint();
        if (paint != null) {
            paint.setFlags(16);
            paint.setAntiAlias(true);
        }
    }
}
