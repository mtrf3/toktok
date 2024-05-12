package X;

import com.ss.android.ugc.aweme.poi.reviews.PoiReviewListViewModel;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.7Uz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C186857Uz {
    public static boolean LIZ(String poiId) {
        o.LJIIIZ(poiId, "poiId");
        HashMap<String, Boolean> hashMap = PoiReviewListViewModel.LJLLJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(((RBX) HG3.LJIILL()).getCurUserId());
        LIZ.append('_');
        LIZ.append(poiId);
        Boolean bool = hashMap.get(X1D.LIZIZ(LIZ));
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }
}
