package X;

import com.bytedance.keva.Keva;

/* renamed from: X.Jvk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50740Jvk extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C50740Jvk LJLIL = new C50740Jvk();

    public C50740Jvk() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("SearchCoinHelper");
    }
}
