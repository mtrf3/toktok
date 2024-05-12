package X;

import com.bytedance.keva.Keva;

/* renamed from: X.EdL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36859EdL extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C36859EdL LJLIL = new C36859EdL();

    public C36859EdL() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("zero_rating_repo");
    }
}
