package X;

import Y.AfS54S0100000_2;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5v0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C150225v0 extends AbstractC29891Fh<InterfaceC150685vk> implements InterfaceC150685vk, InterfaceC135635Tz {
    public static final C150275v5 LJLJLJ;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLLL;
    public final C82622Wbi LJLIL;
    public volatile boolean LJLILLLLZI;
    public final InterfaceC115514g7 LJLJI;
    public final InterfaceC115514g7 LJLJJI;
    public final C73893SzJ<C76800UCe> LJLJJL;
    public InterfaceC92693kP LJLJJLL;
    public VideoPublishEditModel LJLJL;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.5v5] */
    static {
        TBT tbt = new TBT(C150225v0.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJLLL = new InterfaceC74236TBo[]{tbt, new TBT(C150225v0.class, "imageIsolateClipEditApi", "getImageIsolateClipEditApi()Lcom/ss/android/ugc/aweme/image/base/ImageIsolateClipEditApi;", 0)};
        LJLJLJ = new Object() { // from class: X.5v5
        };
    }

    public InterfaceC150685vk LJJLIIIIJ() {
        return this;
    }

    private final void LJJLI() {
        InterfaceC92693kP interfaceC92693kP = this.LJLJJLL;
        if (interfaceC92693kP != null && !interfaceC92693kP.isDisposed()) {
            interfaceC92693kP.dispose();
        }
    }

    private final InterfaceC151215wb LJJLIIIJILLIZJL() {
        return (InterfaceC151215wb) this.LJLJJI.LIZ(this, LJLJLLL[1]);
    }

    public final VideoPublishEditModel LLLLIL() {
        return (VideoPublishEditModel) this.LJLJI.LIZ(this, LJLJLLL[0]);
    }

    @Override // X.InterfaceC150685vk
    public void Pr() {
        if (this.LJLILLLLZI) {
            return;
        }
        this.LJLJJL.onNext(C76800UCe.LIZ);
    }

    @Override // X.InterfaceC150685vk
    public void JZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ImageEditAutoSaveDraftComponent recoverDraft ");
        LIZ.append(this.LJLJL);
        H78.LJI(X1D.LIZIZ(LIZ));
        LJJLI();
        VideoPublishEditModel videoPublishEditModel = this.LJLJL;
        if (videoPublishEditModel != null) {
            if (videoPublishEditModel.getImageAlbumData() == null) {
                H78.LIZJ("ImageEditAutoSaveDraftComponent recoverDraft imageAlbumData null");
            } else {
                XKX.LIZLLL(C48841JEv.LIZ(C150985wE.LIZ), null, null, new C150245v2(videoPublishEditModel, this, null), 3);
            }
        }
    }

    public final void LJJLIIIJJIZ() {
        if (!getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ImageEditAutoSaveDraftComponent saveDraftInternal ");
            LIZ.append(getLifecycle().getCurrentState());
            H78.LJI(X1D.LIZIZ(LIZ));
            return;
        }
        this.LJLILLLLZI = true;
        InterfaceC151215wb LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
        if (LJJLIIIJILLIZJL != null) {
            LJJLIIIJILLIZJL.YV(null);
        }
        C151525x6.LJI(LLLLIL().getImageAlbumData().getSurfaceData());
        if (!LLLLIL().creativeModel.draftInfoModel.isDraft || (LLLLIL().creativeModel.draftInfoModel.isDraft && LLLLIL().isFromRestoreRecover)) {
            H78.LJI("ImageEditAutoSaveDraftComponent saveDraftInternal check point");
            C60903NvH.LJIIJJI().LJIIJ().LJI(LLLLIL(), LLLLIL().getCreationId(), 4, new AqS168S0100000_2(this, 232));
            return;
        }
        H78.LJI("ImageEditAutoSaveDraftComponent saveDraftInternal save draft");
        DraftInfoModel draftInfoModel = LLLLIL().creativeModel.draftInfoModel;
        draftInfoModel.getClass();
        draftInfoModel.saveDraftScene = "silence";
        XKX.LIZLLL(C48841JEv.LIZ(C150985wE.LIZ), null, null, new C150235v1(this, null), 3);
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        H78.LJI("ImageEditAutoSaveDraftComponent onCreate");
        if (LLLLIL().creativeModel.draftInfoModel.isDraft && !LLLLIL().isFromRestoreRecover) {
            this.LJLJL = VideoPublishEditModel.makeCopy(LLLLIL());
        }
        this.LJLJJLL = this.LJLJJL.LJIIJJI(((Number) C150285v6.LIZ.getValue()).longValue(), TimeUnit.MILLISECONDS).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS54S0100000_2(this, 4));
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        LJJLI();
        super.onDestroy();
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC150685vk getApiComponent() {
        LJJLIIIIJ();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C150225v0(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLJI = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLJJI = UCI.LJII(getDiContainer(), InterfaceC151215wb.class, null);
        this.LJLJJL = new C73893SzJ<>();
    }

    public final void LJJLIIIJJI(C142535ib c142535ib) {
        this.LJLILLLLZI = false;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ImageEditAutoSaveDraftComponent saveDraftInternal save draft done ");
        LIZ.append(c142535ib.LJLIL.isSuc());
        H78.LJI(X1D.LIZIZ(LIZ));
    }
}
