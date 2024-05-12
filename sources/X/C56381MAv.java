package X;

import com.bytedance.keva.Keva;

/* renamed from: X.MAv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56381MAv extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C56381MAv LJLIL = new C56381MAv();

    public C56381MAv() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("keva_repo_app_widget");
    }
}
