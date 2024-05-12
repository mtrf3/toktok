package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DJW extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final DJW LJLIL = new DJW();

    public DJW() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        Keva repo = Keva.getRepo("SIMPLE_USER_CORRUPTION");
        o.LJIIIIZZ(repo, "getRepo(CORRUPTION_KEVA)");
        return repo;
    }
}
