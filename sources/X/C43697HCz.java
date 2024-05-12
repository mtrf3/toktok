package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.external.IInfoService;
import com.ss.android.ugc.aweme.services.sticker.IStickerUtilsService;
import com.ss.android.ugc.aweme.services.sticker.StickerUtilsServiceImpl;
import com.ss.android.ugc.aweme.services.video.VideoExposureData;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HCz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43697HCz implements IInfoService {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(HD0.LJLIL);

    @Override // com.ss.android.ugc.aweme.services.external.IInfoService
    public final IStickerUtilsService stickerInfo() {
        return (StickerUtilsServiceImpl) this.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.external.IInfoService
    public final String getExtractMusicAudioDir() {
        return C62850Ola.LJ().LJIILJJIL(EnumC43651HBf.LOCAL_EXTRACT_MUSIC, "audio");
    }

    @Override // com.ss.android.ugc.aweme.services.external.IInfoService
    public final String getExtractMusicThumbDir() {
        return C62850Ola.LJ().LJIILJJIL(EnumC43651HBf.LOCAL_EXTRACT_MUSIC, "thumb");
    }

    @Override // com.ss.android.ugc.aweme.services.external.IInfoService
    public final long getLastCameraWidgetDialogShownTime() {
        return HKC.LIZ().getLong("last_show_time", 0L);
    }

    @Override // com.ss.android.ugc.aweme.services.external.IInfoService
    public final VideoExposureData convertToExposureData(Object obj) {
        if (obj instanceof VideoPublishEditModel) {
            return VideoPublishEditModel.asExposureData(obj);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.services.external.IInfoService
    public final long getDurationSinceAppForeground(String creationId) {
        o.LJIIIZ(creationId, "creationId");
        long currentTimeMillis = System.currentTimeMillis() - C43570H8c.LIZIZ;
        C43570H8c.LIZJ = currentTimeMillis;
        C43570H8c.LIZ = creationId;
        return currentTimeMillis;
    }

    @Override // com.ss.android.ugc.aweme.services.external.IInfoService
    public final List<MediaModel> getMediaLoaderImages(Context context) {
        o.LJIIIZ(context, "context");
        return C45697Hwb.LIZIZ(context, false, -1, 0, null);
    }

    @Override // com.ss.android.ugc.aweme.services.external.IInfoService
    public final boolean isTrimmedEnable(MusicModel musicModel) {
        o.LJIIIZ(musicModel, "musicModel");
        if (!HCG.LIZ()) {
            return false;
        }
        new I9Q();
        AVMusic LIZ = I9Q.LIZ(musicModel);
        if (LIZ == null || !LIZ.isNeedReuse()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.services.external.IInfoService
    public final C43722HDy shareContextInfo(BaseShortVideoContext args) {
        String mainBusinessData;
        C164846dU c164846dU;
        o.LJIIIZ(args, "args");
        C43722HDy c43722HDy = null;
        if ((args instanceof VideoPublishEditModel) && (mainBusinessData = VideoPublishEditModel.asExposureData(args).getMainBusinessData()) != null && (c164846dU = (C164846dU) GsonProtectorUtils.fromJson(C44172HVg.LJIJI.getRetrofitFactoryGson(), mainBusinessData, C164846dU.class)) != null && (c43722HDy = c164846dU.getShareContext()) != null) {
            c43722HDy.mIsFromDraft = args.mIsFromDraft;
        }
        return c43722HDy;
    }

    @Override // com.ss.android.ugc.aweme.services.external.IInfoService
    public final boolean supportFeatureBits(ArrayList<Long> featureBits) {
        o.LJIIIZ(featureBits, "featureBits");
        return C60903NvH.LJIIJJI().LIZIZ().LIZLLL(featureBits);
    }

    @Override // com.ss.android.ugc.aweme.services.external.IInfoService
    public final void startDownloadEffectAlog(Effect effect, long j) {
        C60903NvH.LJJIJL(effect, j);
    }

    @Override // com.ss.android.ugc.aweme.services.external.IInfoService
    public final void endDownloadEffectAlog(Effect effect, long j, long j2, int i, ExceptionResult exceptionResult) {
        C60903NvH.LJIIJ(effect, j, j2, i, exceptionResult);
    }
}
