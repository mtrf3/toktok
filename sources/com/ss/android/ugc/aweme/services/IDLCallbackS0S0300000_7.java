package com.ss.android.ugc.aweme.services;

import X.ActivityC45651qj;
import X.C145995oB;
import X.C34K;
import X.C42398GkU;
import X.C44066HRe;
import X.C45804HyK;
import X.C47261Igj;
import X.C58604MzI;
import X.C68322mC;
import X.C77357UXp;
import X.C78866UxK;
import X.FMX;
import X.HB8;
import X.HB9;
import X.HUJ;
import X.IAX;
import X.InterfaceC88472Yns;
import X.KHJ;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.bullet.bridge.common.ShareOpenPlatformMethod;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.publishtab.PublishTabAbility;
import com.ss.android.ugc.aweme.main.CreativityToolsPluginUpdater;
import com.ss.android.ugc.aweme.main.bottomobserver.BottomPublishObserver;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.services.external.ui.DuetConfig;
import com.ss.android.ugc.aweme.services.external.ui.IRecordService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.jsb.comment.ExteriorRecordModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.vision.EComPhotoSearchServiceImpl;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchLogEnterParams;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class IDLCallbackS0S0300000_7 extends SimpleServiceLoadCallback {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback, com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onFailed() {
        switch (this.$t) {
            case 6:
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
            default:
                super.onLoad(asyncAVService, j);
                return;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback, com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onOK() {
        switch (this.$t) {
            case 0:
                onOK$0(this);
                return;
            default:
                super.onOK();
                return;
        }
    }

    public static final void onFailed$0(IDLCallbackS0S0300000_7 iDLCallbackS0S0300000_7) {
        ((C44066HRe) iDLCallbackS0S0300000_7.l2).LIZLLL();
    }

    public static final void onOK$0(IDLCallbackS0S0300000_7 iDLCallbackS0S0300000_7) {
        BottomPublishObserver bottomPublishObserver = (BottomPublishObserver) iDLCallbackS0S0300000_7.l1;
        if (bottomPublishObserver.LJLJJL == null) {
            bottomPublishObserver.LJLJJL = new CreativityToolsPluginUpdater();
        }
        CreativityToolsPluginUpdater creativityToolsPluginUpdater = bottomPublishObserver.LJLJJL;
        if (creativityToolsPluginUpdater != null) {
            creativityToolsPluginUpdater.LIZ();
        }
    }

    public static final void onLoad$0(IDLCallbackS0S0300000_7 iDLCallbackS0S0300000_7, AsyncAVService service, long j) {
        o.LJIIIZ(service, "service");
        PublishTabAbility publishTabAbility = (PublishTabAbility) iDLCallbackS0S0300000_7.l0;
        if (publishTabAbility != null && publishTabAbility.XE()) {
            if (o.LJ(((PublishTabAbility) iDLCallbackS0S0300000_7.l0).getResourceType(), "template")) {
                service.uiService().recordService().enterRecordPageInTemplate(((BottomPublishObserver) iDLCallbackS0S0300000_7.l1).LJLIL, ((RecordConfig.Builder) iDLCallbackS0S0300000_7.l2).build());
            } else {
                service.uiService().recordService().startSpecialPlusEntrance(((BottomPublishObserver) iDLCallbackS0S0300000_7.l1).LJLIL, ((RecordConfig.Builder) iDLCallbackS0S0300000_7.l2).build());
            }
            PublishTabAbility publishTabAbility2 = (PublishTabAbility) iDLCallbackS0S0300000_7.l0;
            if (publishTabAbility2 != null) {
                publishTabAbility2.OR();
            }
        } else {
            service.uiService().recordService().startRecord(((BottomPublishObserver) iDLCallbackS0S0300000_7.l1).LJLIL, ((RecordConfig.Builder) iDLCallbackS0S0300000_7.l2).build());
        }
        IAX.LIZ(((BottomPublishObserver) iDLCallbackS0S0300000_7.l1).LJLIL, "PUBLISH");
        C58604MzI.LIZIZ.openCamera();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onLoad$1(IDLCallbackS0S0300000_7 iDLCallbackS0S0300000_7, AsyncAVService service, long j) {
        MainActivityScope LJJLIIIJJI;
        PublishTabAbility LJJJJJL;
        o.LJIIIZ(service, "service");
        ActivityC45651qj LIZJ = ((ShareOpenPlatformMethod) iDLCallbackS0S0300000_7.l0).LIZJ((Context) iDLCallbackS0S0300000_7.l1);
        if (LIZJ != null && (LJJLIIIJJI = C78866UxK.LJJLIIIJJI(LIZJ)) != null && (LJJJJJL = C77357UXp.LJJJJJL(LJJLIIIJJI)) != null && LJJJJJL.XE()) {
            if (o.LJ(LJJJJJL.getResourceType(), "template")) {
                service.uiService().recordService().enterRecordPageInTemplate((Context) iDLCallbackS0S0300000_7.l1, ((RecordConfig.Builder) ((C68322mC) iDLCallbackS0S0300000_7.l2).element).build());
            } else {
                service.uiService().recordService().startSpecialPlusEntrance((Context) iDLCallbackS0S0300000_7.l1, ((RecordConfig.Builder) ((C68322mC) iDLCallbackS0S0300000_7.l2).element).build());
            }
            LJJJJJL.OR();
        } else {
            service.uiService().recordService().startRecord((Context) iDLCallbackS0S0300000_7.l1, ((RecordConfig.Builder) ((C68322mC) iDLCallbackS0S0300000_7.l2).element).build());
        }
        IAX.LIZ(C45804HyK.LJIJJ((Context) iDLCallbackS0S0300000_7.l1), "PUBLISH");
        C58604MzI.LIZIZ.openCamera();
    }

    public static final void onLoad$10(IDLCallbackS0S0300000_7 iDLCallbackS0S0300000_7, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord((Activity) iDLCallbackS0S0300000_7.l0, ((RecordConfig.Builder) iDLCallbackS0S0300000_7.l1).build(), (MusicModel) iDLCallbackS0S0300000_7.l2, false);
    }

    public static final void onLoad$11(IDLCallbackS0S0300000_7 iDLCallbackS0S0300000_7, AsyncAVService asyncAVService, long j) {
        C42398GkU.LIZ(asyncAVService, "service").startRecord((ActivityC45651qj) iDLCallbackS0S0300000_7.l0, (RecordConfig) iDLCallbackS0S0300000_7.l1, (MusicModel) iDLCallbackS0S0300000_7.l2, true);
    }

    public static final void onLoad$12(IDLCallbackS0S0300000_7 iDLCallbackS0S0300000_7, AsyncAVService asyncAVService, long j) {
        C42398GkU.LIZ(asyncAVService, "service").startRecord((Activity) iDLCallbackS0S0300000_7.l0, (RecordConfig) iDLCallbackS0S0300000_7.l1, (MusicModel) iDLCallbackS0S0300000_7.l2, true);
    }

    public static final void onLoad$13(IDLCallbackS0S0300000_7 iDLCallbackS0S0300000_7, AsyncAVService asyncAVService, long j) {
        C42398GkU.LIZ(asyncAVService, "service").startRecord((Activity) iDLCallbackS0S0300000_7.l0, (RecordConfig) iDLCallbackS0S0300000_7.l1, (MusicModel) iDLCallbackS0S0300000_7.l2, true);
    }

    public static final void onLoad$2(IDLCallbackS0S0300000_7 iDLCallbackS0S0300000_7, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord((Activity) iDLCallbackS0S0300000_7.l0, ((RecordConfig.Builder) iDLCallbackS0S0300000_7.l1).build(), (MusicModel) iDLCallbackS0S0300000_7.l2, false);
    }

    public static final void onLoad$3(IDLCallbackS0S0300000_7 iDLCallbackS0S0300000_7, AsyncAVService service, long j) {
        o.LJIIIZ(service, "service");
        String str = null;
        ExteriorRecordModel exteriorRecordModel = new ExteriorRecordModel(HB8.PHOTO_SEARCH, C47261Igj.LJJIJIIJI(HUJ.REVERSE, HUJ.FLASH), HB9.PHOTO, 0L, 0L, 0, 0, null, null, null, false, ((EComPhotoSearchServiceImpl) iDLCallbackS0S0300000_7.l0).LIZIZ);
        IRecordService recordService = service.uiService().recordService();
        Context context = (Context) iDLCallbackS0S0300000_7.l1;
        KHJ khj = ((EComPhotoSearchServiceImpl) iDLCallbackS0S0300000_7.l0).LJ;
        Bundle bundle = new Bundle();
        PhotoSearchLogEnterParams photoSearchLogEnterParams = (PhotoSearchLogEnterParams) iDLCallbackS0S0300000_7.l2;
        String str2 = null;
        if (photoSearchLogEnterParams != null) {
            str = photoSearchLogEnterParams.getSearchEntrance();
        }
        bundle.putString("search_entrance", str);
        if (photoSearchLogEnterParams != null) {
            str2 = photoSearchLogEnterParams.getCurrentPage();
        }
        bundle.putString("source_page_name", str2);
        recordService.startExteriorVideoRecordScene(context, exteriorRecordModel, khj, "ec_photo_search", bundle);
    }

    public static final void onLoad$4(IDLCallbackS0S0300000_7 iDLCallbackS0S0300000_7, AsyncAVService asyncAVService, long j) {
        C42398GkU.LIZ(asyncAVService, "service").startRecord((Activity) iDLCallbackS0S0300000_7.l0, (RecordConfig) iDLCallbackS0S0300000_7.l1, (MusicModel) iDLCallbackS0S0300000_7.l2, true);
    }

    public static final void onLoad$5(IDLCallbackS0S0300000_7 iDLCallbackS0S0300000_7, AsyncAVService service, long j) {
        String str;
        o.LJIIIZ(service, "service");
        if (((C34K) iDLCallbackS0S0300000_7.l0).element && !((MvChoosePhotoScene) iDLCallbackS0S0300000_7.l1).LLJJJIL) {
            IRecordService recordService = service.uiService().recordService();
            Activity requireActivity = ((MvChoosePhotoScene) iDLCallbackS0S0300000_7.l1).requireActivity();
            o.LJIIIIZZ(requireActivity, "requireActivity()");
            recordService.startRecord(requireActivity, ((RecordConfig.Builder) iDLCallbackS0S0300000_7.l2).build(), ((MvChoosePhotoScene) iDLCallbackS0S0300000_7.l1).LLLLLJIL, false);
        } else {
            Context sceneContext = ((MvChoosePhotoScene) iDLCallbackS0S0300000_7.l1).getSceneContext();
            if (sceneContext != null) {
                service.uiService().recordService().startRecord(sceneContext, ((RecordConfig.Builder) iDLCallbackS0S0300000_7.l2).build());
            }
        }
        C145995oB c145995oB = new C145995oB();
        ShortVideoContext shortVideoContext = ((MvChoosePhotoScene) iDLCallbackS0S0300000_7.l1).LLJLLIL;
        String str2 = null;
        if (shortVideoContext != null) {
            str = shortVideoContext.LJI();
        } else {
            str = null;
        }
        c145995oB.LJI("creation_id", str);
        ShortVideoContext shortVideoContext2 = ((MvChoosePhotoScene) iDLCallbackS0S0300000_7.l1).LLJLLIL;
        if (shortVideoContext2 != null) {
            str2 = shortVideoContext2.shootWay;
        }
        c145995oB.LJI("shoot_way", str2);
        c145995oB.LJI("enter_from", "upload_page");
        FMX.LJIIL("click_record_entrance", c145995oB.LIZ);
    }

    public static final void onLoad$6(IDLCallbackS0S0300000_7 iDLCallbackS0S0300000_7, AsyncAVService asyncAVService, long j) {
        IRecordService recordService = asyncAVService.uiService().recordService();
        C44066HRe c44066HRe = (C44066HRe) iDLCallbackS0S0300000_7.l2;
        Activity activity = c44066HRe.LJIIJJI;
        RecordConfig recordConfig = (RecordConfig) iDLCallbackS0S0300000_7.l0;
        recordService.startDuet(activity, recordConfig, (DuetConfig) iDLCallbackS0S0300000_7.l1, c44066HRe.LJJII, c44066HRe.LJIILLIIL, recordConfig.getShootway());
    }

    public static final void onLoad$7(IDLCallbackS0S0300000_7 iDLCallbackS0S0300000_7, AsyncAVService service, long j) {
        o.LJIIIZ(service, "service");
        ((InterfaceC88472Yns) iDLCallbackS0S0300000_7.l0).invoke(300);
        service.uiService().recordService().startRecord((ActivityC45651qj) iDLCallbackS0S0300000_7.l1, ((RecordConfig.Builder) iDLCallbackS0S0300000_7.l2).build());
    }

    public static final void onLoad$8(IDLCallbackS0S0300000_7 iDLCallbackS0S0300000_7, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord((Activity) iDLCallbackS0S0300000_7.l0, ((RecordConfig.Builder) iDLCallbackS0S0300000_7.l1).build(), (MusicModel) iDLCallbackS0S0300000_7.l2, true);
    }

    public static final void onLoad$9(IDLCallbackS0S0300000_7 iDLCallbackS0S0300000_7, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord((Activity) iDLCallbackS0S0300000_7.l0, ((RecordConfig.Builder) iDLCallbackS0S0300000_7.l1).build(), (MusicModel) iDLCallbackS0S0300000_7.l2, true);
        ((Activity) iDLCallbackS0S0300000_7.l0).finish();
    }

    public IDLCallbackS0S0300000_7(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
