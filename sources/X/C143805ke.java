package X;

import Y.AObjectS84S0100000_2;
import androidx.lifecycle.LiveData;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.edit.audio.enhance.AudioEnhanceParam;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.effect.EditEffectVideoModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS13S0202000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5ke, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C143805ke extends AbstractC29891Fh<InterfaceC137035Zj> implements InterfaceC137035Zj, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLILL;
    public final C82622Wbi LJLIL;
    public final ActivityC45651qj LJLILLLLZI;
    public final VideoPublishEditModel LJLJI;
    public final C63C LJLJJI;
    public final C5K1 LJLJJL;
    public final InterfaceC115514g7 LJLJJLL;
    public final InterfaceC115514g7 LJLJL;
    public final InterfaceC115514g7 LJLJLJ;
    public final InterfaceC115514g7 LJLJLLL;
    public final InterfaceC115514g7 LJLL;
    public final C5H3 LJLLI;
    public final InterfaceC115514g7 LJLLILLLL;
    public final InterfaceC115514g7 LJLLJ;
    public final InterfaceC115514g7 LJLLL;
    public final InterfaceC115514g7 LJLLLL;
    public final InterfaceC115514g7 LJLLLLLL;
    public final EditEffectVideoModel LJLZ;
    public final InterfaceC115514g7 LJZ;
    public final InterfaceC115514g7 LJZI;
    public final InterfaceC115514g7 LJZL;
    public final InterfaceC115514g7 LL;
    public final InterfaceC115514g7 LLD;
    public final InterfaceC115514g7 LLF;
    public final InterfaceC115514g7 LLFF;
    public NLEModel LLFFF;
    public AudioRecorderParam LLFII;
    public C140415fB LLFZ;
    public boolean LLI;
    public int LLIFFJFJJ;
    public ArrayList<EffectPointModel> LLII;
    public EffectPointModel LLIIII;
    public AVMusic LLIIIILZ;
    public String LLIIIJ;
    public int LLIIIL;
    public int LLIIIZ;
    public float LLIIJI;
    public boolean LLIIJLIL;
    public boolean LLIIL;
    public float LLIILII;
    public boolean LLIILZL;
    public NLEModel LLIIZ;
    public C143815kf LLIL;
    public List<TextStickerData> LLILII;
    public List<StickerItemModel> LLILIL;

    public InterfaceC137035Zj LJJLIIIJJI() {
        return this;
    }

    static {
        TBT tbt = new TBT(C143805ke.class, "editVolumeV2Api", "getEditVolumeV2Api()Lcom/ss/android/ugc/gamora/editor/volume/EditVolumeV2Api;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLILL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C143805ke.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0, c65351Pkp), C61845OOz.LIZJ(C143805ke.class, "editAudioRecordApi", "getEditAudioRecordApi()Lcom/ss/android/ugc/aweme/shortvideo/edit/audiorecord/EditAudioRecordApi;", 0, c65351Pkp), C61845OOz.LIZJ(C143805ke.class, "editFilterApi", "getEditFilterApi()Lcom/ss/android/ugc/gamora/editor/filter/core/EditFilterApi;", 0, c65351Pkp), C61845OOz.LIZJ(C143805ke.class, "editAudioEffectApi", "getEditAudioEffectApi()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/EditAudioEffectApi;", 0, c65351Pkp), C61845OOz.LIZJ(C143805ke.class, "editSubtitleApi", "getEditSubtitleApi()Lcom/ss/android/ugc/gamora/editor/subtitle/EditSubtitleApi;", 0, c65351Pkp), C61845OOz.LIZJ(C143805ke.class, "editAutoEnhanceApi", "getEditAutoEnhanceApi()Lcom/ss/android/ugc/gamora/editor/enhance/EditAutoEnhanceApi;", 0, c65351Pkp), C61845OOz.LIZJ(C143805ke.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0, c65351Pkp), C61845OOz.LIZJ(C143805ke.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0, c65351Pkp), C61845OOz.LIZJ(C143805ke.class, "editEffectApi", "getEditEffectApi()Lcom/ss/android/ugc/aweme/shortvideo/edit/effect/EditEffectApi;", 0, c65351Pkp), C61845OOz.LIZJ(C143805ke.class, "editCutInternalApi", "getEditCutInternalApi()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditCutInternalApi;", 0, c65351Pkp), C61845OOz.LIZJ(C143805ke.class, "editCutMusicApi", "getEditCutMusicApi()Lcom/ss/android/ugc/gamora/editor/cutmusic/EditCutMusicApi;", 0, c65351Pkp), C61845OOz.LIZJ(C143805ke.class, "musicController", "getMusicController()Lcom/ss/android/ugc/gamora/editor/IEditMusicController;", 0, c65351Pkp), C61845OOz.LIZJ(C143805ke.class, "editAudioEnhanceApi", "getEditAudioEnhanceApi()Lcom/ss/android/ugc/gamora/editor/audioenhance/EditAudioEnhanceApi;", 0, c65351Pkp), C61845OOz.LIZJ(C143805ke.class, "editDraftApi", "getEditDraftApi()Lcom/ss/android/ugc/gamora/editor/draft/EditDraftApi;", 0, c65351Pkp), C61845OOz.LIZJ(C143805ke.class, "editMusicApi", "getEditMusicApi()Lcom/ss/android/ugc/gamora/editor/music/EditMusicApi;", 0, c65351Pkp), C61845OOz.LIZJ(C143805ke.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0, c65351Pkp)};
    }

    private final InterfaceC142515iZ LJJLIIIJJIZ() {
        return (InterfaceC142515iZ) this.LLFF.LIZ(this, LLILL[16]);
    }

    private final InterfaceC145875nz LJJLIIIJLLLLLLLZ() {
        return (InterfaceC145875nz) this.LJLL.LIZ(this, LLILL[4]);
    }

    private final InterfaceC143845ki LJJLIIJ() {
        return (InterfaceC143845ki) this.LL.LIZ(this, LLILL[13]);
    }

    private final InterfaceC146665pG LJJLJ() {
        return (InterfaceC146665pG) this.LJLJLJ.LIZ(this, LLILL[2]);
    }

    private final InterfaceC146675pH LJJLJLI() {
        return (InterfaceC146675pH) this.LJLLJ.LIZ(this, LLILL[6]);
    }

    private final I6G LJJLL() {
        return (I6G) this.LJZ.LIZ(this, LLILL[10]);
    }

    private final InterfaceC145455nJ LJJZZI() {
        return (InterfaceC145455nJ) this.LJZI.LIZ(this, LLILL[11]);
    }

    private final InterfaceC140255ev LJJZZIII() {
        return (InterfaceC140255ev) this.LLD.LIZ(this, LLILL[14]);
    }

    private final InterfaceC145485nM LJLIIL() {
        return (InterfaceC145485nM) this.LJLLLLLL.LIZ(this, LLILL[9]);
    }

    private final InterfaceC146235oZ LJLJJL() {
        return (InterfaceC146235oZ) this.LJLJLLL.LIZ(this, LLILL[3]);
    }

    private final InterfaceC145325n6 LJLJJLL() {
        return (InterfaceC145325n6) this.LLF.LIZ(this, LLILL[15]);
    }

    private final InterfaceC147865rC LJLLILLLL() {
        return (InterfaceC147865rC) this.LJLLLL.LIZ(this, LLILL[8]);
    }

    private final InterfaceC143855kj LJLLL() {
        return (InterfaceC143855kj) this.LJLLILLLL.LIZ(this, LLILL[5]);
    }

    private final InterfaceC153275zv LJLZ() {
        return (InterfaceC153275zv) this.LJLLL.LIZ(this, LLILL[7]);
    }

    private final EditToolbarViewModel LJZI() {
        return (EditToolbarViewModel) this.LJLLI.getValue();
    }

    private final C5XM LLF() {
        return (C5XM) this.LJLJJLL.LIZ(this, LLILL[0]);
    }

    private final InterfaceC145495nN LLFFF() {
        return (InterfaceC145495nN) this.LJZL.LIZ(this, LLILL[12]);
    }

    private final void clearMusic() {
        I9T.LJI(null, false, this.LJLJI.creativeModel.musicBuzModel);
        InterfaceC145495nN LLFFF = LLFFF();
        if (LLFFF != null) {
            LLFFF.clearMusic();
        }
    }

    public final InterfaceC143655kP LJLJLJ() {
        return (InterfaceC143655kP) this.LJLJL.LIZ(this, LLILL[1]);
    }

    @Override // X.InterfaceC137035Zj
    public void Q70() {
        InterfaceC153045zY interfaceC153045zY;
        C133765Mu c133765Mu;
        C5MG WS;
        InterfaceC139535dl fB;
        InterfaceC143845ki LJJLIIJ;
        InterfaceC146675pH LJJLJLI;
        C78841Uwv.LJJIIZI(new AqS152S0100000_2(this, 217));
        InterfaceC143655kP LJLJLJ = LJLJLJ();
        if (LJLJLJ != null) {
            LJLJLJ.N6(C140465fG.LIZ());
        }
        InterfaceC143655kP LJLJLJ2 = LJLJLJ();
        if (LJLJLJ2 != null) {
            LJLJLJ2.MK(C135285Sq.LIZIZ());
        }
        if (this.LJLJI.autoEnhanceOn && (LJJLJLI = LJJLJLI()) != null) {
            LJJLJLI.a00(false, false);
        }
        if (this.LLIIL && (LJJLIIJ = LJJLIIJ()) != null) {
            LJJLIIJ.BC(false, false);
        }
        if (!G3R.LIZ()) {
            InterfaceC147865rC LJLLILLLL = LJLLILLLL();
            if (LJLLILLLL != null) {
                LJLLILLLL.WW(false);
            }
        } else {
            InterfaceC147865rC LJLLILLLL2 = LJLLILLLL();
            if (LJLLILLLL2 != null) {
                LJLLILLLL2.Dq();
            }
        }
        this.LJLJJI.LLJLIL().Ae(false);
        InterfaceC147865rC LJLLILLLL3 = LJLLILLLL();
        if (LJLLILLLL3 != null && (fB = LJLLILLLL3.fB()) != null) {
            fB.B4(false);
        }
        InterfaceC145485nM LJLIIL = LJLIIL();
        if (LJLIIL != null) {
            LJLIIL.pl();
        }
        InterfaceC145485nM LJLIIL2 = LJLIIL();
        if (LJLIIL2 != null) {
            LJLIIL2.LLIL();
        }
        this.LJLJI.editMusicSyncMode = false;
        NLEModel nLEModel = null;
        I6G i6g = (I6G) ((C1EP) getDiContainer().LJ(C1EP.class, null)).sO(I6G.class);
        if (i6g != null) {
            i6g.aA(false);
        }
        this.LJLJI.setMMusicStart(0);
        this.LJLJI.setMMusicEnd(this.LLIIIZ);
        if (this.LLIIIILZ != null && this.LLIIIJ != null) {
            I9T.LJI(null, false, this.LJLJI.creativeModel.musicBuzModel);
            InterfaceC145495nN LLFFF = LLFFF();
            if (LLFFF != null) {
                LLFFF.clearMusic();
            }
        }
        VideoPublishEditModel videoPublishEditModel = this.LJLJI;
        videoPublishEditModel.musicVolume = WUK.LJIJI;
        if (!C44384HbQ.LJLL(videoPublishEditModel)) {
            this.LJLJI.voiceVolume = 0.0f;
            InterfaceC143655kP LJLJLJ3 = LJLJLJ();
            if (LJLJLJ3 != null) {
                VEVolumeChangeOp ofVoice = VEVolumeChangeOp.ofVoice(0.0f);
                o.LJIIIIZZ(ofVoice, "ofVoice(0F)");
                LJLJLJ3.Dl0(ofVoice);
            }
        }
        if (G3R.LIZ()) {
            InterfaceC139655dx LIZ = LJJLIIIJJIZ().mu().LIZ();
            if (LIZ != null) {
                LIZ.t8();
            }
            boolean LJLL = C44384HbQ.LJLL(this.LJLJI);
            C5V8.LIZLLL(this.LLFFF, LJLL);
            InterfaceC143655kP LJLJLJ4 = LJLJLJ();
            if (LJLJLJ4 != null && (WS = LJLJLJ4.WS()) != null) {
                interfaceC153045zY = WS.LJJ();
            } else {
                interfaceC153045zY = null;
            }
            if ((interfaceC153045zY instanceof C133765Mu) && (c133765Mu = (C133765Mu) interfaceC153045zY) != null) {
                nLEModel = c133765Mu.LJFF();
            }
            C5V8.LIZLLL(nLEModel, LJLL);
        }
    }

    @Override // X.InterfaceC137035Zj
    public void Su0() {
        NLENode nLENode;
        String str;
        InterfaceC143655kP LJLJLJ;
        C5MG WS;
        NLEModel nLEModel = this.LLIIZ;
        if (nLEModel != null && (LJLJLJ = LJLJLJ()) != null && (WS = LJLJLJ.WS()) != null) {
            WS.LJJ().LJZ(nLEModel);
        }
        NLEModel nLEModel2 = this.LLIIZ;
        if (nLEModel2 != null) {
            nLENode = nLEModel2.deepClone();
        } else {
            nLENode = null;
        }
        this.LLIIZ = NLEModel.dynamicCast(nLENode);
        C143815kf c143815kf = this.LLIL;
        if (c143815kf != null) {
            this.LJLJI.setMMusicStart(c143815kf.LIZJ);
            this.LJLJI.setMMusicEnd(c143815kf.LIZJ + c143815kf.LIZLLL);
            I9T.LJI(null, false, this.LJLJI.creativeModel.musicBuzModel);
            InterfaceC145495nN LLFFF = LLFFF();
            if (LLFFF != null) {
                LLFFF.clearMusic();
            }
            this.LJLJI.musicVolume = c143815kf.LJ;
            AVMusic aVMusic = c143815kf.LIZ;
            if (aVMusic != null && (str = c143815kf.LIZIZ) != null) {
                LJJLI(aVMusic, str, c143815kf.LIZJ, c143815kf.LIZLLL);
            }
        }
        InterfaceC139655dx LIZ = LJJLIIIJJIZ().mu().LIZ();
        if (LIZ != null) {
            LIZ.M6();
        }
    }

    @Override // X.InterfaceC137035Zj
    public void TP() {
        String str;
        C5MG WS;
        C5MG WS2;
        NLEModel nLEModel = this.LLFFF;
        if (nLEModel != null) {
            InterfaceC143655kP LJLJLJ = LJLJLJ();
            if (LJLJLJ != null && (WS2 = LJLJLJ.WS()) != null) {
                WS2.LJJ().LJZ(nLEModel);
            }
            InterfaceC143655kP LJLJLJ2 = LJLJLJ();
            if (LJLJLJ2 != null && (WS = LJLJLJ2.WS()) != null) {
                C78841Uwv.LJJIIJZLJL("EditControlComponent#restoreEdits", WS.LJJ(), C5O7.LJLIL);
            }
        }
        this.LJLJI.setMMusicStart(this.LLIIIL);
        this.LJLJI.setMMusicEnd(this.LLIIIL + this.LLIIIZ);
        I9T.LJI(null, false, this.LJLJI.creativeModel.musicBuzModel);
        InterfaceC145495nN LLFFF = LLFFF();
        if (LLFFF != null) {
            LLFFF.clearMusic();
        }
        VideoPublishEditModel videoPublishEditModel = this.LJLJI;
        videoPublishEditModel.musicVolume = this.LLIIJI;
        videoPublishEditModel.voiceVolume = this.LLIILII;
        AVMusic aVMusic = this.LLIIIILZ;
        if (aVMusic != null && (str = this.LLIIIJ) != null) {
            LJJLI(aVMusic, str, this.LLIIIL, this.LLIIIZ);
        }
        LLIIIL();
    }

    private final void LLIFFJFJJ() {
        InterfaceC147905rG LIZ = LJJLIIIJJIZ().oi0().LIZ();
        if (LIZ != null) {
            for (StickerItemModel stickerItemModel : this.LLILIL) {
                LIZ.Ys(stickerItemModel.getId(), stickerItemModel.startTime, stickerItemModel.endTime, stickerItemModel.uiStartTime, stickerItemModel.uiEndTime);
            }
        }
    }

    private final void LLIIIL() {
        C63D LIZ;
        if (!G3R.LIZ()) {
            return;
        }
        InterfaceC139655dx LIZ2 = LJJLIIIJJIZ().mu().LIZ();
        if (LIZ2 != null) {
            LIZ2.M6();
        }
        if (this.LLILII.isEmpty()) {
            return;
        }
        int size = this.LLILII.size();
        InfoStickerModel infoStickerModel = new InfoStickerModel();
        infoStickerModel.stickers = new ArrayList();
        List<TextStickerData> list = this.LLILII;
        C82622Wbi diContainer = getDiContainer();
        o.LJIIIZ(diContainer, "diContainer");
        InterfaceC138185ba interfaceC138185ba = (InterfaceC138185ba) diContainer.LJIIIIZZ(null, InterfaceC138185ba.class);
        if (list != null) {
            for (TextStickerData textStickerData : list) {
                if (interfaceC138185ba != null) {
                    interfaceC138185ba.xn(C78886Uxe.LJJI(textStickerData));
                }
            }
        }
        int i = 0;
        for (TextStickerData textStickerData2 : this.LLILII) {
            int i2 = i + 1;
            if (i >= 0) {
                TextStickerData textStickerData3 = textStickerData2;
                if (C42000Ge4.LJIILIIL(this.LJLJI)) {
                    InterfaceC139045cy LIZ3 = LJJLIIIJJIZ().vF().LIZ();
                    if (LIZ3 != null) {
                        C139055cz.LIZ(LIZ3, textStickerData3, true, null, 4);
                    }
                } else {
                    StickerItemModel stickerItemModel = new StickerItemModel();
                    stickerItemModel.type = 2;
                    stickerItemModel.extra = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), textStickerData3);
                    List<StickerItemModel> list2 = infoStickerModel.stickers;
                    if (list2 != null) {
                        list2.add(stickerItemModel);
                    }
                    if (i == size - 1 && (LIZ = LJJLIIIJJIZ().PI().LIZ()) != null) {
                        LIZ.b1(infoStickerModel);
                    }
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }

    @Override // X.InterfaceC137035Zj
    public void Nj() {
        InterfaceC153045zY interfaceC153045zY;
        NLEModel nLEModel;
        ArrayList<EffectPointModel> J7;
        LiveData<Boolean> se;
        Boolean value;
        List<StickerItemModel> list;
        LiveData<C140415fB> Dm;
        C140415fB value2;
        C133765Mu c133765Mu;
        C5MG WS;
        InterfaceC143655kP LJLJLJ = LJLJLJ();
        C140415fB c140415fB = null;
        if (LJLJLJ != null && (WS = LJLJLJ.WS()) != null) {
            interfaceC153045zY = WS.LJJ();
        } else {
            interfaceC153045zY = null;
        }
        if ((interfaceC153045zY instanceof C133765Mu) && (c133765Mu = (C133765Mu) interfaceC153045zY) != null) {
            nLEModel = c133765Mu.LLIIIL();
        } else {
            nLEModel = null;
        }
        this.LLFFF = nLEModel;
        AudioRecorderParam audioRecorderParam = new AudioRecorderParam();
        audioRecorderParam.copyFrom(this.LJLJI.veAudioRecorderParam);
        this.LLFII = audioRecorderParam;
        InterfaceC143655kP LJLJLJ2 = LJLJLJ();
        if (LJLJLJ2 != null && (Dm = LJLJLJ2.Dm()) != null && (value2 = Dm.getValue()) != null) {
            c140415fB = new C140415fB(value2.LJLILLLLZI, value2.LJLJJI, value2.LJLIL, value2.LJLJI, value2.LJLJJL);
        }
        this.LLFZ = c140415fB;
        VideoPublishEditModel videoPublishEditModel = this.LJLJI;
        this.LLI = videoPublishEditModel.autoEnhanceOn;
        this.LLIFFJFJJ = videoPublishEditModel.autoEnhanceType;
        AudioEnhanceParam audioEnhanceParam = videoPublishEditModel.audioEnhanceParam;
        o.LJIIIIZZ(audioEnhanceParam, "mModel.audioEnhanceParam");
        this.LLIIL = C78685UuP.LJJIFFI(audioEnhanceParam);
        if (C143835kh.LIZ()) {
            this.LLII = new ArrayList<>(this.LJLJI.getEffectList());
        } else {
            InterfaceC143655kP LJLJLJ3 = LJLJLJ();
            if (LJLJLJ3 != null && (J7 = LJLJLJ3.J7()) != null) {
                this.LLII = new ArrayList<>(J7);
            }
        }
        this.LLIIII = this.LJLJI.getTimeEffect();
        InfoStickerModel infoStickerModel = this.LJLJI.infoStickerModel;
        int i = 0;
        boolean z = true;
        if (infoStickerModel != null && (list = infoStickerModel.stickers) != null) {
            ArrayList arrayList = new ArrayList();
            for (StickerItemModel stickerItemModel : list) {
                int i2 = stickerItemModel.type;
                if (i2 == 11 || i2 == 0 || i2 == 10) {
                    arrayList.add(stickerItemModel);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                StickerItemModel stickerItemModel2 = (StickerItemModel) it.next();
                List<StickerItemModel> list2 = this.LLILIL;
                StickerItemModel stickerItemModel3 = new StickerItemModel();
                stickerItemModel3.setId(stickerItemModel2.getId());
                stickerItemModel3.startTime = stickerItemModel2.startTime;
                stickerItemModel3.endTime = stickerItemModel2.endTime;
                stickerItemModel3.uiStartTime = stickerItemModel2.uiStartTime;
                stickerItemModel3.uiEndTime = stickerItemModel2.uiEndTime;
                list2.add(stickerItemModel3);
            }
        }
        this.LLIIIILZ = MusicBeanUtilKt.extractAVMusic(this.LJLJI.creativeModel.musicBuzModel);
        this.LLIIIJ = this.LJLJI.getMMusicPath();
        this.LLIIIL = this.LJLJI.getMMusicStart();
        VideoPublishEditModel videoPublishEditModel2 = this.LJLJI;
        this.LLIIJI = videoPublishEditModel2.musicVolume;
        if (videoPublishEditModel2.getMMusicEnd() >= 0) {
            i = this.LJLJI.getMMusicEnd() - this.LJLJI.getMMusicStart();
        } else {
            AVMusic aVMusic = this.LLIIIILZ;
            if (aVMusic != null) {
                i = aVMusic.getDuration();
            }
        }
        this.LLIIIZ = i;
        VideoPublishEditModel videoPublishEditModel3 = this.LJLJI;
        this.LLIIJLIL = videoPublishEditModel3.editMusicSyncMode;
        this.LLIILII = videoPublishEditModel3.voiceVolume;
        InterfaceC153275zv LJLZ = LJLZ();
        if (LJLZ != null && (se = LJLZ.se(20)) != null && (value = se.getValue()) != null) {
            z = value.booleanValue();
        }
        this.LLIILZL = z;
        if (G3R.LIZ()) {
            this.LLILII.clear();
            InterfaceC139655dx LIZ = LJJLIIIJJIZ().mu().LIZ();
            if (LIZ != null) {
                Iterator<TextStickerData> it2 = LIZ.YU().iterator();
                while (it2.hasNext()) {
                    this.LLILII.add(it2.next());
                }
            }
        }
    }

    @Override // X.InterfaceC137035Zj
    public void Qq() {
        LiveData<InterfaceC153045zY> Kh;
        InterfaceC143655kP LJLJLJ = LJLJLJ();
        if (LJLJLJ != null && (Kh = LJLJLJ.Kh()) != null) {
            Kh.observe(this, new AObjectS84S0100000_2(this, 56));
        }
        LJJZZIII().z60().LIZLLL(this, new AObjectS84S0100000_2(this, 57));
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC137035Zj getApiComponent() {
        LJJLIIIJJI();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    private final void LJJLIIIJILLIZJL(boolean z) {
        C133765Mu c133765Mu;
        C5MG WS;
        if (this.LJLJI.getTimeEffect() == null && C32151Nz.LJJIIJZLJL(this.LJLJI.getEffectList()) && !this.LJLJI.hasInfoStickers() && !this.LJLJJI.LLZZ()) {
            return;
        }
        InterfaceC153045zY interfaceC153045zY = null;
        if (G3R.LIZ()) {
            if (this.LJLJI.isCurrentAutoCutMode()) {
                this.LJLJJI.LLJJ(new C143825kg());
                InterfaceC139655dx LIZ = LJJLIIIJJIZ().mu().LIZ();
                if (LIZ != null) {
                    LIZ.LLIIIILZ();
                }
            } else {
                this.LJLJJI.LLJJ(null);
                InterfaceC143655kP LJLJLJ = LJLJLJ();
                if (LJLJLJ != null && (WS = LJLJLJ.WS()) != null) {
                    interfaceC153045zY = WS.LJJ();
                }
                if ((interfaceC153045zY instanceof C133765Mu) && (c133765Mu = (C133765Mu) interfaceC153045zY) != null) {
                    C5V8.LJ(c133765Mu.LJFF(), C44384HbQ.LJLL(this.LJLJI));
                }
            }
        } else if (z) {
            this.LJLJJI.LLJJ(new C143825kg());
        } else {
            this.LJLJJI.LLJJ(null);
        }
        this.LJLJJI.LLJLIL().y2();
        if (!C32151Nz.LJJIIJZLJL(this.LJLJI.getEffectList())) {
            this.LJLJI.getEffectList().clear();
        }
    }

    @Override // X.InterfaceC137035Zj
    public void P60(boolean z) {
        InterfaceC139535dl fB;
        InterfaceC145875nz LJJLIIIJLLLLLLLZ;
        InterfaceC146665pG LJJLJ = LJJLJ();
        if (LJJLJ != null) {
            LJJLJ.LJJJJLI();
        }
        this.LJLJI.veAudioEffectParam = null;
        InterfaceC146235oZ LJLJJL = LJLJJL();
        if (LJLJJL != null) {
            LJLJJL.N6(C140465fG.LIZ());
        }
        InterfaceC143655kP LJLJLJ = LJLJLJ();
        if (LJLJLJ != null) {
            LJLJLJ.AE(new C140415fB(false, (FilterBean) null, false, (String) null, 16));
        }
        VideoPublishEditModel videoPublishEditModel = this.LJLJI;
        videoPublishEditModel.mSelectedId = 0;
        videoPublishEditModel.mCurFilterIds = null;
        videoPublishEditModel.mSelectedFilterId = null;
        videoPublishEditModel.mSelectedFilterLabel = null;
        InterfaceC143655kP LJLJLJ2 = LJLJLJ();
        if (LJLJLJ2 != null && (LJJLIIIJLLLLLLLZ = LJJLIIIJLLLLLLLZ()) != null) {
            LJJLIIIJLLLLLLLZ.LLIIL(LJLJLJ2, this.LJLJI);
        }
        VideoPublishEditModel videoPublishEditModel2 = this.LJLJI;
        videoPublishEditModel2.veAudioEffectParam = null;
        videoPublishEditModel2.captionStruct = null;
        videoPublishEditModel2.creativeModel.inlineCaptionModel = null;
        ((HashMap) this.LJLJJL.LIZ).clear();
        InterfaceC143855kj LJLLL = LJLLL();
        if (LJLLL != null) {
            LJLLL.X30(null);
        }
        InterfaceC143855kj LJLLL2 = LJLLL();
        if (LJLLL2 != null) {
            LJLLL2.rf0();
        }
        InterfaceC143855kj LJLLL3 = LJLLL();
        if (LJLLL3 != null) {
            LJLLL3.bi(this.LJLJJL);
        }
        InterfaceC153275zv LJLZ = LJLZ();
        if (LJLZ != null) {
            LJLZ.rb(new C148455s9(this.LJLJI.autoEnhanceOn, false));
        }
        VideoPublishEditModel videoPublishEditModel3 = this.LJLJI;
        videoPublishEditModel3.autoEnhanceOn = false;
        videoPublishEditModel3.autoEnhanceType = 0;
        ((LiveData) this.LJLZ.LJLLL.getValue()).setValue(null);
        LJJLIIIJILLIZJL(z);
        this.LJLJI.setTimeEffect(null);
        if (!G3R.LIZ()) {
            InterfaceC147865rC LJLLILLLL = LJLLILLLL();
            if (LJLLILLLL != null) {
                LJLLILLLL.WW(true);
            }
        } else {
            InterfaceC147865rC LJLLILLLL2 = LJLLILLLL();
            if (LJLLILLLL2 != null) {
                LJLLILLLL2.Kg();
            }
        }
        this.LJLJJI.LLJLIL().Ae(true);
        InterfaceC147865rC LJLLILLLL3 = LJLLILLLL();
        if (LJLLILLLL3 != null && (fB = LJLLILLLL3.fB()) != null) {
            fB.B4(true);
        }
        CommentVideoModel commentVideoModel = this.LJLJI.commentVideoModel;
        if (commentVideoModel != null) {
            commentVideoModel.setStartTime(0);
            CommentVideoModel commentVideoModel2 = this.LJLJI.commentVideoModel;
            if (commentVideoModel2 == null) {
                return;
            }
            commentVideoModel2.setEndTime(0);
        }
    }

    @Override // X.InterfaceC137035Zj
    public void Pq(boolean z) {
        boolean z2;
        NLEModel nLEModel;
        C5MG WS;
        C5MG WS2;
        InterfaceC145455nJ LJJZZI;
        C5XM LLF;
        String str;
        EffectPointModel timeEffect;
        C5MG WS3;
        InterfaceC139535dl fB;
        InterfaceC143655kP LJLJLJ;
        InterfaceC143845ki LJJLIIJ;
        InterfaceC146675pH LJJLJLI;
        InterfaceC143655kP LJLJLJ2;
        InterfaceC143655kP LJLJLJ3;
        C78841Uwv.LJJIIZI(new AqS152S0100000_2(this, 219));
        this.LJLJI.veAudioRecorderParam = this.LLFII;
        C140415fB c140415fB = this.LLFZ;
        if (c140415fB != null && (LJLJLJ3 = LJLJLJ()) != null) {
            LJLJLJ3.AE(c140415fB);
        }
        if (this.LJLJI.veAudioEffectParam != null && (LJLJLJ2 = LJLJLJ()) != null) {
            LJLJLJ2.MK(C135285Sq.LIZ(true, this.LJLJI.veAudioEffectParam));
        }
        if (this.LLI && (LJJLJLI = LJJLJLI()) != null) {
            LJJLJLI.a00(true, false);
        }
        VideoPublishEditModel videoPublishEditModel = this.LJLJI;
        videoPublishEditModel.autoEnhanceOn = this.LLI;
        videoPublishEditModel.autoEnhanceType = this.LLIFFJFJJ;
        if (this.LLIIL && (LJJLIIJ = LJJLIIJ()) != null) {
            LJJLIIJ.BC(true, false);
        }
        ArrayList<EffectPointModel> arrayList = this.LLII;
        if (arrayList == null || arrayList.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 && LJLJLJ() != null && (LJLJLJ = LJLJLJ()) != null) {
            C63081OpJ.LLIZ(this.LLII, LJLJLJ.pJ(), null, Boolean.valueOf(this.LJLJI.isReverse()), true);
        }
        this.LJLJJI.LLJLIL().Ae(true);
        if (!G3R.LIZ()) {
            InterfaceC147865rC LJLLILLLL = LJLLILLLL();
            if (LJLLILLLL != null) {
                LJLLILLLL.WW(true);
            }
        } else {
            InterfaceC147865rC LJLLILLLL2 = LJLLILLLL();
            if (LJLLILLLL2 != null) {
                LJLLILLLL2.Kg();
            }
        }
        InterfaceC147865rC LJLLILLLL3 = LJLLILLLL();
        if (LJLLILLLL3 != null && (fB = LJLLILLLL3.fB()) != null) {
            fB.B4(true);
        }
        this.LJLJI.setTimeEffect(this.LLIIII);
        if (C44384HbQ.LJJLI(this.LJLJI) && (timeEffect = this.LJLJI.getTimeEffect()) != null) {
            int startPoint = timeEffect.getStartPoint();
            int endPoint = timeEffect.getEndPoint() - timeEffect.getStartPoint();
            InterfaceC143655kP LJLJLJ4 = LJLJLJ();
            if (LJLJLJ4 != null && (WS3 = LJLJLJ4.WS()) != null) {
                InterfaceC153045zY LJJ = WS3.LJJ();
                C78841Uwv.LJJIIJZLJL("EditControlComponent#restoreEdits", LJJ, new AqS13S0202000_2(timeEffect, startPoint, endPoint, LJJ, 1));
            }
        }
        if (!z) {
            this.LJLJI.setMMusicStart(this.LLIIIL);
            this.LJLJI.setMMusicEnd(this.LLIIIL + this.LLIIIZ);
            if (MusicBeanUtilKt.extractAVMusic(this.LJLJI.creativeModel.musicBuzModel) != null) {
                clearMusic();
            }
            AVMusic aVMusic = this.LLIIIILZ;
            if (aVMusic != null && (str = this.LLIIIJ) != null) {
                LJJLI(aVMusic, str, this.LLIIIL, this.LLIIIZ);
            }
            if (this.LLIIJI >= 0.0f && (LLF = LLF()) != null) {
                LLF.Dz(this.LLIIJI);
            }
        }
        InterfaceC143655kP LJLJLJ5 = LJLJLJ();
        if (LJLJLJ5 != null && (LJJZZI = LJJZZI()) != null) {
            LJJZZI.LJJLIIIJ(C44384HbQ.LJLIIL(LJLJLJ5));
        }
        InterfaceC145455nJ LJJZZI2 = LJJZZI();
        if (LJJZZI2 != null) {
            LJJZZI2.zd();
        }
        this.LJLJI.editMusicSyncMode = this.LLIIJLIL;
        I6G i6g = (I6G) ((C1EP) getDiContainer().LJ(C1EP.class, null)).sO(I6G.class);
        if (i6g != null) {
            i6g.aA(this.LLIIJLIL);
        }
        if (this.LLIILII >= 0.0f) {
            AudioRecorderParam audioRecorderParam = this.LLFII;
            if (audioRecorderParam != null && !audioRecorderParam.getNeedOriginalSound() && this.LLIILII == 0.0f) {
                C5XM LLF2 = LLF();
                if (LLF2 != null) {
                    LLF2.RU(false);
                }
                InterfaceC145325n6 LJLJJLL = LJLJJLL();
                if (LJLJJLL != null) {
                    LJLJJLL.Ro(false);
                }
            }
            C5XM LLF3 = LLF();
            if (LLF3 != null) {
                LLF3.vt0(this.LLIILII);
            }
        }
        if (!z && (nLEModel = this.LLFFF) != null) {
            InterfaceC143655kP LJLJLJ6 = LJLJLJ();
            if (LJLJLJ6 != null && (WS2 = LJLJLJ6.WS()) != null) {
                ((C133765Mu) WS2.LJJ()).LJZ(nLEModel);
            }
            InterfaceC143655kP LJLJLJ7 = LJLJLJ();
            if (LJLJLJ7 != null && (WS = LJLJLJ7.WS()) != null) {
                C78841Uwv.LJJIIJZLJL("EditControlComponent#restoreEdits", WS.LJJ(), C133655Mj.LJLIL);
            }
        }
        InterfaceC153275zv LJLZ = LJLZ();
        if (LJLZ != null) {
            LJLZ.Jf(20, this.LLIILZL);
        }
        LLIIIL();
        LLIFFJFJJ();
    }

    @Override // X.InterfaceC137035Zj
    public void gh(HashMap<String, String> copyResMap) {
        o.LJIIIZ(copyResMap, "copyResMap");
        NLEModel nLEModel = this.LLIIZ;
        if (nLEModel != null) {
            C126194xL.LIZJ(nLEModel, copyResMap);
        }
    }

    private final void LJJLI(AVMusic aVMusic, String str, int i, int i2) {
        C145355n9 LIZ;
        if (i >= 0) {
            aVMusic.setMusicStartFromCut(i);
        }
        InterfaceC145495nN interfaceC145495nN = (InterfaceC145495nN) getDiContainer().LJIIIIZZ(null, InterfaceC145495nN.class);
        I9T.LJI(aVMusic, false, this.LJLJI.creativeModel.musicBuzModel);
        if (C44384HbQ.LJJIFFI()) {
            if (interfaceC145495nN != null) {
                C145505nO.LIZ(interfaceC145495nN, str, aVMusic, true, false, false, false, i, i2, false, 824);
                return;
            }
            return;
        }
        if (str == null || str.length() == 0) {
            LIZ = C145385nC.LIZ(Boolean.TRUE, null, null, null, null, i2, i, 16);
        } else {
            LIZ = C145385nC.LIZ(Boolean.FALSE, "edit_page_list", aVMusic, str, null, i2, i, 16);
        }
        if (interfaceC145495nN == null) {
            return;
        }
        interfaceC145495nN.q3(LIZ);
    }

    public C143805ke(C82622Wbi diContainer, ActivityC45651qj activity, VideoPublishEditModel mModel, C63C stickerScene, C5K1 inlineCaptionCaches) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(mModel, "mModel");
        o.LJIIIZ(stickerScene, "stickerScene");
        o.LJIIIZ(inlineCaptionCaches, "inlineCaptionCaches");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = activity;
        this.LJLJI = mModel;
        this.LJLJJI = stickerScene;
        this.LJLJJL = inlineCaptionCaches;
        this.LJLJJLL = UCI.LJII(getDiContainer(), C5XM.class, null);
        this.LJLJL = UCI.LJII(getDiContainer(), InterfaceC143655kP.class, null);
        this.LJLJLJ = UCI.LJII(getDiContainer(), InterfaceC146665pG.class, null);
        this.LJLJLLL = UCI.LJII(getDiContainer(), InterfaceC146235oZ.class, null);
        this.LJLL = UCI.LJII(getDiContainer(), InterfaceC145875nz.class, null);
        this.LJLLI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 218));
        this.LJLLILLLL = UCI.LJII(getDiContainer(), InterfaceC143855kj.class, null);
        this.LJLLJ = UCI.LJII(getDiContainer(), InterfaceC146675pH.class, null);
        this.LJLLL = UCI.LJII(getDiContainer(), InterfaceC153275zv.class, null);
        this.LJLLLL = UCI.LJII(getDiContainer(), InterfaceC147865rC.class, null);
        this.LJLLLLLL = UCI.LJII(getDiContainer(), InterfaceC145485nM.class, null);
        this.LJLZ = (EditEffectVideoModel) C165706es.LJIIIIZZ(stickerScene, null, null, 6).get(EditEffectVideoModel.class);
        this.LJZ = UCI.LJII(getDiContainer(), I6G.class, null);
        this.LJZI = UCI.LJII(getDiContainer(), InterfaceC145455nJ.class, null);
        this.LJZL = UCI.LJII(getDiContainer(), InterfaceC145495nN.class, null);
        this.LL = UCI.LJII(getDiContainer(), InterfaceC143845ki.class, null);
        this.LLD = UCI.LJI(getDiContainer(), InterfaceC140255ev.class, null);
        this.LLF = UCI.LJII(getDiContainer(), InterfaceC145325n6.class, null);
        this.LLFF = UCI.LJI(getDiContainer(), InterfaceC142515iZ.class, null);
        this.LLIIIZ = -1;
        this.LLIIJI = -1.0f;
        this.LLIILII = -1.0f;
        this.LLIILZL = true;
        this.LLILII = new ArrayList();
        this.LLILIL = new ArrayList();
    }

    public static /* synthetic */ void LJJLIIIIJ(C143805ke c143805ke, AVMusic aVMusic, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i = -1;
        }
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        c143805ke.LJJLI(aVMusic, str, i, i2);
    }
}
