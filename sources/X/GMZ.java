package X;

import com.ss.android.ugc.aweme.image.model.ImageAlbumData;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GMZ {
    public static final InterfaceC88472Yns<InterfaceC67352kd<? super C76800UCe>, Object> LIZ(PublishModel publishModel) {
        if (publishModel == null) {
            return null;
        }
        return GOV.LJFF.remove(publishModel.publishId);
    }

    public final void LIZIZ(ActivityC45651qj activity, VideoPublishEditModel videoPublishEditModel, boolean z, int i) {
        ImageAlbumData imageAlbumData;
        List<SingleImageData> imageList;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(videoPublishEditModel, "videoPublishEditModel");
        if (!H7R.LJJJJL(videoPublishEditModel) || videoPublishEditModel.getImageAlbumData() == null || (imageAlbumData = videoPublishEditModel.getImageAlbumData()) == null || (imageList = imageAlbumData.getImageList()) == null || imageList.isEmpty()) {
            return;
        }
        String groupId = videoPublishEditModel.getCreationId();
        XKQ LIZLLL = XKX.LIZLLL((InterfaceC70422pa) GOV.LIZIZ.getValue(), null, null, new C41441GOf(videoPublishEditModel, groupId, activity, i, z, null), 3);
        java.util.Map<String, InterfaceC79150V4o> map = GOV.LJI;
        o.LJIIIIZZ(groupId, "groupId");
        map.put(groupId, LIZLLL);
    }
}
