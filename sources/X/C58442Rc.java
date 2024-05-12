package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2Rc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C58442Rc extends AbstractC65781Prl implements InterfaceC88472Yns<OSZ<? extends Long, ? extends Long>, CharSequence> {
    public static final C58442Rc LJLIL = new C58442Rc();

    public C58442Rc() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(OSZ<? extends Long, ? extends Long> osz) {
        OSZ<? extends Long, ? extends Long> it = osz;
        o.LJIIIZ(it, "it");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(it.getFirst().longValue());
        LIZ.append(',');
        LIZ.append(it.getSecond().longValue());
        return X1D.LIZIZ(LIZ);
    }
}
