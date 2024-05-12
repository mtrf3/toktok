package X;

import com.ss.android.ugc.aweme.services.story.IStoryGroupScheduleService;
import com.ss.android.ugc.aweme.shortvideo.model.StoryGroupPublishModel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GOY implements IStoryGroupScheduleService {
    @Override // com.ss.android.ugc.aweme.services.story.IStoryGroupScheduleService
    public final void clearData(StoryGroupPublishModel storyGroupPublishModel) {
        String str;
        List<GUQ> remove;
        if (storyGroupPublishModel == null || (str = storyGroupPublishModel.groupId) == null || (remove = GOV.LIZJ.remove(str)) == null) {
            return;
        }
        Iterator<GUQ> it = remove.iterator();
        while (it.hasNext()) {
            String str2 = it.next().LJLJJL.LIZIZ;
            GOV.LIZLLL.remove(str2);
            GOV.LJ.remove(str2);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.story.IStoryGroupScheduleService
    public final boolean isAllTaskInGroupPublishFinished(StoryGroupPublishModel storyGroupPublishModel) {
        String str;
        List list;
        if (storyGroupPublishModel != null) {
            str = storyGroupPublishModel.groupId;
        } else {
            str = null;
        }
        if (str == null || (list = (List) ((LinkedHashMap) GOV.LIZJ).get(str)) == null || list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!(((GUQ) it.next()).LJLJJL.LIZLLL instanceof GOS)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.services.story.IStoryGroupScheduleService
    public final boolean retryGroupTask(ActivityC45651qj context, StoryGroupPublishModel storyGroupPublishModel) {
        String str;
        List<GUQ> remove;
        o.LJIIIZ(context, "context");
        if (storyGroupPublishModel == null || (str = storyGroupPublishModel.groupId) == null || (remove = GOV.LIZJ.remove(str)) == null) {
            return false;
        }
        XKX.LIZLLL((InterfaceC70422pa) GOV.LIZIZ.getValue(), null, null, new C41436GOa(remove, str, context, null), 3);
        return true;
    }
}
