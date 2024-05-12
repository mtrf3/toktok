package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.DiyPropUploadVideoAutoCutConfigure;
import kotlin.jvm.internal.o;

/* renamed from: X.HDw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43720HDw implements InterfaceC83511Wq3 {
    public final /* synthetic */ AbstractC43719HDv LIZ;
    public final /* synthetic */ ShortVideoContext LIZIZ;

    @Override // X.InterfaceC83511Wq3
    public final C83509Wq1 LIZ(Intent data) {
        o.LJIIIZ(data, "data");
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(data, "videoPath");
        String str = "";
        if (LLJJIJIIJIL == null) {
            LLJJIJIIJIL = "";
        }
        String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(data, "audioPath");
        if (LLJJIJIIJIL2 == null) {
            LLJJIJIIJIL2 = "";
        }
        String LLJJIJIIJIL3 = C16880lQ.LLJJIJIIJIL(data, "videoOriginPath");
        if (LLJJIJIIJIL3 != null) {
            str = LLJJIJIIJIL3;
        }
        return new C83509Wq1(LLJJIJIIJIL, LLJJIJIIJIL2, str);
    }

    public C43720HDw(ShortVideoContext shortVideoContext, AbstractC43719HDv abstractC43719HDv) {
        this.LIZ = abstractC43719HDv;
        this.LIZIZ = shortVideoContext;
    }

    @Override // X.InterfaceC83511Wq3
    public final Intent LIZIZ(String videoPath, DiyPropUploadVideoAutoCutConfigure diyPropUploadVideoAutoCutConfigure) {
        o.LJIIIZ(videoPath, "videoPath");
        Intent intent = new Intent();
        AbstractC43719HDv abstractC43719HDv = this.LIZ;
        ShortVideoContext shortVideoContext = this.LIZIZ;
        intent.putExtra("file_path", videoPath);
        if (abstractC43719HDv != null) {
            intent.putExtra(abstractC43719HDv.LIZ, true);
            intent.putExtra(abstractC43719HDv.LIZIZ, abstractC43719HDv.LIZJ);
        }
        long maxShootingDuration = C60903NvH.LJIIJJI().LJJIII().getMaxDurationResolver().getMaxShootingDuration(true ^ shortVideoContext.cameraComponentModel.mCurrentDurationMode, shortVideoContext);
        C60903NvH.LJIIJJI().LJJIII().getMaxDurationResolver().resolveMaxDurationFor3MinWithMusic(shortVideoContext, maxShootingDuration);
        if (diyPropUploadVideoAutoCutConfigure != null) {
            intent.putExtra("diy_prop_upload_video_configure", diyPropUploadVideoAutoCutConfigure);
            maxShootingDuration = Math.min(diyPropUploadVideoAutoCutConfigure.maxDuration, maxShootingDuration);
        }
        C77412UZs.LJJIJL(intent, shortVideoContext.creativeInfo.getCreationId(), shortVideoContext.creativeInfo.getVersion(), null);
        intent.putExtra("cut_video_max_length", maxShootingDuration);
        return intent;
    }
}
