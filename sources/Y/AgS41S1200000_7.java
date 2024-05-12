package Y;

import X.C10I;
import X.C10K;
import X.C16880lQ;
import X.C188727au;
import X.C1DG;
import X.C43758HFi;
import X.C43994HOk;
import X.C44928HkC;
import X.C5S1;
import X.C60903NvH;
import X.C62340OdM;
import X.C68322mC;
import X.C76800UCe;
import X.C78939UyV;
import X.C78983UzD;
import X.FMX;
import X.H78;
import X.H7B;
import X.HG2;
import X.HGA;
import X.HGN;
import X.HQ4;
import X.HTF;
import X.X1D;
import X.XSX;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.api.AnchorAutoSelectionResponse;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.bullet.bridge.common.ShareOpenPlatformMethod;
import com.ss.android.ugc.aweme.common.AnchorTransData;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IDLCallbackS0S0300000_7;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.AVApiImpl;
import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.ugc.aweme.tools.extract.video.VideoFramesUploadService;
import com.ss.android.ugc.aweme.video.local.LocalVideoPlayerManager;
import com.ss.android.ugc.effectmanager.common.exception.StatusCodeException;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes8.dex */
public class AgS41S1200000_7 implements C10I {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

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
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [T, com.ss.android.ugc.aweme.services.external.ui.RecordConfig$Builder] */
    /* JADX WARN: Type inference failed for: r8v0, types: [T, com.ss.android.ugc.aweme.services.external.ui.RecordConfig$Builder] */
    public static final Object then$0(AgS41S1200000_7 agS41S1200000_7, C10K c10k) {
        List<String> list;
        String str;
        int i;
        boolean z;
        Integer height;
        Integer width;
        AnchorAutoSelectionResponse anchorAutoSelectionResponse = (AnchorAutoSelectionResponse) ((C10K) agS41S1200000_7.l1).LJIIJJI();
        if (anchorAutoSelectionResponse.status == 0) {
            CreateAnchorInfo createAnchorInfo = anchorAutoSelectionResponse.anchor;
            UrlModel urlModel = new UrlModel();
            com.ss.android.ugc.aweme.api.UrlModel urlModel2 = anchorAutoSelectionResponse.addedIcon;
            String str2 = null;
            if (urlModel2 != null) {
                list = urlModel2.getUrlList();
            } else {
                list = null;
            }
            urlModel.setUrlList(list);
            com.ss.android.ugc.aweme.api.UrlModel urlModel3 = anchorAutoSelectionResponse.addedIcon;
            if (urlModel3 != null) {
                str = urlModel3.getUri();
            } else {
                str = null;
            }
            urlModel.setUri(str);
            com.ss.android.ugc.aweme.api.UrlModel urlModel4 = anchorAutoSelectionResponse.addedIcon;
            int i2 = 0;
            if (urlModel4 != null && (width = urlModel4.getWidth()) != null) {
                i = width.intValue();
            } else {
                i = 0;
            }
            urlModel.setWidth(i);
            com.ss.android.ugc.aweme.api.UrlModel urlModel5 = anchorAutoSelectionResponse.addedIcon;
            if (urlModel5 != null && (height = urlModel5.getHeight()) != null) {
                i2 = height.intValue();
            }
            urlModel.setHeight(i2);
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("shoot_way", "jsb");
            c188727au.LJIIIZ("enter_from", "video_edit_page");
            c188727au.LJIIIZ("anchor_type", "game");
            if (createAnchorInfo != null) {
                str2 = createAnchorInfo.getKeyword();
            }
            c188727au.LJIIIZ("anchor_entry", str2);
            FMX.LJIIL("choose_anchor", c188727au.LIZ);
            long currentTimeMillis = System.currentTimeMillis();
            H7B.LJ("click to open camera");
            C43994HOk.LIZ = System.currentTimeMillis();
            C68322mC c68322mC = new C68322mC();
            ?? builder = new RecordConfig.Builder();
            builder.creationId(UUID.randomUUID().toString());
            builder.shootWay("direct_shoot");
            builder.groupId(C78939UyV.LJLILLLLZI);
            builder.fromMain(true);
            builder.startRecordTime(currentTimeMillis);
            builder.musicType(1);
            builder.translationType(HTF.LIZ());
            builder.enterFrom(((ShareOpenPlatformMethod) agS41S1200000_7.l2).LJLIL);
            builder.enterMethod(((ShareOpenPlatformMethod) agS41S1200000_7.l2).LJLILLLLZI);
            c68322mC.element = builder;
            if (createAnchorInfo != null) {
                String str3 = agS41S1200000_7.s0;
                ShareOpenPlatformMethod shareOpenPlatformMethod = (ShareOpenPlatformMethod) agS41S1200000_7.l2;
                int type = createAnchorInfo.getType();
                String content = createAnchorInfo.getContent();
                String keyword = createAnchorInfo.getKeyword();
                String url = createAnchorInfo.getUrl();
                String extra = createAnchorInfo.getExtra();
                Boolean bool = anchorAutoSelectionResponse.canRemove;
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    z = true;
                }
                AnchorTransData anchorTransData = new AnchorTransData(type, content, keyword, null, 4, null, urlModel, z, url, null, null, extra, null, false, 13864, null);
                ?? r5 = (RecordConfig.Builder) c68322mC.element;
                r5.setAutoSelectedAnchor(anchorTransData);
                r5.setOpenPlatformExtra(str3);
                r5.setOpenPlatformClientKey(shareOpenPlatformMethod.LJLJI);
                c68322mC.element = r5;
            }
            Context context = ((ShareOpenPlatformMethod) agS41S1200000_7.l2).getContext();
            if (context != null) {
                AVExternalServiceImpl.LIZ().asyncServiceForMainRecordService(context, "direct_shoot", new IDLCallbackS0S0300000_7((ShareOpenPlatformMethod) agS41S1200000_7.l2, context, c68322mC, 1));
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$1(AgS41S1200000_7 agS41S1200000_7, C10K c10k) {
        int statusCode;
        if (c10k.LJIIL() || c10k.LJIILJJIL()) {
            if (c10k.LJIILJJIL() && c10k.LJIIJ() != null) {
                if (c10k.LJIIJ() instanceof XSX) {
                    int errorCode = ((XSX) c10k.LJIIJ()).getErrorCode();
                    String message = c10k.LJIIJ().getMessage();
                    if (errorCode == 5) {
                        message = ((Activity) agS41S1200000_7.l1).getString(R.string.h1u);
                        if (agS41S1200000_7.s0.equals("share_sound")) {
                            ((Intent) agS41S1200000_7.l2).putExtra("MUSIC_ID_INVALID", true);
                        }
                    }
                    new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS9S0201000_6(2, (Activity) agS41S1200000_7.l1, message, 7));
                } else {
                    Exception LJIIJ = c10k.LJIIJ();
                    int i = -1;
                    if (LJIIJ instanceof HQ4) {
                        statusCode = ((HQ4) LJIIJ).getStatusCode();
                    } else {
                        if (LJIIJ instanceof StatusCodeException) {
                            statusCode = ((StatusCodeException) LJIIJ).getStatusCode();
                        }
                        C5S1 c5s1 = new C5S1((Activity) agS41S1200000_7.l1);
                        c5s1.LIZLLL(c10k.LJIIJ().getMessage());
                        c5s1.LJ();
                    }
                    if (statusCode != -1) {
                        Exception LJIIJ2 = c10k.LJIIJ();
                        if (LJIIJ2 instanceof HQ4) {
                            i = ((HQ4) LJIIJ2).getStatusCode();
                        } else if (LJIIJ2 instanceof StatusCodeException) {
                            i = ((StatusCodeException) LJIIJ2).getStatusCode();
                        }
                        String message2 = c10k.LJIIJ().getMessage();
                        switch (i) {
                            case 2002:
                            case 2004:
                                message2 = ((Activity) agS41S1200000_7.l1).getString(R.string.fyi);
                                break;
                            case 2003:
                                message2 = ((Activity) agS41S1200000_7.l1).getString(R.string.eh_);
                                break;
                            case 2006:
                                message2 = ((Activity) agS41S1200000_7.l1).getString(R.string.tg4);
                                break;
                        }
                        C5S1 c5s12 = new C5S1((Activity) agS41S1200000_7.l1);
                        c5s12.LIZLLL(message2);
                        c5s12.LJ();
                    }
                    C5S1 c5s13 = new C5S1((Activity) agS41S1200000_7.l1);
                    c5s13.LIZLLL(c10k.LJIIJ().getMessage());
                    c5s13.LJ();
                }
            }
            return C10K.LJIIIZ(new Bundle());
        }
        return C10K.LJIIIZ(c10k.LJIIJJI());
    }

    public static final Object then$2(AgS41S1200000_7 agS41S1200000_7, C10K c10k) {
        CreateBaseAwemeResponse createBaseAwemeResponse = (CreateBaseAwemeResponse) agS41S1200000_7.l1;
        String str = agS41S1200000_7.s0;
        Runnable runnable = (Runnable) agS41S1200000_7.l2;
        if (c10k.LJIILIIL() && ((Boolean) c10k.LJIIJJI()).booleanValue()) {
            if (createBaseAwemeResponse instanceof CreateAwemeResponse) {
                LocalVideoPlayerManager.LIZLLL().LJI(((CreateAwemeResponse) createBaseAwemeResponse).aweme, str);
            }
        } else {
            C10K.LIZJ(new ACallableS78S0101000_6(0, str, 3));
        }
        runnable.run();
        return null;
    }

    public static final Object then$3(AgS41S1200000_7 agS41S1200000_7, C10K c10k) {
        try {
            C44928HkC c44928HkC = (C44928HkC) agS41S1200000_7.l1;
            if (c44928HkC.LJLJL) {
                C62340OdM.LIZLLL(c44928HkC.LJLILLLLZI, (Context) agS41S1200000_7.l2, c44928HkC.LJLJLJ, agS41S1200000_7.s0, c44928HkC.LJLJI, c44928HkC.LJLJLLL);
            }
        } catch (Exception e) {
            C78983UzD.LJIJ(e, "open share video failed");
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$4(AgS41S1200000_7 agS41S1200000_7, C10K c10k) {
        boolean z;
        Integer valueOf;
        C10K<BaseResponse> uploadFrame;
        VideoFramesUploadService videoFramesUploadService = (VideoFramesUploadService) agS41S1200000_7.l1;
        C43758HFi c43758HFi = (C43758HFi) agS41S1200000_7.l2;
        String str = agS41S1200000_7.s0;
        videoFramesUploadService.getClass();
        if (c10k.LJIILJJIL()) {
            return C10K.LJIIIIZZ(c10k.LJIIJ());
        }
        if (C60903NvH.LJIIJJI().getAccountService() != null && C1DG.LJIIIIZZ()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return C10K.LJIIIIZZ(new IllegalStateException("stop task manually for specified case"));
        }
        C60903NvH.LJIIJJI().getPublishService().LJJ().LIZJ("extract_frame", "upload zip success");
        HGN hgn = (HGN) c10k.LJIIJJI();
        c43758HFi.LIZ(hgn);
        Iterator it = ((ArrayList) hgn.LIZ).iterator();
        while (it.hasNext()) {
            HGA hga = (HGA) it.next();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(VideoFramesUploadService.LJLIL);
            LIZ.append(" upload zip succeed,uri:");
            LIZ.append(hga.LJ);
            H78.LIZ(X1D.LIZIZ(LIZ));
        }
        try {
            HG2.LIZ(str, "create_report_task");
            VideoFramesUploadService.FramesUploadApi framesUploadApi = (VideoFramesUploadService.FramesUploadApi) RetrofitFactory.LIZLLL().create(AVApiImpl.LIZJ().LIZ()).create(VideoFramesUploadService.FramesUploadApi.class);
            if (((ArrayList) hgn.LIZ).isEmpty()) {
                return C10K.LJIIIIZZ(new IllegalStateException("VideoFramesUploadModel is empty"));
            }
            if (((ArrayList) hgn.LIZ).size() > 1) {
                C10K<BaseResponse> uploadMultiFrame = framesUploadApi.uploadMultiFrame(C78983UzD.LJIIIIZZ(hgn));
                uploadMultiFrame.LJIJI();
                Iterator it2 = ((ArrayList) hgn.LIZ).iterator();
                while (it2.hasNext()) {
                    HGA hga2 = (HGA) it2.next();
                    if (uploadMultiFrame.LJIILIIL()) {
                        if (uploadMultiFrame.LJIIJJI().status_code == 0) {
                            VideoFramesUploadService.LJFF(hga2);
                        } else {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("response: ");
                            LIZ2.append(uploadMultiFrame.LJIIJJI().toString());
                            VideoFramesUploadService.LJ(hga2, X1D.LIZIZ(LIZ2), -3003);
                        }
                    } else {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("task fail with exception : ");
                        LIZ3.append(Log.getStackTraceString(uploadMultiFrame.LJIIJ()));
                        VideoFramesUploadService.LJ(hga2, X1D.LIZIZ(LIZ3), -3003);
                    }
                }
                return uploadMultiFrame;
            }
            HGA hga3 = (HGA) ListProtector.get(hgn.LIZ, 0);
            int i = hga3.LIZIZ;
            if (i == -1) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(i);
            }
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("[Original Frame] Reporting -AwemeId:");
            LIZ4.append(hga3.LIZ);
            H78.LJI(X1D.LIZIZ(LIZ4));
            ExtractFramesModel extractFramesModel = hga3.LJI;
            if (extractFramesModel != null && extractFramesModel.getStickerIds() != null) {
                uploadFrame = framesUploadApi.uploadFrame(hga3.LIZ, hga3.LIZLLL, hga3.LJ, hga3.LJI.getStickerIds(), valueOf, Integer.valueOf(hga3.LIZJ));
            } else {
                uploadFrame = framesUploadApi.uploadFrame(hga3.LIZ, hga3.LIZLLL, hga3.LJ, null, valueOf, Integer.valueOf(hga3.LIZJ));
            }
            uploadFrame.LJIJI();
            if (uploadFrame.LJIILIIL()) {
                if (uploadFrame.LJIIJJI().status_code == 0) {
                    HG2.LIZ(str, "report_success");
                    VideoFramesUploadService.LJFF(hga3);
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("[Original Frame] Report Success -AwemeId:");
                    LIZ5.append(hga3.LIZ);
                    H78.LJI(X1D.LIZIZ(LIZ5));
                    return uploadFrame;
                }
                HG2.LIZ(str, "report_fail");
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append("response: ");
                LIZ6.append(uploadFrame.LJIIJJI().toString());
                VideoFramesUploadService.LJ(hga3, X1D.LIZIZ(LIZ6), -3002);
                return uploadFrame;
            }
            HG2.LIZ(str, "report_fail");
            StringBuilder LIZ7 = X1D.LIZ();
            LIZ7.append("task fail with exception : ");
            LIZ7.append(Log.getStackTraceString(uploadFrame.LJIIJ()));
            VideoFramesUploadService.LJ(hga3, X1D.LIZIZ(LIZ7), -3002);
            return uploadFrame;
        } catch (Exception e) {
            HG2.LIZ(str, "report_error");
            return C10K.LJIIIIZZ(e);
        }
    }

    public AgS41S1200000_7(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
    }

    public AgS41S1200000_7(C44928HkC c44928HkC, Context context, boolean z, String str, int i) {
        this.$t = i;
        this.l1 = c44928HkC;
        this.l2 = context;
        this.s0 = str;
    }
}
