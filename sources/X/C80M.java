package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.80M, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C80M {
    public final CopyOnWriteArrayList<String> LIZ;
    public final SharedPreferences LIZIZ;

    public C80M() {
        SharedPreferences LIZIZ = F9J.LIZIZ(EF7.LIZIZ(), 0, "sp_show_share_guide_cache");
        this.LIZIZ = LIZIZ;
        try {
            List LIZIZ2 = JsonParseUtils.LIZIZ(String.class, LIZIZ.getString("cached_video_id", ""));
            if (LIZIZ2 != null) {
                this.LIZ = new CopyOnWriteArrayList<>(LIZIZ2);
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        if (this.LIZ == null) {
            this.LIZ = new CopyOnWriteArrayList<>();
        }
    }

    public final void LIZ(String str) {
        if (TextUtils.isEmpty(str) || this.LIZ.contains(str)) {
            return;
        }
        if (this.LIZ.size() >= 20) {
            this.LIZ.remove(0);
        }
        this.LIZ.add(str);
        try {
            this.LIZIZ.edit().putString("cached_video_id", JsonParseUtils.LIZLLL(this.LIZ)).apply();
        } catch (NullPointerException unused) {
        }
    }
}
