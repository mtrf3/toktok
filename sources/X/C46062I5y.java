package X;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.scene.SceneActivityCompatibilityLayerFragment;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewState;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.AqS189S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.I5y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46062I5y extends I6H {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLLLLL;
    public final String LJLJJI;
    public final C82632Wbs LJLJJL;
    public final C82632Wbs LJLJJLL;
    public final C82632Wbs LJLJL;
    public final C82632Wbs LJLJLJ;
    public final C82632Wbs LJLJLLL;
    public final C82632Wbs LJLL;
    public TextView LJLLI;
    public RecyclerView LJLLILLLL;
    public View LJLLJ;
    public C46051I5n LJLLL;
    public C46048I5k LJLLLL;

    static {
        TBT tbt = new TBT(C46062I5y.class, "editViewModel", "getEditViewModel()Lcom/ss/android/ugc/aweme/shortvideo/cut/videoedit/VideoEditViewModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLLLLLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C46062I5y.class, "adjustClipsModel", "getAdjustClipsModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/model/EditAdjustClipsModel;", 0, c65351Pkp), C61845OOz.LIZJ(C46062I5y.class, "cutMultiVideoViewModel", "getCutMultiVideoViewModel()Lcom/ss/android/ugc/aweme/shortvideo/cut/CutMultiVideoViewModel;", 0, c65351Pkp), C61845OOz.LIZJ(C46062I5y.class, "editCutInternalApi", "getEditCutInternalApi()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditCutInternalApi;", 0, c65351Pkp), C61845OOz.LIZJ(C46062I5y.class, "bottomViewModel", "getBottomViewModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditAdjustClipsBottomViewModel;", 0, c65351Pkp), C61845OOz.LIZJ(C46062I5y.class, "thumbnailCache", "getThumbnailCache()Lcom/ss/android/ugc/aweme/utils/FrameCache;", 0, c65351Pkp)};
    }

    public final void LLJJI() {
        C46048I5k c46048I5k;
        Activity activity;
        RecyclerView recyclerView = this.LJLLILLLL;
        if (recyclerView != null) {
            AbstractC029409q adapter = recyclerView.getAdapter();
            if (!(adapter instanceof C46048I5k) || (c46048I5k = (C46048I5k) adapter) == null) {
                return;
            }
            Activity activity2 = this.mActivity;
            ArrayList<String> LLD = c46048I5k.LLD();
            long LL = c46048I5k.LL();
            CreativeInfo creativeInfo = LLJILJIL().LIZJ.creativeInfo;
            o.LJIIIIZZ(creativeInfo, "adjustClipsModel.editModel.creativeInfo");
            Bundle LIZ = C45771Hxn.LIZ(activity2, LLD, LL, creativeInfo);
            if (LIZ == null || (activity = this.mActivity) == null) {
                return;
            }
            LIZ.putInt("key_choose_scene", 13);
            Intent intent = HZV.LIZ().LJIILJJIL(activity, LIZ);
            AqS189S0100000_7 aqS189S0100000_7 = new AqS189S0100000_7(this, 83);
            o.LJIIIZ(intent, "intent");
            Activity activity3 = this.mActivity;
            if (activity3 != null) {
                I60 i60 = new I60(aqS189S0100000_7);
                C1JI.LJII();
                if (!C78932UyO.LJ(activity3) || getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                    return;
                }
                SceneActivityCompatibilityLayerFragment sceneActivityCompatibilityLayerFragment = (SceneActivityCompatibilityLayerFragment) activity3.getFragmentManager().findFragmentByTag(SceneActivityCompatibilityLayerFragment.class.getName());
                if (sceneActivityCompatibilityLayerFragment == null) {
                    sceneActivityCompatibilityLayerFragment = new SceneActivityCompatibilityLayerFragment();
                    C78932UyO.LIZ(activity3.getFragmentManager(), activity3.getFragmentManager().beginTransaction().add(sceneActivityCompatibilityLayerFragment, SceneActivityCompatibilityLayerFragment.class.getName()), false);
                }
                if (sceneActivityCompatibilityLayerFragment.isAdded()) {
                    sceneActivityCompatibilityLayerFragment.LIZ(this, intent, 1001, i60);
                    return;
                } else {
                    ((HashSet) sceneActivityCompatibilityLayerFragment.LJLJJI).add(new C46063I5z(sceneActivityCompatibilityLayerFragment, activity3, this, intent, i60));
                    return;
                }
            }
            return;
        }
        o.LJIJI("videoListView");
        throw null;
    }

    public final I61 LLJILJIL() {
        return (I61) this.LJLJJLL.LIZ(this, LJLLLLLL[1]);
    }

    public final EditAdjustClipsBottomViewModel LLJILJILJ() {
        return (EditAdjustClipsBottomViewModel) this.LJLJLLL.LIZ(this, LJLLLLLL[4]);
    }

    public final void LLJJ() {
        int i;
        C46048I5k c46048I5k = this.LJLLLL;
        if (c46048I5k != null) {
            i = c46048I5k.getItemCount();
        } else {
            i = 0;
        }
        if (i <= 1) {
            TextView textView = this.LJLLI;
            if (textView != null) {
                textView.setText(getResources().getString(R.string.fjl));
                return;
            } else {
                o.LJIJI("tvDesc");
                throw null;
            }
        }
        TextView textView2 = this.LJLLI;
        if (textView2 != null) {
            textView2.setText(getResources().getString(R.string.ia0));
        } else {
            o.LJIJI("tvDesc");
            throw null;
        }
    }

    @Override // X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        C46051I5n c46051I5n = this.LJLLL;
        if (c46051I5n != null) {
            ValueAnimator valueAnimator = c46051I5n.LJI;
            if (valueAnimator != null) {
                valueAnimator.removeAllUpdateListeners();
            }
            ValueAnimator valueAnimator2 = c46051I5n.LJI;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
        }
    }

    @Override // X.InterfaceC46100I7k
    public final String getTag() {
        return this.LJLJJI;
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        boolean z;
        C46049I5l c46049I5l;
        super.onActivityCreated(bundle);
        View requireViewById = requireViewById(R.id.m4n);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.tv_desc)");
        this.LJLLI = (TextView) requireViewById;
        View requireViewById2 = requireViewById(R.id.n45);
        o.LJIIIIZZ(requireViewById2, "requireViewById(R.id.videoRecyclerView)");
        this.LJLLILLLL = (RecyclerView) requireViewById2;
        View requireViewById3 = requireViewById(R.id.a51);
        o.LJIIIIZZ(requireViewById3, "requireViewById(R.id.animTabDot)");
        this.LJLLJ = requireViewById3;
        Activity requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        C82632Wbs c82632Wbs = this.LJLJJL;
        InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LJLLLLLL;
        C46051I5n c46051I5n = new C46051I5n(requireActivity, this, (VideoEditViewModel) c82632Wbs.LIZ(this, interfaceC74236TBoArr[0]), (CutMultiVideoViewModel) this.LJLJL.LIZ(this, interfaceC74236TBoArr[2]));
        this.LJLLL = c46051I5n;
        RecyclerView recyclerView = this.LJLLILLLL;
        if (recyclerView != null) {
            View view = this.LJLLJ;
            if (view != null) {
                if (C78946Uyc.LJIILL(LLJILJIL()) && !C44384HbQ.LJJIIZI(LLJILJIL().LIZJ)) {
                    z = true;
                } else {
                    z = false;
                }
                c46051I5n.LIZ(recyclerView, view, new C46058I5u(z, C78946Uyc.LJIJJLI(LLJILJIL()), false), new C46057I5t(this));
                RecyclerView recyclerView2 = this.LJLLILLLL;
                if (recyclerView2 != null) {
                    C46048I5k c46048I5k = (C46048I5k) recyclerView2.getAdapter();
                    this.LJLLLL = c46048I5k;
                    if (c46048I5k != null) {
                        c46048I5k.LJLJL = (C162396Yx) this.LJLL.LIZ(this, interfaceC74236TBoArr[5]);
                    }
                    C46048I5k c46048I5k2 = this.LJLLLL;
                    if ((c46048I5k2 instanceof C46049I5l) && (c46049I5l = (C46049I5l) c46048I5k2) != null) {
                        c46049I5l.LJLJLLL = this;
                    }
                    LLJJ();
                    LLJILJILJ().Iv0(this, new TBT() { // from class: X.I64
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((EditAdjustClipsBottomViewState) obj).getDeleteVideoEvent();
                        }
                    }, new C73165SnZ(), new AqS173S0100000_7(this, 461));
                    LLJILJILJ().Iv0(this, new TBT() { // from class: X.I65
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((EditAdjustClipsBottomViewState) obj).getUpdateVideoEvent();
                        }
                    }, new C73165SnZ(), new AqS173S0100000_7(this, 462));
                    LLJILJILJ().Iv0(this, new TBT() { // from class: X.I66
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((EditAdjustClipsBottomViewState) obj).getAddVideosEvent();
                        }
                    }, new C73165SnZ(), new AqS173S0100000_7(this, 463));
                    LLJILJILJ().Iv0(this, new TBT() { // from class: X.I6Q
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((EditAdjustClipsBottomViewState) obj).isMusicSyncMode();
                        }
                    }, new C73165SnZ(), new AqS173S0100000_7(this, 464));
                    LLJILJILJ().Iv0(this, new TBT() { // from class: X.I68
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((EditAdjustClipsBottomViewState) obj).getRestoreEditEvent();
                        }
                    }, new C73165SnZ(), new AqS173S0100000_7(this, 459));
                    LLJILJILJ().Iv0(this, new TBT() { // from class: X.I62
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((EditAdjustClipsBottomViewState) obj).getModeChangeEvent();
                        }
                    }, new C73165SnZ(), new AqS173S0100000_7(this, 460));
                    return;
                }
                o.LJIJI("videoListView");
                throw null;
            }
            o.LJIJI("animateDot");
            throw null;
        }
        o.LJIJI("videoListView");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46062I5y(C82622Wbi diContainer, I6D parentScene) {
        super(diContainer, parentScene, R.id.dci);
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLJJI = "MultiEditModeBottomScene";
        this.LJLJJL = UCI.LJI(this.LJLIL, VideoEditViewModel.class, null);
        this.LJLJJLL = UCI.LJI(this.LJLIL, I61.class, null);
        this.LJLJL = UCI.LJI(this.LJLIL, CutMultiVideoViewModel.class, null);
        this.LJLJLJ = UCI.LJI(this.LJLIL, I6G.class, null);
        this.LJLJLLL = UCI.LJI(this.LJLIL, EditAdjustClipsBottomViewModel.class, null);
        this.LJLL = UCI.LJI(this.LJLIL, C162396Yx.class, null);
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return FP1.LIZ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.ih, viewGroup, false, "inflater.inflate(R.layou…o_list, container, false)");
    }
}
