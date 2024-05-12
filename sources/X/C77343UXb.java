package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* renamed from: X.UXb, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77343UXb extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C77343UXb LJLIL = new C77343UXb();

    public C77343UXb() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        Keva repo = Keva.getRepo("hot_word_gift_user");
        o.LJIIIIZZ(repo, "getRepo(KEVA_USER_REPO_NAME)");
        return repo;
    }
}
