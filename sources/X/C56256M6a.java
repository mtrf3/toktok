package X;

import com.ss.android.ugc.aweme.notice.api.bean.PushChallengeInfoMsg;
import org.json.JSONObject;

/* renamed from: X.M6a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56256M6a implements InterfaceC54360LVc {
    @Override // X.InterfaceC54360LVc
    public final void LJIIL(LVZ lvz) {
        if (lvz instanceof PushChallengeInfoMsg) {
            try {
                PushChallengeInfoMsg pushChallengeInfoMsg = (PushChallengeInfoMsg) lvz;
                String optString = new JSONObject(pushChallengeInfoMsg.getExtra()).optString("ticket");
                HG3.LJIIL();
                HG3.LJLJL.LJIIL().handlePushChallengeInfo(optString, pushChallengeInfoMsg.getUrl());
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }
}
