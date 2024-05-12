package Y;

import X.C10K;
import X.C16880lQ;
import X.C203727z6;
import X.C223318pb;
import X.InterfaceC116954iR;
import X.InterfaceC92693kP;
import X.M8L;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.detail.prefab.DetailPageContainerAssem;
import com.ss.android.ugc.aweme.favorites.api.UserFavoritesApi;
import com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailPageContainerAssem;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class IDxS304S0100000_3 implements InterfaceC116954iR {
    public final int $t;
    public Object l0;

    public static final void onComplete$2(IDxS304S0100000_3 iDxS304S0100000_3) {
    }

    public static final void onError$2(IDxS304S0100000_3 iDxS304S0100000_3, Throwable th) {
    }

    public static final void onSubscribe$2(IDxS304S0100000_3 iDxS304S0100000_3, InterfaceC92693kP interfaceC92693kP) {
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        switch (this.$t) {
            case 0:
                onComplete$0(this);
                return;
            case 1:
                onComplete$1(this);
                return;
            case 2:
                onComplete$2(this);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(th, "e");
                return;
            case 1:
                o.LJIIIZ(th, "e");
                return;
            case 2:
                onError$2(this, th);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(Object obj) {
        switch (this.$t) {
            case 0:
                onNext$0(this, obj);
                return;
            case 1:
                onNext$1(this, obj);
                return;
            case 2:
                onNext$2(this, obj);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        switch (this.$t) {
            case 0:
                onSubscribe$0(this, interfaceC92693kP);
                return;
            case 1:
                onSubscribe$1(this, interfaceC92693kP);
                return;
            case 2:
                onSubscribe$2(this, interfaceC92693kP);
                return;
            default:
                return;
        }
    }

    public static final void onComplete$0(IDxS304S0100000_3 iDxS304S0100000_3) {
        InterfaceC92693kP interfaceC92693kP;
        DetailPageContainerAssem detailPageContainerAssem = (DetailPageContainerAssem) iDxS304S0100000_3.l0;
        InterfaceC92693kP interfaceC92693kP2 = detailPageContainerAssem.LJLLJ;
        if (interfaceC92693kP2 != null && !interfaceC92693kP2.isDisposed() && (interfaceC92693kP = detailPageContainerAssem.LJLLJ) != null) {
            interfaceC92693kP.dispose();
        }
    }

    public static final void onComplete$1(IDxS304S0100000_3 iDxS304S0100000_3) {
        InterfaceC92693kP interfaceC92693kP;
        PoiDetailPageContainerAssem poiDetailPageContainerAssem = (PoiDetailPageContainerAssem) iDxS304S0100000_3.l0;
        InterfaceC92693kP interfaceC92693kP2 = poiDetailPageContainerAssem.LJLLJ;
        if (interfaceC92693kP2 != null && !interfaceC92693kP2.isDisposed() && (interfaceC92693kP = poiDetailPageContainerAssem.LJLLJ) != null) {
            interfaceC92693kP.dispose();
        }
    }

    public IDxS304S0100000_3(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onNext$0(IDxS304S0100000_3 iDxS304S0100000_3, Object obj) {
        ((Number) obj).longValue();
        C223318pb c223318pb = ((DetailPageContainerAssem) iDxS304S0100000_3.l0).LJLJLLL;
        if (c223318pb != null) {
            c223318pb.setRefreshing(false);
        } else {
            o.LJIJI("refreshLayout");
            throw null;
        }
    }

    public static final void onNext$1(IDxS304S0100000_3 iDxS304S0100000_3, Object obj) {
        ((Number) obj).longValue();
        C223318pb c223318pb = ((PoiDetailPageContainerAssem) iDxS304S0100000_3.l0).LJLJLLL;
        if (c223318pb != null) {
            c223318pb.setRefreshing(false);
        } else {
            o.LJIJI("refreshLayout");
            throw null;
        }
    }

    public static final void onNext$2(IDxS304S0100000_3 iDxS304S0100000_3, Object obj) {
        UserFavoritesApi.RetrofitApi retrofitApi = UserFavoritesApi.LIZ;
        C203727z6 c203727z6 = (C203727z6) iDxS304S0100000_3.l0;
        C10K<BaseResponse> collectAweme = retrofitApi.collectAweme(c203727z6.LJLJL, c203727z6.LJLJJI, c203727z6.LJLLI);
        C203727z6 c203727z62 = (C203727z6) iDxS304S0100000_3.l0;
        ExecutorService executorService = C10K.LJI;
        c203727z62.getClass();
        M8L.LIZ(C16880lQ.LLLZ("/aweme/v1/aweme/collect/", new Object[0]));
        collectAweme.LJ(new AgS86S0101000_3(1, c203727z62, 1), executorService, null);
    }

    public static final void onSubscribe$0(IDxS304S0100000_3 iDxS304S0100000_3, InterfaceC92693kP d) {
        o.LJIIIZ(d, "d");
        ((DetailPageContainerAssem) iDxS304S0100000_3.l0).LJLLJ = d;
    }

    public static final void onSubscribe$1(IDxS304S0100000_3 iDxS304S0100000_3, InterfaceC92693kP d) {
        o.LJIIIZ(d, "d");
        ((PoiDetailPageContainerAssem) iDxS304S0100000_3.l0).LJLLJ = d;
    }
}
