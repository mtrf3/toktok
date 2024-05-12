package X;

import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.CommonUserInfo;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R3T implements InterfaceC38012Evw {
    public final C38049EwX LJLIL;

    public R3T(C38049EwX iesJsBridge) {
        o.LJIIIZ(iesJsBridge, "iesJsBridge");
        this.LJLIL = iesJsBridge;
    }

    @Override // X.InterfaceC38012Evw
    public final void call(C38048EwW c38048EwW, JSONObject jSONObject) {
        int i;
        String str;
        String str2;
        String str3;
        String secUid;
        JSONObject jSONObject2;
        JSONObject jSONObject3 = new JSONObject();
        if (c38048EwW != null && (jSONObject2 = c38048EwW.LIZLLL) != null) {
            i = jSONObject2.optInt("limit");
        } else {
            i = 3;
        }
        List<BaseLoginMethod> LJ = C68517Qun.LIZ.LJ(R41.LIZIZ.LJFF().allUidList());
        JSONArray jSONArray = new JSONArray();
        for (BaseLoginMethod baseLoginMethod : LJ) {
            JSONObject jSONObject4 = new JSONObject();
            CommonUserInfo commonUserInfo = baseLoginMethod.getCommonUserInfo();
            String str4 = "";
            if (commonUserInfo == null || (str2 = commonUserInfo.getAvatarUrl()) == null) {
                str2 = "";
            }
            jSONObject4.put("avatar", str2);
            CommonUserInfo commonUserInfo2 = baseLoginMethod.getCommonUserInfo();
            if (commonUserInfo2 == null || (str3 = commonUserInfo2.getUserName()) == null) {
                str3 = "";
            }
            jSONObject4.put("nickname", str3);
            CommonUserInfo commonUserInfo3 = baseLoginMethod.getCommonUserInfo();
            if (commonUserInfo3 != null && (secUid = commonUserInfo3.getSecUid()) != null) {
                str4 = secUid;
            }
            jSONObject4.put("sec_uid", str4);
            jSONObject4.put("uid", baseLoginMethod.getUid());
            jSONArray.put(jSONObject4);
            if (jSONArray.length() >= i) {
                break;
            }
        }
        jSONObject3.put("data", jSONArray);
        C38049EwX c38049EwX = this.LJLIL;
        if (c38048EwW != null) {
            str = c38048EwW.LIZIZ;
        } else {
            str = null;
        }
        c38049EwX.LIZLLL(str, jSONObject3);
    }
}
