package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.FashionMallFragment;
import ujb.o;

/* renamed from: X.KTe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51762KTe {
    public static boolean LIZIZ() {
        return o.LJJJJIZL(FashionMallFragment.LL, "top_fashion_mall", false);
    }

    public static boolean LIZ(ActivityC45651qj activityC45651qj) {
        boolean z;
        Intent intent;
        if (activityC45651qj != null && (intent = activityC45651qj.getIntent()) != null) {
            z = intent.getBooleanExtra("extra_non_click_open_from", false);
        } else {
            z = false;
        }
        String nv0 = C116694i1.LIZ(activityC45651qj).nv0();
        if (!kotlin.jvm.internal.o.LJ(nv0, "SHOP_MALL")) {
            FashionMallFragment.LJZ.getClass();
            if (!FashionMallFragment.LLD && !z && (!kotlin.jvm.internal.o.LJ(nv0, "HOME") || !com.bytedance.hox.Hox.LJLLI.LIZ(activityC45651qj).vv0("Shop"))) {
                return false;
            }
        }
        return true;
    }
}
