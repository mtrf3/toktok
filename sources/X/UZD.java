package X;

import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.LinkedHashSet;
import org.json.JSONArray;
import org.json.JSONObject;
import ujb.o;

/* loaded from: classes14.dex */
public final class UZD extends AbstractC68941R3x {
    public final /* synthetic */ ActivityC45651qj LIZ;
    public final /* synthetic */ String LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.OQY] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.HashSet, java.util.LinkedHashSet] */
    @Override // X.AbstractC67055QTj
    public final void onSuccess(R4V r4v) {
        Boolean bool;
        QTX qtx;
        long j;
        ?? r3;
        JSONArray optJSONArray;
        R4V r4v2 = r4v;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("is success: ");
        String str = null;
        if (r4v2 != null) {
            bool = Boolean.valueOf(r4v2.LIZIZ);
        } else {
            bool = null;
        }
        LIZ.append(bool);
        X1D.LIZIZ(LIZ);
        if (r4v2 != null && (qtx = r4v2.LJIIIZ) != null) {
            ActivityC45651qj activityC45651qj = this.LIZ;
            String str2 = this.LIZIZ;
            User curUser = AccountService.LJIJ().LJFF().getCurUser();
            String uid = curUser.getUid();
            if (uid != null && !o.LJJJJJL(uid)) {
                String uid2 = curUser.getUid();
                JSONObject jSONObject = qtx.LJIIL;
                if (jSONObject != null) {
                    str = jSONObject.optString("user_id_str");
                }
                if (uid2.equals(str)) {
                    JSONObject jSONObject2 = qtx.LJIIL;
                    if (jSONObject2 != null) {
                        j = jSONObject2.optLong("user_id");
                    } else {
                        j = 0;
                    }
                    UZ1.LJFF = j;
                    JSONObject jSONObject3 = qtx.LJIIL;
                    if (jSONObject3 != null && (optJSONArray = jSONObject3.optJSONArray("user_info_prompt")) != null) {
                        r3 = new LinkedHashSet();
                        int length = optJSONArray.length();
                        for (int i = 0; i < length; i++) {
                            r3.add(Integer.valueOf(optJSONArray.optInt(i)));
                        }
                    } else {
                        r3 = OQY.INSTANCE;
                    }
                    boolean contains = r3.contains(2);
                    boolean contains2 = r3.contains(1);
                    if (contains) {
                        String email = curUser.getEmail();
                        if (email == null || o.LJJJJJL(email)) {
                            UZ1.LIZ();
                            return;
                        }
                        UZ8 uz8 = UZ8.EMAIL;
                        String email2 = curUser.getEmail();
                        kotlin.jvm.internal.o.LJIIIIZZ(email2, "user.email");
                        PopupManager.LJIIL(new UZ5(uz8, activityC45651qj, email2, str2));
                        return;
                    }
                    if (contains2) {
                        String bindPhone = curUser.getBindPhone();
                        if (bindPhone == null || o.LJJJJJL(bindPhone)) {
                            UZ1.LIZ();
                            return;
                        }
                        UZ8 uz82 = UZ8.PHONE;
                        String bindPhone2 = curUser.getBindPhone();
                        kotlin.jvm.internal.o.LJIIIIZZ(bindPhone2, "user.bindPhone");
                        PopupManager.LJIIL(new UZ5(uz82, activityC45651qj, bindPhone2, str2));
                        return;
                    }
                    UZ1.LIZ();
                    return;
                }
            }
            UZ1.LIZ();
            return;
        }
        UZ1.LIZ();
    }

    public UZD(ActivityC45651qj activityC45651qj, String str) {
        this.LIZ = activityC45651qj;
        this.LIZIZ = str;
    }

    @Override // X.AbstractC67055QTj
    public final void onError(R4V r4v, int i) {
        String str;
        R4V r4v2 = r4v;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("request user info failed, ");
        if (r4v2 != null) {
            str = r4v2.LJIILJJIL;
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        UZ1.LIZ();
    }
}
