package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TCP extends FrameLayout {
    public final View LJLIL;
    public final View LJLILLLLZI;
    public final W5G LJLJI;
    public final TextView LJLJJI;

    public final View getContentView() {
        return this.LJLILLLLZI;
    }

    public final W5G getIconImgView() {
        return this.LJLJI;
    }

    public final View getRoot() {
        return this.LJLIL;
    }

    public final TextView getTextView() {
        return this.LJLJJI;
    }

    public TCP(Context context) {
        super(context, null, 0);
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.crl, this, true);
        o.LJIIIIZZ(LLLLIILL, "LayoutInflater.from(cont…ker_tab_item, this, true)");
        this.LJLIL = LLLLIILL;
        View findViewById = LLLLIILL.findViewById(R.id.em7);
        o.LJIIIIZZ(findViewById, "root.findViewById(R.id.i…o_sticker_item_container)");
        this.LJLILLLLZI = findViewById;
        View findViewById2 = LLLLIILL.findViewById(R.id.em8);
        o.LJIIIIZZ(findViewById2, "root.findViewById(R.id.info_sticker_item_iv)");
        this.LJLJI = (W5G) findViewById2;
        View findViewById3 = LLLLIILL.findViewById(R.id.em9);
        o.LJIIIIZZ(findViewById3, "root.findViewById(R.id.info_sticker_item_tv)");
        this.LJLJJI = (TextView) findViewById3;
    }
}
