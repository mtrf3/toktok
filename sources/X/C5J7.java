package X;

import kotlin.jvm.internal.o;

/* renamed from: X.5J7, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5J7 extends F9E {
    public final C5JB LJLIL;
    public final C5JB LJLILLLLZI;
    public final C5JE LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI};
    }

    public C5J7() {
        C5JB c5jb = new C5JB(C47261Igj.LJJIJIIJI(Float.valueOf(0.0f), Float.valueOf(0.0f)));
        C5JB c5jb2 = new C5JB(C47261Igj.LJJIJIIJI(Float.valueOf(1.0f), Float.valueOf(1.0f)));
        C5JE rotation = C5JG.LIZ;
        o.LJIIIZ(rotation, "rotation");
        this.LJLIL = c5jb;
        this.LJLILLLLZI = c5jb2;
        this.LJLJI = rotation;
    }
}
