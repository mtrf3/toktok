package X;

import android.content.Context;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.List;

/* renamed from: X.Gor, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC42669Gor {
    OSJ<Boolean, Integer, Long> checkMediaDurationValid(Context context, List<? extends MediaModel> list, long j, long j2);

    void tryPreloadMediaAfterAlbumPermissionGranted(ActivityC45651qj activityC45651qj);
}
