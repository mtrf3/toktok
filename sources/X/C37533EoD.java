package X;

/* renamed from: X.EoD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37533EoD implements InterfaceC37408EmC<InterfaceC37599EpH> {
    @Override // X.InterfaceC37408EmC
    public final /* bridge */ /* synthetic */ InterfaceC37599EpH create() {
        return null;
    }

    @Override // X.InterfaceC37408EmC
    public final InterfaceC37599EpH LIZ(Object obj) {
        if (!(obj instanceof C37531EoB)) {
            C37507Enn.LIZ("Create ResourceLoader error, the context is not valid.");
            return null;
        }
        C37531EoB c37531EoB = (C37531EoB) obj;
        InterfaceC61488OBg LIZIZ = C60905NvJ.LIZIZ(c37531EoB.LIZ, null);
        if (LIZIZ == null) {
            C37507Enn.LIZ("Create ResourceLoader error, the resource service is null.");
            return null;
        }
        return new C38511F9n(LIZIZ, c37531EoB);
    }
}
