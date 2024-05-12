package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewState;
import com.ss.android.ugc.aweme.views.IDlS63S0100000_7;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I6E extends I6H {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLI;
    public final String LJLJJI;
    public W5G LJLJJL;
    public View LJLJJLL;
    public View LJLJL;
    public final C82632Wbs LJLJLJ;
    public final C82632Wbs LJLJLLL;
    public final C82632Wbs LJLL;

    static {
        TBT tbt = new TBT(I6E.class, "cutMultiVideoViewModel", "getCutMultiVideoViewModel()Lcom/ss/android/ugc/aweme/shortvideo/cut/CutMultiVideoViewModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLLI = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(I6E.class, "bottomViewModel", "getBottomViewModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditAdjustClipsBottomViewModel;", 0, c65351Pkp), C61845OOz.LIZJ(I6E.class, "thumbnailCache", "getThumbnailCache()Lcom/ss/android/ugc/aweme/utils/FrameCache;", 0, c65351Pkp)};
    }

    @Override // X.InterfaceC46100I7k
    public final String getTag() {
        return this.LJLJJI;
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        View requireViewById = requireViewById(R.id.n4v);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.video_cover)");
        W5G w5g = (W5G) requireViewById;
        this.LJLJJL = w5g;
        w5g.setOutlineProvider(new C46055I5r());
        w5g.setClipToOutline(true);
        View requireViewById2 = requireViewById(R.id.evz);
        o.LJIIIIZZ(requireViewById2, "requireViewById<View>(R.id.ivCancel)");
        this.LJLJJLL = requireViewById2;
        C16880lQ.LJIIJ(new IDlS63S0100000_7(this, 21), requireViewById2);
        View requireViewById3 = requireViewById(R.id.ewz);
        o.LJIIIIZZ(requireViewById3, "requireViewById<View>(R.id.ivSave)");
        this.LJLJL = requireViewById3;
        C16880lQ.LJIIJ(new IDlS63S0100000_7(this, 22), requireViewById3);
        ((BaseJediViewModel) this.LJLJLLL.LIZ(this, LJLLI[1])).Iv0(this, new TBT() { // from class: X.I6I
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((EditAdjustClipsBottomViewState) obj).getFocusEditMode();
            }
        }, new C73165SnZ(), new AqS173S0100000_7(this, 465));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I6E(C82622Wbi diContainer, I6D parentScene) {
        super(diContainer, parentScene, R.id.dci);
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLJJI = "SingleEditModeBottomScene";
        this.LJLJLJ = UCI.LJI(this.LJLIL, CutMultiVideoViewModel.class, null);
        this.LJLJLLL = UCI.LJI(this.LJLIL, EditAdjustClipsBottomViewModel.class, null);
        this.LJLL = UCI.LJI(this.LJLIL, C162396Yx.class, null);
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return FP1.LIZ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.if, viewGroup, false, "inflater.inflate(R.layou…om_bar, container, false)");
    }
}
