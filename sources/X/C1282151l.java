package X;

import com.ss.ugc.android.editor.core.EditorProContext;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.51l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1282151l {
    public final C1282051k LIZ;
    public final ActivityC45651qj LIZIZ;
    public final C62822Ol8 LIZJ;
    public final C62822Ol8 LIZLLL;
    public final C62822Ol8 LJ;
    public final C62822Ol8 LJFF;

    public final EditorProContext LIZ() {
        return (EditorProContext) this.LIZJ.getValue();
    }

    public final C1284452i LIZIZ() {
        return (C1284452i) this.LIZLLL.getValue();
    }

    public C1282151l(C1282051k functionBarConfig, ActivityC45651qj activity) {
        o.LJIIIZ(functionBarConfig, "functionBarConfig");
        o.LJIIIZ(activity, "activity");
        this.LIZ = functionBarConfig;
        this.LIZIZ = activity;
        this.LIZJ = C221108m2.LIZIZ(C1282351n.LJLIL);
        this.LIZLLL = C221108m2.LIZIZ(C1282251m.LJLIL);
        this.LJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 992));
        this.LJFF = C221108m2.LIZIZ(C1282751r.LJLIL);
    }
}
