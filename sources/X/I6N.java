package X;

import Y.AObserverS75S0100000_7;
import Y.ARunnableS43S0100000_7;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewState;
import com.ss.android.ugc.aweme.views.IDlS63S0100000_7;
import com.ss.android.vesdk.VEEditor;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public abstract class I6N extends WMH implements InterfaceC46100I7k, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLLLLL;
    public final C82622Wbi LJLIL;
    public final WMH LJLILLLLZI;
    public final int LJLJI;
    public View LJLJJI;
    public I50 LJLJJL;
    public final C82632Wbs LJLJJLL;
    public final C82632Wbs LJLJL;
    public final C82632Wbs LJLJLJ;
    public final C82632Wbs LJLJLLL;
    public final C82632Wbs LJLL;
    public final C82632Wbs LJLLI;
    public final C82632Wbs LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final ARunnableS43S0100000_7 LJLLL;
    public final C62822Ol8 LJLLLL;

    static {
        TBT tbt = new TBT(I6N.class, "editAdjustClipsModel", "getEditAdjustClipsModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/model/EditAdjustClipsModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLLLLLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(I6N.class, "cutMultiVideoViewModel", "getCutMultiVideoViewModel()Lcom/ss/android/ugc/aweme/shortvideo/cut/CutMultiVideoViewModel;", 0, c65351Pkp), C61845OOz.LIZJ(I6N.class, "videoEditViewModel", "getVideoEditViewModel()Lcom/ss/android/ugc/aweme/shortvideo/cut/videoedit/VideoEditViewModel;", 0, c65351Pkp), C61845OOz.LIZJ(I6N.class, "bottomViewModel", "getBottomViewModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditAdjustClipsBottomViewModel;", 0, c65351Pkp), C61845OOz.LIZJ(I6N.class, "editCutterViewModel", "getEditCutterViewModel()Lcom/ss/android/ugc/aweme/shortvideo/cut/viewmodel/VEVideoCutterViewModel;", 0, c65351Pkp), C61845OOz.LIZJ(I6N.class, "editCutInternalApi", "getEditCutInternalApi()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditCutInternalApi;", 0, c65351Pkp), C61845OOz.LIZJ(I6N.class, "playerController", "getPlayerController()Lcom/ss/android/ugc/aweme/shortvideo/editcut/IPlayerController;", 0, c65351Pkp)};
    }

    public abstract int LLJJI();

    public final EditAdjustClipsBottomViewModel LLJILJIL() {
        return (EditAdjustClipsBottomViewModel) this.LJLJLLL.LIZ(this, LJLLLLLL[3]);
    }

    public final CutMultiVideoViewModel LLJILJILJ() {
        return (CutMultiVideoViewModel) this.LJLJL.LIZ(this, LJLLLLLL[1]);
    }

    public final SafeHandler LLJJ() {
        return (SafeHandler) this.LJLLJ.getValue();
    }

    public final I50 LLJJIII() {
        I50 i50 = this.LJLJJL;
        if (i50 != null) {
            return i50;
        }
        o.LJIJI("videoEditView");
        throw null;
    }

    public final VideoEditViewModel LLJJIJI() {
        return (VideoEditViewModel) this.LJLJLJ.LIZ(this, LJLLLLLL[2]);
    }

    public void initView() {
        View requireViewById = requireViewById(R.id.f_a);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.iv_rotate)");
        this.LJLJJI = requireViewById;
        C16880lQ.LJIIJ(new IDlS63S0100000_7(this, 20), requireViewById);
    }

    @Override // X.WM7
    public final void onStart() {
        super.onStart();
        LLJJ().post(this.LJLLL);
    }

    @Override // X.WM7
    public final void onStop() {
        super.onStop();
        LLJJ().removeCallbacks(this.LJLLL);
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.WM7
    public void onActivityCreated(Bundle bundle) {
        boolean z;
        super.onActivityCreated(bundle);
        initView();
        if (this.LJLJJL != null) {
            LLJJIII().setMaxVideoLength(C44689HgL.LIZJ());
            C82632Wbs c82632Wbs = this.LJLJJLL;
            InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LJLLLLLL;
            boolean z2 = ((I61) c82632Wbs.LIZ(this, interfaceC74236TBoArr[0])).LIZIZ;
            LLJJIII().setMultiEditEnableForStickPointMode(true);
            LLJJIII().setExtractFramesInRoughMode(true);
            LLJJIII().setLayoutDirection(0);
            I50 LLJJIII = LLJJIII();
            Boolean isMusicSyncMode = LLJILJIL().Ov0().isMusicSyncMode();
            if (isMusicSyncMode != null) {
                z = isMusicSyncMode.booleanValue();
            } else {
                z = false;
            }
            LLJJIII.setDefaultMode(z);
            LLJJIII().LIZJ(C86793Y4n.LJJIJIIJIL(this), C165706es.LJIIIIZZ(this, null, null, 6), LLJILJILJ(), LLJJIJI(), ((I6G) this.LJLLI.LIZ(this, interfaceC74236TBoArr[5])).A2(), z2 ? 1 : 0);
            LLJJIII().setEditViewHeight(!((I61) this.LJLJJLL.LIZ(this, interfaceC74236TBoArr[0])).LIZIZ);
            ((I6G) this.LJLLI.LIZ(this, interfaceC74236TBoArr[5])).xP(LLJJIII());
        }
        ((VEVideoCutterViewModel) this.LJLL.LIZ(this, LJLLLLLL[4])).gv0().observe(this, new AObserverS75S0100000_7(this, 134));
        LLJILJIL().Iv0(this, new TBT() { // from class: X.I6P
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((EditAdjustClipsBottomViewState) obj).isMusicSyncMode();
            }
        }, new C73165SnZ(), new AqS173S0100000_7(this, 425));
        LLJILJIL().Iv0(this, new TBT() { // from class: X.I69
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((EditAdjustClipsBottomViewState) obj).getRestoreEditEvent();
            }
        }, new C73165SnZ(), new AqS173S0100000_7(this, 426));
        LLJJIJI().LJLIL.observe(this, new AObserverS75S0100000_7(this, 135));
        LLJJIJI().LJLILLLLZI.observe(this, new AObserverS75S0100000_7(this, 136));
        LLJJIJI().LJLJJI.observe(this, new AObserverS75S0100000_7(this, 137));
        LLJJIJI().LJLJI.observe(this, new AObserverS75S0100000_7(this, 138));
        LLJJIJI().LJLJJLL.observe(this, new AObserverS75S0100000_7(this, 125));
        LLJJIJI().LJLJJL.observe(this, new AObserverS75S0100000_7(this, 126));
        LLJJIJI().LJLJL.observe(this, new AObserverS75S0100000_7(this, 127));
        LLJJIJI().LJLL.observe(this, new AObserverS75S0100000_7(this, 128));
        LLJJIJI().LJLLI.observe(this, new AObserverS75S0100000_7(this, 129));
        LLJJIJI().LJLLILLLL.observe(this, new AObserverS75S0100000_7(this, 130));
        LLJJIJI().LJLJLJ.observe(this, new AObserverS75S0100000_7(this, 131));
        LLJJIJI().LJLJLLL.observe(this, new AObserverS75S0100000_7(this, 132));
        LLJJIJI().LJZ.observe(this, new AObserverS75S0100000_7(this, 133));
    }

    public I6N(C82622Wbi diContainer, C46084I6u parentScene) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = parentScene;
        this.LJLJI = R.id.arv;
        this.LJLJJLL = UCI.LJI(diContainer, I61.class, null);
        this.LJLJL = UCI.LJI(diContainer, CutMultiVideoViewModel.class, null);
        this.LJLJLJ = UCI.LJI(diContainer, VideoEditViewModel.class, null);
        this.LJLJLLL = UCI.LJI(diContainer, EditAdjustClipsBottomViewModel.class, null);
        this.LJLL = UCI.LJI(diContainer, VEVideoCutterViewModel.class, null);
        this.LJLLI = UCI.LJI(diContainer, I6G.class, null);
        this.LJLLILLLL = UCI.LJI(diContainer, I7R.class, null);
        this.LJLLJ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 754));
        this.LJLLL = new ARunnableS43S0100000_7(this, 150);
        this.LJLLLL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 753));
    }

    public final void LLJJIJIIJIL(long j, VEEditor.SEEK_MODE seek_mode, boolean z) {
        I7S.LIZ((I7R) this.LJLLILLLL.LIZ(this, LJLLLLLL[6]), j, seek_mode, 4);
        if (z) {
            LLJILJIL().Pv0(LLJJIII().getSelectedTime());
        }
    }

    @Override // X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.in, container, false);
        C16880lQ.LLLLIILL(inflater, LLJJI(), (ViewGroup) LLLLIILL.findViewById(R.id.dcl), true);
        return (ViewGroup) LLLLIILL;
    }

    @Override // X.WMH, X.WM7
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }

    public static /* synthetic */ void LLJJIJIL(I6N i6n, long j, VEEditor.SEEK_MODE seek_mode, int i) {
        boolean z;
        if ((i & 2) != 0) {
            seek_mode = VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_OnGoing;
        }
        if ((i & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        i6n.LLJJIJIIJIL(j, seek_mode, z);
    }
}
