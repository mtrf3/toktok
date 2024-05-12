package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LBQ extends LinearLayout {
    public final ImageView LJLIL;
    public final TuxTextView LJLILLLLZI;
    public final SY4 LJLJI;
    public final TuxTextView LJLJJI;
    public final TuxTextView LJLJJL;

    public final SY4 getBtnDismiss() {
        return this.LJLJI;
    }

    public final ImageView getIvClose() {
        return this.LJLIL;
    }

    public final TuxTextView getModalTitle() {
        return this.LJLJJL;
    }

    public final TuxTextView getTvGoSetting() {
        return this.LJLJJI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LBQ(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        View inflate = View.inflate(context, R.layout.aa_, this);
        View findViewById = inflate.findViewById(R.id.f0h);
        o.LJIIIIZZ(findViewById, "rootView.findViewById(R.id.iv_close)");
        this.LJLIL = (ImageView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.m93);
        o.LJIIIIZZ(findViewById2, "rootView.findViewById(R.id.tv_intro)");
        this.LJLILLLLZI = (TuxTextView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.avu);
        o.LJIIIIZZ(findViewById3, "rootView.findViewById(R.id.btn_dismiss)");
        this.LJLJI = (SY4) findViewById3;
        View findViewById4 = inflate.findViewById(R.id.m7m);
        o.LJIIIIZZ(findViewById4, "rootView.findViewById(R.id.tv_go_setting)");
        this.LJLJJI = (TuxTextView) findViewById4;
        View findViewById5 = inflate.findViewById(R.id.er8);
        o.LJIIIIZZ(findViewById5, "rootView.findViewById(R.id.intro_modal_title)");
        this.LJLJJL = (TuxTextView) findViewById5;
    }
}
