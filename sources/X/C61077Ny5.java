package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.Ny5, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61077Ny5 extends AbstractC37762Eru {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        String str;
        o.LJIIIZ(type, "type");
        C39359FcZ c39359FcZ = SparkContext.Companion;
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        Aweme aweme = null;
        if (interfaceC38263Ezz != null) {
            str = interfaceC38263Ezz.LIZIZ();
        } else {
            str = null;
        }
        c39359FcZ.getClass();
        C60737Nsb LIZIZ = C39359FcZ.LIZIZ(str);
        FMX.LJIILL("disney100_card_spark_load_result", new OSZ(0, "status"), new OSZ("skip_card", "reason"), new OSZ(Long.valueOf(System.currentTimeMillis() - C61125Nyr.LIZLLL), "load_time"));
        C36922EeM.LIZLLL(2, "disney100", "disney100_card_spark_load_result, status = 0, skip card");
        if (LIZIZ != null) {
            aweme = (Aweme) LIZIZ.LIZIZ(Aweme.class);
        }
        C2U8.LIZ(new C55045Liz(aweme, "homepage_hot"));
    }
}
