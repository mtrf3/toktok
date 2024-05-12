package X;

import Y.IDbS399S0100000_10;
import Y.IDcS134S0200000_10;
import com.bytedance.im.core.proto.ParticipantReadIndex;
import java.util.List;

/* renamed from: X.Orf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63227Orf implements InterfaceC86963bA<List<ParticipantReadIndex>> {
    public final /* synthetic */ C109544Rq LIZ;
    public final /* synthetic */ InterfaceC86963bA LIZIZ;
    public final /* synthetic */ C63220OrY LIZJ;

    @Override // X.InterfaceC86963bA
    public final void LIZIZ(C63623Oy3 c63623Oy3) {
        this.LIZJ.LIZLLL(this.LIZIZ, this.LIZ);
    }

    @Override // X.InterfaceC86963bA
    public final void onSuccess(List<ParticipantReadIndex> list) {
        RunnableC63345OtZ.LIZLLL(new IDcS134S0200000_10(this, list, 0), new IDbS399S0100000_10(this, 1), C63346Ota.LIZ());
    }

    public C63227Orf(C102033zT c102033zT, C109544Rq c109544Rq, C63222Ora c63222Ora) {
        this.LIZJ = c63222Ora;
        this.LIZ = c109544Rq;
        this.LIZIZ = c102033zT;
    }
}
