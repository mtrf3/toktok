package X;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLEStyCanvas;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6jF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C168416jF extends AbstractC48231ut<InterfaceC136135Vx, C168426jG, C78598Ut0, C168536jR> implements InterfaceC136135Vx, InterfaceC135635Tz {
    public static final C147155q3 LLIFFJFJJ;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLII;
    public final C82622Wbi LJLL;
    public final C5H3 LJLLI;
    public final InterfaceC115514g7 LJLLILLLL;
    public final MutableLiveData<Boolean> LJLLJ;
    public InterfaceC168446jI LJLLL;
    public InterfaceC168456jJ LJLLLL;
    public boolean LJLLLLLL;
    public C168426jG LJLZ;
    public final InterfaceC115514g7 LJZ;
    public final LiveEvent<C76800UCe> LJZI;
    public final LiveEvent<C76800UCe> LJZL;
    public final InterfaceC115514g7 LL;
    public final InterfaceC65784Pro<C78598Ut0> LLD;
    public final InterfaceC65784Pro<C168536jR> LLF;
    public final InterfaceC65784Pro<C168426jG> LLFF;
    public boolean LLFFF;
    public boolean LLFII;
    public final InterfaceC65784Pro<C76800UCe> LLFZ;
    public final InterfaceC65784Pro<C76800UCe> LLI;

    static {
        TBT tbt = new TBT(C168416jF.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65352Pkq.LIZ.getClass();
        LLII = new InterfaceC74236TBo[]{tbt, new TBT(C168416jF.class, "voApiComponent", "getVoApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/common/VOApiComponent;", 0), new TBT(C168416jF.class, "voiceChangeApiComponent", "getVoiceChangeApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/common/VoiceChangeApiComponent;", 0)};
        LLIFFJFJJ = new C147155q3();
    }

    @Override // X.InterfaceC146665pG
    public void G4(float f, float f2) {
    }

    @Override // X.InterfaceC145605nY
    public void UJ() {
    }

    @Override // X.InterfaceC146665pG
    public void mJ(boolean z) {
    }

    private final InterfaceC143655kP LJLZ() {
        return (InterfaceC143655kP) this.LJLLI.getValue();
    }

    private final C145995oB LJZI() {
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("content_source", H8F.LJI(LLLLIL()));
        c145995oB.LJI("enter_from", "video_edit_page");
        c145995oB.LJI("shoot_way", LLLLIL().mShootWay);
        c145995oB.LJI("creation_id", LLLLIL().getCreationId());
        c145995oB.LJI("content_type", "video");
        c145995oB.LJI("enter_dm", LLLLIL().creativeModel.initialModel.dmCameraModel.enterDM);
        return c145995oB;
    }

    private final InterfaceC135455Th LLF() {
        return (InterfaceC135455Th) this.LJZ.LIZ(this, LLII[1]);
    }

    private final void LLIFFJFJJ() {
        if (this.LJLLLLLL) {
            return;
        }
        this.LJLLLLLL = true;
        InterfaceC168446jI interfaceC168446jI = this.LJLLL;
        if (interfaceC168446jI != null) {
            interfaceC168446jI.k70(new C6LM() { // from class: X.6jH
                @Override // X.C6LM
                public final void LIZ() {
                    AudioRecorderParam audioRecorderParam;
                    C168416jF c168416jF = C168416jF.this;
                    InterfaceC168456jJ interfaceC168456jJ = c168416jF.LJLLLL;
                    if (interfaceC168456jJ != null) {
                        VideoPublishEditModel LLLLIL = c168416jF.LLLLIL();
                        InterfaceC168446jI interfaceC168446jI2 = C168416jF.this.LJLLL;
                        if (interfaceC168446jI2 != null) {
                            audioRecorderParam = interfaceC168446jI2.Xt();
                        } else {
                            audioRecorderParam = null;
                        }
                        interfaceC168456jJ.Qb(C149965ua.LIZ(LLLLIL, audioRecorderParam));
                    }
                }

                @Override // X.C6LM
                public final void LIZJ() {
                    boolean z;
                    AudioRecorderParam audioRecorderParam;
                    C168416jF c168416jF = C168416jF.this;
                    InterfaceC168456jJ interfaceC168456jJ = c168416jF.LJLLLL;
                    if (interfaceC168456jJ != null) {
                        VideoPublishEditModel LLLLIL = c168416jF.LLLLIL();
                        InterfaceC168446jI interfaceC168446jI2 = C168416jF.this.LJLLL;
                        if (interfaceC168446jI2 != null) {
                            audioRecorderParam = interfaceC168446jI2.Xt();
                        } else {
                            audioRecorderParam = null;
                        }
                        interfaceC168456jJ.Qb(C149965ua.LIZ(LLLLIL, audioRecorderParam));
                    }
                    InterfaceC168456jJ interfaceC168456jJ2 = C168416jF.this.LJLLLL;
                    if (interfaceC168456jJ2 != null) {
                        interfaceC168456jJ2.Bg();
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("voiceChangeApiComponent is not null ");
                    if (C168416jF.this.LLFFF() != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    LIZ.append(z);
                    X1D.LIZIZ(LIZ);
                }

                @Override // X.C6LM
                public final void LIZIZ(boolean z) {
                    InterfaceC168456jJ interfaceC168456jJ = C168416jF.this.LJLLLL;
                    if (interfaceC168456jJ != null) {
                        interfaceC168456jJ.p6(!z);
                    }
                }
            });
        }
    }

    public final InterfaceC166716gV LLFFF() {
        return (InterfaceC166716gV) this.LL.LIZ(this, LLII[2]);
    }

    public final void LLIILZL() {
        InterfaceC168446jI interfaceC168446jI = this.LJLLL;
        if (interfaceC168446jI != null) {
            interfaceC168446jI.qn0(new AqS152S0100000_2(this, 154));
        }
    }

    public final VideoPublishEditModel LLLLIL() {
        return (VideoPublishEditModel) this.LJLLILLLL.LIZ(this, LLII[0]);
    }

    public final void p60() {
        boolean z;
        boolean z2;
        InterfaceC168446jI interfaceC168446jI = this.LJLLL;
        if (interfaceC168446jI != null) {
            interfaceC168446jI.LLJJJJJIL();
        }
        InterfaceC168456jJ interfaceC168456jJ = this.LJLLLL;
        if (interfaceC168456jJ != null) {
            interfaceC168456jJ.LLJJJJJIL();
        }
        InterfaceC168456jJ interfaceC168456jJ2 = this.LJLLLL;
        if (interfaceC168456jJ2 != null) {
            z = interfaceC168456jJ2.LJJJLZIJ();
        } else {
            z = false;
        }
        InterfaceC168446jI interfaceC168446jI2 = this.LJLLL;
        if (interfaceC168446jI2 != null) {
            z2 = interfaceC168446jI2.LJJJLZIJ();
        } else {
            z2 = false;
        }
        this.LLFFF = false;
        this.LLFII = false;
        if (!z && !z2) {
            InterfaceC168446jI interfaceC168446jI3 = this.LJLLL;
            if (interfaceC168446jI3 != null) {
                interfaceC168446jI3.LLJJLIIIJLLLLLLLZ(this.LLFZ);
            }
            InterfaceC168456jJ interfaceC168456jJ3 = this.LJLLLL;
            if (interfaceC168456jJ3 != null) {
                interfaceC168456jJ3.LLJJLIIIJLLLLLLLZ(this.LLI);
                return;
            }
            return;
        }
        LLILZIL(C78688UuS.LJIJJ(this), new C168466jK(z, z2, this));
    }

    private final void LLIIIL() {
        C145995oB LJZI = LJZI();
        String LJIIIZ = H8F.LJIIIZ(LLLLIL());
        LJZI.getClass();
        LJZI.LJI("enter_type", LJIIIZ);
        FMX.LJIIL("click_audio_editing", LJZI.LIZ);
        InterfaceC153045zY value = LJLZ().Kh().getValue();
        if (value != null) {
            C145995oB c145995oB = new C145995oB();
            c145995oB.LIZ(value.getDuration(), "duration");
            FMX.LJIIL("audio_edit_duration", c145995oB.LIZ);
        }
    }

    private final void xa() {
        C122034qd LJJI;
        NLEEditor nLEEditor;
        InterfaceC153045zY value = LJLZ().Kh().getValue();
        if (value != null && (LJJI = C17N.LJJI(value)) != null && (nLEEditor = LJJI.LJIIJ) != null) {
            NLESegmentVideo LJJ = NLESegmentVideo.LJJ(nLEEditor.LJ().getMainTrack().LJIILIIL(0).LJI());
            if (LJJ != null && LJJ.LJJI() == null) {
                NLEStyCanvas nLEStyCanvas = new NLEStyCanvas();
                nLEStyCanvas.setExtra("extra_canvas_style_from", "audioEditing");
                LJJ.LJJIII(nLEStyCanvas);
                nLEEditor.LIZIZ();
                return;
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.InterfaceC136135Vx, X.InterfaceC145605nY, X.InterfaceC146665pG
    public void LJJJJLI() {
        LLF().LJJJJLI();
    }

    @Override // X.InterfaceC136135Vx, X.InterfaceC145605nY, X.InterfaceC146665pG
    public void LLD() {
        AudioRecorderParam audioRecorderParam;
        super.show();
        C168526jQ.LIZ(LLLLIL());
        xa();
        Activity LJIJJ = C78688UuS.LJIJJ(this);
        InterfaceC143655kP editPreviewApi = LJLZ();
        o.LJIIIZ(editPreviewApi, "editPreviewApi");
        int LIZIZ = C04330Ez.LIZIZ(LJIJJ, R.color.b5);
        int LJFF = C81184Vtc.LJFF(LJIJJ) + ((int) KL2.LIZJ(LJIJJ, 44.0f));
        int LIZJ = (int) KL2.LIZJ(LJIJJ, 290.0f);
        int LIZIZ2 = ((C81184Vtc.LIZIZ(LJIJJ) - ((int) KL2.LIZJ(LJIJJ, 334.0f))) - C81184Vtc.LJFF(LJIJJ)) - C81184Vtc.LIZJ(LJIJJ);
        AnonymousClass668.LIZIZ().LIZ();
        editPreviewApi.oF(C140345f4.LIZIZ(LIZIZ, LJFF, LIZJ, LIZIZ2, false, false, 960));
        LLIFFJFJJ();
        InterfaceC168446jI interfaceC168446jI = this.LJLLL;
        if (interfaceC168446jI != null) {
            interfaceC168446jI.show();
        }
        InterfaceC168456jJ interfaceC168456jJ = this.LJLLLL;
        if (interfaceC168456jJ != null) {
            VideoPublishEditModel LLLLIL = LLLLIL();
            InterfaceC168446jI interfaceC168446jI2 = this.LJLLL;
            if (interfaceC168446jI2 != null) {
                audioRecorderParam = interfaceC168446jI2.Xt();
            } else {
                audioRecorderParam = null;
            }
            interfaceC168456jJ.Qb(C149965ua.LIZ(LLLLIL, audioRecorderParam));
        }
        InterfaceC168456jJ interfaceC168456jJ2 = this.LJLLLL;
        if (interfaceC168456jJ2 != null) {
            interfaceC168456jJ2.show();
        }
        C168426jG c168426jG = this.LJLZ;
        if (c168426jG != null) {
            InterfaceC45540Hu4 interfaceC45540Hu4 = c168426jG.LJLJI;
            if (interfaceC45540Hu4 != null) {
                interfaceC45540Hu4.registerActivityOnKeyDownListener(c168426jG.LJLJJI);
            }
            LLIIIL();
            return;
        }
        o.LJIJI(WM7.SCENE_SERVICE);
        throw null;
    }

    @Override // X.InterfaceC136135Vx, X.InterfaceC145605nY, X.InterfaceC146665pG
    public void LLLLIILLL() {
        Activity LJIJJ = C78688UuS.LJIJJ(this);
        InterfaceC143655kP editPreviewApi = LJLZ();
        o.LJIIIZ(editPreviewApi, "editPreviewApi");
        int LIZIZ = C04330Ez.LIZIZ(LJIJJ, R.color.b5);
        int LJFF = C81184Vtc.LJFF(LJIJJ) + ((int) KL2.LIZJ(LJIJJ, 44.0f));
        int LIZJ = (int) KL2.LIZJ(LJIJJ, 290.0f);
        int LIZIZ2 = ((C81184Vtc.LIZIZ(LJIJJ) - ((int) KL2.LIZJ(LJIJJ, 334.0f))) - C81184Vtc.LJFF(LJIJJ)) - C81184Vtc.LIZJ(LJIJJ);
        AnonymousClass668.LIZIZ().LIZ();
        editPreviewApi.oF(C140345f4.LIZ(LIZIZ, LJFF, LIZJ, LIZIZ2));
        editPreviewApi.U2(true, false, true);
        InterfaceC168446jI interfaceC168446jI = this.LJLLL;
        if (interfaceC168446jI != null) {
            interfaceC168446jI.hide();
        }
        InterfaceC168456jJ interfaceC168456jJ = this.LJLLLL;
        if (interfaceC168456jJ != null) {
            interfaceC168456jJ.hide();
        }
        super.hide();
        C168426jG c168426jG = this.LJLZ;
        if (c168426jG != null) {
            InterfaceC45540Hu4 interfaceC45540Hu4 = c168426jG.LJLJI;
            if (interfaceC45540Hu4 != null) {
                interfaceC45540Hu4.unRegisterActivityOnKeyDownListener(c168426jG.LJLJJI);
            }
            C168526jQ.LIZ(LLLLIL());
            return;
        }
        o.LJIJI(WM7.SCENE_SERVICE);
        throw null;
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C78598Ut0> LJJLIIIJJI() {
        return this.LLD;
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C168536jR> LJJLIIIJJIZ() {
        return this.LLF;
    }

    @Override // X.AbstractC48231ut
    public InterfaceC65784Pro<C168426jG> LJLJJLL() {
        return this.LLFF;
    }

    @Override // X.InterfaceC136135Vx, X.InterfaceC145605nY, X.InterfaceC146665pG
    public LiveData<Boolean> LLIIIZ() {
        return this.LJLLJ;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLL;
    }

    @Override // X.InterfaceC145875nz
    public LiveEvent<C76800UCe> j50() {
        return this.LJZI;
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // X.InterfaceC146665pG
    public LiveEvent<C76800UCe> uy() {
        return this.LJZL;
    }

    public final void LLIIZ(InterfaceC168456jJ veNonTabApiComponent) {
        o.LJIIIZ(veNonTabApiComponent, "veNonTabApiComponent");
        this.LJLLLL = veNonTabApiComponent;
    }

    public final void LLILL(InterfaceC168446jI voNonTabApiComponent) {
        o.LJIIIZ(voNonTabApiComponent, "voNonTabApiComponent");
        this.LJLLL = voNonTabApiComponent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C168416jF(WMH parentScene, C82622Wbi diContainer) {
        super(parentScene);
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLL = diContainer;
        this.LJLLI = C269113v.LIZ(this, InterfaceC143655kP.class);
        this.LJLLILLLL = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLLJ = new MutableLiveData<>();
        this.LJZ = UCI.LJI(getDiContainer(), InterfaceC135455Th.class, null);
        this.LJZI = new LiveEvent<>();
        this.LJZL = new LiveEvent<>();
        this.LL = UCI.LJI(getDiContainer(), InterfaceC166716gV.class, null);
        this.LLD = C168486jM.LJLIL;
        this.LLF = new AqS152S0100000_2(this, 155);
        this.LLFF = new AqS152S0100000_2(this, 156);
        this.LLFZ = new AqS152S0100000_2(this, 158);
        this.LLI = new AqS152S0100000_2(this, 157);
    }

    private final void LLILZIL(Context context, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        C26227ARb c26227ARb = new C26227ARb(context);
        c26227ARb.LJ(R.string.za);
        UC0.LIZJ(c26227ARb, new AqS168S0100000_2(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 97));
        c26227ARb.LJI().LIZLLL();
    }

    @Override // X.InterfaceC136135Vx, X.InterfaceC145605nY, X.InterfaceC145875nz
    public void LLIIL(InterfaceC143655kP editPreviewApi, VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(editPreviewApi, "editPreviewApi");
        LLFFF().Hy();
    }
}
