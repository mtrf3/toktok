package X;

import Y.IDbS399S0100000_10;
import Y.IDcS134S0200000_10;
import com.bytedance.im.core.proto.ParticipantMinIndex;
import java.util.List;

/* renamed from: X.Orh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63229Orh implements InterfaceC86963bA<List<ParticipantMinIndex>> {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ InterfaceC86963bA LIZIZ;
    public final /* synthetic */ C109544Rq LIZJ;
    public final /* synthetic */ C63220OrY LIZLLL;

    @Override // X.InterfaceC86963bA
    public final void LIZIZ(C63623Oy3 c63623Oy3) {
        this.LIZLLL.LIZLLL(this.LIZIZ, this.LIZJ);
    }

    @Override // X.InterfaceC86963bA
    public final void onSuccess(List<ParticipantMinIndex> list) {
        RunnableC63345OtZ.LIZLLL(new IDcS134S0200000_10(this, list, 5), new IDbS399S0100000_10(this, 7), C63346Ota.LIZ());
    }

    public C63229Orh(C63220OrY c63220OrY, String str, InterfaceC86963bA interfaceC86963bA, C109544Rq c109544Rq) {
        this.LIZLLL = c63220OrY;
        this.LIZ = str;
        this.LIZIZ = interfaceC86963bA;
        this.LIZJ = c109544Rq;
    }
}
