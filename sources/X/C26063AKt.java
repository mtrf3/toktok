package X;

import com.bytedance.keva.Keva;

/* renamed from: X.AKt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26063AKt extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C26063AKt LJLIL = new C26063AKt();

    public C26063AKt() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("web_creation_keva_repo");
    }
}
