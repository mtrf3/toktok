package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import o53.IDdS476S0100000_10;

/* loaded from: classes11.dex */
public class OPX extends W5G {
    public final IDdS476S0100000_10 LJLIL;

    public final void LIZIZ() {
    }

    public void LIZ() {
        V8L v8l = new V8L();
        v8l.LIZIZ = true;
        getHierarchy().LJIL(v8l);
        getHierarchy().LJIILJJIL(InterfaceC78716Uuu.LJJLIIIJILLIZJL);
    }

    public W4Z<InterfaceC81599W0t> getControllerListener() {
        return this.LJLIL;
    }

    public OPX(Context context) {
        super(context);
        new Paint();
        this.LJLIL = new IDdS476S0100000_10(this, 5);
        LIZ();
    }

    @Override // X.VA9, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // X.VA9
    public void setController(InterfaceC81252Vui interfaceC81252Vui) {
        super.setController(interfaceC81252Vui);
    }

    public OPX(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Paint();
        this.LJLIL = new IDdS476S0100000_10(this, 5);
        LIZ();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        LIZIZ();
    }
}
