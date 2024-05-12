package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Orj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63231Orj implements InterfaceC86963bA<Object> {
    public final /* synthetic */ List LIZ;
    public final /* synthetic */ java.util.Map LIZIZ;
    public final /* synthetic */ int LIZJ;
    public final /* synthetic */ C63220OrY LIZLLL;

    @Override // X.InterfaceC86963bA
    public final void LIZIZ(C63623Oy3 c63623Oy3) {
        C63322OtC.LIZLLL("MessageModel sortByDescending onFailure");
    }

    @Override // X.InterfaceC86963bA
    public final void onSuccess(Object obj) {
        C63220OrY c63220OrY = this.LIZLLL;
        if (c63220OrY.LJLJJL) {
            Iterator it = ((ArrayList) c63220OrY.LIZIZ()).iterator();
            while (it.hasNext()) {
                ((InterfaceC63226Ore) it.next()).X8(this.LIZIZ, this.LIZJ, this.LIZ);
            }
            return;
        }
        InterfaceC63226Ore interfaceC63226Ore = c63220OrY.LJLJJI;
        if (interfaceC63226Ore != null) {
            interfaceC63226Ore.X8(this.LIZIZ, this.LIZJ, this.LIZ);
        }
    }

    public C63231Orj(C63220OrY c63220OrY, List list, java.util.Map map, int i) {
        this.LIZLLL = c63220OrY;
        this.LIZ = list;
        this.LIZIZ = map;
        this.LIZJ = i;
    }
}
