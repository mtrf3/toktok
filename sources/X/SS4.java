package X;

import Y.ARunnableS48S0100000_12;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.PopupWindow;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SS4 extends PopupWindow {
    public final ARunnableS48S0100000_12 LIZ;
    public final C62846OlW LIZIZ;
    public final TuxTextView LIZJ;
    public final View LIZLLL;

    @Override // android.widget.PopupWindow
    public final void dismiss() {
        if (!isShowing()) {
            return;
        }
        super.dismiss();
    }

    public SS4(Context context) {
        o.LJIIIZ(context, "context");
        this.LIZ = new ARunnableS48S0100000_12(this, 111);
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.c1f, C16880lQ.LLZIL(context), null);
        o.LJIIIIZZ(LLLZIIL, "from(context).inflate(R.…added_to_favorited, null)");
        this.LIZLLL = LLLZIIL;
        setContentView(LLLZIIL);
        View findViewById = LLLZIIL.findViewById(R.id.f76);
        o.LJIIIIZZ(findViewById, "root.findViewById(R.id.iv_music_cover)");
        this.LIZIZ = (C62846OlW) findViewById;
        View findViewById2 = LLLZIIL.findViewById(R.id.mei);
        o.LJIIIIZZ(findViewById2, "root.findViewById(R.id.tv_popup_title)");
        this.LIZJ = (TuxTextView) findViewById2;
        setWidth(-2);
        setHeight(-2);
        setAnimationStyle(R.style.hw);
        setBackgroundDrawable(new ColorDrawable(0));
        LLLZIIL.measure(0, 0);
    }
}
