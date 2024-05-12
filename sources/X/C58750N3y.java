package X;

import kotlin.jvm.internal.o;

/* renamed from: X.N3y, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58750N3y extends AbstractC65781Prl implements InterfaceC88472Yns<M95, String> {
    public static final C58750N3y LJLIL = new C58750N3y();

    public C58750N3y() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final String invoke(M95 m95) {
        Object obj;
        M95 $receiver = m95;
        o.LJIIIZ($receiver, "$this$$receiver");
        OSZ osz = (OSZ) $receiver.LIZ(OSZ.class);
        if (osz != null) {
            obj = osz.getSecond();
        } else {
            obj = null;
        }
        return String.valueOf(obj);
    }
}
