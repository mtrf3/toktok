package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* renamed from: X.2WF, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2WF extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C2WF LJLIL = new C2WF();

    public C2WF() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("activity_status_");
        LIZ.append(HG3.LJIILL().getCurUserId());
        Keva repo = Keva.getRepo(X1D.LIZIZ(LIZ));
        o.LJIIIIZZ(repo, "getRepo(\"activity_status…serService().curUserId}\")");
        return repo;
    }
}
