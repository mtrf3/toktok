package Y;

import X.AbstractC43665HBt;
import X.C10K;
import X.C145995oB;
import X.C1B3;
import X.C1B6;
import X.C1I0;
import X.C34414Df0;
import X.C41809Gaz;
import X.C41811Gb1;
import X.C42117Gfx;
import X.C42299Git;
import X.C42307Gj1;
import X.C42348Gjg;
import X.C42560Gn6;
import X.C43117Gw5;
import X.C43653HBh;
import X.C43756HFg;
import X.C43910HLe;
import X.C44208HWq;
import X.C44228HXk;
import X.C44384HbQ;
import X.C44687HgJ;
import X.C44729Hgz;
import X.C45628HvU;
import X.C45804HyK;
import X.C56548MHg;
import X.C56552MHk;
import X.C60903NvH;
import X.C74391THn;
import X.C76800UCe;
import X.C78764Uvg;
import X.C78880UxY;
import X.C84386X9y;
import X.GJO;
import X.GXR;
import X.HCA;
import X.HG7;
import X.HGC;
import X.HHI;
import X.I37;
import X.IBD;
import X.ICT;
import X.InterfaceC73367Sqp;
import X.InterfaceC88472Yns;
import X.OSZ;
import X.WM7;
import X.X1D;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.assem.ToolsActivityAssem;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.beauty.ComposerBeautyBuriedInfo;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.music.api.MusicDetailApi;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IDLCallbackS60S0100000_7;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifEditActivity;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.cut.VEMediaParserFrameProviderImpl;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewVideoScene;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.model.BackgroundVideo;
import com.ss.android.ugc.aweme.tools.extract.video.VideoFramesUploadService;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS189S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class ACallableS84S0200000_7 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;

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
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS84S0200000_7 aCallableS84S0200000_7) {
        Bitmap LJFF;
        C43117Gw5 c43117Gw5 = C43117Gw5.LIZ;
        CreativeInfo creativeInfo = (CreativeInfo) aCallableS84S0200000_7.l0;
        c43117Gw5.getClass();
        String LJFF2 = C43117Gw5.LJFF(creativeInfo);
        if (!C1B6.LIZIZ(LJFF2)) {
            C1I0.LIZJ(LJFF2);
        }
        for (MediaModel mediaModel : (List) aCallableS84S0200000_7.l1) {
            C43117Gw5 c43117Gw52 = C43117Gw5.LIZ;
            String str = mediaModel.fileLocalUriPath;
            c43117Gw52.getClass();
            if (C43117Gw5.LJIIIZ(str) && (LJFF = C42307Gj1.LJFF(720, 1280, C42307Gj1.LIZIZ(str), 4, str)) != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(LJFF2);
                LIZ.append(C43117Gw5.LJIIIIZZ());
                String LIZIZ = X1D.LIZIZ(LIZ);
                C42299Git.LJFF(LJFF, new File(LIZIZ), 50, Bitmap.CompressFormat.PNG);
                C42307Gj1.LIZLLL(LJFF);
                if (LIZIZ != null) {
                    mediaModel.fileLocalUriPath = LIZIZ;
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$1(ACallableS84S0200000_7 aCallableS84S0200000_7) {
        C43117Gw5 c43117Gw5 = C43117Gw5.LIZ;
        CreativeInfo creativeInfo = (CreativeInfo) aCallableS84S0200000_7.l0;
        c43117Gw5.getClass();
        String LJFF = C43117Gw5.LJFF(creativeInfo);
        if (!C1B6.LIZIZ(LJFF)) {
            C1I0.LIZJ(LJFF);
        }
        if (C42117Gfx.LIZJ()) {
            for (VideoSegment videoSegment : (List) aCallableS84S0200000_7.l1) {
                C43117Gw5.LIZ.getClass();
                if (C42117Gfx.LIZJ()) {
                    double d = videoSegment.height;
                    double d2 = videoSegment.width;
                    if (d > d2 * 2.4d) {
                        int LIZIZ = C42307Gj1.LIZIZ(videoSegment.LJII(false));
                        String LJII = videoSegment.LJII(false);
                        int i = videoSegment.width;
                        Bitmap LJFF2 = C42307Gj1.LJFF(i, (int) (i * 2.4d), LIZIZ, 1, LJII);
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(LJFF);
                        LIZ.append(C43117Gw5.LJIIIIZZ());
                        String LIZIZ2 = X1D.LIZIZ(LIZ);
                        if (C42307Gj1.LJ(LJFF2, new File(LIZIZ2), 100, Bitmap.CompressFormat.PNG)) {
                            videoSegment.LJIIL(LIZIZ2);
                            videoSegment.height = (int) (videoSegment.width * 2.4d);
                        }
                    } else if (d2 > d * 2.4d) {
                        int LIZIZ3 = C42307Gj1.LIZIZ(videoSegment.LJII(false));
                        String LJII2 = videoSegment.LJII(false);
                        int i2 = videoSegment.height;
                        Bitmap LJFF3 = C42307Gj1.LJFF((int) (i2 * 2.4d), i2, LIZIZ3, 1, LJII2);
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(LJFF);
                        LIZ2.append(C43117Gw5.LJIIIIZZ());
                        String LIZIZ4 = X1D.LIZIZ(LIZ2);
                        if (C42307Gj1.LJ(LJFF3, new File(LIZIZ4), 100, Bitmap.CompressFormat.PNG)) {
                            videoSegment.LJIIL(LIZIZ4);
                            videoSegment.width = (int) (videoSegment.height * 2.4d);
                        }
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$10(ACallableS84S0200000_7 aCallableS84S0200000_7) {
        ((C84386X9y) ((VEMediaParserFrameProviderImpl) ((ARunnableS2S2201000_7) ((AqS189S0100000_7) aCallableS84S0200000_7.l0).l0).l2).LJLJJL.getValue()).LIZJ(((ARunnableS2S2201000_7) ((AqS189S0100000_7) aCallableS84S0200000_7.l0).l0).s0, new C42348Gjg(((Bitmap) aCallableS84S0200000_7.l1).getWidth(), ((Bitmap) aCallableS84S0200000_7.l1).getHeight(), (Bitmap) aCallableS84S0200000_7.l1), C34414Df0.LJLIL);
        return C76800UCe.LIZ;
    }

    public static final Object call$11(ACallableS84S0200000_7 aCallableS84S0200000_7) {
        C41811Gb1 c41811Gb1;
        C41809Gaz c41809Gaz = (C41809Gaz) aCallableS84S0200000_7.l0;
        ExtractFramesModel extractFramesModel = (ExtractFramesModel) aCallableS84S0200000_7.l1;
        c41809Gaz.getClass();
        C43756HFg c43756HFg = new C43756HFg();
        VideoFramesUploadService videoFramesUploadService = new VideoFramesUploadService();
        HG7 hg7 = new HG7(HGC.WATERMARK_MODERATION, new AqS157S0100000_7(extractFramesModel, 510));
        VideoPublishEditModel videoPublishEditModel = c41809Gaz.LJFF;
        Integer num = null;
        if (videoPublishEditModel != null) {
            C45804HyK.LJJIJIL(videoPublishEditModel, extractFramesModel, true);
            VideoPublishEditModel videoPublishEditModel2 = c41809Gaz.LJFF;
            if (videoPublishEditModel2 != null) {
                C10K LJFF = C43756HFg.LIZ(hg7, videoPublishEditModel2, null).LJFF(new AgS75S0300000_7(c43756HFg, hg7, c41809Gaz, 3)).LJFF(new AgS75S0300000_7(c43756HFg, hg7, c41809Gaz, 4)).LIZLLL(new AgS110S0200000_7(c41809Gaz, extractFramesModel, 6)).LJFF(new AgS110S0200000_7(videoFramesUploadService, hg7, 7)).LJFF(new AgS110S0200000_7(c41809Gaz, videoFramesUploadService, 8)).LJFF(new AgS124S0100000_7(c41809Gaz, 23));
                try {
                    LJFF.LJIJI();
                    BaseResponse baseResponse = (BaseResponse) LJFF.LJIIJJI();
                    if (LJFF.LJIILJJIL() || baseResponse == null || baseResponse.status_code != 0) {
                        if (LJFF.LJIILJJIL()) {
                            Exception LJIIJ = LJFF.LJIIJ();
                            if (!(LJIIJ instanceof C41811Gb1) || (c41811Gb1 = (C41811Gb1) LJIIJ) == null) {
                                c41811Gb1 = new C41811Gb1(20002, null, LJFF.LJIIJ(), 2, null);
                            }
                        } else {
                            if (baseResponse != null) {
                                num = Integer.valueOf(baseResponse.status_code);
                            }
                            c41811Gb1 = new C41811Gb1(20003, String.valueOf(num), null, 4, null);
                        }
                        c41809Gaz.LJIIJJI(c41811Gb1);
                    } else {
                        c41809Gaz.LJIIL(baseResponse);
                    }
                } catch (InterruptedException unused) {
                    c41809Gaz.LJIIJJI(new C41811Gb1(20000, null, null, 6, null));
                } catch (Exception e) {
                    c41809Gaz.LJIIJJI(new C41811Gb1(20001, null, e, 2, null));
                }
                return C76800UCe.LIZ;
            }
            o.LJIJI("editModel");
            throw null;
        }
        o.LJIJI("editModel");
        throw null;
    }

    public static final Object call$12(ACallableS84S0200000_7 aCallableS84S0200000_7) {
        String path = new File(C43653HBh.LIZLLL(((AbstractC43665HBt) aCallableS84S0200000_7.l0).LJLILLLLZI).getPath(), "video_front.jpg").getPath();
        Bitmap bitmap = (Bitmap) aCallableS84S0200000_7.l1;
        o.LJIIIIZZ(path, "path");
        C44729Hgz.LJJJJLI(bitmap, path, Bitmap.CompressFormat.JPEG, 4);
        ((AbstractC43665HBt) aCallableS84S0200000_7.l0).LJLLI.frontImagePath = path;
        return path;
    }

    public static final Object call$13(ACallableS84S0200000_7 aCallableS84S0200000_7) {
        String str;
        List<String> urlList;
        C74391THn c74391THn = (C74391THn) aCallableS84S0200000_7.l0;
        Effect effect = (Effect) aCallableS84S0200000_7.l1;
        c74391THn.getClass();
        UrlModel hintIcon = effect.getHintIcon();
        boolean z = true;
        if (hintIcon == null || (urlList = hintIcon.getUrlList()) == null || urlList.isEmpty()) {
            str = null;
        } else {
            str = (String) ListProtector.get(urlList, 0);
        }
        if (TextUtils.isEmpty(str) || C78764Uvg.LJIIL(UriProtector.parse(str))) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object call$14(ACallableS84S0200000_7 aCallableS84S0200000_7) {
        BackgroundVideo backgroundVideo;
        HCA hca = (HCA) aCallableS84S0200000_7.l0;
        BackgroundVideo backgroundVideo2 = (BackgroundVideo) aCallableS84S0200000_7.l1;
        Iterator<TimeSpeedModelExtension> it = hca.iterator();
        while (it.hasNext()) {
            TimeSpeedModelExtension next = it.next();
            if (next != null && (backgroundVideo = next.getBackgroundVideo()) != null && !o.LJ(backgroundVideo, backgroundVideo2)) {
                HHI.LIZ(backgroundVideo.getVideoPath(), backgroundVideo.getAudioPath());
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$15(ACallableS84S0200000_7 aCallableS84S0200000_7) {
        ((IBD) aCallableS84S0200000_7.l0).LIZ((ICT) aCallableS84S0200000_7.l1);
        return C76800UCe.LIZ;
    }

    public static final Object call$16(ACallableS84S0200000_7 aCallableS84S0200000_7) {
        GJO gjo = (GJO) aCallableS84S0200000_7.l0;
        CreativeInfo creativeInfo = (CreativeInfo) aCallableS84S0200000_7.l1;
        synchronized (gjo) {
            o.LJIIIZ(creativeInfo, "creativeInfo");
            C44687HgJ.LJIILIIL(C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJJIIZI(creativeInfo));
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cf, code lost:
    
        if (r2 != null) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$17(Y.ACallableS84S0200000_7 r23) {
        /*
            Method dump skipped, instructions count: 641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS84S0200000_7.call$17(Y.ACallableS84S0200000_7):java.lang.Object");
    }

    public static final Object call$18(ACallableS84S0200000_7 aCallableS84S0200000_7) {
        C43910HLe c43910HLe = (C43910HLe) aCallableS84S0200000_7.l0;
        Effect effect = (Effect) aCallableS84S0200000_7.l1;
        String LIZIZ = c43910HLe.LIZIZ(0);
        if (LIZIZ != null) {
            C145995oB c145995oB = new C145995oB();
            C43910HLe.LIZ(c145995oB, LIZIZ);
            Object LJJIIZI = C78880UxY.LJJIIZI(C78880UxY.LJLILLLLZI(((I37) c43910HLe.LJLJJLL.LIZ(c43910HLe, C43910HLe.LJLJLJ[0])).f7().r7()), ComposerBeautyBuriedInfo.class);
            o.LJIIIIZZ(LJJIIZI, "fromJson(strCopy, Compos…tyBuriedInfo::class.java)");
            ComposerBeautyBuriedInfo composerBeautyBuriedInfo = (ComposerBeautyBuriedInfo) LJJIIZI;
            ShortVideoContext shortVideoContext = c43910HLe.LJLJJI;
            if (shortVideoContext != null) {
                c145995oB.LIZLLL("enter_from", shortVideoContext.enterFrom);
                c145995oB.LIZLLL("shoot_way", shortVideoContext.shootWay);
                c145995oB.LIZLLL("creation_id", shortVideoContext.LJI());
            }
            c145995oB.LIZLLL("effect_sticker_id", effect.getEffectId());
            c145995oB.LIZLLL("resource_id", effect.getResourceId());
            c145995oB.LIZLLL(WM7.SCENE_SERVICE, c43910HLe.LJLIL);
            String str = c43910HLe.LJLILLLLZI;
            if (str != null) {
                c145995oB.LIZLLL("camera_type", str);
            }
            c145995oB.LIZ(C44228HXk.LIZJ(), "beautify_used");
            c145995oB.LIZ(C44228HXk.LJIIIIZZ(composerBeautyBuriedInfo), "is_composer");
            c145995oB.LIZ(C44228HXk.LIZIZ(composerBeautyBuriedInfo, C44228HXk.LIZLLL), "beauty_status");
            c145995oB.LIZLLL("beautify_info", C44228HXk.LJII(composerBeautyBuriedInfo));
            GXR.LIZ("tool_performance_effect_status", c145995oB.LIZ);
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$19(ACallableS84S0200000_7 aCallableS84S0200000_7) {
        ((CountDownLatch) aCallableS84S0200000_7.l0).await();
        MutableLiveData mutableLiveData = ((C42560Gn6) aCallableS84S0200000_7.l1).LJ;
        o.LJII(mutableLiveData, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<kotlin.Unit>");
        C76800UCe c76800UCe = C76800UCe.LIZ;
        mutableLiveData.postValue(c76800UCe);
        return c76800UCe;
    }

    public static final Object call$2(ACallableS84S0200000_7 aCallableS84S0200000_7) {
        Iterator<Effect> it = ((CategoryEffectModel) aCallableS84S0200000_7.l1).getEffects().iterator();
        while (it.hasNext()) {
            ((InterfaceC73367Sqp) aCallableS84S0200000_7.l0).LIZJ(it.next(), false);
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$3(ACallableS84S0200000_7 aCallableS84S0200000_7) {
        ((ToolsActivityAssem) aCallableS84S0200000_7.l0).E3((Bundle) aCallableS84S0200000_7.l1);
        return C76800UCe.LIZ;
    }

    public static final Object call$4(ACallableS84S0200000_7 aCallableS84S0200000_7) {
        int i;
        ((C56552MHk) aCallableS84S0200000_7.l1).LJLIL.LJLJJLL = Long.valueOf(SystemClock.elapsedRealtime());
        C56548MHg c56548MHg = ((C56552MHk) aCallableS84S0200000_7.l1).LJLIL;
        Object[] objArr = (Object[]) aCallableS84S0200000_7.l0;
        c56548MHg.LJLJJI = (String) objArr[0];
        Object obj = objArr[1];
        if (obj != null) {
            c56548MHg.LJLJJL = obj.toString();
        }
        Object[] objArr2 = (Object[]) aCallableS84S0200000_7.l0;
        if (objArr2.length > 2 && ((Integer) objArr2[2]).intValue() == 1) {
            Object[] objArr3 = (Object[]) aCallableS84S0200000_7.l0;
            return MusicDetailApi.LIZ.queryPartnerMusic((String) objArr3[0], (String) objArr3[1]).get();
        }
        Object[] objArr4 = (Object[]) aCallableS84S0200000_7.l0;
        if (objArr4.length >= 5) {
            TreeMap treeMap = new TreeMap();
            Object[] objArr5 = (Object[]) aCallableS84S0200000_7.l0;
            if (objArr5.length >= 6) {
                treeMap.put("item_id", objArr5[5]);
            }
            Object[] objArr6 = (Object[]) aCallableS84S0200000_7.l0;
            if (objArr6.length >= 7) {
                treeMap.put("video_id", objArr6[6]);
            }
            Object[] objArr7 = (Object[]) aCallableS84S0200000_7.l0;
            if (objArr7.length >= 8) {
                try {
                    i = ((Integer) objArr7[7]).intValue();
                } catch (ClassCastException unused) {
                    i = 0;
                }
                if (i == 1) {
                    treeMap.put("enter_from", String.valueOf(i));
                }
            }
            Object[] objArr8 = (Object[]) aCallableS84S0200000_7.l0;
            String str = (String) objArr8[0];
            int intValue = ((Integer) objArr8[1]).intValue();
            int intValue2 = ((Integer) ((Object[]) aCallableS84S0200000_7.l0)[4]).intValue();
            if (C44208HWq.LIZ) {
                MusicDetailApi.DetailApi detailApi = MusicDetailApi.LIZ;
                if (str != null) {
                    str = str.trim();
                }
                return detailApi.queryMusicWithHighPriority(str, intValue, intValue2, treeMap).get();
            }
            MusicDetailApi.DetailApi detailApi2 = MusicDetailApi.LIZ;
            if (str != null) {
                str = str.trim();
            }
            return detailApi2.queryMusic(str, intValue, intValue2, treeMap).get();
        }
        String str2 = (String) objArr4[0];
        int intValue3 = ((Integer) objArr4[1]).intValue();
        if (C44208HWq.LIZ) {
            MusicDetailApi.DetailApi detailApi3 = MusicDetailApi.LIZ;
            if (str2 != null) {
                str2 = str2.trim();
            }
            return detailApi3.queryMusicWithHighPriority(str2, intValue3).get();
        }
        MusicDetailApi.DetailApi detailApi4 = MusicDetailApi.LIZ;
        if (str2 != null) {
            str2 = str2.trim();
        }
        return detailApi4.queryMusic(str2, intValue3).get();
    }

    public static final Object call$5(ACallableS84S0200000_7 aCallableS84S0200000_7) {
        PreviewVideoScene LLJJI = ((C45628HvU) aCallableS84S0200000_7.l0).LLJJI();
        if (LLJJI != null) {
            LLJJI.LLJLIL((OSZ) aCallableS84S0200000_7.l1);
        }
        PreviewVideoScene LLJJI2 = ((C45628HvU) aCallableS84S0200000_7.l0).LLJJI();
        if (LLJJI2 != null) {
            LLJJI2.LLJJLIIIJLLLLLLLZ();
            return C76800UCe.LIZ;
        }
        return null;
    }

    public static final Object call$6(ACallableS84S0200000_7 aCallableS84S0200000_7) {
        C145995oB c145995oB = (C145995oB) aCallableS84S0200000_7.l0;
        c145995oB.LIZLLL("original_resolution", C44384HbQ.LJJLIIIJLJLI((VideoPublishEditModel) aCallableS84S0200000_7.l1));
        GXR.LIZ("tool_performance_publish_first_frame", c145995oB.LIZ);
        return null;
    }

    public static final Object call$7(ACallableS84S0200000_7 aCallableS84S0200000_7) {
        ((InterfaceC88472Yns) aCallableS84S0200000_7.l0).invoke((Bitmap) aCallableS84S0200000_7.l1);
        return C76800UCe.LIZ;
    }

    public static final Object call$8(ACallableS84S0200000_7 aCallableS84S0200000_7) {
        ((IEffectService.OnVideoCoverCallback) aCallableS84S0200000_7.l0).onGetVideoCoverSuccess((Bitmap) aCallableS84S0200000_7.l1);
        return C76800UCe.LIZ;
    }

    public static final Object call$9(ACallableS84S0200000_7 aCallableS84S0200000_7) {
        IDLCallbackS60S0100000_7 iDLCallbackS60S0100000_7 = (IDLCallbackS60S0100000_7) aCallableS84S0200000_7.l0;
        AsyncAVService asyncAVService = (AsyncAVService) aCallableS84S0200000_7.l1;
        FragmentManager supportFragmentManager = ((VideoShare2GifEditActivity) iDLCallbackS60S0100000_7.l0).getSupportFragmentManager();
        C1B3 LIZ = C1B6.LIZ(supportFragmentManager, supportFragmentManager);
        LIZ.LJIIIIZZ(R.id.dd8, 1, asyncAVService.uiService().abilityUiService().video2GifFragment(((VideoShare2GifEditActivity) iDLCallbackS60S0100000_7.l0).LJLILLLLZI), null);
        LIZ.LJII();
        return null;
    }

    public ACallableS84S0200000_7(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
