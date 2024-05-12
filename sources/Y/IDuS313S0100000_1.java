package Y;

import X.AbstractC73672Svk;
import X.C111144Xu;
import X.C116524hk;
import X.C3GF;
import X.C68322mC;
import X.C73433Srt;
import X.C73454SsE;
import X.C73969T1h;
import X.C78613UtF;
import X.C89763fg;
import X.C89793fj;
import X.InterfaceC70422pa;
import X.InterfaceC73573Su9;
import X.InterfaceC86003Zc;
import X.T16;
import X.XKX;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.qainvitation.model.InvitedYouUserListData;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.AqS132S0200000_1;

/* loaded from: classes2.dex */
public class IDuS313S0100000_1 implements InterfaceC86003Zc {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<C111144Xu> interfaceC73573Su9) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, interfaceC73573Su9);
                return;
            case 1:
                subscribe$1(this, interfaceC73573Su9);
                return;
            case 2:
                subscribe$2(this, interfaceC73573Su9);
                return;
            case 3:
                subscribe$3(this, interfaceC73573Su9);
                return;
            default:
                return;
        }
    }

    public IDuS313S0100000_1(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void subscribe$0(IDuS313S0100000_1 iDuS313S0100000_1, InterfaceC73573Su9 interfaceC73573Su9) {
        C3GF imUserService = IMService.createIIMServicebyMonsterPlugin(false).getImUserService();
        Aweme aweme = (Aweme) iDuS313S0100000_1.l0;
        imUserService.LJIJ(aweme, new AqS132S0200000_1((C73433Srt) interfaceC73573Su9, aweme, 29));
    }

    public static final void subscribe$1(IDuS313S0100000_1 iDuS313S0100000_1, InterfaceC73573Su9 interfaceC73573Su9) {
        try {
            XKX.LIZLLL((InterfaceC70422pa) iDuS313S0100000_1.l0, C78613UtF.LIZJ, null, new C116524hk(interfaceC73573Su9, null), 2);
        } catch (Exception unused) {
            interfaceC73573Su9.onComplete();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void subscribe$2(IDuS313S0100000_1 iDuS313S0100000_1, InterfaceC73573Su9 interfaceC73573Su9) {
        AbstractC73672Svk<InvitedYouUserListData> LJJIJIL;
        C89793fj c89793fj = (C89793fj) iDuS313S0100000_1.l0;
        try {
            LJJIJIL = C89763fg.LIZ().getInvitedList(c89793fj.LIZJ, c89793fj.LIZIZ, c89793fj.LJFF, 30);
        } catch (ExecutionException unused) {
            LJJIJIL = AbstractC73672Svk.LJJIJIL(new InvitedYouUserListData(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0));
        }
        C73454SsE LJJJ = LJJIJIL.LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ());
        C89793fj c89793fj2 = (C89793fj) iDuS313S0100000_1.l0;
        C73433Srt c73433Srt = (C73433Srt) interfaceC73573Su9;
        ((C89793fj) iDuS313S0100000_1.l0).LIZ.LIZ(LJJJ.LJJJLIIL(new AfS50S0200000_1(c89793fj2, c73433Srt, 11), new AfS50S0200000_1(c89793fj2, c73433Srt, 12)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void subscribe$3(IDuS313S0100000_1 iDuS313S0100000_1, InterfaceC73573Su9 interfaceC73573Su9) {
        ((C68322mC) iDuS313S0100000_1.l0).element = interfaceC73573Su9;
    }
}
