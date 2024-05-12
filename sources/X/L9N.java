package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class L9N extends FrameLayout {
    public final View LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    private final C71799SFv getAvatar1() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-avatar1>(...)");
        return (C71799SFv) value;
    }

    private final SJP getAvatar2() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-avatar2>(...)");
        return (SJP) value;
    }

    private final void setSizeDp(int i) {
        int i2 = (i * 3) / 4;
        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(i - i2)));
        getAvatar1().setSize(i2);
        getAvatar2().setSize(i2);
        C26338AVi.LJ(getAvatar1(), 0, Integer.valueOf(LJJIIZ), Integer.valueOf(LJJIIZ), 0, false);
        C26338AVi.LJ(getAvatar2(), Integer.valueOf(LJJIIZ), 0, 0, Integer.valueOf(LJJIIZ), false);
        requestLayout();
    }

    public final void setSize(int i) {
        setSizeDp(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L9N(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.jx);
        a1.LJFF(context, "context");
        this.LJLIL = C16880lQ.LLLZIIL(R.layout.br, C16880lQ.LLZIL(context), this);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 6));
        this.LJLJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 7));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bqp}, R.attr.jx, 0);
            o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…tarView, defStyleAttr, 0)");
            setSizeDp(obtainStyledAttributes.getInt(0, 72));
            obtainStyledAttributes.recycle();
            return;
        }
        setSizeDp(72);
    }

    public static void LIZ(L9N l9n, Object obj) {
        o.LJIIIZ(obj, "obj");
        l9n.getAvatar1().LJIIIZ(obj, true, null, null, false, true, null);
    }

    public static void LIZIZ(L9N l9n, Object obj) {
        o.LJIIIZ(obj, "obj");
        SJP avatar2 = l9n.getAvatar2();
        avatar2.LLIIIL = true;
        avatar2.invalidate();
        l9n.getAvatar2().LJIIIZ(obj, true, null, null, false, false, null);
    }
}
