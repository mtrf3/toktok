package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1xe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49941xe extends AbstractC65781Prl implements InterfaceC88471Ynr<C0MK, C08350Ul, Object> {
    public static final C49941xe LJLIL = new C49941xe();

    public C49941xe() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(C0MK Saver, C08350Ul c08350Ul) {
        long j = c08350Ul.LIZ;
        o.LJIIIZ(Saver, "$this$Saver");
        return C47261Igj.LJII(Integer.valueOf((int) (j >> 32)), Integer.valueOf(C08350Ul.LIZJ(j)));
    }
}
