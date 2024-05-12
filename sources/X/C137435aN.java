package X;

import java.util.concurrent.Callable;

/* renamed from: X.5aN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C137435aN extends TBS implements InterfaceC65784Pro<C76800UCe> {
    public C137435aN(C137415aL c137415aL) {
        super(0, c137415aL, C137415aL.class, "startCompile", "startCompile()V", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        C137415aL c137415aL = (C137415aL) this.receiver;
        c137415aL.getClass();
        C150785vu.LIZ(c137415aL.LIZIZ);
        C10K.LIZIZ(new Callable() { // from class: X.5aO
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(android.util.Log.e("change_avatar_mode", "text compile finish"));
            }
        }, C10K.LJIIIIZZ, null);
        return C76800UCe.LIZ;
    }
}
