package X;

import android.view.View;
import com.bytedance.android.live.wallet.model.LocationObject;
import com.bytedance.android.live.walletnew.ui.LocationList;
import com.bytedance.android.live.walletnew.ui.LocationService;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.UfQ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77756UfQ implements InterfaceC65309Pk9 {
    public final /* synthetic */ LocationList LIZ;

    public C77756UfQ(LocationList locationList) {
        this.LIZ = locationList;
    }

    @Override // X.InterfaceC65309Pk9
    public final void LIZ(String result) {
        o.LJIIIZ(result, "result");
        JSONObject jSONObject = new JSONObject(result);
        if (!jSONObject.has("status") || (jSONObject.has("status") && o.LJ(jSONObject.get("status"), CardStruct.IStatusCode.DEFAULT))) {
            if (this.LIZ.LJLLI != 2) {
                C0NB.LIZIZ("USLocationDialog", jSONObject.toString());
                LocationList locationList = this.LIZ;
                locationList.LJLLI = 2;
                locationList.xl(null, "US");
                return;
            }
            C0NB.LIZIZ("USLocationDialog", jSONObject.toString());
            InterfaceC77761UfV interfaceC77761UfV = this.LIZ.LJLJJI;
            if (interfaceC77761UfV != null) {
                interfaceC77761UfV.LJIILL("Location API Incorrect Status");
                return;
            } else {
                o.LJIJI("onCompleteListener");
                throw null;
            }
        }
        LocationList locationList2 = this.LIZ;
        locationList2.LJLLI = 1;
        C77757UfR c77757UfR = LocationService.LJLIL;
        LocationObject locationObject = locationList2.LJLLLL;
        JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "district");
        o.LJIIIIZZ(jSONObject2, "locationJson.getJSONObject(\"district\")");
        c77757UfR.getClass();
        if (locationObject == null) {
            String string = JSONObjectProtectorUtils.getString(jSONObject2, "name");
            o.LJIIIIZZ(string, "locationJson.getString(\"name\")");
            String string2 = JSONObjectProtectorUtils.getString(jSONObject2, "code");
            o.LJIIIIZZ(string2, "locationJson.getString(\"code\")");
            String string3 = JSONObjectProtectorUtils.getString(jSONObject2, "asci_name");
            o.LJIIIIZZ(string3, "locationJson.getString(\"asci_name\")");
            int i = JSONObjectProtectorUtils.getInt(jSONObject2, "geoname_id");
            String string4 = JSONObjectProtectorUtils.getString(jSONObject2, "description");
            o.LJIIIIZZ(string4, "locationJson.getString(\"description\")");
            locationObject = new LocationObject(null, string, string2, string3, i, string4);
        }
        JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject2, "sub_region");
        o.LJIIIIZZ(jSONArray, "locationJson.getJSONArray(\"sub_region\")");
        C77757UfR.LIZ(locationObject, jSONArray);
        locationList2.LJLLLL = locationObject;
        LocationList locationList3 = this.LIZ;
        LocationObject[] locationObjectArr = locationList3.LJLZ;
        if (locationObjectArr != null) {
            locationObjectArr[locationList3.LJLL] = locationList3.LJLLLL;
            View view = locationList3.LJLILLLLZI;
            if (view != null) {
                view.findViewById(R.id.g9o).setVisibility(8);
                View view2 = locationList3.LJLILLLLZI;
                if (view2 != null) {
                    view2.findViewById(R.id.g9n).setVisibility(0);
                    LocationList locationList4 = this.LIZ;
                    locationList4.wl(locationList4.LJLL, 1);
                    return;
                }
                o.LJIJI("uiView");
                throw null;
            }
            o.LJIJI("uiView");
            throw null;
        }
        o.LJIJI("locationName");
        throw null;
    }

    @Override // X.InterfaceC65309Pk9
    public final void LIZIZ(String str) {
        C279017q.LJ("Fetch Failure ", str, "USLocationDialog");
        LocationList locationList = this.LIZ;
        locationList.LJZ = str;
        locationList.LJLLI = 2;
        locationList.dismiss();
    }
}
