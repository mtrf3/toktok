package X;

import com.ss.android.ugc.aweme.placediscovery2.ui.assem.DiscoveryPoiListAssem;
import org.json.JSONObject;

/* renamed from: X.M2l, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56163M2l implements InterfaceC81141Vsv {
    public final /* synthetic */ DiscoveryPoiListAssem LIZ;

    public C56163M2l(DiscoveryPoiListAssem discoveryPoiListAssem) {
        this.LIZ = discoveryPoiListAssem;
    }

    @Override // X.InterfaceC81141Vsv
    public final void onDragEnd(boolean z) {
        String str;
        DiscoveryPoiListAssem discoveryPoiListAssem = this.LIZ;
        JSONObject jSONObject = new JSONObject();
        if (z) {
            str = "expand";
        } else {
            str = "normal";
        }
        jSONObject.put("direction", str);
        discoveryPoiListAssem.getClass();
        C199617sT c199617sT = discoveryPoiListAssem.LJLIL;
        c199617sT.getClass();
        InterfaceC60761Nsz interfaceC60761Nsz = c199617sT.LIZ;
        if (interfaceC60761Nsz != null) {
            interfaceC60761Nsz.LJIIIZ("poiDiscoveryPopupChange", jSONObject);
        }
    }
}
