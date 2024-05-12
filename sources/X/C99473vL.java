package X;

import com.ss.android.ugc.aweme.im.sdk.chat.data.model.FakeMessage;

/* renamed from: X.3vL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C99473vL extends AbstractC65781Prl implements InterfaceC65784Pro<C109544Rq> {
    public static final C99473vL LJLIL = new C99473vL();

    public C99473vL() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C109544Rq invoke() {
        FakeMessage.Builder builder = new FakeMessage.Builder();
        builder.msgType(4002);
        return builder.build();
    }
}
