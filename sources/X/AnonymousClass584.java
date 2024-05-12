package X;

import Y.ALAdapterS1S0100000_2;
import Y.AUListenerS91S0100000_2;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.ss.ugc.android.editor.core.EditorProContext;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.584, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass584 implements InterfaceC1290554r {
    public final ViewGroup LIZ;
    public final C52T LIZIZ;
    public final View LIZJ;
    public final C58D LIZLLL;
    public final EditorProContext LJ;
    public float LJFF;
    public float LJI;
    public final C62822Ol8 LJII;
    public final C62822Ol8 LJIIIIZZ;

    @Override // X.InterfaceC1290554r
    public final void LIZ() {
        C52T c52t = this.LIZIZ;
        if (c52t != null) {
            c52t.E6(C52X.PAUSE);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.34f, 1.0f);
        ofFloat.setDuration(200L);
        ofFloat.addUpdateListener(new AUListenerS91S0100000_2(this, 46));
        ofFloat.addListener(new ALAdapterS1S0100000_2(this, 38));
        ofFloat.start();
    }

    @Override // X.InterfaceC1290554r
    public final void LIZIZ() {
        float f;
        C52T c52t = this.LIZIZ;
        if (c52t != null) {
            c52t.E6(C52X.PLAY);
        }
        float f2 = 1.0f;
        if (C79057V0z.LJIIJ(this.LJ)) {
            f = 1.0f;
        } else {
            f = 0.34f;
        }
        this.LJFF = f;
        if (!C79057V0z.LJIIIZ(this.LJ)) {
            f2 = 0.34f;
        }
        this.LJI = f2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.34f);
        ofFloat.setDuration(200L);
        ofFloat.addUpdateListener(new AUListenerS91S0100000_2(this, 45));
        ofFloat.addListener(new ALAdapterS1S0100000_2(this, 37));
        ofFloat.start();
    }

    @Override // X.InterfaceC1290554r
    public final void LIZJ() {
        Object value = this.LJIIIIZZ.getValue();
        o.LJIIIIZZ(value, "<get-closeAnimator>(...)");
        ((ValueAnimator) value).cancel();
        Object value2 = this.LJII.getValue();
        o.LJIIIIZZ(value2, "<get-openAnimator>(...)");
        ((ValueAnimator) value2).start();
    }

    @Override // X.InterfaceC1290554r
    public final void LIZLLL() {
        Object value = this.LJII.getValue();
        o.LJIIIIZZ(value, "<get-openAnimator>(...)");
        ((ValueAnimator) value).cancel();
        Object value2 = this.LJIIIIZZ.getValue();
        o.LJIIIIZZ(value2, "<get-closeAnimator>(...)");
        ((ValueAnimator) value2).start();
    }

    public AnonymousClass584(ViewGroup viewGroup, C52T c52t, View view, C58D c58d, EditorProContext editorContext) {
        o.LJIIIZ(editorContext, "editorContext");
        this.LIZ = viewGroup;
        this.LIZIZ = c52t;
        this.LIZJ = view;
        this.LIZLLL = c58d;
        this.LJ = editorContext;
        this.LJFF = 1.0f;
        this.LJI = 1.0f;
        this.LJII = C221108m2.LIZIZ(new AqS152S0100000_2(this, 860));
        this.LJIIIIZZ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 859));
    }
}
