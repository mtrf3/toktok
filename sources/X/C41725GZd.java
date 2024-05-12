package X;

import com.bytedance.keva.Keva;

/* renamed from: X.GZd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41725GZd extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C41725GZd LJLIL = new C41725GZd();

    public C41725GZd() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("repo_reset_save_local_state");
    }
}
