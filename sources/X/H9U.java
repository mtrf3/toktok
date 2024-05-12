package X;

import android.content.Intent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.duetupload.DuetUploadModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.duet.DuetUploadServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.DuetContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.vesdk.VEUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H9U implements InterfaceC45242HpG {
    public final ActivityC45651qj LIZ;

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

    public final void LJ(Intent intent) {
        ShortVideoContext shortVideoContext;
        DuetContext duetContext;
        DuetUploadModel duetUploadModel;
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
        if (parcelableArrayListExtra == null || (shortVideoContext = (ShortVideoContext) intent.getParcelableExtra("key_short_video_context")) == null || (duetContext = (DuetContext) intent.getParcelableExtra("key_upload_video_context")) == null) {
            return;
        }
        String str = duetContext.duetVideoPath;
        if (str != null) {
            VEUtils.VEVideoFileInfo vEVideoFileInfo = VEUtils.getVEVideoFileInfo(str);
            if (vEVideoFileInfo == null || (duetUploadModel = (DuetUploadModel) intent.getParcelableExtra("key_duet_upload_model")) == null) {
                return;
            }
            boolean z = duetUploadModel.isImageType;
            if (!z && C42117Gfx.LJ() && duetUploadModel.duration < 1000) {
                z = true;
            }
            long minDuration = DuetUploadServiceImpl.Companion.getMinDuration(z, vEVideoFileInfo, duetUploadModel);
            if (parcelableArrayListExtra.isEmpty() || C2060386t.LIZ(((MediaModel) ListProtector.get(parcelableArrayListExtra, 0)).fileLocalUriPath)) {
                return;
            }
            C45685HwP.LJFF.LIZ();
            intent.putExtra("file_path", ((MediaModel) ListProtector.get(parcelableArrayListExtra, 0)).fileLocalUriPath);
            intent.putExtra("enter_method", shortVideoContext.enterMethod);
            intent.putExtra("key_enter_trim_from", "enter_from_upload_duet");
            intent.putExtra("key_choose_media_data", parcelableArrayListExtra);
            intent.putExtra("key_upload_video_context", shortVideoContext.cameraComponentModel.duetContext);
            intent.putExtra("shoot_way", shortVideoContext.shootWay);
            intent.putExtra("key_default_trim_length", minDuration);
            intent.putExtra("key_remaining_video_duration", minDuration);
            intent.putExtra("is_upload", true);
            intent.putExtra("duet_author", shortVideoContext.cameraComponentModel.duetContext.duetFromAwemeId);
            intent.putExtra("video_id", C78983UzD.LJJIJL());
            CreativeInfo creativeInfo = shortVideoContext.creativeInfo;
            o.LJIIIIZZ(creativeInfo, "shortVideoContext.creativeInfo");
            C77412UZs.LJJIJIL(intent, creativeInfo);
            if (((MediaModel) ListProtector.get(parcelableArrayListExtra, 0)).LJ()) {
                intent.putExtra("upload_item_type", "photo");
                new DuetUploadServiceImpl().callDuetVideoPublish(this.LIZ, intent);
                return;
            } else {
                intent.putExtra("upload_item_type", "video");
                HZV.LIZ().LJ(this.LIZ, -1, intent);
                return;
            }
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public H9U(ActivityC45651qj activityC45651qj, C82622Wbi c82622Wbi) {
        InterfaceC45540Hu4 interfaceC45540Hu4;
        WM7 wm7;
        this.LIZ = activityC45651qj;
        if (c82622Wbi != null && (wm7 = (WM7) c82622Wbi.LJIIIIZZ(null, AbstractC42651GoZ.class)) != null) {
            interfaceC45540Hu4 = C163756bj.LIZIZ(wm7);
        } else if (!(activityC45651qj instanceof InterfaceC45540Hu4)) {
            return;
        } else {
            interfaceC45540Hu4 = (InterfaceC45540Hu4) activityC45651qj;
        }
        if (interfaceC45540Hu4 != null) {
            interfaceC45540Hu4.registerActivityResultListener(new H9Y(this));
        }
    }

    @Override // X.InterfaceC45242HpG
    public final void LIZLLL(int i, Intent data) {
        ShortVideoContext shortVideoContext;
        DuetUploadModel duetUploadModel;
        o.LJIIIZ(data, "data");
        ArrayList parcelableArrayListExtra = data.getParcelableArrayListExtra("key_choose_media_data");
        if (parcelableArrayListExtra == null || (shortVideoContext = (ShortVideoContext) data.getParcelableExtra("key_short_video_context")) == null || (duetUploadModel = (DuetUploadModel) data.getParcelableExtra("key_duet_upload_model")) == null) {
            return;
        }
        if (parcelableArrayListExtra.size() == 1 && ((MediaModel) ListProtector.get(parcelableArrayListExtra, 0)).LJI() && ((MediaModel) ListProtector.get(parcelableArrayListExtra, 0)).duration < 1000 && C42117Gfx.LJ()) {
            XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C42066Gf8(shortVideoContext, parcelableArrayListExtra, data, duetUploadModel, this, null), 3);
        } else {
            LJ(data);
        }
    }

    @Override // X.InterfaceC45242HpG
    public final int LIZJ(List<? extends MediaModel> list, CreativeInfo creativeInfo, boolean z) {
        C41993Gdx.LIZ(list, creativeInfo);
        return 0;
    }
}
