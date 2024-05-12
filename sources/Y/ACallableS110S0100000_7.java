package Y;

import X.AbstractC42152GgW;
import X.ActivityC45651qj;
import X.C10K;
import X.C133765Mu;
import X.C136155Vz;
import X.C145995oB;
import X.C1554568f;
import X.C16880lQ;
import X.C169696lJ;
import X.C1I0;
import X.C212428Vi;
import X.C26045AKb;
import X.C32I;
import X.C36922EeM;
import X.C38891fp;
import X.C39252Faq;
import X.C39253Far;
import X.C39579Fg7;
import X.C41360GLc;
import X.C41854Gbi;
import X.C42089GfV;
import X.C42125Gg5;
import X.C42126Gg6;
import X.C42129Gg9;
import X.C42130GgA;
import X.C42149GgT;
import X.C42299Git;
import X.C42380GkC;
import X.C42383GkF;
import X.C42393GkP;
import X.C42462GlW;
import X.C42622Go6;
import X.C42637GoL;
import X.C43117Gw5;
import X.C43244Gy8;
import X.C43287Gyp;
import X.C43421H2j;
import X.C43426H2o;
import X.C43765HFp;
import X.C44065HRd;
import X.C44066HRe;
import X.C44496HdE;
import X.C44687HgJ;
import X.C44694HgQ;
import X.C44701HgX;
import X.C44927HkB;
import X.C44938HkM;
import X.C45054HmE;
import X.C45243HpH;
import X.C45344Hqu;
import X.C45348Hqy;
import X.C45357Hr7;
import X.C45373HrN;
import X.C45403Hrr;
import X.C45864HzI;
import X.C45865HzJ;
import X.C46002I3q;
import X.C46003I3r;
import X.C46009I3x;
import X.C46030I4s;
import X.C54846Lfm;
import X.C55247LmF;
import X.C58096Mr6;
import X.C58604MzI;
import X.C60903NvH;
import X.C61447O9r;
import X.C62844OlU;
import X.C6BK;
import X.C72972SkS;
import X.C76800UCe;
import X.C77413UZt;
import X.C78934UyQ;
import X.C78983UzD;
import X.C84386X9y;
import X.CMX;
import X.EnumC44070HRi;
import X.FMX;
import X.GA5;
import X.GPP;
import X.GXR;
import X.GXZ;
import X.H4P;
import X.HFP;
import X.HQ5;
import X.HZQ;
import X.HZR;
import X.HZU;
import X.I2K;
import X.I2L;
import X.IBD;
import X.InterfaceC153045zY;
import X.InterfaceC41392GMi;
import X.InterfaceC42413Gkj;
import X.InterfaceC45358Hr8;
import X.InterfaceC65784Pro;
import X.ORY;
import X.ORZ;
import X.ProgressDialogC43241Gy5;
import X.RunnableC42347Gjf;
import X.V16;
import X.WM7;
import X.X1D;
import X.YE1;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.keva.Keva;
import com.bytedance.provider.impl.GScope;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.assem.ToolsActivityAssem;
import com.ss.android.ugc.aweme.base.AnchorListManager;
import com.ss.android.ugc.aweme.base.AnchorListResp;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.commerce.tools.music.promote.PromoteRepalceMusicServiceImpl;
import com.ss.android.ugc.aweme.commerce.tools.promote.PromoteReplaceMusicApi;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.detail.api.DetailApi;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftRestoreResult;
import com.ss.android.ugc.aweme.draft.model.DraftSaveResult;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.RuntimeBehaviorServiceImpl;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IBusinessPublishService;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.services.edit.PromoteReplaceMusicRequest;
import com.ss.android.ugc.aweme.services.edit.ReplaceMusicRequest;
import com.ss.android.ugc.aweme.services.external.IPrivacyConfig;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.services.watermark.IWaterMarkService;
import com.ss.android.ugc.aweme.services.watermark.WaterMarkBuilder;
import com.ss.android.ugc.aweme.shortvideo.BusinessPublishImpl;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.cut.VEMediaParserFrameProviderImpl;
import com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEMediaParserProviderV2;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.model.FrameItem;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.ss.android.ugc.aweme.status.StatusCreateVideoData;
import com.ss.android.ugc.effectmanager.disklrucache.DiskLruCache;
import com.ss.android.ugc.trill.share.api.ShareApi;
import com.ss.android.vesdk.VEUtils;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AqS138S0200000_7;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;
import p83.a;
import ujb.s;

/* loaded from: classes8.dex */
public class ACallableS110S0100000_7 implements Callable {
    public final int $t;
    public Object l0;

    public static final /* synthetic */ Object call$36(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        return ((InterfaceC65784Pro) aCallableS110S0100000_7.l0).invoke();
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            case 6:
                return call$6(this);
            case 7:
                return call$7(this);
            case 8:
                return call$8(this);
            case 9:
                return call$9(this);
            case 10:
                return call$10(this);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return call$11(this);
            case 12:
                return call$12(this);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return call$13(this);
            case 14:
                return call$14(this);
            case 15:
                return call$15(this);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return call$16(this);
            case 17:
                return call$17(this);
            case 18:
                return call$18(this);
            case 19:
                return call$19(this);
            case 20:
                return call$20(this);
            case 21:
                return call$21(this);
            case 22:
                return call$22(this);
            case 23:
                return call$23(this);
            case 24:
                return call$24(this);
            case 25:
                return call$25(this);
            case 26:
                return call$26(this);
            case 27:
                return call$27(this);
            case 28:
                return call$28(this);
            case 29:
                return call$29(this);
            case 30:
                return call$30(this);
            case 31:
                return call$31(this);
            case 32:
                return call$32(this);
            case 33:
                return call$33(this);
            case 34:
                return call$34(this);
            case 35:
                return call$35(this);
            case 36:
                return call$36(this);
            case 37:
                return call$37(this);
            case 38:
                return call$38(this);
            case 39:
                return call$39(this);
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                return call$40(this);
            case 41:
                return call$41(this);
            case 42:
                return call$42(this);
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                return call$43(this);
            case 44:
                return call$44(this);
            case 45:
                return call$45(this);
            case 46:
                return call$46(this);
            case 47:
                return call$47(this);
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                return call$48(this);
            case C61447O9r.LJIIJ:
                return call$49(this);
            case 50:
                return call$50(this);
            case 51:
                return call$51(this);
            case 52:
                return call$52(this);
            case 53:
                return call$53(this);
            case 54:
                return call$54(this);
            case 55:
                return call$55(this);
            case 56:
                return call$56(this);
            case 57:
                return call$57(this);
            case 58:
                return call$58(this);
            case 59:
                return call$59(this);
            case 60:
                return call$60(this);
            case 61:
                return call$61(this);
            case BaseNotice.CREATOR /* 62 */:
                return call$62(this);
            case 63:
                return call$63(this);
            case 64:
                return call$64(this);
            case 65:
                return call$65(this);
            case 66:
                return call$66(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        C42125Gg5 c42125Gg5;
        try {
            c42125Gg5 = new CMX((Context) aCallableS110S0100000_7.l0).LIZ();
        } catch (Exception unused) {
            c42125Gg5 = null;
        }
        C42126Gg6 c42126Gg6 = new C42126Gg6();
        if (c42125Gg5 == null) {
            C1I0.LIZIZ().LJFF("app_exit", C42129Gg9.LJLIL);
        } else if (c42125Gg5.LJLJI != ((Keva) c42126Gg6.LIZ.getValue()).getLong("key_app_kill_timestamp", -1L)) {
            String str = (String) ORZ.LJLLLL(C60903NvH.LJIIJJI().getPublishService().LJIILIIL().LIZJ());
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("description", c42125Gg5.LJLIL);
            c145995oB.LIZ(c42125Gg5.LJLILLLLZI, "reason");
            c145995oB.LIZIZ(c42125Gg5.LJLJI, "timestamp");
            c145995oB.LIZ(c42125Gg5.LJLJJI, "importance");
            c145995oB.LJI("process_name", c42125Gg5.LJLJJL);
            c145995oB.LJI("creation_id", str);
            c145995oB.LJI("from_item_id", "");
            c145995oB.LJI("enter_from", "");
            c145995oB.LJI("string_representation", c42125Gg5.LJLJJLL);
            if (GA5.LIZ()) {
                c145995oB.LJFF(C60903NvH.LJIIJJI().getPublishService().LJIILIIL().LJIIIIZZ());
            }
            FMX.LJIIL("app_kill_reason", c145995oB.LIZ);
            ((Keva) c42126Gg6.LIZ.getValue()).storeLong("key_app_kill_timestamp", c42125Gg5.LJLJI);
            C60903NvH.LJIIJJI().getPublishService().LJIILIIL().LJI();
        }
        if (GA5.LIZ()) {
            C42383GkF c42383GkF = C42130GgA.LIZ;
            C42380GkC c42380GkC = C42380GkC.LIZ;
            c42383GkF.LIZ();
            ((ArrayList) c42383GkF.LIZJ).add(c42380GkC);
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$1(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        C43117Gw5 c43117Gw5 = C43117Gw5.LIZ;
        CreativeInfo creativeInfo = (CreativeInfo) aCallableS110S0100000_7.l0;
        c43117Gw5.getClass();
        String LJFF = C43117Gw5.LJFF(creativeInfo);
        if (C39579Fg7.LIZIZ(LJFF)) {
            C43117Gw5.LIZJ(new File(LJFF));
            return null;
        }
        return null;
    }

    public static final Object call$10(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        C84386X9y c84386X9y = (C84386X9y) ((VEMediaParserFrameProviderImpl) aCallableS110S0100000_7.l0).LJLJJL.getValue();
        c84386X9y.getClass();
        try {
            c84386X9y.LIZIZ().delete();
            DiskLruCache diskCache = c84386X9y.LIZIZ();
            o.LJIIIIZZ(diskCache, "diskCache");
            C16880lQ.LLLZZIL(diskCache.getDirectory());
        } catch (Exception unused) {
        }
        ((VEMediaParserFrameProviderImpl) aCallableS110S0100000_7.l0).LIZLLL();
        return C76800UCe.LIZ;
    }

    public static final Object call$11(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        ((VEMediaParserProviderV2) aCallableS110S0100000_7.l0).LIZ();
        C84386X9y c84386X9y = (C84386X9y) ((VEMediaParserProviderV2) aCallableS110S0100000_7.l0).LJLJL.getValue();
        c84386X9y.getClass();
        try {
            c84386X9y.LIZIZ().delete();
            DiskLruCache diskCache = c84386X9y.LIZIZ();
            o.LJIIIIZZ(diskCache, "diskCache");
            C16880lQ.LLLZZIL(diskCache.getDirectory());
        } catch (Exception unused) {
        }
        VEMediaParserProviderV2 vEMediaParserProviderV2 = (VEMediaParserProviderV2) aCallableS110S0100000_7.l0;
        vEMediaParserProviderV2.LJLJI.execute(new RunnableC42347Gjf(vEMediaParserProviderV2));
        List<Long> fetchFrameTimeList = ((VEMediaParserProviderV2) aCallableS110S0100000_7.l0).LJLJJLL;
        o.LJIIIZ(fetchFrameTimeList, "fetchFrameTimeList");
        ArrayList arrayList = (ArrayList) fetchFrameTimeList;
        if (!arrayList.isEmpty()) {
            C145995oB c145995oB = new C145995oB();
            c145995oB.LIZIZ(ORZ.LLILLJJLI(fetchFrameTimeList), "duration");
            c145995oB.LIZ(arrayList.size(), "count");
            c145995oB.LJI(WM7.SCENE_SERVICE, "video_clip");
            GXR.LIZ("tool_performance_fetch_frames", c145995oB.LIZ);
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$12(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        VideoPublishEditModel videoPublishEditModel = ((VideoPublishContainerScene) aCallableS110S0100000_7.l0).LLILZLL;
        videoPublishEditModel.creativeModel.autoCutAnchorModel.templateZipPath = C136155Vz.LIZ(videoPublishEditModel);
        return null;
    }

    public static final Object call$13(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        C60903NvH.LJIIJJI().LJJJI().LJFF().LJI(new GPP((AwemeDraft) aCallableS110S0100000_7.l0, new C41360GLc("UploadRecover", "deleteShoutOutDraftForPublish"), null, null, 60));
        return C76800UCe.LIZ;
    }

    public static final Object call$14(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        ((InterfaceC65784Pro) aCallableS110S0100000_7.l0).invoke();
        return C76800UCe.LIZ;
    }

    public static final Object call$15(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        return C42462GlW.LIZ((ReplaceMusicRequest) aCallableS110S0100000_7.l0);
    }

    public static final Object call$16(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        return C42462GlW.LIZ(((PromoteReplaceMusicRequest) aCallableS110S0100000_7.l0).getReplaceMusicRequest());
    }

    public static final Object call$17(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        PromoteRepalceMusicServiceImpl.LIZJ().LIZ();
        C42622Go6.LJIIIIZZ((PromoteReplaceMusicRequest) aCallableS110S0100000_7.l0, null);
        return C76800UCe.LIZ;
    }

    public static final Object call$18(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        return C42462GlW.LIZ(((PromoteReplaceMusicRequest) aCallableS110S0100000_7.l0).getReplaceMusicRequest());
    }

    public static final Object call$19(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        String str;
        String str2;
        String str3;
        User user;
        ShortVideoContext shortVideoContext = (ShortVideoContext) aCallableS110S0100000_7.l0;
        C145995oB c145995oB = new C145995oB();
        String str4 = null;
        if (shortVideoContext != null) {
            str = shortVideoContext.LJI();
        } else {
            str = null;
        }
        c145995oB.LJI("creation_id", str);
        c145995oB.LJI("group_id", C78983UzD.LJJIJL());
        if (shortVideoContext != null && (user = shortVideoContext.duetFromUser) != null) {
            str2 = user.getUid();
        } else {
            str2 = null;
        }
        c145995oB.LJI("author_id", str2);
        if (shortVideoContext != null) {
            str3 = shortVideoContext.enterFrom;
        } else {
            str3 = null;
        }
        c145995oB.LJI("enter_from", str3);
        if (shortVideoContext != null) {
            str4 = shortVideoContext.shootWay;
        }
        c145995oB.LJI("shoot_way", str4);
        GXR.LIZ("show_upload_button", c145995oB.LIZ);
        return C76800UCe.LIZ;
    }

    public static final Object call$2(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        return Integer.valueOf(VEUtils.isCanImport(((MediaModel) aCallableS110S0100000_7.l0).fileLocalUriPath));
    }

    public static final Object call$20(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        C46030I4s.LIZ(((C46003I3r) aCallableS110S0100000_7.l0).LLJJIJIIJIL(), ((C46003I3r) aCallableS110S0100000_7.l0).LLJJIJIL());
        return C76800UCe.LIZ;
    }

    public static final Object call$21(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        C46030I4s.LIZ(((C46002I3q) aCallableS110S0100000_7.l0).LLJILJIL(), ((C46002I3q) aCallableS110S0100000_7.l0).LLJILJILJ());
        return C76800UCe.LIZ;
    }

    public static final Object call$22(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        Object[] objArr = (Object[]) aCallableS110S0100000_7.l0;
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        Object obj = objArr[2];
        String str3 = (String) objArr[3];
        String str4 = (String) objArr[4];
        String str5 = (String) objArr[5];
        String str6 = (String) objArr[6];
        String str7 = (String) objArr[7];
        String str8 = (String) objArr[8];
        String str9 = (String) objArr[9];
        HashMap LIZ = C45243HpH.LIZ("platform_type", str, "share_url", str2);
        LIZ.put("share_message", obj);
        if (!TextUtils.isEmpty(str3)) {
            LIZ.put("fb_access_token", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            LIZ.put("twitter_access_token", str4);
        }
        if (!TextUtils.isEmpty(str5)) {
            LIZ.put("access_token_secret", str5);
        }
        if (!TextUtils.isEmpty(str6)) {
            LIZ.put("youtube_code", str6);
        }
        if (!TextUtils.isEmpty(str7)) {
            LIZ.put("item_id", str7);
        }
        if (!TextUtils.isEmpty(str8)) {
            LIZ.put("youtube_title", str8);
        }
        if (!TextUtils.isEmpty(str9)) {
            LIZ.put("youtube_desc", str9);
        }
        return ShareApi.LIZ.autoShare(LIZ).execute().LIZIZ;
    }

    public static final Object call$23(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        return C42462GlW.LIZ((ReplaceMusicRequest) aCallableS110S0100000_7.l0);
    }

    public static final Object call$24(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        ((Runnable) aCallableS110S0100000_7.l0).run();
        return null;
    }

    public static final Object call$25(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        String str;
        I2K i2k = (I2K) aCallableS110S0100000_7.l0;
        i2k.getClass();
        C6BK c6bk = new C6BK();
        for (Map.Entry<String, I2L> entry : i2k.LIZIZ.entrySet()) {
            String key = entry.getKey();
            switch (key.hashCode()) {
                case -2066442300:
                    if (key.equals("ve_recorder_init_to_camera_init")) {
                        str = "step12";
                        break;
                    } else {
                        break;
                    }
                case -1698086861:
                    if (key.equals("ve_audio_encode_settings")) {
                        str = "step6";
                        break;
                    } else {
                        break;
                    }
                case -1654399870:
                    if (key.equals("video_record_activity_create")) {
                        str = "step1";
                        break;
                    } else {
                        break;
                    }
                case -1561368051:
                    if (key.equals("ve_recorder_create")) {
                        str = "step5";
                        break;
                    } else {
                        break;
                    }
                case -1250439464:
                    if (key.equals("ve_video_encode_settings")) {
                        str = "step7";
                        break;
                    } else {
                        break;
                    }
                case -1236532301:
                    if (key.equals("video_record_activity_resume")) {
                        str = "step3";
                        break;
                    } else {
                        break;
                    }
                case -1149151301:
                    if (key.equals("first_frame_captured_to_first_frame_render")) {
                        str = "step18";
                        break;
                    } else {
                        break;
                    }
                case -958317332:
                    if (key.equals("surface_set_to_first_frame_render")) {
                        str = "step15";
                        break;
                    } else {
                        break;
                    }
                case -659590582:
                    if (key.equals("ve_preview_settings")) {
                        str = "step8";
                        break;
                    } else {
                        break;
                    }
                case -38535140:
                    if (key.equals("video_record_activity_start")) {
                        str = "step2";
                        break;
                    } else {
                        break;
                    }
                case 840084978:
                    if (key.equals("first_frame_captured_to_surface_created")) {
                        str = "step16";
                        break;
                    } else {
                        break;
                    }
                case 1045073070:
                    if (key.equals("video_record_bind_components")) {
                        str = "step4";
                        break;
                    } else {
                        break;
                    }
                case 1057767009:
                    if (key.equals("ve_recorder_init")) {
                        str = "step9";
                        break;
                    } else {
                        break;
                    }
                case 1426436948:
                    if (key.equals("first_frame_captured_to_effect_first_frame")) {
                        str = "step17";
                        break;
                    } else {
                        break;
                    }
                case 1807058126:
                    if (key.equals("surface_create")) {
                        str = "step11";
                        break;
                    } else {
                        break;
                    }
                case 2058848746:
                    if (key.equals("camera_init")) {
                        str = "step13";
                        break;
                    } else {
                        break;
                    }
                case 2059029284:
                    if (key.equals("camera_open")) {
                        str = "step14";
                        break;
                    } else {
                        break;
                    }
                case 2137600900:
                    if (key.equals("ve_recorder_start_to_surface_create")) {
                        str = "step10";
                        break;
                    } else {
                        break;
                    }
            }
            I2L value = entry.getValue();
            long j = value.LIZIZ - value.LIZ;
            String LJFF = i0.LJFF(str, "_order");
            c6bk.LIZJ(Long.valueOf(j), str);
            c6bk.LIZIZ(Integer.valueOf(value.LIZJ), LJFF);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Step ");
            YE1.LIZLLL(LIZ, entry.getKey(), " : Event Step Name ", str, " : Latency ");
            LIZ.append(j);
            LIZ.append(" : Order ");
            LIZ.append(value.LIZJ);
            X1D.LIZIZ(LIZ);
        }
        c6bk.LIZLLL("type", "first_frame_latency");
        String str2 = i2k.LIZJ;
        if (str2 == null) {
            str2 = "";
        }
        c6bk.LIZLLL("enter_from", str2);
        c6bk.LIZIZ(Integer.valueOf(i2k.LIZIZ.size()), "totalstep");
        long j2 = i2k.LJ - i2k.LIZLLL;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Total time: ");
        LIZ2.append(j2);
        X1D.LIZIZ(LIZ2);
        c6bk.LIZJ(Long.valueOf(j2), "totaltime");
        boolean z = false;
        if (HQ5.LIZ) {
            HQ5.LIZ = false;
            z = true;
        }
        c6bk.LIZ(Boolean.valueOf(z), "cold_start");
        i2k.LIZIZ.clear();
        GXR.LIZIZ("tool_performance_operation_cost_time", c6bk.LJ());
        return C76800UCe.LIZ;
    }

    public static final Object call$26(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        AwemeDraft draft = (AwemeDraft) aCallableS110S0100000_7.l0;
        InterfaceC41392GMi LJFF = C60903NvH.LJIIJJI().LJJJI().LJFF();
        C41360GLc c41360GLc = new C41360GLc("DraftEditHelper not Support", "deleteOfflineDraft");
        o.LJIIIZ(draft, "draft");
        LJFF.LJI(new GPP(draft, c41360GLc, null, null, 60));
        return null;
    }

    public static final Object call$27(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        String str;
        String bgPath;
        StatusCreateVideoData statusCreateVideoData = ((AwemeDraft) aCallableS110S0100000_7.l0).LJJJJI.statusCreateVideoData;
        if (statusCreateVideoData != null) {
            C38891fp.LJIILJJIL(statusCreateVideoData.getVideoCoverImgPath());
            StatusCreateVideoData statusCreateVideoData2 = ((AwemeDraft) aCallableS110S0100000_7.l0).LJJJJI.statusCreateVideoData;
            String str2 = null;
            if (statusCreateVideoData2 != null) {
                str = statusCreateVideoData2.getEffectPath();
            } else {
                str = null;
            }
            C38891fp.LJIILJJIL(str);
            StatusCreateVideoData statusCreateVideoData3 = ((AwemeDraft) aCallableS110S0100000_7.l0).LJJJJI.statusCreateVideoData;
            if (statusCreateVideoData3 != null && (bgPath = statusCreateVideoData3.getBgPath()) != null && s.LJJJLZIJ(bgPath, "status/resizeImage", false)) {
                C38891fp.LJIILJJIL(bgPath);
            }
            StatusCreateVideoData statusCreateVideoData4 = ((AwemeDraft) aCallableS110S0100000_7.l0).LJJJJI.statusCreateVideoData;
            if (statusCreateVideoData4 != null) {
                str2 = statusCreateVideoData4.getMusicPath();
            }
            C38891fp.LJIILJJIL(str2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$28(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        long currentTimeMillis = System.currentTimeMillis();
        Object value = ((HZQ) aCallableS110S0100000_7.l0).LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-keva>(...)");
        if (currentTimeMillis - ((Keva) value).getLong("sticker_point_last_download", 0L) >= 86400000) {
            HZU.LIZ().LJFF(new HZR((HZQ) aCallableS110S0100000_7.l0, currentTimeMillis));
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$29(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        long currentTimeMillis = System.currentTimeMillis();
        Object value = ((C45864HzI) aCallableS110S0100000_7.l0).LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-keva>(...)");
        if (currentTimeMillis - ((Keva) value).getLong("text_font_last_prefetch", 0L) >= 86400000) {
            C1554568f LIZ = C1554568f.LIZ();
            C45864HzI c45864HzI = (C45864HzI) aCallableS110S0100000_7.l0;
            Context context = c45864HzI.LJLIL;
            C45865HzJ c45865HzJ = new C45865HzJ(c45864HzI, currentTimeMillis);
            LIZ.getClass();
            C10K.LIZJ(new ACallableS54S0300000_2(LIZ, context, c45865HzJ, 2));
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$3(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        return Integer.valueOf(VEUtils.isCanImport(((MediaModel) aCallableS110S0100000_7.l0).fileLocalUriPath));
    }

    public static final Object call$30(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        return AVExternalServiceImpl.LIZ().configService().privacyConfig().checkDuetReactPermission(((Aweme) aCallableS110S0100000_7.l0).getAid(), 1);
    }

    public static final Object call$31(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        return DetailApi.LIZIZ(((C44066HRe) aCallableS110S0100000_7.l0).LJIILL.getAid(), "");
    }

    public static final Object call$32(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        IPrivacyConfig privacyConfig = AVExternalServiceImpl.LIZ().configService().privacyConfig();
        String aid = ((Aweme) aCallableS110S0100000_7.l0).getAid();
        o.LJIIIIZZ(aid, "aweme.aid");
        return privacyConfig.checkDuetReactPermission(aid, 2);
    }

    public static final Object call$33(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        ((C44065HRd) aCallableS110S0100000_7.l0).getClass();
        return C76800UCe.LIZ;
    }

    public static final Object call$34(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        C44065HRd c44065HRd = (C44065HRd) aCallableS110S0100000_7.l0;
        if (c44065HRd.LIZ != null) {
            c44065HRd.LIZ();
            c44065HRd.LJI(R.string.exz, EnumC44070HRi.DOWNLOAD_FAILED);
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$35(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        Aweme aweme = ((C44065HRd) aCallableS110S0100000_7.l0).LIZLLL;
        if (aweme != null) {
            return DetailApi.LIZIZ(aweme.getAid(), "");
        }
        o.LJIJI("mAweme");
        throw null;
    }

    public static final Object call$37(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        ((Runnable) aCallableS110S0100000_7.l0).run();
        return C76800UCe.LIZ;
    }

    public static final Object call$38(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        return Boolean.valueOf(((IBD) aCallableS110S0100000_7.l0).LIZIZ());
    }

    public static final Object call$39(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        return Boolean.valueOf(((IBD) aCallableS110S0100000_7.l0).LIZIZ());
    }

    public static final Object call$4(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        IBusinessPublishService iBusinessPublishService;
        ToolsActivityAssem toolsActivityAssem = (ToolsActivityAssem) aCallableS110S0100000_7.l0;
        toolsActivityAssem.getClass();
        ActivityC45651qj LIZ = C212428Vi.LIZ(toolsActivityAssem);
        if (LIZ != null) {
            Object LIZ2 = C58096Mr6.LIZ(IBusinessPublishService.class, false);
            if (LIZ2 != null) {
                iBusinessPublishService = (IBusinessPublishService) LIZ2;
            } else {
                if (C58096Mr6.T6 == null) {
                    synchronized (IBusinessPublishService.class) {
                        if (C58096Mr6.T6 == null) {
                            C58096Mr6.T6 = new BusinessPublishImpl();
                        }
                    }
                }
                iBusinessPublishService = C58096Mr6.T6;
            }
            iBusinessPublishService.initWaterMark();
            IAVPublishService publishService = AVExternalServiceImpl.LIZ().publishService();
            if (publishService.enableFloatingProgress()) {
                publishService.registerPublishProgressCallback(C212428Vi.LIZ(toolsActivityAssem), new C42637GoL(toolsActivityAssem, publishService));
            }
            AVExternalServiceImpl.LIZ().abnormalExitLogService().logAppAbnormalExit();
            if (!toolsActivityAssem.LJLIL) {
                AVExternalServiceImpl.LIZ().publishService().tryRestorePublish(LIZ, new AqS138S0200000_7(toolsActivityAssem, LIZ, 121));
            }
            IMainService createIMainServicebyMonsterPlugin = MainServiceImpl.createIMainServicebyMonsterPlugin(false);
            if (createIMainServicebyMonsterPlugin.isLastPublishFailed()) {
                C26045AKb c26045AKb = new C26045AKb(LIZ);
                c26045AKb.LJIIIIZZ(R.string.hq8);
                c26045AKb.LJIIJ();
                createIMainServicebyMonsterPlugin.setLastPublishFailed(false);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$40(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        C78934UyQ.LJLIL.LJFF().getDraftMonitorService().reportDraftRestoreFailureToJinx((DraftRestoreResult) aCallableS110S0100000_7.l0);
        return C76800UCe.LIZ;
    }

    public static final Object call$41(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        C78934UyQ.LJLIL.LJFF().getDraftMonitorService().reportDraftSaveFailureToJinx((DraftSaveResult) aCallableS110S0100000_7.l0);
        return C76800UCe.LIZ;
    }

    public static final Object call$42(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        C133765Mu c133765Mu = ((H4P) aCallableS110S0100000_7.l0).LJI;
        if (c133765Mu != null) {
            c133765Mu.destroy();
            return C76800UCe.LIZ;
        }
        return null;
    }

    public static final Object call$43(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        ((C133765Mu) aCallableS110S0100000_7.l0).destroy();
        return C76800UCe.LIZ;
    }

    public static final Object call$44(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        ((InterfaceC65784Pro) aCallableS110S0100000_7.l0).invoke();
        return C76800UCe.LIZ;
    }

    public static final Object call$45(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        InterfaceC153045zY interfaceC153045zY = ((C43421H2j) aCallableS110S0100000_7.l0).LJIJ;
        if (interfaceC153045zY != null) {
            interfaceC153045zY.destroy();
            return C76800UCe.LIZ;
        }
        return null;
    }

    public static final Object call$46(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        ((InterfaceC153045zY) aCallableS110S0100000_7.l0).destroy();
        return C76800UCe.LIZ;
    }

    public static final Object call$47(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        C41854Gbi.LIZ((VideoPublishEditModel) aCallableS110S0100000_7.l0);
        return C76800UCe.LIZ;
    }

    public static final Object call$48(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        C42393GkP c42393GkP = (C42393GkP) aCallableS110S0100000_7.l0;
        if (c42393GkP.LIZ != null) {
            c42393GkP.LIZ(true);
            Activity activity = ((C42393GkP) aCallableS110S0100000_7.l0).LIZ;
            if (activity != null) {
                C26045AKb c26045AKb = new C26045AKb(activity);
                c26045AKb.LJIIIIZZ(R.string.exz);
                c26045AKb.LJIIJ();
                return C76800UCe.LIZ;
            }
            o.LJIJI("mContext");
            throw null;
        }
        o.LJIJI("mContext");
        throw null;
    }

    public static final Object call$49(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        ((C42393GkP) aCallableS110S0100000_7.l0).LIZ(false);
        C42393GkP c42393GkP = (C42393GkP) aCallableS110S0100000_7.l0;
        Activity activity = c42393GkP.LIZ;
        if (activity != null) {
            c42393GkP.LIZJ = ProgressDialogC43241Gy5.LIZIZ(activity, activity.getResources().getString(R.string.ra6));
            ProgressDialogC43241Gy5 progressDialogC43241Gy5 = ((C42393GkP) aCallableS110S0100000_7.l0).LIZJ;
            if (progressDialogC43241Gy5 == null) {
                return null;
            }
            progressDialogC43241Gy5.setIndeterminate(true);
            return C76800UCe.LIZ;
        }
        o.LJIJI("mContext");
        throw null;
    }

    public static final Object call$5(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        C10K<AnchorListResp> anchorList = AnchorListManager.LIZ.getAnchorList();
        AnchorListManager.LJII.set(true);
        return anchorList.LJ(new AgS124S0100000_7((InterfaceC65784Pro) aCallableS110S0100000_7.l0, 7), C10K.LJIIIIZZ, null);
    }

    public static final Object call$50(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        C42393GkP c42393GkP = (C42393GkP) aCallableS110S0100000_7.l0;
        ProgressDialogC43241Gy5 progressDialogC43241Gy5 = c42393GkP.LIZJ;
        if (progressDialogC43241Gy5 != null) {
            int i = c42393GkP.LJ;
            if (i >= 99) {
                i = 99;
            }
            progressDialogC43241Gy5.setProgress(i);
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$51(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        PromoteReplaceMusicRequest model = (PromoteReplaceMusicRequest) aCallableS110S0100000_7.l0;
        o.LJIIIZ(model, "model");
        BaseResponse baseResponse = ((PromoteReplaceMusicApi.Api) C169696lJ.LIZ(C60903NvH.LJIIJJI().getNetworkService(), true, PromoteReplaceMusicApi.Api.class)).get(model.getItemID(), model.getOriginalMusicID(), model.getReplaceMusicRequest().getEditMusicStruct().getMusicID(), model.getRetryScene()).execute().LIZIZ;
        o.LJIIIIZZ(baseResponse, "api.get(model.itemID, mo…ryScene).execute().body()");
        return baseResponse;
    }

    public static final Object call$52(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        boolean z;
        a.C0043a LIZIZ;
        try {
            C39252Faq c39252Faq = C39253Far.LIZJ;
            Context context = (Context) aCallableS110S0100000_7.l0;
            c39252Faq.getClass();
            LIZIZ = C39252Faq.LIZIZ(context);
        } catch (Exception unused) {
        }
        if (LIZIZ != null) {
            z = LIZIZ.LIZIZ;
            return Boolean.valueOf(z);
        }
        z = false;
        return Boolean.valueOf(z);
    }

    public static final Object call$53(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        ((InterfaceC65784Pro) aCallableS110S0100000_7.l0).invoke();
        return C76800UCe.LIZ;
    }

    public static final Object call$54(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        ((InterfaceC153045zY) aCallableS110S0100000_7.l0).destroy();
        return C76800UCe.LIZ;
    }

    public static final Object call$55(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        String extractFramesDir = ((VideoPublishEditModel) aCallableS110S0100000_7.l0).extractFramesModel.getExtractFramesDir();
        C39579Fg7.LJIJJLI(extractFramesDir);
        C39579Fg7.LJIL(extractFramesDir);
        return null;
    }

    public static final Object call$56(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        ((InterfaceC42413Gkj) aCallableS110S0100000_7.l0).LIZIZ();
        return C76800UCe.LIZ;
    }

    public static final Object call$57(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        ((InterfaceC42413Gkj) aCallableS110S0100000_7.l0).onStart();
        return C76800UCe.LIZ;
    }

    public static final Object call$58(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        InterfaceC153045zY interfaceC153045zY = ((C43426H2o) aCallableS110S0100000_7.l0).LJI;
        if (interfaceC153045zY != null) {
            interfaceC153045zY.destroy();
            return C76800UCe.LIZ;
        }
        return null;
    }

    public static final Object call$59(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        int[] iArr;
        int[] LJJLJ;
        if (!C77413UZt.LJIILL(((C43765HFp) aCallableS110S0100000_7.l0).LIZLLL)) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            List<HFP> list = ((C43765HFp) aCallableS110S0100000_7.l0).LIZLLL;
            o.LJI(list);
            for (HFP hfp : list) {
                if (C44694HgQ.LJIJI(hfp.LIZ, true)) {
                    arrayList.add(hfp);
                } else {
                    arrayList2.add(hfp);
                }
            }
            HashSet hashSet = new HashSet();
            Iterator it = arrayList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                iArr = C54846Lfm.LJLJJI;
                if (!hasNext) {
                    break;
                }
                Bitmap LIZ = C42299Git.LIZ(((HFP) it.next()).LIZ, iArr);
                if (LIZ != null) {
                    String LIZIZ = ((C43765HFp) aCallableS110S0100000_7.l0).LIZIZ.LIZIZ();
                    o.LJIIIIZZ(LIZIZ, "photoPathGenerator.generatePhotoPath()");
                    C42299Git.LJFF(LIZ, new File(LIZIZ), 70, Bitmap.CompressFormat.JPEG);
                    hashSet.add(LIZIZ);
                }
            }
            String frameDir = ((C43765HFp) aCallableS110S0100000_7.l0).LIZIZ.LIZIZ;
            o.LJIIIIZZ(frameDir, "frameDir");
            String separator = File.separator;
            o.LJIIIIZZ(separator, "separator");
            if (!ujb.o.LJJJJ(frameDir, separator, false)) {
                frameDir = i0.LJFF(frameDir, separator);
            }
            Iterator it2 = arrayList2.iterator();
            int i = 0;
            while (it2.hasNext()) {
                int i2 = i + 1;
                HFP hfp2 = (HFP) it2.next();
                String str = hfp2.LIZ;
                ((C43765HFp) aCallableS110S0100000_7.l0).getClass();
                long j = hfp2.LIZJ;
                if (j != 0) {
                    int LIZIZ2 = (((int) j) / C54846Lfm.LIZIZ()) + 1;
                    LJJLJ = new int[LIZIZ2];
                    for (int i3 = 0; i3 < LIZIZ2; i3++) {
                        LJJLJ[i3] = (int) (hfp2.LIZIZ + (C54846Lfm.LIZIZ() * i3));
                    }
                } else {
                    LJJLJ = ORY.LJJLJ(new Integer[0]);
                }
                VEUtils.saveVideoFrames(str, LJJLJ, iArr[0], -1, false, frameDir, C72972SkS.LIZLLL(i, "extract_frame"), 1);
                i = i2;
            }
            File[] listFiles = new File(frameDir).listFiles();
            if (listFiles != null && listFiles.length != 0) {
                for (File file : listFiles) {
                    hashSet.add(file.getAbsolutePath());
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = hashSet.iterator();
            while (it3.hasNext()) {
                arrayList3.add(it3.next());
            }
            ((C43765HFp) aCallableS110S0100000_7.l0).LIZ.clearAllFrames();
            ExtractFramesModel extractFramesModel = ((C43765HFp) aCallableS110S0100000_7.l0).LIZ;
            ArrayList<FrameItem> arrayList4 = new ArrayList<>(C32I.LJJL(arrayList3, 10));
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                arrayList4.add(new FrameItem((String) it4.next(), 0, 0, false, null, null, 62, null));
            }
            ArrayList<FrameItem> arrayList5 = new ArrayList<>(C32I.LJJL(arrayList3, 10));
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                arrayList5.add(new FrameItem((String) it5.next(), 0, 0, false, null, null, 62, null));
            }
            extractFramesModel.addFrameSegment(arrayList4, null, arrayList5);
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$6(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        C46030I4s.LIZ(((C46009I3x) aCallableS110S0100000_7.l0).getUiStates().LJ.LIZJ, ((C46009I3x) aCallableS110S0100000_7.l0).getUiStates().LJ.LIZIZ);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$60(Y.ACallableS110S0100000_7 r17) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS110S0100000_7.call$60(Y.ACallableS110S0100000_7):java.lang.Object");
    }

    public static final Object call$61(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) aCallableS110S0100000_7.l0).iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(TEVideoUtils.nativeCheckAudioFile((String) it.next())));
        }
        return arrayList;
    }

    public static final Object call$62(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        AbstractC42152GgW abstractC42152GgW = (AbstractC42152GgW) aCallableS110S0100000_7.l0;
        C42149GgT c42149GgT = abstractC42152GgW.LJLIL;
        if (c42149GgT != null) {
            c42149GgT.LJFF(new AqS157S0100000_7(abstractC42152GgW, (AbstractC42152GgW<Object>) 750));
            abstractC42152GgW.LJLILLLLZI.postValue(null);
            return C76800UCe.LIZ;
        }
        o.LJIJI("ownerChecker");
        throw null;
    }

    public static final Object call$63(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        try {
            C43287Gyp.LIZIZ.LIZ = ((Aweme) aCallableS110S0100000_7.l0).getAwemeRawAd();
            return null;
        } catch (Exception e) {
            C36922EeM.LIZ(e);
            return null;
        }
    }

    public static final Object call$64(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        IWaterMarkService iWaterMarkService;
        C45344Hqu c45344Hqu = (C45344Hqu) aCallableS110S0100000_7.l0;
        WaterMarkBuilder waterMarkBuilder = c45344Hqu.LLIIII;
        if (waterMarkBuilder != null && (iWaterMarkService = (IWaterMarkService) c45344Hqu.LLIIIL.get()) != null) {
            iWaterMarkService.prepareDataForI18n(waterMarkBuilder);
            return null;
        }
        return null;
    }

    public static final Object call$65(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        InterfaceC45358Hr8 interfaceC45358Hr8;
        C45344Hqu c45344Hqu = (C45344Hqu) aCallableS110S0100000_7.l0;
        c45344Hqu.getClass();
        c45344Hqu.LLIL = System.currentTimeMillis();
        c45344Hqu.LLILII = "download_time";
        c45344Hqu.LLILIL = "add_watermark";
        c45344Hqu.LLILL = null;
        C39579Fg7.LJ(((C45344Hqu) aCallableS110S0100000_7.l0).LJLJI, false);
        C45344Hqu c45344Hqu2 = (C45344Hqu) aCallableS110S0100000_7.l0;
        boolean z = c45344Hqu2.LJZ;
        if (z) {
            GScope gScope = GScope.LJLIL;
            String str = c45344Hqu2.LJLLI;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            C55247LmF.LIZIZ(gScope, new C62844OlU(str, z, c45344Hqu2.LJLZ), C62844OlU.class, "Download");
            V16.LJL(gScope, Long.valueOf(System.currentTimeMillis()), null, null, 6);
            C45344Hqu c45344Hqu3 = (C45344Hqu) aCallableS110S0100000_7.l0;
            int i = 1;
            if (C45403Hrr.LIZ()) {
                interfaceC45358Hr8 = new C45357Hr7();
            } else {
                C45344Hqu c45344Hqu4 = (C45344Hqu) aCallableS110S0100000_7.l0;
                Aweme aweme = c45344Hqu4.LLF;
                if (aweme != null) {
                    String str3 = c45344Hqu4.LLIIL;
                    if (str3 != null) {
                        str2 = str3;
                    }
                    C43244Gy8 c43244Gy8 = new C43244Gy8(aweme, str2, c45344Hqu4.LLIIJLIL, c45344Hqu4.LJLLI);
                    c43244Gy8.LJFF = C45348Hqy.LIZIZ(((C45344Hqu) aCallableS110S0100000_7.l0).LJLZ);
                    c43244Gy8.LJII = 1;
                    interfaceC45358Hr8 = c43244Gy8;
                } else {
                    o.LJIJI("mAweme");
                    throw null;
                }
            }
            c45344Hqu3.LLIFFJFJJ = interfaceC45358Hr8;
            InterfaceC45358Hr8 interfaceC45358Hr82 = ((C45344Hqu) aCallableS110S0100000_7.l0).LLIFFJFJJ;
            if (interfaceC45358Hr82 != null) {
                interfaceC45358Hr82.LIZIZ();
            }
            RuntimeBehaviorServiceImpl.LJ().LIZ("water_mark_start");
            C45344Hqu c45344Hqu5 = (C45344Hqu) aCallableS110S0100000_7.l0;
            c45344Hqu5.getClass();
            C44938HkM.LIZIZ = false;
            C44938HkM.LIZJ = true;
            WaterMarkBuilder waterMarkBuilder = c45344Hqu5.LLIIII;
            o.LJI(waterMarkBuilder);
            waterMarkBuilder.setDownloadDuration(c45344Hqu5.LLFZ);
            waterMarkBuilder.setDownloadRate(c45344Hqu5.LLI);
            if (c45344Hqu5.LJLZ && C44496HdE.LIZ()) {
                i = 2;
            }
            Aweme aweme2 = c45344Hqu5.LLF;
            if (aweme2 == null) {
                o.LJIJI("mAweme");
                throw null;
            }
            C45373HrN.LIZIZ(aweme2, c45344Hqu5.LLIIJI, c45344Hqu5.LJLLILLLL, "short", null, i, -1);
            C58604MzI.LIZIZ.waterMarkStart();
            WaterMarkBuilder waterMarkBuilder2 = c45344Hqu5.LLIIII;
            if (waterMarkBuilder2 != null) {
                Aweme aweme3 = c45344Hqu5.LLF;
                if (aweme3 != null) {
                    if (C44927HkB.LIZLLL(aweme3)) {
                        IWaterMarkService iWaterMarkService = (IWaterMarkService) c45344Hqu5.LLIIIL.get();
                        if (iWaterMarkService != null) {
                            iWaterMarkService.watermarkForTikTokNow(waterMarkBuilder2);
                        }
                    } else if (c45344Hqu5.LJZI) {
                        IWaterMarkService iWaterMarkService2 = (IWaterMarkService) c45344Hqu5.LLIIIL.get();
                        if (iWaterMarkService2 != null) {
                            iWaterMarkService2.addEffectWatermark(waterMarkBuilder2);
                        }
                    } else {
                        IWaterMarkService iWaterMarkService3 = (IWaterMarkService) c45344Hqu5.LLIIIL.get();
                        if (iWaterMarkService3 != null) {
                            iWaterMarkService3.waterMark(waterMarkBuilder2);
                        }
                    }
                } else {
                    o.LJIJI("mAweme");
                    throw null;
                }
            }
        } else {
            C39579Fg7.LIZLLL(c45344Hqu2.LJLJJL, c45344Hqu2.LJLJJLL);
            C45344Hqu c45344Hqu6 = (C45344Hqu) aCallableS110S0100000_7.l0;
            Aweme aweme4 = c45344Hqu6.LLF;
            if (aweme4 != null) {
                if (c45344Hqu6.LJIIL(aweme4, c45344Hqu6.LJLLILLLL) && !((C45344Hqu) aCallableS110S0100000_7.l0).LJIILIIL()) {
                    ((C45344Hqu) aCallableS110S0100000_7.l0).LJI(false);
                } else {
                    ((C45344Hqu) aCallableS110S0100000_7.l0).LJII();
                }
            } else {
                o.LJIJI("mAweme");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$66(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        return ((C42089GfV) aCallableS110S0100000_7.l0).LIZ();
    }

    public static final Object call$7(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        return C44701HgX.LJ(((C45054HmE) aCallableS110S0100000_7.l0).getActivity(), ((C45054HmE) aCallableS110S0100000_7.l0).LLJLIL(), ((C45054HmE) aCallableS110S0100000_7.l0).LJLL);
    }

    public static final Object call$8(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        Iterator<AutoCutMediaModel> it = ((AutoCutModel) aCallableS110S0100000_7.l0).mediaList.iterator();
        while (it.hasNext()) {
            C44687HgJ.LJIILJJIL(it.next().filePath);
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$9(ACallableS110S0100000_7 aCallableS110S0100000_7) {
        ((InterfaceC65784Pro) aCallableS110S0100000_7.l0).invoke();
        return C76800UCe.LIZ;
    }

    public ACallableS110S0100000_7(AwemeDraft awemeDraft, int i) {
        this.$t = i;
        switch (i) {
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
            case 27:
                this.l0 = awemeDraft;
                return;
            default:
                this.l0 = awemeDraft;
                return;
        }
    }

    public ACallableS110S0100000_7(Aweme aweme, int i) {
        this.$t = i;
        switch (i) {
            case 30:
                this.l0 = aweme;
                return;
            default:
                this.l0 = aweme;
                return;
        }
    }

    public ACallableS110S0100000_7(VideoPublishEditModel videoPublishEditModel, int i) {
        this.$t = i;
        switch (i) {
            case 47:
                this.l0 = videoPublishEditModel;
                return;
            default:
                this.l0 = videoPublishEditModel;
                return;
        }
    }

    public ACallableS110S0100000_7(Runnable runnable, int i) {
        this.$t = i;
        switch (i) {
            case 24:
                this.l0 = runnable;
                return;
            default:
                this.l0 = runnable;
                return;
        }
    }

    public ACallableS110S0100000_7(GXZ function, int i) {
        this.$t = i;
        o.LJIIIZ(function, "function");
        this.l0 = function;
    }

    public ACallableS110S0100000_7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public ACallableS110S0100000_7(InterfaceC42413Gkj interfaceC42413Gkj, int i, long j, long j2, int i2) {
        this.$t = i2;
        this.l0 = interfaceC42413Gkj;
    }
}
