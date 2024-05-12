package X;

import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ListShopReviewData;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ShopReviewItemStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Rou, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70700Rou<T, R> implements InterfaceC48038ItG {
    public final /* synthetic */ C70699Rot LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ Integer LJLJI;

    public C70700Rou(C70699Rot c70699Rot, String str, Integer num) {
        this.LJLIL = c70699Rot;
        this.LJLILLLLZI = str;
        this.LJLJI = num;
    }

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        boolean z;
        int i;
        ListShopReviewData it = (ListShopReviewData) obj;
        o.LJIIIZ(it, "it");
        ArrayList arrayList = new ArrayList();
        List<ShopReviewItemStruct> list = it.reviewItems;
        if (list != null) {
            C70699Rot c70699Rot = this.LJLIL;
            String str = this.LJLILLLLZI;
            Integer num = this.LJLJI;
            Iterator<ShopReviewItemStruct> it2 = list.iterator();
            while (it2.hasNext()) {
                ReviewItemStruct reviewItemStruct = it2.next().reviewItemStruct;
                if (reviewItemStruct != null) {
                    c70699Rot.LLLZIL(reviewItemStruct, arrayList, str, num);
                }
            }
        }
        Boolean bool = it.hasMore;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = true;
        }
        Integer num2 = it.nextCursor;
        if (num2 != null) {
            i = num2.intValue();
        } else {
            i = 0;
        }
        return new OSZ(arrayList, new C70839Rr9(z, i));
    }
}
