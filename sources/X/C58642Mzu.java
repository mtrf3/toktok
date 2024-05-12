package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Mzu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58642Mzu extends AbstractC65781Prl implements InterfaceC88472Yns<M95, Long> {
    public static final C58642Mzu LJLIL = new C58642Mzu();

    public C58642Mzu() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Long invoke(M95 m95) {
        M95 longOptional = m95;
        o.LJIIIZ(longOptional, "$this$longOptional");
        Object LIZ = longOptional.LIZ(InterfaceC58799N5v.class);
        if (LIZ != null) {
            return Long.valueOf(((InterfaceC58799N5v) LIZ).getVideoLength());
        }
        throw new C58623Mzb(InterfaceC58799N5v.class);
    }
}
