package X;

import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: X.SIb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71857SIb implements InterfaceC71856SIa {
    public final /* synthetic */ LinearLayoutManager LIZ;
    public final /* synthetic */ TEZ LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ InterfaceC74343TFr LJ;
    public final /* synthetic */ String LJFF;

    @Override // X.InterfaceC71856SIa
    public final void onSuccess() {
        this.LIZ.LLILL();
        this.LIZIZ.LJJJJZ();
        String valueOf = String.valueOf(this.LIZJ);
        this.LIZIZ.LJJJJZ();
        String valueOf2 = String.valueOf(this.LIZLLL);
        InterfaceC74343TFr interfaceC74343TFr = this.LJ;
        if (interfaceC74343TFr != null) {
            String str = this.LJFF;
            if (str == null) {
                str = "";
            }
            interfaceC74343TFr.LJIIJ(str, valueOf, valueOf2, (int) SIZ.LIZ(this.LIZIZ.LJJJJJL()), SIZ.LIZLLL.LIZIZ(), this.LIZ);
        }
        SIZ.LIZIZ = SIZ.LIZ;
    }

    public C71857SIb(LinearLayoutManager linearLayoutManager, InterfaceC74343TFr interfaceC74343TFr, TEZ tez, String str, String str2, String str3) {
        this.LIZ = linearLayoutManager;
        this.LIZIZ = tez;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = interfaceC74343TFr;
        this.LJFF = str3;
    }
}
