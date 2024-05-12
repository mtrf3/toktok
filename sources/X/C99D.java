package X;

import com.bytedance.keva.Keva;

/* renamed from: X.99D, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C99D extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C99D LJLIL = new C99D();

    public C99D() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("my_profile_recommend_keva");
    }
}
