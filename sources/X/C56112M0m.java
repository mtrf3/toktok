package X;

import kotlin.jvm.internal.o;

/* renamed from: X.M0m, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56112M0m extends AbstractC65781Prl implements InterfaceC88473Ynt<O26, O1M, Throwable, C76800UCe> {
    public static final C56112M0m LJLIL = new C56112M0m();

    public C56112M0m() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(O26 resourceInfo, O1M taskConfig, Throwable th) {
        Throwable throwable = th;
        o.LJIIIZ(resourceInfo, "resourceInfo");
        o.LJIIIZ(taskConfig, "taskConfig");
        o.LJIIIZ(throwable, "throwable");
        C36746EbW.LIZ(3, "ShopMainGeckoMonitor  loadFailed");
        C56092Lzs c56092Lzs = C56092Lzs.LIZ;
        String stage = EnumC56115M0p.STAGE_SPARK_LOAD_TEMPLATE_FINISH.getStage();
        long currentTimeMillis = System.currentTimeMillis() - M0M.LIZ;
        boolean z = M0M.LIZJ;
        String message = throwable.getMessage();
        if (message == null) {
            message = "";
        }
        java.util.Map LJJIIZI = C51029K0z.LJJIIZI(new OSZ("error_msg", message));
        c56092Lzs.getClass();
        C56092Lzs.LJIIJ(stage, currentTimeMillis, false, z, LJJIIZI);
        return C76800UCe.LIZ;
    }
}
