package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import kotlin.jvm.internal.o;

/* renamed from: X.1P2, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1P2 implements InterfaceC09350Yh {
    public static final C1P2 LIZ = new C1P2();

    public final InterfaceC07790Sh LIZ(InterfaceC07790Sh interfaceC07790Sh, C31611Lx alignment) {
        o.LJIIIZ(interfaceC07790Sh, "<this>");
        o.LJIIIZ(alignment, "alignment");
        return interfaceC07790Sh.LLLIIIL(new C50951zH(alignment));
    }

    public final InterfaceC07790Sh LIZIZ(InterfaceC07790Sh interfaceC07790Sh, boolean z) {
        o.LJIIIZ(interfaceC07790Sh, "<this>");
        if (1.0f > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            return interfaceC07790Sh.LLLIIIL(new C50921zE(z));
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("invalid weight ");
        LIZ2.append(1.0f);
        LIZ2.append("; must be greater than zero");
        String LIZIZ = X1D.LIZIZ(LIZ2);
        LIZIZ.toString();
        throw new IllegalArgumentException(LIZIZ);
    }
}
