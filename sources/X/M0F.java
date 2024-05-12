package X;

import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.ecommerce.mall.lynxhome.model.MallV3Cache;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;

/* loaded from: classes10.dex */
public final class M0F {
    public static final M0F LIZ = new M0F();
    public static long LIZIZ;
    public static long LIZJ;
    public static volatile TemplateData LIZLLL;
    public static java.util.Map<Object, Object> LJ;

    public final TemplateData LIZ() {
        if (LIZLLL != null) {
            LIZJ("getTemplateData cache memory");
            return LIZLLL;
        }
        synchronized (this) {
            if (LIZLLL != null) {
                return LIZLLL;
            }
            TemplateData templateData = null;
            try {
                MallV3Cache LIZIZ2 = C51751KSt.LIZIZ();
                if (LIZIZ2 != null) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("ShopTabV3 getCache success log_id: ");
                    LIZ2.append(LIZIZ2.getLogId());
                    C36746EbW.LIZ(3, X1D.LIZIZ(LIZ2));
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    java.util.Map<String, Object> data = LIZIZ2.getData();
                    if (data != null) {
                        linkedHashMap.put("data", data);
                    }
                    String logId = LIZIZ2.getLogId();
                    if (logId != null) {
                        linkedHashMap.put("log_id", logId);
                    }
                    EnumC56061LzN enumC56061LzN = EnumC56061LzN.PREFETCH_CACHE;
                    linkedHashMap.put("type", enumC56061LzN.getValue());
                    LJ = linkedHashMap;
                    TemplateData LIZIZ3 = TemplateData.LIZIZ();
                    LIZIZ3.LJI("data", LIZIZ2.getData());
                    LIZIZ3.LJI("log_id", LIZIZ2.getLogId());
                    LIZIZ3.LJI("type", enumC56061LzN.getValue());
                    LIZJ("getTemplateData cache disk");
                    templateData = LIZIZ3;
                }
                LIZLLL = templateData;
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                C78983UzD.LJIIZILJ(th);
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
            return templateData;
        }
    }

    public static void LIZIZ(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - LIZJ;
        LIZJ = currentTimeMillis;
        StringBuilder LIZJ2 = C06490Nh.LIZJ("native_appear_directly interval! ", str, " curr=", currentTimeMillis);
        LIZJ2.append(" ,interval= ");
        LIZJ2.append(j);
        C36746EbW.LIZ(3, X1D.LIZIZ(LIZJ2));
    }

    public static void LIZJ(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - LIZIZ;
        StringBuilder LIZJ2 = C06490Nh.LIZJ("native_appear_directly ", str, " curr=", currentTimeMillis);
        LIZJ2.append(" ,clickToNow= ");
        LIZJ2.append(j);
        C36746EbW.LIZ(3, X1D.LIZIZ(LIZJ2));
    }
}
