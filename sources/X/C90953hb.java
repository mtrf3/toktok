package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.3hb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C90953hb extends FrameLayout {
    public float LJLIL;
    public TuxTextView LJLILLLLZI;
    public C63044Ooi LJLJI;

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final C63044Ooi getRadio() {
        return this.LJLJI;
    }

    public final TuxTextView getSpeedTV() {
        return this.LJLILLLLZI;
    }

    public final float getSpeedValue() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C90953hb(Context context) {
        super(context);
        new LinkedHashMap();
        o.LJI(context);
        this.LJLIL = 1.0f;
        View.inflate(getContext(), R.layout.abi, this);
        View findViewById = findViewById(R.id.k_g);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.speed_tux)");
        this.LJLILLLLZI = (TuxTextView) findViewById;
        View findViewById2 = findViewById(R.id.k_d);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.speed_radio)");
        this.LJLJI = (C63044Ooi) findViewById2;
    }

    public final void setRadio(C63044Ooi c63044Ooi) {
        o.LJIIIZ(c63044Ooi, "<set-?>");
        this.LJLJI = c63044Ooi;
    }

    public final void setSpeedTV(TuxTextView tuxTextView) {
        o.LJIIIZ(tuxTextView, "<set-?>");
        this.LJLILLLLZI = tuxTextView;
    }

    public final void setSpeedText(String text) {
        o.LJIIIZ(text, "text");
        this.LJLILLLLZI.setText(text);
        this.LJLJI.setChecked(false);
    }

    public final void setSpeedValue(float f) {
        this.LJLIL = f;
    }
}
