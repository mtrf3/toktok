package X;

import com.bytedance.keva.Keva;

/* renamed from: X.Edd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36877Edd extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C36877Edd LJLIL = new C36877Edd();

    public C36877Edd() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("UnLoginDiggManager");
    }
}
