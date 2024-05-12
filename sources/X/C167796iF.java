package X;

import Y.ARunnableS38S0100000_2;
import android.content.Context;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS133S0200000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS7S0010000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6iF */
/* loaded from: classes3.dex */
public final class C167796iF extends AbstractC48231ut<InterfaceC135485Tk, C167786iE, C168046ie, C167916iR> implements InterfaceC135485Tk, InterfaceC135635Tz, InterfaceC136445Xc {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLD;
    public final C82622Wbi LJLL;
    public final InterfaceC115514g7 LJLLI;
    public final InterfaceC115514g7 LJLLILLLL;
    public final InterfaceC115514g7 LJLLJ;
    public final InterfaceC115514g7 LJLLL;
    public final InterfaceC115514g7 LJLLLL;
    public final InterfaceC115514g7 LJLLLLLL;
    public final InterfaceC115514g7 LJLZ;
    public C5T9 LJZ;
    public final InterfaceC115514g7 LJZI;
    public C167786iE LJZL;
    public final InterfaceC65784Pro<C167786iE> LL;

    @Override // X.InterfaceC135485Tk
    public void LLJJJJJIL() {
    }

    static {
        TBT tbt = new TBT(C167796iF.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLD = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C167796iF.class, "aeRecordApiComponent", "getAeRecordApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/record/AERecordApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C167796iF.class, "aePreviewApiComponent", "getAePreviewApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/preview/AEPreviewApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C167796iF.class, "aeVolumeApiComponent", "getAeVolumeApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/volume/AEVolumeApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C167796iF.class, "audioEditingApiComponent", "getAudioEditingApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/AudioEditingApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C167796iF.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0, c65351Pkp), C61845OOz.LIZJ(C167796iF.class, "voApiComponent", "getVoApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/common/VOApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C167796iF.class, "voiceChangeApiComponent", "getVoiceChangeApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/common/VoiceChangeApiComponent;", 0, c65351Pkp)};
    }

    private final C5U4 LLIILZL() {
        return (C5U4) this.LJLLJ.LIZ(this, LLD[2]);
    }

    private final InterfaceC169246ka LLIIZ() {
        return (InterfaceC169246ka) this.LJLLILLLL.LIZ(this, LLD[1]);
    }

    private final InterfaceC166716gV LLJ() {
        return (InterfaceC166716gV) this.LJZI.LIZ(this, LLD[7]);
    }

    private final void LLJI() {
        int i;
        C167786iE c167786iE = this.LJZL;
        if (c167786iE != null) {
            int LLJJLIIIJLLLLLLLZ = c167786iE.LLJJLIIIJLLLLLLLZ();
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("creation_id", LLLLIL().getCreationId());
            c145995oB.LJI("shoot_way", LLLLIL().mShootWay);
            c145995oB.LJI("enter_from", "video_edit_page");
            c145995oB.LJI("content_source", H8F.LJI(LLLLIL()));
            c145995oB.LJI("content_type", H7R.LJIIIZ(LLLLIL()));
            int i2 = 0;
            if (LLJJLIIIJLLLLLLLZ == 1) {
                i = 1;
            } else {
                i = 0;
            }
            c145995oB.LIZ(i, "is_voice_effect");
            if (LLJJLIIIJLLLLLLLZ == 2) {
                i2 = 1;
            }
            c145995oB.LIZ(i2, "is_speech_to_song");
            FMX.LJIIL("click_add_record", c145995oB.LIZ);
            return;
        }
        o.LJIJI("aeVoiceChangeScene");
        throw null;
    }

    private final void LLJJ() {
        C167786iE c167786iE = this.LJZL;
        if (c167786iE != null) {
            int LLJJLIIIJLLLLLLLZ = c167786iE.LLJJLIIIJLLLLLLLZ();
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("creation_id", LLLLIL().getCreationId());
            c145995oB.LJI("shoot_way", LLLLIL().mShootWay);
            c145995oB.LJI("enter_from", "video_edit_page");
            c145995oB.LJI("content_source", H8F.LJI(LLLLIL()));
            c145995oB.LJI("content_type", H7R.LJIIIZ(LLLLIL()));
            int i = 1;
            if (LLJJLIIIJLLLLLLLZ != 1) {
                i = 0;
            }
            c145995oB.LIZ(i, "is_voice_effect");
            FMX.LJIIL("enter_record_panel", c145995oB.LIZ);
            return;
        }
        o.LJIJI("aeVoiceChangeScene");
        throw null;
    }

    @Override // X.InterfaceC135485Tk
    public boolean CZ() {
        C167786iE c167786iE = this.LJZL;
        if (c167786iE != null) {
            if (c167786iE.LLJJJIL().LIZ() != -1) {
                return true;
            }
            return false;
        }
        o.LJIJI("aeVoiceChangeScene");
        throw null;
    }

    @Override // X.InterfaceC135485Tk
    public boolean LJJJLZIJ() {
        String str;
        C167786iE c167786iE = this.LJZL;
        String str2 = null;
        if (c167786iE != null) {
            AbstractC167696i5 abstractC167696i5 = c167786iE.LLJJJIL().LIZIZ;
            if (abstractC167696i5 != null && abstractC167696i5.LJLJL != abstractC167696i5.LJLJJLL) {
                return true;
            }
            MusicBuzModel musicBuzModel = c167786iE.LLIIIJ;
            if (musicBuzModel != null) {
                str = musicBuzModel.stsTemplateId;
            } else {
                str = null;
            }
            if (!o.LJ(str, c167786iE.LLJJL().creativeModel.musicBuzModel.stsTemplateId)) {
                return true;
            }
            MusicBuzModel musicBuzModel2 = c167786iE.LLIIIJ;
            if (musicBuzModel2 != null) {
                str2 = musicBuzModel2.musicPath;
            }
            if (!o.LJ(str2, c167786iE.LLJJL().creativeModel.musicBuzModel.musicPath)) {
                return true;
            }
            return false;
        }
        o.LJIJI("aeVoiceChangeScene");
        throw null;
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C167916iR> LJJLIIIJJIZ() {
        return new AqS152S0100000_2(this, 201);
    }

    public final InterfaceC168156ip LLILL() {
        return (InterfaceC168156ip) this.LJLLL.LIZ(this, LLD[3]);
    }

    public final C5VE LLILZIL() {
        return (C5VE) this.LJLLLL.LIZ(this, LLD[4]);
    }

    public final InterfaceC143655kP LLILZLL() {
        return (InterfaceC143655kP) this.LJLLI.LIZ(this, LLD[0]);
    }

    public final InterfaceC135455Th LLIZ() {
        return (InterfaceC135455Th) this.LJLZ.LIZ(this, LLD[6]);
    }

    public final VideoPublishEditModel LLLLIL() {
        return (VideoPublishEditModel) this.LJLLLLLL.LIZ(this, LLD[5]);
    }

    @Override // X.InterfaceC135485Tk
    public void OV() {
        LJJZZI(C167876iN.LJLIL);
    }

    public final void LLFFF() {
        LLIILZL().LLJILJIL(false);
        LLIILZL().p60();
    }

    public final void LLIFFJFJJ() {
        LLIILZL().LLJILJIL(false);
        LLILL().show();
        this.LJZ.LJ();
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", LLLLIL().getCreationId());
        c145995oB.LJI("enter_from", "video_edit_page");
        c145995oB.LJI("shoot_way", LLLLIL().mShootWay);
        c145995oB.LJI("content_source", H8F.LJI(LLLLIL()));
        c145995oB.LJI("content_type", H7R.LJIIIZ(LLLLIL()));
        c145995oB.LJI("enter_method", "click_audio_editing_panel");
        FMX.LJIIL("edit_volume", c145995oB.LIZ);
    }

    public final void LLIIIL() {
        LLIILZL().LLJILJIL(false);
        LLIIZ().show();
        LLJJ();
    }

    public final void LLJJIII() {
        Integer num;
        int i;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onDurationChanged ");
        LIZ.append(this.LJZ.LJ);
        LIZ.append("  ");
        InterfaceC153045zY value = LLILZLL().Kh().getValue();
        if (value != null) {
            num = Integer.valueOf(value.getDuration());
        } else {
            num = null;
        }
        LIZ.append(num);
        X1D.LIZIZ(LIZ);
        C5T9 c5t9 = this.LJZ;
        c5t9.LIZJ = true;
        c5t9.LJ();
        C5T9 c5t92 = this.LJZ;
        InterfaceC153045zY value2 = LLILZLL().Kh().getValue();
        if (value2 != null) {
            i = value2.getDuration();
        } else {
            i = 0;
        }
        c5t92.LJ = i;
        this.LJZ.LIZ();
    }

    @Override // X.InterfaceC135485Tk
    public void Yq0() {
        Effect effect;
        C5MG WS;
        C122034qd LJJI;
        NLEEditor nLEEditor;
        NLEModel LJ;
        if (!CZ()) {
            return;
        }
        C167786iE c167786iE = this.LJZL;
        if (c167786iE != null) {
            C167736i9 LJI = c167786iE.LLJJJIL().LJI(c167786iE.LLJJJIL().LIZ());
            if (LJI != null && (effect = LJI.LIZ) != null && (WS = LLILZLL().WS()) != null && (LJJI = C17N.LJJI(WS.LJIJ())) != null && (nLEEditor = LJJI.LJIIJ) != null && (LJ = nLEEditor.LJ()) != null) {
                List LIZJ = C122424rG.LIZJ(LJ);
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayList) LIZJ).iterator();
                while (it.hasNext()) {
                    arrayList.add(new C166116fX((NLETrackSlot) it.next(), null, effect));
                }
                LLJ().Jm(arrayList, new InterfaceC166046fQ() { // from class: X.6i0
                    @Override // X.InterfaceC166046fQ
                    public final void LIZ(int i, String voiceChangeTaskId) {
                        o.LJIIIZ(voiceChangeTaskId, "voiceChangeTaskId");
                    }

                    @Override // X.InterfaceC166046fQ
                    public final void LIZIZ(int i, int i2, String voiceChangeTaskId) {
                        o.LJIIIZ(voiceChangeTaskId, "voiceChangeTaskId");
                    }

                    @Override // X.InterfaceC166046fQ
                    public final void LIZJ(String voiceChangeTaskId, int i, C59722Wa errorInfo) {
                        o.LJIIIZ(voiceChangeTaskId, "voiceChangeTaskId");
                        o.LJIIIZ(errorInfo, "errorInfo");
                    }

                    @Override // X.InterfaceC166046fQ
                    public final void LIZLLL(int i, String voiceChangeTaskId, List preparedModels) {
                        o.LJIIIZ(voiceChangeTaskId, "voiceChangeTaskId");
                        o.LJIIIZ(preparedModels, "preparedModels");
                    }
                });
                return;
            }
            return;
        }
        o.LJIJI("aeVoiceChangeScene");
        throw null;
    }

    @Override // X.AbstractC48231ut, X.InterfaceC145485nM
    public void hide() {
        super.hide();
        LLILZIL().CI("ae_voiceChange");
        LLILZIL().zc(this);
    }

    @Override // X.AbstractC48231ut, X.InterfaceC145485nM
    public void show() {
        super.show();
        LLILZIL().Nr0("ae_voiceChange");
        LLILZIL().XY(new AqS168S0100000_2(this, 129));
        this.LJZ.LIZLLL(new AqS152S0100000_2(this, 203), C168166iq.LJLIL, C168176ir.LJLIL, C168026ic.LJLIL);
        LLILZIL().xj0(this);
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C168046ie> LJJLIIIJJI() {
        return C168116il.LJLIL;
    }

    @Override // X.AbstractC48231ut
    public InterfaceC65784Pro<C167786iE> LJLJJLL() {
        return this.LL;
    }

    @Override // X.InterfaceC135485Tk
    public C5T9 fg() {
        return this.LJZ;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLL;
    }

    @Override // X.InterfaceC136445Xc
    public void LJJIL(String childIdentify) {
        C168106ik LLJLL;
        YAB yab;
        o.LJIIIZ(childIdentify, "childIdentify");
        if (o.LJ("ae_volume", childIdentify)) {
            C167786iE c167786iE = this.LJZL;
            if (c167786iE != null) {
                if (c167786iE.LLJJLIIIJLLLLLLLZ() == 2 && (yab = (LLJLL = c167786iE.LLJLL()).LIZIZ) != null) {
                    yab.post(new ARunnableS38S0100000_2(LLJLL, 13));
                    return;
                }
                return;
            }
            o.LJIJI("aeVoiceChangeScene");
            throw null;
        }
    }

    @Override // X.InterfaceC136445Xc
    public void LJJJJLL(String childIdentify) {
        C168106ik LLJLL;
        YAB yab;
        o.LJIIIZ(childIdentify, "childIdentify");
        if (o.LJ("ae_volume", childIdentify)) {
            C167786iE c167786iE = this.LJZL;
            if (c167786iE != null) {
                if (c167786iE.LLJJLIIIJLLLLLLLZ() == 2 && (yab = (LLJLL = c167786iE.LLJLL()).LIZIZ) != null) {
                    yab.post(new ARunnableS38S0100000_2(LLJLL, 12));
                    return;
                }
                return;
            }
            o.LJIJI("aeVoiceChangeScene");
            throw null;
        }
    }

    public final void LLF(Context context) {
        LLJI();
        C167786iE c167786iE = this.LJZL;
        if (c167786iE != null) {
            if (c167786iE.LLJJLIIIJLLLLLLLZ() == 2) {
                VideoPublishEditModel publishEditModel = LLLLIL();
                AqS152S0100000_2 aqS152S0100000_2 = new AqS152S0100000_2(this, 200);
                o.LJIIIZ(context, "context");
                o.LJIIIZ(publishEditModel, "publishEditModel");
                C26227ARb LIZLLL = KMP.LIZLLL(context, R.string.rhz, R.string.rhw);
                UC0.LIZJ(LIZLLL, new AqS133S0200000_2(publishEditModel, aqS152S0100000_2, 3));
                LIZLLL.LJI().LIZLLL();
                return;
            }
            LLIIIL();
            return;
        }
        o.LJIJI("aeVoiceChangeScene");
        throw null;
    }

    @Override // X.InterfaceC135485Tk
    public void LLJILJIL(boolean z) {
        LJJZZI(new AqS7S0010000_2(z, 21));
    }

    public final void LLJJI(boolean z) {
        LLIILZL().LLJILJIL(z);
    }

    @Override // X.InterfaceC135485Tk
    public void LLJJLIIIJLLLLLLLZ(InterfaceC65784Pro<C76800UCe> cancelTaskDone) {
        o.LJIIIZ(cancelTaskDone, "cancelTaskDone");
        C167786iE c167786iE = this.LJZL;
        if (c167786iE != null) {
            if (c167786iE.LJLJL != null) {
                c167786iE.LLJZIJLIL();
            }
            cancelTaskDone.invoke();
            return;
        }
        o.LJIJI("aeVoiceChangeScene");
        throw null;
    }

    @Override // X.InterfaceC135485Tk
    public void LLJLLL(InterfaceC65784Pro<C76800UCe> cancelTaskDone) {
        o.LJIIIZ(cancelTaskDone, "cancelTaskDone");
        C167786iE c167786iE = this.LJZL;
        if (c167786iE != null) {
            c167786iE.LLJJI();
            cancelTaskDone.invoke();
        } else {
            o.LJIJI("aeVoiceChangeScene");
            throw null;
        }
    }

    @Override // X.InterfaceC135485Tk
    public void Z80(AudioRecorderParam audioRecorderParam) {
        LJJZZI(new AqS168S0100000_2(audioRecorderParam, 130));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C167796iF(WMH parentScene, C82622Wbi diContainer) {
        super(parentScene);
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLL = diContainer;
        this.LJLLI = UCI.LJI(getDiContainer(), InterfaceC143655kP.class, null);
        this.LJLLILLLL = UCI.LJI(getDiContainer(), InterfaceC169246ka.class, null);
        this.LJLLJ = UCI.LJI(getDiContainer(), C5U4.class, null);
        this.LJLLL = UCI.LJI(getDiContainer(), InterfaceC168156ip.class, null);
        this.LJLLLL = UCI.LJI(getDiContainer(), C5VE.class, null);
        this.LJLLLLLL = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLZ = UCI.LJI(getDiContainer(), InterfaceC135455Th.class, null);
        this.LJZ = new C5T9(LLIZ().Ll0());
        this.LJZI = UCI.LJI(getDiContainer(), InterfaceC166716gV.class, null);
        this.LL = new AqS152S0100000_2(this, 202);
    }
}
