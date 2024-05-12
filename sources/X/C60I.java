package X;

import Y.AObjectS53S0101000_8;
import com.ss.android.ugc.aweme.canvas.guide.EditPhotoCanvasPromptViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.60I, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C60I implements C6E9, InterfaceC65784Pro<C82622Wbi> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJJL;
    public final AbstractC42651GoZ LJLIL;
    public final VideoPublishEditModel LJLILLLLZI;
    public final InterfaceC65784Pro<C82622Wbi> LJLJI;
    public final C60J LJLJJI;

    static {
        TBT tbt = new TBT(C60I.class, "toolbarApi", "getToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJJL = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.C6E9
    public final void LIZ() {
        if (C44384HbQ.LJJII(this.LJLILLLLZI)) {
            LJII().rO(6, true);
        }
    }

    @Override // X.C6E9
    public final void LJ() {
        AbstractC42651GoZ scene = this.LJLIL;
        o.LJIIIZ(scene, "scene");
        ((EditPhotoCanvasPromptViewModel) C165706es.LJIIIIZZ(scene, null, null, 6).get(EditPhotoCanvasPromptViewModel.class)).LJLIL.postValue(Boolean.TRUE);
        C1536161d.LIZ("canvas_gesture");
    }

    public final InterfaceC153275zv LJII() {
        return (InterfaceC153275zv) this.LJLJJI.LIZ(this, LJLJJL[0]);
    }

    @Override // X.InterfaceC65784Pro
    public final C82622Wbi invoke() {
        return this.LJLJI.invoke();
    }

    @Override // X.C6E9
    public final void LIZIZ() {
        LJII().rO(4, true);
    }

    @Override // X.C6E9
    public final void LIZJ() {
        LJII().rO(15, true);
    }

    @Override // X.C6E9
    public final void LIZLLL() {
        C60F vq;
        if (C44384HbQ.LJJIFFI()) {
            C60F vq2 = LJII().vq();
            if (vq2 != null) {
                vq2.LIZ = true;
            }
            if (!C78934UyQ.LJLIL.getMusicService().LJIILIIL() && (vq = LJII().vq()) != null && vq.LIZJ) {
                LJII().p9(1, true);
                return;
            } else {
                LJII().rO(1, true);
                return;
            }
        }
        LJII().rO(1, true);
    }

    @Override // X.C6E9
    public final void LJFF() {
        LJII().rO(2, true);
    }

    @Override // X.C6E9
    public final void LJI() {
        LJII().rO(3, true);
    }

    public C60I(AbstractC42651GoZ scene, VideoPublishEditModel videoPublishEditModel, AObjectS53S0101000_8 aObjectS53S0101000_8) {
        o.LJIIIZ(scene, "scene");
        this.LJLIL = scene;
        this.LJLILLLLZI = videoPublishEditModel;
        this.LJLJI = aObjectS53S0101000_8;
        this.LJLJJI = new C60J(this);
    }
}
