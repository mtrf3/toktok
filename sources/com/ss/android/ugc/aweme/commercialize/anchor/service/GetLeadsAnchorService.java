package com.ss.android.ugc.aweme.commercialize.anchor.service;

import X.C36922EeM;
import X.C42923Gsx;
import X.C58096Mr6;
import X.EnumC42934Gt8;
import X.X1D;
import X.YHS;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.anchor.service.IGetLeadsAnchorService;
import com.ss.android.ugc.aweme.base.AnchorListManager;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class GetLeadsAnchorService implements IGetLeadsAnchorService {
    public final Keva LIZ;
    public int LIZIZ;

    public static IGetLeadsAnchorService LIZLLL() {
        Object LIZ = C58096Mr6.LIZ(IGetLeadsAnchorService.class, false);
        if (LIZ != null) {
            return (IGetLeadsAnchorService) LIZ;
        }
        if (C58096Mr6.LLLIL == null) {
            synchronized (IGetLeadsAnchorService.class) {
                if (C58096Mr6.LLLIL == null) {
                    C58096Mr6.LLLIL = new GetLeadsAnchorService();
                }
            }
        }
        return C58096Mr6.LLLIL;
    }

    public GetLeadsAnchorService() {
        Keva repo = Keva.getRepo("anchor_data_keva");
        o.LJIIIIZZ(repo, "getRepo(ANCHOR_KEVA_NAME)");
        this.LIZ = repo;
        this.LIZIZ = 1;
    }

    @Override // com.ss.android.ugc.aweme.anchor.service.IGetLeadsAnchorService
    public final boolean LIZ(Integer num) {
        if (num == null) {
            return false;
        }
        num.intValue();
        if (num.intValue() == this.LIZIZ) {
            return false;
        }
        this.LIZIZ = num.intValue();
        Map map = null;
        try {
            String string = this.LIZ.getString("anchor_map_key", null);
            if (!TextUtils.isEmpty(string)) {
                YHS.LIZ.getClass();
                Map map2 = (Map) YHS.LIZIZ.LJII(string, new TypeToken<Map<String, AnchorPublishStruct>>() { // from class: X.2TD
                }.getType());
                map = map2;
                if (map2 != null) {
                    Iterator it = map2.entrySet().iterator();
                    while (it.hasNext()) {
                        AnchorPublishStruct anchorPublishStruct = (AnchorPublishStruct) ((Map.Entry) it.next()).getValue();
                        if (anchorPublishStruct.type == EnumC42934Gt8.GET_LEADS.getTYPE()) {
                            anchorPublishStruct.getLeadsAnchorState = num.intValue();
                        }
                    }
                }
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("GetLeadsAnchorService getLocalData Exception: ");
            LIZ.append(e);
            C36922EeM.LJ(X1D.LIZIZ(LIZ));
            C36922EeM.LJFF(e);
        }
        AnchorListManager.LJIILIIL(map);
        Keva keva = this.LIZ;
        YHS.LIZ.getClass();
        keva.storeString("anchor_map_key", GsonProtectorUtils.toJson(YHS.LIZIZ, map, new C42923Gsx().getType()));
        return true;
    }

    @Override // com.ss.android.ugc.aweme.anchor.service.IGetLeadsAnchorService
    public final boolean LIZIZ(JSONObject jSONObject) {
        JSONObject jSONObject2;
        int optInt;
        if (jSONObject != null) {
            jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "data");
        } else {
            jSONObject2 = null;
        }
        if (jSONObject2 == null || (optInt = jSONObject2.optInt("leadsGenStatusCode", 1)) != 0) {
            return false;
        }
        LIZ(Integer.valueOf(optInt));
        return true;
    }

    @Override // com.ss.android.ugc.aweme.anchor.service.IGetLeadsAnchorService
    public final boolean LIZJ(JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (jSONObject == null || (jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "data")) == null) {
            return false;
        }
        return LIZ(Integer.valueOf(jSONObject2.optInt("leadsGenStatusCode")));
    }
}
