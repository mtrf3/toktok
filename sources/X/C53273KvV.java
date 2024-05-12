package X;

import com.bytedance.keva.Keva;

/* renamed from: X.KvV, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53273KvV extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C53273KvV LJLIL = new C53273KvV();

    public C53273KvV() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (C53282Kve.LIZ()) {
            Keva repo = Keva.getRepo("is_support_invite_friends");
            boolean z2 = repo.getBoolean("is_support_invite_friends_channel", true);
            if (z2) {
                repo.storeBoolean("is_support_invite_friends_channel", false);
            }
            z = z2;
        }
        return Boolean.valueOf(z);
    }
}
