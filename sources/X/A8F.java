package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.wallet.model.IapProductGetResult;

/* loaded from: classes5.dex */
public final class A8F implements InterfaceC77772Ufg {
    @Override // X.InterfaceC77772Ufg
    public final void LJII() {
    }

    @Override // X.InterfaceC77772Ufg
    public final void LJIJ() {
    }

    @Override // X.InterfaceC77772Ufg
    public final void LJIIJ(IapProductGetResult iapProductGetResult) {
        A8E.LJ.postValue(A8P.LIZ);
        C188727au c188727au = new C188727au();
        c188727au.LIZLLL(0, "is_success");
        c188727au.LJ(System.currentTimeMillis() - A8E.LJI, "latency");
        FMX.LJIIL("paid_content_anchor_fetch_price", c188727au.LIZ);
    }

    @Override // X.InterfaceC77772Ufg
    public final void LJIILIIL(IapProductGetResult iapProductGetResult) {
        IapProductGetResult.Item item;
        String str;
        A8E.LIZIZ = iapProductGetResult.data;
        if (!A8E.LIZLLL) {
            java.util.Map<String, IapProductGetResult.Item> map = A8E.LIZIZ;
            String str2 = null;
            if (map != null) {
                item = map.get(A8E.LJFF);
            } else {
                item = null;
            }
            MutableLiveData<A8N> mutableLiveData = A8E.LJ;
            if (item != null) {
                str = item.price;
            } else {
                str = null;
            }
            mutableLiveData.postValue(new A8M(str));
            A8E.LIZLLL = true;
            C188727au c188727au = new C188727au();
            if (item != null) {
                str2 = item.productId;
            }
            c188727au.LJIIIZ("iap_id", str2);
            c188727au.LIZLLL(1, "is_success");
            c188727au.LJ(System.currentTimeMillis() - A8E.LJI, "latency");
            FMX.LJIIL("paid_content_anchor_fetch_price", c188727au.LIZ);
        }
    }
}
