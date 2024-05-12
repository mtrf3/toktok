package X;

import com.ss.android.ugc.aweme.commerce.tools.music.CommerceToolsMusicService;
import com.ss.android.ugc.aweme.edit.audio.enhance.AudioEnhanceParam;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS59S0110000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5WQ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5WQ extends AbstractC29891Fh<InterfaceC143845ki> implements InterfaceC143845ki, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJL;
    public final C82622Wbi LJLIL;
    public final InterfaceC115514g7 LJLILLLLZI;
    public final InterfaceC115514g7 LJLJI;
    public final InterfaceC115514g7 LJLJJI;
    public final InterfaceC143845ki LJLJJL;
    public final C5H3 LJLJJLL;

    static {
        TBT tbt = new TBT(C5WQ.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLJL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C5WQ.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0, c65351Pkp), C61845OOz.LIZJ(C5WQ.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0, c65351Pkp)};
    }

    @Override // X.InterfaceC143845ki
    public void Ex() {
        boolean z;
        AVMusic extractAVMusic;
        boolean z2 = false;
        if (CommerceToolsMusicService.LIZIZ(false).U40()) {
            return;
        }
        AudioEnhanceParam audioEnhanceParam = LJJLIIIJJI().audioEnhanceParam;
        audioEnhanceParam.getSupportMusicEnhance();
        boolean enableMusicEnhance = audioEnhanceParam.getEnableMusicEnhance();
        if (C5WW.LIZ() && (extractAVMusic = MusicBeanUtilKt.extractAVMusic(LJJLIIIJJI().creativeModel.musicBuzModel)) != null && !extractAVMusic.isPgc()) {
            z = true;
            if (LJJLIIIJJI().mOrigin != 1) {
                z2 = C5WV.LIZ.getBoolean("audio_music_sound", C5WS.LIZ());
            } else {
                z2 = enableMusicEnhance;
            }
        } else {
            z = false;
        }
        LJJLIIIJJI().audioEnhanceParam = new AudioEnhanceParam(audioEnhanceParam.getSupportOriginEnhance(), z, audioEnhanceParam.getEnableOriginEnhance(), z2);
        C43045Guv.LIZLLL(new AqS152S0100000_2(this, 337), 0L);
        AudioEnhanceParam audioEnhanceParam2 = LJJLIIIJJI().audioEnhanceParam;
        o.LJIIIIZZ(audioEnhanceParam2, "model.audioEnhanceParam");
        if (C78685UuP.LJJIFFI(audioEnhanceParam2)) {
            InterfaceC126544xu LJJLI = LJJLI();
            if (LJJLI != null) {
                LJJLI.LIZIZ(null);
                return;
            }
            return;
        }
        InterfaceC126544xu LJJLI2 = LJJLI();
        if (LJJLI2 == null) {
            return;
        }
        LJJLI2.LIZ();
    }

    private final InterfaceC126544xu LJJLI() {
        return (InterfaceC126544xu) this.LJLJJLL.getValue();
    }

    private final InterfaceC143655kP LJJLIIIIJ() {
        return (InterfaceC143655kP) this.LJLJI.LIZ(this, LJLJL[1]);
    }

    public final InterfaceC153275zv LJJLIIIJILLIZJL() {
        return (InterfaceC153275zv) this.LJLJJI.LIZ(this, LJLJL[2]);
    }

    public final VideoPublishEditModel LJJLIIIJJI() {
        return (VideoPublishEditModel) this.LJLILLLLZI.LIZ(this, LJLJL[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0145, code lost:
    
        if (r4 != false) goto L28;
     */
    @Override // X.InterfaceC143845ki
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void P6() {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5WQ.P6():void");
    }

    public final InterfaceC153045zY LJJLIIIJJIZ() {
        return LJJLIIIIJ().Kh().getValue();
    }

    public final C5MG WS() {
        C5MG WS = LJJLIIIIJ().WS();
        if (WS != null) {
            return WS;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.InterfaceC143845ki
    public void ft() {
        String str;
        AudioEnhanceParam param = LJJLIIIJJI().audioEnhanceParam;
        o.LJIIIIZZ(param, "param");
        BC(!C78685UuP.LJJIFFI(param), true);
        AudioEnhanceParam audioEnhanceParam = LJJLIIIJJI().audioEnhanceParam;
        o.LJIIIIZZ(audioEnhanceParam, "model.audioEnhanceParam");
        if (C78685UuP.LJJIFFI(audioEnhanceParam)) {
            str = "on";
        } else {
            str = "off";
        }
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("enter_from", LJJLIIIJJI().enterFrom);
        c145995oB.LJI("shoot_way", LJJLIIIJJI().mShootWay);
        c145995oB.LJI("content_source", H7R.LJIIIIZZ(LJJLIIIJJI()));
        c145995oB.LJI("content_type", H7R.LJIIIZ(LJJLIIIJJI()));
        c145995oB.LJI("creation_id", LJJLIIIJJI().getCreationId());
        c145995oB.LJI("noise_reducer_status", str);
        c145995oB.LJI("enter_type", H8F.LJIIIZ(LJJLIIIJJI()));
        FMX.LJIIL("click_noise_reducer_icon", c145995oB.LIZ);
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC143845ki getApiComponent() {
        return this.LJLJJL;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C5WQ(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLJI = UCI.LJI(getDiContainer(), InterfaceC143655kP.class, null);
        this.LJLJJI = UCI.LJI(getDiContainer(), InterfaceC153275zv.class, null);
        this.LJLJJL = this;
        this.LJLJJLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 335));
    }

    @Override // X.InterfaceC143845ki
    public void BC(boolean z, final boolean z2) {
        AudioEnhanceParam param = LJJLIIIJJI().audioEnhanceParam;
        o.LJIIIIZZ(param, "param");
        if (C78685UuP.LJJIFFI(param) == z) {
            return;
        }
        AudioEnhanceParam audioEnhanceParam = LJJLIIIJJI().audioEnhanceParam;
        o.LJIIIIZZ(audioEnhanceParam, "model.audioEnhanceParam");
        if (C78685UuP.LJJIFFI(audioEnhanceParam)) {
            LJJLIIIJJI().audioEnhanceParam = new AudioEnhanceParam(param.getSupportOriginEnhance(), param.getSupportMusicEnhance(), false, false);
            InterfaceC126544xu LJJLI = LJJLI();
            if (LJJLI != null) {
                LJJLI.LIZ();
            }
            LJJLIIIJILLIZJL().qb(false);
            if (z2) {
                C24540xm.LIZ(R.string.itb, C78688UuS.LJIJJ(this), 3044);
            }
            if (LJJLIIIJJI().mOrigin != 1) {
                C5WV.LIZ.storeBoolean("audio_music_sound", false);
                return;
            }
            return;
        }
        LJJLIIIJJI().audioEnhanceParam = new AudioEnhanceParam(param.getSupportOriginEnhance(), param.getSupportMusicEnhance(), param.getSupportOriginEnhance(), param.getSupportMusicEnhance());
        InterfaceC126544xu LJJLI2 = LJJLI();
        if (LJJLI2 == null) {
            return;
        }
        LJJLI2.LIZIZ(new InterfaceC126334xZ() { // from class: X.5WR
            @Override // X.InterfaceC126334xZ
            public final void onFailure() {
                if (z2) {
                    C43045Guv.LIZLLL(new AqS152S0100000_2(C5WQ.this, 336), 0L);
                }
            }

            @Override // X.InterfaceC126334xZ
            public final void onSuccess() {
                C43045Guv.LIZLLL(new AqS59S0110000_2(C5WQ.this, z2, 3), 0L);
            }
        });
    }
}
