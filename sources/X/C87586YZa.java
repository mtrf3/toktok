package X;

import kotlin.jvm.internal.o;

/* renamed from: X.YZa, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87586YZa extends AbstractC87589YZd {
    public final String toString() {
        return "New";
    }

    @Override // X.AbstractC87589YZd, X.InterfaceC87609YZx
    public final void start() {
        InterfaceC87606YZu<AbstractC87589YZd> interfaceC87606YZu = this.LIZ;
        interfaceC87606YZu.LIZIZ(new YZY(interfaceC87606YZu));
        this.LIZ.onStart();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C87586YZa(InterfaceC87606YZu<AbstractC87589YZd> context) {
        super(context, false);
        o.LJIIIZ(context, "context");
    }
}
