package com.ss.android.ugc.aweme.services.external;

import X.C43722HDy;
import android.content.Context;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.sticker.IStickerUtilsService;
import com.ss.android.ugc.aweme.services.video.VideoExposureData;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public interface IInfoService {
    VideoExposureData convertToExposureData(Object obj);

    void endDownloadEffectAlog(Effect effect, long j, long j2, int i, ExceptionResult exceptionResult);

    long getDurationSinceAppForeground(String str);

    String getExtractMusicAudioDir();

    String getExtractMusicThumbDir();

    long getLastCameraWidgetDialogShownTime();

    List<MediaModel> getMediaLoaderImages(Context context);

    boolean isTrimmedEnable(MusicModel musicModel);

    C43722HDy shareContextInfo(BaseShortVideoContext baseShortVideoContext);

    void startDownloadEffectAlog(Effect effect, long j);

    IStickerUtilsService stickerInfo();

    boolean supportFeatureBits(ArrayList<Long> arrayList);
}
