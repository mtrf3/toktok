package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* renamed from: X.DJj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33671DJj extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C33671DJj LJLIL = new C33671DJj();

    public C33671DJj() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        Keva repo = Keva.getRepo("fc_cool_down");
        o.LJIIIIZZ(repo, "getRepo(KEY_FC_COOL_DOWN)");
        return repo;
    }
}
