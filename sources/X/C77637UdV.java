package X;

import com.bytedance.android.livesdk.wallet.Diamond;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.UdV, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77637UdV implements InterfaceC77665Udx<List<? extends String>, List<? extends Diamond>> {
    public final C278417k<String, Diamond> LIZ = new C278417k<>(10000);

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
        List<Diamond> dataList = (List) obj;
        o.LJIIIZ(cachePolicy, "cachePolicy");
        o.LJIIIZ(key, "key");
        o.LJIIIZ(dataList, "dataList");
        if (!cachePolicy.canCache() || dataList.isEmpty()) {
            return;
        }
        for (Diamond diamond : dataList) {
            C278417k<String, Diamond> c278417k = this.LIZ;
            o.LJIIIZ(diamond, "diamond");
            String str = diamond.iapId;
            o.LJIIIIZZ(str, "diamond.iapId");
            c278417k.put(str, diamond);
        }
    }
}
