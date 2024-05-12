package X;

import Y.AObjectS86S0100000_7;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewState;
import com.ss.android.ugc.aweme.views.IDlS63S0100000_7;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.AqS2S0000001_7;
import kotlin.jvm.internal.o;

/* renamed from: X.I6u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46084I6u extends WMH implements InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLLLLL;
    public final C82622Wbi LJLIL;
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 214));
    public final C82632Wbs LJLJI;
    public final C82632Wbs LJLJJI;
    public final C82632Wbs LJLJJL;
    public final C82632Wbs LJLJJLL;
    public final C82632Wbs LJLJL;
    public final C82632Wbs LJLJLJ;
    public View LJLJLLL;
    public View LJLL;
    public View LJLLI;
    public View LJLLILLLL;
    public View LJLLJ;
    public View LJLLL;
    public View LJLLLL;

    static {
        TBT tbt = new TBT(C46084I6u.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLLLLLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C46084I6u.class, "editAdjustApi", "getEditAdjustApi()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditAdjustClipsApi;", 0, c65351Pkp), C61845OOz.LIZJ(C46084I6u.class, "editAdjustClipsModel", "getEditAdjustClipsModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/model/EditAdjustClipsModel;", 0, c65351Pkp), C61845OOz.LIZJ(C46084I6u.class, "bottomViewModel", "getBottomViewModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditAdjustClipsBottomViewModel;", 0, c65351Pkp), C61845OOz.LIZJ(C46084I6u.class, "videoEditViewModel", "getVideoEditViewModel()Lcom/ss/android/ugc/aweme/shortvideo/cut/videoedit/VideoEditViewModel;", 0, c65351Pkp), C61845OOz.LIZJ(C46084I6u.class, "playerController", "getPlayerController()Lcom/ss/android/ugc/aweme/shortvideo/editcut/IPlayerController;", 0, c65351Pkp)};
    }

    public final int LLJILJIL() {
        float f;
        Activity activity = this.mActivity;
        if (((I61) this.LJLJJL.LIZ(this, LJLLLLLL[2])).LIZIZ) {
            f = 320.0f;
        } else {
            f = 265.0f;
        }
        return (int) KL2.LIZJ(activity, f);
    }

    public final int LLJILJILJ() {
        int LIZIZ = (C81184Vtc.LIZIZ(this.mActivity) - ((int) KL2.LIZJ(this.mActivity, 52.0f))) - LLJILJIL();
        Activity requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        return (LIZIZ - C63081OpJ.LJJJJLI(requireActivity)) - C81184Vtc.LIZJ(this.mActivity);
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C46084I6u(C82622Wbi c82622Wbi) {
        this.LJLIL = c82622Wbi;
        this.LJLJI = UCI.LJI(c82622Wbi, InterfaceC143655kP.class, null);
        this.LJLJJI = UCI.LJI(c82622Wbi, InterfaceC146755pP.class, null);
        this.LJLJJL = UCI.LJI(c82622Wbi, I61.class, null);
        this.LJLJJLL = UCI.LJI(c82622Wbi, EditAdjustClipsBottomViewModel.class, null);
        this.LJLJL = UCI.LJI(c82622Wbi, VideoEditViewModel.class, null);
        this.LJLJLJ = UCI.LJI(c82622Wbi, I7R.class, null);
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        I6N i6n = (I6N) this.LJLILLLLZI.getValue();
        if (!i6n.LJLILLLLZI.isAdded(i6n)) {
            i6n.LJLILLLLZI.add(i6n.LJLJI, i6n, i6n.getTag());
        }
        if (!i6n.LJLILLLLZI.isShowing(i6n)) {
            i6n.LJLILLLLZI.show(i6n);
        }
        View requireViewById = requireViewById(R.id.j5z);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.rl_title_bar)");
        this.LJLJLLL = requireViewById;
        View requireViewById2 = requireViewById(R.id.f8p);
        o.LJIIIIZZ(requireViewById2, "requireViewById(R.id.iv_play)");
        this.LJLL = requireViewById2;
        View requireViewById3 = requireViewById(R.id.arv);
        o.LJIIIIZZ(requireViewById3, "requireViewById(R.id.bottom_view)");
        this.LJLLI = requireViewById3;
        View requireViewById4 = requireViewById(R.id.mo6);
        o.LJIIIIZZ(requireViewById4, "requireViewById(R.id.tv_title)");
        this.LJLLLL = requireViewById4;
        View requireViewById5 = requireViewById(R.id.m1c);
        o.LJIIIIZZ(requireViewById5, "requireViewById<View>(R.id.tv_cancel)");
        this.LJLLILLLL = requireViewById5;
        C16880lQ.LJIIJ(new IDlS63S0100000_7(this, 1), requireViewById5);
        View requireViewById6 = requireViewById(R.id.mij);
        o.LJIIIIZZ(requireViewById6, "requireViewById<View>(R.id.tv_save)");
        this.LJLLJ = requireViewById6;
        View requireViewById7 = requireViewById(R.id.mil);
        o.LJIIIIZZ(requireViewById7, "requireViewById<View>(R.id.tv_save_red)");
        this.LJLLL = requireViewById7;
        View view = this.LJLLJ;
        if (view != null) {
            C16880lQ.LJIIJ(new IDlS63S0100000_7(this, 2), view);
            View view2 = this.LJLLL;
            if (view2 != null) {
                C16880lQ.LJIIJ(new IDlS63S0100000_7(this, 3), view2);
                C16880lQ.LJIIJ(new IDlS63S0100000_7(this, 4), requireViewById(R.id.bv0));
                C82632Wbs c82632Wbs = this.LJLJL;
                InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LJLLLLLL;
                ((VideoEditViewModel) c82632Wbs.LIZ(this, interfaceC74236TBoArr[4])).LJLIL.observe(this, new AObjectS86S0100000_7(this, 57));
                ((BaseJediViewModel) this.LJLJJLL.LIZ(this, interfaceC74236TBoArr[3])).Iv0(this, new TBT() { // from class: X.I6S
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((EditAdjustClipsBottomViewState) obj).getFocusEditMode();
                    }
                }, new C73165SnZ(), new AqS173S0100000_7(this, 107));
                ((BaseJediViewModel) this.LJLJJLL.LIZ(this, interfaceC74236TBoArr[3])).Iv0(this, new TBT() { // from class: X.I7E
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((EditAdjustClipsBottomViewState) obj).isLibraryMode();
                    }
                }, new C73165SnZ(), new AqS173S0100000_7(this, 108));
                return;
            }
            o.LJIJI("tvSaveRed");
            throw null;
        }
        o.LJIJI("tvSave");
        throw null;
    }

    public final void LLJJ(boolean z, InterfaceC65784Pro interfaceC65784Pro) {
        WMH wmh;
        WMH wmh2;
        if (z) {
            WM7 wm7 = this.mParentScene;
            if (!(wm7 instanceof WMH) || (wmh2 = (WMH) wm7) == null || !wmh2.isShowing(this)) {
                WM7 wm72 = this.mParentScene;
                if ((wm72 instanceof WMH) && (wmh = (WMH) wm72) != null) {
                    wmh.show(this);
                }
            }
        }
        if (z) {
            C82632Wbs c82632Wbs = this.LJLJI;
            InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LJLLLLLL;
            InterfaceC143655kP interfaceC143655kP = (InterfaceC143655kP) c82632Wbs.LIZ(this, interfaceC74236TBoArr[0]);
            int LIZIZ = C78885Uxd.LIZIZ(true, false, false, false);
            int LJFF = C81184Vtc.LJFF(this.mActivity) + ((int) KL2.LIZJ(this.mActivity, 52.0f));
            int LLJILJIL = LLJILJIL();
            int LLJILJILJ = LLJILJILJ();
            AnonymousClass668.LIZIZ().LIZ();
            C140335f3 LIZIZ2 = C140345f4.LIZIZ(LIZIZ, LJFF, LLJILJIL, LLJILJILJ, false, false, 960);
            LIZIZ2.LJI = Boolean.TRUE;
            interfaceC143655kP.oF(LIZIZ2);
            JediViewModel jediViewModel = (JediViewModel) this.LJLJJLL.LIZ(this, interfaceC74236TBoArr[3]);
            jediViewModel.getClass();
            jediViewModel.setState(new AqS2S0000001_7(LLJILJILJ() / AnonymousClass668.LIZIZ().LJFF(), 2));
        } else {
            InterfaceC143655kP interfaceC143655kP2 = (InterfaceC143655kP) this.LJLJI.LIZ(this, LJLLLLLL[0]);
            int color = getResources().getColor(R.color.b5);
            int LJFF2 = C81184Vtc.LJFF(this.mActivity) + ((int) KL2.LIZJ(this.mActivity, 52.0f));
            int LLJILJIL2 = LLJILJIL();
            int LLJILJILJ2 = LLJILJILJ();
            AnonymousClass668.LIZIZ().LIZ();
            interfaceC143655kP2.oF(C140345f4.LIZ(color, LJFF2, LLJILJIL2, LLJILJILJ2));
        }
        View view = this.LJLL;
        if (view != null) {
            view.setVisibility(8);
            if (!z) {
                View view2 = this.LJLJLLL;
                if (view2 != null) {
                    view2.setVisibility(4);
                } else {
                    o.LJIJI("titleBar");
                    throw null;
                }
            }
            View view3 = this.LJLLI;
            if (view3 != null) {
                C170696mv.LIZJ(view3, z, LLJILJIL(), this.mView, new C46085I6v(this, z, interfaceC65784Pro));
                return;
            } else {
                o.LJIJI("bottomView");
                throw null;
            }
        }
        o.LJIJI("ivPlay");
        throw null;
    }

    @Override // X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.io, viewGroup, false, "null cannot be cast to non-null type android.view.ViewGroup");
    }

    @Override // X.WMH, X.WM7
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }
}
