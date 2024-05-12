package X;

import android.view.ViewGroup;
import kotlin.jvm.internal.AqS161S0200000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WdG, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82718WdG {
    public final ViewGroup LIZ;
    public final ViewGroup LIZIZ;
    public final InterfaceC82719WdH LIZJ;
    public final C83G LIZLLL;
    public final C5H3 LJ;
    public final C5H3 LJFF;
    public final /* synthetic */ ViewOnTouchListenerC82716WdE LJI;

    public C82718WdG(ViewOnTouchListenerC82716WdE viewOnTouchListenerC82716WdE, ViewGroup viewGroup, ViewGroup decorView, C82V c82v, C83G touchInterceptor) {
        o.LJIIIZ(decorView, "decorView");
        o.LJIIIZ(touchInterceptor, "touchInterceptor");
        this.LJI = viewOnTouchListenerC82716WdE;
        this.LIZ = viewGroup;
        this.LIZIZ = decorView;
        this.LIZJ = c82v;
        this.LIZLLL = touchInterceptor;
        EnumC221088m0 enumC221088m0 = EnumC221088m0.NONE;
        this.LJ = C221108m2.LIZ(enumC221088m0, new AqS161S0200000_14(viewOnTouchListenerC82716WdE, this, 23));
        this.LJFF = C221108m2.LIZ(enumC221088m0, new AqS161S0200000_14(viewOnTouchListenerC82716WdE, this, 22));
    }
}
