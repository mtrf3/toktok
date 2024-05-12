package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class IN5 {
    public static final JSONObject LIZIZ(IDR idr) {
        if (idr != null) {
            return idr.getMobBaseJsonObject();
        }
        return null;
    }

    public static final String LIZJ(IDR idr) {
        String optString;
        JSONObject LIZIZ = LIZIZ(idr);
        if (LIZIZ == null || (optString = LIZIZ.optString("request_id")) == null) {
            return "";
        }
        return optString;
    }

    public static final String LIZLLL(List<String> voiceIdList) {
        o.LJIIIZ(voiceIdList, "voiceIdList");
        StringBuilder sb = new StringBuilder();
        int size = voiceIdList.size();
        for (int i = 0; i < size; i++) {
            if (i == 0) {
                sb.append("\"");
                sb.append((String) ListProtector.get(voiceIdList, i));
                sb.append("\"");
            } else {
                sb.append(",");
                sb.append("\"");
                sb.append((String) ListProtector.get(voiceIdList, i));
                sb.append("\"");
            }
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "sb.toString()");
        return sb2;
    }

    public static final boolean LIZ(String str, String str2) {
        if (TextUtils.equals(str, "personal_homepage") || TextUtils.equals(str, "others_homepage")) {
            return TextUtils.equals(str2, "output");
        }
        return false;
    }

    public static final void LJ(Aweme aweme, String str) {
        if (str != null && !TextUtils.isEmpty(str) && aweme != null && !TextUtils.isEmpty(aweme.getAid())) {
            String aid = aweme.getAid();
            o.LJIIIIZZ(aid, "aweme.aid");
            C48229IwL.LIZ(new C48231IwN(0, aid, str, System.currentTimeMillis()));
        }
    }
}
