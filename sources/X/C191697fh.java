package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.android.ugc.aweme.placediscovery2.model.DiscoverMapResponse;
import com.ss.android.ugc.aweme.placediscovery2.model.DiscoveryPoi;
import com.ss.android.ugc.aweme.placediscovery2.model.Location;
import fjb.a;
import java.util.ArrayList;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.placediscovery2.map.MarkerDataParser$parseResp2MarkerData$2", f = "MarkerDataParser.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.7fh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C191697fh extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super List<C191707fi>>, Object> {
    public final /* synthetic */ DiscoverMapResponse LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C191697fh(DiscoverMapResponse discoverMapResponse, InterfaceC67352kd<? super C191697fh> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = discoverMapResponse;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C191697fh(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        double d;
        Double lng;
        C141335gf.LIZJ(obj);
        int size = this.LJLIL.getPoiList().size();
        ArrayList arrayList = new ArrayList();
        List<DiscoveryPoi> poiList = this.LJLIL.getPoiList();
        if (!poiList.isEmpty()) {
            int i = 0;
            for (DiscoveryPoi discoveryPoi : poiList) {
                int i2 = i + 1;
                if (i >= 0) {
                    DiscoveryPoi discoveryPoi2 = discoveryPoi;
                    String poiId = discoveryPoi2.getPoiId();
                    String str = "";
                    if (poiId == null) {
                        poiId = "";
                    }
                    C191707fi c191707fi = new C191707fi(poiId, 126);
                    String poiName = discoveryPoi2.getPoiName();
                    if (poiName != null) {
                        str = poiName;
                    }
                    c191707fi.LIZJ = str;
                    c191707fi.LIZLLL = false;
                    c191707fi.LJ = size - i;
                    Location location = discoveryPoi2.getLocation();
                    double d2 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                    if (location != null) {
                        d = location.getLat();
                    } else {
                        d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                    }
                    Location location2 = discoveryPoi2.getLocation();
                    if (location2 != null && (lng = location2.getLng()) != null) {
                        d2 = lng.doubleValue();
                    }
                    c191707fi.LJFF = new C191717fj(d, d2);
                    c191707fi.LJI = discoveryPoi2.getPoiTitleImg();
                    arrayList.add(c191707fi);
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super List<C191707fi>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
