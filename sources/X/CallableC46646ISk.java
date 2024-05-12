package X;

import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;

/* renamed from: X.ISk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class CallableC46646ISk implements Callable<C46648ISm> {
    public final /* synthetic */ InterfaceC46645ISj LJLIL;
    public final /* synthetic */ SimVideoUrlModel LJLILLLLZI;
    public final /* synthetic */ C46539IOh LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ ISP LJLJJL;
    public final /* synthetic */ Long LJLJJLL;
    public final /* synthetic */ HashMap LJLJL;

    @Override // java.util.concurrent.Callable
    public final C46648ISm call() {
        int i;
        int LIZIZ;
        float LIZIZ2;
        JSONArray jSONArray;
        ITI iti;
        C46651ISp c46651ISp;
        List<C87748YcC> list;
        String LIZIZ3;
        List<SimBitRate> bitRate;
        InterfaceC46645ISj interfaceC46645ISj = this.LJLIL;
        if (interfaceC46645ISj != null && interfaceC46645ISj.LIZLLL()) {
            i = 1;
        } else {
            i = 0;
        }
        InterfaceC46645ISj interfaceC46645ISj2 = this.LJLIL;
        int i2 = -1;
        if (interfaceC46645ISj2 == null) {
            LIZIZ = -1;
        } else {
            LIZIZ = (int) interfaceC46645ISj2.LIZIZ(11);
        }
        InterfaceC46645ISj interfaceC46645ISj3 = this.LJLIL;
        if (interfaceC46645ISj3 == null) {
            LIZIZ2 = 1.0f;
        } else {
            LIZIZ2 = interfaceC46645ISj3.LIZIZ(12);
        }
        SimVideoUrlModel simVideoUrlModel = this.LJLILLLLZI;
        List<C47462Ijy> list2 = null;
        if (simVideoUrlModel != null && (bitRate = simVideoUrlModel.getBitRate()) != null && bitRate.size() > 0) {
            jSONArray = new JSONArray();
            Iterator<SimBitRate> it = bitRate.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().getGearName());
            }
        } else {
            jSONArray = null;
        }
        InterfaceC46645ISj interfaceC46645ISj4 = this.LJLIL;
        if (interfaceC46645ISj4 != null) {
            iti = interfaceC46645ISj4.getVideoInfo();
        } else {
            iti = null;
        }
        C46649ISn c46649ISn = new C46649ISn();
        InterfaceC46645ISj interfaceC46645ISj5 = this.LJLJI.LJLJLJ;
        if (interfaceC46645ISj5 != null) {
            c46649ISn = interfaceC46645ISj5.LJIIIIZZ(this.LJLJJI);
        }
        ISP isp = this.LJLJJL;
        C123724tM c123724tM = C123734tN.LIZIZ;
        isp.LIZ.LIZ = c123724tM.containsKey(this.LJLJJI) ? 1 : 0;
        SimVideoUrlModel simVideoUrlModel2 = this.LJLILLLLZI;
        if (simVideoUrlModel2 != null) {
            i2 = C47242IgQ.LIZ().cacheSize(simVideoUrlModel2);
        }
        long j = i2;
        C46648ISm c46648ISm = isp.LIZ;
        c46648ISm.LIZLLL = j;
        c46648ISm.LJFF = i;
        c46648ISm.LJII = LIZIZ;
        c46648ISm.LJI = LIZIZ2;
        isp.LIZ.LJIIJ = C47242IgQ.LIZ().getNetworkLibName();
        if (iti == null || iti.LJI == null) {
            c46651ISp = null;
        } else {
            c46651ISp = new C46651ISp();
        }
        isp.LIZ.LJIIL = c46651ISp;
        SimVideoUrlModel simVideoUrlModel3 = this.LJLILLLLZI;
        if (simVideoUrlModel3 != null) {
            list = C47242IgQ.LIZ().getRequestInfoList(simVideoUrlModel3);
        } else {
            list = null;
        }
        isp.LIZ.LJIILIIL = list;
        if (IZ8.LJJJJJL()) {
            LIZIZ3 = C46664ITc.LJIJ.LJIIIZ(this.LJLJJI);
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LJLJJLL);
            LIZ.append("");
            LIZIZ3 = X1D.LIZIZ(LIZ);
        }
        C46648ISm c46648ISm2 = isp.LIZ;
        c46648ISm2.LJIIJJI = LIZIZ3;
        c46648ISm2.LJIILL = jSONArray;
        c46648ISm2.LJJI = c46649ISn.LIZIZ;
        c46648ISm2.LJJIII = c46649ISn.LJI;
        c46648ISm2.LJJIIZ = c46649ISn.LIZJ;
        c46648ISm2.LJJIIJZLJL = c46649ISn.LIZ;
        c46648ISm2.LJJIIJ = c46649ISn.LIZLLL;
        c46648ISm2.LJJIFFI = c46649ISn.LJ;
        c46648ISm2.LJJII = c46649ISn.LJFF;
        SimVideoUrlModel simVideoUrlModel4 = this.LJLILLLLZI;
        if (simVideoUrlModel4 != null) {
            list2 = C47242IgQ.LIZ().getSingleTimeDownloadList(simVideoUrlModel4);
        }
        C46648ISm c46648ISm3 = isp.LIZ;
        c46648ISm3.LJIILJJIL = list2;
        c123724tM.remove(this.LJLJJI);
        InterfaceC46541IOj interfaceC46541IOj = this.LJLJI.LJLJJL;
        if (interfaceC46541IOj != null) {
            c46648ISm3.LIZ(interfaceC46541IOj.LJI());
        }
        c46648ISm3.LIZ(this.LJLJL);
        return c46648ISm3;
    }

    public CallableC46646ISk(InterfaceC46645ISj interfaceC46645ISj, SimVideoUrlModel simVideoUrlModel, C46539IOh c46539IOh, String str, ISP isp, Long l, HashMap hashMap) {
        this.LJLIL = interfaceC46645ISj;
        this.LJLILLLLZI = simVideoUrlModel;
        this.LJLJI = c46539IOh;
        this.LJLJJI = str;
        this.LJLJJL = isp;
        this.LJLJJLL = l;
        this.LJLJL = hashMap;
    }
}
