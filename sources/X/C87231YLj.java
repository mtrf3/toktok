package X;

import android.content.Context;
import android.view.View;
import android.view.ViewConfiguration;
import kotlin.jvm.internal.o;

/* renamed from: X.YLj, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87231YLj {
    public final Context LIZ;
    public final View LIZIZ;
    public final InterfaceC87234YLm LIZJ;
    public float LIZLLL;
    public float LJ;
    public float LJFF;
    public float LJI;
    public float LJII;
    public float LJIIIIZZ;
    public float LJIIIZ;
    public float LJIIJ;
    public float LJIIJJI;
    public float LJIIL;
    public final C16230kN LJIILIIL;

    public C87231YLj(Context context, View view, InterfaceC87234YLm mListener) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(mListener, "mListener");
        this.LIZ = context;
        this.LIZIZ = view;
        this.LIZJ = mListener;
        C16230kN c16230kN = new C16230kN(context, new C87233YLl(this));
        c16230kN.LIZIZ(new GestureDetectorOnDoubleTapListenerC87232YLk(this));
        this.LJIILIIL = c16230kN;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        viewConfiguration.getScaledTouchSlop();
        viewConfiguration.getScaledTouchSlop();
    }
}
