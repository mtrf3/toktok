package X;

import android.content.Intent;
import android.os.Bundle;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.DiyPropUploadVideoAutoCutConfigure;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HJF implements InterfaceC83506Wpy {
    public final /* synthetic */ int LIZ;
    public final /* synthetic */ ShortVideoContext LIZIZ;

    @Override // X.InterfaceC83506Wpy
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

    @Override // X.InterfaceC83506Wpy
    public final Bundle LIZIZ(DiyPropUploadVideoAutoCutConfigure diyPropUploadVideoAutoCutConfigure) {
        Bundle bundle = new Bundle();
        int i = this.LIZ;
        ShortVideoContext shortVideoContext = this.LIZIZ;
        bundle.putInt("key_choose_scene", i);
        bundle.putInt("key_video_select_min_count", 1);
        bundle.putInt("key_video_select_max_count", 1);
        bundle.putInt("key_support_flag", 4);
        if (diyPropUploadVideoAutoCutConfigure != null) {
            bundle.putParcelable("diy_prop_upload_video_configure", diyPropUploadVideoAutoCutConfigure);
        }
        bundle.putParcelable("key_short_video_context", shortVideoContext);
        return bundle;
    }

    public HJF(int i, ShortVideoContext shortVideoContext) {
        this.LIZ = i;
        this.LIZIZ = shortVideoContext;
    }
}
