package X;

import kotlin.jvm.internal.o;

/* renamed from: X.YZn, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87599YZn extends AbstractC87590YZe {
    public final String toString() {
        return "New";
    }

    @Override // X.AbstractC87590YZe, X.InterfaceC87609YZx
    public final void start() {
        InterfaceC87606YZu<AbstractC87590YZe> interfaceC87606YZu = this.LIZ;
        interfaceC87606YZu.LIZIZ(new C87596YZk(interfaceC87606YZu));
        this.LIZ.onStart();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C87599YZn(InterfaceC87606YZu<AbstractC87590YZe> context) {
        super(context, false);
        o.LJIIIZ(context, "context");
    }
}
