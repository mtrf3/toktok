package X;

import android.content.Context;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.livesdk.livesetting.wallet.LiveUseNewSubsData;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.google.gson.m;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS94S0300000_5;
import webcast.api.sub.TemplateInfo;

/* renamed from: X.CGv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31057CGv implements InterfaceC77737Uf7 {
    public C68395Qsp LJLIL;
    public Diamond LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ C68322mC<TemplateInfo> LJLJJI;
    public final /* synthetic */ InterfaceC30977CDt LJLJJL;
    public final /* synthetic */ C68322mC<java.util.Map<String, String>> LJLJJLL;
    public final /* synthetic */ C68322mC<String> LJLJL;
    public final /* synthetic */ C68322mC<String> LJLJLJ;
    public final /* synthetic */ C72242sW LJLJLLL;
    public final /* synthetic */ Context LJLL;
    public final /* synthetic */ String LJLLI;

    @Override // X.InterfaceC77737Uf7
    public final void LIZ(C77623UdH c77623UdH) {
    }

    @Override // X.InterfaceC77737Uf7
    public final InterfaceC77748UfI LIZJ() {
        return null;
    }

    @Override // X.InterfaceC77737Uf7
    public final void LIZLLL(C31556Ca0 c31556Ca0) {
    }

    @Override // X.InterfaceC77737Uf7
    public final void LJFF(int i, C77623UdH c77623UdH) {
    }

    @Override // X.InterfaceC77737Uf7
    public final void LJI(C77623UdH c77623UdH) {
    }

    @Override // X.InterfaceC77737Uf7
    public final void LJIIIIZZ(C31556Ca0 c31556Ca0) {
    }

    @Override // X.InterfaceC77737Uf7
    public final void LJIIJJI(C31556Ca0 c31556Ca0) {
    }

    @Override // X.InterfaceC77737Uf7
    public final void LJIIL(C77623UdH c77623UdH) {
    }

    @Override // X.InterfaceC77737Uf7
    public final void LJIILJJIL(C31556Ca0 c31556Ca0) {
    }

    @Override // X.InterfaceC77737Uf7
    public final void LJIILLIIL(C31556Ca0 c31556Ca0) {
    }

    @Override // X.InterfaceC77737Uf7
    public final void LJIIZILJ(int i, C77623UdH c77623UdH) {
    }

    @Override // X.InterfaceC77737Uf7
    public final void LJIJI(int i, C77623UdH c77623UdH) {
    }

    @Override // X.InterfaceC77737Uf7
    public final void LJIJJ(C77623UdH c77623UdH) {
    }

    @Override // X.InterfaceC77737Uf7
    public final void LJIJJLI() {
    }

    @Override // X.InterfaceC77737Uf7
    public final void LJIL(C31556Ca0 c31556Ca0) {
    }

    public final void LJ() {
        Diamond diamond;
        Object obj;
        m mVar;
        Diamond diamond2 = this.LJLILLLLZI;
        if (diamond2 != null) {
            C68322mC<java.util.Map<String, String>> c68322mC = this.LJLJJLL;
            C68322mC<String> c68322mC2 = this.LJLJL;
            C68395Qsp c68395Qsp = this.LJLIL;
            if (c68395Qsp != null) {
                if (LiveUseNewSubsData.INSTANCE.getValue() && (!c68322mC.element.isEmpty())) {
                    java.util.Map map = (java.util.Map) c68395Qsp.LJLILLLLZI;
                    if (map != null && (obj = map.get(c68322mC2.element)) != null) {
                        m LJIIJ = LJIIJ(diamond2);
                        try {
                            mVar = C09650Zl.LIZIZ.LJIJJLI(obj).LJIIZILJ();
                        } catch (Exception e) {
                            C0NB.LJI("getAutoRenewPurchaseResultV2", e);
                            mVar = new m();
                        }
                        LJII(LJIIJ, mVar);
                        return;
                    }
                    return;
                }
                List list = (List) c68395Qsp.LJLIL;
                if (list != null && (diamond = (Diamond) ORZ.LJLLLLLL(0, list)) != null) {
                    LJII(LJIIJ(diamond2), LJIIJ(diamond));
                }
            }
        }
    }

    public static m LJIIJ(Diamond diamond) {
        m mVar = new m();
        mVar.LJJIIZ("currency", diamond.LJLILLLLZI);
        mVar.LJJIIZ("price", diamond.price);
        mVar.LJJIIJ("price_amount_micros", Long.valueOf(diamond.LJLJI));
        mVar.LJJIIZ("sku_name", diamond.LJLJJI);
        return mVar;
    }

    @Override // X.InterfaceC77737Uf7
    public final void LIZIZ(int i, C77623UdH c77623UdH) {
        boolean z;
        StringBuilder LJ = C7MY.LJ("prefetchTempAndSku failed, action: ", i, ", errorInfo.exception: ");
        LJ.append(c77623UdH.getException());
        C0NB.LIZ(X1D.LIZIZ(LJ));
        long currentTimeMillis = System.currentTimeMillis() - this.LJLJI;
        C31058CGw c31058CGw = C31058CGw.LIZ;
        int errorCode = c77623UdH.getErrorCode();
        int detailCode = c77623UdH.getDetailCode();
        if (i == 4) {
            z = true;
        } else {
            z = false;
        }
        c31058CGw.getClass();
        C31058CGw.LJI(errorCode, detailCode, currentTimeMillis, z);
        InterfaceC30977CDt interfaceC30977CDt = this.LJLJJL;
        if (interfaceC30977CDt != null) {
            interfaceC30977CDt.tc(i, c77623UdH);
        }
    }

    public final void LJII(m mVar, m mVar2) {
        m mVar3 = new m();
        mVar3.LJJIIJ("code", 1);
        mVar3.LJJII(this.LJLJLJ.element, mVar);
        mVar3.LJJII(this.LJLJL.element, mVar2);
        m mVar4 = new m();
        mVar4.LJJII("data", mVar3);
        mVar4.LJJIIJ("code", 1);
        this.LJLJLLL.element = System.currentTimeMillis();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("_user_sku_ts", Long.valueOf(this.LJLJLLL.element));
        linkedHashMap.put("sku", mVar4);
        ((IBrowserService) CN1.LIZ(IBrowserService.class)).qk0(this.LJLL, linkedHashMap, this.LJLLI);
        InterfaceC30977CDt interfaceC30977CDt = this.LJLJJL;
        if (interfaceC30977CDt != null) {
            interfaceC30977CDt.Y6(this.LJLJLLL.element);
        }
    }

    @Override // X.InterfaceC77737Uf7
    public final void LJIIIZ(int i, C31556Ca0 c31556Ca0) {
        int i2;
        this.LJLIL = c31556Ca0.LJLJJL;
        C29306Beo.LJJJ(new AqS94S0300000_5((C68322mC) this.LJLJJI, (C68322mC<TemplateInfo>) this.LJLJJL, (InterfaceC30977CDt) c31556Ca0, (C31556Ca0) 18));
        LJ();
        long currentTimeMillis = System.currentTimeMillis() - this.LJLJI;
        C68395Qsp c68395Qsp = c31556Ca0.LJLJJL;
        java.util.Map map = (java.util.Map) c68395Qsp.LJLILLLLZI;
        boolean z = false;
        if (map != null) {
            i2 = map.size();
        } else {
            List list = (List) c68395Qsp.LJLIL;
            if (list != null) {
                i2 = list.size();
            } else {
                i2 = 0;
            }
        }
        C31058CGw c31058CGw = C31058CGw.LIZ;
        if (i == 4) {
            z = true;
        }
        c31058CGw.getClass();
        C31058CGw.LJII(i2, currentTimeMillis, z);
    }

    @Override // X.InterfaceC77737Uf7
    public final void LJJ(int i, C31556Ca0 c31556Ca0) {
        boolean z = false;
        this.LJLILLLLZI = (Diamond) ORZ.LJLLLLLL(0, c31556Ca0.LJLILLLLZI);
        LJ();
        long currentTimeMillis = System.currentTimeMillis() - this.LJLJI;
        C31058CGw c31058CGw = C31058CGw.LIZ;
        int size = c31556Ca0.LJLILLLLZI.size();
        if (i == 4) {
            z = true;
        }
        c31058CGw.getClass();
        C31058CGw.LJII(size, currentTimeMillis, z);
    }

    public C31057CGv(long j, C68322mC<TemplateInfo> c68322mC, InterfaceC30977CDt interfaceC30977CDt, C68322mC<java.util.Map<String, String>> c68322mC2, C68322mC<String> c68322mC3, C68322mC<String> c68322mC4, C72242sW c72242sW, Context context, String str) {
        this.LJLJI = j;
        this.LJLJJI = c68322mC;
        this.LJLJJL = interfaceC30977CDt;
        this.LJLJJLL = c68322mC2;
        this.LJLJL = c68322mC3;
        this.LJLJLJ = c68322mC4;
        this.LJLJLLL = c72242sW;
        this.LJLL = context;
        this.LJLLI = str;
    }
}
