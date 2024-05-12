package X;

import android.content.SharedPreferences;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.7nG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C196387nG {
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C196397nH.LJLIL);
    public final CopyOnWriteArrayList<String> LIZ;
    public final SharedPreferences LIZIZ;

    public C196387nG() {
        SharedPreferences LIZIZ = F9J.LIZIZ(EF7.LIZIZ(), 0, "sp_show_share_btn_guide_cache");
        o.LJIIIIZZ(LIZIZ, "getApplicationContext().…    Context.MODE_PRIVATE)");
        this.LIZIZ = LIZIZ;
        try {
            List LIZIZ2 = JsonParseUtils.LIZIZ(String.class, LIZIZ.getString("cached_video_id_4_share_btn", ""));
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
}
