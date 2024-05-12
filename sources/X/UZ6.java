package X;

import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UZ6 extends FrameLayout implements View.OnClickListener {
    public final TuxTextView LJLIL;
    public final TuxTextView LJLILLLLZI;
    public final TuxTextView LJLJI;
    public final TuxIconView LJLJJI;
    public final SY4 LJLJJL;
    public final SY4 LJLJJLL;
    public UZE LJLJL;

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LJLJL = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UZ6(ActivityC45651qj activityC45651qj) {
        super(activityC45651qj, null, 0);
        new LinkedHashMap();
        View inflate = FrameLayout.inflate(activityC45651qj, R.layout.nx, this);
        o.LJIIIIZZ(inflate.findViewById(R.id.adb), "view.findViewById(R.id.a…account_prompt_root_view)");
        View findViewById = inflate.findViewById(R.id.ade);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.a…ccount_prompt_text_title)");
        this.LJLIL = (TuxTextView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.ada);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.a…_prompt_icon_email_phone)");
        this.LJLJJI = (TuxIconView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.add);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.a…_prompt_text_email_phone)");
        this.LJLILLLLZI = (TuxTextView) findViewById3;
        View findViewById4 = inflate.findViewById(R.id.adc);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.a…ount_prompt_text_content)");
        this.LJLJI = (TuxTextView) findViewById4;
        View findViewById5 = inflate.findViewById(R.id.ad_);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.a…_prompt_bind_btn_not_now)");
        this.LJLJJL = (SY4) findViewById5;
        View findViewById6 = inflate.findViewById(R.id.ad9);
        o.LJIIIIZZ(findViewById6, "view.findViewById(R.id.a…_prompt_bind_btn_confirm)");
        this.LJLJJLL = (SY4) findViewById6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v) {
        o.LJIIIZ(v, "v");
        int id = v.getId();
        if (id == this.LJLJJL.getId()) {
            UZE uze = this.LJLJL;
            if (uze != null) {
                uze.LIZJ();
            }
            ASQ.LIZLLL(this, ASX.LIZ);
            return;
        }
        if (id != this.LJLJJLL.getId()) {
            return;
        }
        UZE uze2 = this.LJLJL;
        if (uze2 != null) {
            uze2.LIZIZ();
        }
        ASQ.LIZLLL(this, ASX.LIZ);
    }
}
