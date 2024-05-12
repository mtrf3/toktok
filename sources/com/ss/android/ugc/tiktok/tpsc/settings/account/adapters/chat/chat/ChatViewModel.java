package com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.chat.chat;

import X.C0N3;
import X.C71909SKb;
import X.C71969SMj;
import X.C71976SMq;
import X.C72028SOq;
import X.C72041SPd;
import X.FMX;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import com.ss.android.ugc.tiktok.tpsc.settings.account.BasePrivacyUserSettingViewModelV3;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ChatViewModel extends BasePrivacyUserSettingViewModelV3 {
    public String LJLJL;
    public String LJLJLJ;

    public ChatViewModel() {
        super("direct_message");
        this.LJLJL = "";
        this.LJLJLJ = "";
    }

    @Override // com.ss.android.ugc.tiktok.tpsc.base.BasePrivacySettingViewModel
    public final void iv0(int i, BaseResponse response) {
        o.LJIIIZ(response, "response");
        Integer num = this.LJLJJLL;
        String enterFrom = this.LJLJL;
        String enterMethod = this.LJLJLJ;
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        C71969SMj c71969SMj = new C71969SMj();
        c71969SMj.LIZIZ("enter_from", enterFrom);
        c71969SMj.LIZIZ("from_status", C71976SMq.LIZ(num));
        c71969SMj.LIZIZ("to_status", C71976SMq.LIZ(Integer.valueOf(i)));
        if (enterMethod.length() > 0) {
            c71969SMj.LIZIZ("enter_method", enterMethod);
        }
        C72028SOq LIZ = C0N3.LIZ(C71909SKb.LIZ);
        Map<String, String> map = c71969SMj.LIZ;
        o.LJIIIIZZ(map, "builder.builder()");
        LIZ.getClass();
        FMX.LJIIL("change_message_permission", map);
        C71909SKb.LIZJ().LIZ();
        if (C72028SOq.LJII()) {
            C72041SPd.LIZ.getClass();
            PrivacyUserSettingsV2 LJI = C72041SPd.LJI();
            if (LJI != null) {
                C71909SKb.LIZJ().LIZ();
                boolean LJIIIZ = C72028SOq.LJIIIZ();
                Integer M = LJI.M("dm_safe_mode");
                Integer M2 = LJI.M("message_read_status");
                Integer M3 = LJI.M("dm_filter_keyword");
                if (i == 3) {
                    C71976SMq.LIZIZ(2, M2, "read_receipt");
                    C71976SMq.LIZIZ(2, M, "filtered_request");
                    C71976SMq.LIZIZ(2, M3, "filtered_keywords");
                    if (LJIIIZ) {
                        C71976SMq.LIZIZ(2, LJI.M("dm_filter_nude"), "nude_filter");
                    }
                } else if (num != null && num.intValue() == 3 && i != 3) {
                    C71976SMq.LIZIZ(1, M2, "read_receipt");
                    C71976SMq.LIZIZ(1, M, "filtered_request");
                    C71976SMq.LIZIZ(1, M3, "filtered_keywords");
                    if (LJIIIZ) {
                        C71976SMq.LIZIZ(1, LJI.M("dm_filter_nude"), "nude_filter");
                    }
                }
            }
        }
        C71909SKb.LIZJ().LIZ();
        C72028SOq.LJIJI(i);
    }
}
