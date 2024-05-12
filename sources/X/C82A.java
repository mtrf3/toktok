package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.82A, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C82A extends LinearLayout {
    public final TuxTextView LJLIL;
    public final TuxTextView LJLILLLLZI;

    public final void setCurrentNum(int i) {
        if (i == 0) {
            setVisibility(8);
        } else {
            setVisibility(0);
            this.LJLIL.setText(String.valueOf(i));
        }
    }

    public final void setTotalNum(int i) {
        if (i <= 1) {
            setVisibility(8);
        } else {
            setVisibility(0);
        }
        this.LJLILLLLZI.setText(String.valueOf(i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82A(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int i;
        int i2;
        C04560Fw.LIZ(context, "context", attributeSet, "attrs");
        setGravity(17);
        setOrientation(0);
        Integer LJI = C79045V0n.LJI(R.attr.cd, context);
        if (LJI != null) {
            i = LJI.intValue();
        } else {
            i = 0;
        }
        Integer LJI2 = C79045V0n.LJI(R.attr.dj, context);
        if (LJI2 != null) {
            i2 = LJI2.intValue();
        } else {
            i2 = 0;
        }
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "getContext()");
        TuxTextView tuxTextView = new TuxTextView(context2, null, 6, 0);
        tuxTextView.setTuxFont(71);
        tuxTextView.setGravity(17);
        tuxTextView.setTextColor(i2);
        tuxTextView.setTextSize(12.0f);
        tuxTextView.setText("1");
        tuxTextView.setShadowLayer(2.0f, 0.0f, 2.0f, i);
        this.LJLIL = tuxTextView;
        addView(tuxTextView);
        Context context3 = getContext();
        o.LJIIIIZZ(context3, "getContext()");
        TuxTextView tuxTextView2 = new TuxTextView(context3, null, 6, 0);
        tuxTextView2.setTuxFont(71);
        tuxTextView2.setGravity(17);
        tuxTextView2.setTextColor(i2);
        tuxTextView2.setTextSize(12.0f);
        tuxTextView2.setText(" / ");
        tuxTextView2.setShadowLayer(2.0f, 0.0f, 2.0f, i);
        addView(tuxTextView2);
        Context context4 = getContext();
        o.LJIIIIZZ(context4, "getContext()");
        TuxTextView tuxTextView3 = new TuxTextView(context4, null, 6, 0);
        tuxTextView3.setTuxFont(71);
        tuxTextView3.setGravity(17);
        tuxTextView3.setTextColor(i2);
        tuxTextView3.setTextSize(12.0f);
        tuxTextView3.setShadowLayer(2.0f, 0.0f, 2.0f, i);
        this.LJLILLLLZI = tuxTextView3;
        addView(tuxTextView3);
    }
}
