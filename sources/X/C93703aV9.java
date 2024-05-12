package X;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.aV9, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93703aV9 {
    public float LIZ;
    public float LIZIZ;
    public float LIZJ;
    public float LIZLLL;
    public float LJ;
    public float LJFF;
    public float LJI;
    public float LJII;
    public float LJIIIIZZ;
    public float LJIIIZ;
    public final C16230kN LJIIJ;
    public final Context LJIIJJI;
    public final View LJIIL;
    public final InterfaceC93699aV5 LJIILIIL;

    public C93703aV9(Context context, View view, InterfaceC93699aV5 mListener) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(mListener, "mListener");
        this.LJIIJJI = context;
        this.LJIIL = view;
        this.LJIILIIL = mListener;
        C16230kN c16230kN = new C16230kN(context, new C93702aV8(this));
        c16230kN.LIZIZ(new GestureDetectorOnDoubleTapListenerC93700aV6(this));
        this.LJIIJ = c16230kN;
    }
}
