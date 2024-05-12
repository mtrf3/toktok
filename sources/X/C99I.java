package X;

import com.bytedance.keva.Keva;

/* renamed from: X.99I, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C99I extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C99I LJLIL = new C99I();

    public C99I() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("my_profile_common_keva");
    }
}
