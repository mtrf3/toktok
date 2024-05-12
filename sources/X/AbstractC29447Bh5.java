package X;

import com.bytedance.android.live.base.model.user.User;
import kotlin.jvm.internal.o;

/* renamed from: X.Bh5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC29447Bh5 extends AbstractC29482Bhe<C76800UCe> {
    @Override // X.AbstractC29482Bhe
    public final boolean LJ() {
        return false;
    }

    public abstract void LJIIJ(User user, boolean z);

    public AbstractC29447Bh5(C29484Bhg c29484Bhg) {
        super(c29484Bhg);
    }

    @Override // X.AbstractC29482Bhe
    public final Object LJIIIZ(InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return C76800UCe.LIZ;
    }

    @Override // X.AbstractC29482Bhe
    public final void LJII(User user, boolean z, boolean z2, C76800UCe c76800UCe) {
        o.LJIIIZ(user, "user");
        LJIIJ(user, z);
    }
}
