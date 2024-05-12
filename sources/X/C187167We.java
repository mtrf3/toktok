package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.ui.fragment.PostModeDetailFragment;

/* renamed from: X.7We, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C187167We extends AbstractC62641OiD {
    public final /* synthetic */ PostModeDetailFragment LJLIL;

    @Override // X.AbstractC62641OiD
    public final java.util.Map<String, String> mobExtalParams() {
        String str;
        String str2;
        Aweme aweme;
        Aweme aweme2;
        LogPbBean logPbBean;
        PostModeDetailParams postModeDetailParams;
        OSZ[] oszArr = new OSZ[1];
        C200847uS c200847uS = this.LJLIL.LJLJL;
        if (c200847uS == null || (postModeDetailParams = c200847uS.LJI) == null || (str = postModeDetailParams.eventType) == null) {
            str = "";
        }
        oszArr[0] = new OSZ("enter_from", str);
        java.util.Map<String, String> LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
        PostModeDetailFragment postModeDetailFragment = this.LJLIL;
        C200847uS c200847uS2 = postModeDetailFragment.LJLJL;
        Integer num = null;
        if (c200847uS2 != null && (aweme2 = c200847uS2.LIZJ) != null && (logPbBean = aweme2.getLogPbBean()) != null) {
            str2 = logPbBean.getImprId();
        } else {
            str2 = null;
        }
        LJJLIIIIJ.put("request_id", String.valueOf(str2));
        C200847uS c200847uS3 = postModeDetailFragment.LJLJL;
        if (c200847uS3 != null && (aweme = c200847uS3.LIZJ) != null) {
            num = Integer.valueOf(aweme.getAwemeType());
        }
        LJJLIIIIJ.put("aweme_type", String.valueOf(num));
        return LJJLIIIIJ;
    }

    public C187167We(PostModeDetailFragment postModeDetailFragment) {
        this.LJLIL = postModeDetailFragment;
    }
}
