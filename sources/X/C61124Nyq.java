package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Nyq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61124Nyq extends AbstractC37759Err {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        o.LJIIIZ(type, "type");
        C61125Nyr.LIZJ = System.currentTimeMillis();
        FMX.LJIILL("disney100_card_spark_load_first_screen", new OSZ(Long.valueOf(System.currentTimeMillis() - C61125Nyr.LIZLLL), "first_screen_time"), new OSZ(Long.valueOf(C61125Nyr.LIZ - C61125Nyr.LIZLLL), "first_screen_time"));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("disney100_card_spark_load_first_screen, preloaded ");
        LIZ.append(C61125Nyr.LJ);
        C36922EeM.LIZLLL(2, "disney100", X1D.LIZIZ(LIZ));
        long j = C61125Nyr.LIZJ;
        long j2 = C61125Nyr.LIZIZ;
        if (j >= j2 && j2 != 0) {
            FMX.LJIILL("disney100_card_display_first_screen", new OSZ(Long.valueOf(j - j2), "first_screen_time"), new OSZ(Long.valueOf(C61125Nyr.LIZ - C61125Nyr.LIZIZ), "first_screen_time"), new OSZ(Boolean.valueOf(C61125Nyr.LJ), "preloaded"));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("disney100_card_display_first_screen, preloaded ");
            LIZ2.append(C61125Nyr.LJ);
            C36922EeM.LIZLLL(2, "disney100", X1D.LIZIZ(LIZ2));
        }
    }
}
