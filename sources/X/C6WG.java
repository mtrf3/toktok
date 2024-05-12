package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.creative.model.CapCutTemplateMusic;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import defpackage.i0;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6WG, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6WG extends AbstractC29891Fh<InterfaceC146375on> implements InterfaceC146375on, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLJ;
    public final C82622Wbi LJLIL;
    public final CapCutTemplateMusic LJLILLLLZI;
    public final InterfaceC146375on LJLJI;
    public final InterfaceC115514g7 LJLJJI;
    public final InterfaceC115514g7 LJLJJL;
    public final InterfaceC115514g7 LJLJJLL;
    public final C5H3 LJLJL;

    static {
        TBT tbt = new TBT(C6WG.class, "musicApi", "getMusicApi()Lcom/ss/android/ugc/gamora/editor/lightening/music/LighteningMusicApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLJLJ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C6WG.class, "musicController", "getMusicController()Lcom/ss/android/ugc/gamora/editor/IEditMusicController;", 0, c65351Pkp), C61845OOz.LIZJ(C6WG.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0, c65351Pkp)};
    }

    public final VideoPublishEditModel LJJLIIIIJ() {
        return (VideoPublishEditModel) this.LJLJJLL.LIZ(this, LJLJLJ[2]);
    }

    public final InterfaceC145405nE LJJLIIIJILLIZJL() {
        return (InterfaceC145405nE) this.LJLJJI.LIZ(this, LJLJLJ[0]);
    }

    public final InterfaceC145495nN LJJLIIIJJI() {
        return (InterfaceC145495nN) this.LJLJJL.LIZ(this, LJLJLJ[1]);
    }

    public final ActivityC45651qj getActivity() {
        return (ActivityC45651qj) this.LJLJL.getValue();
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        final C6WI c6wi;
        super.onCreate();
        String str = this.LJLILLLLZI.templateId;
        if (str.length() > 0) {
            String str2 = null;
            if (1 != 0) {
                InterfaceC145405nE LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
                if (LJJLIIIJILLIZJL != null) {
                    LJJLIIIJILLIZJL.LJII();
                }
                Keva keva = C6WH.LIZ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("music_id_");
                LIZ.append(str);
                String string = keva.getString(X1D.LIZIZ(LIZ), null);
                int LIZJ = i0.LIZJ("music_start_time_", str, keva, 0);
                StringBuilder LIZLLL = C06540Nm.LIZLLL("CCTemplateInfoKeva get ; templateId : ", str, " ; musicId : ", string, " ; musicStartTime : ");
                LIZLLL.append(LIZJ);
                H7B.LJ(X1D.LIZIZ(LIZLLL));
                if (C78685UuP.LJJJZ(string) && string != null) {
                    c6wi = new C6WI(string, LIZJ);
                    str2 = c6wi.LJLIL;
                } else {
                    c6wi = null;
                }
                LJJLI(str, str2, new M5G() { // from class: X.6WF
                    @Override // X.M5G
                    public final void onFailed(Exception exc) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("CCTemplateMusicComponent ; onFailed : ");
                        LIZ2.append(android.util.Log.getStackTraceString(exc));
                        C5Z2.LIZIZ(X1D.LIZIZ(LIZ2));
                        InterfaceC145405nE LJJLIIIJILLIZJL2 = C6WG.this.LJJLIIIJILLIZJL();
                        if (LJJLIIIJILLIZJL2 != null) {
                            LJJLIIIJILLIZJL2.LJIJ();
                        }
                        C2ND.LIZ(new AqS152S0100000_2(C6WG.this, 215), 500L);
                    }

                    @Override // X.M5G
                    public final void onSuccess(MusicModel musicModel, String str3) {
                        int i;
                        Integer num;
                        int i2;
                        InterfaceC145405nE LJJLIIIJILLIZJL2 = C6WG.this.LJJLIIIJILLIZJL();
                        if (LJJLIIIJILLIZJL2 != null) {
                            LJJLIIIJILLIZJL2.LJIJ();
                        }
                        if (str3 == null) {
                            return;
                        }
                        new I9Q();
                        AVMusic LIZ2 = I9Q.LIZ(musicModel);
                        if (LIZ2 != null) {
                            C6WI c6wi2 = c6wi;
                            if (musicModel != null) {
                                i = musicModel.getDuration();
                            } else {
                                i = -1;
                            }
                            LIZ2.setDuration(HOH.LIZ(i, str3));
                            if (c6wi2 != null) {
                                num = Integer.valueOf(c6wi2.LJLILLLLZI);
                            } else {
                                num = null;
                            }
                            LIZ2.ccTemplateMusicStartTime = num;
                            if (c6wi2 != null) {
                                i2 = c6wi2.LJLILLLLZI;
                            } else {
                                i2 = 0;
                            }
                            LIZ2.setMusicStartFromCut(i2);
                            if (C44384HbQ.LJJIFFI()) {
                                C145505nO.LIZ(C6WG.this.LJJLIIIJJI(), str3, LIZ2, false, false, false, false, 0L, 0L, false, 1008);
                            } else {
                                I9T.LJI(LIZ2, false, C6WG.this.LJJLIIIIJ().creativeModel.musicBuzModel);
                                C6WG.this.LJJLIIIJJI().q3(new C145355n9(false, null, LIZ2, str3, false, null, 0L, 0L, 224));
                            }
                        }
                    }
                });
            }
        }
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC146375on getApiComponent() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C6WG(C82622Wbi diContainer, CapCutTemplateMusic ccTemplateMusic) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(ccTemplateMusic, "ccTemplateMusic");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = ccTemplateMusic;
        this.LJLJI = this;
        this.LJLJJI = UCI.LJII(getDiContainer(), InterfaceC145405nE.class, null);
        this.LJLJJL = UCI.LJI(getDiContainer(), InterfaceC145495nN.class, null);
        this.LJLJJLL = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLJL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 214));
    }

    private final void LJJLI(String str, String str2, M5G m5g) {
        if (str2 != null && str2.length() != 0 && true && str2 != null) {
            MusicService.LJJLIIIJJI().LJJJLIIL(getActivity(), str2, false, null, m5g);
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        MusicService.LJJLIIIJJI().LJIL(getActivity(), m5g, str);
    }
}
