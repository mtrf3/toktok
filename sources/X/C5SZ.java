package X;

import com.bytedance.keva.Keva;

/* renamed from: X.5SZ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5SZ extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C5SZ LJLIL = new C5SZ();

    public C5SZ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("EditorProKeva");
    }
}
