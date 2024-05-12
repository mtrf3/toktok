package Y;

import X.AnonymousClass636;
import X.C10I;
import X.C10K;
import X.C113554cx;
import X.C145995oB;
import X.C188727au;
import X.C211898Th;
import X.C235779Nd;
import X.C243939hl;
import X.C2U8;
import X.C31626Cb8;
import X.C32I;
import X.C36747EbX;
import X.C36821Ecj;
import X.C36922EeM;
import X.C40675Fxn;
import X.C41284GIe;
import X.C41290GIk;
import X.C41809Gaz;
import X.C42622Go6;
import X.C42790Gqo;
import X.C42792Gqq;
import X.C42793Gqr;
import X.C43014GuQ;
import X.C43882HKc;
import X.C44065HRd;
import X.C44066HRe;
import X.C44172HVg;
import X.C44704Hga;
import X.C45054HmE;
import X.C45128HnQ;
import X.C45405Hrt;
import X.C54293LSn;
import X.C65777Prh;
import X.C73305Spp;
import X.C73994T2g;
import X.C76800UCe;
import X.C78685UuP;
import X.C7TR;
import X.C82544WaS;
import X.C85144XbI;
import X.CallableC42917Gsr;
import X.CallableC42918Gss;
import X.ED5;
import X.EnumC42934Gt8;
import X.FMX;
import X.GHU;
import X.GJ8;
import X.GJZ;
import X.GK5;
import X.GS5;
import X.H78;
import X.HG3;
import X.HGA;
import X.HGJ;
import X.I15;
import X.ICT;
import X.InterfaceC41992Gdw;
import X.InterfaceC45408Hrw;
import X.InterfaceC65784Pro;
import X.InterfaceC73573Su9;
import X.InterfaceC88472Yns;
import X.ORS;
import X.ORZ;
import X.OSZ;
import X.PII;
import X.RBX;
import X.RunnableC42347Gjf;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.BaseBundle;
import androidx.core.app.JobIntentService;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.ies.ugc.aweme.commwecialize.ba.api.BAGetLeadsAnchorStateApi;
import com.bytedance.ies.ugc.aweme.commwecialize.ba.api.BAProductAnchorStateApi;
import com.bytedance.ies.ugc.aweme.commwecialize.ba.api.GetLeadsAnchorPublishResp;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.m;
import com.google.gson.o;
import com.google.gson.s;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.account.login.authorize.AuthorizedDeviceActivity;
import com.ss.android.ugc.aweme.account.login.twostep.AuthDeviceResponse;
import com.ss.android.ugc.aweme.account.login.twostep.Device;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationActivityViewModel;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity;
import com.ss.android.ugc.aweme.api.AnchorAutoSelectionResponse;
import com.ss.android.ugc.aweme.base.AnchorListManager;
import com.ss.android.ugc.aweme.base.AnchorListResp;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.challenge.recommend.model.RecommendHashTagData;
import com.ss.android.ugc.aweme.challenge.recommend.model.RecommendHashTagResponse;
import com.ss.android.ugc.aweme.commerce.tools.music.promote.PromoteRepalceMusicServiceImpl;
import com.ss.android.ugc.aweme.common.AnchorTransData;
import com.ss.android.ugc.aweme.compliance.api.model.AdPersonalitySettings;
import com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceAnchorService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.feed.model.AnchorPlaylistInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.services.edit.PromoteReplaceMusicRequest;
import com.ss.android.ugc.aweme.services.external.IGetPublishDraftCallback;
import com.ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import com.ss.android.ugc.aweme.shortvideo.AVApiImpl;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEMediaParserProviderV2;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import com.ss.android.ugc.aweme.shortvideo.model.AutoSelectedAnchorInfos;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.RecordPresetResource;
import com.ss.android.ugc.aweme.shortvideo.model.SuggestMusicList;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.ugc.aweme.tools.extract.video.VideoFramesUploadService;
import com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadService;
import com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadTask;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class AgS124S0100000_7 implements C10I {
    public final int $t;
    public Object l0;

    @Override // X.C10I
    public final Object then(C10K c10k) {
        switch (this.$t) {
            case 0:
                return then$0(this, c10k);
            case 1:
                return then$1(this, c10k);
            case 2:
                return then$2(this, c10k);
            case 3:
                return then$3(this, c10k);
            case 4:
                return then$4(this, c10k);
            case 5:
                return then$5(this, c10k);
            case 6:
                return then$6(this, c10k);
            case 7:
                return then$7(this, c10k);
            case 8:
                return then$8(this, c10k);
            case 9:
                return then$9(this, c10k);
            case 10:
                return then$10(this, c10k);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return then$11(this, c10k);
            case 12:
                return then$12(this, c10k);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return then$13(this, c10k);
            case 14:
                return then$14(this, c10k);
            case 15:
                return then$15(this, c10k);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return then$16(this, c10k);
            case 17:
                return then$17(this, c10k);
            case 18:
                return then$18(this, c10k);
            case 19:
                return then$19(this, c10k);
            case 20:
                return then$20(this, c10k);
            case 21:
                return then$21(this, c10k);
            case 22:
                return then$22(this, c10k);
            case 23:
                return then$23(this, c10k);
            case 24:
                return then$24(this, c10k);
            case 25:
                return then$25(this, c10k);
            case 26:
                return then$26(this, c10k);
            case 27:
                return then$27(this, c10k);
            case 28:
                return then$28(this, c10k);
            case 29:
                return then$29(this, c10k);
            case 30:
                return then$30(this, c10k);
            case 31:
                return then$31(this, c10k);
            case 32:
                return then$32(this, c10k);
            case 33:
                return then$33(this, c10k);
            case 34:
                return then$34(this, c10k);
            case 35:
                return then$35(this, c10k);
            default:
                return null;
        }
    }

    public AgS124S0100000_7(InterfaceC88472Yns interfaceC88472Yns, int i) {
        this.$t = i;
        switch (i) {
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                this.l0 = interfaceC88472Yns;
                return;
            default:
                this.l0 = interfaceC88472Yns;
                return;
        }
    }

    public static final Object then$0(AgS124S0100000_7 agS124S0100000_7, C10K c10k) {
        InterfaceC41992Gdw interfaceC41992Gdw = (InterfaceC41992Gdw) agS124S0100000_7.l0;
        if (interfaceC41992Gdw != null) {
            interfaceC41992Gdw.LIZ();
            return null;
        }
        return null;
    }

    public static final Object then$1(AgS124S0100000_7 agS124S0100000_7, C10K c10k) {
        InterfaceC41992Gdw interfaceC41992Gdw = (InterfaceC41992Gdw) agS124S0100000_7.l0;
        if (interfaceC41992Gdw != null) {
            interfaceC41992Gdw.LIZ();
            return null;
        }
        return null;
    }

    public static final Object then$10(AgS124S0100000_7 agS124S0100000_7, C10K c10k) {
        try {
            JobIntentService.enqueueWork((Context) agS124S0100000_7.l0, (Class<?>) OriginalSoundUploadService.class, 3008, new Intent());
            return null;
        } catch (Exception e) {
            C36922EeM.LJFF(e);
            return null;
        }
    }

    public static final Object then$11(AgS124S0100000_7 agS124S0100000_7, C10K c10k) {
        CreateAnchorInfo createAnchorInfo;
        m LJIIZILJ;
        String LJJIFFI;
        AnchorAutoSelectionResponse anchorAutoSelectionResponse = (AnchorAutoSelectionResponse) c10k.LJIIJJI();
        if (anchorAutoSelectionResponse != null && anchorAutoSelectionResponse.status == 0 && (createAnchorInfo = anchorAutoSelectionResponse.anchor) != null) {
            UrlModel urlModel = new UrlModel();
            urlModel.setUri(anchorAutoSelectionResponse.addedIcon.getUri());
            urlModel.setUrlList(anchorAutoSelectionResponse.addedIcon.getUrlList());
            urlModel.setHeight(anchorAutoSelectionResponse.addedIcon.getHeight().intValue());
            urlModel.setWidth(anchorAutoSelectionResponse.addedIcon.getWidth().intValue());
            C2U8.LIZ(new C7TR(new AnchorTransData(createAnchorInfo.getType(), createAnchorInfo.getContent(), createAnchorInfo.getKeyword(), "", 4, "", urlModel, anchorAutoSelectionResponse.canRemove.booleanValue(), createAnchorInfo.getUrl(), "", null, createAnchorInfo.getExtra(), createAnchorInfo.getSubtype())));
            if (anchorAutoSelectionResponse.logExtra != null) {
                try {
                    LJIIZILJ = GsonProtectorUtils.parse(new o(), anchorAutoSelectionResponse.logExtra).LJIIZILJ();
                } catch (s | Exception unused) {
                }
                if (LJIIZILJ != null) {
                    LJJIFFI = LJIIZILJ.LJJIJ("anchor_type").LJJIFFI();
                    C145995oB c145995oB = new C145995oB();
                    c145995oB.LJI("shoot_way", ((AutoSelectedAnchorInfos) agS124S0100000_7.l0).getAnchorShootWay());
                    c145995oB.LJI("enter_from", "video_edit_page");
                    c145995oB.LJI("anchor_type", LJJIFFI);
                    c145995oB.LJI("anchor_entry", createAnchorInfo.getKeyword());
                    FMX.LJIIL("choose_anchor", c145995oB.LIZ);
                    return null;
                }
            }
            LJJIFFI = "game";
            C145995oB c145995oB2 = new C145995oB();
            c145995oB2.LJI("shoot_way", ((AutoSelectedAnchorInfos) agS124S0100000_7.l0).getAnchorShootWay());
            c145995oB2.LJI("enter_from", "video_edit_page");
            c145995oB2.LJI("anchor_type", LJJIFFI);
            c145995oB2.LJI("anchor_entry", createAnchorInfo.getKeyword());
            FMX.LJIIL("choose_anchor", c145995oB2.LIZ);
            return null;
        }
        return null;
    }

    public static final Object then$12(AgS124S0100000_7 agS124S0100000_7, C10K c10k) {
        Intent intent = (Intent) agS124S0100000_7.l0;
        if (((BaseBundle) c10k.LJIIJJI()).containsKey("first_sticker")) {
            intent.putExtra("show_preloading_dialog", false);
        }
        return C10K.LJIIIZ(c10k.LJIIJJI());
    }

    public static final Object then$13(AgS124S0100000_7 agS124S0100000_7, C10K c10k) {
        return ((InterfaceC88472Yns) agS124S0100000_7.l0).invoke(c10k.LJIIJJI());
    }

    public static final Object then$14(AgS124S0100000_7 agS124S0100000_7, C10K c10k) {
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) agS124S0100000_7.l0;
        Object LJIIJJI = c10k.LJIIJJI();
        kotlin.jvm.internal.o.LJIIIIZZ(LJIIJJI, "it.result");
        interfaceC88472Yns.invoke(LJIIJJI);
        return C76800UCe.LIZ;
    }

    public static final Object then$15(AgS124S0100000_7 agS124S0100000_7, C10K c10k) {
        if (c10k.LJIILJJIL()) {
            Iterator it = ((ArrayList) ((HGJ) agS124S0100000_7.l0).LIZ).iterator();
            while (it.hasNext()) {
                OriginalSoundUploadTask originalSoundUploadTask = (OriginalSoundUploadTask) it.next();
                Exception LJIIJ = c10k.LJIIJ();
                kotlin.jvm.internal.o.LJIIIIZZ(LJIIJ, "it.error");
                String LIZIZ = C36747EbX.LIZIZ(LJIIJ);
                kotlin.jvm.internal.o.LJIIIIZZ(LIZIZ, "getStackTraceAsString(this)");
                C43882HKc.LIZ.LJIILLIIL("aweme_movie_publish_log", "upload_audio", C73994T2g.LJJIJLIJ(C113554cx.LJJL(new OSZ("success", CardStruct.IStatusCode.DEFAULT), new OSZ("success_mid", originalSoundUploadTask.vid), new OSZ("aweme_id", originalSoundUploadTask.awemeId), new OSZ("errorDesc", LIZIZ))));
            }
        } else {
            Iterator it2 = ((ArrayList) ((HGJ) agS124S0100000_7.l0).LIZ).iterator();
            while (it2.hasNext()) {
                OriginalSoundUploadTask originalSoundUploadTask2 = (OriginalSoundUploadTask) it2.next();
                C43882HKc.LIZ.LJIILLIIL("aweme_movie_publish_log", "upload_audio", C73994T2g.LJJIJLIJ(C113554cx.LJJL(new OSZ("success", "1"), new OSZ("success_mid", originalSoundUploadTask2.vid), new OSZ("aweme_id", originalSoundUploadTask2.awemeId))));
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$16(AgS124S0100000_7 agS124S0100000_7, C10K task) {
        kotlin.jvm.internal.o.LJIIIZ(task, "task");
        if (task.LJIILJJIL() || task.LJIIL()) {
            H78.LIZIZ("ReplaceMusicToolbarScene", "Retry error code 3013002");
        } else {
            PromoteRepalceMusicServiceImpl.LIZJ().LIZ();
            C42622Go6.LJIIIIZZ((PromoteReplaceMusicRequest) agS124S0100000_7.l0, null);
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$17(AgS124S0100000_7 agS124S0100000_7, C10K c10k) {
        if (!c10k.LJIILJJIL() && c10k.LJIILIIL()) {
            if (c10k.LJIIJJI() != null) {
                ((InterfaceC73573Su9) agS124S0100000_7.l0).onNext(c10k.LJIIJJI());
            } else {
                ((InterfaceC73573Su9) agS124S0100000_7.l0).onError(new IllegalStateException("Result is null"));
            }
        } else {
            InterfaceC73573Su9 interfaceC73573Su9 = (InterfaceC73573Su9) agS124S0100000_7.l0;
            Exception LJIIJ = c10k.LJIIJ();
            if (LJIIJ == null) {
                LJIIJ = new IllegalStateException("Error is null");
            }
            interfaceC73573Su9.onError(LJIIJ);
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$18(AgS124S0100000_7 agS124S0100000_7, C10K c10k) {
        IGetPublishDraftCallback iGetPublishDraftCallback = (IGetPublishDraftCallback) agS124S0100000_7.l0;
        AwemeDraft awemeDraft = (AwemeDraft) c10k.LJIIJJI();
        if (awemeDraft != null) {
            iGetPublishDraftCallback.onSuccess(awemeDraft);
            return null;
        }
        iGetPublishDraftCallback.onFail();
        return null;
    }

    public static final Object then$19(AgS124S0100000_7 agS124S0100000_7, C10K c10k) {
        IGetPublishDraftCallback iGetPublishDraftCallback = (IGetPublishDraftCallback) agS124S0100000_7.l0;
        AwemeDraft awemeDraft = (AwemeDraft) c10k.LJIIJJI();
        if (awemeDraft != null) {
            iGetPublishDraftCallback.onSuccess(awemeDraft);
            return null;
        }
        iGetPublishDraftCallback.onFail();
        return null;
    }

    public static final Object then$2(AgS124S0100000_7 agS124S0100000_7, C10K c10k) {
        if (!c10k.LJIILJJIL() && c10k.LJIILIIL()) {
            if (c10k.LJIIJJI() != null) {
                C43014GuQ.LJFF = (List) c10k.LJIIJJI();
                ((InterfaceC73573Su9) agS124S0100000_7.l0).onNext(c10k.LJIIJJI());
                return C76800UCe.LIZ;
            }
            return Boolean.valueOf(((InterfaceC73573Su9) agS124S0100000_7.l0).tryOnError(new IllegalStateException("Result is null")));
        }
        return Boolean.valueOf(((InterfaceC73573Su9) agS124S0100000_7.l0).tryOnError(new IllegalStateException("Result is null")));
    }

    public static final Object then$20(AgS124S0100000_7 agS124S0100000_7, C10K c10k) {
        C44066HRe c44066HRe = (C44066HRe) agS124S0100000_7.l0;
        c44066HRe.getClass();
        if (!c10k.LJIILJJIL() && !c10k.LJIIL() && c10k.LJIIJJI() != null) {
            c44066HRe.LJIILL = (Aweme) c10k.LJIIJJI();
        }
        c44066HRe.LJIIIZ();
        return null;
    }

    public static final Object then$21(AgS124S0100000_7 agS124S0100000_7, C10K task) {
        kotlin.jvm.internal.o.LJIIIZ(task, "task");
        if (!task.LJIILJJIL() && !task.LJIIL() && task.LJIIJJI() != null) {
            C44065HRd c44065HRd = (C44065HRd) agS124S0100000_7.l0;
            Object LJIIJJI = task.LJIIJJI();
            kotlin.jvm.internal.o.LJIIIIZZ(LJIIJJI, "task.result");
            c44065HRd.LIZLLL = (Aweme) LJIIJJI;
        }
        ((C44065HRd) agS124S0100000_7.l0).LJIIIIZZ();
        return null;
    }

    public static final Object then$22(AgS124S0100000_7 agS124S0100000_7, C10K c10k) {
        List<RecommendHashTagData> list;
        if (c10k.LJIILIIL()) {
            RecommendHashTagResponse recommendHashTagResponse = (RecommendHashTagResponse) c10k.LJIIJJI();
            if (recommendHashTagResponse != null && (list = recommendHashTagResponse.data) != null) {
                C40675Fxn.LJJLIIIJ(list, GK5.LJLIL);
            }
            ((MutableLiveData) agS124S0100000_7.l0).setValue(c10k.LJIIJJI());
            return null;
        }
        return null;
    }

    public static final Object then$23(AgS124S0100000_7 agS124S0100000_7, C10K c10k) {
        if (c10k.LJIILJJIL()) {
            return C10K.LJIIIIZZ(c10k.LJIIJ());
        }
        HGA hga = (HGA) c10k.LJIIJJI();
        Integer num = null;
        if (hga == null) {
            return null;
        }
        ((C41809Gaz) agS124S0100000_7.l0).getClass();
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String LIZ = AVApiImpl.LIZJ().LIZ();
        kotlin.jvm.internal.o.LJIIIIZZ(LIZ, "get().getService(AVApi::…s.java).apI_URL_PREFIX_SI");
        VideoFramesUploadService.FramesUploadApi framesUploadApi = (VideoFramesUploadService.FramesUploadApi) LIZLLL.create(LIZ).create(VideoFramesUploadService.FramesUploadApi.class);
        int i = hga.LIZIZ;
        if (i != -1) {
            num = Integer.valueOf(i);
        }
        C10K<BaseResponse> uploadFrame = framesUploadApi.uploadFrame(null, hga.LIZLLL, hga.LJ, hga.LJI.getStickerIds(), num, Integer.valueOf(hga.LIZJ));
        kotlin.jvm.internal.o.LJIIIIZZ(uploadFrame, "api.uploadFrame(\n       …del.vframeType,\n        )");
        return uploadFrame;
    }

    public static final Object then$24(AgS124S0100000_7 agS124S0100000_7, C10K c10k) {
        GS5 gs5 = (GS5) agS124S0100000_7.l0;
        VideoPublishEditModel videoPublishEditModel = gs5.LIZ;
        Object LJIIJJI = c10k.LJIIJJI();
        kotlin.jvm.internal.o.LJIIIIZZ(LJIIJJI, "it.result");
        gs5.LJ((Bitmap) LJIIJJI, videoPublishEditModel);
        return C76800UCe.LIZ;
    }

    public static final Object then$25(AgS124S0100000_7 agS124S0100000_7, C10K c10k) {
        ((InterfaceC65784Pro) agS124S0100000_7.l0).invoke();
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object then$26(AgS124S0100000_7 agS124S0100000_7, C10K c10k) {
        if (!c10k.LJIILJJIL() && c10k.LJIILIIL()) {
            if (C78685UuP.LJJJZ((String) c10k.LJIIJJI())) {
                ((InterfaceC73573Su9) agS124S0100000_7.l0).onNext(c10k.LJIIJJI());
                return C76800UCe.LIZ;
            }
            return Boolean.valueOf(((InterfaceC73573Su9) agS124S0100000_7.l0).tryOnError(new C45128HnQ(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0)));
        }
        return Boolean.valueOf(((InterfaceC73573Su9) agS124S0100000_7.l0).tryOnError(c10k.LJIIJ()));
    }

    public static final Object then$27(AgS124S0100000_7 agS124S0100000_7, C10K c10k) {
        ICT ict;
        Object LJIIJJI = c10k.LJIIJJI();
        kotlin.jvm.internal.o.LJIIIIZZ(LJIIJJI, "isSuccess.result");
        if (((Boolean) LJIIJJI).booleanValue() && (ict = (ICT) agS124S0100000_7.l0) != null) {
            ict.onSuccess();
        }
        return c10k.LJIIJJI();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        if (r0.getMusicModel() != null) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object then$28(Y.AgS124S0100000_7 r10, X.C10K r11) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS124S0100000_7.then$28(Y.AgS124S0100000_7, X.10K):java.lang.Object");
    }

    public static final Object then$29(AgS124S0100000_7 agS124S0100000_7, C10K c10k) {
        I15 i15 = (I15) agS124S0100000_7.l0;
        AVMusic aVMusic = i15.LJIILL.LIZIZ;
        if (aVMusic != null) {
            RecordPresetResource recordPresetResource = i15.LJI;
            if (recordPresetResource != null) {
                MusicModel musicModel = recordPresetResource.getMusicModel();
                if (musicModel != null) {
                    aVMusic.setMusicBeginTime(musicModel.getMusicBeginTime());
                    aVMusic.setMusicEndTime(musicModel.getMusicEndTime());
                    aVMusic.setMusicStartFromCut(musicModel.getMusicBeginTime());
                }
                i15.LIZIZ(aVMusic, C44172HVg.LJI.LJIIJJI(aVMusic));
            } else {
                kotlin.jvm.internal.o.LJIJI("recordPresetResource");
                throw null;
            }
        }
        I15 i152 = (I15) agS124S0100000_7.l0;
        Effect effect = i152.LJIILL.LIZ;
        if (effect != null) {
            i152.LIZ(effect);
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$3(AgS124S0100000_7 agS124S0100000_7, C10K c10k) {
        if (!c10k.LJIILJJIL() && c10k.LJIILIIL()) {
            if (c10k.LJIIJJI() != null) {
                C43014GuQ.LJFF = ((SuggestMusicList) c10k.LJIIJJI()).musicList;
                ((InterfaceC73573Su9) agS124S0100000_7.l0).onNext(c10k.LJIIJJI());
            } else {
                ((InterfaceC73573Su9) agS124S0100000_7.l0).onError(new IllegalStateException("Result is null"));
            }
        } else {
            ((InterfaceC73573Su9) agS124S0100000_7.l0).onError(new IllegalStateException("Result is null"));
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object then$30(AgS124S0100000_7 agS124S0100000_7, C10K c10k) {
        boolean z;
        Boolean lat;
        C54293LSn c54293LSn = C235779Nd.LIZ;
        if (c54293LSn.LJJI == null) {
            c54293LSn.LJJI = new C36821Ecj<>("opt_out_google_personzalized_ads", Boolean.FALSE);
        }
        c54293LSn.LJJI.LIZLLL(c10k.LJIIJJI());
        Object LJIIJJI = c10k.LJIIJJI();
        kotlin.jvm.internal.o.LJIIIIZZ(LJIIJJI, "it.result");
        boolean booleanValue = ((Boolean) LJIIJJI).booleanValue();
        AdPersonalitySettings LIZIZ = C41290GIk.LIZIZ();
        if (LIZIZ != null && (lat = LIZIZ.getLat()) != null) {
            z = lat.booleanValue();
        } else {
            z = false;
        }
        if (booleanValue != z) {
            IComplianceSettingsService LIZLLL = C41290GIk.LIZLLL();
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(new JSONObject().put("field", "limit_ad_tracking").put("value", String.valueOf(booleanValue)));
            String jSONArray2 = jSONArray.toString();
            kotlin.jvm.internal.o.LJIIIIZZ(jSONArray2, "JSONArray().apply {\n    …toString())) }.toString()");
            LIZLLL.LJIILL(jSONArray2, new C41284GIe(booleanValue));
        }
        GJ8 gj8 = (GJ8) agS124S0100000_7.l0;
        if (gj8 != null) {
            Object LJIIJJI2 = c10k.LJIIJJI();
            kotlin.jvm.internal.o.LJIIIIZZ(LJIIJJI2, "it.result");
            gj8.LIZ(((Boolean) LJIIJJI2).booleanValue());
            return null;
        }
        return null;
    }

    public static final Object then$31(AgS124S0100000_7 agS124S0100000_7, C10K c10k) {
        if (!C82544WaS.LJ(c10k)) {
            return null;
        }
        AuthDeviceResponse authDeviceResponse = (AuthDeviceResponse) c10k.LJIIJJI();
        if (!ujb.o.LJJJJIZL("success", authDeviceResponse.getMessage(), true) || authDeviceResponse.getData() == null) {
            return null;
        }
        ((TwoStepVerificationManageActivity) agS124S0100000_7.l0).LJLJLLL = authDeviceResponse;
        return C76800UCe.LIZ;
    }

    public static final Object then$32(AgS124S0100000_7 agS124S0100000_7, C10K c10k) {
        if (!C82544WaS.LJ(c10k)) {
            return null;
        }
        AuthDeviceResponse authDeviceResponse = (AuthDeviceResponse) c10k.LJIIJJI();
        if (!ujb.o.LJJJJIZL("success", authDeviceResponse.getMessage(), true) || authDeviceResponse.getData() == null) {
            return null;
        }
        ((TwoStepVerificationActivityViewModel) agS124S0100000_7.l0).LJLJJI.setAuthDeviceListStatus(authDeviceResponse);
        return C76800UCe.LIZ;
    }

    public static final Object then$33(AgS124S0100000_7 agS124S0100000_7, C10K c10k) {
        boolean z = true;
        if (((C45405Hrt) c10k.LJIIJJI()).LIZ != 1) {
            z = false;
        }
        if (z) {
            CompletionBlock completionBlock = (CompletionBlock) agS124S0100000_7.l0;
            XBaseModel LIZJ = ED5.LIZJ(InterfaceC45408Hrw.class, null);
            ((InterfaceC45408Hrw) LIZJ).setFilePath(((C45405Hrt) c10k.LJIIJJI()).LIZJ);
            completionBlock.onSuccess((XBaseResultModel) LIZJ, "");
        } else {
            C31626Cb8.LIZ((CompletionBlock) agS124S0100000_7.l0, -1, ((C45405Hrt) c10k.LJIIJJI()).LIZIZ, 4);
        }
        return null;
    }

    public static final Object then$34(AgS124S0100000_7 agS124S0100000_7, C10K c10k) {
        IAVInfoService.IGetInfoCallback iGetInfoCallback = (IAVInfoService.IGetInfoCallback) agS124S0100000_7.l0;
        if (iGetInfoCallback != null) {
            Object LJIIJJI = c10k.LJIIJJI();
            kotlin.jvm.internal.o.LJIIIIZZ(LJIIJJI, "it.result");
            iGetInfoCallback.finish(LJIIJJI);
            return C76800UCe.LIZ;
        }
        return null;
    }

    public static final Object then$35(AgS124S0100000_7 agS124S0100000_7, C10K c10k) {
        IAVInfoService.IGetInfoCallback iGetInfoCallback = (IAVInfoService.IGetInfoCallback) agS124S0100000_7.l0;
        if (iGetInfoCallback != null) {
            Object LJIIJJI = c10k.LJIIJJI();
            kotlin.jvm.internal.o.LJIIIIZZ(LJIIJJI, "it.result");
            iGetInfoCallback.finish(LJIIJJI);
            return C76800UCe.LIZ;
        }
        return null;
    }

    public static final Object then$4(AgS124S0100000_7 agS124S0100000_7, C10K c10k) {
        int i;
        AnchorPublishStruct anchorPublishStruct = (AnchorPublishStruct) agS124S0100000_7.l0;
        Integer num = ((GetLeadsAnchorPublishResp) c10k.LJIIJJI()).anchor_status;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 1;
        }
        anchorPublishStruct.getLeadsAnchorState = i;
        ((AnchorPublishStruct) agS124S0100000_7.l0).getLeadsPageId = ((GetLeadsAnchorPublishResp) c10k.LJIIJJI()).pageId;
        return C76800UCe.LIZ;
    }

    public static final Object then$5(AgS124S0100000_7 agS124S0100000_7, C10K c10k) {
        if (((BAProductAnchorStateApi.ProductLinkStateResponse) c10k.LJIIJJI()).getStatusCode() == 0) {
            ((AnchorPublishStruct) agS124S0100000_7.l0).baProductLinkState = ((BAProductAnchorStateApi.ProductLinkStateResponse) c10k.LJIIJJI()).getLinkStatus();
            AnchorPublishStruct anchorPublishStruct = (AnchorPublishStruct) agS124S0100000_7.l0;
            boolean z = false;
            if (!BAProductAnchorStateApi.LIZ.getBoolean("clicked", false) && ((AnchorPublishStruct) agS124S0100000_7.l0).baProductLinkState == 5) {
                z = true;
            }
            anchorPublishStruct.isNew = z;
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$6(AgS124S0100000_7 agS124S0100000_7, C10K c10k) {
        Integer num;
        String str;
        String str2;
        if (!C82544WaS.LJ(c10k)) {
            ((AuthorizedDeviceActivity) agS124S0100000_7.l0).LLFZ();
            ((AuthorizedDeviceActivity) agS124S0100000_7.l0).LLFII(null, "");
            return null;
        }
        AuthDeviceResponse authDeviceResponse = (AuthDeviceResponse) c10k.LJIIJJI();
        if (!ujb.o.LJJJJIZL("success", authDeviceResponse.getMessage(), true) || authDeviceResponse.getData() == null) {
            AuthDeviceResponse.Data data = authDeviceResponse.getData();
            if (data != null) {
                num = data.getErrorCode();
            } else {
                num = null;
            }
            AuthDeviceResponse.Data data2 = authDeviceResponse.getData();
            if (data2 != null) {
                str = data2.getErrorDescription();
            } else {
                str = null;
            }
            ((AuthorizedDeviceActivity) agS124S0100000_7.l0).LLFZ();
            ((AuthorizedDeviceActivity) agS124S0100000_7.l0).LLFII(num, str);
            return null;
        }
        List<Device> auth_device = authDeviceResponse.getData().getAuth_device();
        if (auth_device == null || auth_device.size() <= 0) {
            ((AuthorizedDeviceActivity) agS124S0100000_7.l0).LLFZ();
            return null;
        }
        List<Device> auth_device2 = authDeviceResponse.getData().getAuth_device();
        kotlin.jvm.internal.o.LJI(auth_device2);
        List LLJILJILJ = ORZ.LLJILJILJ(auth_device2);
        ArrayList arrayList = (ArrayList) LLJILJILJ;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Long device_id = ((Device) next).getDevice_id();
            if (device_id != null) {
                str2 = device_id.toString();
            } else {
                str2 = null;
            }
            if (kotlin.jvm.internal.o.LJ(str2, DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId())) {
                if (next != null) {
                    arrayList.remove(next);
                    ListProtector.add(LLJILJILJ, 0, next);
                }
            }
        }
        String enterFrom = (String) ((AuthorizedDeviceActivity) agS124S0100000_7.l0).LJLIL.getValue();
        kotlin.jvm.internal.o.LJIIIIZZ(enterFrom, "enterFrom");
        C85144XbI.LJJIIJ(arrayList.size(), enterFrom);
        ((C73305Spp) ((AuthorizedDeviceActivity) agS124S0100000_7.l0)._$_findCachedViewById(R.id.keh)).setVisibility(8);
        ((AuthorizedDeviceActivity) agS124S0100000_7.l0)._$_findCachedViewById(R.id.j9c).setVisibility(0);
        RecyclerView recyclerView = (RecyclerView) ((AuthorizedDeviceActivity) agS124S0100000_7.l0)._$_findCachedViewById(R.id.j9c);
        AuthorizedDeviceActivity authorizedDeviceActivity = (AuthorizedDeviceActivity) agS124S0100000_7.l0;
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(new GJZ(LLJILJILJ, new GHU(authorizedDeviceActivity)));
        return recyclerView;
    }

    public static final Object then$7(AgS124S0100000_7 agS124S0100000_7, C10K c10k) {
        String str;
        boolean z;
        Collection<AnchorPublishStruct> values;
        boolean z2;
        String str2;
        Collection values2;
        AnchorListResp anchorListResp = (AnchorListResp) c10k.LJIIJJI();
        if (anchorListResp != null) {
            InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) agS124S0100000_7.l0;
            if (anchorListResp.statusCode == 0) {
                AnchorListManager.LJ = true;
                String str3 = anchorListResp.registerRegion;
                List<AnchorPublishStruct> list = anchorListResp.anchorList;
                Map LJI = AnchorListManager.LJI();
                C188727au c188727au = new C188727au();
                String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
                if (curUserId == null) {
                    curUserId = "";
                }
                c188727au.LJIIIZ("author_id", curUserId);
                c188727au.LJIIIZ("region", str3);
                if (list != null) {
                    str = ORZ.LLD(list, ",", null, null, C42793Gqr.LJLIL, 30);
                } else {
                    str = null;
                }
                c188727au.LJIIIZ("anchor_types", str);
                c188727au.LJIIIZ("traceparent", PII.LIZIZ());
                FMX.LJIIL("tiktokec_video_add_link_request", c188727au.LIZ);
                if (list != null) {
                    for (AnchorPublishStruct anchorPublishStruct : list) {
                        if (anchorPublishStruct.type == EnumC42934Gt8.ANCHOR_SHOP_WINDOW.getTYPE() || anchorPublishStruct.type == EnumC42934Gt8.ANCHOR_SHOP_LINK.getTYPE() || anchorPublishStruct.type == EnumC42934Gt8.ANCHOR_SHOP_MIX.getTYPE()) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                if (z) {
                    IECommerceAnchorService LJJJJI = ECommerceAnchorService.LJJJJI();
                    c188727au.LJFF(Boolean.TRUE, "has_shop_anchor");
                    if (LJI != null && (values2 = LJI.values()) != null) {
                        str2 = ORZ.LLD(values2, ",", null, null, C42792Gqq.LJLIL, 30);
                    } else {
                        str2 = null;
                    }
                    c188727au.LJIIIZ("last_anchor_types", str2);
                    Map<String, String> map = c188727au.LIZ;
                    kotlin.jvm.internal.o.LJIIIIZZ(map, "eventMapBuilder\n        …               .builder()");
                    LJJJJI.LJJJI(null, null, C113554cx.LJJLIL(map));
                } else if (LJI != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : LJI.entrySet()) {
                        if (((AnchorPublishStruct) entry.getValue()).type == EnumC42934Gt8.ANCHOR_SHOP_WINDOW.getTYPE() || ((AnchorPublishStruct) entry.getValue()).type == EnumC42934Gt8.ANCHOR_SHOP_LINK.getTYPE() || ((AnchorPublishStruct) entry.getValue()).type == EnumC42934Gt8.ANCHOR_SHOP_MIX.getTYPE()) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    if (!linkedHashMap.isEmpty()) {
                        IECommerceAnchorService LJJJJI2 = ECommerceAnchorService.LJJJJI();
                        c188727au.LJFF(Boolean.TRUE, "last_has_shop_anchor");
                        c188727au.LJFF(Boolean.FALSE, "has_shop_anchor");
                        Map<String, String> map2 = c188727au.LIZ;
                        kotlin.jvm.internal.o.LJIIIIZZ(map2, "eventMapBuilder\n        …               .builder()");
                        LJJJJI2.LJJJI(1001, "No ecommerce anchor info but last has.", C113554cx.LJJLIL(map2));
                    }
                }
                List<AnchorPublishStruct> list2 = anchorListResp.anchorList;
                if (list2 == null) {
                    Map LJI2 = AnchorListManager.LJI();
                    if (LJI2 != null) {
                        LJI2.clear();
                    }
                } else {
                    ArrayList arrayList = new ArrayList(C32I.LJJL(list2, 10));
                    for (AnchorPublishStruct anchorPublishStruct2 : list2) {
                        arrayList.add(new OSZ(AnchorListManager.LIZLLL(anchorPublishStruct2), anchorPublishStruct2));
                    }
                    Map<String, AnchorPublishStruct> LIZJ = C65777Prh.LIZJ(C113554cx.LJJLIIIJLJLI(arrayList));
                    if (!C211898Th.LIZ()) {
                        ORS.LJJLIIJ(LIZJ.values(), C42790Gqo.LJLIL);
                    }
                    AnchorListManager.LJIIIZ = LIZJ;
                    C10K.LIZJ(CallableC42918Gss.LJLIL);
                }
                AnchorListManager.LJFF = anchorListResp.registerRegion;
                AnchorListManager.LJIIIIZZ(AnchorListManager.LJI());
                AnchorListManager.LJIIJ(AnchorListManager.LJI());
                BAGetLeadsAnchorStateApi.LIZ(AnchorListManager.LJI());
                BAProductAnchorStateApi.LIZ(AnchorListManager.LJI());
                Map LJI3 = AnchorListManager.LJI();
                if (LJI3 != null && (values = LJI3.values()) != null) {
                    for (AnchorPublishStruct anchorPublishStruct3 : values) {
                        if (EnumC42934Gt8.MUSIC_PLAYLIST.getTYPE() == anchorPublishStruct3.type && kotlin.jvm.internal.o.LJ(anchorPublishStruct3.subtype, "resso_playlist")) {
                            try {
                                z2 = ((AnchorPlaylistInfo) GsonHolder.LIZLLL().LIZ().LJI(anchorPublishStruct3.content, AnchorPlaylistInfo.class)).isAuthorized();
                            } catch (Exception unused) {
                                z2 = false;
                            }
                            String LIZ = C243939hl.LIZ("music_resso_%s");
                            if (LIZ.length() != 0) {
                                C243939hl.LIZ.storeBoolean(LIZ, z2);
                            }
                            C243939hl.LIZIZ("");
                        }
                    }
                }
                if (interfaceC65784Pro != null) {
                    interfaceC65784Pro.invoke();
                }
                C10K.LIZJ(CallableC42917Gsr.LJLIL);
            } else {
                if (interfaceC65784Pro != null) {
                    interfaceC65784Pro.invoke();
                }
                C36922EeM.LIZLLL(2, "anchor_reverse", "Fetch from API FAILED!");
            }
        } else {
            InterfaceC65784Pro interfaceC65784Pro2 = (InterfaceC65784Pro) agS124S0100000_7.l0;
            if (interfaceC65784Pro2 != null) {
                interfaceC65784Pro2.invoke();
            }
        }
        return null;
    }

    public static final Object then$8(AgS124S0100000_7 agS124S0100000_7, C10K c10k) {
        List<AutoCutMediaModel> list;
        AutoCutModel autoCutModel = ((C45054HmE) agS124S0100000_7.l0).LLJLIL().creativeModel.autoCutModel;
        C44704Hga c44704Hga = (C44704Hga) c10k.LJIIJJI();
        if (c44704Hga != null) {
            list = c44704Hga.LIZ;
        } else {
            list = null;
        }
        autoCutModel.curMediaList = AnonymousClass636.LJ(list);
        return C76800UCe.LIZ;
    }

    public static final Object then$9(AgS124S0100000_7 agS124S0100000_7, C10K c10k) {
        VEMediaParserProviderV2 vEMediaParserProviderV2 = (VEMediaParserProviderV2) agS124S0100000_7.l0;
        vEMediaParserProviderV2.LJLJI.execute(new RunnableC42347Gjf(vEMediaParserProviderV2));
        return C76800UCe.LIZ;
    }

    public AgS124S0100000_7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
