package X;

import Y.ACListenerS28S0100000_8;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JJR extends FrameLayout {
    public EnumC48742JBa LJLIL;
    public CharSequence LJLILLLLZI;
    public int LJLJI;
    public JJS LJLJJI;
    public final java.util.Map<Integer, View> LJLJJL;

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLJJL;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final JJS getDelegate() {
        return this.LJLJJI;
    }

    public final int getMaxLine() {
        return this.LJLJI;
    }

    public final EnumC48742JBa getState() {
        return this.LJLIL;
    }

    public final CharSequence getText() {
        return this.LJLILLLLZI;
    }

    public final void setDelegate(JJS jjs) {
        this.LJLJJI = jjs;
    }

    public final void setMaxLine(int i) {
        ((TextView) LIZ(R.id.krv)).setMaxLines(i);
        this.LJLJI = i;
    }

    public final void setState(EnumC48742JBa enumC48742JBa) {
        int i;
        if (enumC48742JBa == null) {
            i = -1;
        } else {
            i = C48745JBd.LIZ[enumC48742JBa.ordinal()];
        }
        if (i != 1) {
            if (i == 2) {
                JON subtitle_control_icon = (JON) LIZ(R.id.krw);
                o.LJIIIIZZ(subtitle_control_icon, "subtitle_control_icon");
                subtitle_control_icon.LIZ(EnumC48916JHs.ON, false);
                setText("");
            }
        } else {
            JON subtitle_control_icon2 = (JON) LIZ(R.id.krw);
            o.LJIIIIZZ(subtitle_control_icon2, "subtitle_control_icon");
            subtitle_control_icon2.LIZ(EnumC48916JHs.OFF, false);
            LIZ(R.id.krv).setVisibility(8);
        }
        this.LJLIL = enumC48742JBa;
    }

    public final void setText(CharSequence charSequence) {
        boolean z;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || this.LJLIL == EnumC48742JBa.CLOSED) {
            LIZ(R.id.krv).setVisibility(8);
        } else {
            LIZ(R.id.krv).setVisibility(0);
            ((TextView) LIZ(R.id.krv)).setText(charSequence);
        }
        this.LJLILLLLZI = charSequence;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JJR(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLJJL = C62850Ola.LJFF(context, "context");
        FrameLayout.inflate(context, R.layout.chb, this);
        C16880lQ.LJJJLZIJ((JON) LIZ(R.id.krw), new ACListenerS28S0100000_8(this, 73));
        View LIZ = LIZ(R.id.krv);
        Integer LJI = C79045V0n.LJI(R.attr.d7, context);
        Drawable drawable = null;
        if (LJI != null) {
            int intValue = LJI.intValue();
            C49098JOs.LIZ.getClass();
            Integer valueOf = Integer.valueOf(C49098JOs.LIZIZ());
            drawable = C51763KTf.LIZIZ(C32151Nz.LJIIZILJ(valueOf.intValue() <= 0 ? 2 : valueOf), intValue);
        }
        LIZ.setBackground(drawable);
        this.LJLILLLLZI = "";
        this.LJLJI = 3;
    }
}
