package X;

import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ListReviewData;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Rov, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70701Rov<T, R> implements InterfaceC48038ItG {
    public final /* synthetic */ C70699Rot LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ Integer LJLJI;

    public C70701Rov(C70699Rot c70699Rot, String str, Integer num) {
        this.LJLIL = c70699Rot;
        this.LJLILLLLZI = str;
        this.LJLJI = num;
    }

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        boolean z;
        int i;
        ListReviewData it = (ListReviewData) obj;
        o.LJIIIZ(it, "it");
        ArrayList arrayList = new ArrayList();
        List<ReviewItemStruct> list = it.reviewItems;
        if (list != null) {
            C70699Rot c70699Rot = this.LJLIL;
            String str = this.LJLILLLLZI;
            Integer num = this.LJLJI;
            Iterator<ReviewItemStruct> it2 = list.iterator();
            while (it2.hasNext()) {
                c70699Rot.LLLZIL(it2.next(), arrayList, str, num);
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
