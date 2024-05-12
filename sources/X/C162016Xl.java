package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.services.video.IVideoConfigService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import dmt.av.video.VEPreviewParams;
import kotlin.jvm.internal.o;

/* renamed from: X.6Xl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C162016Xl {
    public static final /* synthetic */ int LIZ = 0;

    public static OSZ LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        int videoHeight;
        IVideoConfigService iVideoConfigService;
        IVideoConfigService iVideoConfigService2;
        o.LJIIIZ(videoPublishEditModel, "<this>");
        int i = videoPublishEditModel.mVideoCanvasWidth;
        if (i <= 0 || (videoHeight = videoPublishEditModel.mVideoCanvasHeight) <= 0) {
            i = videoPublishEditModel.videoWidth();
            videoHeight = videoPublishEditModel.videoHeight();
            if (videoHeight == 0 || i == 0) {
                if (videoPublishEditModel.getOriginal() == 0) {
                    iVideoConfigService = C44172HVg.LJIILIIL;
                } else {
                    iVideoConfigService = C44172HVg.LJIIL;
                }
                i = iVideoConfigService.getVideoWidth();
                if (videoPublishEditModel.getOriginal() == 0) {
                    iVideoConfigService2 = C44172HVg.LJIILIIL;
                } else {
                    iVideoConfigService2 = C44172HVg.LJIIL;
                }
                videoHeight = iVideoConfigService2.getVideoHeight();
            }
        }
        return new OSZ(Integer.valueOf(i), Integer.valueOf(videoHeight));
    }

    public static void LIZ(Context context, LifecycleOwner owner, C162656Zx view, C138635cJ c138635cJ, VideoPublishEditModel mModel, String enterFrom) {
        VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(owner, "owner");
        o.LJIIIZ(view, "view");
        o.LJIIIZ(mModel, "mModel");
        o.LJIIIZ(enterFrom, "enterFrom");
        VEPreviewParams LJJJJZ = C78926UyI.LJJJJZ(mModel, 2, 30, 4);
        LJJJJZ.mPageMode = 101;
        MutableLiveData mutableLiveData = new MutableLiveData();
        mutableLiveData.setValue(LJJJJZ);
        MutableLiveData<InfoStickerModel> mutableLiveData2 = new MutableLiveData<>();
        mutableLiveData2.setValue(mModel.infoStickerModel);
        c138635cJ.LIZLLL = mutableLiveData;
        c138635cJ.LJFF = mutableLiveData2;
        c138635cJ.LIZ(context, owner, view, mModel);
        if (o.LJ(enterFrom, "kids_preview") || (vEEditorAutoStartStopArbiter = c138635cJ.LJIIIIZZ) == null) {
            return;
        }
        vEEditorAutoStartStopArbiter.LJLJL = false;
    }
}
