package X;

import com.ss.android.ugc.aweme.im.sdk.chat.data.model.FakeMessage;

/* renamed from: X.3vm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C99743vm extends AbstractC65781Prl implements InterfaceC65784Pro<C109544Rq> {
    public static final C99743vm LJLIL = new C99743vm();

    public C99743vm() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C109544Rq invoke() {
        FakeMessage.Builder builder = new FakeMessage.Builder();
        builder.msgType(4001);
        C109544Rq build = builder.build();
        build.setUuid("profile-message");
        return build;
    }
}
