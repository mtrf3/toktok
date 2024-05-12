package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DJZ extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final DJZ LJLIL = new DJZ();

    public DJZ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        Keva repo = Keva.getRepo("fc_cadc");
        o.LJIIIIZZ(repo, "getRepo(KEY_FC_CADC)");
        return repo;
    }
}
