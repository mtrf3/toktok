package X;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.IDqS420S0100000;

/* renamed from: X.1Qk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32781Qk implements InterfaceC12390eB {
    public final C62822Ol8 LIZ;
    public final C62822Ol8 LIZIZ;
    public final C62822Ol8 LIZJ;

    @Override // X.InterfaceC12390eB
    public final InterfaceC12390eB LIZ() {
        return (InterfaceC12390eB) this.LIZIZ.getValue();
    }

    @Override // X.InterfaceC12390eB
    public final C12410eD LIZIZ() {
        return (C12410eD) this.LIZ.getValue();
    }

    @Override // X.InterfaceC12390eB
    public final WeakReference<?> getHost() {
        return (WeakReference) this.LIZJ.getValue();
    }

    public C32781Qk(C18090nN c18090nN) {
        this.LIZ = C221108m2.LIZIZ(new IDqS420S0100000(c18090nN, 112));
        this.LIZIZ = C221108m2.LIZIZ(new IDqS420S0100000(c18090nN, 113));
        this.LIZJ = C221108m2.LIZIZ(new IDqS420S0100000(c18090nN, 111));
    }
}
