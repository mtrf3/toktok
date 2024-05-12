package X;

import com.bytedance.keva.Keva;

/* renamed from: X.96P, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C96P extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C96P LJLIL = new C96P();

    public C96P() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("touchpoint_cache_repo");
    }
}
