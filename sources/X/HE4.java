package X;

import com.ss.android.ugc.aweme.services.external.IEnterFromService;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.CreativeFlowData;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HE4 implements IEnterFromService {
    public static final HE4 LIZ = new HE4();
    public static String LIZIZ = "HOME";

    @Override // com.ss.android.ugc.aweme.services.external.IEnterFromService
    public final String getEnterFrom() {
        return LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.services.external.IEnterFromService
    public final String getShootEnterFromOnEditModel(PublishModel value) {
        VideoPublishEditModel videoPublishEditModel;
        CreativeFlowData creativeFlowData;
        ShootExtraData shootExtraData;
        String shootEnterFrom;
        o.LJIIIZ(value, "value");
        BaseShortVideoContext baseShortVideoContext = value.editModel;
        if (!(baseShortVideoContext instanceof VideoPublishEditModel) || (videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext) == null || (creativeFlowData = videoPublishEditModel.creativeFlowData) == null || (shootExtraData = creativeFlowData.getShootExtraData()) == null || (shootEnterFrom = shootExtraData.getShootEnterFrom()) == null) {
            return "";
        }
        return shootEnterFrom;
    }

    @Override // com.ss.android.ugc.aweme.services.external.IEnterFromService
    public final void setEnterFrom(String str) {
        LIZIZ = str;
    }
}
