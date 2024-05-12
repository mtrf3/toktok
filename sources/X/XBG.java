package X;

import com.ss.ugc.effectplatform.model.Effect;
import kotlin.jvm.internal.AqS82S1100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XBG extends XBW<C84430XBq> {
    public final C0FT LIZLLL;
    public final C0FT LJ;
    public final C0FT LJFF;
    public final C0FT LJI;
    public final C0FT LJII;
    public final Effect LJIIIIZZ;
    public C84422XBi LJIIIZ;
    public C65427Pm3 LJIIJ;
    public boolean LJIIJJI;
    public final C84415XBb LJIIL;
    public final XB4 LJIILIIL;
    public final XCG LJIILJJIL;

    @Override // X.XBW
    public final void LIZ() {
        XAT xat;
        XB4 xb4;
        this.LIZIZ = true;
        String str = (String) this.LIZLLL.LIZ;
        if (str != null && (xat = this.LJIIL.LJLJJI) != null && xat.LIZ(this.LJIIIIZZ) && (xb4 = this.LJIILIIL) != null) {
            X62 x62 = xb4.LIZ;
            if (!(x62 instanceof X64)) {
                x62 = null;
            }
            X64 x64 = (X64) x62;
            if (x64 != null) {
                x64.LIZ(str);
            }
        }
    }

    @Override // X.XBW
    public final void LJIIIZ() {
        XAT xat;
        XB4 xb4;
        this.LIZJ = true;
        String str = (String) this.LIZLLL.LIZ;
        if (str != null && (xat = this.LJIIL.LJLJJI) != null && xat.LIZ(this.LJIIIIZZ) && (xb4 = this.LJIILIIL) != null) {
            X62 x62 = xb4.LIZ;
            if (!(x62 instanceof X64)) {
                x62 = null;
            }
            X64 x64 = (X64) x62;
            if (x64 != null) {
                x64.pause(str);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x075c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0770  */
    @Override // X.XBW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            Method dump skipped, instructions count: 2308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XBG.LIZIZ():void");
    }

    public final boolean LJIIJJI(String str) {
        Exception exc;
        XAT xat = this.LJIIL.LJLJJI;
        if (xat != null && xat.LIZIZ(this.LJIIIIZZ)) {
            C84422XBi c84422XBi = this.LJIIIZ;
            if (c84422XBi != null) {
                AqS82S1100000_15 aqS82S1100000_15 = new AqS82S1100000_15(this, str, 0);
                if (!c84422XBi.LIZ.LIZIZ()) {
                    aqS82S1100000_15.invoke();
                    C0R4 c0r4 = c84422XBi.LIZIZ;
                    synchronized (c0r4.LIZ) {
                        c0r4.LIZ.wait();
                    }
                }
            }
            C65427Pm3 c65427Pm3 = this.LJIIJ;
            if (c65427Pm3 != null && (exc = (Exception) c65427Pm3.LIZ) != null) {
                LIZLLL(this, new C84418XBe(10018, exc));
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.XBW
    public final void LIZLLL(XBW<C84430XBq> syncTask, C84418XBe c84418XBe) {
        o.LJIIJ(syncTask, "syncTask");
        C12310e3 c12310e3 = C12310e3.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("download effect: ");
        LIZ.append(this.LJIIIIZZ.getEffect_id());
        LIZ.append(", name: ");
        LIZ.append(this.LJIIIIZZ.getName());
        LIZ.append(" failed!, error msg: ");
        LIZ.append(c84418XBe.LIZIZ);
        LIZ.append(", error code: ");
        LIZ.append(c84418XBe.LIZ);
        String LIZIZ = X1D.LIZIZ(LIZ);
        c12310e3.getClass();
        C12310e3.LIZIZ("EffectFetcherTask", LIZIZ, null);
        super.LIZLLL(syncTask, c84418XBe);
        Effect effect = this.LJIIIIZZ;
        int i = c84418XBe.LIZ;
        if (i == 10001 || i == 10020) {
            return;
        }
        if (effect != null && i == 10003 && effect.getEffect_type() == 1) {
            return;
        }
        XCG xcg = this.LJIILJJIL;
        InterfaceC58749N3x interfaceC58749N3x = (InterfaceC58749N3x) xcg.LJIJJ.LIZ;
        if (interfaceC58749N3x == null) {
            return;
        }
        Effect effect2 = this.LJIIIIZZ;
        OSZ[] oszArr = new OSZ[3];
        oszArr[0] = new OSZ("is_diff", Boolean.valueOf(this.LJIIJJI));
        oszArr[1] = new OSZ("error_code", Integer.valueOf(c84418XBe.LIZ));
        Object obj = this.LIZLLL.LIZ;
        if (obj == null) {
            obj = "";
        }
        oszArr[2] = new OSZ("download_url", obj);
        java.util.Map LJJL = C113554cx.LJJL(oszArr);
        String str = c84418XBe.LIZIZ;
        if (str == null) {
            str = "";
        }
        C63081OpJ.LLILII(interfaceC58749N3x, false, xcg, effect2, LJJL, str);
    }

    @Override // X.XBW
    /* renamed from: LJIIJ, reason: merged with bridge method [inline-methods] */
    public final void LJII(XBW<C84430XBq> syncTask, C84430XBq c84430XBq) {
        o.LJIIJ(syncTask, "syncTask");
        super.LJII(syncTask, c84430XBq);
        C12310e3 c12310e3 = C12310e3.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("download effect: ");
        LIZ.append(this.LJIIIIZZ.getEffect_id());
        LIZ.append(", name: ");
        LIZ.append(this.LJIIIIZZ.getName());
        LIZ.append(" success");
        String LIZIZ = X1D.LIZIZ(LIZ);
        c12310e3.getClass();
        C12310e3.LIZ("EffectFetcherTask", LIZIZ);
        XCG xcg = this.LJIILJJIL;
        InterfaceC58749N3x interfaceC58749N3x = (InterfaceC58749N3x) xcg.LJIJJ.LIZ;
        if (interfaceC58749N3x != null) {
            Effect effect = this.LJIIIIZZ;
            OSZ[] oszArr = new OSZ[6];
            oszArr[0] = new OSZ("is_diff", Boolean.valueOf(this.LJIIJJI));
            oszArr[1] = new OSZ("duration", this.LJ.LIZ);
            oszArr[2] = new OSZ("translate_time", this.LJFF.LIZ);
            oszArr[3] = new OSZ("unzip_time", this.LJI.LIZ);
            oszArr[4] = new OSZ("size", this.LJII.LIZ);
            Object obj = this.LIZLLL.LIZ;
            if (obj == null) {
                obj = "";
            }
            oszArr[5] = new OSZ("download_url", obj);
            C63081OpJ.LLILII(interfaceC58749N3x, true, xcg, effect, C113554cx.LJJL(oszArr), "");
        }
    }

    public XBG(C84415XBb c84415XBb, XB4 xb4, XCG effectConfig) {
        o.LJIIJ(effectConfig, "effectConfig");
        this.LJIIL = c84415XBb;
        this.LJIILIIL = xb4;
        this.LJIILJJIL = effectConfig;
        this.LIZLLL = new C0FT((Object) null);
        this.LJ = new C0FT((Object) 0L);
        this.LJFF = new C0FT((Object) 0L);
        this.LJI = new C0FT((Object) 0L);
        this.LJII = new C0FT((Object) 0L);
        this.LJIIIIZZ = c84415XBb.LJLIL;
    }
}
