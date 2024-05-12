package X;

import com.bytedance.keva.Keva;

/* renamed from: X.3Ac, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C79503Ac extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C79503Ac LJLIL = new C79503Ac();

    public C79503Ac() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("repo_sync_share_view");
    }
}
