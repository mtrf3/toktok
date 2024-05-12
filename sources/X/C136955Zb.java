package X;

import Y.AObserverS70S0100000_2;
import com.bytedance.ies.nle.editor_jni.NLEBranch;
import com.bytedance.ies.nle.editor_jni.NLECommit;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEEditorListener;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.Iterator;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5Zb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C136955Zb extends AbstractC29891Fh<InterfaceC137005Zg> implements InterfaceC137005Zg, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLLLLL;
    public final C82622Wbi LJLIL;
    public final C40871j1<Boolean> LJLILLLLZI;
    public final C0IB<Boolean> LJLJI;
    public final InterfaceC115514g7 LJLJJI;
    public final InterfaceC115514g7 LJLJJL;
    public final InterfaceC115514g7 LJLJJLL;
    public NLEEditor LJLJL;
    public InterfaceC136995Zf LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public NLEModel LJLLILLLL;
    public String LJLLJ;
    public final C136965Zc LJLLL;
    public final C136975Zd LJLLLL;

    static {
        TBT tbt = new TBT(C136955Zb.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLLLLLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C136955Zb.class, "actionAiApi", "getActionAiApi()Lcom/ss/android/ugc/aweme/actionai/bot/ActionAIApi;", 0, c65351Pkp), C61845OOz.LIZJ(C136955Zb.class, "autoEditApi", "getAutoEditApi()Lcom/ss/android/ugc/aweme/actionai/action/microaction/template/ActionAIAutoCutEditApi;", 0, c65351Pkp)};
    }

    public InterfaceC137005Zg LJJLIIIIJ() {
        return this;
    }

    public final void LJJLIIIJJIZ() {
        NLENode nLENode;
        NLEModel LJ;
        this.LJLL = false;
        NLEEditor nLEEditor = this.LJLJL;
        if (nLEEditor != null && (LJ = nLEEditor.LJ()) != null) {
            nLENode = LJ.deepClone();
        } else {
            nLENode = null;
        }
        this.LJLLILLLL = NLEModel.dynamicCast(nLENode);
    }

    public final void LJJLJLI() {
        this.LJLLI = true;
        if (this.LJLLJ.length() > 0) {
            NLEEditor nLEEditor = this.LJLJL;
            if (nLEEditor != null) {
                NLEEditorJniJNI.NLEEditor_goTo(nLEEditor.LIZ, nLEEditor, this.LJLLJ);
            }
        } else {
            NLEEditor nLEEditor2 = this.LJLJL;
            if (nLEEditor2 != null) {
                nLEEditor2.LJFF();
            }
        }
        LJJLIIIJILLIZJL().nW();
        InterfaceC136995Zf interfaceC136995Zf = this.LJLJLJ;
        if (interfaceC136995Zf != null) {
            interfaceC136995Zf.LIZIZ();
        }
    }

    private final InterfaceC83402WoI LJJLI() {
        return (InterfaceC83402WoI) this.LJLJJL.LIZ(this, LJLLLLLL[1]);
    }

    private final InterfaceC143655kP LJJLIIIJJI() {
        return (InterfaceC143655kP) this.LJLJJI.LIZ(this, LJLLLLLL[0]);
    }

    private final boolean LJJLIIJ() {
        NLEEditor nLEEditor = this.LJLJL;
        if (nLEEditor == null) {
            return false;
        }
        long NLEEditor_getStageModel = NLEEditorJniJNI.NLEEditor_getStageModel(nLEEditor.LIZ, nLEEditor);
        boolean z = true;
        if (NLEEditor_getStageModel == 0) {
            if (!nLEEditor.LJ().isWorkingDirty()) {
                z = false;
            }
        } else {
            new NLEModel(NLEEditor_getStageModel, true);
        }
        Boolean valueOf = Boolean.valueOf(z);
        if (valueOf == null) {
            return false;
        }
        return valueOf.booleanValue();
    }

    public final InterfaceC136985Ze LJJLIIIJILLIZJL() {
        return (InterfaceC136985Ze) this.LJLJJLL.LIZ(this, LJLLLLLL[2]);
    }

    public final boolean LJJLIIIJLLLLLLLZ() {
        NLEModel nLEModel;
        NLEBranch LIZLLL;
        NLECommit LIZ;
        NLEEditor nLEEditor = this.LJLJL;
        String str = null;
        if (nLEEditor != null) {
            nLEModel = nLEEditor.LJ();
        } else {
            nLEModel = null;
        }
        if (nLEModel == null) {
            return false;
        }
        NLEModel nLEModel2 = this.LJLLILLLL;
        if (nLEModel2 == null) {
            return true;
        }
        NLEEditor nLEEditor2 = this.LJLJL;
        if (nLEEditor2 != null && (LIZLLL = nLEEditor2.LIZLLL()) != null && (LIZ = LIZLLL.LIZ()) != null) {
            str = LIZ.getUUID();
        }
        if (o.LJ(str, this.LJLLJ) && !this.LJLL) {
            return false;
        }
        LJJLJ(nLEModel2);
        LJJLJ(nLEModel);
        if (nLEModel.unorderEquals(nLEModel2, false)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC137005Zg
    public void dp0() {
        C2ND.LIZ(new AqS152S0100000_2(this, 63), 0L);
    }

    @Override // X.InterfaceC137005Zg
    public void rm0() {
        C2ND.LIZ(new AqS152S0100000_2(this, 64), 0L);
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        LJJLI().RI(this.LJLLLL);
    }

    @Override // X.InterfaceC137005Zg
    public void LLLIIIIL() {
        LJJLJLI();
    }

    @Override // X.InterfaceC137005Zg
    public C0IB<Boolean> Sq0() {
        return this.LJLJI;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC137005Zg getApiComponent() {
        LJJLIIIIJ();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.5Zd] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.5Zc] */
    public C136955Zb(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        C40871j1<Boolean> c40871j1 = new C40871j1<>(Boolean.FALSE);
        this.LJLILLLLZI = c40871j1;
        this.LJLJI = c40871j1;
        this.LJLJJI = UCI.LJI(getDiContainer(), InterfaceC143655kP.class, null);
        this.LJLJJL = UCI.LJI(getDiContainer(), InterfaceC83402WoI.class, null);
        this.LJLJJLL = UCI.LJI(getDiContainer(), InterfaceC136985Ze.class, null);
        this.LJLLJ = "";
        this.LJLLL = new NLEEditorListener() { // from class: X.5Zc
            @Override // com.bytedance.ies.nle.editor_jni.NLEEditorListener
            public final void onChanged() {
                C136955Zb c136955Zb = C136955Zb.this;
                if (c136955Zb.LJLJLLL) {
                    c136955Zb.LJLL = true;
                } else {
                    if (c136955Zb.LJLLI) {
                        return;
                    }
                    c136955Zb.LJLILLLLZI.LJ(Boolean.TRUE);
                }
            }
        };
        this.LJLLLL = new InterfaceC83391Wo7() { // from class: X.5Zd
            @Override // X.InterfaceC83391Wo7
            public final void LIZ(boolean z) {
                if (z) {
                    C136955Zb c136955Zb = C136955Zb.this;
                    c136955Zb.LJLJLLL = false;
                    if (c136955Zb.LJJLIIIJLLLLLLLZ()) {
                        C136955Zb.this.dp0();
                        return;
                    }
                    return;
                }
                C136955Zb c136955Zb2 = C136955Zb.this;
                c136955Zb2.LJLJLLL = true;
                if (c136955Zb2.LJJLIIIJILLIZJL().Bz()) {
                    C136955Zb.this.dp0();
                }
                C136955Zb.this.LJJLIIIJJIZ();
            }
        };
        LJJLIIIJJI().Kh().observe(this, new AObserverS70S0100000_2(this, 15));
    }

    private final void LJJLJ(NLEModel nLEModel) {
        Iterator<NLETrackSlot> it = nLEModel.getMainTrack().LJIILL().iterator();
        while (it.hasNext()) {
            NLESegmentVideo LJJ = NLESegmentVideo.LJJ(it.next().LJI());
            if (LJJ != null && !NLEEditorJniJNI.NLESegmentVideo_hasEnableAudio(LJJ.LJ, LJJ)) {
                LJJ.LJJIIJZLJL(true);
            }
        }
    }

    @Override // X.InterfaceC137005Zg
    public void Fb0(InterfaceC136995Zf listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLJLJ = listener;
    }
}
