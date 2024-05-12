package X;

import com.bytedance.keva.Keva;

/* renamed from: X.9rc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C250049rc extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C250049rc LJLIL = new C250049rc();

    public C250049rc() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("touchpoint_cold_boot_helper");
    }
}
