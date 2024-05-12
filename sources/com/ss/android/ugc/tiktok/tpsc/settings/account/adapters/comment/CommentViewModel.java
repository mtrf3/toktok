package com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.comment;

import X.C0N3;
import X.C71909SKb;
import X.C71969SMj;
import X.C72028SOq;
import X.C78966Uyw;
import X.FMX;
import X.SMS;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.tiktok.tpsc.settings.account.BasePrivacyUserSettingViewModelV3;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class CommentViewModel extends BasePrivacyUserSettingViewModelV3 {
    public String LJLJL;
    public String LJLJLJ;

    public CommentViewModel() {
        super("comment");
        this.LJLJL = "";
    }

    @Override // com.ss.android.ugc.tiktok.tpsc.base.BasePrivacySettingViewModel
    public final void iv0(int i, BaseResponse response) {
        o.LJIIIZ(response, "response");
        Integer num = this.LJLJJLL;
        String enterMethod = this.LJLJL;
        String str = this.LJLJLJ;
        o.LJIIIZ(enterMethod, "enterMethod");
        C72028SOq LIZ = C0N3.LIZ(C71909SKb.LIZ);
        C71969SMj c71969SMj = new C71969SMj();
        if (str == null) {
            str = "comment_permission";
        }
        c71969SMj.LIZIZ("enter_from", str);
        c71969SMj.LIZIZ("from_status", SMS.LIZ(num));
        c71969SMj.LIZIZ("to_status", SMS.LIZ(Integer.valueOf(i)));
        c71969SMj.LIZ(C78966Uyw.LJJIJL() ? 1 : 0);
        c71969SMj.LIZIZ("enter_method", enterMethod);
        Map<String, String> map = c71969SMj.LIZ;
        o.LJIIIIZZ(map, "EventMapBuilder()\n      …               .builder()");
        LIZ.getClass();
        FMX.LJIIL("change_comment_permission", map);
        C71909SKb.LIZJ().LIZ();
        C72028SOq.LJIJJ(i);
    }
}
