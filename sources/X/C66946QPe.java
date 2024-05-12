package X;

import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.QPe, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66946QPe implements InterfaceC67043QSx {
    public final C66947QPf LJLIL;
    public volatile QOL LJLILLLLZI;
    public volatile InterfaceC66942QPa LJLJI;

    @Override // X.InterfaceC67043QSx
    public final void LJ() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.LJLIL.LJLJJLL);
        HashMap hashMap = new HashMap();
        QJY.LJI(hashMap, false);
        QOD qod = new QOD(8001);
        C66947QPf c66947QPf = this.LJLIL;
        qod.LJII = c66947QPf.LJLJJL;
        qod.LJFF = c66947QPf.LJLJJI;
        qod.LJ = c66947QPf.LJLIL;
        qod.LJI = (int) EF7.LJI();
        C66947QPf c66947QPf2 = this.LJLIL;
        qod.LJIIIIZZ = c66947QPf2.LJLILLLLZI;
        qod.LJIIIZ = c66947QPf2.LJLJI;
        ((ArrayList) qod.LIZLLL).addAll(arrayList);
        ((HashMap) qod.LIZIZ).putAll(hashMap);
        QOX LIZ = qod.LIZ();
        QOL qol = this.LJLILLLLZI;
        if (qol != null) {
            qol.LIZJ();
        }
        this.LJLILLLLZI = QOV.LIZJ(EF7.LIZIZ(), LIZ, new C66945QPd(this));
    }

    @Override // X.InterfaceC67043QSx
    public final int LJJLI() {
        QOL qol = this.LJLILLLLZI;
        if (qol != null) {
            return qol.LIZ.LIZ;
        }
        return 8001;
    }

    @Override // X.InterfaceC67043QSx
    public final boolean isConnected() {
        QOL qol = this.LJLILLLLZI;
        if (qol == null || qol.LJFF != EnumC66933QOr.CONNECTED) {
            return false;
        }
        return true;
    }

    public C66946QPe(C66947QPf c66947QPf) {
        this.LJLIL = c66947QPf;
        IAccountService LJIJ = AccountService.LJIJ();
        if (LJIJ != null) {
            LJIJ.LJIILJJIL(new C66948QPg(this));
        }
    }

    @Override // X.InterfaceC67043QSx
    public final void LIZIZ(WsChannelMsg wsChannelMsg) {
        C66949QPh c66949QPh = C66949QPh.LIZ;
        QOL qol = this.LJLILLLLZI;
        if (qol != null) {
            qol.LIZIZ(wsChannelMsg, c66949QPh);
        }
    }

    @Override // X.InterfaceC67043QSx
    public final void LIZJ(C67036QSq c67036QSq) {
        this.LJLJI = c67036QSq;
    }
}
