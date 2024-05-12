package X;

import kotlin.jvm.internal.o;

/* renamed from: X.4Ro, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C109524Ro extends AbstractC65781Prl implements InterfaceC65784Pro<C109514Rn> {
    public static final C109524Ro LJLIL = new C109524Ro();

    public C109524Ro() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.4Rn] */
    @Override // X.InterfaceC65784Pro
    public final C109514Rn invoke() {
        return new InterfaceC109534Rp() { // from class: X.4Rn
            @Override // X.InterfaceC109534Rp
            public final long LIZ(C63120Opw conversation) {
                o.LJIIIZ(conversation, "conversation");
                return conversation.getLastMessageIndex() + 1;
            }

            @Override // X.InterfaceC109534Rp
            public final long LIZIZ(C63120Opw conversation) {
                o.LJIIIZ(conversation, "conversation");
                return conversation.getLastMessageOrderIndex() + 1;
            }
        };
    }
}
