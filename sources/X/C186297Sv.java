package X;

import android.util.LruCache;
import com.ss.android.ugc.aweme.topic.movie.detail.api.MovieDetailResp;
import com.ss.android.ugc.aweme.topic.movie.model.MovieDetail;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7Sv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C186297Sv extends AbstractC54815LfH<String, C186317Sx> {
    public final int LIZIZ;
    public final long LIZJ;
    public final C62822Ol8 LIZLLL;

    public C186297Sv() {
        this(Integer.MAX_VALUE, -1L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC54815LfH
    public final C186317Sx LIZLLL(String k) {
        String str;
        Boolean bool;
        boolean booleanValue;
        o.LJIIIZ(k, "k");
        C199567sO c199567sO = (C199567sO) ((LruCache) this.LIZLLL.getValue()).get(k);
        MovieDetailResp movieDetailResp = null;
        if (c199567sO == null) {
            return null;
        }
        if (this.LIZJ > 0 && System.currentTimeMillis() - c199567sO.LIZIZ > this.LIZJ) {
            remove(k);
            return null;
        }
        MovieDetailResp movieDetailResp2 = ((C186317Sx) c199567sO.LIZ).LIZ;
        if (movieDetailResp2 == null) {
            return null;
        }
        MovieDetail movieDetail = movieDetailResp2.detail;
        if (movieDetail != null) {
            str = movieDetail.id;
        } else {
            str = null;
            if (movieDetailResp2 == null) {
                bool = null;
                if (str == null && bool != null) {
                    bool.booleanValue();
                    MovieDetailResp movieDetailResp3 = ((C186317Sx) c199567sO.LIZ).LIZ;
                    if (movieDetailResp3 != null) {
                        Boolean LIZIZ = C7OG.LIZIZ(C7PV.MOVIE, str);
                        if (LIZIZ != null) {
                            booleanValue = LIZIZ.booleanValue();
                        } else {
                            booleanValue = bool.booleanValue();
                        }
                        MovieDetail detail = movieDetailResp3.detail;
                        o.LJIIIZ(detail, "detail");
                        movieDetailResp = new MovieDetailResp(booleanValue, detail);
                    }
                    return new C186317Sx(movieDetailResp);
                }
            }
        }
        bool = Boolean.valueOf(movieDetailResp2.isCollected);
        return str == null ? null : null;
    }

    @Override // X.AbstractC54815LfH
    public final C199567sO<C186317Sx> LJ(String k) {
        o.LJIIIZ(k, "k");
        return (C199567sO) ((LruCache) this.LIZLLL.getValue()).remove(k);
    }

    public C186297Sv(int i, long j) {
        this.LIZIZ = i;
        this.LIZJ = j;
        this.LIZLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1711));
    }

    @Override // X.AbstractC54815LfH
    public final C199557sN LJFF(Object obj, Object v) {
        String k = (String) obj;
        o.LJIIIZ(k, "k");
        o.LJIIIZ(v, "v");
        C199557sN c199557sN = new C199557sN(System.currentTimeMillis(), v, k);
        ((LruCache) this.LIZLLL.getValue()).put(k, c199557sN);
        return c199557sN;
    }
}
