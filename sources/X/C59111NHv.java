package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.commercialize.model.Ad4adModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.NHv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59111NHv {
    public static final JSONObject LIZ(Aweme aweme) {
        JSONObject jSONObject = new JSONObject();
        HashMap<String, Object> LIZIZ = LIZIZ(aweme);
        if (LIZIZ != null) {
            for (Map.Entry<String, Object> entry : LIZIZ.entrySet()) {
                jSONObject.putOpt(entry.getKey(), entry.getValue());
            }
        }
        return jSONObject;
    }

    public static final HashMap<String, Object> LIZIZ(Aweme aweme) {
        String str;
        Integer num = null;
        if (aweme == null || !LIZLLL(aweme)) {
            return null;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        User author = aweme.getAuthor();
        if (author != null) {
            str = author.getUid();
        } else {
            str = null;
        }
        hashMap.put("author_id", str);
        hashMap.put("item_id", aweme.getAid());
        Ad4adModel LIZJ = LIZJ(aweme);
        if (LIZJ != null) {
            num = Integer.valueOf(LIZJ.getPromoteUserType(aweme));
        }
        hashMap.put("promote_new_user", num);
        hashMap.put("promote_user_account_type", Integer.valueOf(AccountService.LJIJ().LJFF().getCurUser().getAccountType()));
        return hashMap;
    }

    public static final Ad4adModel LIZJ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            return awemeRawAd.getAd4adModel();
        }
        return null;
    }

    public static final boolean LIZLLL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.isAd4ad() && LIZJ(aweme) != null) {
            return true;
        }
        return false;
    }

    public static final boolean LJ(Aweme aweme) {
        String str;
        Ad4adModel LIZJ = LIZJ(aweme);
        if (LIZLLL(aweme)) {
            String str2 = null;
            if (LIZJ != null) {
                str = LIZJ.getNotInterestedButtonText();
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                if (LIZJ != null) {
                    str2 = LIZJ.getPromoteButtonText();
                }
                if (TextUtils.isEmpty(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
