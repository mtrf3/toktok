package X;

import com.bytedance.android.live.liveinteract.match.business.event.BattleInvitingTimeLeftChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AqS163S0100000_13;

/* renamed from: X.TxC, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76310TxC implements InterfaceC29937Boz {
    public final /* synthetic */ C76278Twg LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ boolean LIZJ;

    public C76310TxC(C76278Twg c76278Twg, int i, boolean z) {
        this.LIZ = c76278Twg;
        this.LIZIZ = i;
        this.LIZJ = z;
    }

    @Override // X.InterfaceC29937Boz
    public final void run() {
        C76278Twg c76278Twg = this.LIZ;
        C56085Lzl c56085Lzl = c76278Twg.LJJ;
        c56085Lzl.LJLILLLLZI = false;
        c56085Lzl.LJLJI = -1;
        DataChannel LJI = c76278Twg.LJI();
        if (LJI != null) {
            LJI.rv0(BattleInvitingTimeLeftChannel.class, 0L);
        }
        InterfaceC76311TxD interfaceC76311TxD = (InterfaceC76311TxD) this.LIZ.LIZLLL;
        if (interfaceC76311TxD != null) {
            interfaceC76311TxD.LJLLLL(3);
        }
        if (this.LIZIZ == 0) {
            C76278Twg c76278Twg2 = this.LIZ;
            C76278Twg.LJIJ(0, 6, 0L, c76278Twg2, new AqS163S0100000_13(c76278Twg2, 280), this.LIZJ);
            return;
        }
        EnumC76178Tv4 LJ = C76265TwT.LIZ.LJ();
        EnumC76178Tv4 LJ2 = C76265TwT.LIZIZ.LJ();
        EnumC76178Tv4 enumC76178Tv4 = EnumC76178Tv4.ACCEPTED;
        if (LJ == enumC76178Tv4 || LJ2 == enumC76178Tv4) {
            return;
        }
        this.LIZ.LJJIZ(this.LIZJ, 3, 0L, C76361Ty1.LJLIL);
    }
}
