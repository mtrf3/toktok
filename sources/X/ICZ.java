package X;

import android.app.Activity;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ICZ extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public static final ICZ LJLIL = new ICZ();

    public ICZ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        HQ7 USER_SERVICE = C44172HVg.LJIJ;
        o.LJIIIIZZ(USER_SERVICE, "USER_SERVICE");
        Activity LIZ = C42470Gle.LIZ();
        o.LJIIIIZZ(LIZ, "getTopActivity()");
        USER_SERVICE.LIZ(LIZ, "", "", null, null);
        return C76800UCe.LIZ;
    }
}
