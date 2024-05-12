package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.61l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1536961l extends AbstractC29891Fh<InterfaceC147455qX> implements InterfaceC147455qX, InterfaceC135635Tz {
    public static final C1537161n LJLJL;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLJ;
    public final C82622Wbi LJLIL;
    public final InterfaceC115514g7 LJLILLLLZI;
    public final InterfaceC115514g7 LJLJI;
    public final InterfaceC115514g7 LJLJJI;
    public final InterfaceC115514g7 LJLJJL;
    public final C1536961l LJLJJLL;

    /* JADX WARN: Type inference failed for: r0v9, types: [X.61n] */
    static {
        TBT tbt = new TBT(C1536961l.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJLJ = new InterfaceC74236TBo[]{tbt, new TBT(C1536961l.class, "editExitHelper", "getEditExitHelper()Lcom/ss/android/ugc/gamora/editor/exit/IEditExitHelper;", 0), new TBT(C1536961l.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0), new TBT(C1536961l.class, "editRootScene", "getEditRootScene()Lcom/ss/android/ugc/gamora/editor/rootscene/IEditRootScene;", 0)};
        LJLJL = new Object() { // from class: X.61n
        };
    }

    public final C6NA LJJLI() {
        return (C6NA) this.LJLJI.LIZ(this, LJLJLJ[1]);
    }

    public final VideoPublishEditModel LJJLIIIIJ() {
        return (VideoPublishEditModel) this.LJLILLLLZI.LIZ(this, LJLJLJ[0]);
    }

    public final InterfaceC143655kP LJJLIIIJILLIZJL() {
        return (InterfaceC143655kP) this.LJLJJI.LIZ(this, LJLJLJ[2]);
    }

    public final C6F2 LJJLIIIJJI() {
        return (C6F2) this.LJLJJL.LIZ(this, LJLJLJ[3]);
    }

    @Override // X.InterfaceC147455qX
    public void hu0() {
        boolean hasInfoStickers;
        InterfaceC153045zY value = LJJLIIIJILLIZJL().Kh().getValue();
        if (value == null) {
            return;
        }
        C6NA LJJLI = LJJLI();
        if (LJJLI != null) {
            hasInfoStickers = LJJLI.LLZZ();
        } else {
            hasInfoStickers = LJJLIIIIJ().hasInfoStickers();
        }
        C60903NvH.LJIIJJI().getPublishService().LIZLLL(LJJLIIIIJ().creativeModel.editSaveLocalModel.flowId, value, hasInfoStickers);
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC147455qX getApiComponent() {
        return this.LJLJJLL;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C1536961l(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLJI = UCI.LJII(getDiContainer(), C6NA.class, null);
        this.LJLJJI = UCI.LJI(getDiContainer(), InterfaceC143655kP.class, null);
        this.LJLJJL = UCI.LJII(getDiContainer(), C6F2.class, null);
        this.LJLJJLL = this;
    }
}
