package com.bytedance.ies.ugc.aweme.commwecialize.ba.api;

import X.C10K;
import X.C65087PgZ;
import X.E4Q;
import X.EF7;
import X.EnumC42934Gt8;
import X.X1D;
import Y.AgS124S0100000_7;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes8.dex */
public final class BAGetLeadsAnchorStateApi {
    public static final GetLeadsAnchorStateApi LIZ;

    /* loaded from: classes8.dex */
    public interface GetLeadsAnchorStateApi {
        @E4Q("/aweme/v1/ad/ba/leadsgen/anchor/status/")
        C10K<GetLeadsAnchorPublishResp> getAnchorState();
    }

    static {
        GetLeadsAnchorStateApi getLeadsAnchorStateApi;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("https://");
        LIZ2.append(EF7.LJI.LIZ);
        C65087PgZ LIZ3 = RetrofitFactory.LIZLLL().LIZ(X1D.LIZIZ(LIZ2));
        if (LIZ3 != null) {
            getLeadsAnchorStateApi = (GetLeadsAnchorStateApi) LIZ3.LJFF().LIZ.LIZ(GetLeadsAnchorStateApi.class);
        } else {
            getLeadsAnchorStateApi = null;
        }
        LIZ = getLeadsAnchorStateApi;
    }

    public static void LIZ(Map map) {
        GetLeadsAnchorStateApi getLeadsAnchorStateApi;
        C10K<GetLeadsAnchorPublishResp> anchorState;
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                AnchorPublishStruct anchorPublishStruct = (AnchorPublishStruct) ((Map.Entry) it.next()).getValue();
                if (anchorPublishStruct.type == EnumC42934Gt8.GET_LEADS.getTYPE() && (getLeadsAnchorStateApi = LIZ) != null && (anchorState = getLeadsAnchorStateApi.getAnchorState()) != null) {
                    anchorState.LIZLLL(new AgS124S0100000_7(anchorPublishStruct, 4));
                }
            }
        }
    }
}
