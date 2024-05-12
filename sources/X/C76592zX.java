package X;

import com.bytedance.keva.Keva;

/* renamed from: X.2zX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76592zX extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C76592zX LJLIL = new C76592zX();

    public C76592zX() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("recommended_chats_with_low_active_users");
    }
}
