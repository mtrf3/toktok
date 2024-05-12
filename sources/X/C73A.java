package X;

import com.ss.android.ugc.now.interaction.assem.CommentItem;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AqS169S0100000_3;

/* renamed from: X.73A, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C73A {
    public boolean LJ;
    public AqS169S0100000_3 LJIIIIZZ;
    public final java.util.Map<String, Long> LIZ = new LinkedHashMap();
    public final java.util.Map<String, Long> LIZIZ = new LinkedHashMap();
    public final java.util.Set<String> LIZJ = new LinkedHashSet();
    public final java.util.Map<String, CommentItem> LIZLLL = new LinkedHashMap();
    public String LJFF = "";
    public String LJI = "";
    public String LJII = "";

    public final void LIZ() {
        for (String str : this.LIZJ) {
            CommentItem commentItem = (CommentItem) ((LinkedHashMap) this.LIZLLL).get(str);
            if (commentItem != null) {
                LIZJ(str, commentItem);
            }
        }
    }

    public final void LIZIZ(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("recordCommentHide  ");
        LIZ.append(str);
        C71Y.LIZ("CommentDurationTrack", X1D.LIZIZ(LIZ));
        if (str == null || !this.LIZ.containsKey(str)) {
            return;
        }
        C71Y.LIZ("CommentDurationTrack", "recordCommentHide and record duration");
        Long l = (Long) ((LinkedHashMap) this.LIZ).get(str);
        this.LIZ.remove(str);
        if (l != null) {
            l.longValue();
            long currentTimeMillis = System.currentTimeMillis() - l.longValue();
            long j = 0;
            if (currentTimeMillis <= 0) {
                return;
            }
            Long l2 = (Long) ((LinkedHashMap) this.LIZIZ).get(str);
            if (l2 != null) {
                j = l2.longValue();
            }
            this.LIZIZ.put(str, Long.valueOf(currentTimeMillis + j));
        }
    }

    public final void LIZJ(String str, CommentItem commentItem) {
        if (!this.LJ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("recordCommentShow ");
            LIZ.append(str);
            LIZ.append(" but current panel is hide");
            C71Y.LIZ("CommentDurationTrack", X1D.LIZIZ(LIZ));
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("recordCommentShow ");
        LIZ2.append(str);
        C71Y.LIZ("CommentDurationTrack", X1D.LIZIZ(LIZ2));
        if (str == null) {
            return;
        }
        this.LIZ.put(str, Long.valueOf(System.currentTimeMillis()));
        this.LIZJ.add(str);
        this.LIZLLL.put(str, commentItem);
    }
}
