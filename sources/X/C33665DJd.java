package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* renamed from: X.DJd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33665DJd extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C33665DJd LJLIL = new C33665DJd();

    public C33665DJd() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        Keva repo = Keva.getRepo("fc_daily_ignore");
        o.LJIIIIZZ(repo, "getRepo(KEY_FC_DAILY_IGNORE)");
        return repo;
    }
}
