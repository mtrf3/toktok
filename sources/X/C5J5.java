package X;

import kotlin.jvm.internal.o;

/* renamed from: X.5J5, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5J5 extends F9E {
    public final C5JE LJLIL;
    public final C5JB LJLILLLLZI;
    public final C5JE LJLJI;
    public final C5JE LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI};
    }

    public C5J5() {
        C5JE scale = C5JG.LIZ;
        C5JB c5jb = new C5JB(C47261Igj.LJJIJIIJI(Float.valueOf(0.0f), Float.valueOf(0.0f)));
        o.LJIIIZ(scale, "alpha");
        o.LJIIIZ(scale, "rotation");
        o.LJIIIZ(scale, "scale");
        this.LJLIL = scale;
        this.LJLILLLLZI = c5jb;
        this.LJLJI = scale;
        this.LJLJJI = scale;
    }
}
