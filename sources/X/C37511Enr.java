package X;

/* renamed from: X.Enr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37511Enr implements InterfaceC37408EmC<java.util.Map<String, ?>> {
    @Override // X.InterfaceC37408EmC
    public final /* bridge */ /* synthetic */ java.util.Map<String, ?> create() {
        return null;
    }

    @Override // X.InterfaceC37408EmC
    public final java.util.Map<String, ?> LIZ(Object obj) {
        if (!(obj instanceof C37531EoB)) {
            C37507Enn.LIZ("Create GlobalProps error, the context is not valid.");
        } else {
            C60607NqV c60607NqV = ((C37531EoB) obj).LIZIZ;
            if (c60607NqV == null) {
                C37507Enn.LIZ("Create GlobalProps error, the initParams is null.");
            } else {
                return c60607NqV.LJI();
            }
        }
        return null;
    }
}
