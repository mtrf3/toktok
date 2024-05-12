package X;

import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.viewmodel.LiveVerticalViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* loaded from: classes9.dex */
public final class KFU implements InterfaceC78468Uqu {
    public final /* synthetic */ LiveVerticalViewModel LIZ;

    public KFU(LiveVerticalViewModel liveVerticalViewModel) {
        this.LIZ = liveVerticalViewModel;
    }

    @Override // X.InterfaceC78468Uqu
    public final void LIZJ(EnterRoomConfig enterRoomConfig) {
        EnterRoomConfig.SearchWrapData searchWrapData;
        String str = this.LIZ.LJLJLLL;
        if (str == null || (searchWrapData = enterRoomConfig.mSearchData) == null) {
            return;
        }
        searchWrapData.listProviderTag = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC78468Uqu
    public final void LIZ(Aweme aweme, EnterRoomConfig enterRoomConfig) {
        HashMap<String, String> hashMap = new HashMap<>();
        LiveVerticalViewModel liveVerticalViewModel = this.LIZ;
        HashMap<String, String> hashMap2 = liveVerticalViewModel.LJLJLJ;
        if (hashMap2 != null) {
            hashMap.putAll(hashMap2);
            if ((aweme instanceof Aweme) && C78685UuP.LJJJZ(aweme.getAid())) {
                Object obj = ((LinkedHashMap) liveVerticalViewModel.LJLJJL).get(aweme.getAid());
                if (obj != null) {
                    hashMap.put("search_result_id", obj);
                }
            }
        }
        EnterRoomConfig.ECWrapData eCWrapData = enterRoomConfig.mECData;
        if (eCWrapData == null) {
            return;
        }
        eCWrapData.ecCommonExtraParam = hashMap;
    }

    @Override // X.InterfaceC78468Uqu
    public final void LIZIZ(Object obj, EnterRoomConfig enterRoomConfig) {
        EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
        if (logData != null && logData.search_result_id_v2 == null) {
            if (obj instanceof Aweme) {
                Aweme aweme = (Aweme) obj;
                if (C78685UuP.LJJJZ(aweme.getAid())) {
                    enterRoomConfig.mLogData.search_result_id_v2 = (String) ((LinkedHashMap) this.LIZ.LJLJJL).get(aweme.getAid());
                }
            }
            enterRoomConfig.mLogData.search_result_type = 2;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("log callback ");
            String str = enterRoomConfig.mLogData.search_result_id_v2;
            if (str == null) {
                str = "";
            }
            LIZ.append(str);
            X1D.LIZIZ(LIZ);
        }
    }
}
