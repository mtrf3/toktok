package com.ss.android.ugc.aweme.services;

import X.A00;
import X.ActivityC45651qj;
import X.C116694i1;
import X.C188727au;
import X.C42398GkU;
import X.C44066HRe;
import X.C45804HyK;
import X.C46005I3t;
import X.C56319M8l;
import X.C56480MEq;
import X.C58604MzI;
import X.C68322mC;
import X.C77357UXp;
import X.C78866UxK;
import X.C84942XVi;
import X.EnumC133695Mn;
import X.FMX;
import X.HQJ;
import X.HS9;
import X.IAX;
import Y.AObjectS40S0201000_7;
import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.hox.Hox;
import com.bytedance.tiktok.homepage.services.MainPageFragmentImpl;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.app.PushCameraBlurActivity;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.detail.ui.DetailFragment;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.publishtab.PublishTabAbility;
import com.ss.android.ugc.aweme.i18n.musically.cut.AvatarChooseActivity;
import com.ss.android.ugc.aweme.kids.homepage.ui.KidsMainActivity;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.services.external.ui.AutoCutAnchorConfig;
import com.ss.android.ugc.aweme.services.external.ui.EditConfig;
import com.ss.android.ugc.aweme.services.external.ui.IRecordService;
import com.ss.android.ugc.aweme.services.external.ui.IVideo2GifUIService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.services.external.ui.SoundSyncAnchorConfig;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.web.jsbridge.ShareOpenPlatformMethod;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;
import v5.n;

/* loaded from: classes8.dex */
public class IDLCallbackS16S0200000_7 extends SimpleServiceLoadCallback {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onOK$0(IDLCallbackS16S0200000_7 iDLCallbackS16S0200000_7) {
    }

    public static final void onOK$1(IDLCallbackS16S0200000_7 iDLCallbackS16S0200000_7) {
    }

    public static final void onOK$2(IDLCallbackS16S0200000_7 iDLCallbackS16S0200000_7) {
    }

    public static final void onOK$3(IDLCallbackS16S0200000_7 iDLCallbackS16S0200000_7) {
    }

    @Override // com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback, com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onFailed() {
        switch (this.$t) {
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onFailed$0(this);
                return;
            default:
                super.onFailed();
                return;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onLoad(AsyncAVService asyncAVService, long j) {
        switch (this.$t) {
            case 0:
                onLoad$0(this, asyncAVService, j);
                return;
            case 1:
                onLoad$1(this, asyncAVService, j);
                return;
            case 2:
                onLoad$2(this, asyncAVService, j);
                return;
            case 3:
                onLoad$3(this, asyncAVService, j);
                return;
            case 4:
                onLoad$4(this, asyncAVService, j);
                return;
            case 5:
                onLoad$5(this, asyncAVService, j);
                return;
            case 6:
                onLoad$6(this, asyncAVService, j);
                return;
            case 7:
                onLoad$7(this, asyncAVService, j);
                return;
            case 8:
                onLoad$8(this, asyncAVService, j);
                return;
            case 9:
                onLoad$9(this, asyncAVService, j);
                return;
            case 10:
                onLoad$10(this, asyncAVService, j);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onLoad$11(this, asyncAVService, j);
                return;
            case 12:
                onLoad$12(this, asyncAVService, j);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onLoad$13(this, asyncAVService, j);
                return;
            case 14:
                onLoad$14(this, asyncAVService, j);
                return;
            case 15:
                onLoad$15(this, asyncAVService, j);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onLoad$16(this, asyncAVService, j);
                return;
            case 17:
                onLoad$17(this, asyncAVService, j);
                return;
            case 18:
                onLoad$18(this, asyncAVService, j);
                return;
            case 19:
                onLoad$19(this, asyncAVService, j);
                return;
            case 20:
                onLoad$20(this, asyncAVService, j);
                return;
            case 21:
                onLoad$21(this, asyncAVService, j);
                return;
            case 22:
                onLoad$22(this, asyncAVService, j);
                return;
            case 23:
                onLoad$23(this, asyncAVService, j);
                return;
            case 24:
                onLoad$24(this, asyncAVService, j);
                return;
            case 25:
                onLoad$25(this, asyncAVService, j);
                return;
            default:
                super.onLoad(asyncAVService, j);
                return;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback, com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onOK() {
        switch (this.$t) {
            case 12:
                onOK$0(this);
                return;
            case 23:
                onOK$1(this);
                return;
            case 24:
                onOK$2(this);
                return;
            case 25:
                onOK$3(this);
                return;
            default:
                super.onOK();
                return;
        }
    }

    public static final void onFailed$0(IDLCallbackS16S0200000_7 iDLCallbackS16S0200000_7) {
        ((C44066HRe) iDLCallbackS16S0200000_7.l1).LIZLLL();
    }

    public IDLCallbackS16S0200000_7(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onLoad$0(IDLCallbackS16S0200000_7 iDLCallbackS16S0200000_7, AsyncAVService asyncAVService, long j) {
        AvatarChooseActivity avatarChooseActivity = (AvatarChooseActivity) iDLCallbackS16S0200000_7.l1;
        IVideo2GifUIService abilityUiService = asyncAVService.uiService().abilityUiService();
        AvatarChooseActivity avatarChooseActivity2 = (AvatarChooseActivity) iDLCallbackS16S0200000_7.l1;
        avatarChooseActivity.LJLIL = abilityUiService.toMusVideoChooseFragment(avatarChooseActivity2, (Fragment) iDLCallbackS16S0200000_7.l0, avatarChooseActivity2, Integer.valueOf(R.id.hor));
    }

    public static final void onLoad$1(IDLCallbackS16S0200000_7 iDLCallbackS16S0200000_7, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().editService().startEdit((Context) iDLCallbackS16S0200000_7.l0, (EditConfig) iDLCallbackS16S0200000_7.l1);
    }

    public static final void onLoad$10(IDLCallbackS16S0200000_7 iDLCallbackS16S0200000_7, AsyncAVService asyncAVService, long j) {
        C42398GkU.LIZ(asyncAVService, "service").startAutoCutAnchorAlbum(((HQJ) iDLCallbackS16S0200000_7.l0).LJJI(), (AutoCutAnchorConfig) iDLCallbackS16S0200000_7.l1);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("shoot_way", "autocut_anchor");
        c188727au.LJIIIZ("creation_id", ((AutoCutAnchorConfig) iDLCallbackS16S0200000_7.l1).getCreativeInfo().getCreationId());
        c188727au.LJIIIZ("enter_from", ((HQJ) iDLCallbackS16S0200000_7.l0).LJJIIZI());
        c188727au.LJIIIZ("group_id", ((HQJ) iDLCallbackS16S0200000_7.l0).LJJII().getAid());
        FMX.LJIIL("shoot", c188727au.LIZ);
    }

    public static final void onLoad$11(IDLCallbackS16S0200000_7 iDLCallbackS16S0200000_7, AsyncAVService asyncAVService, long j) {
        C42398GkU.LIZ(asyncAVService, "service").startRecord((KidsMainActivity) iDLCallbackS16S0200000_7.l0, ((RecordConfig.Builder) iDLCallbackS16S0200000_7.l1).build());
    }

    public static final void onLoad$12(IDLCallbackS16S0200000_7 iDLCallbackS16S0200000_7, AsyncAVService asyncAVService, long j) {
        C42398GkU.LIZ(asyncAVService, "service").startRecord((KidsMainActivity) iDLCallbackS16S0200000_7.l0, ((RecordConfig.Builder) iDLCallbackS16S0200000_7.l1).build());
    }

    public static final void onLoad$13(IDLCallbackS16S0200000_7 iDLCallbackS16S0200000_7, AsyncAVService asyncAVService, long j) {
        Video video = ((C44066HRe) iDLCallbackS16S0200000_7.l1).LJIILL.getVideo();
        if (video == null) {
            ((n) iDLCallbackS16S0200000_7.l0).LJ(null);
        } else {
            asyncAVService.uiService().recordService().preloadDuetLayout(video.getWidth(), video.getHeight(), new AObjectS40S0201000_7(1, iDLCallbackS16S0200000_7, (n) iDLCallbackS16S0200000_7.l0, 4));
        }
    }

    public static final void onLoad$14(IDLCallbackS16S0200000_7 iDLCallbackS16S0200000_7, AsyncAVService service, long j) {
        o.LJIIIZ(service, "service");
        service.uiService().editService().startEdit((Context) iDLCallbackS16S0200000_7.l0, ((EditConfig.Builder) iDLCallbackS16S0200000_7.l1).build());
    }

    public static final void onLoad$15(IDLCallbackS16S0200000_7 iDLCallbackS16S0200000_7, AsyncAVService asyncAVService, long j) {
        C42398GkU.LIZ(asyncAVService, "service").startRecord(((C46005I3t) iDLCallbackS16S0200000_7.l0).LLJ(), (RecordConfig) iDLCallbackS16S0200000_7.l1);
    }

    public static final void onLoad$16(IDLCallbackS16S0200000_7 iDLCallbackS16S0200000_7, AsyncAVService asyncAVService, long j) {
        C42398GkU.LIZ(asyncAVService, "service").startRecord((Context) iDLCallbackS16S0200000_7.l0, ((RecordConfig.Builder) iDLCallbackS16S0200000_7.l1).build());
    }

    public static final void onLoad$17(IDLCallbackS16S0200000_7 iDLCallbackS16S0200000_7, AsyncAVService asyncAVService, long j) {
        C42398GkU.LIZ(asyncAVService, "service").startRecord((Context) iDLCallbackS16S0200000_7.l0, ((RecordConfig.Builder) iDLCallbackS16S0200000_7.l1).build());
    }

    public static final void onLoad$18(IDLCallbackS16S0200000_7 iDLCallbackS16S0200000_7, AsyncAVService asyncAVService, long j) {
        IRecordService recordService = asyncAVService.uiService().recordService();
        Context context = ((C84942XVi) iDLCallbackS16S0200000_7.l1).LJIIJ;
        RecordConfig build = ((RecordConfig.Builder) iDLCallbackS16S0200000_7.l0).build();
        C84942XVi c84942XVi = (C84942XVi) iDLCallbackS16S0200000_7.l1;
        EnumC133695Mn editEffectStyleForAlbum = c84942XVi.LJJII.getData(c84942XVi.LJIJJLI).getEditEffectStyleForAlbum();
        C84942XVi c84942XVi2 = (C84942XVi) iDLCallbackS16S0200000_7.l1;
        recordService.startAlbum(context, build, editEffectStyleForAlbum, c84942XVi2.LJJII.getData(c84942XVi2.LJIJJLI));
    }

    public static final void onLoad$19(IDLCallbackS16S0200000_7 iDLCallbackS16S0200000_7, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord(((C84942XVi) iDLCallbackS16S0200000_7.l1).LJIIJ, ((RecordConfig.Builder) iDLCallbackS16S0200000_7.l0).build());
    }

    public static final void onLoad$2(IDLCallbackS16S0200000_7 iDLCallbackS16S0200000_7, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord((PushCameraBlurActivity) iDLCallbackS16S0200000_7.l1, (RecordConfig) iDLCallbackS16S0200000_7.l0);
        ((PushCameraBlurActivity) iDLCallbackS16S0200000_7.l1).finish();
    }

    public static final void onLoad$20(IDLCallbackS16S0200000_7 iDLCallbackS16S0200000_7, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord(((C84942XVi) iDLCallbackS16S0200000_7.l1).LJIIJ, ((RecordConfig.Builder) iDLCallbackS16S0200000_7.l0).build());
    }

    public static final void onLoad$21(IDLCallbackS16S0200000_7 iDLCallbackS16S0200000_7, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord(((C84942XVi) iDLCallbackS16S0200000_7.l1).LJIIJ, ((RecordConfig.Builder) iDLCallbackS16S0200000_7.l0).build());
    }

    public static final void onLoad$22(IDLCallbackS16S0200000_7 iDLCallbackS16S0200000_7, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord(((C84942XVi) iDLCallbackS16S0200000_7.l1).LJIIJ, ((RecordConfig.Builder) iDLCallbackS16S0200000_7.l0).build());
    }

    public static final void onLoad$23(IDLCallbackS16S0200000_7 iDLCallbackS16S0200000_7, AsyncAVService asyncAVService, long j) {
        C42398GkU.LIZ(asyncAVService, "service").startRecord(((C56480MEq) iDLCallbackS16S0200000_7.l0).LJLJJL, ((RecordConfig.Builder) iDLCallbackS16S0200000_7.l1).build());
    }

    public static final void onLoad$24(IDLCallbackS16S0200000_7 iDLCallbackS16S0200000_7, AsyncAVService asyncAVService, long j) {
        C42398GkU.LIZ(asyncAVService, "service").startRecord(((C56480MEq) iDLCallbackS16S0200000_7.l0).LJLJJL, ((RecordConfig.Builder) iDLCallbackS16S0200000_7.l1).build());
    }

    public static final void onLoad$25(IDLCallbackS16S0200000_7 iDLCallbackS16S0200000_7, AsyncAVService asyncAVService, long j) {
        C42398GkU.LIZ(asyncAVService, "service").startRecord(((A00) iDLCallbackS16S0200000_7.l0).LJLJJI, ((RecordConfig.Builder) iDLCallbackS16S0200000_7.l1).build());
    }

    public static final void onLoad$3(IDLCallbackS16S0200000_7 iDLCallbackS16S0200000_7, AsyncAVService service, long j) {
        Integer defaultTab;
        o.LJIIIZ(service, "service");
        boolean isBroadcastSmoothGoLive = service.uiService().recordService().isBroadcastSmoothGoLive();
        RecordConfig recordConfig = (RecordConfig) iDLCallbackS16S0200000_7.l0;
        if (recordConfig == null || (defaultTab = recordConfig.getDefaultTab()) == null || defaultTab.intValue() != 2 || !isBroadcastSmoothGoLive) {
            if (((RecordConfig) iDLCallbackS16S0200000_7.l0) != null) {
                service.uiService().recordService().startRecord((ActivityC45651qj) iDLCallbackS16S0200000_7.l1, (RecordConfig) iDLCallbackS16S0200000_7.l0);
                return;
            }
            return;
        }
        service.uiService().recordService().startIndependentLiveActivity((ActivityC45651qj) iDLCallbackS16S0200000_7.l1, (RecordConfig) iDLCallbackS16S0200000_7.l0);
    }

    public static final void onLoad$4(IDLCallbackS16S0200000_7 iDLCallbackS16S0200000_7, AsyncAVService asyncAVService, long j) {
        C42398GkU.LIZ(asyncAVService, "service").startRecord((Activity) iDLCallbackS16S0200000_7.l0, ((RecordConfig.Builder) iDLCallbackS16S0200000_7.l1).build());
        ((Activity) iDLCallbackS16S0200000_7.l0).finish();
    }

    public static final void onLoad$5(IDLCallbackS16S0200000_7 iDLCallbackS16S0200000_7, AsyncAVService service, long j) {
        String str;
        String str2;
        o.LJIIIZ(service, "service");
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) iDLCallbackS16S0200000_7.l0;
        PublishModel publishModel = (PublishModel) iDLCallbackS16S0200000_7.l1;
        String nv0 = C116694i1.LIZ(activityC45651qj).nv0();
        String str3 = "";
        if (nv0 == null) {
            nv0 = "";
        }
        Hox.LJLLI.LIZ(activityC45651qj).Ja(nv0);
        IRecordService recordService = service.uiService().recordService();
        if (publishModel == null || (str = publishModel.shootWay) == null) {
            str = "";
        }
        if (publishModel != null && (str2 = publishModel.creationId) != null) {
            str3 = str2;
        }
        recordService.showCameraWidgetGuide(activityC45651qj, str, str3, MainPageFragmentImpl.LJI().LJJLIIIJJI(), false, C56319M8l.LJLIL);
    }

    public static final void onLoad$6(IDLCallbackS16S0200000_7 iDLCallbackS16S0200000_7, AsyncAVService asyncAVService, long j) {
        C42398GkU.LIZ(asyncAVService, "service").startRecord((Context) iDLCallbackS16S0200000_7.l0, ((RecordConfig.Builder) iDLCallbackS16S0200000_7.l1).build());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onLoad$7(IDLCallbackS16S0200000_7 iDLCallbackS16S0200000_7, AsyncAVService service, long j) {
        MainActivityScope LJJLIIIJJI;
        o.LJIIIZ(service, "service");
        ShareOpenPlatformMethod shareOpenPlatformMethod = (ShareOpenPlatformMethod) iDLCallbackS16S0200000_7.l0;
        ActivityC45651qj LIZIZ = shareOpenPlatformMethod.LIZIZ(shareOpenPlatformMethod.getActContext());
        PublishTabAbility publishTabAbility = null;
        if (LIZIZ != null && (LJJLIIIJJI = C78866UxK.LJJLIIIJJI(LIZIZ)) != null) {
            publishTabAbility = C77357UXp.LJJJJJL(LJJLIIIJJI);
        }
        boolean z = false;
        if (publishTabAbility != null && publishTabAbility.XE()) {
            z = true;
        }
        if (z) {
            if (o.LJ(publishTabAbility.getResourceType(), "template")) {
                IRecordService recordService = service.uiService().recordService();
                Context actContext = ((ShareOpenPlatformMethod) iDLCallbackS16S0200000_7.l0).getActContext();
                o.LJIIIIZZ(actContext, "actContext");
                recordService.enterRecordPageInTemplate(actContext, ((RecordConfig.Builder) ((C68322mC) iDLCallbackS16S0200000_7.l1).element).build());
            } else {
                IRecordService recordService2 = service.uiService().recordService();
                Context actContext2 = ((ShareOpenPlatformMethod) iDLCallbackS16S0200000_7.l0).getActContext();
                o.LJIIIIZZ(actContext2, "actContext");
                recordService2.startSpecialPlusEntrance(actContext2, ((RecordConfig.Builder) ((C68322mC) iDLCallbackS16S0200000_7.l1).element).build());
            }
            publishTabAbility.OR();
        } else {
            IRecordService recordService3 = service.uiService().recordService();
            Context actContext3 = ((ShareOpenPlatformMethod) iDLCallbackS16S0200000_7.l0).getActContext();
            o.LJIIIIZZ(actContext3, "actContext");
            recordService3.startRecord(actContext3, ((RecordConfig.Builder) ((C68322mC) iDLCallbackS16S0200000_7.l1).element).build());
        }
        Context actContext4 = ((ShareOpenPlatformMethod) iDLCallbackS16S0200000_7.l0).getActContext();
        o.LJIIIIZZ(actContext4, "actContext");
        IAX.LIZ(C45804HyK.LJIJJ(actContext4), "PUBLISH");
        C58604MzI.LIZIZ.openCamera();
    }

    public static final void onLoad$8(IDLCallbackS16S0200000_7 iDLCallbackS16S0200000_7, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord(((DetailFragment) iDLCallbackS16S0200000_7.l1).mo49getActivity(), ((RecordConfig.Builder) iDLCallbackS16S0200000_7.l0).build());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onLoad$9(IDLCallbackS16S0200000_7 iDLCallbackS16S0200000_7, AsyncAVService service, long j) {
        MusicModel musicModel;
        o.LJIIIZ(service, "service");
        SoundSyncAnchorConfig soundSyncAnchorConfig = new SoundSyncAnchorConfig();
        soundSyncAnchorConfig.setCreativeInfo(new CreativeInfo(null, 0, null, 7, null));
        Music music = ((HS9) iDLCallbackS16S0200000_7.l0).LJJII().getMusic();
        if (music != null) {
            musicModel = music.convertToMusicModel();
        } else {
            musicModel = null;
        }
        soundSyncAnchorConfig.setMusicModel(musicModel);
        soundSyncAnchorConfig.setClipDurations((ArrayList) ((C68322mC) iDLCallbackS16S0200000_7.l1).element);
        soundSyncAnchorConfig.setMusicStart(((HS9) iDLCallbackS16S0200000_7.l0).LJJII().getMusicBeginTime());
        soundSyncAnchorConfig.setMusicEnd(((HS9) iDLCallbackS16S0200000_7.l0).LJJII().getMusicEndTime());
        soundSyncAnchorConfig.setEnterFrom(((HS9) iDLCallbackS16S0200000_7.l0).LJJIIZI());
        soundSyncAnchorConfig.setEnterMethod(((HS9) iDLCallbackS16S0200000_7.l0).LJJIIZ());
        service.uiService().recordService().startSoundSyncAlbum(((HS9) iDLCallbackS16S0200000_7.l0).LJJI(), soundSyncAnchorConfig);
    }
}
