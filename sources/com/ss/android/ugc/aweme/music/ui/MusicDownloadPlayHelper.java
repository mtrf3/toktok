package com.ss.android.ugc.aweme.music.ui;

import X.C03660Ck;
import X.C03880Dg;
import X.C188727au;
import X.C1AU;
import X.C1HQ;
import X.C2NU;
import X.C39519Ff9;
import X.C39579Fg7;
import X.C47325Ihl;
import X.C53235Kut;
import X.C5IO;
import X.C5S1;
import X.C65300Pk0;
import X.C74216TAu;
import X.C78496UrM;
import X.C84860XSe;
import X.C84868XSm;
import X.FMX;
import X.HWH;
import X.InterfaceC47328Iho;
import X.XPS;
import X.XU0;
import X.XU2;
import X.XU9;
import X.XUA;
import X.XUC;
import X.XUI;
import X.XUM;
import X.XUN;
import X.XUP;
import X.XUQ;
import Y.IDRunnableS6S0101000;
import android.app.Activity;
import android.content.Context;
import android.os.CountDownTimer;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.CookieManager;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.music.model.MusicCategory;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.performance.PerformanceMonitor;
import com.ss.android.ugc.aweme.services.performance.IAVPerformance;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.gamora.editor.music.stream.MusicStreamServiceImpl;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.Objects;

/* loaded from: classes16.dex */
public class MusicDownloadPlayHelper implements GenericLifecycleObserver, XUQ {
    public XUC LJLIL;
    public int LJLILLLLZI;
    public HWH LJLJI;
    public final XU2 LJLJJI;
    public XUI LJLJJL;
    public XUP LJLJJLL;
    public Context LJLJL;
    public long LJLJLJ;
    public String LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public String LJLLILLLL;
    public MusicCategory LJLLJ;
    public int LJLLL;
    public boolean LJLLLL;
    public MusicModel LJLLLLLL;
    public int LJLZ;
    public CountDownTimer LJZ;
    public boolean LJZI;
    public final C1HQ<String, Boolean> LJZL;
    public long LL;
    public boolean LLD;
    public InterfaceC47328Iho LLF;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            dismissDialog();
        }
    }

    public void LJ() {
        this.LJLJJI.LIZIZ(new XUA(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF() {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r0 = r8.LJLLLLLL
            if (r0 != 0) goto L5
            return
        L5:
            X.7au r4 = new X.7au
            r4.<init>()
            java.lang.Boolean r0 = X.XVF.LIZLLL()
            boolean r0 = r0.booleanValue()
            r6 = 1
            if (r0 == 0) goto L28
            java.lang.String r1 = X.XVF.LJII
            java.lang.String r0 = "from_location"
            r4.LJIIIZ(r0, r1)
            java.lang.String r1 = X.XVF.LJIIIIZZ
            java.lang.String r0 = "type"
            r4.LJIIIZ(r0, r1)
            java.lang.String r0 = "is_editor_pro"
            r4.LIZLLL(r6, r0)
        L28:
            int r0 = r8.LJLZ
            java.lang.String r3 = "play_music"
            java.lang.String r7 = "enter_from"
            java.lang.String r1 = "music_id"
            r5 = 2
            if (r0 != r5) goto L66
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r0 = r8.LJLLLLLL
            java.lang.String r0 = r0.getMusicId()
            r4.LJIIIZ(r1, r0)
            java.lang.String r0 = "search_music"
            r4.LJIIIZ(r7, r0)
            java.lang.String r1 = "search_keyword"
            r0 = 0
            r4.LJIIIZ(r1, r0)
            com.google.gson.Gson r1 = new com.google.gson.Gson
            r1.<init>()
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r0 = r8.LJLLLLLL
            com.ss.android.ugc.aweme.feed.model.LogPbBean r0 = r0.getLogPb()
            java.lang.String r1 = com.bytedance.mt.protector.impl.GsonProtectorUtils.toJson(r1, r0)
            java.lang.String r0 = "log_pb"
            r4.LJI(r0, r1)
            java.util.Map<java.lang.String, java.lang.String> r0 = r4.LIZ
            org.json.JSONObject r0 = X.C78963Uyt.LJJJJIZL(r0)
            X.FMX.LJIILJJIL(r3, r0)
        L65:
            return
        L66:
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r0 = r8.LJLLLLLL
            java.lang.String r0 = r0.getMusicId()
            r4.LJIIIZ(r1, r0)
            int r1 = r8.LJLZ
            java.lang.String r2 = ""
            if (r1 == 0) goto L7d
            r0 = 14
            if (r1 == r0) goto L7d
            r0 = 15
            if (r1 != r0) goto Lc0
        L7d:
            java.lang.String r0 = "song_choose_page"
        L7f:
            r4.LJIIIZ(r7, r0)
            java.lang.String r1 = "enter_method"
            java.lang.String r0 = "click_play_music"
            r4.LJIIIZ(r1, r0)
            int r0 = r8.LJLILLLLZI
            if (r0 == r6) goto Lbe
            if (r0 != 0) goto Lb9
            java.lang.String r1 = "video_edit_page"
        L91:
            java.lang.String r0 = "previous_page"
            r4.LJIIIZ(r0, r1)
            com.ss.android.ugc.aweme.music.model.MusicCategory r0 = r8.LJLLJ
            if (r0 == 0) goto L9e
            java.lang.String r1 = r0.categoryId
            if (r1 != 0) goto L9f
        L9e:
            r1 = r2
        L9f:
            java.lang.String r0 = "category_id"
            r4.LJIIIZ(r0, r1)
            com.ss.android.ugc.aweme.music.model.MusicCategory r0 = r8.LJLLJ
            if (r0 == 0) goto Lac
            java.lang.String r0 = r0.categoryName
            if (r0 != 0) goto Lb7
        Lac:
            java.lang.String r0 = "category_name"
            r4.LJI(r0, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r4.LIZ
            X.FMX.LJIIL(r3, r0)
            goto L65
        Lb7:
            r2 = r0
            goto Lac
        Lb9:
            if (r0 != r5) goto Lbe
            java.lang.String r1 = "video_shoot_page"
            goto L91
        Lbe:
            r1 = r2
            goto L91
        Lc0:
            if (r1 != r6) goto Lc5
            java.lang.String r0 = "collection_music"
            goto L7f
        Lc5:
            if (r1 != r5) goto Lc8
            goto L7d
        Lc8:
            r0 = 3
            if (r1 != r0) goto Lce
            java.lang.String r0 = "song_category"
            goto L7f
        Lce:
            r0 = r2
            goto L7f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper.LJFF():void");
    }

    public void LJIIIIZZ() {
        CountDownTimer countDownTimer = this.LJZ;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.LJLJJI.pause();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void dismissDialog() {
        HWH hwh = this.LJLJI;
        if (hwh != null) {
            hwh.dismiss();
            this.LJLJI = null;
        }
    }

    public void onDestroy() {
        this.LJZL.clear();
        CountDownTimer countDownTimer = this.LJZ;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        if (this.LJLIL != null) {
            this.LJLIL = null;
        }
        if (this.LJLJJLL != null) {
            this.LJLJJLL = null;
        }
        this.LJLJL = null;
        this.LJLJJL.release();
        this.LJLJJI.release();
    }

    public void pause() {
        LJIIIIZZ();
    }

    public MusicDownloadPlayHelper(XUC xuc) {
        this(xuc, "music_choose_page");
    }

    public void LJIIJJI(MusicModel musicModel) {
        AVExternalServiceImpl.LIZ().publishService().setCurMusic(musicModel, 0);
    }

    public final void LJIIL(MusicModel musicModel) {
        XUC xuc = this.LJLIL;
        if (xuc == null) {
            return;
        }
        this.LJLLLL = true;
        if (xuc.LJJIZ() == null) {
            return;
        }
        LJIIIIZZ();
        XUN.LIZ().pause();
        LJIIJJI(musicModel);
        HWH hwh = this.LJLJI;
        if (hwh != null) {
            hwh.dismiss();
        }
        this.LJLIL.T3(musicModel);
    }

    public MusicDownloadPlayHelper(XUC xuc, String str) {
        this.LJLJLLL = "";
        this.LJZL = new C1HQ<>();
        this.LL = -1L;
        this.LLD = true;
        this.LJLIL = xuc;
        this.LJLJL = xuc.LJJIZ();
        XU2 xu2 = new XU2(str);
        this.LJLJJI = xu2;
        if (e1.LIZ(31744, "creative_tools_open_download_music", true, false) && (TextUtils.equals(str, "video_shoot_page") || TextUtils.equals(str, "music_choose_page"))) {
            this.LJLJJL = new C84860XSe(xu2, this.LJLIL.LJJIZ(), str);
        } else {
            this.LJLJJL = new C84868XSm((Context) this.LJLIL.LJJIZ(), str, true, true, true);
        }
        this.LJLJJL.LIZIZ(1);
    }

    public boolean LIZ(MusicModel musicModel, Context context) {
        return XU0.LIZ(musicModel, context, true);
    }

    public final void LJI(MusicModel musicModel, String str, String str2) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("creation_id", str);
        c188727au.LJIIIZ("music_id", musicModel.getMusicId());
        c188727au.LJ(System.currentTimeMillis() - this.LJLJLJ, "loading_time");
        c188727au.LJIIIZ("to_status", str2);
        FMX.LJIIL("music_loading_end", c188727au.LIZ);
    }

    public final void LJII(MusicModel musicModel, String str, boolean z) {
        dismissDialog();
        XUC xuc = this.LJLIL;
        if (xuc == null || !xuc.LJJIIZI() || this.LJLIL.LJJIZ() == null) {
            return;
        }
        this.LJLIL.LJJJJIZL(musicModel, new Exception(str));
        if (z) {
            C5S1 c5s1 = new C5S1(this.LJLJL);
            c5s1.LIZJ(R.string.jsx);
            c5s1.LJ();
        } else {
            C5S1 c5s12 = new C5S1(this.LJLJL);
            c5s12.LIZJ(R.string.img);
            c5s12.LJ();
        }
    }

    public void LJIIJ(MusicModel musicModel, boolean z, int i) {
        LJIIIZ(musicModel, i, z, 0, -1);
    }

    public final void LJIILIIL(MusicModel musicModel, String str, boolean z) {
        String LIZIZ;
        if (C5IO.LIZIZ(musicModel.getMusicId()) != null) {
            IAVPerformance provideAVPerformance = AVExternalServiceImpl.LIZ().provideAVPerformance();
            PerformanceMonitor LIZIZ2 = C5IO.LIZIZ(musicModel.getMusicId());
            Objects.requireNonNull(LIZIZ2);
            provideAVPerformance.step(LIZIZ2, "start download music");
        }
        if (C53235Kut.LIZ() && str != null && str.equals("edit_page_banner") && !this.LJLL && !this.LJLLI) {
            String str2 = null;
            if (!musicModel.getUrl().getUrlList().isEmpty()) {
                str2 = (String) ListProtector.get(musicModel.getUrl().getUrlList(), 0);
            }
            XUM LIZ = MusicStreamServiceImpl.LIZIZ().LIZ();
            if (LIZ != null && LIZ.LIZJ(str2) && LIZ != null && (LIZIZ = LIZ.LIZIZ(str2)) != null) {
                LJIILJJIL(musicModel, LIZIZ, str);
                return;
            }
            if (C2NU.LIZ.LIZIZ()) {
                if (str2 != null) {
                    LJIILJJIL(musicModel, str2, str);
                    return;
                } else {
                    LJII(musicModel, "playback failed, playUrl is null", true);
                    return;
                }
            }
            LJII(musicModel, "playback failed, no network", false);
            return;
        }
        this.LJLJJL.LIZJ(musicModel, new XU9(this, musicModel, str), true, z);
    }

    public final void LJIILJJIL(MusicModel musicModel, String str, String str2) {
        XUM LIZ;
        XUC xuc = this.LJLIL;
        if (xuc == null) {
            return;
        }
        this.LJLLLL = true;
        if (xuc.LJJIZ() == null) {
            return;
        }
        if (!C53235Kut.LIZ() && (LIZ = MusicStreamServiceImpl.LIZIZ().LIZ()) != null) {
            LIZ.LJ(this.LJLJLJ, str, musicModel.getMusicId(), false);
        }
        LJIIIIZZ();
        XUN.LIZ().pause();
        LJIIJJI(musicModel);
        HWH hwh = this.LJLJI;
        if (hwh != null) {
            hwh.dismiss();
        }
        this.LJLIL.LJJII(musicModel, str, str2);
    }

    public static String LIZLLL(int i, int i2, int i3, MusicModel.MusicType musicType) {
        if (i2 != 0) {
            if (i2 != 2) {
                return "";
            }
            switch (i) {
                case 0:
                case 15:
                    if (i3 == 2) {
                        return "shoot_page_unfolded_category";
                    }
                    if (i3 == 3) {
                        return "shoot_page_folded_category";
                    }
                    return "shoot_page_list";
                case 1:
                    return "shoot_page_favourite";
                case 2:
                    return "shoot_page_search";
                case 3:
                    if (i3 == 2) {
                        return "shoot_page_unfolded_category";
                    }
                    if (i3 == 3) {
                        return "shoot_page_folded_category";
                    }
                    return "shoot_page_banner";
                case 4:
                case 7:
                case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                case 17:
                default:
                    return "";
                case 5:
                    return "shoot_page_local";
                case 6:
                    if (musicType == MusicModel.MusicType.LOCAL_SCAN) {
                        return "shoot_page_upload_from_device";
                    }
                    if (musicType == MusicModel.MusicType.VIDEO_EXTRACT) {
                        return "shoot_page_upload_from_video";
                    }
                    return "shoot_page_upload";
                case 8:
                    return "shoot_page_fm";
                case 9:
                    return "sticker_rec";
                case 10:
                    return "challenge_rec";
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    return "music_chart_list";
                case 12:
                    return "shoot_page_favourite_recommend";
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    return "profile_favorite_recommend";
                case 14:
                    return "shoot_page_list";
                case 18:
                    return "wwa_campaign_music";
            }
        }
        switch (i) {
            case 0:
            case 15:
                if (i3 == 2) {
                    return "edit_page_unfolded_category";
                }
                if (i3 == 3) {
                    return "edit_page_folded_category";
                }
                return "edit_page_list";
            case 1:
                return "edit_page_favourite";
            case 2:
                return "edit_page_search";
            case 3:
                if (i3 == 2) {
                    return "edit_page_unfolded_category";
                }
                if (i3 == 3) {
                    return "edit_page_folded_category";
                }
                return "edit_page_banner";
            case 4:
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
            case 17:
            default:
                return "";
            case 5:
                return "edit_page_local";
            case 6:
                if (musicType == MusicModel.MusicType.LOCAL_SCAN) {
                    return "edit_page_upload_from_device";
                }
                if (musicType == MusicModel.MusicType.VIDEO_EXTRACT) {
                    return "edit_page_upload_from_video";
                }
                return "edit_page_upload";
            case 7:
                return "single_song";
            case 8:
                return "edit_page_fm";
            case 9:
                return "sticker_rec";
            case 10:
                return "challenge_rec";
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return "music_chart_list";
            case 12:
                return "edit_page_favourite_recommend";
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return "profile_favorite_recommend";
            case 14:
                return "edit_page_list";
            case 18:
                return "wwa_campaign_music";
        }
    }

    public final void LIZIZ(int i, MusicModel musicModel, boolean z, boolean z2) {
        LIZJ(musicModel, i, z, z2, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x036e, code lost:
    
        if (r25 != false) goto L146;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(com.ss.android.ugc.aweme.shortvideo.model.MusicModel r21, int r22, boolean r23, boolean r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 952
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper.LIZJ(com.ss.android.ugc.aweme.shortvideo.model.MusicModel, int, boolean, boolean, boolean):void");
    }

    public void LJIIIZ(MusicModel musicModel, int i, boolean z, int i2, int i3) {
        XUC xuc;
        Activity LJJIZ;
        String str;
        String cookie;
        this.LL = SystemClock.elapsedRealtime();
        if (musicModel == null || (xuc = this.LJLIL) == null || (LJJIZ = xuc.LJJIZ()) == null) {
            return;
        }
        if (C2NU.LIZ.LIZIZ()) {
            this.LJLZ = i;
            if (!LIZ(musicModel, LJJIZ)) {
                return;
            }
            this.LJLLLLLL = musicModel;
            this.LJZI = z;
            this.LJLJJI.stop();
            String localPath = musicModel.getLocalPath();
            C47325Ihl c47325Ihl = new C47325Ihl();
            if (musicModel.getMusicType() == MusicModel.MusicType.ONLINE || musicModel.getMusicType() == MusicModel.MusicType.REUSE_AUDIO) {
                c47325Ihl.LJFF = musicModel.getMusicId();
                c47325Ihl.LJI = z;
                c47325Ihl.LJII = i2;
                c47325Ihl.LJIIIIZZ = i3;
                if (musicModel.getMusicType() == MusicModel.MusicType.REUSE_AUDIO) {
                    c47325Ihl.LIZIZ = musicModel.getReuseAudioPlayUrl().getUrlList();
                    c47325Ihl.LIZLLL = musicModel.getDuration();
                    str = (String) ListProtector.get(musicModel.getReuseAudioPlayUrl().getUrlList(), 0);
                } else {
                    c47325Ihl.LIZIZ = musicModel.getUrl().getUrlList();
                    c47325Ihl.LIZLLL = musicModel.getRealAuditionDuration();
                    str = (String) ListProtector.get(musicModel.getUrl().getUrlList(), 0);
                }
                c47325Ihl.LIZJ = 4;
                if (e1.LIZ(31744, "enable_play_local_cache_music_file", true, true) && localPath == null) {
                    localPath = str;
                }
                String LIZIZ = XPS.LIZLLL().LIZIZ(localPath);
                if (!TextUtils.isEmpty(LIZIZ) && C39579Fg7.LIZIZ(LIZIZ) && C78496UrM.LIZ(LIZIZ) > 0) {
                    c47325Ihl.LIZ = LIZIZ;
                    this.LJLJJI.LIZLLL(c47325Ihl);
                    XUP xup = this.LJLJJLL;
                    if (xup != null) {
                        xup.LIZ();
                        return;
                    }
                    return;
                }
                if (musicModel.isNeedSetCookie()) {
                    CookieManager cookieManager = CookieManager.getInstance();
                    C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(103100, "android/webkit/CookieManager", "getCookie", cookieManager, new Object[]{str}, "java.lang.String", new C65300Pk0(false, "(Ljava/lang/String;)Ljava/lang/String;", "-8968282768191032603"));
                    if (LIZJ.LIZ) {
                        cookie = (String) LIZJ.LIZIZ;
                    } else {
                        cookie = cookieManager.getCookie(str);
                    }
                    c47325Ihl.LJ = C03660Ck.LIZJ("cookie", cookie);
                }
                this.LJLJJI.LIZLLL(c47325Ihl);
                return;
            }
            if (!musicModel.isLocalMusic()) {
                return;
            }
            c47325Ihl.LJFF = musicModel.getMusicId();
            c47325Ihl.LIZ = musicModel.getLocalPath();
            c47325Ihl.LJI = z;
            c47325Ihl.LJII = i2;
            c47325Ihl.LJIIIIZZ = i3;
            this.LJLJJI.LIZLLL(c47325Ihl);
            return;
        }
        C1AU c1au = (C1AU) this.LJLIL.LJJIZ();
        if (c1au == null) {
            return;
        }
        SafeHandler safeHandler = new SafeHandler(c1au);
        if (C74216TAu.LIZIZ.LIZIZ()) {
            safeHandler.post(new IDRunnableS6S0101000(6, LJJIZ, 19));
        } else {
            safeHandler.post(new IDRunnableS6S0101000(8, LJJIZ, 4));
        }
    }
}
