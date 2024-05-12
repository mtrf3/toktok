package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImage;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.feed.model.publish.PublishPreviewInfo;
import com.ss.android.ugc.aweme.feed.model.publish.PublishStatus;
import com.ss.android.ugc.aweme.image.model.ImageAlbumData;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.shortvideo.recoverpanel.PublishFailureReason;
import com.ss.android.ugc.aweme.story.publish.ISocialPublishBridgeService;
import com.ss.android.ugc.aweme.story.publish.SocialPublishBridgeServiceImpl;
import com.ss.android.ugc.aweme.story.publish.SocialPublishCallback;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS138S0200000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.GmW, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42524GmW implements InterfaceC224558rb, SocialPublishCallback {
    public static final C42524GmW LIZ = new C42524GmW();
    public static final java.util.Map<Object, InterfaceC42527GmZ> LIZIZ = new LinkedHashMap();
    public static final ArrayList<Aweme> LIZJ = new ArrayList<>();
    public static final ArrayList<C224578rd> LIZLLL = new ArrayList<>();
    public static boolean LJ;

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onReadyToCreateAweme(PublishModel publishModel) {
    }

    @Override // X.InterfaceC224558rb
    public final void LIZ() {
        if (LJ) {
            return;
        }
        ISocialPublishBridgeService LIZ2 = SocialPublishBridgeServiceImpl.LIZ();
        o.LJIIIIZZ(LIZ2, "get().getService(ISocial…ridgeService::class.java)");
        LIZ2.LJIIJJI(this, C42526GmY.LJLIL);
        LJ = true;
    }

    public static final void LIZLLL(InterfaceC88472Yns<? super InterfaceC42527GmZ, C76800UCe> interfaceC88472Yns) {
        Iterator it = ((LinkedHashMap) LIZIZ).entrySet().iterator();
        while (it.hasNext()) {
            interfaceC88472Yns.invoke(((Map.Entry) it.next()).getValue());
        }
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onPublishStart(PublishModel publishModel) {
        Object obj;
        if (publishModel != null && publishModel.isStoryPublish) {
            return;
        }
        Iterator<C224578rd> it = LIZLLL.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            C224578rd next = it.next();
            String str = next.LJLIL.creationId;
            if (publishModel != null) {
                obj = publishModel.creationId;
            }
            if (o.LJ(str, obj)) {
                obj = next;
                break;
            }
        }
        C224578rd c224578rd = (C224578rd) obj;
        if (c224578rd == null) {
            return;
        }
        PublishPreviewInfo previewData = c224578rd.LJLJI.getPreviewData();
        if (previewData != null) {
            previewData.setPublishStatus(PublishStatus.DEFAULT);
        }
        PublishPreviewInfo previewData2 = c224578rd.LJLJI.getPreviewData();
        if (previewData2 != null) {
            previewData2.setProgress(0);
        }
        Iterator<AwemeDraft> it2 = AVExternalServiceImpl.LIZ().draftService().queryDraftList(new GPJ(true, true, null, null, 28)).iterator();
        while (it2.hasNext()) {
            C55723Ltv.LIZIZ.LJJ(it2.next().LIZ());
        }
        if (publishModel != null) {
            LIZLLL(new AqS138S0200000_7(publishModel, c224578rd, 52));
        }
    }

    @Override // X.InterfaceC224558rb
    public final void LIZIZ(ActivityC45651qj activityC45651qj, String str) {
        C224578rd c224578rd;
        PublishStatus publishStatus;
        if (str == null) {
            return;
        }
        Iterator<C224578rd> it = LIZLLL.iterator();
        while (true) {
            if (it.hasNext()) {
                c224578rd = it.next();
                if (o.LJ(str, c224578rd.LJLIL.creationId)) {
                    break;
                }
            } else {
                c224578rd = null;
                break;
            }
        }
        C224578rd c224578rd2 = c224578rd;
        if (c224578rd2 == null) {
            return;
        }
        PublishPreviewInfo previewData = c224578rd2.LJLJI.getPreviewData();
        if (previewData != null) {
            publishStatus = previewData.getPublishStatus();
        } else {
            publishStatus = null;
        }
        if (publishStatus == PublishStatus.FAILED) {
            XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C41366GLi(c224578rd2, activityC45651qj, new PublishFailureReason(null, false, "click_retry_in_preview", null), null), 3);
        }
    }

    @Override // X.InterfaceC224558rb
    public final void LIZJ(Object key, InterfaceC42527GmZ publishCallback) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(publishCallback, "publishCallback");
        LIZIZ.put(key, publishCallback);
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onPublishProgress(int i, PublishModel publishModel) {
        C224578rd c224578rd;
        if (publishModel == null || publishModel.isStoryPublish) {
            return;
        }
        Iterator<C224578rd> it = LIZLLL.iterator();
        while (true) {
            if (it.hasNext()) {
                c224578rd = it.next();
                if (o.LJ(c224578rd.LJLIL.creationId, publishModel.creationId)) {
                    break;
                }
            } else {
                c224578rd = null;
                break;
            }
        }
        C224578rd c224578rd2 = c224578rd;
        if (c224578rd2 != null) {
            PublishPreviewInfo previewData = c224578rd2.LJLJI.getPreviewData();
            if (previewData != null) {
                previewData.setProgress(i);
            }
            LIZLLL(new AqS138S0200000_7(publishModel, c224578rd2, 51));
        }
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onPublishSuccess(PublishModel publishModel, CreateAwemeResponse createAwemeResponse) {
        Object obj;
        o.LJIIIZ(createAwemeResponse, "createAwemeResponse");
        Aweme aweme = createAwemeResponse.aweme;
        Iterator<C224578rd> it = LIZLLL.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            C224578rd next = it.next();
            String str = next.LJLIL.creationId;
            if (publishModel != null) {
                obj = publishModel.creationId;
            }
            if (o.LJ(str, obj)) {
                obj = next;
                break;
            }
        }
        C224578rd c224578rd = (C224578rd) obj;
        if (c224578rd == null) {
            return;
        }
        aweme.setPreviewData(c224578rd.LJLJI.getPreviewData());
        PublishPreviewInfo previewData = aweme.getPreviewData();
        if (previewData != null) {
            previewData.setInPublishing(false);
            previewData.setPublishStatus(PublishStatus.SUCCESS);
        }
        c224578rd.LJLJI = aweme;
        if (publishModel != null) {
            LIZLLL(new AqS138S0200000_7(publishModel, c224578rd, 53));
        }
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onSynthetiseSuccess(PublishModel publishModel, String path) {
        BaseShortVideoContext baseShortVideoContext;
        BaseShortVideoContext baseShortVideoContext2;
        C224578rd c224578rd;
        Video video;
        String str;
        VideoPublishEditModel videoPublishEditModel;
        ImageAlbumData imageAlbumData;
        List<SingleImageData> imageList;
        VideoPublishEditModel videoPublishEditModel2;
        ImageAlbumData imageAlbumData2;
        List<SingleImageData> imageList2;
        o.LJIIIZ(path, "path");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("PublishPreviewManager -> onSynthetiseSuccess path = ");
        LIZ2.append(path);
        H7B.LIZ(X1D.LIZIZ(LIZ2));
        C224578rd c224578rd2 = null;
        VideoUrlModel videoUrlModel = null;
        if (publishModel != null) {
            baseShortVideoContext = publishModel.editModel;
        } else {
            baseShortVideoContext = null;
        }
        if ((baseShortVideoContext instanceof VideoPublishEditModel) && (videoPublishEditModel2 = (VideoPublishEditModel) baseShortVideoContext) != null && (imageAlbumData2 = videoPublishEditModel2.getImageAlbumData()) != null && (imageList2 = imageAlbumData2.getImageList()) != null) {
            for (SingleImageData singleImageData : imageList2) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("PublishPreviewManager -> onSynthetiseSuccess -> path = ");
                LIZ3.append(singleImageData.getSynthesisData());
                H7B.LIZ(X1D.LIZIZ(LIZ3));
            }
        }
        int i = 0;
        if (publishModel != null && C78963Uyt.LJJIIZI(publishModel)) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (publishModel != null) {
                baseShortVideoContext2 = publishModel.editModel;
            } else {
                baseShortVideoContext2 = null;
            }
            if ((baseShortVideoContext2 instanceof VideoPublishEditModel) && (videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext2) != null && (imageAlbumData = videoPublishEditModel.getImageAlbumData()) != null && (imageList = imageAlbumData.getImageList()) != null) {
                for (SingleImageData singleImageData2 : imageList) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        SingleImageData singleImageData3 = singleImageData2;
                        o.LJIIIZ(singleImageData3, "<this>");
                        UrlModel LJJJJI = C78963Uyt.LJJJJI(singleImageData3);
                        if (LJJJJI != null) {
                            ListProtector.add(arrayList, i, new PhotoModeImageUrlModel(LJJJJI, LJJJJI, LJJJJI, LJJJJI, null, 16, null));
                        }
                        UrlModel LJJJJI2 = C78963Uyt.LJJJJI(singleImageData3);
                        if (LJJJJI2 != null) {
                            ListProtector.add(arrayList2, i, new PhotoModeImage(LJJJJI2, LJJJJI2.getWidth(), LJJJJI2.getHeight()));
                        }
                        i = i2;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            }
            Iterator<C224578rd> it = LIZLLL.iterator();
            while (true) {
                if (it.hasNext()) {
                    c224578rd = it.next();
                    String str2 = c224578rd.LJLIL.creationId;
                    if (publishModel != null) {
                        str = publishModel.creationId;
                    } else {
                        str = null;
                    }
                    if (o.LJ(str2, str)) {
                        break;
                    }
                } else {
                    c224578rd = null;
                    break;
                }
            }
            C224578rd c224578rd3 = c224578rd;
            if (c224578rd3 != null) {
                Aweme aweme = c224578rd3.LJLJI;
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append(c224578rd3.LJLJI.getAid());
                LIZ4.append(System.currentTimeMillis());
                aweme.setAid(X1D.LIZIZ(LIZ4));
                Aweme aweme2 = c224578rd3.LJLJI;
                PhotoModeImageInfo photoModeImageInfo = new PhotoModeImageInfo();
                photoModeImageInfo.setImageList(arrayList);
                photoModeImageInfo.setPhotoModeImageList(arrayList2);
                aweme2.setPhotoModeImageInfo(photoModeImageInfo);
                PublishPreviewInfo previewData = c224578rd3.LJLJI.getPreviewData();
                if (previewData != null) {
                    previewData.setInPublishing(true);
                    previewData.setProgress(60);
                }
                Video video2 = c224578rd3.LJLJI.getVideo();
                if ((video2 == null || video2.getPlayAddr() == null) && (video = c224578rd3.LJLJI.getVideo()) != null) {
                    if (publishModel != null) {
                        videoUrlModel = C78963Uyt.LJJIFFI(publishModel);
                    }
                    video.setPlayAddr(videoUrlModel);
                }
                c224578rd2 = c224578rd3;
            }
            if (publishModel != null && c224578rd2 != null) {
                LIZLLL(new AqS138S0200000_7(publishModel, c224578rd2, 48));
                return;
            }
            return;
        }
        AVExternalServiceImpl.LIZ().abilityService().infoService().videoInfo(path, true, new C42525GmX(publishModel, path));
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onPublishFailed(PublishModel publishModel, C41759GaB exception, String errorMsg) {
        Object obj;
        o.LJIIIZ(exception, "exception");
        o.LJIIIZ(errorMsg, "errorMsg");
        H7B.LIZJ("PublishPreviewManager -> onPublishFailed");
        Iterator<C224578rd> it = LIZLLL.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            C224578rd next = it.next();
            String str = next.LJLIL.creationId;
            if (publishModel != null) {
                obj = publishModel.creationId;
            }
            if (o.LJ(str, obj)) {
                obj = next;
                break;
            }
        }
        C224578rd c224578rd = (C224578rd) obj;
        if (c224578rd == null) {
            return;
        }
        PublishPreviewInfo previewData = c224578rd.LJLJI.getPreviewData();
        if (previewData != null) {
            previewData.setPublishStatus(PublishStatus.FAILED);
        }
        if (publishModel != null) {
            LIZLLL(new AqS138S0200000_7(publishModel, c224578rd, 50));
        }
    }
}
