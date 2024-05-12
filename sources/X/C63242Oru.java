package X;

import java.util.List;

/* renamed from: X.Oru, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63242Oru implements InterfaceC86963bA {
    public final /* synthetic */ List LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ C107074Id LIZJ;
    public final /* synthetic */ C63220OrY LIZLLL;

    @Override // X.InterfaceC86963bA
    public final void LIZIZ(C63623Oy3 c63623Oy3) {
        this.LIZLLL.LJIILIIL(this.LIZ, this.LIZIZ, this.LIZJ);
    }

    @Override // X.InterfaceC86963bA
    public final void onSuccess(Object obj) {
        this.LIZLLL.LJIILIIL(this.LIZ, this.LIZIZ, this.LIZJ);
    }

    public C63242Oru(C63220OrY c63220OrY, List list, int i, C107074Id c107074Id) {
        this.LIZLLL = c63220OrY;
        this.LIZ = list;
        this.LIZIZ = i;
        this.LIZJ = c107074Id;
    }
}
