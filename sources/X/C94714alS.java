package X;

import kotlin.jvm.internal.o;

/* renamed from: X.alS, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94714alS extends AbstractC65781Prl implements InterfaceC88472Yns<AbstractC234519Ih, C76800UCe> {
    public final /* synthetic */ boolean LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94714alS(boolean z) {
        super(1);
        this.LJLIL = z;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(AbstractC234519Ih abstractC234519Ih) {
        C234509Ig c234509Ig;
        AbstractC234519Ih action = abstractC234519Ih;
        o.LJIIIZ(action, "action");
        if ((action instanceof C234509Ig) && (c234509Ig = (C234509Ig) action) != null) {
            c234509Ig.LJ = this.LJLIL;
        }
        return C76800UCe.LIZ;
    }
}
