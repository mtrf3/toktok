package X;

import kotlin.jvm.internal.o;

/* renamed from: X.IwO, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48232IwO extends AbstractC65781Prl implements InterfaceC88472Yns<OSZ<? extends Integer, ? extends C48231IwN>, CharSequence> {
    public static final C48232IwO LJLIL = new C48232IwO();

    public C48232IwO() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(OSZ<? extends Integer, ? extends C48231IwN> osz) {
        OSZ<? extends Integer, ? extends C48231IwN> it = osz;
        o.LJIIIZ(it, "it");
        try {
            C48231IwN second = it.getSecond();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(second.LJLIL);
            LIZ.append('|');
            LIZ.append(second.LJLILLLLZI);
            LIZ.append('|');
            LIZ.append((int) (second.LJLJI / 1000));
            LIZ.append('|');
            LIZ.append(it.getFirst().intValue());
            LIZ.append('|');
            LIZ.append(second.LJLJJL);
            return X1D.LIZIZ(LIZ);
        } catch (Exception e) {
            C36922EeM.LIZ(e);
            return "";
        }
    }
}
