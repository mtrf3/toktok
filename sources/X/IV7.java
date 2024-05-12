package X;

/* loaded from: classes9.dex */
public final class IV7<T> implements InterfaceC64592gB {
    public static final IV7<T> LJLIL = new IV7<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        boolean z;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (!C46416IJo.LIZIZ()) {
            z = false;
        } else {
            z = true;
        }
        if (booleanValue && !z) {
            IV8.LIZ();
            return;
        }
        AbstractC73391SrD<Long> abstractC73391SrD = IV8.LIZLLL;
        if (abstractC73391SrD == null) {
            return;
        }
        abstractC73391SrD.dispose();
        IV8.LIZLLL = null;
    }
}
