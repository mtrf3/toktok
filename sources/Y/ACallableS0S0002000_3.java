package Y;

import X.C10K;
import X.C16880lQ;
import com.ss.android.ugc.aweme.favorites.api.UserFavoritesApi;
import com.ss.android.ugc.aweme.favorites.bean.StickerList;
import com.ss.android.ugc.aweme.favorites.model.CollectedCommentList;
import com.ss.android.ugc.aweme.favorites.model.CollectedQuestionList;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public class ACallableS0S0002000_3 implements Callable {
    public final int $t;
    public int i0;
    public int i1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS0S0002000_3 aCallableS0S0002000_3) {
        C10K<CollectedCommentList> fetchCollectCommentList = UserFavoritesApi.LIZ.fetchCollectCommentList(aCallableS0S0002000_3.i0, aCallableS0S0002000_3.i1);
        try {
            fetchCollectCommentList.LJIJI();
        } catch (InterruptedException e) {
            C16880lQ.LLLLIIL(e);
        }
        if (fetchCollectCommentList.LJIILJJIL()) {
            try {
                throw fetchCollectCommentList.LJIIJ();
            } catch (Exception e2) {
                C16880lQ.LLLLIIL(e2);
            }
        }
        return fetchCollectCommentList.LJIIJJI();
    }

    public static final Object call$1(ACallableS0S0002000_3 aCallableS0S0002000_3) {
        C10K<CollectedQuestionList> fetchCollectQuestionList = UserFavoritesApi.LIZ.fetchCollectQuestionList(aCallableS0S0002000_3.i0, aCallableS0S0002000_3.i1);
        try {
            fetchCollectQuestionList.LJIJI();
        } catch (InterruptedException e) {
            C16880lQ.LLLLIIL(e);
        }
        if (fetchCollectQuestionList.LJIILJJIL()) {
            try {
                throw fetchCollectQuestionList.LJIIJ();
            } catch (Exception e2) {
                C16880lQ.LLLLIIL(e2);
            }
        }
        return fetchCollectQuestionList.LJIIJJI();
    }

    public static final Object call$2(ACallableS0S0002000_3 aCallableS0S0002000_3) {
        C10K<StickerList> fetchStickerList = UserFavoritesApi.LIZ.fetchStickerList(aCallableS0S0002000_3.i0, aCallableS0S0002000_3.i1);
        try {
            fetchStickerList.LJIJI();
        } catch (InterruptedException e) {
            C16880lQ.LLLLIIL(e);
        }
        if (fetchStickerList.LJIILJJIL()) {
            try {
                throw fetchStickerList.LJIIJ();
            } catch (Exception e2) {
                C16880lQ.LLLLIIL(e2);
            }
        }
        return fetchStickerList.LJIIJJI();
    }

    public ACallableS0S0002000_3(int i, int i2) {
        this.$t = i2;
        this.i0 = i;
        this.i1 = 30;
    }

    public ACallableS0S0002000_3(int i, int i2, int i3) {
        this.$t = i3;
        this.i0 = i;
        this.i1 = i2;
    }
}
