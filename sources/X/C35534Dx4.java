package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.experiment.SparkEcomPromotionCaravelOptPageListBean;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Dx4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35534Dx4 {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C35535Dx5.LJLIL);

    public static int LIZ() {
        return ((Number) LIZ.getValue()).intValue();
    }

    public static boolean LIZIZ(String schema) {
        List list;
        o.LJIIIZ(schema, "schema");
        C35533Dx3.LIZ.getClass();
        SparkEcomPromotionCaravelOptPageListBean sparkEcomPromotionCaravelOptPageListBean = (SparkEcomPromotionCaravelOptPageListBean) SettingsManager.LIZLLL().LJIIIIZZ("spark_ecom_promotion_caravel_opt_page_list", SparkEcomPromotionCaravelOptPageListBean.class, C35533Dx3.LIZIZ);
        if (sparkEcomPromotionCaravelOptPageListBean == null || (list = sparkEcomPromotionCaravelOptPageListBean.allowList) == null) {
            list = C61878OQg.INSTANCE;
        }
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (s.LJJJLZIJ(schema, (String) it.next(), false)) {
                z = true;
            }
        }
        return z;
    }
}
