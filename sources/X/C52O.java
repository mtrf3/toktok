package X;

import com.ss.ugc.android.editor.core.EditorProContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.52O, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C52O {
    public final ActivityC45651qj LIZ;
    public final C131985Fy LIZIZ;
    public final HandlerC1283652a LIZJ;
    public final int LIZLLL;
    public final C62822Ol8 LJ;
    public final C62822Ol8 LJFF;
    public final C62822Ol8 LJI;
    public boolean LJII;
    public C52Q LJIIIIZZ;

    public final EditorProContext LIZ() {
        return (EditorProContext) this.LJ.getValue();
    }

    public C52O(C29S activity, C131985Fy animationController, HandlerC1283652a rotateHandler) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(animationController, "animationController");
        o.LJIIIZ(rotateHandler, "rotateHandler");
        this.LIZ = activity;
        this.LIZIZ = animationController;
        this.LIZJ = rotateHandler;
        this.LIZLLL = AnonymousClass636.LJIIIIZZ(R.attr.ca, activity);
        this.LJ = C221108m2.LIZIZ(C123524t2.LJLIL);
        this.LJFF = C221108m2.LIZIZ(new AqS152S0100000_2(this, 808));
        this.LJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 807));
    }
}
