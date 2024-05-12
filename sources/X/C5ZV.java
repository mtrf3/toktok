package X;

import Y.AObserverS70S0100000_2;
import com.bytedance.ies.nle.editor_jni.NLEBranch;
import com.bytedance.ies.nle.editor_jni.NLECommit;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5ZV, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5ZV extends AbstractC29891Fh<C5ZX> implements C5ZX, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLLL;
    public final C82622Wbi LJLIL;
    public List<? extends C5ZY> LJLILLLLZI;
    public final InterfaceC115514g7 LJLJI;
    public final InterfaceC115514g7 LJLJJI;
    public final InterfaceC115514g7 LJLJJL;
    public NLEEditor LJLJJLL;
    public java.util.Map<String, VideoPublishEditModel> LJLJL;
    public C5ZW LJLJLJ;

    static {
        TBT tbt = new TBT(C5ZV.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLJLLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C5ZV.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0, c65351Pkp), C61845OOz.LIZJ(C5ZV.class, "undoManagerComponent", "getUndoManagerComponent()Lcom/ss/android/ugc/aweme/actionai/undo/ActionUndoManagerApi;", 0, c65351Pkp)};
    }

    public C5ZX LJJLI() {
        return this;
    }

    private final InterfaceC143655kP LJJLIIIIJ() {
        return (InterfaceC143655kP) this.LJLJI.LIZ(this, LJLJLLL[0]);
    }

    private final InterfaceC137005Zg LJJLIIIJILLIZJL() {
        return (InterfaceC137005Zg) this.LJLJJL.LIZ(this, LJLJLLL[2]);
    }

    private final VideoPublishEditModel LLLLIL() {
        return (VideoPublishEditModel) this.LJLJJI.LIZ(this, LJLJLLL[1]);
    }

    public final void LJJLIIIJJI() {
        String str;
        NLEBranch LIZLLL;
        NLECommit LIZ;
        NLEEditor nLEEditor = this.LJLJJLL;
        if (nLEEditor == null || (LIZLLL = nLEEditor.LIZLLL()) == null || (LIZ = LIZLLL.LIZ()) == null || (str = LIZ.getUUID()) == null) {
            str = "-1";
        }
        if (this.LJLJL.containsKey(str)) {
            return;
        }
        VideoPublishEditModel curEditorModel = VideoPublishEditModel.makeCopy(LLLLIL());
        java.util.Map<String, VideoPublishEditModel> map = this.LJLJL;
        o.LJIIIIZZ(curEditorModel, "curEditorModel");
        map.put(str, curEditorModel);
        Iterator<? extends C5ZY> it = this.LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().LIZ();
        }
    }

    public final void LJJLIIIJJIZ() {
        NLEModel LJ;
        C122034qd LJJI;
        NLEBranch LIZLLL;
        NLECommit LIZ;
        NLEEditor nLEEditor = this.LJLJJLL;
        String str = null;
        if (nLEEditor == null || (LJ = nLEEditor.LJ()) == null) {
            return;
        }
        NLEEditor nLEEditor2 = this.LJLJJLL;
        if (nLEEditor2 != null && (LIZLLL = nLEEditor2.LIZLLL()) != null && (LIZ = LIZLLL.LIZ()) != null) {
            str = LIZ.getUUID();
        }
        VideoPublishEditModel videoPublishEditModel = this.LJLJL.get(str);
        if (videoPublishEditModel == null) {
            return;
        }
        InterfaceC153045zY value = LJJLIIIIJ().Kh().getValue();
        if (value != null && (LJJI = C17N.LJJI(value)) != null) {
            LJJI.LJIIJJI();
        }
        Iterator<? extends C5ZY> it = this.LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ(LJ, LLLLIL(), videoPublishEditModel);
        }
    }

    @Override // X.AbstractC29891Fh
    public void onStart() {
        super.onStart();
        if (this.LJLJL.isEmpty()) {
            LJJLIIIJJI();
        }
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ C5ZX getApiComponent() {
        LJJLI();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.AbstractC29891Fh
    public void onPause() {
        super.onPause();
    }

    @Override // X.AbstractC29891Fh
    public void onResume() {
        super.onResume();
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.5ZW] */
    public C5ZV(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = C61878OQg.INSTANCE;
        this.LJLJI = UCI.LJI(getDiContainer(), InterfaceC143655kP.class, null);
        this.LJLJJI = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLJJL = UCI.LJI(getDiContainer(), InterfaceC137005Zg.class, null);
        this.LJLJL = new LinkedHashMap();
        this.LJLJLJ = new InterfaceC136995Zf() { // from class: X.5ZW
            @Override // X.InterfaceC136995Zf
            public final void LIZ() {
                C5ZV.this.LJJLIIIJJI();
            }

            @Override // X.InterfaceC136995Zf
            public final void LIZIZ() {
                C5ZV.this.LJJLIIIJJIZ();
            }
        };
        LJJLIIIIJ().Kh().observe(this, new AObserverS70S0100000_2(this, 16));
        LJJLIIIJILLIZJL().Fb0(this.LJLJLJ);
    }

    @Override // X.C5ZX
    public void Q80(List<? extends C5ZY> handlers) {
        o.LJIIIZ(handlers, "handlers");
        this.LJLILLLLZI = handlers;
    }
}
