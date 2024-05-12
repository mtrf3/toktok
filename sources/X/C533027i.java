package X;

import com.bytedance.android.live.iap.model.response.iap.IapProductDetail;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.27i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C533027i extends AbstractC65781Prl implements InterfaceC65784Pro<C37341dK> {
    public static final C533027i LJLIL = new C533027i();

    public C533027i() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1dK] */
    @Override // X.InterfaceC65784Pro
    public final C37341dK invoke() {
        return new InterfaceC77665Udx<List<? extends String>, List<? extends IapProductDetail>>() { // from class: X.1dK
            public final C278417k<String, IapProductDetail> LIZ = new C278417k<>(10000);

            @Override // X.InterfaceC77665Udx
            public final Object LIZIZ(EnumC77641UdZ cachePolicy, Object obj) {
                List key = (List) obj;
                o.LJIIIZ(cachePolicy, "cachePolicy");
                o.LJIIIZ(key, "key");
                if (cachePolicy.canUse() && !key.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = key.iterator();
                    while (it.hasNext()) {
                        Object obj2 = this.LIZ.get(it.next());
                        if (obj2 != null) {
                            arrayList.add(obj2);
                        }
                    }
                    return arrayList;
                }
                return null;
            }

            @Override // X.InterfaceC77665Udx
            public final void LIZ(EnumC77641UdZ cachePolicy, Object key, Object obj) {
                List<IapProductDetail> dataList = (List) obj;
                o.LJIIIZ(cachePolicy, "cachePolicy");
                o.LJIIIZ(key, "key");
                o.LJIIIZ(dataList, "dataList");
                if (!cachePolicy.canCache() || dataList.isEmpty()) {
                    return;
                }
                for (IapProductDetail iapProductDetail : dataList) {
                    this.LIZ.put(iapProductDetail.productId, iapProductDetail);
                }
            }
        };
    }
}
