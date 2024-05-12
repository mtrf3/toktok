package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import com.ss.android.vesdk.VEUtils;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.H9x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43617H9x {
    public final ActivityC45651qj LIZ;
    public final boolean LIZIZ;
    public final HAA LIZJ;
    public long LIZLLL;
    public MvThemeData LJ;
    public AVETParameter LJFF;
    public MusicModel LJI;
    public String LJII;
    public ShortVideoContext LJIIIIZZ;
    public InterfaceC42275GiV LJIIIZ;
    public FaceStickerBean LJIIJ;
    public ArrayList<MediaModel> LJIIJJI;
    public boolean LJIIL;
    public final C43619H9z LJIILIIL;

    public static void LIZIZ(MvCreateVideoData mvCreateVideoData) {
        String str;
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("content_type", "photo");
        if (mvCreateVideoData.selectMediaList.size() > 1) {
            str = "multiple_content";
        } else {
            str = "single_content";
        }
        c145995oB.LJI("upload_type", str);
        FMX.LJIIL("upload_content_next", c145995oB.LIZ);
    }

    public final void LIZ(MvCreateVideoData mvCreateVideoData) {
        ShortVideoContext shortVideoContext;
        String str;
        String str2;
        String str3;
        boolean z;
        String str4;
        boolean z2;
        ShortVideoContext shortVideoContext2 = this.LJIIIIZZ;
        if (shortVideoContext2 != null) {
            shortVideoContext = shortVideoContext2;
        } else {
            shortVideoContext = null;
        }
        if (shortVideoContext2 != null) {
            if (!o.LJ(shortVideoContext2.uploadMethod, "slide_mini")) {
                ShortVideoContext shortVideoContext3 = this.LJIIIIZZ;
                if (shortVideoContext3 != null) {
                    if (V16.LJJIJIIJI(shortVideoContext3)) {
                        str = "now";
                    } else {
                        str = "slideshow";
                    }
                    if (mvCreateVideoData.selectMediaList.size() > 1) {
                        str2 = "multiple_content";
                    } else {
                        str2 = "single_content";
                    }
                    int i = 0;
                    int size = mvCreateVideoData.selectMediaList.size();
                    if (mvCreateVideoData.selectMediaList.size() > 1) {
                        str3 = "photo";
                    } else {
                        str3 = LiveGiftNewGifterBadgeSetting.DEFAULT;
                    }
                    if (mvCreateVideoData.selectMediaList.size() > 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ArrayList<MediaModel> arrayList = this.LJIIJJI;
                    if (arrayList != null) {
                        str4 = C173606rc.LIZ(arrayList);
                    } else {
                        str4 = "";
                    }
                    ArrayList<String> arrayList2 = mvCreateVideoData.selectMediaList;
                    o.LJIIIIZZ(arrayList2, "videoData.selectMediaList");
                    Iterator<String> it = arrayList2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        String next = it.next();
                        VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(next);
                        if (videoFileInfo != null && videoFileInfo.bHDR) {
                            if (next != null) {
                                z2 = true;
                            }
                        }
                    }
                    z2 = false;
                    H9N h9n = new H9N(shortVideoContext, str, str2, i, size, str3, z, str4, z2);
                    h9n.LIZIZ(shortVideoContext);
                    h9n.LIZ();
                    return;
                }
                o.LJIJI("shortVideoContext");
                throw null;
            }
            return;
        }
        o.LJIJI("shortVideoContext");
        throw null;
    }

    public final boolean LIZLLL(int i) {
        AVChallenge recordChallenge;
        boolean z;
        ShortVideoContext shortVideoContext = this.LJIIIIZZ;
        if (shortVideoContext != null) {
            if (!C6H4.LJFF(shortVideoContext.creativeModel.stickerModel)) {
                ShortVideoContext shortVideoContext2 = this.LJIIIIZZ;
                if (shortVideoContext2 != null) {
                    if (!C78685UuP.LJJJZ(shortVideoContext2.creativeModel.paidContentModel.getCollectionId())) {
                        ShortVideoContext shortVideoContext3 = this.LJIIIIZZ;
                        if (shortVideoContext3 != null) {
                            CreativeModel creativeModel = shortVideoContext3.creativeModel;
                            o.LJIIIIZZ(creativeModel, "shortVideoContext.creativeModel");
                            if (creativeModel.initialModel.articlePostModel == null) {
                                ShortVideoContext shortVideoContext4 = this.LJIIIIZZ;
                                if (shortVideoContext4 != null) {
                                    if (!shortVideoContext4.LJJI()) {
                                        if (i <= 1) {
                                            return false;
                                        }
                                        if (C43863HJj.LIZ() != 3 && C43863HJj.LIZ() != 4) {
                                            if (C43863HJj.LIZ() == 2) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            if (z) {
                                                C62822Ol8 c62822Ol8 = C163866bu.LIZ;
                                                if (!((Keva) c62822Ol8.getValue()).getBoolean("enter_image_edit_firstly_for_v2", false)) {
                                                    ((Keva) c62822Ol8.getValue()).storeBoolean("enter_image_edit_firstly_for_v2", true);
                                                    ((Keva) c62822Ol8.getValue()).storeBoolean("enter_image_edit_page", true);
                                                }
                                            }
                                            if (!((Keva) C163866bu.LIZ.getValue()).getBoolean("enter_image_edit_page", false)) {
                                                ShortVideoContext shortVideoContext5 = this.LJIIIIZZ;
                                                if (shortVideoContext5 != null) {
                                                    if (!shortVideoContext5.creativeModel.onThisDayData.isFromOnThisDay()) {
                                                        ShortVideoContext shortVideoContext6 = this.LJIIIIZZ;
                                                        if (shortVideoContext6 != null) {
                                                            if (!C46140I8y.LIZ(shortVideoContext6.enterFrom)) {
                                                                return false;
                                                            }
                                                        } else {
                                                            o.LJIJI("shortVideoContext");
                                                            throw null;
                                                        }
                                                    }
                                                } else {
                                                    o.LJIJI("shortVideoContext");
                                                    throw null;
                                                }
                                            }
                                        }
                                        ShortVideoContext shortVideoContext7 = this.LJIIIIZZ;
                                        if (shortVideoContext7 != null) {
                                            C78934UyQ.LJLIL.LIZLLL().getClass();
                                            C62002c0.LIZ.getClass();
                                            if (!C62002c0.LIZ() || shortVideoContext7.LJJIJIIJI() || shortVideoContext7.LJJJI() || shortVideoContext7.LJJIIZ() || C1DG.LJIIIIZZ() || o.LJ(shortVideoContext7.shootWay, "mission")) {
                                                return false;
                                            }
                                            if ((o.LJ(shortVideoContext7.shootWay, "challenge") && (recordChallenge = shortVideoContext7.creativeModel.commerceModel.getRecordChallenge()) != null && recordChallenge.isCommerce) || o.LJ(shortVideoContext7.shootWay, "tcm_upload") || shortVideoContext7.commentVideoModel != null || shortVideoContext7.qaStruct != null) {
                                                return false;
                                            }
                                            return true;
                                        }
                                        o.LJIJI("shortVideoContext");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("shortVideoContext");
                                    throw null;
                                }
                            }
                            return true;
                        }
                        o.LJIJI("shortVideoContext");
                        throw null;
                    }
                } else {
                    o.LJIJI("shortVideoContext");
                    throw null;
                }
            }
            return false;
        }
        o.LJIJI("shortVideoContext");
        throw null;
    }

    public C43617H9x(ActivityC45651qj activity, boolean z) {
        o.LJIIIZ(activity, "activity");
        this.LIZ = activity;
        this.LIZIZ = z;
        this.LIZJ = new HAA(activity, null);
        this.LJIILIIL = new C43619H9z();
    }

    public static void LIZJ(int i, C43619H9z result, int i2) {
        String str;
        o.LJIIIZ(result, "result");
        C6BK c6bk = new C6BK();
        if (i2 > 1) {
            str = "multi";
        } else {
            str = "single";
        }
        c6bk.LIZ.put("photo_import_mode", str);
        c6bk.LIZ.put("mvtemplate_list_download_time", Integer.valueOf(result.LIZ));
        c6bk.LIZ.put("mvtemplate_download_time", Integer.valueOf(result.LIZIZ));
        c6bk.LIZ.put("mvtemplate_use_predownload", Integer.valueOf(result.LIZJ));
        c6bk.LIZ.put("hot_music_list_download_time", Integer.valueOf(result.LIZLLL));
        c6bk.LIZ.put("hot_music_list_list_size", Integer.valueOf(result.LJ));
        c6bk.LIZ.put("music_download_time", Integer.valueOf(result.LJFF));
        c6bk.LIZ.put("music_id", result.LJI);
        c6bk.LIZ.put("error_code", Integer.valueOf(result.LJII));
        c6bk.LIZ.put("failed_step", Integer.valueOf(result.LJIIIZ));
        c6bk.LIZ.put("failed_reason", result.LJIIJ);
        C43882HKc.LIZLLL(i, "aweme_photomv_synthesis_error_rate", c6bk.LJ(), true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0179, code lost:
    
        if (X.C78685UuP.LJJJZ(X.C60903NvH.LJIIJJI().LJIL().LIZJ(r25.LIZ).getString("extra_edit_effect_uid")) == false) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(X.C43617H9x r25, com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r26, java.util.List r27, X.InterfaceC42275GiV r28, boolean r29, java.lang.Long r30, boolean r31, java.util.List r32, java.lang.String r33, int r34) {
        /*
            Method dump skipped, instructions count: 797
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43617H9x.LJ(X.H9x, com.ss.android.ugc.aweme.shortvideo.ShortVideoContext, java.util.List, X.GiV, boolean, java.lang.Long, boolean, java.util.List, java.lang.String, int):void");
    }
}
