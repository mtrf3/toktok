package X;

import android.graphics.Typeface;
import android.widget.FrameLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.6UA, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6UA {
    public final EnumC161246Um LIZ;
    public final FrameLayout LIZIZ;
    public final C6UD LIZJ;
    public final ActivityC45651qj LIZLLL;
    public final C161296Ur LJ;
    public final InterfaceC65784Pro<Long> LJFF;
    public final InterfaceC65784Pro<Long> LJI;
    public final C6U3 LJII;
    public final InterfaceC88472Yns<String, Typeface> LJIIIIZZ;

    public C6UA(EnumC161246Um type, FrameLayout parentView, C6UD c6ud, ActivityC45651qj activity, C161296Ur c161296Ur, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2, C6U3 c6u3, InterfaceC88472Yns interfaceC88472Yns, int i) {
        c161296Ur = (i & 16) != 0 ? null : c161296Ur;
        interfaceC65784Pro = (i & 64) != 0 ? null : interfaceC65784Pro;
        interfaceC65784Pro2 = (i & 128) != 0 ? null : interfaceC65784Pro2;
        c6u3 = (i & 256) != 0 ? null : c6u3;
        interfaceC88472Yns = (i & 512) != 0 ? null : interfaceC88472Yns;
        o.LJIIIZ(type, "type");
        o.LJIIIZ(parentView, "parentView");
        o.LJIIIZ(activity, "activity");
        this.LIZ = type;
        this.LIZIZ = parentView;
        this.LIZJ = c6ud;
        this.LIZLLL = activity;
        this.LJ = c161296Ur;
        this.LJFF = interfaceC65784Pro;
        this.LJI = interfaceC65784Pro2;
        this.LJII = c6u3;
        this.LJIIIIZZ = interfaceC88472Yns;
    }
}
