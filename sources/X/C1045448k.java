package X;

import kotlin.jvm.internal.o;

/* renamed from: X.48k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1045448k extends F9E implements C33Q {
    public final java.util.Set<C109544Rq> LJLIL;

    public C1045448k() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1045448k(java.util.Set<? extends C109544Rq> selectedMessages) {
        o.LJIIIZ(selectedMessages, "selectedMessages");
        this.LJLIL = selectedMessages;
    }

    public C1045448k(int i) {
        this(OQY.INSTANCE);
    }
}
