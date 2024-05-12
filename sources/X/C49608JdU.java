package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.JdU, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C49608JdU extends View {
    public InterfaceC78843Uwx<Double> LJLIL;
    public InterfaceC78843Uwx<Double> LJLILLLLZI;
    public InterfaceC49610JdW LJLJI;

    public final InterfaceC78843Uwx<Double> getCoreAreaXRange() {
        return this.LJLIL;
    }

    public final InterfaceC78843Uwx<Double> getCoreAreaYRange() {
        return this.LJLILLLLZI;
    }

    public final InterfaceC49610JdW getInteractiveListener() {
        return this.LJLJI;
    }

    public final void setCoreAreaXRange(InterfaceC78843Uwx<Double> interfaceC78843Uwx) {
        o.LJIIIZ(interfaceC78843Uwx, "<set-?>");
        this.LJLIL = interfaceC78843Uwx;
    }

    public final void setCoreAreaYRange(InterfaceC78843Uwx<Double> interfaceC78843Uwx) {
        o.LJIIIZ(interfaceC78843Uwx, "<set-?>");
        this.LJLILLLLZI = interfaceC78843Uwx;
    }

    public final void setInteractiveListener(InterfaceC49610JdW interfaceC49610JdW) {
        this.LJLJI = interfaceC49610JdW;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C49608JdU(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49608JdU(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C48353IyL c48353IyL;
        a1.LJFF(context, "context");
        int LJIIJJI = KL2.LJIIJJI(context);
        int LJIIIZ = KL2.LJIIIZ(context);
        if (C90193gN.LIZIZ(context)) {
            double d = LJIIJJI;
            c48353IyL = new C48353IyL(0.22d * d, d * 1.0d);
        } else {
            double d2 = LJIIJJI;
            c48353IyL = new C48353IyL(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX * d2, d2 * 0.78d);
        }
        this.LJLIL = c48353IyL;
        double d3 = LJIIIZ;
        this.LJLILLLLZI = new C48353IyL(0.12d * d3, d3 * 0.59d);
    }

    public static boolean LIZ(float f, float f2, float f3, float f4) {
        if (Math.abs(f3 - f) < C17N.LJIILL(10.0d) && Math.abs(f4 - f2) < C17N.LJIILL(10.0d)) {
            return true;
        }
        return false;
    }
}
