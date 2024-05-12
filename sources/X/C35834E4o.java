package X;

import com.bytedance.keva.Keva;

/* renamed from: X.E4o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35834E4o extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C35834E4o LJLIL = new C35834E4o();

    public C35834E4o() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("plugin_instance");
    }
}
