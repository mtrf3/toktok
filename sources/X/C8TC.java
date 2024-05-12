package X;

import android.graphics.PointF;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.common.data.service.StoryIMService;
import com.ss.android.ugc.aweme.im.service.service.IStoryIMService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.feed.immersive.dm.StoryQuickDMBottomBarAssem;
import kotlin.jvm.internal.AqS169S0100000_3;

/* renamed from: X.8TC, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8TC implements IStoryIMService {
    public static final C8TC LIZIZ = new C8TC();
    public final /* synthetic */ IStoryIMService LIZ;

    @Override // com.ss.android.ugc.aweme.im.service.service.IStoryIMService
    public final boolean LIZ(Aweme aweme) {
        return this.LIZ.LIZ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IStoryIMService
    public final void LIZIZ(String str, User user, Aweme aweme, String str2, String str3, Boolean bool, C4XO c4xo) {
        this.LIZ.LIZIZ(str, user, aweme, str2, str3, bool, c4xo);
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IStoryIMService
    public final AbstractC73672Svk<C111144Xu> LIZJ(Aweme aweme) {
        return this.LIZ.LIZJ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IStoryIMService
    public final void LIZLLL(View view, FragmentManager fragmentManager, Aweme aweme, User user, String str, String str2, String str3, boolean z, StoryQuickDMBottomBarAssem storyQuickDMBottomBarAssem, AqS169S0100000_3 aqS169S0100000_3) {
        this.LIZ.LIZLLL(view, fragmentManager, aweme, user, str, str2, str3, z, storyQuickDMBottomBarAssem, aqS169S0100000_3);
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IStoryIMService
    public final void LJ(PointF pointF) {
        this.LIZ.LJ(pointF);
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IStoryIMService
    public final PointF LJFF() {
        return this.LIZ.LJFF();
    }

    public C8TC() {
        IStoryIMService iStoryIMService;
        Object LIZ = C58096Mr6.LIZ(IStoryIMService.class, false);
        if (LIZ != null) {
            iStoryIMService = (IStoryIMService) LIZ;
        } else {
            if (C58096Mr6.i1 == null) {
                synchronized (IStoryIMService.class) {
                    if (C58096Mr6.i1 == null) {
                        C58096Mr6.i1 = new StoryIMService();
                    }
                }
            }
            iStoryIMService = C58096Mr6.i1;
        }
        this.LIZ = iStoryIMService;
    }
}
