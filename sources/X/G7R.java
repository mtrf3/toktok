package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class G7R extends AbstractC65781Prl implements InterfaceC88472Yns<C26231ARf, C76800UCe> {
    public static final G7R LJLIL = new G7R();

    public G7R() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C26231ARf it) {
        o.LJIIIZ(it, "it");
        Keva LIZJ = C41010G7q.LIZJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("change_post_visibility_status_");
        LIZ.append(C41010G7q.LIZIZ());
        LIZJ.storeInt(X1D.LIZIZ(LIZ), 2);
        C41010G7q.LJ(null, true);
        return C76800UCe.LIZ;
    }
}
