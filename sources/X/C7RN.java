package X;

import com.ss.android.ugc.aweme.topic.movie.model.MovieDetail;
import kotlin.jvm.internal.o;

/* renamed from: X.7RN, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7RN extends F9E implements C33Q {
    public final AbstractC72932td<MovieDetail> LJLIL;
    public final boolean LJLILLLLZI;

    public C7RN() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI)};
    }

    public /* synthetic */ C7RN(int i) {
        this(C33X.LIZ, false);
    }

    public C7RN(AbstractC72932td<MovieDetail> movieDetail, boolean z) {
        o.LJIIIZ(movieDetail, "movieDetail");
        this.LJLIL = movieDetail;
        this.LJLILLLLZI = z;
    }

    public static C7RN L(C7RN c7rn, AbstractC72932td movieDetail, boolean z, int i) {
        if ((i & 1) != 0) {
            movieDetail = c7rn.LJLIL;
        }
        if ((i & 2) != 0) {
            z = c7rn.LJLILLLLZI;
        }
        c7rn.getClass();
        o.LJIIIZ(movieDetail, "movieDetail");
        return new C7RN(movieDetail, z);
    }
}
