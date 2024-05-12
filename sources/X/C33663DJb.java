package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* renamed from: X.DJb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33663DJb extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C33663DJb LJLIL = new C33663DJb();

    public C33663DJb() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        Keva repo = Keva.getRepo("fc_daily_close");
        o.LJIIIIZZ(repo, "getRepo(KEY_FC_DAILY_CLOSE)");
        return repo;
    }
}
