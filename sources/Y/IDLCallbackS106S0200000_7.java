package Y;

import X.ActivityC45651qj;
import X.C42398GkU;
import X.C44087HRz;
import X.C47261Igj;
import X.HB8;
import X.HB9;
import X.HS1;
import X.HUE;
import X.HUJ;
import X.HUM;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.composer.model.CreationConfigModelCompat;
import com.ss.android.ugc.aweme.detail.panel.LibraryFeedPanel;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.IUIService;
import com.ss.android.ugc.aweme.services.external.ui.IRecordService;
import com.ss.android.ugc.aweme.services.external.ui.PhotoMvAnchorConfig;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.services.watermark.WaterMarkBuilder;
import com.ss.android.ugc.aweme.services.watermark.WaterMarkListener;
import com.ss.android.ugc.aweme.shortvideo.jsb.comment.ExteriorRecordModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.topic.book.detail.BookDetailPage;
import com.ss.android.ugc.aweme.topic.movie.detail.MovieDetailPage;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.aweme.watermark.WaterMarkServiceImpl;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class IDLCallbackS106S0200000_7 implements IExternalService.ServiceLoadCallback {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onDismiss() {
        switch (this.$t) {
            case 0:
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                return;
            case 1:
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                return;
            case 2:
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                return;
            case 3:
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                return;
            case 4:
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                return;
            case 5:
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                return;
            case 6:
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                return;
            case 7:
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                return;
            case 8:
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                return;
            case 9:
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                return;
            case 10:
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                return;
            case 12:
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                return;
            case 14:
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                return;
            case 15:
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                return;
            case 17:
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                return;
            case 18:
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                return;
            case 19:
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                return;
            case 20:
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                return;
            case 21:
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                return;
            default:
                return;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onFailed() {
        switch (this.$t) {
            case 0:
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                return;
            case 1:
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                return;
            case 2:
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                return;
            case 3:
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                return;
            case 4:
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                return;
            case 5:
                onFailed$5(this);
                return;
            case 6:
                onFailed$6(this);
                return;
            case 7:
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                return;
            case 8:
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                return;
            case 9:
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                return;
            case 10:
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                return;
            case 12:
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                return;
            case 14:
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                return;
            case 15:
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                return;
            case 17:
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                return;
            case 18:
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                return;
            case 19:
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                return;
            case 20:
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                return;
            case 21:
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                return;
            default:
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
            default:
                return;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onOK() {
        switch (this.$t) {
            case 0:
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                return;
            case 1:
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                return;
            case 2:
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                return;
            case 3:
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                return;
            case 4:
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                return;
            case 5:
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                return;
            case 6:
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                return;
            case 7:
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                return;
            case 8:
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                return;
            case 9:
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                return;
            case 10:
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                return;
            case 12:
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                return;
            case 14:
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                return;
            case 15:
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                return;
            case 17:
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                return;
            case 18:
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                return;
            case 19:
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                return;
            case 20:
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                return;
            case 21:
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                return;
            default:
                return;
        }
    }

    public static final void onFailed$5(IDLCallbackS106S0200000_7 iDLCallbackS106S0200000_7) {
        WaterMarkListener waterMarkListener = ((WaterMarkBuilder) iDLCallbackS106S0200000_7.l1).listener;
        if (waterMarkListener != null) {
            waterMarkListener.onError(-114);
        }
    }

    public static final void onFailed$6(IDLCallbackS106S0200000_7 iDLCallbackS106S0200000_7) {
        WaterMarkListener waterMarkListener = ((WaterMarkBuilder) iDLCallbackS106S0200000_7.l1).listener;
        if (waterMarkListener != null) {
            waterMarkListener.onError(-114);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public IDLCallbackS106S0200000_7(android.app.Activity r2, android.net.Uri r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDLCallbackS106S0200000_7.<init>(android.app.Activity, android.net.Uri, int):void");
    }

    public static final void onLoad$0(IDLCallbackS106S0200000_7 iDLCallbackS106S0200000_7, AsyncAVService service, long j) {
        o.LJIIIZ(service, "service");
        AVExternalServiceImpl.LIZ().shoutOutsService().startShoutoutsPublishActivityFromDL((Activity) iDLCallbackS106S0200000_7.l0, (Uri) iDLCallbackS106S0200000_7.l1);
    }

    public static final void onLoad$1(IDLCallbackS106S0200000_7 iDLCallbackS106S0200000_7, AsyncAVService service, long j) {
        o.LJIIIZ(service, "service");
        try {
            CreationConfigModelCompat creationConfigModelCompat = (CreationConfigModelCompat) GsonHolder.LIZLLL().LIZ().LJI(UriProtector.getQueryParameter((Uri) iDLCallbackS106S0200000_7.l0, "json"), CreationConfigModelCompat.class);
            IUIService uiService = service.uiService();
            Activity activity = (Activity) iDLCallbackS106S0200000_7.l1;
            o.LJIIIIZZ(creationConfigModelCompat, "creationConfigModelCompat");
            uiService.startCreationFromDeepLink(activity, creationConfigModelCompat);
        } catch (Exception unused) {
        }
    }

    public static final void onLoad$10(IDLCallbackS106S0200000_7 iDLCallbackS106S0200000_7, AsyncAVService asyncAVService, long j) {
        C42398GkU.LIZ(asyncAVService, "service").startRecord((Context) iDLCallbackS106S0200000_7.l0, ((RecordConfig.Builder) iDLCallbackS106S0200000_7.l1).build());
    }

    public static final void onLoad$11(IDLCallbackS106S0200000_7 iDLCallbackS106S0200000_7, AsyncAVService asyncAVService, long j) {
        IRecordService LIZ = C42398GkU.LIZ(asyncAVService, "service");
        Context context = ((View) iDLCallbackS106S0200000_7.l0).getContext();
        o.LJIIIIZZ(context, "it.context");
        LIZ.startExteriorVideoRecordScene(context, new ExteriorRecordModel(HB8.AIGC, C47261Igj.LJJIJIIJI(HUJ.REVERSE, HUJ.FLASH, HUJ.M_BEAUTY, HUJ.FILTER), HB9.PHOTO, 0L, 0L, 0, 0, Float.valueOf(0.0f), Float.valueOf(0.0f), new ArrayList(), true, null), new HUE(((HUM) iDLCallbackS106S0200000_7.l1).handler), "ai_avatar", null);
    }

    public static final void onLoad$12(IDLCallbackS106S0200000_7 iDLCallbackS106S0200000_7, AsyncAVService asyncAVService, long j) {
        C42398GkU.LIZ(asyncAVService, "service").startRecord((Context) iDLCallbackS106S0200000_7.l0, ((RecordConfig.Builder) iDLCallbackS106S0200000_7.l1).build());
    }

    public static final void onLoad$13(IDLCallbackS106S0200000_7 iDLCallbackS106S0200000_7, AsyncAVService asyncAVService, long j) {
        IRecordService LIZ = C42398GkU.LIZ(asyncAVService, "service");
        Context context = ((View) iDLCallbackS106S0200000_7.l0).getContext();
        o.LJIIIIZZ(context, "v.context");
        LIZ.startRecord(context, (RecordConfig) iDLCallbackS106S0200000_7.l1);
    }

    public static final void onLoad$14(IDLCallbackS106S0200000_7 iDLCallbackS106S0200000_7, AsyncAVService asyncAVService, long j) {
        IRecordService LIZ = C42398GkU.LIZ(asyncAVService, "service");
        Context context = ((View) iDLCallbackS106S0200000_7.l0).getContext();
        o.LJIIIIZZ(context, "v.context");
        LIZ.startRecord(context, (RecordConfig) iDLCallbackS106S0200000_7.l1);
    }

    public static final void onLoad$15(IDLCallbackS106S0200000_7 iDLCallbackS106S0200000_7, AsyncAVService asyncAVService, long j) {
        IRecordService LIZ = C42398GkU.LIZ(asyncAVService, "service");
        Context context = ((View) iDLCallbackS106S0200000_7.l0).getContext();
        o.LJIIIIZZ(context, "v.context");
        LIZ.startRecord(context, (RecordConfig) iDLCallbackS106S0200000_7.l1);
    }

    public static final void onLoad$16(IDLCallbackS106S0200000_7 iDLCallbackS106S0200000_7, AsyncAVService asyncAVService, long j) {
        C42398GkU.LIZ(asyncAVService, "service").startRecord((Context) iDLCallbackS106S0200000_7.l0, ((RecordConfig.Builder) iDLCallbackS106S0200000_7.l1).build());
    }

    public static final void onLoad$17(IDLCallbackS106S0200000_7 iDLCallbackS106S0200000_7, AsyncAVService asyncAVService, long j) {
        C42398GkU.LIZ(asyncAVService, "service").startRecord((Context) iDLCallbackS106S0200000_7.l0, ((RecordConfig.Builder) iDLCallbackS106S0200000_7.l1).build());
    }

    public static final void onLoad$18(IDLCallbackS106S0200000_7 iDLCallbackS106S0200000_7, AsyncAVService asyncAVService, long j) {
        IRecordService LIZ = C42398GkU.LIZ(asyncAVService, "service");
        ActivityC45651qj act = (ActivityC45651qj) iDLCallbackS106S0200000_7.l0;
        o.LJIIIIZZ(act, "act");
        LIZ.startRecord(act, ((RecordConfig.Builder) iDLCallbackS106S0200000_7.l1).build());
    }

    public static final void onLoad$19(IDLCallbackS106S0200000_7 iDLCallbackS106S0200000_7, AsyncAVService asyncAVService, long j) {
        C42398GkU.LIZ(asyncAVService, "service").startRecord((Activity) iDLCallbackS106S0200000_7.l0, ((RecordConfig.Builder) iDLCallbackS106S0200000_7.l1).build());
    }

    public static final void onLoad$2(IDLCallbackS106S0200000_7 iDLCallbackS106S0200000_7, AsyncAVService asyncAVService, long j) {
        IRecordService LIZ = C42398GkU.LIZ(asyncAVService, "service");
        Activity activity = ((LibraryFeedPanel) iDLCallbackS106S0200000_7.l0).activity;
        o.LJIIIIZZ(activity, "activity");
        LIZ.startRecord(activity, ((RecordConfig.Builder) iDLCallbackS106S0200000_7.l1).build());
    }

    public static final void onLoad$20(IDLCallbackS106S0200000_7 iDLCallbackS106S0200000_7, AsyncAVService asyncAVService, long j) {
        C42398GkU.LIZ(asyncAVService, "service").startRecord((Activity) iDLCallbackS106S0200000_7.l0, (Intent) iDLCallbackS106S0200000_7.l1);
    }

    public static final void onLoad$21(IDLCallbackS106S0200000_7 iDLCallbackS106S0200000_7, AsyncAVService asyncAVService, long j) {
        C42398GkU.LIZ(asyncAVService, "service").startRecord((Context) iDLCallbackS106S0200000_7.l0, ((RecordConfig.Builder) iDLCallbackS106S0200000_7.l1).build());
    }

    public static final void onLoad$3(IDLCallbackS106S0200000_7 iDLCallbackS106S0200000_7, AsyncAVService asyncAVService, long j) {
        IRecordService LIZ = C42398GkU.LIZ(asyncAVService, "service");
        ActivityC45651qj requireActivity = ((BookDetailPage) iDLCallbackS106S0200000_7.l0).requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        LIZ.startRecord(requireActivity, ((RecordConfig.Builder) iDLCallbackS106S0200000_7.l1).build());
    }

    public static final void onLoad$4(IDLCallbackS106S0200000_7 iDLCallbackS106S0200000_7, AsyncAVService asyncAVService, long j) {
        IRecordService LIZ = C42398GkU.LIZ(asyncAVService, "service");
        ActivityC45651qj requireActivity = ((MovieDetailPage) iDLCallbackS106S0200000_7.l0).requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        LIZ.startRecord(requireActivity, ((RecordConfig.Builder) iDLCallbackS106S0200000_7.l1).build());
    }

    public static final void onLoad$5(IDLCallbackS106S0200000_7 iDLCallbackS106S0200000_7, AsyncAVService service, long j) {
        o.LJIIIZ(service, "service");
        ((WaterMarkServiceImpl) iDLCallbackS106S0200000_7.l0).getClass();
        WaterMarkServiceImpl.LIZIZ().LIZJ((WaterMarkBuilder) iDLCallbackS106S0200000_7.l1);
        ((WaterMarkServiceImpl) iDLCallbackS106S0200000_7.l0).getClass();
        WaterMarkServiceImpl.LIZIZ().LIZ();
    }

    public static final void onLoad$6(IDLCallbackS106S0200000_7 iDLCallbackS106S0200000_7, AsyncAVService service, long j) {
        o.LJIIIZ(service, "service");
        ((WaterMarkServiceImpl) iDLCallbackS106S0200000_7.l0).getClass();
        WaterMarkServiceImpl.LIZIZ().waterMark((WaterMarkBuilder) iDLCallbackS106S0200000_7.l1);
    }

    public static final void onLoad$7(IDLCallbackS106S0200000_7 iDLCallbackS106S0200000_7, AsyncAVService service, long j) {
        MusicModel musicModel;
        o.LJIIIZ(service, "service");
        RecordConfig.Builder builder = new RecordConfig.Builder();
        builder.creationId(((HS1) iDLCallbackS106S0200000_7.l0).LJLJLJ);
        builder.enterFrom("anchor_combine_page");
        builder.shootWay("anchor_combine_mv");
        PhotoMvAnchorConfig photoMvAnchorConfig = new PhotoMvAnchorConfig();
        photoMvAnchorConfig.setSlideshowMvId(UriProtector.getQueryParameter((Uri) iDLCallbackS106S0200000_7.l1, "slideshow_mv_id"));
        Music music = ((HS1) iDLCallbackS106S0200000_7.l0).LJJII().getMusic();
        if (music != null) {
            musicModel = music.convertToMusicModel();
        } else {
            musicModel = null;
        }
        photoMvAnchorConfig.setMusicModel(musicModel);
        photoMvAnchorConfig.setTemplateType(UriProtector.getQueryParameter((Uri) iDLCallbackS106S0200000_7.l1, "template_type"));
        service.uiService().recordService().startRecordSlideShowPhotoMV(((HS1) iDLCallbackS106S0200000_7.l0).LJJI(), builder.build(), photoMvAnchorConfig);
    }

    public static final void onLoad$8(IDLCallbackS106S0200000_7 iDLCallbackS106S0200000_7, AsyncAVService asyncAVService, long j) {
        C42398GkU.LIZ(asyncAVService, "service").startRecord(((C44087HRz) iDLCallbackS106S0200000_7.l0).LJIIIZ().LIZ(), ((RecordConfig.Builder) iDLCallbackS106S0200000_7.l1).build());
    }

    public static final void onLoad$9(IDLCallbackS106S0200000_7 iDLCallbackS106S0200000_7, AsyncAVService asyncAVService, long j) {
        C42398GkU.LIZ(asyncAVService, "service").startRecord((Context) iDLCallbackS106S0200000_7.l0, ((RecordConfig.Builder) iDLCallbackS106S0200000_7.l1).build());
    }

    public IDLCallbackS106S0200000_7(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
