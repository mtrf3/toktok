package X;

import com.bytedance.keva.Keva;

/* renamed from: X.WWi, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82420WWi extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C82420WWi LJLIL = new C82420WWi();

    public C82420WWi() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("now_publish_keva");
    }
}
