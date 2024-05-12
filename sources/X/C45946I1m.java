package X;

import com.bytedance.als.LiveEvent;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.I1m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45946I1m extends AbstractC48231ut<InterfaceC45308HqK, C171146ne, C171166ng, C45955I1v> implements InterfaceC45308HqK, C0IA, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJZ;
    public final WMH LJLL;
    public final C82622Wbi LJLLI;
    public final InterfaceC115514g7 LJLLILLLL;
    public InterfaceC45954I1u LJLLJ;
    public final InterfaceC65784Pro<C171166ng> LJLLL;
    public final InterfaceC65784Pro<C45955I1v> LJLLLL;
    public final C5H3 LJLLLLLL;
    public final C29901Fi<Boolean> LJLZ;

    static {
        TBT tbt = new TBT(C45946I1m.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        C65352Pkq.LIZ.getClass();
        LJZ = new InterfaceC74236TBo[]{tbt};
    }

    private final C5HC LJZI() {
        return (C5HC) this.LJLLLLLL.getValue();
    }

    private final InterfaceC82086WJm getCameraApiComponent() {
        return (InterfaceC82086WJm) this.LJLLILLLL.LIZ(this, LJZ[0]);
    }

    public final void LJLZ() {
        InterfaceC45954I1u interfaceC45954I1u = this.LJLLJ;
        if (interfaceC45954I1u != null) {
            interfaceC45954I1u.confirm();
        } else {
            o.LJIJI("previewListener");
            throw null;
        }
    }

    public final void LLF() {
        InterfaceC45954I1u interfaceC45954I1u = this.LJLLJ;
        if (interfaceC45954I1u != null) {
            interfaceC45954I1u.LIZ();
            LJJZZI(C45947I1n.LJLIL);
            hide();
            return;
        }
        o.LJIJI("previewListener");
        throw null;
    }

    public final void LLIFFJFJJ() {
        InterfaceC45954I1u interfaceC45954I1u = this.LJLLJ;
        if (interfaceC45954I1u != null) {
            interfaceC45954I1u.LIZIZ();
            LJJZZI(C45948I1o.LJLIL);
            hide();
            this.LJLZ.LJII(Boolean.FALSE);
            return;
        }
        o.LJIJI("previewListener");
        throw null;
    }

    @Override // X.AbstractC48231ut, X.InterfaceC145485nM
    public void hide() {
        super.hide();
        InterfaceC45540Hu4 LIZIZ = C163756bj.LIZIZ(this.LJLL);
        if (LIZIZ != null) {
            LIZIZ.unRegisterActivityOnKeyDownListener(LJZI());
        }
        getCameraApiComponent().jL().LIZIZ(I0E.UGC_TEMPLATE_RECORD_PREVIEW_VIDEO_SCENE, C83728WtY.LIZIZ.LIZIZ(EnumC83729WtZ.OPEN_CAMERA_CLOSE_UGC_PREVIEW, null));
    }

    @Override // X.AbstractC48231ut, X.InterfaceC145485nM
    public void show() {
        super.show();
        InterfaceC45540Hu4 LIZIZ = C163756bj.LIZIZ(this.LJLL);
        if (LIZIZ != null) {
            LIZIZ.registerActivityOnKeyDownListenerHead(LJZI());
        }
        getCameraApiComponent().jL().LIZJ(I0E.UGC_TEMPLATE_RECORD_PREVIEW_VIDEO_SCENE, C83728WtY.LIZIZ.LIZJ(EnumC83730Wta.CLOSE_CAMERA_UGC_PREVIEW_OPEN, EnumC158826Le.PAGE_INVISIBLE));
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C171166ng> LJJLIIIJJI() {
        return this.LJLLL;
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C45955I1v> LJJLIIIJJIZ() {
        return this.LJLLLL;
    }

    @Override // X.InterfaceC45308HqK
    public LiveEvent<Boolean> cg() {
        return this.LJLZ;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLLI;
    }

    private final void LLFFF(C5S9 c5s9) {
        LJJZZI(new AqS173S0100000_7(c5s9, 142));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45946I1m(WMH parentScene, C82622Wbi diContainer) {
        super(parentScene);
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLL = parentScene;
        this.LJLLI = diContainer;
        this.LJLLILLLL = UCI.LJI(getDiContainer(), InterfaceC82086WJm.class, null);
        this.LJLLL = C45949I1p.LJLIL;
        this.LJLLLL = new AqS157S0100000_7(this, 257);
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 256));
        this.LJLZ = new C29901Fi<>();
    }

    @Override // X.InterfaceC45308HqK
    public void an0(C5S9 mediaState, InterfaceC45954I1u previewListener) {
        o.LJIIIZ(mediaState, "mediaState");
        o.LJIIIZ(previewListener, "previewListener");
        this.LJLLJ = previewListener;
        this.LJLZ.LJII(Boolean.TRUE);
        LLFFF(mediaState);
        show();
    }
}
