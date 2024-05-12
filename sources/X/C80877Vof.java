package X;

/* renamed from: X.Vof, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80877Vof extends QXX {
    @Override // X.QXX
    public final float LLJJIJI(Object obj) {
        return ((C80874Voc) obj).LJLLLL * 10000.0f;
    }

    @Override // X.QXX
    public final void LLLLL(float f, Object obj) {
        C80874Voc c80874Voc = (C80874Voc) obj;
        c80874Voc.LJLLLL = f / 10000.0f;
        c80874Voc.invalidateSelf();
    }
}
