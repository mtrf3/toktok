package com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.likedlist;

import X.C07250Qf;
import X.C71909SKb;
import X.C71969SMj;
import X.C72028SOq;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.tiktok.tpsc.settings.account.BasePrivacyUserSettingViewModelV3;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class LikedListViewModel extends BasePrivacyUserSettingViewModelV3 {
    public LikedListViewModel() {
        super("favorite");
    }

    @Override // com.ss.android.ugc.tiktok.tpsc.base.BasePrivacySettingViewModel
    public final void iv0(int i, BaseResponse response) {
        String str;
        o.LJIIIZ(response, "response");
        C71909SKb.LIZ.getClass();
        C71909SKb.LIZJ().LIZ();
        C72028SOq.LJIJJLI(i);
        if (i == 0) {
            str = "Everyone";
        } else {
            str = "Only_me";
        }
        C72028SOq LIZ = C71909SKb.LIZJ().LIZ();
        C71969SMj c71969SMj = new C71969SMj();
        c71969SMj.LIZIZ("enter_from", "liked_permission");
        c71969SMj.LIZIZ("to_status", str);
        Map<String, String> map = c71969SMj.LIZ;
        C07250Qf.LIZLLL(map, "EventMapBuilder()\n      …               .builder()", LIZ, "change_liked_permission", map);
    }
}
