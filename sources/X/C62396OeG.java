package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl;
import com.ss.android.ugc.tiktok.location_api.service.ILocationService;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.OeG, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62396OeG implements InterfaceC62474OfW {
    public final /* synthetic */ C193597il LIZ;

    public C62396OeG(C193597il c193597il) {
        this.LIZ = c193597il;
    }

    @Override // X.InterfaceC62474OfW
    public final void LIZLLL(Context context, BaseSharePackage baseSharePackage) {
        OQD.LIZIZ(baseSharePackage, context);
    }

    @Override // X.InterfaceC62474OfW
    public final void LJ(Context context, BaseSharePackage baseSharePackage) {
        OQD.LIZJ(baseSharePackage, context);
    }

    @Override // X.InterfaceC62474OfW
    public final void LIZIZ(Context context, BaseSharePackage baseSharePackage, InterfaceC62486Ofi interfaceC62486Ofi) {
        OQD.LIZ(interfaceC62486Ofi, baseSharePackage, context);
    }

    @Override // X.InterfaceC62474OfW
    public final void LJFF(View view, C62387Oe7 c62387Oe7, C5JV c5jv) {
        OQD.LIZLLL(view, c62387Oe7, c5jv);
    }

    @Override // X.InterfaceC110854Wr
    public final void LIZ(InterfaceC62225ObV channel, boolean z, BaseSharePackage baseSharePackage, Context context) {
        java.util.Map<String, String> locationCommonParamsIfHave;
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(context, "context");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", this.LIZ.LIZ);
        linkedHashMap.put("platform", channel.key());
        linkedHashMap.put("poi_id", this.LIZ.LIZIZ);
        linkedHashMap.put("poi_city", this.LIZ.LJFF);
        linkedHashMap.put("poi_region_code", this.LIZ.LJI);
        linkedHashMap.put("poi_info_source", this.LIZ.LJII);
        linkedHashMap.put("enable_location", String.valueOf(this.LIZ.LJIIIIZZ));
        linkedHashMap.put("previous_page", this.LIZ.LJIIIZ);
        Bundle bundle = this.LIZ.LJIIJJI;
        java.util.Set<String> keySet = bundle.keySet();
        if (keySet != null) {
            for (String key : keySet) {
                o.LJIIIIZZ(key, "key");
                linkedHashMap.put(key, String.valueOf(C16880lQ.LLJJIII(bundle, key)));
            }
        }
        ILocationService LJIJJ = LocationServiceImpl.LJIJJ();
        if (LJIJJ != null && (locationCommonParamsIfHave = LJIJJ.getLocationCommonParamsIfHave()) != null) {
            linkedHashMap.putAll(locationCommonParamsIfHave);
        }
        FMX.LJIIL("share_poi", linkedHashMap);
    }

    @Override // X.InterfaceC110854Wr
    public final Object LIZJ(Context context, BaseSharePackage baseSharePackage, InterfaceC62225ObV interfaceC62225ObV, InterfaceC67352kd interfaceC67352kd) {
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC62474OfW
    public final void LJI(InterfaceC62225ObV interfaceC62225ObV, boolean z, BaseSharePackage baseSharePackage, Context context) {
        OQD.LJ(interfaceC62225ObV, context);
    }
}
