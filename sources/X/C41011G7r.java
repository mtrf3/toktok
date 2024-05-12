package X;

import com.bytedance.keva.Keva;

/* renamed from: X.G7r, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41011G7r extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C41011G7r LJLIL = new C41011G7r();

    public C41011G7r() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("publish_privacy_settings_cache");
    }
}
