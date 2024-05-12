package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Lbq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54602Lbq extends F9E implements InterfaceC87283bg {
    public final String LJLIL;
    public final C54406LWw LJLILLLLZI;

    public C54602Lbq() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public /* synthetic */ C54602Lbq(int i) {
        this("", new C54406LWw());
    }

    public C54602Lbq(String enterFrom, C54406LWw config) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(config, "config");
        this.LJLIL = enterFrom;
        this.LJLILLLLZI = config;
    }
}
