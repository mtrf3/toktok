package X;

import com.ss.android.ugc.aweme.detail.model.BatchDetailList;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JG4 {
    public static final ConcurrentHashMap<String, Aweme> LIZIZ = new ConcurrentHashMap<>();
    public final String LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.3C4, java.lang.Object] */
    public final Object LIZ() {
        Aweme aweme;
        boolean z;
        Aweme aweme2;
        String str;
        Aweme aweme3;
        Aweme aweme4 = LIZIZ.get(this.LIZ);
        if (aweme4 != null) {
            C3C5.m7constructorimpl(aweme4);
            aweme3 = aweme4;
        } else {
            String str2 = this.LIZ;
            try {
                if (str2.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
            } catch (Throwable th) {
                ?? LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
                aweme = LIZ;
            }
            if (!z) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append('[');
                LIZ2.append(str2);
                LIZ2.append(']');
                BatchDetailList LJII = JG5.LIZ().LJII(X1D.LIZIZ(LIZ2));
                List<Aweme> list = LJII.items;
                if (list != null && (aweme2 = (Aweme) ORZ.LJLLJ(list)) != null) {
                    LogPbBean logPbBean = LJII.logPbBean;
                    if (logPbBean != null) {
                        str = logPbBean.getImprId();
                    } else {
                        str = null;
                    }
                    aweme2.setRequestId(str);
                    C3C5.m7constructorimpl(aweme2);
                    aweme = aweme2;
                    boolean m13isSuccessimpl = C3C5.m13isSuccessimpl(aweme);
                    aweme3 = aweme;
                    if (m13isSuccessimpl) {
                        LIZIZ.put(this.LIZ, aweme);
                        aweme3 = aweme;
                    }
                } else {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("response can't find target aweme(");
                    LIZ3.append(str2);
                    LIZ3.append(")! logId: ");
                    LIZ3.append(LJII.requestId);
                    String LIZIZ2 = X1D.LIZIZ(LIZ3);
                    LIZIZ2.toString();
                    throw new IllegalStateException(LIZIZ2);
                }
            } else {
                throw new IllegalArgumentException("aid is empty!");
            }
        }
        return aweme3;
    }

    public JG4(String awemeId) {
        o.LJIIIZ(awemeId, "awemeId");
        this.LIZ = awemeId;
    }
}
