package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.M0n, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56113M0n extends AbstractC65781Prl implements InterfaceC88471Ynr<O26, O1M, C76800UCe> {
    public static final C56113M0n LJLIL = new C56113M0n();

    public C56113M0n() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(O26 o26, O1M taskConfig) {
        String str;
        O26 resourceInfo = o26;
        o.LJIIIZ(resourceInfo, "resourceInfo");
        o.LJIIIZ(taskConfig, "taskConfig");
        C36746EbW.LIZ(3, "ShopMainGeckoMonitor loadSuccess");
        C56092Lzs c56092Lzs = C56092Lzs.LIZ;
        O29 o29 = resourceInfo.LJIIIZ;
        if (o29 == null || (str = o29.name()) == null) {
            str = "";
        }
        c56092Lzs.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("resource_from", str);
        hashMap.put("enter_from", C56092Lzs.LIZJ());
        hashMap.put("page_name", "mall_home");
        hashMap.putAll(C56092Lzs.LJ());
        C56092Lzs.LJIILJJIL("rd_tiktokec_gecko_suc", hashMap);
        C56092Lzs.LJIIJJI(c56092Lzs, EnumC56115M0p.STAGE_SPARK_LOAD_TEMPLATE_FINISH.getStage(), System.currentTimeMillis() - M0M.LIZ, M0M.LIZJ, 20);
        return C76800UCe.LIZ;
    }
}
