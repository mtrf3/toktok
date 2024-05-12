package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.base.service.FeedSkylightServiceImpl;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.friendstab.ui.SocialFriendsFeedFragment;
import com.ss.android.ugc.aweme.service.IFeedSkylightService;
import com.ss.android.ugc.aweme.story.inbox.StoryGetFeedByPageResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.LWx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54407LWx implements IFeedSkylightService {
    public static final C54407LWx LIZIZ = new C54407LWx();
    public final /* synthetic */ IFeedSkylightService LIZ;

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightService
    public final BaseDetailShareVM<?, ?, Long> LIZ(Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        return this.LIZ.LIZ(fragment);
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightService
    public final StoryGetFeedByPageResponse LIZIZ(long j, String str, EnumC54603Lbr scene) {
        o.LJIIIZ(scene, "scene");
        return this.LIZ.LIZIZ(j, str, scene);
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightService
    public final void LIZJ(SocialFriendsFeedFragment fragment, boolean z) {
        o.LJIIIZ(fragment, "fragment");
        this.LIZ.LIZJ(fragment, z);
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightService
    public final void LIZLLL(Fragment fragment, String enterMethod) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(enterMethod, "enterMethod");
        this.LIZ.LIZLLL(fragment, enterMethod);
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightService
    public final boolean LJ(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        return this.LIZ.LJ(activity);
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightService
    public final boolean LJFF(Fragment fragment) {
        return this.LIZ.LJFF(fragment);
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightService
    public final void LJI(Fragment fragment, C54406LWw config) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(config, "config");
        this.LIZ.LJI(fragment, config);
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightService
    public final void LJII(Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        this.LIZ.LJII(fragment);
    }

    public C54407LWx() {
        IFeedSkylightService iFeedSkylightService;
        Object LIZ = C58096Mr6.LIZ(IFeedSkylightService.class, false);
        if (LIZ != null) {
            iFeedSkylightService = (IFeedSkylightService) LIZ;
        } else {
            if (C58096Mr6.LLJILLL == null) {
                synchronized (IFeedSkylightService.class) {
                    if (C58096Mr6.LLJILLL == null) {
                        C58096Mr6.LLJILLL = new FeedSkylightServiceImpl();
                    }
                }
            }
            iFeedSkylightService = C58096Mr6.LLJILLL;
        }
        this.LIZ = iFeedSkylightService;
    }
}
