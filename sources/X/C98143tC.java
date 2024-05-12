package X;

import com.bytedance.keva.Keva;

/* renamed from: X.3tC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C98143tC extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C98143tC LJLIL = new C98143tC();

    public C98143tC() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("im_session_group_repo");
    }
}
