package X;

import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("increase_login_notify")
/* renamed from: X.M6z, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56281M6z extends M71 {
    public final InterfaceC65784Pro<C76800UCe> LJLIL;

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return 180;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56281M6z(InterfaceC55643Lsd scene, C56280M6y c56280M6y) {
        super(scene);
        o.LJIIIZ(scene, "scene");
        this.LJLIL = c56280M6y;
    }

    @Override // X.M72
    public final void LIZLLL(C54082LKk context, M78 wrapper) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(wrapper, "wrapper");
        this.LJLIL.invoke();
    }
}
