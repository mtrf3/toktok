package X;

import Y.ACallableS42S0000000_7;
import Y.AObjectS42S0101000_5;
import Y.ARunnableS13S1000000_7;
import Y.ARunnableS2S0001000_7;
import Y.ARunnableS2S2100000_7;
import Y.ARunnableS43S0100000_7;
import Y.AgS87S0101000_15;
import Y.IDRunnableS6S0101000;
import android.app.Activity;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.DuetHelperKt;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IDLCallbackS16S0200000_7;
import com.ss.android.ugc.aweme.services.IShortVideoConfig;
import com.ss.android.ugc.aweme.shortvideo.model.DuetAndStitchRouterConfig;
import com.ss.android.ugc.aweme.shortvideo.model.DuetAndStitchRouterConfigKt;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import v5.n;

/* renamed from: X.HRe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44066HRe {
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public int LJII;
    public ProgressDialogC43241Gy5 LJIIIZ;
    public ProgressDialogC44073HRl LJIIJ;
    public Activity LJIIJJI;
    public List<String> LJIILIIL;
    public Aweme LJIILL;
    public boolean LJIJ;
    public boolean LJIJI;
    public int LJJ;
    public long LJJI;
    public String LIZ = "duet";
    public String LIZIZ = "";
    public java.util.Map<String, String> LIZJ = Collections.emptyMap();
    public Effect LJI = null;
    public final String LJIIIIZZ = AVExternalServiceImpl.LIZ().configService().cacheConfig().duetPublicDir();
    public InterfaceC44080HRs LJIIL = new C44081HRt();
    public final Handler LJIILJJIL = new Handler(C16880lQ.LLJJJJ());
    public String LJIILLIIL = "";
    public boolean LJIIZILJ = false;
    public DuetAndStitchRouterConfig LJIJJ = null;
    public boolean LJIJJLI = false;
    public boolean LJIL = false;
    public boolean LJJIFFI = false;
    public final C44068HRg LJJII = new C44068HRg(this);
    public final ARunnableS43S0100000_7 LJJIII = new ARunnableS43S0100000_7(this, 113);

    public final void LIZLLL() {
        C38816FLg.LIZJ(new ARunnableS43S0100000_7(this, 112));
    }

    public final void LJ() {
        if (this.LJIIJ != null) {
            return;
        }
        if (C42423Gkt.LIZ()) {
            this.LJIIJ = C44072HRk.LIZJ(new C44071HRj(this.LJIIJJI, EnumC44076HRo.VISIBLE_AFTER_5S, new InterfaceC44082HRu() { // from class: X.HRm
                @Override // X.InterfaceC44082HRu
                public final void LIZIZ() {
                    C44066HRe c44066HRe = C44066HRe.this;
                    c44066HRe.LJIJ = true;
                    c44066HRe.LJIIJ = null;
                    C188727au c188727au = new C188727au();
                    c44066HRe.LJI(c188727au);
                    AVExternalServiceImpl.LIZ().getAVMobService().onEventV3("click_cancel_loading", c188727au.LIZ);
                }
            }, "has_cancel"));
        } else if (C44079HRr.LIZ() != 0) {
            EnumC44076HRo enumC44076HRo = EnumC44076HRo.GONE;
            if (C44079HRr.LIZ() == 1) {
                enumC44076HRo = EnumC44076HRo.VISIBLE_AFTER_5S;
            } else if (C44079HRr.LIZ() == 2) {
                enumC44076HRo = EnumC44076HRo.VISIBLE_AFTER_10S;
            }
            this.LJIIJ = C44072HRk.LIZJ(new C44071HRj(this.LJIIJJI, enumC44076HRo, new InterfaceC44082HRu() { // from class: X.HRn
                @Override // X.InterfaceC44082HRu
                public final void LIZIZ() {
                    C44066HRe c44066HRe = C44066HRe.this;
                    c44066HRe.LJIJ = true;
                    c44066HRe.LJIIJ = null;
                    C188727au c188727au = new C188727au();
                    c44066HRe.LJI(c188727au);
                    AVExternalServiceImpl.LIZ().getAVMobService().onEventV3("click_cancel_loading", c188727au.LIZ);
                }
            }, "has_cancel"));
        } else {
            this.LJIIJ = C44072HRk.LIZJ(new C44071HRj(this.LJIIJJI, EnumC44076HRo.GONE, null, "no_cancel"));
        }
        this.LJIIJ.LIZ();
        this.LJIIJ.setMessage(this.LJIIJJI.getResources().getString(R.string.f0g));
        this.LJJI = System.currentTimeMillis();
    }

    public final void LJIIIZ() {
        boolean z;
        EnumC44070HRi enumC44070HRi;
        C10K c10k;
        EnumC44070HRi LIZIZ = C220858ld.LIZIZ(this.LJIILL);
        EnumC44070HRi enumC44070HRi2 = EnumC44070HRi.NO_ERROR;
        if (LIZIZ != enumC44070HRi2) {
            IShortVideoConfig shortVideoConfig = AVExternalServiceImpl.LIZ().configService().shortVideoConfig();
            if (C85990Xow.LJIIIZ() && this.LJIILL.getAuthor() != null && this.LJIILL.getAuthor().isPreventDownload()) {
                LJII(R.string.f0h, EnumC44070HRi.USER_CLOSE_DUET_OR_STITCH_AND_NOT_SELF);
                this.LJIIL.onFailed();
            } else if (LIZIZ == EnumC44070HRi.VIDEO_LENGTH_RESTRICT) {
                LJIIIIZZ(shortVideoConfig.getErrorHintWhenDisableDuetOrStitch(1), LIZIZ);
            } else {
                LJII(R.string.f0q, LIZIZ);
            }
            LIZ();
            return;
        }
        Aweme aweme = this.LJIILL;
        if (C63081OpJ.LJJLIIIJLJLI(aweme)) {
            enumC44070HRi = EnumC44070HRi.AWEME_TYPE_IS_NON_NATIVE_ADX_AD;
        } else {
            boolean LJJIIZI = C78996UzQ.LJJIIZI(aweme);
            int duet = aweme.getInteractPermission().getDuet();
            if (aweme.getAwemeType() == 150) {
                enumC44070HRi = EnumC44070HRi.PHOTO_MODE_VIDEO_TYPE;
            } else if (duet == 4) {
                enumC44070HRi = EnumC44070HRi.AWEME_INTERACT_PERMISSION;
            } else if (duet == 3) {
                enumC44070HRi = EnumC44070HRi.AWEME_INTERACT_PERMISSION;
            } else {
                if (!LJJIIZI) {
                    if (duet == 2) {
                        enumC44070HRi = EnumC44070HRi.AWEME_INTERACT_PERMISSION;
                    } else if (duet == 1) {
                        enumC44070HRi = EnumC44070HRi.AWEME_INTERACT_PERMISSION;
                    } else if (aweme.isPrivate()) {
                        enumC44070HRi = EnumC44070HRi.PRIVATE_STATUS;
                    }
                }
                boolean canAddDuet = DuetHelperKt.canAddDuet(aweme, LJJIIZI);
                if (C85990Xow.LJIIIZ() && !C235779Nd.LIZ.LIZ().LIZ().booleanValue()) {
                    z = true;
                } else {
                    z = false;
                }
                if (DuetHelperKt.setGrayForDuet(aweme, LJJIIZI, canAddDuet, z, CommerceMediaServiceImpl.LIZJ().LJIILLIIL(aweme.getMusic()))) {
                    enumC44070HRi = EnumC44070HRi.AUTHOR_SETTING_FORBID;
                } else {
                    enumC44070HRi = enumC44070HRi2;
                }
            }
        }
        if (this.LJIJJ != null && enumC44070HRi != enumC44070HRi2) {
            if (enumC44070HRi == EnumC44070HRi.AWEME_TYPE_IS_NON_NATIVE_ADX_AD) {
                LJII(R.string.b96, enumC44070HRi);
            } else if (enumC44070HRi == EnumC44070HRi.PHOTO_MODE_VIDEO_TYPE) {
                LJII(R.string.p6c, enumC44070HRi);
            } else {
                LJII(R.string.f0q, enumC44070HRi);
            }
            LIZ();
            return;
        }
        VideoUrlModel playAddrH264 = this.LJIILL.getVideo().getPlayAddrH264();
        if (playAddrH264 == null || C79004UzY.LJJIFFI(playAddrH264.getUrlList())) {
            LJII(R.string.f0q, EnumC44070HRi.VIDEO_URL_MODEL_IS_NULL);
            LIZ();
            this.LJIIL.onFailed();
            return;
        }
        C10K[] c10kArr = new C10K[2];
        this.LJI = null;
        n nVar = new n();
        AVExternalServiceImpl.LIZ().asyncServiceWithOutPanel("duet", new IDLCallbackS16S0200000_7(nVar, this, 13));
        c10kArr[0] = nVar.LIZ;
        n nVar2 = new n();
        C10K.LIZJ(new ACallableS42S0000000_7(2));
        VideoUrlModel playAddrH2642 = this.LJIILL.getVideo().getPlayAddrH264();
        this.LJIILIIL = C44078HRq.LIZ(this.LJIILL, playAddrH2642.getUrlList());
        String LIZJ = C38352F3k.LIZJ(playAddrH2642.getBitRatedRatioUri());
        if (TextUtils.isEmpty(this.LIZIZ)) {
            this.LIZIZ = UUID.randomUUID().toString();
        }
        StringBuilder LIZ = X1D.LIZ();
        this.LIZLLL = C025908h.LIZIZ(LIZ, this.LJIIIIZZ, LIZJ, ".mp4", LIZ);
        String duetCreativeDir = AVExternalServiceImpl.LIZ().configService().cacheConfig().duetCreativeDir(this.LIZIZ);
        C39579Fg7.LJ(duetCreativeDir, false);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(duetCreativeDir);
        LIZ2.append("temp_");
        LIZ2.append(LIZJ);
        LIZ2.append(".mp4");
        this.LJ = X1D.LIZIZ(LIZ2);
        this.LJFF = C0ON.LIZJ(duetCreativeDir, "temp_", LIZJ, ".wav");
        if (C39579Fg7.LIZIZ(this.LIZLLL)) {
            nVar2.LJ(null);
            c10k = nVar2.LIZ;
        } else {
            if (!C39579Fg7.LIZIZ(this.LIZLLL)) {
                C39579Fg7.LJ(this.LJIIIIZZ, false);
            }
            C42418Gko.LIZ(this.LJIILL, this.LJIILIIL, this.LJIIIIZZ, i0.LJFF(LIZJ, ".mp4"), new HQI(this, this.LJIILIIL, this.LIZ, nVar2));
            c10k = nVar2.LIZ;
        }
        c10kArr[1] = c10k;
        C10K.LJIJJ(C65661Ppp.LIZIZ(c10kArr)).LJ(new AgS87S0101000_15(1, this, 2), C10K.LJIIIIZZ, null);
        this.LJJ = 0;
        this.LJIILJJIL.postDelayed(new IDRunnableS6S0101000(7, this, 25), 60000L);
    }

    public final void LIZ() {
        ProgressDialogC43241Gy5 progressDialogC43241Gy5;
        ProgressDialogC44073HRl progressDialogC44073HRl;
        if (C42431Gl1.LIZ() && (progressDialogC44073HRl = this.LJIIJ) != null) {
            V1B.LJLILLLLZI(progressDialogC44073HRl);
            this.LJIIJ = null;
        } else if (!C42431Gl1.LIZ() && (progressDialogC43241Gy5 = this.LJIIIZ) != null) {
            V1B.LJLILLLLZI(progressDialogC43241Gy5);
            this.LJIIIZ = null;
        }
        Activity activity = this.LJIIJJI;
        if (activity != null && this.LJIJJLI && this.LJIL) {
            activity.finish();
            this.LJIL = false;
        }
    }

    public final void LJI(C188727au c188727au) {
        c188727au.LJIIIZ("creation_id", this.LIZIZ);
        String str = "duet_page";
        if (!TextUtils.equals("duet_page", this.LJIILLIIL)) {
            str = "duet";
        }
        c188727au.LJIIIZ("shoot_way", str);
        c188727au.LJIIIZ("enter_from", this.LJIILLIIL);
        c188727au.LJ(System.currentTimeMillis() - this.LJJI, "loading_duration");
        c188727au.LJIIIZ("group_id", this.LJIILL.getVideo().getPlayAddrH264().getSourceId());
        c188727au.LJIIIZ("content_source", "shoot");
        c188727au.LJIIIZ("content_type", "video");
        c188727au.LJI("loading_type", "video");
    }

    public final void LJII(int i, EnumC44070HRi enumC44070HRi) {
        Activity activity = this.LJIIJJI;
        if (activity == null) {
            return;
        }
        if (this.LJIJJLI) {
            LJFF(this.LJIJJ, enumC44070HRi, Boolean.FALSE);
            this.LJIILJJIL.post(new ARunnableS2S0001000_7(i, 0));
        } else {
            AnonymousClass114.LIZ(activity, i);
        }
    }

    public final void LJIIIIZZ(String str, EnumC44070HRi enumC44070HRi) {
        Activity activity = this.LJIIJJI;
        if (activity == null) {
            return;
        }
        if (this.LJIJJLI) {
            LJFF(this.LJIJJ, enumC44070HRi, Boolean.FALSE);
            this.LJIILJJIL.post(new ARunnableS13S1000000_7(str, 0));
        } else {
            C31811Ce7.LIZIZ(activity, str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x007a, code lost:
    
        if (X.C2NU.LIZ.LIZIZ() == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(android.app.Activity r7, com.ss.android.ugc.aweme.feed.model.Aweme r8, java.lang.String r9) {
        /*
            r6 = this;
            r6.LJIIJJI = r7
            r3 = 0
            r6.LJIJ = r3
            boolean r0 = X.AV1.LJIIJJI()
            if (r0 == 0) goto L1c
            r1 = 2131828407(0x7f111eb7, float:1.9289754E38)
            X.HRi r0 = X.EnumC44070HRi.CHILDREN_MODE
            r6.LJII(r1, r0)
            X.HRs r0 = r6.LJIIL
            r0.onFailed()
            r6.LIZ()
            return
        L1c:
            r6.LJIILL = r8
            r6.LJIILLIIL = r9
            if (r8 == 0) goto L36
            com.ss.android.ugc.aweme.profile.model.User r0 = r8.getAuthor()
            if (r0 == 0) goto L36
            boolean r0 = X.C39579Fg7.LJIILL()
            if (r0 != 0) goto L3f
            r1 = 2131844033(0x7f115bc1, float:1.9321447E38)
            X.HRi r0 = X.EnumC44070HRi.SD_CARD_NOT_AVAILABLE
            r6.LJII(r1, r0)
        L36:
            X.HRs r0 = r6.LJIIL
            r0.onFailed()
            r6.LIZ()
            return
        L3f:
            long r4 = X.C39579Fg7.LJIILIIL()
            r1 = 20971520(0x1400000, double:1.03613076E-316)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L53
            r1 = 2131844034(0x7f115bc2, float:1.932145E38)
            X.HRi r0 = X.EnumC44070HRi.SD_CARD_NOT_ENOUGH_SPACE
            r6.LJII(r1, r0)
            goto L36
        L53:
            com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService r1 = com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl.LIZJ()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.LJIILL
            com.ss.android.ugc.aweme.music.model.Music r0 = r0.getMusic()
            boolean r0 = r1.LJIILLIIL(r0)
            if (r0 == 0) goto L70
            android.app.Activity r0 = r6.LJIIJJI
            if (r0 == 0) goto L36
            r1 = 2131845110(0x7f115ff6, float:1.9323632E38)
            X.HRi r0 = X.EnumC44070HRi.COMMERCE_USER_NOT_COMMERCE_MUSIC
            r6.LJII(r1, r0)
            goto L36
        L70:
            android.app.Activity r0 = r6.LJIIJJI
            if (r0 == 0) goto L88
            X.Ivu r0 = X.C2NU.LIZ     // Catch: java.lang.Exception -> L7c
            boolean r0 = r0.LIZIZ()     // Catch: java.lang.Exception -> L7c
            if (r0 != 0) goto L88
        L7c:
            r1 = 2131833362(0x7f113212, float:1.9299804E38)
            X.HRi r0 = X.EnumC44070HRi.NO_INTERNET
            r6.LJII(r1, r0)
            r6.LIZ()
            return
        L88:
            boolean r0 = X.C42431Gl1.LIZ()
            if (r0 == 0) goto La9
            r6.LJ()
        L91:
            Y.ACallableS110S0100000_7 r1 = new Y.ACallableS110S0100000_7
            r0 = 30
            r1.<init>(r8, r0)
            X.10K r3 = X.C10K.LIZJ(r1)
            Y.AgS75S0300000_7 r2 = new Y.AgS75S0300000_7
            r0 = 2
            r2.<init>(r6, r7, r8, r0)
            X.10C r1 = X.C10K.LJIIIIZZ
            r0 = 0
            r3.LJ(r2, r1, r0)
            return
        La9:
            X.Gy5 r0 = r6.LJIIIZ
            if (r0 != 0) goto Lc0
            android.app.Activity r2 = r6.LJIIJJI
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131828397(0x7f111ead, float:1.9289734E38)
            java.lang.String r0 = r1.getString(r0)
            X.Gy5 r0 = X.ProgressDialogC43241Gy5.LIZIZ(r2, r0)
            r6.LJIIIZ = r0
        Lc0:
            X.Gy5 r0 = r6.LJIIIZ
            r0.setIndeterminate(r3)
            X.Gy5 r0 = r6.LJIIIZ
            r0.setProgress(r3)
            long r0 = java.lang.System.currentTimeMillis()
            r6.LJJI = r0
            goto L91
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44066HRe.LIZIZ(android.app.Activity, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):void");
    }

    public final void LIZJ(Activity activity, String str, String str2) {
        Activity activity2;
        this.LJIIJJI = activity;
        if (activity == null) {
            LJII(R.string.f0q, EnumC44070HRi.CONTEXT_NULL);
            return;
        }
        boolean z = false;
        this.LJIJ = false;
        if (u.LJIIZILJ(str)) {
            LJII(R.string.f0q, EnumC44070HRi.AWEME_ID_UNAVAILABLE);
            this.LJIIL.onFailed();
            return;
        }
        if (MSAdaptionService.LJIIL().LJI(activity)) {
            LJII(R.string.f1i, EnumC44070HRi.DUAL_MODE);
            return;
        }
        if (this.LJIIJJI != null) {
            try {
                z = C2NU.LIZ.LIZIZ();
            } catch (Exception unused) {
            }
            if (!z) {
                LJII(R.string.imh, EnumC44070HRi.NO_INTERNET);
                return;
            }
        }
        this.LJIILLIIL = str2;
        if (TextUtils.equals("duet_page", str2)) {
            this.LIZ = "duet_page";
        }
        if (C42431Gl1.LIZ() && this.LJIIJ == null && this.LJIIJJI != null) {
            LJ();
        } else if (!C42431Gl1.LIZ() && this.LJIIIZ == null && (activity2 = this.LJIIJJI) != null) {
            ProgressDialogC43241Gy5 LIZIZ = ProgressDialogC43241Gy5.LIZIZ(activity2, activity2.getResources().getString(R.string.f0g));
            this.LJIIIZ = LIZIZ;
            LIZIZ.setIndeterminate(true);
            this.LJJI = System.currentTimeMillis();
        }
        C38816FLg.LJ(new ARunnableS2S2100000_7(this, str, str2, 0));
    }

    public final void LJFF(DuetAndStitchRouterConfig duetAndStitchRouterConfig, EnumC44070HRi enumC44070HRi, Boolean bool) {
        if (TextUtils.isEmpty(this.LIZIZ)) {
            this.LIZIZ = UUID.randomUUID().toString();
        }
        if (duetAndStitchRouterConfig == null) {
            return;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("creation_id", this.LIZIZ);
        c188727au.LJIIIZ("shoot_way", "duet");
        c188727au.LJIIIZ("enter_from", duetAndStitchRouterConfig.enterFrom);
        c188727au.LIZLLL(bool.booleanValue() ? 1 : 0, "is_success");
        DuetAndStitchRouterConfigKt.mobIsEcommerce(duetAndStitchRouterConfig, new AObjectS42S0101000_5(4, c188727au, 39));
        if (enumC44070HRi != null) {
            c188727au.LIZLLL(enumC44070HRi.getCode(), "error_code");
            c188727au.LJI("error_message", enumC44070HRi.name());
            c188727au.LJI("config_aweme_id", duetAndStitchRouterConfig.awemeId);
            c188727au.LJI("actual_aweme_id", this.LJIILL.getAid());
            c188727au.LJFF(Boolean.valueOf(this.LJIILL.getMusic().isCommercialMusic()), "is_commercial_music");
        } else {
            c188727au.LJI("error_code", "");
            c188727au.LJI("error_message", "");
        }
        AVExternalServiceImpl.LIZ().getAVMobService().onEventV3("click_duet_or_stitch_button_result", c188727au.LIZ);
    }
}
