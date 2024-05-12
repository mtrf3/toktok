package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Bo1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC29877Bo1 implements InterfaceC29920Boi {
    public final int LJLIL = 4;

    @Override // X.InterfaceC29920Boi
    public final int getPriority() {
        return this.LJLIL;
    }

    @Override // java.lang.Comparable
    public final int compareTo(InterfaceC29920Boi interfaceC29920Boi) {
        InterfaceC29920Boi another = interfaceC29920Boi;
        o.LJIIIZ(another, "another");
        return this.LJLIL - another.getPriority();
    }
}
