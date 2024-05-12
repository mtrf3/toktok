package X;

import com.bytedance.keva.Keva;

/* renamed from: X.7IL, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7IL extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C7IL LJLIL = new C7IL();

    public C7IL() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("upvote_repo");
    }
}
