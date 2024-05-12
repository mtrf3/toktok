package X;

import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VEEditor;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5nP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C145515nP extends AbstractC29891Fh<InterfaceC145455nJ> implements InterfaceC145455nJ, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLF;
    public final C82622Wbi LJLIL;
    public final WMH LJLILLLLZI;
    public final int LJLJI;
    public final InterfaceC115514g7 LJLJJI;
    public final InterfaceC115514g7 LJLJJL;
    public final InterfaceC115514g7 LJLJJLL;
    public final InterfaceC115514g7 LJLJL;
    public final InterfaceC115514g7 LJLJLJ;
    public final InterfaceC115514g7 LJLJLLL;
    public final InterfaceC115514g7 LJLL;
    public final InterfaceC115514g7 LJLLI;
    public final C40871j1<Integer> LJLLILLLL;
    public final C40871j1<C145575nV> LJLLJ;
    public final C29901Fi<C76800UCe> LJLLL;
    public final LiveEvent<C76800UCe> LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public String LJZ;
    public final InterfaceC82194WNq LJZI;
    public InterfaceC145445nI LJZL;
    public final C5H3 LL;
    public final InterfaceC133865Ne LLD;

    public InterfaceC145455nJ LJJLI() {
        return this;
    }

    static {
        TBT tbt = new TBT(C145515nP.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLF = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C145515nP.class, "editVolumeV2Api", "getEditVolumeV2Api()Lcom/ss/android/ugc/gamora/editor/volume/EditVolumeV2Api;", 0, c65351Pkp), C61845OOz.LIZJ(C145515nP.class, "editorProApi", "getEditorProApi()Lcom/ss/android/ugc/gamora/editorpro/EditorProApi;", 0, c65351Pkp), C61845OOz.LIZJ(C145515nP.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0, c65351Pkp), C61845OOz.LIZJ(C145515nP.class, "editMusicApi", "getEditMusicApi()Lcom/ss/android/ugc/gamora/editor/music/EditMusicApi;", 0, c65351Pkp), C61845OOz.LIZJ(C145515nP.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0, c65351Pkp), C61845OOz.LIZJ(C145515nP.class, "subtitleApi", "getSubtitleApi()Lcom/ss/android/ugc/gamora/editor/subtitle/EditSubtitleApi;", 0, c65351Pkp), C61845OOz.LIZJ(C145515nP.class, "editAutoSaveDraftApi", "getEditAutoSaveDraftApi()Lcom/ss/android/ugc/gamora/editor/draft/EditAutoSaveDraftApi;", 0, c65351Pkp)};
    }

    private final InterfaceC150685vk LJJLIIIIJ() {
        return (InterfaceC150685vk) this.LJLLI.LIZ(this, LLF[7]);
    }

    private final InterfaceC145325n6 LJJLIIIJILLIZJL() {
        return (InterfaceC145325n6) this.LJLJLJ.LIZ(this, LLF[4]);
    }

    private final InterfaceC147865rC LJJLIIIJJIZ() {
        return (InterfaceC147865rC) this.LJLJLLL.LIZ(this, LLF[5]);
    }

    private final C5XM LJJLIIIJLLLLLLLZ() {
        return (C5XM) this.LJLJJL.LIZ(this, LLF[1]);
    }

    private final InterfaceC136115Vv LJJLIIJ() {
        return (InterfaceC136115Vv) this.LJLJJLL.LIZ(this, LLF[2]);
    }

    private final InterfaceC145565nU LJJLJLI() {
        return (InterfaceC145565nU) this.LL.getValue();
    }

    private final InterfaceC143855kj LJJLL() {
        return (InterfaceC143855kj) this.LJLL.LIZ(this, LLF[6]);
    }

    public final InterfaceC143655kP LJJLIIIJJI() {
        return (InterfaceC143655kP) this.LJLJJI.LIZ(this, LLF[0]);
    }

    public final VideoPublishEditModel LJJLJ() {
        return (VideoPublishEditModel) this.LJLJL.LIZ(this, LLF[3]);
    }

    @Override // X.InterfaceC145455nJ
    public void zd() {
        this.LJLLL.LJII(C76800UCe.LIZ);
    }

    private final void LJJZZI() {
        int i;
        InterfaceC153045zY value = LJJLIIIJJI().Kh().getValue();
        if (value != null) {
            i = value.getDuration();
        } else {
            i = 0;
        }
        if (i > LJJLJ().getMCurMusicLength()) {
            return;
        }
        InterfaceC145325n6 LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
        if (LJJLIIIJILLIZJL != null) {
            LJJLIIIJILLIZJL.ha0(LJJLJ().getMMusicStart());
        }
        InterfaceC147865rC LJJLIIIJJIZ = LJJLIIIJJIZ();
        if (LJJLIIIJJIZ != null) {
            LJJLIIIJJIZ.A10().setValue(Boolean.TRUE);
        }
    }

    @Override // X.InterfaceC145455nJ
    public String getEnterMethod() {
        if (i70()) {
            return "music_panel";
        }
        if (BI()) {
            return "entrance_icon";
        }
        return "";
    }

    @Override // X.InterfaceC145455nJ
    public void hide() {
        LJJLJLI().LJJJLIIL();
    }

    @Override // X.InterfaceC145455nJ
    public void show() {
        InterfaceC145565nU LJJLJLI = LJJLJLI();
        LJJLJLI.r(C44384HbQ.LJLLLLLL(LJJLJ()));
        LJJLJLI.LLIIIILZ();
    }

    @Override // X.InterfaceC145455nJ
    public String tT() {
        return LJJLJ().creativeModel.musicBuzModel.soundFilterId;
    }

    @Override // X.InterfaceC145455nJ
    public C0IB<C145575nV> A00() {
        return this.LJLLJ;
    }

    @Override // X.InterfaceC145455nJ
    public boolean BI() {
        return this.LJLZ;
    }

    @Override // X.InterfaceC145455nJ
    public String Rp0() {
        return this.LJZ;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC145455nJ getApiComponent() {
        LJJLI();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC145455nJ
    public C0IB<Integer> getVideoLength() {
        return this.LJLLILLLL;
    }

    @Override // X.InterfaceC145455nJ
    public boolean i70() {
        return this.LJLLLLLL;
    }

    @Override // X.InterfaceC145455nJ
    public LiveEvent<C76800UCe> vk() {
        return this.LJLLLL;
    }

    @Override // X.InterfaceC145455nJ
    public void C3(boolean z) {
        this.LJLZ = z;
        LJJLJLI().C3(z);
    }

    @Override // X.InterfaceC145455nJ
    public void Dl(String tabName) {
        o.LJIIIZ(tabName, "tabName");
        this.LJZ = tabName;
    }

    @Override // X.InterfaceC145455nJ
    public void LJJLIIIJ(int i) {
        this.LJLLILLLL.LJI(Integer.valueOf(i));
    }

    @Override // X.InterfaceC145455nJ
    public void eE(String str) {
        LJJLJ().creativeModel.musicBuzModel.soundFilterId = str;
    }

    @Override // X.InterfaceC145455nJ
    public void hZ(boolean z) {
        this.LJLLLLLL = z;
    }

    @Override // X.InterfaceC145455nJ
    public void r(boolean z) {
        LJJLJLI().r(z);
    }

    public final void LJLIIL(int i, float f) {
        int i2;
        AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(LJJLJ().creativeModel.musicBuzModel);
        InterfaceC153045zY value = LJJLIIIJJI().Kh().getValue();
        if (value == null) {
            return;
        }
        String mMusicPath = LJJLJ().getMMusicPath();
        VideoPublishEditModel model = LJJLJ();
        o.LJIIIZ(model, "model");
        int LIZ = HOH.LIZ(LJJLJ().getCurMusicServerLength(), mMusicPath);
        InterfaceC153045zY value2 = LJJLIIIJJI().Kh().getValue();
        if (value2 != null) {
            i2 = value2.getDuration();
        } else {
            i2 = 0;
        }
        int LIZ2 = C145545nS.LIZ(extractAVMusic, f, i, LIZ, i2);
        LJJLJ().setMMusicEnd(i + LIZ2);
        LJJLIIIJJI().uC(new C123774tR(i, (int) (LIZ2 / f), false));
        int LLJJJJJIL = value.LLJJJJJIL(0, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek, this.LLD);
        if (LLJJJJJIL != 0) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("onPlayMusic seek error: ");
            LIZ3.append(LLJJJJJIL);
            H7B.LIZJ(X1D.LIZIZ(LIZ3));
        }
    }

    public C145515nP(C82622Wbi diContainer, WMH parentScene, int i) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = parentScene;
        this.LJLJI = i;
        this.LJLJJI = UCI.LJI(getDiContainer(), InterfaceC143655kP.class, null);
        this.LJLJJL = UCI.LJII(getDiContainer(), C5XM.class, null);
        this.LJLJJLL = UCI.LJII(getDiContainer(), InterfaceC136115Vv.class, null);
        this.LJLJL = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLJLJ = new C145465nK(this);
        this.LJLJLLL = UCI.LJII(getDiContainer(), InterfaceC147865rC.class, null);
        this.LJLL = UCI.LJII(getDiContainer(), InterfaceC143855kj.class, null);
        this.LJLLI = UCI.LJII(getDiContainer(), InterfaceC150685vk.class, null);
        this.LJLLILLLL = new C40871j1<>(null);
        this.LJLLJ = new C40871j1<>(null);
        C29901Fi<C76800UCe> c29901Fi = new C29901Fi<>();
        this.LJLLL = c29901Fi;
        this.LJLLLL = c29901Fi;
        this.LJLZ = true;
        this.LJZ = "";
        this.LJZI = new InterfaceC82194WNq() { // from class: X.5nQ
            public boolean LIZ;
            public long LIZIZ;
            public long LIZJ;

            @Override // X.InterfaceC82194WNq
            public final void LIZ() {
                C122034qd LJI;
                if (!this.LIZ) {
                    return;
                }
                InterfaceC153045zY value = C145515nP.this.LJJLIIIJJI().Kh().getValue();
                if ((value instanceof C133765Mu) && (LJI = ((C133765Mu) value).LJI()) != null) {
                    C121914qR LJJIII = LJI.LJFF().LJJIII();
                    if (LJJIII != null) {
                        LJJIII.LJ = this.LIZIZ;
                        LJJIII.LJFF = this.LIZJ;
                    }
                    LJI.LJFF().LJJJJJL(LJJIII);
                }
            }

            @Override // X.InterfaceC82194WNq
            public final void LIZJ(float f) {
                C122034qd LJI;
                int i2 = 0;
                if (!C44384HbQ.LJJIIZI(C145515nP.this.LJJLJ())) {
                    this.LIZ = false;
                    return;
                }
                AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(C145515nP.this.LJJLJ().creativeModel.musicBuzModel);
                InterfaceC153045zY value = C145515nP.this.LJJLIIIJJI().Kh().getValue();
                if ((value instanceof C133765Mu) && (LJI = ((C133765Mu) value).LJI()) != null) {
                    C121914qR LJJIII = LJI.LJFF().LJJIII();
                    if (LJJIII != null) {
                        this.LIZIZ = LJJIII.LJ;
                        this.LIZJ = LJJIII.LJFF;
                        LJJIII.LJ = 0L;
                        LJJIII.LJFF = -2L;
                    }
                    LJI.LJFF().LJJJJJL(LJJIII);
                    this.LIZ = true;
                    if (extractAVMusic != null) {
                        i2 = extractAVMusic.getMusicStartFromCut();
                    }
                    LIZIZ(i2, f);
                }
            }

            @Override // X.InterfaceC82194WNq
            public final void LIZIZ(int i2, float f) {
                C145515nP.this.LJLIIL(i2, f);
            }

            @Override // X.InterfaceC82194WNq
            public final void LIZLLL(boolean z, int i2, C145555nT c145555nT, float f) {
                C145515nP.this.LJJZZIII(z, i2, c145555nT, f);
                C145515nP.this.hide();
            }
        };
        this.LL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 347));
        this.LLD = new InterfaceC133865Ne() { // from class: X.5nR
            @Override // X.InterfaceC133865Ne
            public final void LIZ(int i2) {
                InterfaceC153045zY value;
                if (i2 == 0 && (value = C145515nP.this.LJJLIIIJJI().Kh().getValue()) != null) {
                    value.play();
                }
            }
        };
    }

    public final void LJJZZIII(boolean z, int i, C145555nT c145555nT, float f) {
        int i2;
        String str;
        MusicBuzModel musicBuzModel = LJJLJ().creativeModel.musicBuzModel;
        if (musicBuzModel != null) {
            musicBuzModel.musicStartFromCut = i;
        }
        if (!z) {
            if (C44384HbQ.LJJIFFI()) {
                str = "recommend_music";
            } else {
                str = "edit_normal";
            }
            MusicBuzModel musicBuzModel2 = LJJLJ().creativeModel.musicBuzModel;
            if (musicBuzModel2 != null) {
                musicBuzModel2.musicEditFrom = str;
            }
        }
        LJJLJ().setMMusicStart(i);
        LJJLJ().setIsSoundLoop(Boolean.valueOf(c145555nT.LJLILLLLZI));
        AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(LJJLJ().creativeModel.musicBuzModel);
        String mMusicPath = LJJLJ().getMMusicPath();
        VideoPublishEditModel model = LJJLJ();
        o.LJIIIZ(model, "model");
        int LIZ = HOH.LIZ(LJJLJ().getCurMusicServerLength(), mMusicPath);
        InterfaceC153045zY value = LJJLIIIJJI().Kh().getValue();
        if (value != null) {
            i2 = value.getDuration();
        } else {
            i2 = 0;
        }
        int LIZ2 = C145545nS.LIZ(extractAVMusic, f, i, LIZ, i2);
        LJJLJ().setMMusicEnd(i + LIZ2);
        if (C44384HbQ.LJJIFFI()) {
            LJJLIIIJJI().U2(false, false, false);
        } else {
            LJJLIIIJJI().U2(true, false, true);
        }
        InterfaceC145325n6 LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
        if (LJJLIIIJILLIZJL != null) {
            LJJLIIIJILLIZJL.hide();
        }
        LJJLIIIJJI().U2(true, false, true);
        InterfaceC147865rC LJJLIIIJJIZ = LJJLIIIJJIZ();
        if (LJJLIIIJJIZ != null) {
            LJJLIIIJJIZ.A10().setValue(Boolean.TRUE);
        }
        LJJLIIIJJI().Ml(false);
        Boolean isSoundLoop = LJJLJ().getIsSoundLoop();
        o.LJIIIIZZ(isSoundLoop, "mModel.isSoundLoop");
        LJJLIIIJJI().uC(new C123774tR(LJJLJ().getMMusicStart(), (int) (LIZ2 / f), isSoundLoop.booleanValue()));
        LJJLIIIJJI().rZ(true);
        C5XM LJJLIIIJLLLLLLLZ = LJJLIIIJLLLLLLLZ();
        if (LJJLIIIJLLLLLLLZ != null) {
            LJJLIIIJLLLLLLLZ.Fu0(true);
        }
        LJJZZI();
        if (LJJLJ().isMvThemeVideoType() && LJJLJ().mvCreateVideoData.mvType == 1) {
            InterfaceC145445nI interfaceC145445nI = this.LJZL;
            if (interfaceC145445nI != null) {
                String mMusicPath2 = LJJLJ().getMMusicPath();
                o.LJIIIIZZ(mMusicPath2, "mModel.mMusicPath");
                interfaceC145445nI.LLIIIZ(LJJLJ().getMMusicStart(), LJJLJ().getMMusicEnd(), false, mMusicPath2, -1);
            } else {
                o.LJIJI("musicCallback");
                throw null;
            }
        }
        InterfaceC143855kj LJJLL = LJJLL();
        if (LJJLL != null) {
            LJJLL.notifyMusicChange();
        }
        if (LJJLJ().creativeModel.postPageModel.isEnterFromEPDirectly) {
            LJJLIIIJJI().U2(false, false, false);
            InterfaceC136115Vv LJJLIIJ = LJJLIIJ();
            if (LJJLIIJ != null) {
                LJJLIIJ.mt0();
            }
        }
        InterfaceC150685vk LJJLIIIIJ = LJJLIIIIJ();
        if (LJJLIIIIJ != null) {
            LJJLIIIIJ.Pr();
        }
    }

    @Override // X.InterfaceC145455nJ
    public void c70(AVMusic aVMusic, String path, int i, int i2, AVMusicWaveBean aVMusicWaveBean) {
        o.LJIIIZ(path, "path");
        this.LJLLJ.LJI(new C145575nV(aVMusic, path, i, i2, aVMusicWaveBean));
    }
}
