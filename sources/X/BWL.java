package X;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BWL extends FrameLayout {
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;

    private final ImageView getIcon() {
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-icon>(...)");
        return (ImageView) value;
    }

    private final C47121t6 getText() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-text>(...)");
        return (C47121t6) value;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BWL(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.djq, this, true);
        setWillNotDraw(false);
        this.LJLIL = C221108m2.LIZIZ(new AqS155S0100000_5(this, 9));
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS155S0100000_5(this, 10));
    }

    public final void LIZ(boolean z) {
        if (z) {
            getIcon().setImageResource(R.drawable.d3h);
            getText().setText(C15380j0.LJIILJJIL(R.string.lps));
        } else {
            getIcon().setImageResource(R.drawable.d3f);
            getText().setText(C15380j0.LJIILJJIL(R.string.lpr));
        }
    }
}
