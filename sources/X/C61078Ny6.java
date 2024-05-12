package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.Ny6, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61078Ny6 extends AbstractC60800Ntc {
    public final /* synthetic */ Aweme LJLIL;

    public C61078Ny6(Aweme aweme) {
        this.LJLIL = aweme;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        o.LJIIIZ(view, "view");
        C37942Euo c37942Euo = (C37942Euo) view.getHybridContext().LIZIZ(C37942Euo.class);
        if (c37942Euo != null) {
            c37942Euo.LJIIL(C61121Nyn.class, EnumC37844EtE.ALL);
            c37942Euo.LJIIL(C61077Ny5.class, EnumC37844EtE.ALL);
            c37942Euo.LJIIL(C61124Nyq.class, EnumC37844EtE.ALL);
        }
        FMX.LJIILL("disney100_card_spark_load_result", new OSZ(1, "status"), new OSZ(Long.valueOf(System.currentTimeMillis() - C61125Nyr.LIZLLL), "load_time"));
        C36922EeM.LIZLLL(2, "disney100", "disney100_card_spark_load_result, status = 1");
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJ(InterfaceC60761Nsz view, String url) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJ(view, url);
        C2U8.LIZ(new C55045Liz(this.LJLIL, "homepage_hot"));
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJIZL(InterfaceC60761Nsz view, String url, C60704Ns4 c60704Ns4) {
        int i;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJIZL(view, url, c60704Ns4);
        Integer num = c60704Ns4.LIZ;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        FMX.LJIILL("disney100_card_spark_load_result", new OSZ(0, "status"), new OSZ("load_failed", "reason"), new OSZ(Long.valueOf(System.currentTimeMillis() - C61125Nyr.LIZLLL), "load_time"), new OSZ(Integer.valueOf(i), "error_code"));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("disney100_card_spark_load_result, error code = ");
        LIZ.append(i);
        LIZ.append(", load failed");
        C36922EeM.LIZLLL(2, "disney100", X1D.LIZIZ(LIZ));
    }
}
