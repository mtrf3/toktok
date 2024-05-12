package X;

import com.bytedance.keva.Keva;

/* renamed from: X.8AZ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8AZ extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C8AZ LJLIL = new C8AZ();

    public C8AZ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("explore_feed_cache");
    }
}
