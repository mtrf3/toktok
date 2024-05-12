package X;

import android.app.Application;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.opengl.GLES20;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.subscribe.emote.LiveSubMediaModel;
import com.bytedance.hybrid.spark.security.web_js.setting.JSInjectConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.provider.impl.GScope;
import com.ss.android.tracker.event.EventParamsProtocol;
import com.ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentImageStruct;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.SearchCreateModel;
import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfoWrapper;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.InteractPermission;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.UpvotePreloadStruct;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.main.service.ILanguageService;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.share.downloadv2.event.provider.BaseDownloadParamsGroupProvider;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.DuetContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.RecordStickerSegmentInfoKt;
import com.ss.android.ugc.aweme.shortvideo.model.SearchCreationExtraData;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.model.BackgroundVideo;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;
import yq4.a;

/* loaded from: classes14.dex */
public final class V16 implements InterfaceC142415iP, F4Q {
    public static volatile ExecutorService LIZ;
    public static PThreadPoolExecutor LIZIZ;
    public static String LIZJ;

    public static final void LJJJJJL(String msg) {
        o.LJIIIZ(msg, "msg");
    }

    @Override // X.InterfaceC142415iP
    public void LIZJ() {
    }

    @Override // X.InterfaceC142415iP
    public void onCancel() {
    }

    @Override // X.InterfaceC142415iP
    public void onShow() {
    }

    public static synchronized ExecutorService LJIJ() {
        ExecutorService executorService;
        synchronized (V16.class) {
            if (LIZ != null) {
                executorService = LIZ;
            } else {
                if (LIZIZ == null) {
                    LIZIZ = new PThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new DefaultThreadFactory("/AVThreadPool"));
                }
                executorService = LIZIZ;
            }
        }
        return executorService;
    }

    public static void LJI() {
        do {
        } while (GLES20.glGetError() != 0);
    }

    public static synchronized void LIZLLL(Runnable runnable) {
        synchronized (V16.class) {
            LJIJ().submit(runnable);
        }
    }

    public static final void LJ(ShortVideoContext shortVideoContext) {
        long min;
        long j;
        if (shortVideoContext == null) {
            return;
        }
        int i = shortVideoContext.shootMode;
        boolean z = false;
        if (i != 10) {
            if (i != 11 && i != 14 && i != 18) {
                min = shortVideoContext.cameraComponentModel.mMaxDuration;
            } else {
                min = Math.min(shortVideoContext.cameraComponentModel.mMaxDuration, C60903NvH.LJIIJJI().LJJIII().getMaxDurationResolver().getMaxShootingDuration(false, shortVideoContext));
            }
        } else {
            min = Math.min(shortVideoContext.cameraComponentModel.mMaxDuration, C60903NvH.LJIIJJI().LJJIII().getMaxDurationResolver().getMaxShootingDuration(true, shortVideoContext));
        }
        CameraComponentModel cameraComponentModel = shortVideoContext.cameraComponentModel;
        cameraComponentModel.mMaxDuration = min;
        BackgroundVideo backgroundVideo = cameraComponentModel.curBackgroundVideo;
        if (backgroundVideo != null) {
            j = backgroundVideo.getMaxDuration();
        } else {
            j = 0;
        }
        BackgroundVideo backgroundVideo2 = shortVideoContext.cameraComponentModel.curBackgroundVideo;
        if (backgroundVideo2 != null && !backgroundVideo2.isMultiBgVideo()) {
            z = true;
        }
        if (j > 0 && z && !shortVideoContext.LJJIJIIJIL()) {
            shortVideoContext.cameraComponentModel.mMaxDuration = Math.min(shortVideoContext.cameraComponentModel.mMaxDuration, j);
        }
    }

    public static final UpvoteStruct LJIIIIZZ(UpvoteList upvoteList) {
        List<UpvoteStruct> upvotes;
        UpvoteStruct upvoteStruct = null;
        if (upvoteList == null || (upvotes = upvoteList.getUpvotes()) == null) {
            return null;
        }
        Iterator<UpvoteStruct> it = upvotes.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            UpvoteStruct next = it.next();
            if (AV1.LJIJ(next.getUser())) {
                upvoteStruct = next;
                break;
            }
        }
        return upvoteStruct;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        if (X.ORY.LJJIJIIJIL(r4.shootWay, new java.lang.String[]{"single_song", "collection_music"}) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJIIIZ(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r1 < r0) goto L5d
            java.lang.String r1 = "android.permission.READ_MEDIA_IMAGES"
            java.lang.String r0 = "android.permission.READ_MEDIA_VIDEO"
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}
        L13:
            boolean r0 = X.C78605Ut7.LIZJ(r0)
            r2 = 0
            if (r0 == 0) goto L5c
            r3 = 31744(0x7c00, float:4.4483E-41)
            java.lang.String r0 = "open_album_when_no_camera_permission"
            r1 = 1
            boolean r0 = defpackage.e1.LIZ(r3, r0, r1, r2)
            if (r0 != r1) goto L53
            java.lang.String r0 = "android.permission.CAMERA"
            boolean r0 = X.C78605Ut7.LJFF(r0)
            if (r0 != 0) goto L53
            java.lang.String r0 = r4.getMusicId()
            boolean r0 = X.C78685UuP.LJJJZ(r0)
            if (r0 == 0) goto L53
            boolean r0 = r4.LJJJI()
            if (r0 != 0) goto L53
            boolean r0 = r4.LJJIJIIJI()
            if (r0 != 0) goto L53
            java.lang.String r1 = "single_song"
            java.lang.String r0 = "collection_music"
            java.lang.String[] r1 = new java.lang.String[]{r1, r0}
            java.lang.String r0 = r4.shootWay
            boolean r0 = X.ORY.LJJIJIIJIL(r0, r1)
            if (r0 != 0) goto L5b
        L53:
            java.lang.String r0 = r4.enterFrom
            boolean r0 = X.C46140I8y.LIZ(r0)
            if (r0 == 0) goto L5c
        L5b:
            r2 = 1
        L5c:
            return r2
        L5d:
            java.lang.String r0 = "android.permission.READ_EXTERNAL_STORAGE"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V16.LJIIIZ(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext):boolean");
    }

    public static final String LJIILIIL(CKEDraftInfoWrapper cKEDraftInfoWrapper) {
        o.LJIIIZ(cKEDraftInfoWrapper, "<this>");
        String absolutePath = OR7.LLLILZJ(new File(cKEDraftInfoWrapper.draftPath), cKEDraftInfoWrapper.effectPath).getAbsolutePath();
        o.LJIIIIZZ(absolutePath, "<get-absEffectPath>");
        return absolutePath;
    }

    public static final String LJIILJJIL(CKEDraftInfoWrapper cKEDraftInfoWrapper) {
        o.LJIIIZ(cKEDraftInfoWrapper, "<this>");
        String str = cKEDraftInfoWrapper.iconPath;
        if (str.length() == 0) {
            str = cKEDraftInfoWrapper.defaultIconPath;
        }
        String absolutePath = OR7.LLLILZJ(new File(cKEDraftInfoWrapper.draftPath), str).getAbsolutePath();
        o.LJIIIIZZ(absolutePath, "this.iconPath\n        .i…esolve(it).absolutePath }");
        return absolutePath;
    }

    public static C198517qh LJIILL(String str) {
        boolean z;
        PackageInfo packageInfo;
        boolean z2;
        C198517qh c198517qh = new C198517qh();
        if (TextUtils.equals(str, "google")) {
            Application application = C58725N2z.LIZ;
            synchronized (V17.class) {
                z = true;
                try {
                    packageInfo = C16880lQ.LLLLLLZ(application.getPackageManager(), "com.google.android.gms", 1);
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                    packageInfo = null;
                }
            }
            if (packageInfo != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            c198517qh.LIZLLL("google_isAvaliable", String.valueOf(z2));
            if (packageInfo != null) {
                c198517qh.LIZLLL("google_versionName", packageInfo.versionName);
                c198517qh.LIZLLL("google_versionCode", String.valueOf(packageInfo.versionCode));
            }
            if (C78555UsJ.LJIJI(C58725N2z.LIZ) != 0) {
                z = false;
            }
            c198517qh.LIZLLL("eligible", String.valueOf(z));
        }
        return c198517qh;
    }

    public static final boolean LJIILLIIL(ShortVideoContext shortVideoContext) {
        o.LJIIIZ(shortVideoContext, "<this>");
        if (o.LJ(shortVideoContext.creativeModel.stickerModel.isQADraft, Boolean.TRUE)) {
            return false;
        }
        if (!shortVideoContext.creativeModel.stickerModel.addYoursStickerModels.isEmpty()) {
            return true;
        }
        if (shortVideoContext.LJJIJIIJIL() || C1DG.LJIIIIZZ() || !C234869Jq.LIZ()) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIZILJ(ShortVideoContext shortVideoContext) {
        o.LJIIIZ(shortVideoContext, "<this>");
        if (!LJIILLIIL(shortVideoContext) || !C1B8.LIZJ() || LJJIJ(shortVideoContext) || C00F.LIZ(31744, 0, "studio_enable_record_ay_icon", true) <= 0) {
            return false;
        }
        return true;
    }

    public static final Aweme LJIJI(SearchMixFeed searchMixFeed) {
        Aweme aweme;
        if (searchMixFeed == null) {
            return null;
        }
        List LIZJ2 = C44729Hgz.LIZJ(searchMixFeed, EnumC46469ILp.GENERAL_SEARCH);
        if (LIZJ2 == null || (aweme = (Aweme) ORZ.LJLLLL(LIZJ2)) == null) {
            return searchMixFeed.getAweme();
        }
        return aweme;
    }

    public static final List LJIJJLI(Aweme aweme) {
        List<PhotoModeImageUrlModel> imageList;
        PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
        if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(imageList, 10));
            for (PhotoModeImageUrlModel photoModeImageUrlModel : imageList) {
                if (((Boolean) C52296Kfk.LIZ.getValue()).booleanValue() && photoModeImageUrlModel.needSupportMultiRateSelect()) {
                    PhotoModeImageUrlModel LIZ2 = C86M.LIZ(photoModeImageUrlModel, Integer.valueOf(C1DG.LIZ().LIZJ()));
                    photoModeImageUrlModel.setTargetMultiRateImageUrl(LIZ2.getTargetMultiRateImageUrl());
                    photoModeImageUrlModel.setGearName(LIZ2.getGearName());
                } else {
                    photoModeImageUrlModel.setTargetMultiRateImageUrl(null);
                    photoModeImageUrlModel.setGearName(null);
                }
                arrayList.add(photoModeImageUrlModel);
            }
            return arrayList;
        }
        return C61878OQg.INSTANCE;
    }

    public static final List LJIL(XRT bundleData) {
        List list;
        o.LJIIIZ(bundleData, "bundleData");
        Object LIZ2 = bundleData.LIZ("list_data");
        if ((LIZ2 instanceof List) && (list = (List) LIZ2) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                MusicModel musicModel = ((C84934XVa) it.next()).LIZIZ;
                if (musicModel != null) {
                    arrayList.add(musicModel);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (((MusicModel) next).getMusicItemType() != MusicModel.MusicItemType.LOADING_VIEW) {
                    arrayList2.add(next);
                }
            }
            return arrayList2;
        }
        return C61878OQg.INSTANCE;
    }

    public static final boolean LJJ(ShortVideoContext shortVideoContext) {
        o.LJIIIZ(shortVideoContext, "<this>");
        if (C60903NvH.LJIIJJI().getAccountService().isChildrenMode() || !C44256HYm.LIZJ(shortVideoContext) || !GX0.LIZ() || !C41669GWz.LIZ() || C77123UOp.LJJ(shortVideoContext)) {
            return false;
        }
        return o.LJ(C60903NvH.LJIIJJI().LJJIII().getDefaultShootTabTag(shortVideoContext), I38.RECORD_NOW.getTag());
    }

    public static final int LJJI(ShortVideoContext shortVideoContext) {
        DuetContext duetContext;
        o.LJIIIZ(shortVideoContext, "<this>");
        if (shortVideoContext.LJJJI() && (duetContext = shortVideoContext.cameraComponentModel.duetContext) != null && o.LJ(duetContext.duetLayoutMode, "horizontal")) {
            return shortVideoContext.cameraComponentModel.mVideoHeight / 2;
        }
        return shortVideoContext.cameraComponentModel.mVideoHeight;
    }

    public static final int LJJIFFI(Aweme aweme) {
        List<PhotoModeImageUrlModel> imageList;
        PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
        if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
            return imageList.size();
        }
        return 0;
    }

    public static final C32804Cu8 LJJII(C32816CuK c32816CuK) {
        o.LJIIIZ(c32816CuK, "<this>");
        UV2 LIZIZ2 = c32816CuK.LIZIZ();
        if (LIZIZ2 instanceof C32804Cu8) {
            return (C32804Cu8) LIZIZ2;
        }
        return null;
    }

    public static final boolean LJJIIJ(ShortVideoContext shortVideoContext) {
        String str;
        o.LJIIIZ(shortVideoContext, "<this>");
        Boolean isBusinessFirstSticker = shortVideoContext.isBusinessFirstSticker;
        o.LJIIIIZZ(isBusinessFirstSticker, "isBusinessFirstSticker");
        if (!isBusinessFirstSticker.booleanValue()) {
            AVChallenge recordChallenge = shortVideoContext.creativeModel.commerceModel.getRecordChallenge();
            if (recordChallenge != null) {
                str = recordChallenge.challengeName;
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str) && !o.LJ(shortVideoContext.shootWay, "tcm_upload") && shortVideoContext.creativeModel.commerceModel.getMission() == null) {
                return false;
            }
        }
        return true;
    }

    public static boolean LJJIIJZLJL(View view) {
        InputMethodManager inputMethodManager;
        if (view == null || (inputMethodManager = (InputMethodManager) C16880lQ.LLILL(view.getContext(), "input_method")) == null) {
            return false;
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        return true;
    }

    public static final boolean LJJIIZ(Comment comment) {
        if ((comment instanceof C223688qC) && ((C223688qC) comment).isDefault()) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIIZI(ShortVideoContext shortVideoContext) {
        boolean z;
        o.LJIIIZ(shortVideoContext, "<this>");
        DuetContext duetContext = shortVideoContext.cameraComponentModel.duetContext;
        String str = duetContext.duetVideoPath;
        String str2 = duetContext.duetAudioPath;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            z = true;
        } else {
            z = false;
        }
        if (o.LJ(shortVideoContext.shootWay, "duet") || z) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIJ(ShortVideoContext shortVideoContext) {
        o.LJIIIZ(shortVideoContext, "<this>");
        return shortVideoContext.creativeModel.stickerModel.isFromFollowAddYours;
    }

    public static final boolean LJJIJIIJI(ShortVideoContext shortVideoContext) {
        String str;
        if (shortVideoContext != null) {
            str = shortVideoContext.shootWay;
        } else {
            str = null;
        }
        if (o.LJ(str, "now")) {
            return true;
        }
        if (shortVideoContext != null && shortVideoContext.shootMode == 16) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
    
        if (r3 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJJIJIIJIL(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r3) {
        /*
            if (r3 == 0) goto L21
            java.lang.String r1 = r3.shootWay
        L4:
            java.lang.String r0 = "story"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            r2 = 1
            if (r0 == 0) goto L1c
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r3.creativeModel
            com.ss.android.ugc.aweme.creative.model.CommonMobParamModel r0 = r0.commonMobModel
            boolean r0 = r0.isUploadDirectEnter
            if (r0 != 0) goto L1b
        L15:
            int r1 = r3.shootMode
            r0 = 20
            if (r1 != r0) goto L1f
        L1b:
            return r2
        L1c:
            if (r3 == 0) goto L1f
            goto L15
        L1f:
            r2 = 0
            goto L1b
        L21:
            r1 = 0
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V16.LJJIJIIJIL(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext):boolean");
    }

    public static final boolean LJJIJIL(ShortVideoContext shortVideoContext) {
        if (!LJJJIL(shortVideoContext) || shortVideoContext == null || shortVideoContext.cameraComponentModel.isMuted) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIJL(Comment comment) {
        User user;
        if (LJJIIZ(comment)) {
            if (comment != null) {
                user = comment.getUser();
            } else {
                user = null;
            }
            if (AV1.LJIJ(user)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJJIJLIJ(ShortVideoContext shortVideoContext) {
        if (shortVideoContext == null || !shortVideoContext.isStory) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIL(ShortVideoContext shortVideoContext) {
        o.LJIIIZ(shortVideoContext, "<this>");
        if (!IMService.createIIMServicebyMonsterPlugin(false).getCameraService().LIZ() || !shortVideoContext.creativeModel.initialModel.dmCameraModel.enterFromDM) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIZ(Comment comment) {
        if (comment == null || comment.getCommentType() != 223) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJ(ShortVideoContext shortVideoContext) {
        HCA hca;
        if (shortVideoContext != null) {
            hca = shortVideoContext.LJII();
        } else {
            hca = null;
        }
        if (hca == null) {
            return false;
        }
        Iterator<TimeSpeedModelExtension> it = shortVideoContext.LJII().iterator();
        while (it.hasNext()) {
            if (it.next().isAudioGraphOutput()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJJJI(ShortVideoContext shortVideoContext) {
        HCA hca;
        if (shortVideoContext != null) {
            hca = shortVideoContext.LJII();
        } else {
            hca = null;
        }
        if (hca == null) {
            return false;
        }
        Iterator<TimeSpeedModelExtension> it = shortVideoContext.LJII().iterator();
        while (it.hasNext()) {
            TimeSpeedModelExtension segment = it.next();
            o.LJIIIIZZ(segment, "segment");
            if (RecordStickerSegmentInfoKt.isUseVoiceRecognizeSticker(segment)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJJJIL(ShortVideoContext shortVideoContext) {
        if (!WJR.LIZ().enableMicButton || shortVideoContext == null || !shortVideoContext.LJJIJIL() || C1DG.LJIIIIZZ()) {
            return false;
        }
        return true;
    }

    public static final C5H3 LJJJJ(InterfaceC65784Pro interfaceC65784Pro) {
        return C221108m2.LIZ(EnumC221088m0.NONE, interfaceC65784Pro);
    }

    public static void LJJJJJ(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("to_status", str);
        FMX.LJIIL("inner_push_setting", hashMap);
    }

    public static final boolean LJJJJLI(ShortVideoContext shortVideoContext) {
        o.LJIIIZ(shortVideoContext, "<this>");
        if (shortVideoContext.shootMode == 20) {
            return true;
        }
        return false;
    }

    public static final C5H3 LJJJJLL(InterfaceC65784Pro initializer) {
        o.LJIIIZ(initializer, "initializer");
        return C221108m2.LIZ(EnumC221088m0.NONE, initializer);
    }

    public static final boolean LJJJJZ(ShortVideoContext shortVideoContext) {
        o.LJIIIZ(shortVideoContext, "<this>");
        if (shortVideoContext.shootMode == 16) {
            return true;
        }
        return false;
    }

    public static final boolean LJJJZ(ShortVideoContext shortVideoContext) {
        o.LJIIIZ(shortVideoContext, "<this>");
        if (!HVI.LIZ()) {
            return false;
        }
        if (shortVideoContext.creativeModel.toUploadAlbum) {
            return true;
        }
        if (HVI.LIZ() && LJIIIZ(shortVideoContext)) {
            return true;
        }
        if (!V18.LIZLLL(shortVideoContext)) {
            return false;
        }
        if (V19.LIZ()) {
            return true;
        }
        return new HZX().LIZ(C60903NvH.LJIIJJI().getAccountService().getCurrentUserID());
    }

    public static final void LJJLIIIIJ(Class cls) {
        GScope gScope = GScope.LJLIL;
        Object newInstance = cls.newInstance();
        o.LJIIIIZZ(newInstance, "eventClz.newInstance()");
        AbstractC63695OzD abstractC63695OzD = (AbstractC63695OzD) newInstance;
        List LJIJ = C62814Ol0.LJIJ(gScope, BaseDownloadParamsGroupProvider.class);
        if (LJIJ != null) {
            Iterator it = ((ArrayList) LJIJ).iterator();
            while (it.hasNext()) {
                InterfaceC54035LIp param = ((EventParamsProtocol) it.next()).getParam();
                if (param != null) {
                    abstractC63695OzD.LJ(param);
                }
            }
        }
        abstractC63695OzD.LJFF();
    }

    public static final boolean LJJLIIIJ(ShortVideoContext shortVideoContext) {
        o.LJIIIZ(shortVideoContext, "<this>");
        if (!C44256HYm.LJIIIIZZ(shortVideoContext)) {
            AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getStoryService();
            if (!C43119Gw7.LIZ() || !C44252HYi.LIZ()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean LJJLIIIJILLIZJL(ShortVideoContext shortVideoContext) {
        if ((shortVideoContext == null || (!shortVideoContext.LJJJI() && ((!shortVideoContext.LJJIJIIJI() || !HEG.LIZJ(shortVideoContext.stitchContext.stitchParams)) && shortVideoContext.cameraComponentModel.recordMode != 1))) && !LJJJIL(shortVideoContext)) {
            return false;
        }
        return true;
    }

    public static final boolean LJJLIIIJJI(ShortVideoContext shortVideoContext) {
        boolean z = false;
        if (shortVideoContext == null) {
            return false;
        }
        if (C52461KiP.LIZ()) {
            String str = shortVideoContext.shootWay;
            if (C52461KiP.LIZ() && ((!e1.LIZ(31744, "enable_entrance_only_from_anchor", true, false) || o.LJ(str, "anchor_combine_voice_conversion")) && C1B8.LIZJ() && !C1DG.LJIIIIZZ() && !shortVideoContext.cameraComponentModel.isRetakeMode && (o.LJ(shortVideoContext.shootWay, "direct_shoot") || o.LJ(shortVideoContext.shootWay, "single_song") || o.LJ(shortVideoContext.shootWay, "answer") || o.LJ(shortVideoContext.shootWay, "prop_page") || o.LJ(shortVideoContext.shootWay, "anchor_combine_voice_conversion") || o.LJ(shortVideoContext.shootWay, "anchor_combine_prop")))) {
                z = true;
            }
        }
        shortVideoContext.getMusicPath();
        return z;
    }

    public static final List LJJLIIIJL(List musicModelList) {
        o.LJIIIZ(musicModelList, "musicModelList");
        ArrayList arrayList = new ArrayList(C32I.LJJL(musicModelList, 10));
        Iterator it = musicModelList.iterator();
        while (it.hasNext()) {
            arrayList.add(new C84934XVa(0, (MusicModel) it.next(), 12));
        }
        return arrayList;
    }

    public static final C223688qC LJJLIIIJLJLI(UpvoteStruct upvoteStruct) {
        String commentId;
        List<CommentImageStruct> imageList;
        String text;
        o.LJIIIZ(upvoteStruct, "<this>");
        C223688qC c223688qC = new C223688qC();
        c223688qC.setAwemeId(upvoteStruct.getItemId());
        String str = null;
        if (upvoteStruct.isFake()) {
            commentId = null;
        } else {
            commentId = upvoteStruct.getCommentId();
        }
        c223688qC.setCid(commentId);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(upvoteStruct.getItemId());
        LIZ2.append('_');
        User user = upvoteStruct.getUser();
        if (user != null) {
            str = user.getUid();
        }
        LIZ2.append(str);
        c223688qC.setFakeId(X1D.LIZIZ(LIZ2));
        c223688qC.setUser(upvoteStruct.getUser());
        c223688qC.setDiggCount(upvoteStruct.getLikeCount());
        c223688qC.setUserDigged(upvoteStruct.getUserLiked() ? 1 : 0);
        c223688qC.isAuthorDigged = upvoteStruct.isAuthorLiked();
        List<Comment> replyComments = upvoteStruct.getReplyComments();
        if (replyComments == null) {
            replyComments = new ArrayList<>();
        }
        c223688qC.setReplyComments(replyComments);
        c223688qC.setReplyCommentTotal(upvoteStruct.getReplyCommentTotal());
        c223688qC.setCreateTime((int) upvoteStruct.getCreateTime());
        boolean z = true;
        c223688qC.setShouldDisplayFakeComment(true);
        c223688qC.setCommentType(223);
        String text2 = upvoteStruct.getText();
        if ((text2 != null && text2.length() != 0) || ((imageList = upvoteStruct.getImageList()) != null && !imageList.isEmpty())) {
            z = false;
        }
        c223688qC.setDefault(z);
        if (c223688qC.isDefault()) {
            text = C86V.LJFF(C7HV.LIZIZ.LJIIJ(R.string.dlp, R.string.q3w));
        } else {
            text = upvoteStruct.getText();
        }
        c223688qC.setText(text);
        List<TextExtraStruct> textExtra = upvoteStruct.getTextExtra();
        if (textExtra == null) {
            textExtra = C61878OQg.INSTANCE;
        }
        c223688qC.setTextExtra(textExtra);
        List<CommentImageStruct> imageList2 = upvoteStruct.getImageList();
        if (imageList2 == null) {
            imageList2 = C61878OQg.INSTANCE;
        }
        c223688qC.setImageList(imageList2);
        c223688qC.setUserBuried(upvoteStruct.getUserBuried() ? 1 : 0);
        c223688qC.setTransBtnStyle(upvoteStruct.getTransBtnStyle());
        c223688qC.setGift(upvoteStruct.getGift());
        c223688qC.setCollectStatus(upvoteStruct.getCollectStat());
        c223688qC.setAuthorPin(upvoteStruct.isAuthorPin());
        return c223688qC;
    }

    public static final List LJJLIIIJLLLLLLLZ(List musicModelList) {
        o.LJIIIZ(musicModelList, "musicModelList");
        ArrayList arrayList = new ArrayList(C32I.LJJL(musicModelList, 10));
        Iterator it = musicModelList.iterator();
        while (it.hasNext()) {
            arrayList.add(new C84934XVa(903, (MusicModel) it.next(), 12));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final SearchCreateModel LJJLIIJ(SearchCreationExtraData searchCreationExtraData) {
        o.LJIIIZ(searchCreationExtraData, "<this>");
        SearchCreateModel searchCreateModel = new SearchCreateModel(false, null, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
        searchCreateModel.setFromSearch(searchCreationExtraData.getSearchDirectShoot());
        searchCreateModel.setHashTags(searchCreationExtraData.getHashtags());
        searchCreateModel.setMobMap(searchCreationExtraData.getMobMap());
        return searchCreateModel;
    }

    public static final int LJJLIL(C32816CuK c32816CuK) {
        int i;
        o.LJIIIZ(c32816CuK, "<this>");
        Iterator<UVP> it = c32816CuK.LIZ.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            UV2 uv2 = it.next().LIZ;
            if (uv2 instanceof C32804Cu8) {
                i = ((C32804Cu8) uv2).LJIIJ();
            } else {
                i = 0;
            }
            i2 += i;
        }
        return i2;
    }

    public static final int LJJLJ(C32816CuK c32816CuK) {
        o.LJIIIZ(c32816CuK, "<this>");
        Iterator<UVP> it = c32816CuK.LIZ.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().LIZ.LIZLLL;
        }
        return i;
    }

    @Override // X.F4Q
    public boolean LIZIZ(String str) {
        Object LIZ2;
        String host;
        if (!ujb.o.LJJJLIIL(str, "http://", false) && !ujb.o.LJJJLIIL(str, "https://", false)) {
            return true;
        }
        try {
            LIZ2 = UriProtector.parse(str);
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th) {
            LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
        }
        if (C3C5.m12isFailureimpl(LIZ2)) {
            LIZ2 = null;
        }
        android.net.Uri uri = (android.net.Uri) LIZ2;
        if (uri == null || (host = uri.getHost()) == null) {
            return true;
        }
        Iterator<String> it = C37660EqG.LIZ.iterator();
        while (it.hasNext()) {
            if (ujb.o.LJJJJ(host, it.next(), false)) {
                return false;
            }
        }
        return true;
    }

    public static int LJII(String str, String str2) {
        int LJJJJIZL;
        int LJJJJIZL2 = LJJJJIZL(35633, str);
        if (LJJJJIZL2 == 0 || (LJJJJIZL = LJJJJIZL(35632, str2)) == 0) {
            return 0;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        if (glCreateProgram != 0) {
            GLES20.glAttachShader(glCreateProgram, LJJJJIZL2);
            LJI();
            GLES20.glAttachShader(glCreateProgram, LJJJJIZL);
            LJI();
            GLES20.glLinkProgram(glCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            if (iArr[0] != 1) {
                GLES20.glDeleteProgram(glCreateProgram);
                return 0;
            }
        }
        return glCreateProgram;
    }

    public static final HashMap LJIIJ(Room room, DataChannel dataChannel) {
        o.LJIIIZ(room, "room");
        if (dataChannel != null) {
            C28837BTl LIZIZ2 = C28835BTj.LIZIZ(null, dataChannel, "");
            LIZIZ2.LJII = room.getOwnerUserId();
            LIZIZ2.LJI = room.getId();
            return C28835BTj.LJI(LIZIZ2);
        }
        return new HashMap();
    }

    public static String LJJJJI(String str, Resources resources) {
        String str2;
        try {
            InputStream open = resources.getAssets().open(str);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = open.read();
                if (read != -1) {
                    byteArrayOutputStream.write(read);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    open.close();
                    str2 = new String(byteArray, "UTF-8");
                    try {
                        str2 = str2.replaceAll("\\r\\n", "\n");
                        return str2;
                    } catch (Exception e) {
                        e = e;
                        C16880lQ.LLLLIIL(e);
                        return str2;
                    }
                }
            }
        } catch (Exception e2) {
            e = e2;
            str2 = null;
        }
    }

    public static int LJJJJIZL(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] == 0) {
                GLES20.glDeleteShader(glCreateShader);
                return 0;
            }
            return glCreateShader;
        }
        return glCreateShader;
    }

    public static void LJJJLIIL(String str, String str2) {
        try {
            if (C2NU.LIZ.LIZIZ()) {
                C198517qh LJIILL = LJIILL(str2);
                LJIILL.LIZ.put("app_language", ((ILanguageService) C58725N2z.LIZIZ(ILanguageService.class)).getAppLanguage());
                LJIILL.LIZ.put("platform", str2);
                LJIILL.LIZ.put("errorDesc", String.valueOf(str));
                LJIILL.LIZ.put("errorUrl", "");
                Q13.LIZIZ("aweme_thirdparty_login_error_rate", 0, LJIILL.LJ());
            }
        } catch (Exception unused) {
        }
    }

    public static final void LJJJLL(Intent intent, ShortVideoContext shortVideoContext) {
        o.LJIIIZ(intent, "<this>");
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        intent.putExtra("is_west_window_exist", shortVideoContext.isWestWindowExistStr);
    }

    public static final void LJJJLZIJ(XRT xrt, List musicModelList) {
        o.LJIIIZ(musicModelList, "musicModelList");
        xrt.LIZIZ("list_data", LJJLIIIJL(musicModelList));
    }

    public static final Object LJJL(InterfaceC65784Pro interfaceC65784Pro, C3CS c3cs) {
        Object LJI = XKX.LJI(C36636EZk.LIZ, new C65552hj(interfaceC65784Pro, null), c3cs);
        if (LJI == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LJI;
        }
        return C76800UCe.LIZ;
    }

    public static final boolean LJJLI(C32816CuK c32816CuK, C32816CuK c32816CuK2) {
        if (c32816CuK.LIZJ == c32816CuK2.LIZJ && c32816CuK.LIZLLL == c32816CuK2.LIZLLL && c32816CuK.LJ == c32816CuK2.LJ && c32816CuK.LJI == c32816CuK2.LJI) {
            return true;
        }
        return false;
    }

    public static final void LJJLIIIJJIZ(LiveSubMediaModel liveSubMediaModel, LiveSubMediaModel liveSubMediaModel2) {
        if (liveSubMediaModel2 == null) {
            return;
        }
        liveSubMediaModel.setFileLocalUriPath(liveSubMediaModel2.getFileLocalUriPath());
        liveSubMediaModel.setWidth(liveSubMediaModel2.getWidth());
        liveSubMediaModel.setHeight(liveSubMediaModel2.getHeight());
        liveSubMediaModel.setFileName(liveSubMediaModel2.getFileName());
        liveSubMediaModel.setWithTextSticker(liveSubMediaModel2.getWithTextSticker());
    }

    public static void LJJLJLI(String str, String str2) {
        MobClick obtain = MobClick.obtain();
        obtain.setEventName("unblock");
        obtain.setLabelName(str);
        obtain.setValue(str2);
        FMX.onEvent(obtain);
    }

    public static void LJFF(String str, String str2, String str3) {
        JSONObject jSONObject;
        if (!TextUtils.isEmpty(str3)) {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("enter_from", str3);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        } else {
            jSONObject = null;
        }
        MobClick obtain = MobClick.obtain();
        obtain.setEventName("block");
        obtain.setLabelName(str);
        obtain.setValue(str2);
        obtain.setJsonObject(jSONObject);
        FMX.onEvent(obtain);
    }

    public static File LJIIJJI(VideoPublishEditModel videoPublishEditModel, EnumC43650HBe resourceType, String str) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        o.LJIIIZ(resourceType, "resourceType");
        InterfaceC43072GvM pathService = C60903NvH.LJIIJJI().LJJIJL().getPathService();
        CreativeInfo creativeInfo = videoPublishEditModel.creativeInfo;
        o.LJIIIIZZ(creativeInfo, "creativeInfo");
        return pathService.LJIIJ(creativeInfo, resourceType, str, true);
    }

    public static final int LJJIII(String str, String str2, String str3) {
        if (C7HX.LIZ()) {
            return 1;
        }
        if (o.LJ(str2, "homepage_hot")) {
            C7HV c7hv = C7HV.LIZIZ;
            if (str == null) {
                str = "";
            }
            if (c7hv.LIZ(str) != null) {
                return 1;
            }
            return 2;
        }
        if (o.LJ(str2, "notification_page") && str3 != null && str3.length() != 0) {
            return 1;
        }
        return 0;
    }

    public static final boolean LJJJJL(String str, Aweme aweme, String str2) {
        String str3;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        InteractPermission interactPermission;
        UpvotePreloadStruct upvotePreload;
        if (aweme == null || (str3 = aweme.getAid()) == null) {
            str3 = "";
        }
        if (aweme != null && (upvotePreload = aweme.getUpvotePreload()) != null && upvotePreload.getNeedPullUpvoteInfo()) {
            z = true;
        } else {
            z = false;
        }
        C7HV c7hv = C7HV.LIZIZ;
        UpvoteList LJIIIZ = c7hv.LJIIIZ(str3);
        if (LJIIIZ != null && LJIIIZ.getTotal() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!o.LJ(str, "homepage_hot") ? !(!o.LJ(str, "notification_page") ? !C7HX.LIZ() || (!z2 && !z) : (str2 == null || str2.length() == 0) && (!C7HX.LIZ() || (!z2 && !z))) : !(c7hv.LIZ(str3) == null && !z2 && (!C7HX.LIZ() || !z))) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (aweme != null && (interactPermission = aweme.getInteractPermission()) != null && interactPermission.getUpvote() == 0) {
            z4 = true;
        } else {
            z4 = false;
            if (aweme == null) {
                z5 = false;
                if (!C7HP.LIZIZ() && aweme != null && !AV1.LJIJ(aweme.getAuthor()) && z3 && z4 && !z5) {
                    return true;
                }
                return false;
            }
        }
        z5 = aweme.isAd();
        if (!C7HP.LIZIZ()) {
            return true;
        }
        return false;
    }

    public static void LJJJJZI(int i, String str, String str2) {
        try {
            if (C2NU.LIZ.LIZIZ()) {
                C198517qh LJIILL = LJIILL(str2);
                LJIILL.LIZ.put("app_language", ((ILanguageService) C58725N2z.LIZIZ(ILanguageService.class)).getAppLanguage());
                LJIILL.LIZ.put("platform", str2);
                LJIILL.LIZ.put("errorCode", String.valueOf(i));
                LJIILL.LIZ.put("errorDesc", String.valueOf(str));
                Q13.LIZIZ("aweme_thirdparty_login_error_rate", 0, LJIILL.LJ());
            }
        } catch (Exception unused) {
        }
    }

    public static final void LJJZZIII(String str, String str2, boolean z) {
        UpvoteList LJIIIZ;
        if (str != null && (LJIIIZ = C7HV.LIZIZ.LJIIIZ(str)) != null) {
            List<UpvoteStruct> upvotes = LJIIIZ.getUpvotes();
            if (upvotes != null) {
                for (UpvoteStruct upvoteStruct : upvotes) {
                    if (o.LJ(upvoteStruct.getCommentId(), str2)) {
                        upvoteStruct.setUserLiked(z);
                    }
                }
            }
            C7HV.LIZIZ.LJIILJJIL().LJI(str, LJIIIZ);
        }
    }

    @Override // X.F4P
    public boolean LIZ(WebView webView, String url, JSInjectConfig jSInjectConfig) {
        o.LJIIIZ(webView, "webView");
        o.LJIIIZ(url, "url");
        return a.LJFF().LJ(webView, jSInjectConfig.name, jSInjectConfig.injectTime, url);
    }

    public static final File LJIIL(VideoPublishEditModel videoPublishEditModel, EnumC43649HBd resourceType, String subPath, boolean z) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        o.LJIIIZ(resourceType, "resourceType");
        o.LJIIIZ(subPath, "subPath");
        InterfaceC43072GvM pathService = C60903NvH.LJIIJJI().LJJIJL().getPathService();
        CreativeInfo creativeInfo = videoPublishEditModel.creativeInfo;
        o.LJIIIIZZ(creativeInfo, "creativeInfo");
        return pathService.LJIILL(creativeInfo, resourceType, subPath, z);
    }

    public static JSONObject LJIJJ(Aweme aweme, String str, String str2, int i) {
        String str3;
        JSONObject LIZ2 = RequestIdService.LJ().LIZ(i, aweme);
        if (str != null) {
            if (LIZ2 == null) {
                LIZ2 = new JSONObject();
            }
            try {
                if (!"update_tips".equals(str2)) {
                    LIZ2.put("enter_from", str2);
                }
                if ("like_banner".equals(str)) {
                    LIZ2.put("previous_page", str);
                } else {
                    LIZ2.put("enter_method", str);
                }
                if (aweme.getAwemeType() == 2) {
                    LIZ2.put("is_photo", 1);
                }
                if (aweme.isAd()) {
                    str3 = "1";
                } else {
                    str3 = CardStruct.IStatusCode.DEFAULT;
                }
                LIZ2.put("is_ad", str3);
                if (aweme.getAwemeType() == 160 || (C54838Lfe.LJJI(aweme) && aweme.getStoryType() == 2)) {
                    LIZ2.put("aweme_type", 160);
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
            return LIZ2;
        }
        throw new IllegalArgumentException();
    }

    public static void LJL(GScope gScope, Long l, Long l2, Integer num, int i) {
        C62844OlU c62844OlU;
        long j;
        long j2;
        int i2;
        Integer num2 = null;
        if ((i & 1) != 0) {
            l = null;
        }
        if ((i & 2) != 0) {
            l2 = null;
        }
        if ((i & 4) == 0) {
            num2 = num;
        }
        o.LJIIIZ(gScope, "<this>");
        InterfaceC55251LmJ LIZLLL = C55247LmF.LIZLLL(gScope, C62844OlU.class, "Download");
        if (LIZLLL != null && (c62844OlU = (C62844OlU) LIZLLL.getSource()) != null) {
            GScope gScope2 = GScope.LJLIL;
            if (l != null) {
                j = l.longValue();
            } else {
                j = c62844OlU.LJLJJL;
            }
            if (l2 != null) {
                j2 = l2.longValue();
            } else {
                j2 = c62844OlU.LJLJJLL;
            }
            if (num2 != null) {
                i2 = num2.intValue();
            } else {
                i2 = c62844OlU.LJLJL;
            }
            String filePrefix = c62844OlU.LJLIL;
            boolean z = c62844OlU.LJLILLLLZI;
            boolean z2 = c62844OlU.LJLJI;
            boolean z3 = c62844OlU.LJLJJI;
            String sourceId = c62844OlU.LJLJLJ;
            o.LJIIIZ(filePrefix, "filePrefix");
            o.LJIIIZ(sourceId, "sourceId");
            C55247LmF.LIZIZ(gScope2, new C62844OlU(filePrefix, z, z2, z3, j, j2, i2, sourceId), C62844OlU.class, "Download");
        }
    }

    public static final void LJJZ(GScope gScope, Long l, Integer num, Integer num2, String str, Integer num3) {
        C62842OlS c62842OlS;
        long j;
        int i;
        int i2;
        String str2 = str;
        Integer num4 = num2;
        o.LJIIIZ(gScope, "<this>");
        InterfaceC55251LmJ LIZLLL = C55247LmF.LIZLLL(gScope, C62842OlS.class, "Download");
        if (LIZLLL != null && (c62842OlS = (C62842OlS) LIZLLL.getSource()) != null) {
            GScope gScope2 = GScope.LJLIL;
            if (l != null) {
                j = l.longValue();
            } else {
                j = c62842OlS.LJLJJLL;
            }
            if (num != null) {
                i = num.intValue();
            } else {
                i = c62842OlS.LJLJL;
            }
            if (num4 == null) {
                num4 = c62842OlS.LJLJLJ;
            }
            if (str2 == null) {
                str2 = c62842OlS.LJLJLLL;
            }
            if (num3 != null) {
                i2 = num3.intValue();
            } else {
                i2 = c62842OlS.LJLL;
            }
            String fromGroupID = c62842OlS.LJLIL;
            String str3 = c62842OlS.LJLILLLLZI;
            HashMap<String, String> hashMap = c62842OlS.LJLJI;
            String str4 = c62842OlS.LJLJJI;
            boolean z = c62842OlS.LJLJJL;
            String sourceId = c62842OlS.LJLLI;
            o.LJIIIZ(fromGroupID, "fromGroupID");
            o.LJIIIZ(sourceId, "sourceId");
            C55247LmF.LIZIZ(gScope2, new C62842OlS(fromGroupID, str3, hashMap, str4, z, j, i, num4, str2, i2, sourceId), C62842OlS.class, "Download");
        }
    }

    public static void LJJLL(GScope gScope, Long l, Long l2, Long l3, Integer num, Integer num2, String str, String str2, int i) {
        C62841OlR c62841OlR;
        long j;
        long j2;
        long j3;
        int i2;
        int i3;
        String str3 = str;
        String str4 = null;
        if ((i & 1) != 0) {
            l = null;
        }
        if ((i & 2) != 0) {
            l2 = null;
        }
        if ((i & 4) != 0) {
            l3 = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        if ((i & 16) != 0) {
            num2 = null;
        }
        if ((i & 32) != 0) {
            str3 = null;
        }
        if ((i & 64) == 0) {
            str4 = str2;
        }
        o.LJIIIZ(gScope, "<this>");
        InterfaceC55251LmJ LIZLLL = C55247LmF.LIZLLL(gScope, C62841OlR.class, "Download");
        if (LIZLLL != null && (c62841OlR = (C62841OlR) LIZLLL.getSource()) != null) {
            GScope gScope2 = GScope.LJLIL;
            if (l != null) {
                j = l.longValue();
            } else {
                j = c62841OlR.LJLJI;
            }
            if (l2 != null) {
                j2 = l2.longValue();
            } else {
                j2 = c62841OlR.LJLJJI;
            }
            if (l3 != null) {
                j3 = l3.longValue();
            } else {
                j3 = c62841OlR.LJLJJL;
            }
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = c62841OlR.LJLJJLL;
            }
            if (num2 != null) {
                i3 = num2.intValue();
            } else {
                i3 = c62841OlR.LJLJL;
            }
            if (str4 == null) {
                str4 = c62841OlR.LJLJLLL;
            }
            int i4 = c62841OlR.LJLIL;
            String downloadUrl = c62841OlR.LJLILLLLZI;
            String sourceId = c62841OlR.LJLL;
            o.LJIIIZ(downloadUrl, "downloadUrl");
            o.LJIIIZ(sourceId, "sourceId");
            C55247LmF.LIZIZ(gScope2, new C62841OlR(i4, downloadUrl, j, j2, j3, i2, i3, str3, str4, sourceId), C62841OlR.class, "Download");
        }
    }
}
