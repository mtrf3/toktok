package X;

import com.google.android.play.core.appupdate.b;
import kotlin.jvm.internal.o;

/* renamed from: X.Fwd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40603Fwd extends AbstractC65781Prl implements InterfaceC88472Yns<ARN, C76800UCe> {
    public static final C40603Fwd LJLIL = new C40603Fwd();

    public C40603Fwd() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ARN it) {
        o.LJIIIZ(it, "it");
        C40599FwZ.LIZJ("app_update_install");
        b bVar = C40599FwZ.LIZIZ;
        if (bVar != null) {
            bVar.LJ();
        }
        return C76800UCe.LIZ;
    }
}
