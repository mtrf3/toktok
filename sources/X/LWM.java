package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.follow.service.FollowFeedServiceImpl;
import com.ss.android.ugc.aweme.service.IFollowFeedService;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LWM implements IFollowFeedService {
    public static final LWM LIZIZ = new LWM();
    public final /* synthetic */ IFollowFeedService LIZ = FollowFeedServiceImpl.LJIILL();

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final BaseDetailShareVM<?, ?, Long> LIZ(Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        return this.LIZ.LIZ(fragment);
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final void LIZIZ(ArrayList<String> arrayList) {
        this.LIZ.LIZIZ(arrayList);
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final boolean LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final LKJ LIZLLL(ActivityC45651qj context) {
        o.LJIIIZ(context, "context");
        return this.LIZ.LIZLLL(context);
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final Fragment LJ() {
        return this.LIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final boolean LJFF(C50420Jqa event) {
        o.LJIIIZ(event, "event");
        return this.LIZ.LJFF(event);
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final boolean LJI() {
        return this.LIZ.LJI();
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final boolean LJII(ActivityC45651qj activityC45651qj) {
        return this.LIZ.LJII(activityC45651qj);
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final void LJIIIIZZ(Context context, List<FollowingInterestUser> list) {
        this.LIZ.LJIIIIZZ(context, list);
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final EE1 LJIIIZ(Context context) {
        return this.LIZ.LJIIIZ(context);
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final List<Aweme> LJIIJ(List<? extends FollowFeed> list) {
        o.LJIIIZ(list, "list");
        return this.LIZ.LJIIJ(list);
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final void LJIIJJI(Context context) {
        o.LJIIIZ(context, "context");
        this.LIZ.LJIIJJI(context);
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final void LJIIL() {
        this.LIZ.LJIIL();
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final int LJIILIIL() {
        return this.LIZ.LJIILIIL();
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final void LJIILJJIL() {
        this.LIZ.LJIILJJIL();
    }

    @Override // com.ss.android.ugc.aweme.service.IFollowFeedService
    public final void refreshComment(Fragment fragment) {
        this.LIZ.refreshComment(fragment);
    }
}
