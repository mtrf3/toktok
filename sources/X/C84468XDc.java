package X;

import Y.ARunnableS51S0100000_15;
import com.ss.android.ugc.effectmanager.knadapt.KNJsonConverter;
import com.ss.ugc.effectplatform.model.CategoryPageModel;
import com.ss.ugc.effectplatform.model.net.CategoryEffectListResponse;
import kotlin.jvm.internal.AqS162S0200000_15;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.XDc, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84468XDc extends XCZ {
    public final XCG LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final int LJIIJ;
    public final int LJIIJJI;
    public final int LJIIL;

    @Override // X.XCZ
    public final void LIZJ() {
        C15180ig.LIZ(new ARunnableS51S0100000_15(new AqS165S0100000_15(this, 706), 64));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.ugc.effectplatform.model.net.CategoryEffectListResponse] */
    /* JADX WARN: Type inference failed for: r6v2, types: [com.ss.ugc.effectplatform.model.net.CategoryEffectListResponse, X.XDH] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // X.XCZ
    public final void LIZ() {
        C32611Pt c32611Pt;
        System.currentTimeMillis();
        InterfaceC84458XCs interfaceC84458XCs = (InterfaceC84458XCs) C78685UuP.LJJJJLI(this.LJI.LJJIFFI);
        Throwable th = null;
        ?? r6 = 0;
        if (interfaceC84458XCs != null) {
            c32611Pt = interfaceC84458XCs.queryToStream(XDN.LIZ(this.LJII, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL));
        } else {
            c32611Pt = null;
        }
        try {
            if (c32611Pt == null) {
                C15180ig.LIZ(new ARunnableS51S0100000_15(new AqS162S0200000_15(this, new C84418XBe(10004), 28), 64));
                return;
            }
            try {
                String LJIIJ = C10820be.LJIIJ(c32611Pt);
                G0J g0j = this.LJI.LJIJ;
                if (g0j != null) {
                    th = (CategoryEffectListResponse) ((KNJsonConverter) g0j.LIZ).convertJsonToObj(LJIIJ, CategoryEffectListResponse.class);
                    r6 = th;
                }
            } catch (Exception e) {
                C12310e3 c12310e3 = C12310e3.LIZIZ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Json Parse Exception: ");
                LIZ.append(e);
                String LIZIZ = X1D.LIZIZ(LIZ);
                c12310e3.getClass();
                C12310e3.LIZIZ("FetchCategoryEffectCacheTask", LIZIZ, th);
                r6 = th;
            }
            System.currentTimeMillis();
            if (r6 == 0 || !r6.checkValue()) {
                C15180ig.LIZ(new ARunnableS51S0100000_15(new AqS162S0200000_15(this, new C84418XBe(10004), 28), 64));
                return;
            }
            CategoryPageModel data = r6.getData();
            if (data != null) {
                XCG xcg = this.LJI;
                if (xcg.LJJIL == 2) {
                    XDM xdm = XDM.LIZ;
                    String str = this.LJII;
                    xdm.getClass();
                    XDM.LIZIZ(xcg, str, data, false);
                }
                C15180ig.LIZ(new ARunnableS51S0100000_15(new AqS162S0200000_15(this, data, 29), 64));
            }
        } finally {
            try {
                c32611Pt.close();
            } catch (Exception e2) {
                C16880lQ.LLLLIIL(e2);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84468XDc(XCG effectConfig, String panel, String taskFlag, String str, int i, int i2, int i3) {
        super(taskFlag, null);
        o.LJIIJ(effectConfig, "effectConfig");
        o.LJIIJ(panel, "panel");
        o.LJIIJ(taskFlag, "taskFlag");
        this.LJI = effectConfig;
        this.LJII = panel;
        this.LJIIIIZZ = taskFlag;
        this.LJIIIZ = str;
        this.LJIIJ = i;
        this.LJIIJJI = i2;
        this.LJIIL = i3;
    }
}
