package X;

import Y.ACallableS84S0200000_7;
import Y.AgS27S1300000_7;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.services.publish.Publish;
import com.ss.android.ugc.aweme.services.shoutout.IShoutOutsService;
import com.ss.android.ugc.aweme.services.shoutout.ShoutoutVideoDownloadListener;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity;
import com.ss.android.ugc.aweme.shoutouts.MoneyDes;
import com.ss.android.ugc.aweme.shoutouts.ShoutOutsData;
import com.ss.android.ugc.aweme.shoutouts.ShoutOutsPublishActivity;
import com.ss.android.ugc.aweme.shoutouts.ShoutoutPrice;
import com.ss.android.ugc.aweme.shoutouts.ShoutoutSettings;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GJO implements IShoutOutsService {
    public boolean LIZ = true;
    public boolean LIZIZ = true;
    public int LIZJ;
    public boolean LIZLLL;

    @Override // com.ss.android.ugc.aweme.services.shoutout.IShoutOutsService
    public final ShoutoutSettings getShoutOutSettingsModel() {
        return C163236at.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.shoutout.IShoutOutsService
    public final int getAuthorCount() {
        return this.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.services.shoutout.IShoutOutsService
    public final boolean getInFollowingTab() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.services.shoutout.IShoutOutsService
    public final boolean getInMainTab() {
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.services.shoutout.IShoutOutsService
    public final boolean getUseShoutoutAuthor() {
        return this.LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.services.shoutout.IShoutOutsService
    public final boolean isShoutoutPostDialog(Object obj) {
        ShoutOutsData shoutOutsData;
        if (obj == null || !(obj instanceof VideoPublishEditModel) || (shoutOutsData = ((VideoPublishEditModel) obj).mShoutOutsData) == null || o.LJ(shoutOutsData.getShoutOutsMode(), ShoutOutsData.MODE_POST)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.services.shoutout.IShoutOutsService
    public final void setAuthorCount(int i) {
        this.LIZJ = i;
    }

    @Override // com.ss.android.ugc.aweme.services.shoutout.IShoutOutsService
    public final void setInFollowingTab(boolean z) {
        this.LIZIZ = z;
    }

    @Override // com.ss.android.ugc.aweme.services.shoutout.IShoutOutsService
    public final void setInMainTab(boolean z) {
        this.LIZ = z;
    }

    @Override // com.ss.android.ugc.aweme.services.shoutout.IShoutOutsService
    public final void setUseShoutoutAuthor(boolean z) {
        this.LIZLLL = z;
    }

    @Override // com.ss.android.ugc.aweme.services.shoutout.IShoutOutsService
    public final void startShoutoutsPublishActivity(Activity context, Intent intent) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(intent, "intent");
        H78.LIZ("SHOUTOUTTOOLSstartShoutoutsPublishActivity");
        intent.setClass(context, ShoutOutsPublishActivity.class);
        C42326GjK.LIZ.getClass();
        C42326GjK.LJ(context, intent);
    }

    @Override // com.ss.android.ugc.aweme.services.shoutout.IShoutOutsService
    public final void startShoutoutsPublishActivityFromDL(Activity context, android.net.Uri routeUri) {
        MoneyDes moneyDes;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(routeUri, "routeUri");
        Intent intent = new Intent(context, (Class<?>) ShoutOutsPublishActivity.class);
        String queryParameter = UriProtector.getQueryParameter(routeUri, "product_id");
        String queryParameter2 = UriProtector.getQueryParameter(routeUri, "data");
        if (TextUtils.isEmpty(queryParameter) || TextUtils.isEmpty(queryParameter2)) {
            H78.LIZJ("SHOUTOUTTOOLSstartShoutoutsPublishActivityFromDL pid data empty ");
            return;
        }
        try {
            ShoutOutsData shoutOutsData = (ShoutOutsData) new Gson().LJI(queryParameter2, ShoutOutsData.class);
            if (shoutOutsData != null) {
                shoutOutsData.setProductId(queryParameter);
                if (shoutOutsData != null) {
                    ShoutoutPrice price = shoutOutsData.getPrice();
                    if (price != null) {
                        moneyDes = price.getBuyerMoneyDes();
                    } else {
                        moneyDes = null;
                    }
                    shoutOutsData.setBuyerMoneyDes(moneyDes);
                    ShoutoutPrice price2 = shoutOutsData.getPrice();
                    if (price2 != null) {
                        price2.setBuyerMoneyDes(null);
                    }
                    if (shoutOutsData != null) {
                        intent.putExtra("shout_out_from_dl", true);
                        intent.putExtra("shout_out_data", shoutOutsData);
                        intent.putExtra("route_uri", routeUri.toString());
                        C42326GjK.LIZ.getClass();
                        C42326GjK.LJ(context, intent);
                        return;
                    }
                }
            }
            H78.LIZJ("SHOUTOUTTOOLSstartShoutoutsPublishActivityFromDL null shoutOutsData ");
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SHOUTOUTTOOLSstartShoutoutsPublishActivityFromDL");
            LIZ.append(e);
            H78.LIZJ(X1D.LIZIZ(LIZ));
        }
    }

    @Override // com.ss.android.ugc.aweme.services.shoutout.IShoutOutsService
    public final void startShoutoutsPublishActivityFromNative(Activity context, ShoutOutsData shoutOutsData) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(shoutOutsData, "shoutOutsData");
        Intent intent = new Intent(context, (Class<?>) ShoutOutsPublishActivity.class);
        if (TextUtils.isEmpty(shoutOutsData.getProductId()) || shoutOutsData.getPrice() == null) {
            return;
        }
        ShoutoutPrice price = shoutOutsData.getPrice();
        o.LJI(price);
        if (price.getMoneyDes() == null) {
            return;
        }
        H78.LIZ("SHOUTOUTTOOLSstartShoutoutsPublishActivityFromNative");
        intent.putExtra("shout_out_from_dl", true);
        if (TextUtils.isEmpty(shoutOutsData.getCoverUrl())) {
            shoutOutsData.setReviewed(1);
        }
        intent.putExtra("shout_out_data", shoutOutsData);
        C42326GjK.LIZ.getClass();
        C42326GjK.LJ(context, intent);
    }

    public final void LIZ(Bundle bundle, ActivityC45651qj activityC45651qj, VideoPublishEditModel videoPublishEditModel) {
        AVUploadSaveModel LIZIZ;
        int i;
        this.LIZ = true;
        this.LIZIZ = true;
        long uptimeMillis = SystemClock.uptimeMillis();
        LIZIZ = C60903NvH.LJIIJJI().getPublishService().LJIJI().LIZIZ(videoPublishEditModel, 1, true, GJP.LJLIL, false);
        videoPublishEditModel.setSaveModel(LIZIZ);
        C43587H8t.LIZJ(H83.LIZ(videoPublishEditModel), new C44224HXg(videoPublishEditModel), EnumC43590H8w.PUBLISH, EnumC43590H8w.SEND_REQUEST);
        videoPublishEditModel.userClickPublishTime = uptimeMillis;
        Bundle bundle2 = new Bundle();
        bundle2.putInt("video_type", 0);
        bundle2.putSerializable("extra_video_publish_args", videoPublishEditModel);
        bundle2.putString("shoot_way", videoPublishEditModel.mShootWay);
        if (bundle != null) {
            i = bundle.getInt("extra_stick_point_type", 0);
        } else {
            i = 0;
        }
        bundle2.putInt("extra_stick_point_type", i);
        bundle2.putInt("publish_private_state", videoPublishEditModel.isPrivate());
        bundle2.putInt("publish_permission", 0);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoPublishService.createBundleParams()  bundle=");
        LIZ.append(bundle2);
        C36922EeM.LJ(X1D.LIZIZ(LIZ));
        C188727au c188727au = new C188727au();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("VideoPublishService.createBundleParams()  bundle=");
        LIZ2.append(bundle2);
        c188727au.LJIIIZ("log", X1D.LIZIZ(LIZ2));
        FMX.LJIIL("av_video_memory", c188727au.LIZ);
        Publish.PublishBundle = bundle2;
        GI3.LJII(new G8R(activityC45651qj, bundle2, null));
    }

    @Override // com.ss.android.ugc.aweme.services.shoutout.IShoutOutsService
    public final void publishShoutOuts(ActivityC45651qj activity, Object any, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(any, "any");
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) any;
        AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(videoPublishEditModel.creativeModel.musicBuzModel);
        if ((extractAVMusic != null && !extractAVMusic.isCommerceMusic()) || !C44172HVg.LJIJ.isLogin()) {
            return;
        }
        C41658GWo.LIZLLL().LJ = Boolean.FALSE;
        C41315GJj.LIZLLL(videoPublishEditModel);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[handleSaveDraftBeforePublishNew]: creation id = ");
        LIZ.append(videoPublishEditModel.getCreationId());
        C143195jf.LIZ(X1D.LIZIZ(LIZ));
        C41658GWo.LIZLLL().LJIIIIZZ(videoPublishEditModel.getCreationId());
        C44384HbQ.LLJ(videoPublishEditModel);
        GI3.LJII(new G8P(new C41021G8b(videoPublishEditModel, new GLI("ShoutOutsServiceImpl", 1)), new C41889GcH(activity, videoPublishEditModel, this, bundle)));
    }

    @Override // com.ss.android.ugc.aweme.services.shoutout.IShoutOutsService
    public final void startDownLoadVideo(ActivityC45651qj owner, CreativeInfo creativeInfo, String videoPath, ShoutoutVideoDownloadListener shoutoutVideoDownloadListener) {
        o.LJIIIZ(owner, "owner");
        o.LJIIIZ(creativeInfo, "creativeInfo");
        o.LJIIIZ(videoPath, "videoPath");
        o.LJIIIZ(shoutoutVideoDownloadListener, "shoutoutVideoDownloadListener");
        if (C44172HVg.LJ()) {
            C5S1 c5s1 = new C5S1(owner);
            c5s1.LIZJ(R.string.gl9);
            c5s1.LJ();
            H78.LIZ("SHOUTOUTTOOLSstartDownLoadVideo isRecording");
            return;
        }
        C10K.LIZJ(new ACallableS84S0200000_7(this, creativeInfo, 16)).LJ(new AgS27S1300000_7(owner, creativeInfo, videoPath, shoutoutVideoDownloadListener, 1), C10K.LJIIIIZZ, null);
    }

    @Override // com.ss.android.ugc.aweme.services.shoutout.IShoutOutsService
    public final void startShoutoutsPublishSyncActivity(Activity context, CreativeInfo creativeInfo, String videoPath, String pid, String str) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(creativeInfo, "creativeInfo");
        o.LJIIIZ(videoPath, "videoPath");
        o.LJIIIZ(pid, "pid");
        if (C44172HVg.LJ()) {
            C5S1 c5s1 = new C5S1(C16880lQ.LLLLJ(context));
            c5s1.LIZJ(R.string.gl9);
            c5s1.LJ();
            H78.LIZ("SHOUTOUTTOOLSstartShoutoutsPublishSyncActivity isRecording ");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("extra_enter_from_shoutout_sync", true);
        intent.putExtra("extra_shoutout_video_path", videoPath);
        intent.putExtra("extra_shoutout_pid", pid);
        intent.putExtra("extra_shoutout_music_id", str);
        C77412UZs.LJJIJIL(intent, creativeInfo);
        if (C41030G8k.LIZ()) {
            C42662Gok.LIZJ(context, C16880lQ.LLJJIJI(intent), null);
            return;
        }
        intent.setClass(context, VideoPublishActivity.class);
        C42326GjK.LIZ.getClass();
        C42326GjK.LJ(context, intent);
    }
}
