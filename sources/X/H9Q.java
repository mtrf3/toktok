package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.cut.DiyPropVideoCompileConfigure;
import com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.DiyPropUploadVideoAutoCutConfigure;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H9Q implements InterfaceC45242HpG {
    public final Activity LIZ;

    @Override // X.InterfaceC45242HpG
    public final void LIZ() {
    }

    @Override // X.InterfaceC45242HpG
    public final void LIZIZ(int i) {
    }

    @Override // X.InterfaceC45242HpG
    public final void LJIJJLI() {
    }

    @Override // X.InterfaceC45242HpG
    public final void dismissDialog() {
    }

    public H9Q(Activity activity) {
        this.LIZ = activity;
    }

    @Override // X.InterfaceC45242HpG
    public final void LIZLLL(int i, Intent data) {
        ShortVideoContext shortVideoContext;
        DiyPropVideoCompileConfigure diyPropVideoCompileConfigure;
        long j;
        long j2;
        Intent intent;
        o.LJIIIZ(data, "data");
        ArrayList parcelableArrayListExtra = data.getParcelableArrayListExtra("key_choose_media_data");
        if (parcelableArrayListExtra == null || (shortVideoContext = (ShortVideoContext) data.getParcelableExtra("key_short_video_context")) == null || parcelableArrayListExtra.isEmpty() || C2060386t.LIZ(((MediaModel) ListProtector.get(parcelableArrayListExtra, 0)).fileLocalUriPath)) {
            return;
        }
        C45685HwP.LJFF.LIZ();
        Intent intent2 = new Intent();
        intent2.putExtra("file_path", ((MediaModel) ListProtector.get(parcelableArrayListExtra, 0)).fileLocalUriPath);
        intent2.putExtra("from_diy_prop_video", true);
        intent2.putExtra("enter_method", shortVideoContext.enterMethod);
        CreativeInfo creativeInfo = shortVideoContext.creativeInfo;
        o.LJIIIIZZ(creativeInfo, "shortVideoContext.creativeInfo");
        C77412UZs.LJJIJIL(intent2, creativeInfo);
        Workspace workspace = shortVideoContext.cameraComponentModel.mWorkspace;
        DiyPropUploadVideoAutoCutConfigure diyPropUploadVideoAutoCutConfigure = null;
        if (workspace != null) {
            diyPropVideoCompileConfigure = C1FP.LJI(workspace);
        } else {
            diyPropVideoCompileConfigure = null;
        }
        intent2.putExtra("diy_prop_video_compile_configure", diyPropVideoCompileConfigure);
        Activity activity = this.LIZ;
        if (activity != null && (intent = activity.getIntent()) != null) {
            diyPropUploadVideoAutoCutConfigure = (DiyPropUploadVideoAutoCutConfigure) intent.getParcelableExtra("diy_prop_upload_video_configure");
        }
        if (shortVideoContext.cameraComponentModel.mCurrentDurationMode) {
            j = C60903NvH.LJIIJJI().LJJIII().getMaxDurationResolver().getMaxShootingDuration(shortVideoContext.shootMode);
        } else {
            j = LivePlayEnforceIntervalSetting.DEFAULT;
        }
        if (diyPropUploadVideoAutoCutConfigure != null) {
            j2 = diyPropUploadVideoAutoCutConfigure.maxDuration;
        } else {
            j2 = j;
        }
        intent2.putExtra("cut_video_max_length", Math.min(j, j2));
        intent2.putExtra("diy_prop_upload_video_configure", diyPropUploadVideoAutoCutConfigure);
        Activity activity2 = this.LIZ;
        if (activity2 == null) {
            return;
        }
        HZV.LIZ().LJ(activity2, i, intent2);
    }

    @Override // X.InterfaceC45242HpG
    public final int LIZJ(List<? extends MediaModel> list, CreativeInfo creativeInfo, boolean z) {
        C41993Gdx.LIZ(list, creativeInfo);
        return 0;
    }
}
