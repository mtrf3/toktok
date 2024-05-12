package X;

import Y.AObserverS72S0100000_4;
import android.graphics.Bitmap;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.ShareToStoryStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import com.ss.android.ugc.aweme.image.model.SrcImageInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.IInfoService;
import com.ss.android.ugc.aweme.services.story.IStoryDraftService;
import com.ss.android.ugc.aweme.services.story.IStoryPublishService;
import com.ss.android.ugc.aweme.services.story.SimplePublishModel;
import com.ss.android.ugc.aweme.services.story.SimplePublishModelKt;
import com.ss.android.ugc.aweme.services.story.StoryCoverExtractConfig;
import com.ss.android.ugc.aweme.services.video.VideoExposureData;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.PhotoModeExposureData;
import com.ss.android.ugc.aweme.shortvideo.model.StoryGroupPublishModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.shortvideo.recoverpanel.PublishFailureReason;
import com.ss.android.ugc.aweme.story.publish.SocialPublishBridgeServiceImpl;
import com.ss.android.ugc.aweme.story.publish.SocialPublishCallback;
import defpackage.i0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.AqS30S1000000_7;
import kotlin.jvm.internal.AqS60S1100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.HLp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43921HLp implements InterfaceC54401LWr, SocialPublishCallback {
    public static float LIZIZ;
    public static int LJFF;
    public static int LJI;
    public static boolean LJII;
    public static final C62822Ol8 LJIIL;
    public static final C43921HLp LIZ = new C43921HLp();
    public static final ConcurrentHashMap<Object, InterfaceC43927HLv> LIZJ = new ConcurrentHashMap<>();
    public static final MutableLiveData<Boolean> LIZLLL = new MutableLiveData<>(Boolean.FALSE);
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(C43929HLx.LJLIL);
    public static final List<C189737cX> LJIIIIZZ = new ArrayList();
    public static final java.util.Map<String, Bitmap> LJIIIZ = new LinkedHashMap();
    public static final C62822Ol8 LJIIJ = C221108m2.LIZIZ(C43930HLy.LJLIL);
    public static final C62822Ol8 LJIIJJI = C221108m2.LIZIZ(C42035Ged.LJLIL);

    static {
        C62822Ol8 LIZIZ2 = C221108m2.LIZIZ(C42036Gee.LJLIL);
        LJIIL = LIZIZ2;
        C221108m2.LIZIZ(HM0.LJLIL);
        if (L1Y.LIZ() || C53196KuG.LIZ() || L7K.LIZ) {
            ((IStoryDraftService) LIZIZ2.getValue()).getStoryDraftList(C43923HLr.LJLIL);
        }
    }

    public static IExternalService LJIILLIIL() {
        Object value = LJIIJ.getValue();
        o.LJIIIIZZ(value, "<get-creationService>(...)");
        return (IExternalService) value;
    }

    public static CopyOnWriteArrayList LJIJ() {
        return (CopyOnWriteArrayList) LJ.getValue();
    }

    @Override // X.InterfaceC54401LWr
    public final boolean LJFF() {
        Iterator<C189737cX> it = LJIIIIZZ.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (it.next().LJLILLLLZI.LIZIZ == EnumC221928nM.FAILED) {
                z = true;
            }
        }
        return z;
    }

    @Override // X.InterfaceC54401LWr
    public final void LIZ() {
        SocialPublishBridgeServiceImpl.LIZ().LJIIJJI(this, C42554Gn0.LJLIL);
    }

    @Override // X.InterfaceC54401LWr
    public final boolean LIZIZ() {
        return LJIILLIIL().storyService().isPostStoryEnable();
    }

    @Override // X.InterfaceC54401LWr
    public final List<Aweme> LIZJ() {
        return LJIJ();
    }

    @Override // X.InterfaceC54401LWr
    public final List<Aweme> LJIIIZ() {
        CopyOnWriteArrayList LJIJ = LJIJ();
        ArrayList arrayList = new ArrayList();
        Iterator it = LJIJ.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Aweme it2 = (Aweme) next;
            C43921HLp c43921HLp = LIZ;
            o.LJIIIIZZ(it2, "it");
            c43921HLp.getClass();
            if (LJIL(it2)) {
                arrayList.add(next);
            }
        }
        return ORZ.LLJILJILJ(arrayList);
    }

    @Override // X.InterfaceC54401LWr
    public final boolean isPublishing() {
        return LJII;
    }

    public static Video LJIILIIL(PublishModel publishModel) {
        BaseShortVideoContext baseShortVideoContext;
        MusicBuzModel musicBuzModel;
        int i;
        int i2;
        double d;
        String str;
        int i3;
        MusicObject musicObject;
        MusicObject musicObject2;
        List<SingleImageData> list;
        SingleImageData singleImageData;
        IInfoService infoService = LJIILLIIL().infoService();
        SrcImageInfo srcImageInfo = null;
        if (publishModel != null) {
            baseShortVideoContext = publishModel.editModel;
        } else {
            baseShortVideoContext = null;
        }
        VideoExposureData convertToExposureData = infoService.convertToExposureData(baseShortVideoContext);
        if (convertToExposureData != null) {
            musicBuzModel = convertToExposureData.getMusicInfo();
            PhotoModeExposureData photoModeExposureData = convertToExposureData.getPhotoModeExposureData();
            if (photoModeExposureData != null && (list = photoModeExposureData.imageList) != null && (singleImageData = (SingleImageData) ORZ.LJLLLL(list)) != null) {
                srcImageInfo = singleImageData.getSrcImageInfo();
            }
        } else {
            musicBuzModel = null;
        }
        Video video = new Video();
        VideoUrlModel videoUrlModel = new VideoUrlModel();
        int i4 = 0;
        if (srcImageInfo != null) {
            i = srcImageInfo.getWidth();
        } else {
            i = 0;
        }
        videoUrlModel.setWidth(i);
        if (srcImageInfo != null) {
            i2 = srcImageInfo.getHeight();
        } else {
            i2 = 0;
        }
        videoUrlModel.setHeight(i2);
        double d2 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        if (musicBuzModel != null && (musicObject2 = musicBuzModel.music) != null) {
            d = musicObject2.duration;
        } else {
            d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        videoUrlModel.setDuration(d);
        if (musicBuzModel == null || (str = musicBuzModel.path) == null) {
            str = "";
        }
        videoUrlModel.setUri(str);
        videoUrlModel.setUrlList(C47261Igj.LJJIJ(videoUrlModel.getUri()));
        videoUrlModel.setUrlKey(videoUrlModel.getUri());
        video.setPlayAddr(videoUrlModel);
        if (srcImageInfo != null) {
            i3 = srcImageInfo.getWidth();
        } else {
            i3 = 0;
        }
        video.setWidth(i3);
        if (srcImageInfo != null) {
            i4 = srcImageInfo.getHeight();
        }
        video.setHeight(i4);
        if (musicBuzModel != null && (musicObject = musicBuzModel.music) != null) {
            d2 = musicObject.duration;
        }
        video.setDuration(d2);
        return video;
    }

    public static PhotoModeImageInfo LJIILJJIL(PublishModel publishModel) {
        BaseShortVideoContext baseShortVideoContext;
        int i;
        int i2;
        String str;
        PhotoModeExposureData photoModeExposureData;
        List<SingleImageData> list;
        SingleImageData singleImageData;
        IInfoService infoService = LJIILLIIL().infoService();
        SrcImageInfo srcImageInfo = null;
        if (publishModel != null) {
            baseShortVideoContext = publishModel.editModel;
        } else {
            baseShortVideoContext = null;
        }
        VideoExposureData convertToExposureData = infoService.convertToExposureData(baseShortVideoContext);
        if (convertToExposureData != null && (photoModeExposureData = convertToExposureData.getPhotoModeExposureData()) != null && (list = photoModeExposureData.imageList) != null && (singleImageData = (SingleImageData) ORZ.LJLLLL(list)) != null) {
            srcImageInfo = singleImageData.getSrcImageInfo();
        }
        UrlModel urlModel = new UrlModel();
        if (srcImageInfo != null) {
            i = srcImageInfo.getWidth();
        } else {
            i = 0;
        }
        urlModel.setWidth(i);
        if (srcImageInfo != null) {
            i2 = srcImageInfo.getHeight();
        } else {
            i2 = 0;
        }
        urlModel.setHeight(i2);
        if (srcImageInfo == null || (str = srcImageInfo.getPath()) == null) {
            str = "";
        } else if (!ujb.o.LJJJLIIL(str, "file://", false) && !ujb.o.LJJJLIIL(str, "http://", false) && !ujb.o.LJJJLIIL(str, "https://", false)) {
            str = i0.LJFF("file://", str);
        }
        urlModel.setUri(str);
        urlModel.setUrlList(C47261Igj.LJJIJ(urlModel.getUri()));
        urlModel.setUrlKey(urlModel.getUri());
        PhotoModeImageInfo photoModeImageInfo = new PhotoModeImageInfo();
        photoModeImageInfo.setImageList(C47261Igj.LJJIJ(new PhotoModeImageUrlModel(urlModel, new UrlModel(), new UrlModel(), new UrlModel(), null, 16, null)));
        return photoModeImageInfo;
    }

    public static String LJIILL(String str) {
        SimplePublishModel simplePublishModel;
        String creationId;
        if (str == null) {
            return "";
        }
        List<C189737cX> list = LJIIIIZZ;
        Object obj = null;
        if (list == null) {
            return "";
        }
        Iterator it = ((ArrayList) list).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (o.LJ(((C189737cX) next).LJLIL.getCreationId(), str)) {
                obj = next;
                break;
            }
        }
        C189737cX c189737cX = (C189737cX) obj;
        if (c189737cX == null || (simplePublishModel = c189737cX.LJLIL) == null || (creationId = simplePublishModel.getCreationId()) == null) {
            return "";
        }
        return creationId;
    }

    public static Aweme LJIIZILJ(String str) {
        Iterator it = LJIJ().iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                Aweme aweme = (Aweme) next;
                if (TextUtils.equals(str, aweme.getScheduleId())) {
                    return aweme;
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        return null;
    }

    public static C189737cX LJIJI(String str) {
        Iterator it = ((ArrayList) LJIIIIZZ).iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                C189737cX c189737cX = (C189737cX) next;
                if (TextUtils.equals(str, c189737cX.LJLIL.getCreationId())) {
                    return c189737cX;
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        return null;
    }

    public static final void LJIJJLI(InterfaceC88472Yns<? super InterfaceC43927HLv, C76800UCe> interfaceC88472Yns) {
        Iterator it = new HashMap(LIZJ).entrySet().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            o.LJIIIIZZ(value, "it.value");
            interfaceC88472Yns.invoke(value);
        }
    }

    public static boolean LJIL(Aweme aweme) {
        Story story;
        Story story2;
        if (!C54838Lfe.LJJI(aweme) || aweme.getStory() == null || (story = aweme.getStory()) == null || story.isFaked() || (story2 = aweme.getStory()) == null || story2.isPublishing() || TextUtils.isEmpty(aweme.getAid())) {
            return false;
        }
        return true;
    }

    public static boolean LJJI(String str) {
        Iterator it = ((ArrayList) LJIIIIZZ).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C189737cX c189737cX = (C189737cX) it.next();
            if (TextUtils.equals(c189737cX.LJLIL.getCreationId(), str)) {
                if (((ArrayList) LJIIIIZZ).remove(c189737cX)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void LJJIFFI(String str) {
        C189737cX LJIJI = LJIJI(str);
        if (LJIJI == null) {
            return;
        }
        ((IStoryDraftService) LJIIL.getValue()).deleteDraft(LJIJI.LJLIL);
    }

    @Override // X.InterfaceC54401LWr
    public final void LIZLLL(String key) {
        o.LJIIIZ(key, "key");
        LIZJ.remove(key);
    }

    @Override // X.InterfaceC54401LWr
    public final int LJ(UserStory userStory) {
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= LJIJ().size()) {
                break;
            }
            Aweme aweme = (Aweme) LJIJ().get(i);
            if (aweme.getCreateTime() != 0) {
                long j = 1000;
                if (userStory.getLastStoryCreatedAt() / j < aweme.getCreateTime()) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("aweme create time: ");
                    LIZ2.append(aweme.getCreateTime());
                    LIZ2.append(", server last create time: ");
                    LIZ2.append(userStory.getLastStoryCreatedAt() / j);
                    LIZ2.append(", userStory instance: ");
                    LIZ2.append(System.identityHashCode(userStory));
                    LIZ2.append(", originTotalCount: ");
                    LIZ2.append(userStory.getOriginTotalCount());
                    C189837ch.LIZ("PublishManager", X1D.LIZIZ(LIZ2));
                    break;
                }
            }
            if (LJIL(aweme)) {
                i2++;
                LJIJ().remove(i);
                i--;
            }
            i++;
        }
        return i2;
    }

    @Override // X.InterfaceC54401LWr
    public final C221958nP LJI(String str) {
        Iterator it = ((ArrayList) LJIIIIZZ).iterator();
        while (it.hasNext()) {
            C189737cX c189737cX = (C189737cX) it.next();
            if (TextUtils.equals(str, c189737cX.LJLIL.getCreationId())) {
                return c189737cX.LJLILLLLZI;
            }
        }
        return null;
    }

    @Override // X.InterfaceC54401LWr
    public final void LJIIIIZZ(String scheduleId) {
        o.LJIIIZ(scheduleId, "scheduleId");
        if (LJJI(scheduleId)) {
            LJI--;
        }
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onPublishStart(PublishModel publishModel) {
        String str;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onPublishStart,creationId:");
        String str2 = null;
        if (publishModel != null) {
            str = publishModel.creationId;
        } else {
            str = null;
        }
        LIZ2.append(str);
        LIZ2.append(",publishId:");
        if (publishModel != null) {
            str2 = publishModel.publishId;
        }
        LIZ2.append(str2);
        X1D.LIZIZ(LIZ2);
        if (publishModel == null) {
            return;
        }
        LJIJJ(C47261Igj.LJJIJ(SimplePublishModelKt.convert2SimplePublishModel(publishModel)), EnumC221928nM.UPLOADING, "", C43925HLt.LJLIL);
        LJI = ((ArrayList) LJIIIIZZ).size();
        LJIJJLI(C43928HLw.LJLIL);
        User LIZIZ2 = AV1.LIZIZ();
        if (LIZIZ2 != null) {
            LIZIZ2.getUid();
        }
        LJII = true;
        LIZLLL.postValue(Boolean.TRUE);
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onReadyToCreateAweme(PublishModel publishModel) {
        String str;
        C41826GbG LIZJ2;
        if (publishModel == null || (LIZJ2 = C41825GbF.LIZJ((str = publishModel.creationId))) == null) {
            return;
        }
        if (L1F.LIZIZ()) {
            if (LIZJ2.LJ) {
                C41825GbF.LIZ(str);
                return;
            } else {
                LIZJ2.LJFF = true;
                return;
            }
        }
        C41825GbF.LIZ(str);
    }

    public static boolean LJJII(ActivityC45651qj activityC45651qj, String str) {
        C189737cX LJIJI = LJIJI(str);
        if (LJIJI == null || LJIJI.LJLILLLLZI.LIZIZ != EnumC221928nM.FAILED) {
            return false;
        }
        ((IStoryPublishService) LJIIJJI.getValue()).retryPublish(activityC45651qj, LJIJI.LJLIL, new PublishFailureReason(null, false, C76C.AVATAR.name(), null), new AqS169S0100000_3(LJIJI, 835));
        return true;
    }

    @Override // X.InterfaceC54401LWr
    public final void LJII(LifecycleOwner lifecycleOwner, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        LIZLLL.observe(lifecycleOwner, new AObserverS72S0100000_4(interfaceC88472Yns, 39));
    }

    @Override // X.InterfaceC54401LWr
    public final void LJIIJ(String scheduleId, boolean z) {
        o.LJIIIZ(scheduleId, "scheduleId");
        boolean LJJI = LJJI(scheduleId);
        Iterator it = LJIJ().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Aweme aweme = (Aweme) it.next();
            if (TextUtils.equals(scheduleId, aweme.getScheduleId())) {
                LJIJ().remove(aweme);
                break;
            }
        }
        LJIIIZ.remove(scheduleId);
        if (z) {
            LJIJJLI(new AqS30S1000000_7(scheduleId, 8));
        }
        if (LJJI) {
            LJI--;
        }
    }

    @Override // X.InterfaceC54401LWr
    public final void LJIIL(Object key, InterfaceC43927HLv storyPublishCallback) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(storyPublishCallback, "storyPublishCallback");
        LIZJ.put(key, storyPublishCallback);
    }

    public final void LJJ(EnumC221928nM enumC221928nM, PublishModel publishModel) {
        String str;
        String str2 = publishModel.creationId;
        C189737cX LJIJI = LJIJI(str2);
        if (LJIJI == null) {
            return;
        }
        C221958nP c221958nP = LJIJI.LJLILLLLZI;
        c221958nP.getClass();
        o.LJIIIZ(enumC221928nM, "<set-?>");
        c221958nP.LIZIZ = enumC221928nM;
        User LIZIZ2 = AV1.LIZIZ();
        if (LIZIZ2 != null) {
            str = LIZIZ2.getUid();
        } else {
            str = null;
        }
        if (enumC221928nM == EnumC221928nM.SUCCESS && !TextUtils.isEmpty(str)) {
            LJFF++;
            Aweme LJI2 = C54794Lew.LIZ.LJI();
            C55723Ltv c55723Ltv = C55723Ltv.LIZIZ;
            c55723Ltv.LJIL().LIZJ(LJI2, null, false);
            c55723Ltv.LJIL().LIZJ(LJI2, null, false);
        }
        LJIJJLI(new AqS60S1100000_7(str2, LJIJI, 9));
        Iterator it = ((ArrayList) LJIIIIZZ).iterator();
        boolean z = true;
        while (it.hasNext()) {
            if (((C189737cX) it.next()).LJLILLLLZI.LIZIZ == EnumC221928nM.UPLOADING) {
                z = false;
            }
        }
        if (z) {
            if (LJFF()) {
                enumC221928nM = EnumC221928nM.FAILED;
            }
            LJFF = 0;
            LJII = false;
            LIZLLL.postValue(Boolean.FALSE);
            LJIJJLI(new AqS173S0100000_7(enumC221928nM, 345));
            if (enumC221928nM == EnumC221928nM.SUCCESS && LJI > 0) {
                LJIJJLI(C43926HLu.LJLIL);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onPublishProgress(int i, PublishModel publishModel) {
        String str;
        String str2;
        StringBuilder LJ2 = C7MY.LJ("onPublishProgress,progress:", i, ",creationId:");
        String str3 = null;
        if (publishModel != null) {
            str = publishModel.creationId;
        } else {
            str = null;
        }
        LJ2.append(str);
        LJ2.append(",publishId:");
        if (publishModel != null) {
            str3 = publishModel.publishId;
        }
        LJ2.append(str3);
        X1D.LIZIZ(LJ2);
        if (publishModel == null || (str2 = publishModel.creationId) == null) {
            str2 = "";
        }
        C189737cX LJIJI = LJIJI(str2);
        if (LJIJI == null) {
            return;
        }
        LJIJI.LJLILLLLZI.LIZ = i / 100.0f;
        ArrayList arrayList = (ArrayList) LJIIIIZZ;
        int size = arrayList.size();
        int i2 = LJFF;
        float f = size + i2;
        float f2 = i2 * 1.0f;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            f2 += ((C189737cX) it.next()).LJLILLLLZI.LIZ;
        }
        LIZIZ = f2 / f;
        LJIJJLI(new AqS60S1100000_7(str2, LJIJI, 10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bb, code lost:
    
        r0 = com.ss.android.ugc.aweme.awemeservice.AwemeService.LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bf, code lost:
    
        if (r0 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c1, code lost:
    
        r0.R1(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c4, code lost:
    
        X.C43921HLp.LJIIIZ.remove(r3);
     */
    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPublishSuccess(com.ss.android.ugc.aweme.shortvideo.publish.PublishModel r8, com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse r9) {
        /*
            r7 = this;
            java.lang.String r0 = "createAwemeResponse"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "onPublishSuccess,creationId:"
            r1.append(r0)
            r6 = 0
            if (r8 == 0) goto L2a
            java.lang.String r0 = r8.creationId
        L13:
            r1.append(r0)
            java.lang.String r0 = ",publishId:"
            r1.append(r0)
            if (r8 == 0) goto L28
            java.lang.String r0 = r8.publishId
        L1f:
            r1.append(r0)
            X.X1D.LIZIZ(r1)
            if (r8 != 0) goto L2c
            return
        L28:
            r0 = r6
            goto L1f
        L2a:
            r0 = r6
            goto L13
        L2c:
            java.lang.String r3 = r8.creationId
            com.ss.android.ugc.aweme.base.api.BaseResponse$ServerTimeExtra r0 = r9.extra
            if (r0 == 0) goto L36
            java.lang.String r1 = r0.logid
            if (r1 != 0) goto L38
        L36:
            java.lang.String r1 = ""
        L38:
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r9.aweme
            if (r4 != 0) goto L42
        L3c:
            X.8nM r0 = X.EnumC221928nM.SUCCESS
            r7.LJJ(r0, r8)
            return
        L42:
            X.7cX r0 = LJIJI(r3)
            if (r0 != 0) goto L49
            goto L3c
        L49:
            r4.setRequestId(r1)
            r4.setScheduleId(r3)
            X.8nP r0 = r0.LJLILLLLZI
            r0.LIZLLL = r4
            java.util.concurrent.CopyOnWriteArrayList r0 = LJIJ()
            java.util.Iterator r2 = r0.iterator()
            r5 = 0
        L5c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lbb
            java.lang.Object r0 = r2.next()
            int r1 = r5 + 1
            if (r5 < 0) goto Ldd
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            java.lang.String r0 = r0.getScheduleId()
            boolean r0 = android.text.TextUtils.equals(r3, r0)
            if (r0 == 0) goto Ldb
            X.HLp r0 = X.C43921HLp.LIZ
            r0.getClass()
            java.util.concurrent.CopyOnWriteArrayList r0 = LJIJ()
            int r0 = r0.size()
            if (r5 >= r0) goto Lbb
            java.util.concurrent.CopyOnWriteArrayList r0 = LJIJ()
            java.lang.Object r0 = r0.get(r5)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            com.ss.android.ugc.aweme.feed.model.story.Story r1 = r4.getStory()
            if (r1 != 0) goto Lcb
        L95:
            com.ss.android.ugc.aweme.feed.model.story.Story r0 = r4.getStory()
            if (r0 == 0) goto Lb4
            boolean r1 = r0.getViewed()
            r0 = 1
            if (r1 != r0) goto Lb4
            X.Ltv r0 = X.C55723Ltv.LIZIZ
            X.8na r2 = r0.LJIJ()
            java.lang.String r1 = r4.getAid()
            java.lang.String r0 = "aweme.aid"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r2.reportStoryViewed(r1)
        Lb4:
            java.util.concurrent.CopyOnWriteArrayList r0 = LJIJ()
            r0.set(r5, r4)
        Lbb:
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r0 = com.ss.android.ugc.aweme.awemeservice.AwemeService.LIZ()
            if (r0 == 0) goto Lc4
            r0.R1(r4)
        Lc4:
            java.util.Map<java.lang.String, android.graphics.Bitmap> r0 = X.C43921HLp.LJIIIZ
            r0.remove(r3)
            goto L3c
        Lcb:
            com.ss.android.ugc.aweme.feed.model.story.Story r0 = r0.getStory()
            if (r0 == 0) goto Ld9
            boolean r0 = r0.getViewed()
        Ld5:
            r1.setViewed(r0)
            goto L95
        Ld9:
            r0 = 0
            goto Ld5
        Ldb:
            r5 = r1
            goto L5c
        Ldd:
            X.C47261Igj.LJJJJJ()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43921HLp.onPublishSuccess(com.ss.android.ugc.aweme.shortvideo.publish.PublishModel, com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse):void");
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onSynthetiseSuccess(PublishModel publishModel, String path) {
        String str;
        o.LJIIIZ(path, "path");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onSynthetiseSuccess,path:");
        LIZ2.append(path);
        LIZ2.append(",creationId:");
        String str2 = null;
        if (publishModel != null) {
            str = publishModel.creationId;
        } else {
            str = null;
        }
        LIZ2.append(str);
        LIZ2.append(",publishId:");
        if (publishModel != null) {
            str2 = publishModel.publishId;
        }
        LIZ2.append(str2);
        X1D.LIZIZ(LIZ2);
        if (publishModel == null || !publishModel.isStoryPublish || publishModel.videoType != 11) {
            LJIILLIIL().abilityService().infoService().videoInfo(path, true, new C43922HLq(publishModel, path));
            return;
        }
        String str3 = publishModel.creationId;
        if (str3 == null) {
            str3 = "";
        }
        Aweme LJIIZILJ = LJIIZILJ(str3);
        if (LJIIZILJ == null) {
            return;
        }
        LIZ.getClass();
        LJIIZILJ.setVideo(LJIILIIL(publishModel));
        LJIIZILJ.setPhotoModeImageInfo(LJIILJJIL(publishModel));
        String scheduleId = LJIIZILJ.getScheduleId();
        o.LJIIIIZZ(scheduleId, "scheduleId");
        LJIJJLI(new AqS30S1000000_7(scheduleId, 9));
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onPublishFailed(PublishModel publishModel, C41759GaB exception, String errorMsg) {
        String str;
        C189737cX LJIJI;
        o.LJIIIZ(exception, "exception");
        o.LJIIIZ(errorMsg, "errorMsg");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onPublishFailed,creationId:");
        String str2 = null;
        if (publishModel != null) {
            str = publishModel.creationId;
        } else {
            str = null;
        }
        LIZ2.append(str);
        LIZ2.append(",publishId:");
        if (publishModel != null) {
            str2 = publishModel.publishId;
        }
        LIZ2.append(str2);
        X1D.LIZIZ(LIZ2);
        if (publishModel == null || (LJIJI = LJIJI(publishModel.creationId)) == null) {
            return;
        }
        C221958nP c221958nP = LJIJI.LJLILLLLZI;
        c221958nP.getClass();
        c221958nP.LIZJ = errorMsg;
        LJJ(EnumC221928nM.FAILED, publishModel);
    }

    public static void LJIJJ(List list, EnumC221928nM enumC221928nM, String str, InterfaceC88472Yns interfaceC88472Yns) {
        C221958nP c221958nP;
        String str2;
        int i;
        ShareToStoryStruct shareToStoryStruct;
        Video video;
        Integer valueOf;
        StoryGroupPublishModel storyGroupPublishModel;
        List<C189737cX> list2 = LJIIIIZZ;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list2, 10));
        Iterator it = ((ArrayList) list2).iterator();
        while (it.hasNext()) {
            arrayList.add(((C189737cX) it.next()).LJLIL.getCreationId());
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            SimplePublishModel simplePublishModel = (SimplePublishModel) it2.next();
            PhotoModeImageInfo photoModeImageInfo = null;
            if (arrayList.contains(simplePublishModel.getCreationId())) {
                C43921HLp c43921HLp = LIZ;
                String creationId = simplePublishModel.getCreationId();
                c43921HLp.getClass();
                C189737cX LJIJI = LJIJI(creationId);
                if (LJIJI != null && (c221958nP = LJIJI.LJLILLLLZI) != null) {
                    o.LJIIIZ(enumC221928nM, "<set-?>");
                    c221958nP.LIZIZ = enumC221928nM;
                }
            } else {
                LIZ.getClass();
                ((IStoryPublishService) LJIIJJI.getValue()).getCover(simplePublishModel, new StoryCoverExtractConfig(0, 0, 0, 7, null), new AqS173S0100000_7(simplePublishModel, 344));
                C221958nP c221958nP2 = new C221958nP(0);
                Aweme aweme = new Aweme();
                aweme.setAid(simplePublishModel.getCreationId());
                PublishModel publishModel = simplePublishModel.getPublishModel();
                if (publishModel == null || (storyGroupPublishModel = publishModel.storyGroupPublishModel) == null || (str2 = storyGroupPublishModel.groupId) == null) {
                    str2 = "";
                }
                aweme.setBatchId(str2);
                PublishModel publishModel2 = simplePublishModel.getPublishModel();
                if (publishModel2 == null || (valueOf = Integer.valueOf(publishModel2.videoType)) == null || valueOf.intValue() != 11) {
                    i = 40;
                } else {
                    i = 152;
                }
                aweme.setAwemeType(i);
                aweme.setStory(new Story(0L, false, 0L, false, false, 0L, false, false, true, 255, null));
                aweme.setStoryType(CastIntegerProtector.parseInt(simplePublishModel.getStoryType()));
                aweme.setScheduleId(simplePublishModel.getCreationId());
                aweme.setAuthor(AV1.LIZIZ());
                aweme.setCreateTime(System.currentTimeMillis() / 1000);
                PublishModel publishModel3 = simplePublishModel.getPublishModel();
                if (publishModel3 != null && interfaceC88472Yns != null && (video = (Video) interfaceC88472Yns.invoke(publishModel3)) != null) {
                    aweme.setVideo(video);
                }
                aweme.setIsTikTokStory(true);
                if (o.LJ(simplePublishModel.getShootWay(), "share_to_story")) {
                    if (C54838Lfe.LJIIL(simplePublishModel.getPublishModel())) {
                        shareToStoryStruct = new ShareToStoryStruct(1, 1);
                    } else {
                        shareToStoryStruct = new ShareToStoryStruct(1, 0);
                    }
                } else {
                    shareToStoryStruct = null;
                }
                aweme.setShareToStoryInfo(shareToStoryStruct);
                PublishModel publishModel4 = simplePublishModel.getPublishModel();
                if (publishModel4 != null) {
                    photoModeImageInfo = LJIILJJIL(publishModel4);
                }
                aweme.setPhotoModeImageInfo(photoModeImageInfo);
                c221958nP2.LIZLLL = aweme;
                o.LJIIIZ(enumC221928nM, "<set-?>");
                c221958nP2.LIZIZ = enumC221928nM;
                o.LJIIIZ(str, "<set-?>");
                c221958nP2.LIZJ = str;
                C189737cX c189737cX = new C189737cX(simplePublishModel, c221958nP2);
                ((ArrayList) LJIIIIZZ).add(c189737cX);
                Aweme aweme2 = c189737cX.LJLILLLLZI.LIZLLL;
                if (aweme2 != null) {
                    String creationId2 = simplePublishModel.getCreationId();
                    if (C54838Lfe.LJIIZILJ(aweme2)) {
                        CopyOnWriteArrayList LJIJ = LJIJ();
                        if (!(LJIJ instanceof Collection) || !LJIJ.isEmpty()) {
                            Iterator it3 = LJIJ.iterator();
                            while (it3.hasNext()) {
                                if (o.LJ(((Aweme) it3.next()).getAid(), aweme2.getAid())) {
                                    break;
                                }
                            }
                        }
                        IAwemeService LIZ2 = AwemeService.LIZ();
                        if (LIZ2 != null) {
                            LIZ2.R1(aweme2);
                        }
                        aweme2.setScheduleId(creationId2);
                        LJIJ().add(aweme2);
                    }
                }
            }
        }
    }
}
