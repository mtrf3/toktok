package X;

import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletRechargeExchangeStrengthen;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes16.dex */
public final class XCG {
    public static final /* synthetic */ int LJJJJJL = 0;
    public final String LIZ = "/effect/api";
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final HashMap<String, String> LJIIL;
    public final boolean LJIILIIL;
    public final XCK LJIILJJIL;
    public final int LJIILL;
    public final int LJIILLIIL;
    public final int LJIIZILJ;
    public final G0J LJIJ;
    public final C0FT LJIJI;
    public final C0FT LJIJJ;
    public final C0FT LJIJJLI;
    public final InterfaceExecutorC06770Oj LJIL;
    public final int LJJ;
    public final C0FT LJJI;
    public final C0FT LJJIFFI;
    public final String LJJII;
    public final String LJJIII;
    public XCX LJJIIJ;
    public final String LJJIIJZLJL;
    public final List<String> LJJIIZ;
    public final Object LJJIIZI;
    public final XA2 LJJIJ;
    public final String LJJIJIIJI;
    public final X9D LJJIJIIJIL;
    public final String LJJIJIL;
    public final long LJJIJL;
    public final boolean LJJIJLIJ;
    public final int LJJIL;
    public final XCM LJJIZ;
    public final XCN LJJJ;
    public final Integer LJJJI;
    public final boolean LJJJIL;
    public final String[] LJJJJ;
    public final X9B LJJJJI;
    public final boolean LJJJJIZL;
    public final boolean LJJJJJ;

    public XCG(XCF xcf) {
        boolean z;
        X62 x62;
        this.LIZIZ = xcf.LIZ;
        this.LIZJ = xcf.LIZIZ;
        this.LIZLLL = xcf.LIZJ;
        this.LJ = xcf.LIZLLL;
        String str = xcf.LJIIIIZZ;
        this.LJFF = str == null ? LiveWalletRechargeExchangeStrengthen.DEFAULT : str;
        String str2 = xcf.LJIIIZ;
        this.LJI = str2 == null ? "android" : str2;
        this.LJII = xcf.LJIIJ;
        String str3 = xcf.LJIIJJI;
        str3 = str3 == null ? "" : str3;
        this.LJIIIIZZ = str3;
        this.LJIIIZ = xcf.LJ;
        String str4 = xcf.LJFF;
        this.LJIIJ = str4 == null ? CardStruct.IStatusCode.DEFAULT : str4;
        this.LJIIJJI = xcf.LJIILL;
        this.LJIIL = xcf.LJIJJLI;
        this.LJIILIIL = xcf.LJJI;
        this.LJIILJJIL = xcf.LJJII;
        this.LJIILL = xcf.LJIILIIL;
        this.LJIILLIIL = xcf.LJIILJJIL;
        this.LJIIZILJ = xcf.LJIL;
        G0J g0j = xcf.LJII;
        this.LJIJ = g0j == null ? null : g0j;
        C0FT c0ft = new C0FT((Object) null);
        this.LJIJI = c0ft;
        C0FT c0ft2 = new C0FT((Object) null);
        this.LJIJJ = c0ft2;
        this.LJIJJLI = new C0FT((Object) null);
        InterfaceExecutorC06770Oj interfaceExecutorC06770Oj = xcf.LJIILLIIL;
        interfaceExecutorC06770Oj = interfaceExecutorC06770Oj == null ? new C1IW() : interfaceExecutorC06770Oj;
        this.LJIL = interfaceExecutorC06770Oj;
        int i = xcf.LJJIJIIJI;
        this.LJJ = i;
        C0FT c0ft3 = new C0FT((Object) null);
        this.LJJI = c0ft3;
        C0FT c0ft4 = new C0FT((Object) null);
        this.LJJIFFI = c0ft4;
        this.LJJII = xcf.LJIJJ;
        this.LJJIII = xcf.LJIJI;
        XCJ xcj = new XCJ();
        xcj.LIZIZ = i;
        xcj.LIZ = interfaceExecutorC06770Oj;
        this.LJJIIJ = xcj.LIZ();
        this.LJJIIJZLJL = xcf.LJJ;
        this.LJJIIZ = xcf.LJJIFFI;
        this.LJJIIZI = xcf.LJJIII;
        this.LJJIJ = xcf.LJJIIJ;
        this.LJJIJIIJI = xcf.LJJIIJZLJL;
        this.LJJIJIIJIL = xcf.LJJIIZ;
        String str5 = xcf.LJIIL;
        if (str5 == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str3);
            str5 = JBR.LJFF(LIZ, C10820be.LIZ, "algorithm", LIZ);
        }
        this.LJJIJIL = str5;
        this.LJJIJL = xcf.LJJIJ;
        this.LJJIJLIJ = xcf.LJJIZ;
        this.LJJIL = xcf.LJJJ;
        this.LJJIZ = XCM.LIZJ;
        this.LJJJ = new XCN();
        this.LJJJI = xcf.LJJIIZI;
        this.LJJJIL = xcf.LJJIJIIJIL;
        this.LJJJJ = xcf.LJJIJIL;
        this.LJJJJI = xcf.LJJIJL;
        this.LJJJJIZL = xcf.LJJIJLIJ;
        boolean z2 = xcf.LJJIL;
        this.LJJJJJ = xcf.LJJJI;
        Object obj = xcf.LJJIII;
        if (obj != null && (x62 = xcf.LJI) != null) {
            c0ft.LIZ = new X60(obj, xcf.LJJIJIIJI, x62);
        }
        Object obj2 = xcf.LJIIZILJ;
        c0ft3.LIZ = obj2 == null ? new XBU(this) : obj2;
        c0ft2.LIZ = xcf.LJIJ;
        c0ft4.LIZ = null;
        if (C78970Uz0.LIZ || z2) {
            z = true;
        } else {
            z = false;
        }
        C78970Uz0.LIZ = z;
    }
}
