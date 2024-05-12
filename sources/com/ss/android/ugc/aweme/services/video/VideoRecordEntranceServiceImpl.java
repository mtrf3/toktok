package com.ss.android.ugc.aweme.services.video;

import X.C16880lQ;
import X.C221108m2;
import X.C41877Gc5;
import X.C43117Gw5;
import X.C44018HPi;
import X.C44172HVg;
import X.C44529Hdl;
import X.C45685HwP;
import X.C45771Hxn;
import X.C45804HyK;
import X.C51029K0z;
import X.C5H3;
import X.H78;
import X.HB3;
import X.HJ9;
import X.HPA;
import X.HPE;
import X.HZV;
import X.I9T;
import X.X1D;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.photomovie.PhotoMvConfig;
import com.ss.android.ugc.aweme.services.external.ui.PhotoMvAnchorConfig;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class VideoRecordEntranceServiceImpl implements IVideoRecordEntranceService {
    public static final Companion Companion = new Companion();
    public static final C5H3<VideoRecordEntranceServiceImpl> INSTANCE$delegate = C221108m2.LIZIZ(VideoRecordEntranceServiceImpl$Companion$INSTANCE$2.INSTANCE);

    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getINSTANCE$annotations() {
        }

        public final VideoRecordEntranceServiceImpl getINSTANCE() {
            return VideoRecordEntranceServiceImpl.INSTANCE$delegate.getValue();
        }

        public Companion() {
        }
    }

    public /* synthetic */ VideoRecordEntranceServiceImpl(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final VideoRecordEntranceServiceImpl getINSTANCE() {
        return Companion.getINSTANCE();
    }

    public VideoRecordEntranceServiceImpl() {
    }

    @Override // com.ss.android.ugc.aweme.services.video.IVideoRecordEntranceService
    public void startChangeBanMusicEditActivity(Context context, Intent intent) {
        o.LJIIIZ(context, "context");
        HZV.LIZ().LJJII(context, intent);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IVideoRecordEntranceService
    public void startSuperEntranceRecordActivity(Activity activity, Intent intent) {
        o.LJIIIZ(activity, "activity");
        if (TextUtils.isEmpty(C16880lQ.LLJJIJIIJIL(intent, "shoot_way"))) {
            intent.putExtra("shoot_way", "super_entrance");
        }
        intent.putExtra("translation_type", 3);
        C44018HPi.LJIILJJIL(activity, intent);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IVideoRecordEntranceService
    public void startToolPermissionActivity(Context context, Intent intent) {
        if (intent == null || context == null || C44018HPi.LJIIIIZZ(intent)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("unable to start activity,isAppBackground ");
            LIZ.append(C41877Gc5.LIZ.LIZIZ());
            H78.LJI(X1D.LIZIZ(LIZ));
            return;
        }
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (LJIJJ != null) {
            C44018HPi.LJIILJJIL(LJIJJ, intent);
            return;
        }
        C44018HPi.LIZIZ(intent);
        intent.setClass(context, VideoRecordPermissionActivity.class);
        C16880lQ.LIZJ(context, intent);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IVideoRecordEntranceService
    public void startToolPermissionActivity(Activity activity, Intent intent) {
        C44018HPi.LJIILJJIL(activity, intent);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IVideoRecordEntranceService
    public void startChoosePhotoActivity(Activity context, Intent intent, PhotoMvAnchorConfig photoMvAnchorConfig) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(photoMvAnchorConfig, "photoMvAnchorConfig");
        C44018HPi.LIZIZ(intent);
        ShortVideoContext LIZJ = HB3.LIZJ(C16880lQ.LLJJIJI(intent), context, null);
        AVETParameter aVETParameter = new AVETParameter();
        aVETParameter.setCreationId(LIZJ.LJI());
        aVETParameter.setShootWay(LIZJ.shootWay);
        LIZJ.avetParameter = aVETParameter;
        LIZJ.photoMvConfig = new PhotoMvConfig(photoMvAnchorConfig.getSlideshowMvId(), photoMvAnchorConfig.getTemplateType());
        HPE.LIZ(context, new HPA(context, photoMvAnchorConfig, LIZJ));
    }

    @Override // com.ss.android.ugc.aweme.services.video.IVideoRecordEntranceService
    public void startChoosePhotoActivityWithMusic(Activity activity, Intent intent, MusicModel musicModel) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(musicModel, "musicModel");
        C44018HPi.LIZIZ(intent);
        ShortVideoContext LIZJ = HB3.LIZJ(C16880lQ.LLJJIJI(intent), activity, null);
        AVETParameter aVETParameter = new AVETParameter();
        aVETParameter.setCreationId(LIZJ.LJI());
        aVETParameter.setShootWay(LIZJ.shootWay);
        LIZJ.avetParameter = aVETParameter;
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "path");
        if (LLJJIJIIJIL != null && !LLJJIJIIJIL.isEmpty()) {
            LIZJ.cameraComponentModel.mWorkspace.LLILLL(LLJJIJIIJIL);
        }
        Bundle bundle = new Bundle();
        C45685HwP.LIZIZ(activity);
        bundle.putString("shoot_way", LIZJ.shootWay);
        bundle.putInt("key_support_flag", 6);
        bundle.putInt("key_photo_select_min_count", 1);
        C43117Gw5.LIZ.getClass();
        bundle.putInt("key_photo_select_max_count", C43117Gw5.LJII());
        bundle.putBoolean("Key_enable_multi_video", true);
        bundle.putInt("key_video_select_min_count", 1);
        bundle.putInt("key_video_select_max_count", C45771Hxn.LJFF());
        bundle.putInt("key_choose_scene", 31);
        bundle.putLong("Key_min_duration", C44529Hdl.LIZIZ());
        bundle.putParcelable("key_short_video_context", LIZJ);
        bundle.putLong("invoke_uploadpage_time", System.currentTimeMillis());
        bundle.putSerializable("key_music_model", musicModel);
        AVMusic transformMusicModel = C44172HVg.LJI.transformMusicModel(musicModel);
        I9T.LJFF(transformMusicModel);
        if (transformMusicModel != null) {
            bundle.putSerializable("aweme_music", transformMusicModel);
            bundle.putSerializable("music_model", musicModel);
        }
        HJ9.LIZLLL(activity, bundle, 1);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IVideoRecordEntranceService
    public void notifyToolPermissionActivity(Context context, Intent intent, boolean z, boolean z2, boolean z3) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(intent, "intent");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("notifyToolPermissionActivity,try to restart VideoRecordNewActivity,recreateSupport");
        LIZ.append(z);
        LIZ.append(",clearOld:");
        LIZ.append(z2);
        H78.LIZ(X1D.LIZIZ(LIZ));
        intent.putExtra("recreate_record_activity_support", z);
        intent.putExtra("recreate_record_and_clear", z2);
        intent.putExtra("navigate_back_to_main", z3);
        if (C44172HVg.LJ() && z && C51029K0z.LJIL(intent).LIZ(context, C16880lQ.LLJJIJI(intent))) {
            C44018HPi.LJIIJ(context, intent);
            if (z2 && C44018HPi.LJIILIIL(context, intent)) {
                return;
            }
        } else {
            intent.setClass(context, VideoRecordPermissionActivity.class);
        }
        C16880lQ.LIZJ(context, intent);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IVideoRecordEntranceService
    public void startToolPermissionActivity(Activity context, Intent intent, boolean z, boolean z2, boolean z3) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(intent, "intent");
        if (C44018HPi.LJIIIIZZ(intent)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("unable to start activity,isAppBackground ");
            LIZ.append(C41877Gc5.LIZ.LIZIZ());
            H78.LJI(X1D.LIZIZ(LIZ));
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("startToolPermissionActivity,try to restart VideoRecordNewActivity,recreateSupport");
        LIZ2.append(z);
        LIZ2.append(",clearOld:");
        LIZ2.append(z2);
        H78.LIZ(X1D.LIZIZ(LIZ2));
        intent.putExtra("recreate_record_activity_support", z);
        intent.putExtra("recreate_record_and_clear", z2);
        intent.putExtra("navigate_back_to_main", z3);
        if (C44172HVg.LJ() && z && C51029K0z.LJIL(intent).LIZ(context, C16880lQ.LLJJIJI(intent))) {
            C44018HPi.LJIIJ(context, intent);
            if (z2 && C44018HPi.LJIILIIL(context, intent)) {
                return;
            }
        } else {
            intent.setClass(context, VideoRecordPermissionActivity.class);
        }
        C44018HPi.LJIILJJIL(context, intent);
    }
}
