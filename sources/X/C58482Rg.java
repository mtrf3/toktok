package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2Rg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C58482Rg extends AbstractC65781Prl implements InterfaceC88472Yns<OSZ<? extends Long, ? extends Long>, CharSequence> {
    public static final C58482Rg LJLIL = new C58482Rg();

    public C58482Rg() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(OSZ<? extends Long, ? extends Long> osz) {
        OSZ<? extends Long, ? extends Long> it = osz;
        o.LJIIIZ(it, "it");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("{\"gift_id\":");
        LIZ.append(it.getFirst().longValue());
        LIZ.append(",\"send_time\":");
        LIZ.append(it.getSecond().longValue());
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }
}
