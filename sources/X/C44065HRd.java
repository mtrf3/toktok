package X;

import Y.ACallableS110S0100000_7;
import Y.ARunnableS13S1000000_7;
import Y.ARunnableS2S0001000_7;
import Y.ARunnableS43S0100000_7;
import Y.AgS110S0200000_7;
import Y.IDLCallbackS18S0300000_7;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.vctrace.BuildConfig;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.InteractPermission;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.IShortVideoConfig;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.model.DuetAndStitchRouterConfig;
import com.ss.android.ugc.aweme.shortvideo.model.DuetAndStitchRouterConfigKt;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.vesdk.utils.DigestUtils;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.HRd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44065HRd {
    public Activity LIZ;
    public Aweme LIZLLL;
    public ProgressDialogC44073HRl LJ;
    public int LJFF;
    public String LJII;
    public AVMusic LJIIIIZZ;
    public float LJIIL;
    public float LJIILIIL;
    public boolean LJIILJJIL;
    public DuetAndStitchRouterConfig LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public long LJIJI;
    public boolean LJIJJ;
    public String LIZIZ = "";
    public String LIZJ = "";
    public final List<String> LJI = new ArrayList();
    public final String LJIIIZ = AVExternalServiceImpl.LIZ().configService().cacheConfig().stitchPublicDir();
    public final Handler LJIIJ = new Handler(C16880lQ.LLJJJJ());
    public String LJIJ = "";
    public int LJIIJJI = 20;
    public final ACallableS110S0100000_7 LJIJJLI = new ACallableS110S0100000_7(this, 33);

    public final void LIZ() {
        ProgressDialogC44073HRl progressDialogC44073HRl = this.LJ;
        if (progressDialogC44073HRl != null) {
            V1B.LJLILLLLZI(progressDialogC44073HRl);
        }
        this.LJ = null;
        if (this.LJIILLIIL && this.LJIIZILJ) {
            Activity activity = this.LIZ;
            if (activity != null) {
                activity.finish();
            }
            this.LJIIZILJ = false;
        }
    }

    public final void LJFF() {
        EnumC44076HRo enumC44076HRo;
        ProgressDialogC44073HRl progressDialogC44073HRl;
        Resources resources;
        C44071HRj c44071HRj;
        if (this.LJ == null) {
            int LIZ = C44079HRr.LIZ();
            if (LIZ != 1) {
                if (LIZ != 2) {
                    enumC44076HRo = EnumC44076HRo.GONE;
                } else {
                    enumC44076HRo = EnumC44076HRo.VISIBLE_AFTER_10S;
                }
            } else {
                enumC44076HRo = EnumC44076HRo.VISIBLE_AFTER_5S;
            }
            Activity activity = this.LIZ;
            String str = null;
            if (activity != null) {
                EnumC44076HRo enumC44076HRo2 = EnumC44076HRo.GONE;
                if (enumC44076HRo == enumC44076HRo2) {
                    c44071HRj = new C44071HRj(activity, enumC44076HRo2, null, "no_cancel");
                } else {
                    c44071HRj = new C44071HRj(activity, enumC44076HRo, new C44067HRf(this), "has_cancel");
                }
                progressDialogC44073HRl = C44072HRk.LIZJ(c44071HRj);
            } else {
                progressDialogC44073HRl = null;
            }
            this.LJ = progressDialogC44073HRl;
            if (progressDialogC44073HRl != null) {
                progressDialogC44073HRl.LIZ();
            }
            ProgressDialogC44073HRl progressDialogC44073HRl2 = this.LJ;
            if (progressDialogC44073HRl2 != null) {
                Activity activity2 = this.LIZ;
                if (activity2 != null && (resources = activity2.getResources()) != null) {
                    str = resources.getString(R.string.f0g);
                }
                progressDialogC44073HRl2.setMessage(str);
            }
        }
    }

    public final void LJIIIIZZ() {
        int i;
        int stitchSetting;
        boolean z;
        EnumC44070HRi enumC44070HRi;
        Resources resources;
        Aweme aweme = this.LIZLLL;
        String str = null;
        if (aweme != null) {
            EnumC44070HRi LIZJ = C220858ld.LIZJ(aweme);
            EnumC44070HRi enumC44070HRi2 = EnumC44070HRi.NO_ERROR;
            if (LIZJ != enumC44070HRi2) {
                IShortVideoConfig shortVideoConfig = AVExternalServiceImpl.LIZ().configService().shortVideoConfig();
                if (LIZJ == EnumC44070HRi.VIDEO_LENGTH_RESTRICT) {
                    Activity activity = this.LIZ;
                    if (activity != null && (resources = activity.getResources()) != null) {
                        str = resources.getString(R.string.e7o, Long.valueOf(shortVideoConfig.maxConsumerDuetOrStitchVideoTime() / 60000));
                    }
                    LJII(str, LIZJ);
                } else {
                    LJI(R.string.rpm, LIZJ);
                }
                LIZ();
                return;
            }
            Aweme aweme2 = this.LIZLLL;
            if (aweme2 != null) {
                InteractPermission interactPermission = aweme2.getInteractPermission();
                if (interactPermission != null) {
                    i = interactPermission.getStitch();
                } else {
                    i = 0;
                }
                if (aweme2.getAwemeType() == 150) {
                    enumC44070HRi = EnumC44070HRi.PHOTO_MODE_VIDEO_TYPE;
                } else if (i == 3) {
                    enumC44070HRi = EnumC44070HRi.AWEME_INTERACT_PERMISSION;
                } else if (i == 4) {
                    enumC44070HRi = EnumC44070HRi.AWEME_INTERACT_PERMISSION;
                } else {
                    boolean LJJIIZI = C78996UzQ.LJJIIZI(aweme2);
                    if (aweme2.getAuthor() == null || ((stitchSetting = aweme2.getAuthor().getStitchSetting()) != 0 && (stitchSetting != 1 || aweme2.getAuthor() == null || aweme2.getAuthor().getFollowStatus() != 2))) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!LJJIIZI) {
                        if (!z) {
                            enumC44070HRi = EnumC44070HRi.AUTHOR_SETTING_FORBID;
                        } else if (i == 1) {
                            enumC44070HRi = EnumC44070HRi.AWEME_INTERACT_PERMISSION;
                        } else if (i == 2) {
                            enumC44070HRi = EnumC44070HRi.AWEME_INTERACT_PERMISSION;
                        } else if (aweme2.getAuthor() != null && aweme2.getAuthor().isSecret()) {
                            enumC44070HRi = EnumC44070HRi.PRIVATE_STATUS;
                        }
                    }
                    enumC44070HRi = enumC44070HRi2;
                }
                if (this.LJIILL != null && enumC44070HRi != enumC44070HRi2) {
                    if (enumC44070HRi == EnumC44070HRi.PHOTO_MODE_VIDEO_TYPE) {
                        LJI(R.string.p6c, LIZJ);
                    } else {
                        LJI(R.string.rpm, enumC44070HRi);
                    }
                    LIZ();
                    return;
                }
                Aweme aweme3 = this.LIZLLL;
                if (aweme3 != null) {
                    VideoUrlModel playAddrH264 = aweme3.getVideo().getPlayAddrH264();
                    if (playAddrH264 == null || playAddrH264.getUrlList().isEmpty()) {
                        LJI(R.string.rpm, EnumC44070HRi.VIDEO_URL_MODEL_IS_NULL);
                        LIZ();
                        return;
                    }
                    Aweme aweme4 = this.LIZLLL;
                    if (aweme4 != null) {
                        if (aweme4.getMusic() != null) {
                            Aweme aweme5 = this.LIZLLL;
                            if (aweme5 != null) {
                                this.LJIILJJIL = aweme5.getMusic().isPgc();
                            } else {
                                o.LJIJI("mAweme");
                                throw null;
                            }
                        }
                        if (!this.LJIILJJIL) {
                            this.LJIIJJI = 0;
                            float f = 0 / 99;
                            this.LJIILIIL = f;
                            this.LJIIL = 1 - f;
                        }
                        List<String> list = this.LJI;
                        List LJJIJ = C47261Igj.LJJIJ(ListProtector.get(playAddrH264.getUrlList(), 0));
                        Aweme aweme6 = this.LIZLLL;
                        if (aweme6 != null) {
                            ((ArrayList) list).addAll(C44078HRq.LIZ(aweme6, LJJIJ));
                            String md5Hex = DigestUtils.md5Hex(playAddrH264.getBitRatedRatioUri());
                            StringBuilder LIZ = X1D.LIZ();
                            String LIZIZ = C025908h.LIZIZ(LIZ, this.LJIIIZ, md5Hex, ".mp4", LIZ);
                            this.LJII = LIZIZ;
                            if (LIZIZ != null) {
                                if (!C39579Fg7.LIZIZ(LIZIZ)) {
                                    C39579Fg7.LJ(this.LJIIIZ, false);
                                    Aweme aweme7 = this.LIZLLL;
                                    if (aweme7 != null) {
                                        String str2 = this.LJIIIZ;
                                        String LJFF = i0.LJFF(md5Hex, ".mp4");
                                        List<String> list2 = this.LJI;
                                        C42418Gko.LIZ(aweme7, list2, str2, LJFF, new HRK(this, aweme7, list2));
                                    } else {
                                        o.LJIJI("mAweme");
                                        throw null;
                                    }
                                } else {
                                    this.LJIIJJI = 99;
                                    float f2 = 99;
                                    float f3 = f2 / f2;
                                    this.LJIILIIL = f3;
                                    this.LJIIL = 1 - f3;
                                    Aweme aweme8 = this.LIZLLL;
                                    if (aweme8 != null) {
                                        if (aweme8.getMusic() != null && this.LJIILJJIL) {
                                            Aweme aweme9 = this.LIZLLL;
                                            if (aweme9 != null) {
                                                Music music = aweme9.getMusic();
                                                o.LJIIIIZZ(music, "mAweme.music");
                                                LIZIZ(music);
                                            } else {
                                                o.LJIJI("mAweme");
                                                throw null;
                                            }
                                        } else {
                                            LIZLLL();
                                        }
                                    } else {
                                        o.LJIJI("mAweme");
                                        throw null;
                                    }
                                }
                                this.LJIIJ.postDelayed(new ARunnableS43S0100000_7(this, 114), 60000L);
                                return;
                            }
                            o.LJIJI("mOutPath");
                            throw null;
                        }
                        o.LJIJI("mAweme");
                        throw null;
                    }
                    o.LJIJI("mAweme");
                    throw null;
                }
                o.LJIJI("mAweme");
                throw null;
            }
            o.LJIJI("mAweme");
            throw null;
        }
        o.LJIJI("mAweme");
        throw null;
    }

    public C44065HRd() {
        float f = 20 / 99;
        this.LJIILIIL = f;
        this.LJIIL = 1 - f;
    }

    public final void LIZLLL() {
        String str;
        String str2;
        String str3;
        if (AV1.LJIIJJI()) {
            LJI(R.string.imh, EnumC44070HRi.CHILDREN_MODE);
            LIZ();
            return;
        }
        this.LJFF = 99;
        if (this.LIZ != null) {
            this.LJIJ = AnonymousClass629.LIZ("randomUUID().toString()");
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("creation_id", this.LJIJ);
            c188727au.LJIIIZ("shoot_way", "stitch");
            Aweme aweme = this.LIZLLL;
            if (aweme != null) {
                c188727au.LJIIIZ("group_id", aweme.getAid());
                c188727au.LJIIIZ("enter_from", this.LIZIZ);
                c188727au.LJIIIZ("enter_method", "click_stitch_button");
                c188727au.LJIIIZ("panel_source", this.LIZJ);
                if (o.LJ(this.LIZJ, "true")) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                c188727au.LJIIIZ("is_through_stitch_button", str);
                c188727au.LJIIIZ("content_source", "shoot");
                c188727au.LJIIIZ("content_type", "video");
                Aweme aweme2 = this.LIZLLL;
                if (aweme2 != null) {
                    c188727au.LIZLLL(aweme2.getVideo().getDuration(), "stitch_video_duration");
                    DuetAndStitchRouterConfig duetAndStitchRouterConfig = this.LJIILL;
                    if (duetAndStitchRouterConfig != null) {
                        DuetAndStitchRouterConfigKt.mobIsEcommerce(duetAndStitchRouterConfig, new AqS173S0100000_7(c188727au, 289));
                    }
                    FMX.LJIIL("shoot", c188727au.LIZ);
                    String str4 = this.LJII;
                    if (str4 != null) {
                        AVMusic aVMusic = this.LJIIIIZZ;
                        if (aVMusic != null) {
                            str2 = aVMusic.getPath();
                        } else {
                            str2 = null;
                        }
                        boolean z = this.LJIILJJIL;
                        Aweme aweme3 = this.LIZLLL;
                        if (aweme3 != null) {
                            User author = aweme3.getAuthor();
                            Aweme aweme4 = this.LIZLLL;
                            if (aweme4 != null) {
                                String aid = aweme4.getAid();
                                AVMusic aVMusic2 = this.LJIIIIZZ;
                                if (aVMusic2 != null) {
                                    str3 = aVMusic2.getMusicId();
                                } else {
                                    str3 = null;
                                }
                                Aweme aweme5 = this.LIZLLL;
                                if (aweme5 != null) {
                                    int duration = aweme5.getVideo().getDuration();
                                    boolean z2 = this.LJIJJ;
                                    Aweme aweme6 = this.LIZLLL;
                                    if (aweme6 != null) {
                                        StitchParams stitchParams = new StitchParams(null, str4, aVMusic, str2, 0, z, str3, author, aid, null, 0L, null, null, false, false, 0L, 0L, duration, false, null, null, z2, aweme6.aigcInfo.getAIGCLabelType(), 1965584, null);
                                        stitchParams.setThroughStitchChain(o.LJ(this.LIZJ, "true"));
                                        Intent intent = new Intent();
                                        intent.putExtra("creation_id", this.LJIJ);
                                        intent.putExtra("shoot_way", "stitch");
                                        if (this.LJIILLIIL) {
                                            DuetAndStitchRouterConfig duetAndStitchRouterConfig2 = this.LJIILL;
                                            o.LJII(duetAndStitchRouterConfig2, "null cannot be cast to non-null type android.os.Parcelable");
                                            intent.putExtra("duet_and_stitch_router_config", duetAndStitchRouterConfig2);
                                        }
                                        Aweme aweme7 = this.LIZLLL;
                                        if (aweme7 != null) {
                                            List<String> ttsVoiceIDs = aweme7.getTtsVoiceIDs();
                                            if (ttsVoiceIDs != null) {
                                                intent.putExtra("tts_voice_ids", new ArrayList(ttsVoiceIDs));
                                            }
                                            Aweme aweme8 = this.LIZLLL;
                                            if (aweme8 != null) {
                                                List<String> ttsVoiceRefIDs = aweme8.getTtsVoiceRefIDs();
                                                if (ttsVoiceRefIDs != null) {
                                                    intent.putExtra("tts_voice_ref_ids", new ArrayList(ttsVoiceRefIDs));
                                                }
                                                Aweme aweme9 = this.LIZLLL;
                                                if (aweme9 != null) {
                                                    List<String> vcVoiceIDs = aweme9.getVcVoiceIDs();
                                                    if (vcVoiceIDs != null) {
                                                        intent.putExtra("vc_voice_ids", new ArrayList(vcVoiceIDs));
                                                    }
                                                    Aweme aweme10 = this.LIZLLL;
                                                    if (aweme10 != null) {
                                                        List<String> vcVoiceRefIDs = aweme10.getVcVoiceRefIDs();
                                                        if (vcVoiceRefIDs != null) {
                                                            intent.putExtra("vc_voice_ref_ids", new ArrayList(vcVoiceRefIDs));
                                                        }
                                                        AVExternalServiceImpl.LIZ().asyncServiceWithOutPanel("stitch", new IDLCallbackS18S0300000_7(intent, this, stitchParams, 4));
                                                        return;
                                                    }
                                                    o.LJIJI("mAweme");
                                                    throw null;
                                                }
                                                o.LJIJI("mAweme");
                                                throw null;
                                            }
                                            o.LJIJI("mAweme");
                                            throw null;
                                        }
                                        o.LJIJI("mAweme");
                                        throw null;
                                    }
                                    o.LJIJI("mAweme");
                                    throw null;
                                }
                                o.LJIJI("mAweme");
                                throw null;
                            }
                            o.LJIJI("mAweme");
                            throw null;
                        }
                        o.LJIJI("mAweme");
                        throw null;
                    }
                    o.LJIJI("mOutPath");
                    throw null;
                }
                o.LJIJI("mAweme");
                throw null;
            }
            o.LJIJI("mAweme");
            throw null;
        }
    }

    public final void LIZIZ(Music music) {
        if (!this.LJIILJJIL || this.LIZ == null) {
            LJI(R.string.rpm, EnumC44070HRi.CONTEXT_NULL);
            LIZ();
        } else {
            MusicService.LJJLIIIJJI().LJJJ(this.LIZ, music.convertToMusicModel(), false, 6, new C44069HRh(this, music));
        }
    }

    public final void LJI(int i, EnumC44070HRi enumC44070HRi) {
        Activity activity = this.LIZ;
        if (activity != null) {
            if (this.LJIILLIIL) {
                LJ(this.LJIILL, enumC44070HRi, false);
                this.LJIIJ.post(new ARunnableS2S0001000_7(i, 1));
            } else {
                AnonymousClass114.LIZ(activity, i);
            }
        }
    }

    public final void LJII(String str, EnumC44070HRi enumC44070HRi) {
        Activity activity = this.LIZ;
        if (activity != null) {
            if (this.LJIILLIIL) {
                LJ(this.LJIILL, enumC44070HRi, false);
                this.LJIIJ.post(new ARunnableS13S1000000_7(str, 1));
            } else {
                C31811Ce7.LIZIZ(activity, str);
            }
        }
    }

    public final void LJ(DuetAndStitchRouterConfig duetAndStitchRouterConfig, EnumC44070HRi enumC44070HRi, boolean z) {
        if (TextUtils.isEmpty(this.LJIJ)) {
            this.LJIJ = AnonymousClass629.LIZ("randomUUID().toString()");
        }
        if (duetAndStitchRouterConfig == null) {
            return;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("creation_id", this.LJIJ);
        c188727au.LJIIIZ("shoot_way", "stitch");
        c188727au.LJIIIZ("enter_from", duetAndStitchRouterConfig.enterFrom);
        c188727au.LIZLLL(z ? 1 : 0, "is_success");
        DuetAndStitchRouterConfigKt.mobIsEcommerce(duetAndStitchRouterConfig, new AqS173S0100000_7(c188727au, BuildConfig.VERSION_CODE));
        if (enumC44070HRi != null) {
            c188727au.LIZLLL(enumC44070HRi.getCode(), "error_code");
            c188727au.LJI("error_message", enumC44070HRi.name());
            c188727au.LJI("config_aweme_id", duetAndStitchRouterConfig.awemeId);
            Aweme aweme = this.LIZLLL;
            if (aweme != null) {
                c188727au.LJI("actual_aweme_id", aweme.getAid());
                Aweme aweme2 = this.LIZLLL;
                if (aweme2 != null) {
                    c188727au.LJFF(Boolean.valueOf(aweme2.getMusic().isCommercialMusic()), "is_commercial_music");
                } else {
                    o.LJIJI("mAweme");
                    throw null;
                }
            } else {
                o.LJIJI("mAweme");
                throw null;
            }
        } else {
            c188727au.LJI("error_code", "");
            c188727au.LJI("error_message", "");
        }
        AVExternalServiceImpl.LIZ().getAVMobService().onEventV3("click_duet_or_stitch_button_result", c188727au.LIZ);
    }

    public final void LIZJ(Aweme aweme, Activity activity, String from, String panelSource, boolean z) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(from, "from");
        o.LJIIIZ(panelSource, "panelSource");
        this.LIZ = activity;
        this.LIZLLL = aweme;
        this.LIZIZ = from;
        this.LIZJ = panelSource;
        this.LJIJJ = z;
        IExternalService LIZ = AVExternalServiceImpl.LIZ();
        o.LJIIIIZZ(LIZ, "get().getService(IExternalService::class.java)");
        if (AV1.LJIIJJI()) {
            LJI(R.string.imh, EnumC44070HRi.CHILDREN_MODE);
            LIZ();
            return;
        }
        if (LIZ.configService().avsettingsConfig().needLoginBeforeRecord()) {
            J9P.LIZIZ(activity, from, "click_stitch_button", null, null);
            LIZ();
            return;
        }
        if (aweme.getAuthor() != null) {
            if (!C39579Fg7.LJIILL()) {
                LJI(R.string.qb6, EnumC44070HRi.SD_CARD_NOT_AVAILABLE);
            } else if (C39579Fg7.LJIILIIL() < 20971520) {
                LJI(R.string.qb7, EnumC44070HRi.SD_CARD_NOT_ENOUGH_SPACE);
            } else {
                if (!C48203Ivv.LJ(activity)) {
                    LJI(R.string.imh, EnumC44070HRi.NO_INTERNET);
                    LIZ();
                    return;
                }
                if (CommerceMediaServiceImpl.LIZJ().LJIILLIIL(aweme.getMusic())) {
                    LJI(R.string.r4_, EnumC44070HRi.COMMERCE_USER_NOT_COMMERCE_MUSIC);
                    LIZ();
                    return;
                }
                if (this.LIZJ.equals("true")) {
                    C188727au c188727au = new C188727au();
                    Aweme aweme2 = this.LIZLLL;
                    if (aweme2 != null) {
                        c188727au.LJIIIZ("group_id", aweme2.getAid());
                        c188727au.LJIIIZ("enter_from", this.LIZIZ);
                        Aweme aweme3 = this.LIZLLL;
                        if (aweme3 != null) {
                            c188727au.LJIIIZ("author_id", aweme3.getAuthorUid());
                            FMX.LJIIL("stitch_button_click", c188727au.LIZ);
                        } else {
                            o.LJIJI("mAweme");
                            throw null;
                        }
                    } else {
                        o.LJIJI("mAweme");
                        throw null;
                    }
                }
                LJFF();
                C10K.LIZJ(new ACallableS110S0100000_7(aweme, 32)).LJ(new AgS110S0200000_7(this, aweme, 5), C10K.LJIIIIZZ, null);
                return;
            }
        }
        LIZ();
    }
}
