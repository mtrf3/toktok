package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.B83;
import X.C0NB;
import X.C16880lQ;
import X.C29374Bfu;
import X.C31012CFc;
import X.C32014ChO;
import X.C73318Sq2;
import X.C73671Svj;
import X.C76762UAs;
import X.C76800UCe;
import X.C76857UEj;
import X.CN1;
import X.InterfaceC65784Pro;
import X.InterfaceC76768UAy;
import X.InterfaceC92693kP;
import X.Q7L;
import X.T16;
import X.U4R;
import X.U7T;
import X.UA9;
import X.UC0;
import X.UC6;
import X.UCC;
import X.X1D;
import Y.ARunnableS0S1200200_13;
import Y.AfS5S1100100_13;
import Y.AfS62S0200000_13;
import Y.AfS65S0100000_13;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RechargeResult;
import com.bytedance.android.livesdk.comp.impl.linkcore.api.LinkMicApi;
import com.bytedance.android.livesdk.model.message.linkcore.LinkCommon;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import tikcast.linkmic.controller.RechargeReq;

/* loaded from: classes14.dex */
public class AqS67S1200000_13 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public final void invoke$0() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("queryForCheck handle IO finished");
        LIZ.append(this.s0);
        LIZ.append(' ');
        LIZ.append(C16880lQ.LLLLIIIILLL().getName());
        C0NB.LJIIIZ("LiveDslManagerV2", X1D.LIZIZ(LIZ));
        if (((UCC) this.l1).LIZJ.get(this.s0) == null) {
            ((UCC) this.l1).getClass();
            String LJIIIIZZ = UCC.LJIIIIZZ(109);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("queryForCheck there isn't a layout for ");
            LIZ2.append(this.s0);
            C32014ChO.LIZJ(LJIIIIZZ, X1D.LIZIZ(LIZ2), null);
            return;
        }
        ((UC6) this.l2).LIZ(((UCC) this.l1).LIZJ.get(this.s0));
    }

    public static final Object invoke$0(AqS67S1200000_13 aqS67S1200000_13) {
        long j;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("recharge dealing source=");
        LIZ.append(aqS67S1200000_13.s0);
        U4R.LIZLLL("Linker", X1D.LIZIZ(LIZ));
        Room room = ((U7T) aqS67S1200000_13.l1).LJ;
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        long appId = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).appId();
        long liveId = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).liveId();
        RechargeReq rechargeReq = new RechargeReq();
        U7T u7t = (U7T) aqS67S1200000_13.l1;
        String str = aqS67S1200000_13.s0;
        LinkCommon linkCommon = new LinkCommon(0, 0L, 0L, null, null, 31, null);
        linkCommon.scene = u7t.LJFF;
        linkCommon.appId = appId;
        linkCommon.live_id = liveId;
        linkCommon.source = str;
        linkCommon.extraMap = null;
        rechargeReq.common = linkCommon;
        rechargeReq.myself = new Player(j, ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
        rechargeReq.channelId = u7t.LJI;
        rechargeReq.target = null;
        rechargeReq.type = 3;
        long LIZIZ = C31012CFc.LIZIZ();
        U7T linker = (U7T) aqS67S1200000_13.l1;
        long currentTimeMillis = System.currentTimeMillis();
        String source = aqS67S1200000_13.s0;
        o.LJIIIZ(linker, "linker");
        o.LJIIIZ(source, "source");
        C76762UAs LIZJ = UA9.LIZJ();
        LIZJ.getClass();
        UC0.LJJLIIIIJ(new ARunnableS0S1200200_13(linker, source, LIZJ, LIZIZ, currentTimeMillis, 1));
        InterfaceC92693kP LJIIJJI = new C73671Svj(C76857UEj.LJII(((LinkMicApi) Q7L.LIZIZ(LinkMicApi.class)).recharge(rechargeReq), "recharge").LJIILIIL(new AfS5S1100100_13(LIZIZ, aqS67S1200000_13.s0, (U7T) aqS67S1200000_13.l1, 1)).LJIIJ(new AfS5S1100100_13(LIZIZ, aqS67S1200000_13.s0, (U7T) aqS67S1200000_13.l1, 2)).LJJIIJ(T16.LIZ()).LJIILIIL(new AfS62S0200000_13((U7T) aqS67S1200000_13.l1, (InterfaceC76768UAy) aqS67S1200000_13.l2, 31)).LJIIJ(new AfS65S0100000_13((InterfaceC76768UAy) aqS67S1200000_13.l2, 150))).LJIIIIZZ().LJIIJJI();
        C73318Sq2 compositeDisposable = ((U7T) aqS67S1200000_13.l1).LJIILL;
        o.LJIIIZ(compositeDisposable, "compositeDisposable");
        compositeDisposable.LIZ(LJIIJJI);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AqS67S1200000_13 aqS67S1200000_13) {
        aqS67S1200000_13.invoke$0();
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS67S1200000_13(String str, String str2, U7T u7t, InterfaceC76768UAy<RechargeResult> interfaceC76768UAy) {
        super(0);
        this.$t = interfaceC76768UAy;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = u7t;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS67S1200000_13(String str, UCC ucc, UC6 uc6, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = ucc;
        this.l2 = uc6;
    }
}
