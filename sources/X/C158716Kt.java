package X;

import Y.AObserverS63S0300000_2;
import Y.ARunnableS37S0100000_1;
import Y.ARunnableS38S0100000_2;
import android.graphics.Rect;
import android.os.Handler;
import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Iterator;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS165S0200000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS27S0001000_2;
import kotlin.jvm.internal.AqS7S0010000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6Kt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C158716Kt extends AbstractC48231ut<InterfaceC168446jI, C158706Ks, C6L7, C158726Ku> implements InterfaceC168446jI, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LL;
    public final C82622Wbi LJLL;
    public final InterfaceC115514g7 LJLLI;
    public final InterfaceC115514g7 LJLLILLLL;
    public final InterfaceC115514g7 LJLLJ;
    public final InterfaceC115514g7 LJLLL;
    public final Handler LJLLLL;
    public C158706Ks LJLLLLLL;
    public C6LM LJLZ;
    public final InterfaceC65784Pro<C158706Ks> LJZ;
    public final InterfaceC65784Pro<C6L7> LJZI;
    public final InterfaceC65784Pro<C158726Ku> LJZL;

    static {
        TBT tbt = new TBT(C158716Kt.class, "pageContainerApi", "getPageContainerApi()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/nontabstyle/AudioEditNonTabStyleUIComponent;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C158716Kt.class, "videoPublishEditModel", "getVideoPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0, c65351Pkp), C61845OOz.LIZJ(C158716Kt.class, "voApiComponent", "getVoApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/common/VOApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C158716Kt.class, "editVolumeV2Api", "getEditVolumeV2Api()Lcom/ss/android/ugc/gamora/editor/volume/EditVolumeV2Api;", 0, c65351Pkp)};
    }

    private final C5XM LJZI() {
        return (C5XM) this.LJLLL.LIZ(this, LL[3]);
    }

    private final C168416jF LLIFFJFJJ() {
        return (C168416jF) this.LJLLI.LIZ(this, LL[0]);
    }

    public final InterfaceC135455Th LLIIIL() {
        return (InterfaceC135455Th) this.LJLLJ.LIZ(this, LL[2]);
    }

    @Override // X.InterfaceC168446jI
    public void LLJJJJJIL() {
        C158706Ks c158706Ks = this.LJLLLLLL;
        if (c158706Ks != null) {
            c158706Ks.getUiActions().LJI.invoke(C78857UxB.LJJIIJ(1476788483, "bpea-pause_when_cancel"));
        } else {
            o.LJIJI("vOTabScene");
            throw null;
        }
    }

    public final VideoPublishEditModel QY() {
        return (VideoPublishEditModel) this.LJLLILLLL.LIZ(this, LL[1]);
    }

    @Override // X.InterfaceC168446jI
    public AudioRecorderParam Xt() {
        C158706Ks c158706Ks = this.LJLLLLLL;
        if (c158706Ks != null) {
            return c158706Ks.LJLJJL;
        }
        o.LJIJI("vOTabScene");
        throw null;
    }

    @Override // X.AbstractC48231ut, X.InterfaceC145485nM
    public void hide() {
        LLJJIII(9);
    }

    private final boolean LLF() {
        if ((QY().creativeModel.micDataModel.editDefaultVolume != 0.0f || QY().creativeModel.micDataModel.editVolumeChangeMark) && !QY().isCurrentAutoCutMode() && C44384HbQ.LJLJJI(QY()) && QY().voiceVolume > 0.0f) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC168446jI
    public boolean LJJJLZIJ() {
        return LLIIIL().p4();
    }

    public final boolean LLFFF() {
        if (QY().veAudioRecorderParam == null) {
            return LLF();
        }
        return QY().veAudioRecorderParam.getNeedOriginalSound();
    }

    public final void LLILL() {
        LLIIIL().Vq(new AqS152S0100000_2(this, 167));
    }

    public final void LLIZ() {
        LLIIIL().km(new C5F9() { // from class: X.6L9
            @Override // X.C5F9
            public final void LIZ() {
                C158716Kt c158716Kt = C158716Kt.this;
                c158716Kt.LJLLLL.post(new ARunnableS38S0100000_2(c158716Kt, 48));
            }

            @Override // X.C5F9
            public final void LIZIZ() {
                C158716Kt c158716Kt = C158716Kt.this;
                c158716Kt.LJLLLL.post(new ARunnableS38S0100000_2(c158716Kt, 47));
            }
        });
    }

    @Override // X.AbstractC48231ut, X.InterfaceC145485nM
    public void show() {
        boolean z;
        NLETrack nLETrack;
        float f;
        C122034qd LJJI;
        NLEEditor nLEEditor;
        Rect rect;
        VecNLETrackSPtr tracks;
        super.show();
        C158706Ks c158706Ks = this.LJLLLLLL;
        if (c158706Ks != null) {
            if (C149555tv.LIZ(c158706Ks.LJLIL) == 1 && !C78866UxK.LJJJLZIJ(c158706Ks.LJLIL)) {
                z = true;
            } else {
                z = false;
            }
            NLEModel r9 = c158706Ks.LJLILLLLZI.Ll0().r9();
            if (r9 != null && (tracks = r9.getTracks()) != null) {
                Iterator<NLETrack> it = tracks.iterator();
                while (true) {
                    if (it.hasNext()) {
                        nLETrack = it.next();
                        if (C124574uj.LJJIL(nLETrack)) {
                            break;
                        }
                    } else {
                        nLETrack = null;
                        break;
                    }
                }
            } else {
                nLETrack = null;
            }
            if (z && nLETrack == null) {
                c158706Ks.getUiActions().LJIIL.invoke(Boolean.TRUE);
                InterfaceC153045zY value = c158706Ks.LJLILLLLZI.Ll0().Kh().getValue();
                if (value != null && (LJJI = C17N.LJJI(value)) != null && (nLEEditor = LJJI.LJIIJ) != null) {
                    InterfaceC153045zY value2 = c158706Ks.LJLILLLLZI.Ll0().Kh().getValue();
                    if (value2 != null) {
                        rect = value2.t5();
                    } else {
                        rect = null;
                    }
                    c158706Ks.LJLILLLLZI.Ll0().MM().observe(c158706Ks, new AObserverS63S0300000_2(c158706Ks, rect, nLEEditor, 1));
                }
            }
            C5T9 c5t9 = c158706Ks.LJLJL;
            InterfaceC153045zY interfaceC153045zY = c5t9.LIZLLL;
            if (interfaceC153045zY != null && c5t9.LJ != interfaceC153045zY.getDuration()) {
                c158706Ks.LJLJL = new C5T9(c158706Ks.LJLILLLLZI.Ll0());
                FrameLayout frameLayout = c158706Ks.LJLLILLLL;
                if (frameLayout != null) {
                    C6KO c6ko = c158706Ks.LJLLLL;
                    if (c6ko != null) {
                        C16880lQ.LJLLLL(c6ko, frameLayout);
                        c158706Ks.LLJJ();
                    } else {
                        o.LJIJI("currentSeekBar");
                        throw null;
                    }
                } else {
                    o.LJIJI("seekLayout");
                    throw null;
                }
            }
            c158706Ks.LJLILLLLZI.rr0(c158706Ks.LJLJL);
            c158706Ks.LJLJJL = c158706Ks.LJLILLLLZI.Ar0();
            c158706Ks.LJLJJLL = true;
            CheckBox checkBox = c158706Ks.LLF;
            if (checkBox != null) {
                checkBox.setChecked(!r0.getNeedOriginalSound());
                c158706Ks.getUiActions().LJFF.invoke(Boolean.valueOf(c158706Ks.LJLJJL.getNeedOriginalSound()));
                boolean z2 = !c158706Ks.LJLJJL.getMuteByAudioCopyright();
                CheckBox checkBox2 = c158706Ks.LLF;
                if (checkBox2 != null) {
                    checkBox2.setEnabled(z2);
                    View view = c158706Ks.LLFFF;
                    if (view != null) {
                        if (z2) {
                            f = 1.0f;
                        } else {
                            f = 0.66f;
                        }
                        view.setAlpha(f);
                        c158706Ks.LLJILJILJ();
                        c158706Ks.LJLJL.LJFF(c158706Ks.LJLJJL.getMStack());
                        c158706Ks.getUiActions().LJIIJ.invoke(Boolean.valueOf(!c158706Ks.LJLJJL.getMStack().isEmpty()));
                        c158706Ks.getUiActions().LJ.invoke();
                        return;
                    }
                    o.LJIJI("checkBoxText");
                    throw null;
                }
                o.LJIJI("checkBox");
                throw null;
            }
            o.LJIJI("checkBox");
            throw null;
        }
        o.LJIJI("vOTabScene");
        throw null;
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C6L7> LJJLIIIJJI() {
        return this.LJZI;
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C158726Ku> LJJLIIIJJIZ() {
        return this.LJZL;
    }

    @Override // X.AbstractC48231ut
    public InterfaceC65784Pro<C158706Ks> LJLJJLL() {
        return this.LJZ;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLL;
    }

    public final void LJLZ(Cert cert) {
        LLIIIL().EU(new AqS152S0100000_2(this, 164), new AqS168S0100000_2(this, 102), cert);
    }

    public final void LLIILZL(boolean z) {
        C5XM LJZI = LJZI();
        if (LJZI != null) {
            LJZI.RU(z);
        }
        LJJZZI(new AqS7S0010000_2(z, 11));
    }

    public final void LLILZIL(boolean z) {
        LJJZZI(new AqS7S0010000_2(z, 12));
    }

    public final void LLILZLL(Cert cert) {
        LLIIIL().t7(((Boolean) LJJLIIIJILLIZJL(new TBT() { // from class: X.6L4
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C6L7) obj).LJLJJL);
            }
        }).LIZ()).booleanValue(), cert, new AqS152S0100000_2(this, 168), new AqS168S0100000_2(this, 104));
    }

    public final void LLJ(Cert cert) {
        LLIIIL().Eq(cert, new AqS152S0100000_2(this, 171));
    }

    public final void LLJJ(boolean z) {
        LJJZZI(new AqS7S0010000_2(z, 13));
    }

    public final void LLJJI(boolean z) {
        LJJZZI(new AqS7S0010000_2(z, 14));
    }

    public final void LLJJIII(int i) {
        LJJZZI(new AqS27S0001000_2(i, 11));
        C6LM c6lm = this.LJLZ;
        if (c6lm != null) {
            if (i == 3) {
                c6lm.LIZIZ(true);
            } else {
                c6lm.LIZIZ(false);
            }
        }
    }

    public final void LLJJIJI(boolean z) {
        LJJZZI(new AqS7S0010000_2(z, 15));
    }

    @Override // X.InterfaceC168446jI
    public void LLJJLIIIJLLLLLLLZ(final InterfaceC65784Pro<C76800UCe> cancelTaskDone) {
        o.LJIIIZ(cancelTaskDone, "cancelTaskDone");
        LLIIIL().Z3(new C5F9() { // from class: X.6L3
            @Override // X.C5F9
            public final void LIZ() {
                C158716Kt.this.LJLLLL.post(new ARunnableS37S0100000_1(cancelTaskDone, (InterfaceC65784Pro<C76800UCe>) 49));
            }

            @Override // X.C5F9
            public final void LIZIZ() {
                C158716Kt c158716Kt = C158716Kt.this;
                c158716Kt.LJLLLL.post(new ARunnableS38S0100000_2(c158716Kt, 46));
            }
        });
    }

    @Override // X.InterfaceC168446jI
    public void LLJLLL(final InterfaceC65784Pro<C76800UCe> cancelTaskDone) {
        o.LJIIIZ(cancelTaskDone, "cancelTaskDone");
        LLIIIL().s(new C5F9() { // from class: X.6L2
            @Override // X.C5F9
            public final void LIZ() {
                C158716Kt.this.LJLLLL.post(new ARunnableS37S0100000_1(cancelTaskDone, (InterfaceC65784Pro<C76800UCe>) 48));
            }

            @Override // X.C5F9
            public final void LIZIZ() {
                C158716Kt c158716Kt = C158716Kt.this;
                c158716Kt.LJLLLL.post(new ARunnableS38S0100000_2(c158716Kt, 45));
            }
        });
    }

    @Override // X.InterfaceC168446jI
    public void k70(C6LM listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLZ = listener;
    }

    @Override // X.InterfaceC168446jI
    public void qn0(InterfaceC65784Pro<C76800UCe> saveTaskDone) {
        o.LJIIIZ(saveTaskDone, "saveTaskDone");
        C158706Ks c158706Ks = this.LJLLLLLL;
        if (c158706Ks != null) {
            c158706Ks.getUiActions().LJII.invoke(C78857UxB.LJJIIJ(1476788484, "bpea-pause_when_save"), saveTaskDone);
        } else {
            o.LJIJI("vOTabScene");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C158716Kt(WMH parentScene, C82622Wbi diContainer) {
        super(parentScene);
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLL = diContainer;
        this.LJLLI = UCI.LJI(getDiContainer(), C168416jF.class, null);
        this.LJLLILLLL = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLLJ = UCI.LJI(getDiContainer(), InterfaceC135455Th.class, null);
        this.LJLLL = UCI.LJII(getDiContainer(), C5XM.class, null);
        this.LJLLLL = new Handler(C16880lQ.LLJJJJ());
        this.LJZ = new AqS152S0100000_2(this, 170);
        LLIFFJFJJ().LLILL((InterfaceC168446jI) getApiComponent());
        this.LJZI = new AqS152S0100000_2(this, 165);
        this.LJZL = new AqS152S0100000_2(this, 169);
    }

    public final void LLJI(Cert cert, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        LLIIIL().T80(((Boolean) LJJLIIIJILLIZJL(new TBT() { // from class: X.6L5
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C6L7) obj).LJLJJL);
            }
        }).LIZ()).booleanValue(), cert, new AqS152S0100000_2(this, 172), new AqS168S0100000_2(this, 105), new AqS165S0200000_2(this, (C158716Kt) interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 0));
    }

    public final void LLIIZ(boolean z, int i, Cert cert) {
        LLIIIL().rg0(z, i, cert, new AqS152S0100000_2(this, 166), new AqS168S0100000_2(this, 103));
    }
}
