package X;

import Y.AObserverS75S0100000_7;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewState;
import com.ss.android.ugc.aweme.views.IDlS63S0100000_7;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I7B extends I6H {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLL;
    public final String LJLJJI;
    public TextView LJLJJL;
    public C80461Vhx LJLJJLL;
    public View LJLJL;
    public View LJLJLJ;
    public boolean LJLJLLL;
    public final C82632Wbs LJLL;
    public final C82632Wbs LJLLI;
    public final C82632Wbs LJLLILLLL;
    public final C82632Wbs LJLLJ;

    static {
        TBT tbt = new TBT(I7B.class, "adjustClipsModel", "getAdjustClipsModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/model/EditAdjustClipsModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(I7B.class, "editViewModel", "getEditViewModel()Lcom/ss/android/ugc/aweme/shortvideo/cut/videoedit/VideoEditViewModel;", 0, c65351Pkp), C61845OOz.LIZJ(I7B.class, "bottomViewModel", "getBottomViewModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditAdjustClipsBottomViewModel;", 0, c65351Pkp), C61845OOz.LIZJ(I7B.class, "editCutInternalApi", "getEditCutInternalApi()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditCutInternalApi;", 0, c65351Pkp), C61845OOz.LIZJ(I7B.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0, c65351Pkp)};
    }

    public final boolean LLJILJIL() {
        Integer value;
        if (C78946Uyc.LJIJJLI((I61) this.LJLL.LIZ(this, LJLLL[0])) || LLJJ().A80() || (value = LLJJI().LJLIL.getValue()) == null || value.intValue() != 2 || !LLJJIII()) {
            return false;
        }
        return true;
    }

    public final EditAdjustClipsBottomViewModel LLJILJILJ() {
        return (EditAdjustClipsBottomViewModel) this.LJLLILLLL.LIZ(this, LJLLL[2]);
    }

    public final I6G LLJJ() {
        return (I6G) this.LJLLJ.LIZ(this, LJLLL[3]);
    }

    public final VideoEditViewModel LLJJI() {
        return (VideoEditViewModel) this.LJLLI.LIZ(this, LJLLL[1]);
    }

    public final boolean LLJJIII() {
        List<VideoSegment> A2 = LLJJ().A2();
        ArrayList arrayList = new ArrayList();
        for (VideoSegment videoSegment : A2) {
            if (true ^ videoSegment.isDeleted) {
                arrayList.add(videoSegment);
            }
        }
        if (arrayList.size() > 1) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC46100I7k
    public final String getTag() {
        return this.LJLJJI;
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        View requireViewById = requireViewById(R.id.mjj);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.tv_selected_duration)");
        this.LJLJJL = (TextView) requireViewById;
        View requireViewById2 = requireViewById(R.id.fa9);
        o.LJIIIIZZ(requireViewById2, "requireViewById(R.id.iv_speed)");
        this.LJLJJLL = (C80461Vhx) requireViewById2;
        View requireViewById3 = requireViewById(R.id.f1j);
        o.LJIIIIZZ(requireViewById3, "requireViewById(R.id.iv_delete)");
        this.LJLJL = requireViewById3;
        View requireViewById4 = requireViewById(R.id.f_0);
        o.LJIIIIZZ(requireViewById4, "requireViewById(R.id.iv_retake)");
        this.LJLJLJ = requireViewById4;
        LLJJI().LJLIL.observe(this, new AObserverS75S0100000_7(this, 141));
        LLJILJILJ().Iv0(this, new TBT() { // from class: X.I6T
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((EditAdjustClipsBottomViewState) obj).isMusicSyncMode();
            }
        }, new C73165SnZ(), new AqS173S0100000_7(this, 455));
        LLJILJILJ().Iv0(this, new TBT() { // from class: X.I6M
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((EditAdjustClipsBottomViewState) obj).getSelectTime();
            }
        }, new C73165SnZ(), new AqS173S0100000_7(this, 456));
        LLJILJILJ().Iv0(this, new TBT() { // from class: X.I6R
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((EditAdjustClipsBottomViewState) obj).getFocusEditMode();
            }
        }, new C73165SnZ(), new AqS173S0100000_7(this, 457));
        LLJILJILJ().Iv0(this, new TBT() { // from class: X.I7N
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((EditAdjustClipsBottomViewState) obj).getCurrentEditOriginIndex());
            }
        }, new C73165SnZ(), new AqS173S0100000_7(this, 458));
        C80461Vhx c80461Vhx = this.LJLJJLL;
        if (c80461Vhx != null) {
            c80461Vhx.setOnClickListener(new ViewOnClickListenerC13880ga(new IDlS63S0100000_7(this, 23)));
            View view = this.LJLJL;
            if (view != null) {
                C16880lQ.LJIIJ(new IDlS63S0100000_7(this, 24), view);
                View view2 = this.LJLJLJ;
                if (view2 != null) {
                    C16880lQ.LJIIJ(new IDlS63S0100000_7(this, 25), view2);
                    return;
                } else {
                    o.LJIJI("ivRetake");
                    throw null;
                }
            }
            o.LJIJI("ivDelete");
            throw null;
        }
        o.LJIJI("ivSpeed");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I7B(C82622Wbi diContainer, I6N parentScene) {
        super(diContainer, parentScene, R.id.dha);
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLJJI = "EditToolbarScene";
        this.LJLL = UCI.LJI(this.LJLIL, I61.class, null);
        this.LJLLI = UCI.LJI(this.LJLIL, VideoEditViewModel.class, null);
        this.LJLLILLLL = UCI.LJI(this.LJLIL, EditAdjustClipsBottomViewModel.class, null);
        this.LJLLJ = UCI.LJI(this.LJLIL, I6G.class, null);
        UCI.LJI(this.LJLIL, VideoPublishEditModel.class, null);
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return FP1.LIZ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.ig, viewGroup, false, "inflater.inflate(R.layou…ol_bar, container, false)");
    }
}
