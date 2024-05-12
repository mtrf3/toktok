package X;

import com.bytedance.keva.Keva;

/* renamed from: X.58X, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C58X extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C58X LJLIL = new C58X();

    public C58X() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("EditorProKeva");
    }
}
