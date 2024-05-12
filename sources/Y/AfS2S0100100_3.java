package Y;

import X.AbstractC72932td;
import X.C229708zu;
import X.C3C1;
import X.C56178M3a;
import X.C72912tb;
import X.EnumC190987eY;
import X.EnumC191017eb;
import X.InterfaceC64592gB;
import X.M3Z;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.android.ugc.aweme.favorites.business.playlist.PlaylistCollectionStateAgent;
import com.ss.android.ugc.aweme.mix.api.response.MixDetailResponse;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel;
import com.ss.android.ugc.aweme.mix.model.MixStruct;
import com.ss.android.ugc.aweme.poi.detail.container.PoiDetailInfoViewModel;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.reviews.PoiDetailReviewsViewModel;
import com.ss.android.ugc.aweme.poi.detail.v2.PoiDetailYmalViewModel;
import com.ss.android.ugc.aweme.poi.map.PoiMapViewModel;
import com.ss.android.ugc.aweme.poi.map.model.DynamicMapParams;
import com.ss.android.ugc.aweme.poi.map.service.GoogleMapServiceImpl;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS107S0300000_3;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class AfS2S0100100_3 implements InterfaceC64592gB {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            case 4:
                accept$4(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS2S0100100_3 afS2S0100100_3, Object obj) {
        MixDetailResponse mixDetailResponse = (MixDetailResponse) obj;
        MixVideosViewModel mixVideosViewModel = (MixVideosViewModel) afS2S0100100_3.l0;
        MixStruct mixStruct = mixDetailResponse.mixDetail;
        Long valueOf = Long.valueOf(afS2S0100100_3.j1);
        mixVideosViewModel.getClass();
        mixVideosViewModel.withState(new AqS107S0300000_3(mixStruct, mixVideosViewModel, valueOf, 44));
        PlaylistCollectionStateAgent.LJIJ().LJIIJ(Boolean.valueOf(mixDetailResponse.isCollected), ((MixVideosViewModel) afS2S0100100_3.l0).LJLJJI);
    }

    public static final void accept$1(AfS2S0100100_3 afS2S0100100_3, Object obj) {
        PoiReviewsApi.PoiReviewListResponse poiReviewListResponse = (PoiReviewsApi.PoiReviewListResponse) obj;
        if (poiReviewListResponse != null && poiReviewListResponse.status_code == 0) {
            PoiDetailReviewsViewModel poiDetailReviewsViewModel = (PoiDetailReviewsViewModel) afS2S0100100_3.l0;
            poiDetailReviewsViewModel.withState(new AqS134S0200000_3(poiDetailReviewsViewModel, poiReviewListResponse, 123));
            long currentTimeMillis = System.currentTimeMillis();
            M3Z m3z = new M3Z("poi_detail");
            m3z.LIZLLL = "network_data_parse";
            m3z.LIZ(currentTimeMillis - afS2S0100100_3.j1);
            m3z.LIZIZ(4L);
            C56178M3a.LIZ(m3z);
            return;
        }
        PoiDetailReviewsViewModel poiDetailReviewsViewModel2 = (PoiDetailReviewsViewModel) afS2S0100100_3.l0;
        poiDetailReviewsViewModel2.getClass();
        poiDetailReviewsViewModel2.withState(new AqS169S0100000_3(poiDetailReviewsViewModel2, 683));
    }

    public static final void accept$2(AfS2S0100100_3 afS2S0100100_3, Object obj) {
        List arrayList;
        PoiListApi.PoiYMALResponse poiYMALResponse = (PoiListApi.PoiYMALResponse) obj;
        if (poiYMALResponse != null && poiYMALResponse.status_code == 0) {
            PoiDetailYmalViewModel poiDetailYmalViewModel = (PoiDetailYmalViewModel) afS2S0100100_3.l0;
            ArrayList arrayList2 = new ArrayList();
            if (poiYMALResponse == null || (arrayList = poiYMALResponse.ymalModels) == null) {
                arrayList = new ArrayList();
            }
            arrayList2.addAll(arrayList);
            poiDetailYmalViewModel.LJLIL = arrayList2;
            PoiDetailYmalViewModel poiDetailYmalViewModel2 = (PoiDetailYmalViewModel) afS2S0100100_3.l0;
            poiDetailYmalViewModel2.withState(new AqS169S0100000_3(poiDetailYmalViewModel2, 389));
            long currentTimeMillis = System.currentTimeMillis();
            M3Z m3z = new M3Z("poi_detail");
            m3z.LIZLLL = "network_data_parse";
            m3z.LIZ(currentTimeMillis - afS2S0100100_3.j1);
            m3z.LIZIZ(3L);
            C56178M3a.LIZ(m3z);
        }
    }

    public static final void accept$3(AfS2S0100100_3 afS2S0100100_3, Object obj) {
        PoiListApi.PoiLocation poiLocation;
        boolean z;
        Integer num;
        Double d;
        Double d2;
        Double d3;
        PoiListApi.PoiDetailResponse response = (PoiListApi.PoiDetailResponse) obj;
        if (response != null && response.status_code == 0) {
            long currentTimeMillis = System.currentTimeMillis() - afS2S0100100_3.j1;
            M3Z m3z = new M3Z("poi_map");
            m3z.LIZLLL = "network_data_parse";
            m3z.LIZ(currentTimeMillis);
            C56178M3a.LIZ(m3z);
            ((PoiMapViewModel) afS2S0100100_3.l0).LJLJI = Long.valueOf(System.currentTimeMillis());
            PoiMapViewModel poiMapViewModel = (PoiMapViewModel) afS2S0100100_3.l0;
            o.LJIIIIZZ(response, "response");
            C72912tb c72912tb = new C72912tb(response);
            poiMapViewModel.getClass();
            poiMapViewModel.setState(new AqS169S0100000_3(c72912tb, (AbstractC72932td<C229708zu>) 858));
            PoiListApi.PoiLocation poiLocation2 = response.poiLocation;
            if ((poiLocation2 == null || poiLocation2.getLat() == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) && ((poiLocation = response.poiLocation) == null || poiLocation.getLng() == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX)) {
                z = false;
            } else {
                z = true;
            }
            if (!GoogleMapServiceImpl.LJFF().LIZIZ()) {
                z = false;
            }
            if (!GoogleMapServiceImpl.LJFF().LIZJ()) {
                z = false;
            }
            DynamicMapParams dynamicMapParams = response.dynamicMapParams;
            if (dynamicMapParams == null || !o.LJ(dynamicMapParams.getEnableDynamicMap(), Boolean.TRUE)) {
                z = false;
            }
            DynamicMapParams dynamicMapParams2 = response.dynamicMapParams;
            Double d4 = null;
            if (dynamicMapParams2 != null) {
                num = dynamicMapParams2.getDefaultZoomLevel();
            } else {
                num = null;
            }
            DynamicMapParams dynamicMapParams3 = response.dynamicMapParams;
            if (dynamicMapParams3 != null) {
                d = dynamicMapParams3.getLatMax();
            } else {
                d = null;
            }
            DynamicMapParams dynamicMapParams4 = response.dynamicMapParams;
            if (dynamicMapParams4 != null) {
                d2 = dynamicMapParams4.getLatMin();
            } else {
                d2 = null;
            }
            DynamicMapParams dynamicMapParams5 = response.dynamicMapParams;
            if (dynamicMapParams5 != null) {
                d3 = dynamicMapParams5.getLngMax();
            } else {
                d3 = null;
            }
            DynamicMapParams dynamicMapParams6 = response.dynamicMapParams;
            if (dynamicMapParams6 != null) {
                d4 = dynamicMapParams6.getLngMin();
            }
            if ((num == null && d != null && d2 != null && d3 != null && d4 != null) || !z) {
                if (response.address != null) {
                    PoiMapViewModel poiMapViewModel2 = (PoiMapViewModel) afS2S0100100_3.l0;
                    EnumC190987eY enumC190987eY = EnumC190987eY.TYPE_STATIC_MAP;
                    poiMapViewModel2.getClass();
                    poiMapViewModel2.setState(new AqS169S0100000_3(enumC190987eY, 857));
                } else {
                    ((PoiMapViewModel) afS2S0100100_3.l0).gv0(EnumC191017eb.STATUS_POI_DETAIL_FAIL);
                }
            } else {
                PoiMapViewModel poiMapViewModel3 = (PoiMapViewModel) afS2S0100100_3.l0;
                EnumC190987eY enumC190987eY2 = EnumC190987eY.TYPE_DYNAMIC_MAP;
                poiMapViewModel3.getClass();
                poiMapViewModel3.setState(new AqS169S0100000_3(enumC190987eY2, 857));
            }
            ((PoiMapViewModel) afS2S0100100_3.l0).gv0(EnumC191017eb.STATUS_POI_DETAIL_READY);
            return;
        }
        PoiMapViewModel poiMapViewModel4 = (PoiMapViewModel) afS2S0100100_3.l0;
        C3C1 c3c1 = new C3C1(new Exception("network error"));
        poiMapViewModel4.getClass();
        poiMapViewModel4.setState(new AqS169S0100000_3(c3c1, (AbstractC72932td<C229708zu>) 858));
        ((PoiMapViewModel) afS2S0100100_3.l0).gv0(EnumC191017eb.STATUS_POI_DETAIL_FAIL);
    }

    public static final void accept$4(AfS2S0100100_3 afS2S0100100_3, Object obj) {
        long currentTimeMillis = System.currentTimeMillis();
        M3Z m3z = new M3Z("poi_detail");
        m3z.LIZLLL = "network_data_parse";
        m3z.LIZ(currentTimeMillis - afS2S0100100_3.j1);
        m3z.LIZIZ(1L);
        C56178M3a.LIZ(m3z);
        ((PoiDetailInfoViewModel) afS2S0100100_3.l0).gv0((PoiListApi.PoiDetailResponse) obj, null);
        ((PoiDetailInfoViewModel) afS2S0100100_3.l0).getClass();
    }

    public AfS2S0100100_3(long j, Object obj, int i) {
        this.$t = i;
        this.j1 = j;
        this.l0 = obj;
    }
}
