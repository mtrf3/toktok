package X;

import com.ss.android.ugc.aweme.shortvideo.model.StoryGroupPublishModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GVC {
    public static final /* synthetic */ int LIZ = 0;

    public static C41627GVj LIZ(InterfaceC41630GVm fragment, String publishId, PublishModel publishModel) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(publishId, "publishId");
        o.LJIIIZ(publishModel, "publishModel");
        StoryGroupPublishModel storyGroupPublishModel = publishModel.storyGroupPublishModel;
        if (storyGroupPublishModel != null) {
            String str = storyGroupPublishModel.groupId;
            C41626GVi c41626GVi = new C41626GVi(fragment, publishId, publishModel, str);
            if (str != null) {
                LinkedHashMap linkedHashMap = (LinkedHashMap) C41626GVi.LJLLILLLL;
                Object obj = linkedHashMap.get(str);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(str, obj);
                }
                ((List) obj).add(c41626GVi);
                return c41626GVi;
            }
            return c41626GVi;
        }
        return new C41627GVj(fragment, publishId, publishModel);
    }
}
