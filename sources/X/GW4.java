package X;

import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.story.IStoryGroupScheduleService;

/* loaded from: classes8.dex */
public final class GW4 extends AbstractC65781Prl implements InterfaceC65784Pro<IStoryGroupScheduleService> {
    public static final GW4 LJLIL = new GW4();

    public GW4() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IStoryGroupScheduleService invoke() {
        return AVExternalServiceImpl.LIZ().storyService().storyPublishService().getGroupScheduleService();
    }
}
