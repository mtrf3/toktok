package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3ry, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C97383ry extends F9E {
    public final boolean LJLIL;
    public final C63120Opw LJLILLLLZI;
    public final C3LK LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), this.LJLILLLLZI, this.LJLJI};
    }

    public static C97383ry L(C97383ry c97383ry, boolean z) {
        C63120Opw conversation = c97383ry.LJLILLLLZI;
        C3LK messageRequestSession = c97383ry.LJLJI;
        c97383ry.getClass();
        o.LJIIIZ(conversation, "conversation");
        o.LJIIIZ(messageRequestSession, "messageRequestSession");
        return new C97383ry(z, conversation, messageRequestSession);
    }

    public C97383ry(boolean z, C63120Opw conversation, C3LK c3lk) {
        o.LJIIIZ(conversation, "conversation");
        this.LJLIL = z;
        this.LJLILLLLZI = conversation;
        this.LJLJI = c3lk;
    }
}
