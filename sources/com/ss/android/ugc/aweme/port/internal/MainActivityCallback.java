package com.ss.android.ugc.aweme.port.internal;

import X.ActivityC45651qj;
import X.AnonymousClass114;
import X.C10K;
import X.C188727au;
import X.C198517qh;
import X.C247839o3;
import X.C26045AKb;
import X.C2U8;
import X.C31811Ce7;
import X.C36922EeM;
import X.C40359Fsh;
import X.C41759GaB;
import X.C42249Gi5;
import X.C43693HCv;
import X.C43694HCw;
import X.C43696HCy;
import X.C78983UzD;
import X.C7MY;
import X.C9X3;
import X.FMX;
import X.FUA;
import X.H7B;
import X.HG3;
import X.InterfaceC41605GUn;
import X.InterfaceC42037Gef;
import X.OQN;
import X.OSZ;
import X.RBX;
import X.UPJ;
import X.X1D;
import X.Z89;
import X.Z9N;
import Y.ACallableS77S0101000_4;
import Y.ARunnableS11S0400000_7;
import Y.AgS41S1200000_7;
import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.ability.ToolsMainActivityAbility;
import com.ss.android.ugc.aweme.account.profilebadge.ProfileBadgeServiceImpl;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.service.PoiServiceImpl;
import com.ss.android.ugc.aweme.port.internal.MainActivityCallback;
import com.ss.android.ugc.aweme.services.publish.Publish;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.services.video.VideoExposureData;
import com.ss.android.ugc.aweme.servicimpl.CreativePageService;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.PublishExtensionModel;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.shoutouts.ShoutOutsData;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import yq4.a;

/* loaded from: classes8.dex */
public class MainActivityCallback implements GenericLifecycleObserver, InterfaceC41605GUn {
    public InterfaceC42037Gef LJLIL;
    public C43693HCv LJLILLLLZI;
    public final IAVPublishService LJLJI;
    public final PublishModel LJLJJI;
    public final boolean LJLJJL;
    public final C43696HCy LJLJJLL;
    public final ActivityC45651qj LJLJL;

    public MainActivityCallback() {
        throw null;
    }

    @Override // X.InterfaceC41605GUn
    public final void J6(String str) {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // X.InterfaceC41605GUn
    public final void w8() {
        Publish.isInPublish = false;
        LIZ("onCancel");
        if (this.LJLILLLLZI != null && this.LJLIL != null) {
            LIZ("mPublishCallback onCancel");
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        if (CreativePageService.LIZ().isPublishPage(this.LJLJL)) {
            return;
        }
        InterfaceC42037Gef interfaceC42037Gef = this.LJLIL;
        if (interfaceC42037Gef != null) {
            interfaceC42037Gef.LIZJ(this);
        }
        this.LJLIL = null;
        this.LJLILLLLZI = null;
    }

    public final void LIZ(String str) {
        H7B.LIZIZ("MainActivityCallback", str);
    }

    public MainActivityCallback(PublishModel publishModel, String str) {
        this.LJLJJLL = new C43696HCy();
        this.LJLJJI = publishModel;
        this.LJLILLLLZI = new C43693HCv();
        String str2 = publishModel.creationId;
        C43694HCw c43694HCw = new C43694HCw();
        c43694HCw.LJLLJ = str2;
        C2U8.LIZ(c43694HCw);
        this.LJLJI = AVExternalServiceImpl.LIZ().publishService();
        this.LJLIL = new C42249Gi5(this, str, publishModel);
    }

    @Override // X.InterfaceC41605GUn
    public final void U9(int i, boolean z) {
        if (OQN.LJIIIZ(this.LJLJJI)) {
            Z89.LIZIZ.onPublishProgress(i, this.LJLJJI);
        }
    }

    @Override // X.InterfaceC41605GUn
    public final void Z3(C41759GaB c41759GaB, PublishModel publishModel) {
        InterfaceC42037Gef interfaceC42037Gef;
        Publish.isInPublish = false;
        LIZ("onError");
        PublishModel publishModel2 = this.LJLJJI;
        if (publishModel != null) {
            publishModel2 = publishModel;
        }
        if (publishModel2 != null && OQN.LJIIIZ(publishModel2)) {
            Z89.LIZIZ.LJIJJLI(c41759GaB, publishModel);
        } else if (this.LJLILLLLZI != null && (interfaceC42037Gef = this.LJLIL) != null) {
            BaseShortVideoContext args = interfaceC42037Gef.getArgs();
            if (publishModel != null) {
                args = publishModel.editModel;
            }
            C43693HCv c43693HCv = this.LJLILLLLZI;
            int LIZLLL = this.LJLIL.LIZLLL();
            c43693HCv.getClass();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onError ");
            LIZ.append(LIZLLL);
            LIZ.append(" and args is ");
            LIZ.append(args);
            C36922EeM.LJ(X1D.LIZIZ(LIZ));
            Activity LIZ2 = c43693HCv.LIZ();
            if (LIZ2 != null && !c41759GaB.isDiscard()) {
                C2U8.LIZ(new C40359Fsh(null, 1));
                String errorMsg = AVExternalServiceImpl.LIZ().publishService().getErrorMsg(LIZ2, c41759GaB, LIZ2.getString(R.string.piq));
                OSZ<Boolean, String> retrieveServerErrorInfo = c41759GaB.retrieveServerErrorInfo();
                C43694HCw c43694HCw = new C43694HCw(null, 9, 99, errorMsg);
                c43694HCw.LJLJJLL = c41759GaB;
                c43694HCw.LJLJJL = c41759GaB.isRecover();
                c43694HCw.LJLJL = retrieveServerErrorInfo.getFirst().booleanValue();
                c43694HCw.LJLLILLLL = publishModel;
                if (c43693HCv.LIZIZ().booleanValue()) {
                    c43694HCw.LJLL = true;
                }
                if (args instanceof BaseShortVideoContext) {
                    c43694HCw.LJLLI = args.getDraftPrimaryKey();
                    c43694HCw.LJLLJ = args.getCreationId();
                }
                C2U8.LIZIZ(c43694HCw);
                if (!c43693HCv.LIZIZ().booleanValue() && c43693HCv.LIZJ(args).booleanValue() && !a.LJ().LJ(1)) {
                    C31811Ce7.LIZIZ(LIZ2, errorMsg);
                }
            }
            LIZ("mPublishCallback onError");
        }
        InterfaceC42037Gef interfaceC42037Gef2 = this.LJLIL;
        if (interfaceC42037Gef2 != null) {
            interfaceC42037Gef2.LIZJ(this);
        }
        this.LJLIL = null;
        this.LJLILLLLZI = null;
    }

    public MainActivityCallback(ActivityC45651qj activityC45651qj, String str, boolean z) {
        this(activityC45651qj, str, false, Boolean.FALSE);
    }

    @Override // X.InterfaceC41605GUn
    public final void K6(CreateBaseAwemeResponse createBaseAwemeResponse, boolean z, PublishModel publishModel) {
        C40359Fsh c40359Fsh;
        String creationId;
        Aweme aweme;
        String outPutFile;
        CreateAwemeResponse createAwemeResponse;
        Aweme aweme2;
        Aweme aweme3;
        String videoCoverPath;
        Publish.isInPublish = false;
        LIZ("onSuccess");
        if (this.LJLILLLLZI != null && (createBaseAwemeResponse instanceof CreateAwemeResponse) && this.LJLIL != null) {
            CreateAwemeResponse createAwemeResponse2 = (CreateAwemeResponse) createBaseAwemeResponse;
            if (createAwemeResponse2 != null && (aweme3 = createAwemeResponse2.aweme) != null && aweme3.getVideo() != null && (videoCoverPath = createAwemeResponse2.getVideoCoverPath()) != null) {
                Aweme aweme4 = createAwemeResponse2.aweme;
                ArrayList arrayList = new ArrayList();
                arrayList.add(Uri.fromFile(new File(videoCoverPath)).toString());
                Video video = aweme4.getVideo();
                if (video != null) {
                    if (video.getCover() != null) {
                        video.getCover().setUrlList(arrayList);
                    }
                    if (video.getDynamicCover() != null) {
                        video.getDynamicCover().setUrlList(arrayList);
                    }
                    C43696HCy c43696HCy = this.LJLJJLL;
                    String aid = aweme4.getAid();
                    c43696HCy.getClass();
                    if (aid != null) {
                        c43696HCy.LIZ.storeString(aid, videoCoverPath);
                    }
                }
            }
            BaseShortVideoContext videoEditModel = this.LJLIL.getArgs();
            if (publishModel != null) {
                videoEditModel = publishModel.editModel;
            }
            Z89 z89 = Z89.LIZIZ;
            if (z89.LIZIZ(createAwemeResponse2.aweme)) {
                z89.LJJ(publishModel, createAwemeResponse2, this.LJLJL);
                C2U8.LIZ(new IEvent() { // from class: X.2JF
                    @Override // com.ss.android.ugc.governance.eventbus.IEvent
                    public final /* synthetic */ IEvent post() {
                        C2U8.LIZ(this);
                        return this;
                    }

                    @Override // com.ss.android.ugc.governance.eventbus.IEvent
                    public final /* synthetic */ IEvent postSticky() {
                        C2U8.LIZIZ(this);
                        return this;
                    }
                });
            } else {
                C43693HCv c43693HCv = this.LJLILLLLZI;
                int LIZLLL = this.LJLIL.LIZLLL();
                c43693HCv.getClass();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onSuccess ");
                LIZ.append(LIZLLL);
                LIZ.append(" and response is ");
                LIZ.append(createBaseAwemeResponse.status_code);
                LIZ.append(" extra is ");
                LIZ.append(createBaseAwemeResponse.extra);
                C36922EeM.LJ(X1D.LIZIZ(LIZ));
                boolean z2 = createBaseAwemeResponse instanceof CreateAwemeResponse;
                if (z2 && (aweme2 = (createAwemeResponse = (CreateAwemeResponse) createBaseAwemeResponse).aweme) != null && aweme2.getVideo() != null) {
                    Video video2 = createAwemeResponse.aweme.getVideo();
                    if (video2.getWidth() == 0 && video2.getHeight() == 0) {
                        video2.setWidth(createBaseAwemeResponse.realVideoWidth);
                        video2.setHeight(createBaseAwemeResponse.realVideoHeight);
                    }
                }
                ARunnableS11S0400000_7 aRunnableS11S0400000_7 = new ARunnableS11S0400000_7(c43693HCv, createBaseAwemeResponse, LIZLLL, videoEditModel, publishModel, 3);
                String str = "";
                if (LIZLLL == 0) {
                    VideoExposureData convertToExposureData = AVExternalServiceImpl.LIZ().infoService().convertToExposureData(videoEditModel);
                    if (convertToExposureData == null) {
                        outPutFile = "";
                    } else {
                        outPutFile = convertToExposureData.getOutPutFile();
                    }
                    C10K.LIZJ(new ACallableS77S0101000_4(outPutFile, 0, 0)).LJ(new AgS41S1200000_7(createBaseAwemeResponse, aRunnableS11S0400000_7, outPutFile, 2), C10K.LJIIIIZZ, null);
                } else {
                    aRunnableS11S0400000_7.run();
                }
                if (z2) {
                    c40359Fsh = new C40359Fsh(((CreateAwemeResponse) createBaseAwemeResponse).aweme, 2);
                } else {
                    c40359Fsh = new C40359Fsh(null, 2);
                }
                boolean z3 = videoEditModel instanceof BaseShortVideoContext;
                if (z2) {
                    if (((CreateAwemeResponse) createBaseAwemeResponse).isReviewVideo != 1) {
                        if (z2) {
                        }
                    }
                    if (((CreateAwemeResponse) createBaseAwemeResponse).hasStickerRedPacket) {
                    }
                }
                C2U8.LIZIZ(c40359Fsh);
                if (z2 && (aweme = ((CreateAwemeResponse) createBaseAwemeResponse).aweme) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    List<AnchorCommonStruct> anchors = aweme.getAnchors();
                    if (anchors != null) {
                        for (AnchorCommonStruct anchorCommonStruct : anchors) {
                            if (anchorCommonStruct != null) {
                                if (!new JSONObject(anchorCommonStruct.getExtra()).optBoolean("mobile_effect_type")) {
                                }
                            }
                            arrayList2.add(anchorCommonStruct);
                        }
                    }
                    aweme.setAnchors(arrayList2);
                }
                Activity LIZ2 = c43693HCv.LIZ();
                int i = createBaseAwemeResponse.shoutOutsType;
                if (i == 1 || i == 2) {
                    if (LIZ2 != null) {
                        AnonymousClass114.LIZ(LIZ2, R.string.seu);
                    }
                    C188727au c188727au = new C188727au();
                    ShoutOutsData shoutOutsData = createBaseAwemeResponse.shoutoutData;
                    if (shoutOutsData != null && !shoutOutsData.getShoutOutsMode().equals(ShoutOutsData.MODE_SEND)) {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("shoutouts_edit_post_success_time_");
                        String LJ = UPJ.LJ((RBX) HG3.LJIILL(), LIZ3, LIZ3);
                        C247839o3 c247839o3 = C9X3.LIZ;
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append(System.currentTimeMillis());
                        LIZ4.append("");
                        c247839o3.LJ(LJ, X1D.LIZIZ(LIZ4));
                    }
                    ShoutOutsData shoutOutsData2 = createBaseAwemeResponse.shoutoutData;
                    if (shoutOutsData2 != null) {
                        c188727au.LIZLLL(shoutOutsData2.getReviewed(), "reviewed");
                        if (!TextUtils.isEmpty(createBaseAwemeResponse.shoutoutData.getOrderId())) {
                            c188727au.LJI("enter_from", "video_edit_page");
                            c188727au.LJI("order_id", createBaseAwemeResponse.shoutoutData.getOrderId());
                        } else {
                            c188727au.LJI("enter_from", "shoutouts_post_page");
                        }
                        FMX.LJIIL("show_review_remind_pop_up", c188727au.LIZ);
                    }
                }
                if (z2 && ((CreateAwemeResponse) createBaseAwemeResponse).aweme == null) {
                    C198517qh c198517qh = new C198517qh();
                    StringBuilder LJ2 = C7MY.LJ("videoType:", LIZLLL, "response: ");
                    LJ2.append(createBaseAwemeResponse.status_code);
                    LJ2.append(" ");
                    LJ2.append(createBaseAwemeResponse.extra);
                    c198517qh.LIZ.put("user_info", X1D.LIZIZ(LJ2));
                    FUA.LIZJ("aweme_publish_error", c198517qh.LJ());
                }
                if (z3) {
                    o.LJIIIZ(videoEditModel, "videoEditModel");
                    if (((VideoPublishEditModel) videoEditModel).getStructList() != null) {
                        o.LJIIIIZZ(AVExternalServiceImpl.LIZ().publishService().resolveHashtagNamesInCaption(videoEditModel), "get().getService(IExtern…InCaption(videoEditModel)");
                    }
                }
                if (LIZLLL == 0 || LIZLLL == 11) {
                    VideoExposureData convertToExposureData2 = AVExternalServiceImpl.LIZ().infoService().convertToExposureData(videoEditModel);
                    Object obj = new Object();
                    if (z2) {
                        obj = ((CreateAwemeResponse) createBaseAwemeResponse).aweme;
                    }
                    C43694HCw c43694HCw = new C43694HCw(obj, 10, 100, null);
                    c43694HCw.LJLJLLL = videoEditModel.excludeUserList;
                    c43694HCw.LJLJLJ = createBaseAwemeResponse;
                    if (convertToExposureData2 != null) {
                        convertToExposureData2.getShootWay();
                    }
                    c43694HCw.LJLLILLLL = publishModel;
                    if (c43693HCv.LIZIZ().booleanValue()) {
                        C2U8.LIZIZ(c43694HCw);
                    } else {
                        C2U8.LIZIZ(c43694HCw);
                        Activity LIZ5 = c43693HCv.LIZ();
                        if (c43693HCv.LIZJ(videoEditModel).booleanValue() && !c43693HCv.LIZJ.booleanValue() && LIZ5 != null) {
                            AnonymousClass114.LIZ(LIZ5, R.string.thf);
                        }
                    }
                    if (z2) {
                        C188727au c188727au2 = new C188727au();
                        if (convertToExposureData2 == null) {
                            creationId = "";
                        } else {
                            creationId = convertToExposureData2.getCreationId();
                        }
                        c188727au2.LJIIIZ("creation_id", creationId);
                        Aweme aweme5 = ((CreateAwemeResponse) createBaseAwemeResponse).aweme;
                        if (aweme5 != null) {
                            str = aweme5.getAid();
                        }
                        c188727au2.LJIIIZ("group_id", str);
                        FMX.LJIIL("video_publish_done", c188727au2.LIZ);
                    }
                }
                ProfileBadgeServiceImpl.createIProfileBadgeServicebyMonsterPlugin(false).refresh();
            }
        }
        InterfaceC42037Gef interfaceC42037Gef = this.LJLIL;
        if (interfaceC42037Gef != null) {
            interfaceC42037Gef.LIZJ(this);
        }
        this.LJLIL = null;
        this.LJLILLLLZI = null;
    }

    public MainActivityCallback(final ActivityC45651qj activityC45651qj, final String str, final boolean z, final Boolean bool) {
        this.LJLJJLL = new C43696HCy();
        IAVPublishService publishService = AVExternalServiceImpl.LIZ().publishService();
        this.LJLJI = publishService;
        final boolean LJJLIIIJ = Z9N.LIZIZ.LJJLIIIJ();
        final boolean enableFloatingProgress = publishService.enableFloatingProgress();
        PublishModel publishModel = publishService.getPublishModel(str);
        this.LJLJJI = publishModel;
        if (publishModel == null) {
            C26045AKb c26045AKb = new C26045AKb(activityC45651qj);
            c26045AKb.LJIIIIZZ(R.string.g8t);
            c26045AKb.LJIIJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("MainActivityCallback getPublishModelFailed publishId:");
            LIZ.append(str);
            String LIZIZ = X1D.LIZIZ(LIZ);
            H7B.LIZJ(LIZIZ);
            C78983UzD.LJIILL(LIZIZ);
            return;
        }
        if (!publishService.tryRegisterHomePageUICallback(activityC45651qj, str)) {
            return;
        }
        this.LJLJJL = true;
        this.LJLJL = activityC45651qj;
        activityC45651qj.runOnUiThread(new Runnable() { // from class: X.HCu
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC45651qj LIZ2;
                MainActivityCallback mainActivityCallback = MainActivityCallback.this;
                String str2 = str;
                boolean z2 = LJJLIIIJ;
                Boolean bool2 = bool;
                boolean z3 = enableFloatingProgress;
                ActivityC45651qj activity = activityC45651qj;
                boolean z4 = z;
                mainActivityCallback.getClass();
                C42250Gi6 c42250Gi6 = new C42250Gi6(mainActivityCallback, str2);
                mainActivityCallback.LJLIL = c42250Gi6;
                if (!z2 && !bool2.booleanValue() && !z3) {
                    activity.getLifecycle().addObserver(mainActivityCallback);
                    c42250Gi6.LJI(mainActivityCallback);
                    mainActivityCallback.LJLILLLLZI = new C43693HCv(activity);
                    String str3 = mainActivityCallback.LJLJJI.creationId;
                    C43694HCw c43694HCw = new C43694HCw();
                    c43694HCw.LJLLJ = str3;
                    C2U8.LIZ(c43694HCw);
                }
                if (PoiServiceImpl.LIZIZ().LJI()) {
                    PublishModel publishModel2 = mainActivityCallback.LJLJJI;
                    if (publishModel2.publishPermission != 1) {
                        try {
                            PoiData poiData = PublishExtensionModel.fromContext(publishModel2.editModel).poiData;
                            if (poiData != null) {
                                C2U8.LIZIZ(new C43695HCx(poiData));
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
                if (OQN.LJIIIZ(mainActivityCallback.LJLJJI)) {
                    String str4 = mainActivityCallback.LJLJJI.publishId;
                    if (str4 == null || str4.isEmpty()) {
                        PublishModel publishModel3 = mainActivityCallback.LJLJJI;
                        publishModel3.getClass();
                        o.LJIIIZ(str2, "<set-?>");
                        publishModel3.publishId = str2;
                    }
                    C2U8.LIZ(new C41668GWy());
                    Publish.isNeedProcessPublish = false;
                    Z89.LIZIZ.LJJI(mainActivityCallback.LJLJJI, z4);
                    Publish.isInPublish = true;
                    if (!(activity instanceof MainActivity) && (LIZ2 = FQY.LIZ()) != null) {
                        activity.getLifecycle().removeObserver(mainActivityCallback);
                        LIZ2.getLifecycle().addObserver(mainActivityCallback);
                    }
                } else if (activity instanceof MainActivity) {
                    o.LJIIIZ(activity, "activity");
                    ToolsMainActivityAbility toolsMainActivityAbility = (ToolsMainActivityAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(activity, null), ToolsMainActivityAbility.class, null);
                    if (toolsMainActivityAbility != null) {
                        toolsMainActivityAbility.Lm(c42250Gi6, c42250Gi6.getArgs(), str2, mainActivityCallback.LJLJJI, bool2.booleanValue());
                    }
                }
                mainActivityCallback.LIZ("VideoPublishBinder initialize finish.");
            }
        });
    }
}
