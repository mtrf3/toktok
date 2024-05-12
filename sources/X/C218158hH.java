package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.8hH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C218158hH {
    public final java.util.Map<String, String> LIZ = new ConcurrentHashMap();
    public final java.util.Map<String, String> LIZIZ = new ConcurrentHashMap();
    public final Gson LIZJ = new Gson();

    public static C218158hH LIZJ() {
        return C3A5.LIZ;
    }

    public final String LIZ(LogPbBean logPbBean) {
        if (logPbBean == null) {
            return "";
        }
        return GsonProtectorUtils.toJson(this.LIZJ, logPbBean);
    }

    public final String LIZIZ(String str) {
        if (TextUtils.isEmpty(str) || !((ConcurrentHashMap) this.LIZ).containsKey(str)) {
            return "";
        }
        return (String) ((ConcurrentHashMap) this.LIZ).get(str);
    }

    public final String LIZLLL(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (((ConcurrentHashMap) this.LIZ).containsKey(str)) {
            return (String) ((ConcurrentHashMap) this.LIZ).get(str);
        }
        LogPbBean logPbBean = new LogPbBean();
        logPbBean.setImprId(str);
        String json = GsonProtectorUtils.toJson(this.LIZJ, logPbBean);
        ((ConcurrentHashMap) this.LIZ).put(str, json);
        return json;
    }

    public final String LJ(String str) {
        if (TextUtils.isEmpty(str) || !((ConcurrentHashMap) this.LIZIZ).containsKey(str)) {
            return "";
        }
        return (String) ((ConcurrentHashMap) this.LIZIZ).get(str);
    }

    public final void LJFF(String str, LogPbBean logPbBean) {
        if (TextUtils.isEmpty(str) || logPbBean == null || logPbBean.getImprId() == null) {
            return;
        }
        ((ConcurrentHashMap) this.LIZ).put(str, GsonProtectorUtils.toJson(this.LIZJ, logPbBean));
    }

    public final void LJI(String str, LogPbBean logPbBean) {
        if (TextUtils.isEmpty(str) || logPbBean == null || logPbBean.getImprId() == null) {
            return;
        }
        ((ConcurrentHashMap) this.LIZIZ).put(str, GsonProtectorUtils.toJson(this.LIZJ, logPbBean));
    }
}
