package X;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.DetailFeedService;
import com.ss.android.ugc.aweme.DetailFeedServiceImpl;
import com.ss.android.ugc.aweme.detail.model.BatchDetailList;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.LvB, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55801LvB implements DetailFeedService {
    public static final C55801LvB LIZIZ = new C55801LvB();
    public final /* synthetic */ DetailFeedService LIZ = DetailFeedServiceImpl.LJIIJ();

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final Aweme LIZ(String str, String str2) {
        return this.LIZ.LIZ(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final BatchDetailList LIZIZ(String str, String str2, int i, String str3, String str4) {
        return this.LIZ.LIZIZ(str, str2, i, str3, str4);
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final Aweme LIZJ(String str) {
        return this.LIZ.LIZJ(str);
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final Aweme LIZLLL(String str) {
        return this.LIZ.LIZLLL(str);
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final String LJ(String str, String str2, String str3) {
        return this.LIZ.LJ(str, str2, str3);
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final BatchDetailList LJFF(String str) {
        return this.LIZ.LJFF(str);
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final Fragment LJI(Activity activity) {
        o.LJIIIZ(activity, "activity");
        return this.LIZ.LJI(activity);
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final BatchDetailList LJII(String str) {
        return this.LIZ.LJII(str);
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final java.util.Map<String, View> LJIIIIZZ(View rootView) {
        o.LJIIIZ(rootView, "rootView");
        return this.LIZ.LJIIIIZZ(rootView);
    }

    @Override // com.ss.android.ugc.aweme.DetailFeedService
    public final Class<? extends Activity> LJIIIZ() {
        return this.LIZ.LJIIIZ();
    }
}
