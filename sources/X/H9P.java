package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.cut.BackgroundVideoCompileConfigure;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H9P implements InterfaceC45242HpG {
    public final /* synthetic */ int LIZ = 1;
    public final Activity LIZIZ;

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

    public H9P(ActivityC45651qj activityC45651qj) {
        this.LIZIZ = activityC45651qj;
    }

    public H9P(Activity activity) {
        this.LIZIZ = activity;
    }

    @Override // X.InterfaceC45242HpG
    public final void LIZLLL(int i, Intent data) {
        ShortVideoContext shortVideoContext;
        long j;
        BackgroundVideoCompileConfigure backgroundVideoCompileConfigure;
        switch (this.LIZ) {
            case 0:
                o.LJIIIZ(data, "data");
                ArrayList parcelableArrayListExtra = data.getParcelableArrayListExtra("key_choose_media_data");
                if (parcelableArrayListExtra == null || (shortVideoContext = (ShortVideoContext) data.getParcelableExtra("key_short_video_context")) == null || parcelableArrayListExtra.isEmpty() || C2060386t.LIZ(((MediaModel) ListProtector.get(parcelableArrayListExtra, 0)).fileLocalUriPath)) {
                    return;
                }
                C45685HwP.LJFF.LIZ();
                Intent intent = new Intent();
                intent.putExtra("file_path", ((MediaModel) ListProtector.get(parcelableArrayListExtra, 0)).fileLocalUriPath);
                intent.putExtra("from_background_video", true);
                if (shortVideoContext.LJJIJIIJIL()) {
                    j = shortVideoContext.cameraComponentModel.mMaxDuration;
                } else if (shortVideoContext.cameraComponentModel.mCurrentDurationMode) {
                    j = C60903NvH.LJIIJJI().LJJIII().getMaxDurationResolver().getMaxShootingDuration(shortVideoContext.shootMode);
                } else {
                    j = LivePlayEnforceIntervalSetting.DEFAULT;
                }
                intent.putExtra("cut_video_max_length", j);
                intent.putExtra("enter_method", shortVideoContext.enterMethod);
                CreativeInfo creativeInfo = shortVideoContext.creativeInfo;
                o.LJIIIIZZ(creativeInfo, "shortVideoContext.creativeInfo");
                C77412UZs.LJJIJIL(intent, creativeInfo);
                Workspace workspace = shortVideoContext.cameraComponentModel.mWorkspace;
                if (workspace != null) {
                    backgroundVideoCompileConfigure = C1FP.LJFF(workspace);
                } else {
                    backgroundVideoCompileConfigure = null;
                }
                intent.putExtra("background_video_compile_configure", backgroundVideoCompileConfigure);
                Activity activity = this.LIZIZ;
                if (activity == null) {
                    return;
                }
                HZV.LIZ().LJ(activity, i, intent);
                return;
            default:
                o.LJIIIZ(data, "data");
                ArrayList parcelableArrayListExtra2 = data.getParcelableArrayListExtra("key_choose_media_data");
                if (parcelableArrayListExtra2 == null || parcelableArrayListExtra2.isEmpty()) {
                    C26045AKb c26045AKb = new C26045AKb(this.LIZIZ);
                    c26045AKb.LJIIIIZZ(R.string.jl9);
                    c26045AKb.LJIIJ();
                    return;
                }
                Iterator it = parcelableArrayListExtra2.iterator();
                while (it.hasNext()) {
                    MediaModel mediaModel = (MediaModel) it.next();
                    if (mediaModel.width <= 0 || mediaModel.height <= 0) {
                        C26045AKb c26045AKb2 = new C26045AKb(this.LIZIZ);
                        c26045AKb2.LJIIIIZZ(R.string.jm1);
                        c26045AKb2.LJIIJ();
                        return;
                    }
                }
                this.LIZIZ.setResult(100, data);
                this.LIZIZ.finish();
                return;
        }
    }

    @Override // X.InterfaceC45242HpG
    public final int LIZJ(List list, CreativeInfo creativeInfo, boolean z) {
        switch (this.LIZ) {
            case 0:
                C41993Gdx.LIZ(list, creativeInfo);
                return 0;
            default:
                C41993Gdx.LIZ(list, creativeInfo);
                return 0;
        }
    }
}
