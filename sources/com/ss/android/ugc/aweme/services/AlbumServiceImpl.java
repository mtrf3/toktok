package com.ss.android.ugc.aweme.services;

import X.ActivityC45651qj;
import X.C165706es;
import X.C41994Gdy;
import X.C78605Ut7;
import X.InterfaceC42669Gor;
import X.OSJ;
import X.WM7;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.adaptation.saa.SAAActivity;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.FirstPhotoViewModel;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewScene;
import com.ss.android.ugc.aweme.shortvideo.ui.task.PreloadMediaDataTask;
import defpackage.e1;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AlbumServiceImpl implements InterfaceC42669Gor {
    private final WM7 getRecordScene(ActivityC45651qj activityC45651qj) {
        VideoRecordNewActivity videoRecordNewActivity;
        if (activityC45651qj instanceof SAAActivity) {
            SAAActivity sAAActivity = (SAAActivity) activityC45651qj;
            if (!(sAAActivity.LLIIIILZ() instanceof VideoRecordNewScene)) {
                return null;
            }
            return sAAActivity.LLIIIILZ();
        }
        if (!(activityC45651qj instanceof VideoRecordNewActivity) || (videoRecordNewActivity = (VideoRecordNewActivity) activityC45651qj) == null) {
            return null;
        }
        return videoRecordNewActivity.LJLJJI;
    }

    @Override // X.InterfaceC42669Gor
    public void tryPreloadMediaAfterAlbumPermissionGranted(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        WM7 recordScene = getRecordScene(activity);
        if (recordScene != null && e1.LIZ(31744, "studio_preload_media_after_permission_granted", true, false) && C78605Ut7.LIZLLL() && ((FirstPhotoViewModel) C165706es.LJIIIIZZ(recordScene, null, null, 6).get(FirstPhotoViewModel.class)).LJLIL.getValue() == null) {
            Lifecycle lifecycle = activity.getLifecycle();
            o.LJIIIIZZ(lifecycle, "activity.lifecycle");
            new PreloadMediaDataTask(lifecycle, activity, recordScene).run();
        }
    }

    @Override // X.InterfaceC42669Gor
    public OSJ<Boolean, Integer, Long> checkMediaDurationValid(Context context, List<? extends MediaModel> videosInfo, long j, long j2) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(videosInfo, "videosInfo");
        return C41994Gdy.LIZ(context, videosInfo, j, j2);
    }
}
