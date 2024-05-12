package X;

import kotlin.jvm.internal.o;

/* renamed from: X.M0r, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56117M0r extends AbstractC60811Ntn {
    public final M1Y LJLILLLLZI;
    public boolean LJLJI;

    @Override // X.AbstractC60673NrZ
    public final void LJJJJLL() {
        C56045Lz7.LJI(C56045Lz7.LIZ, EnumC56116M0q.STAGE_SPARK_PREKIT_CREATE.getStage(), System.currentTimeMillis() - C56090Lzq.LIZ, C56090Lzq.LIZJ, 4);
    }

    public C56117M0r(C56074Lza c56074Lza) {
        this.LJLILLLLZI = c56074Lza;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        o.LJIIIZ(view, "view");
        C56045Lz7 c56045Lz7 = C56045Lz7.LIZ;
        String stage = EnumC56116M0q.STAGE_SPARK_LOAD_FINISH.getStage();
        long currentTimeMillis = System.currentTimeMillis() - C56090Lzq.LIZ;
        boolean z = !this.LJLJI;
        boolean z2 = C56090Lzq.LIZJ;
        c56045Lz7.getClass();
        C56045Lz7.LJFF(stage, currentTimeMillis, z, z2, null);
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJLI(InterfaceC60761Nsz interfaceC60761Nsz) {
        C56045Lz7.LJI(C56045Lz7.LIZ, EnumC56116M0q.STAGE_SPARK_POSTKIT_CREATED.getStage(), System.currentTimeMillis() - C56090Lzq.LIZ, C56090Lzq.LIZJ, 4);
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJZ(EnumC39924Flg kitType) {
        o.LJIIIZ(kitType, "kitType");
        C56045Lz7.LJI(C56045Lz7.LIZ, EnumC56116M0q.STAGE_SPARK_RUNTIME_READY.getStage(), System.currentTimeMillis() - C56090Lzq.LIZ, C56090Lzq.LIZJ, 4);
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJL(InterfaceC60761Nsz view, String url) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJJL(view, url);
        this.LJLJI = false;
        C56045Lz7.LJI(C56045Lz7.LIZ, EnumC56116M0q.STAGE_SPARK_LOAD_START.getStage(), System.currentTimeMillis() - C56090Lzq.LIZ, C56090Lzq.LIZJ, 4);
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJIZL(InterfaceC60761Nsz view, String url, C60704Ns4 c60704Ns4) {
        String str;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJIZL(view, url, c60704Ns4);
        C56090Lzq.LIZJ = true;
        this.LJLJI = true;
        OSZ[] oszArr = new OSZ[2];
        Integer num = c60704Ns4.LIZ;
        String str2 = "";
        if (num == null || (str = num.toString()) == null) {
            str = "";
        }
        oszArr[0] = new OSZ("error_code", str);
        String str3 = c60704Ns4.LIZIZ;
        if (str3 != null) {
            str2 = str3;
        }
        oszArr[1] = new OSZ("error_msg", str2);
        java.util.Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
        C56045Lz7 c56045Lz7 = C56045Lz7.LIZ;
        String stage = EnumC56116M0q.STAGE_SPARK_LOAD_FAILED.getStage();
        long currentTimeMillis = System.currentTimeMillis() - C56090Lzq.LIZ;
        boolean z = C56090Lzq.LIZJ;
        c56045Lz7.getClass();
        C56045Lz7.LJFF(stage, currentTimeMillis, false, z, LJJLIIIIJ);
        this.LJLILLLLZI.LJIILJJIL();
    }
}
