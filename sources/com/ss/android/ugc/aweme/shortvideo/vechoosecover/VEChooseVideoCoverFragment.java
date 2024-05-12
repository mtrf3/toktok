package com.ss.android.ugc.aweme.shortvideo.vechoosecover;

import X.AbstractC156316Bn;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C151555x9;
import X.C151885xg;
import X.C151915xj;
import X.C162136Xx;
import X.C162606Zs;
import X.C162696a1;
import X.C16880lQ;
import X.C19N;
import X.C1B3;
import X.C29S;
import X.C3C5;
import X.C42303Gix;
import X.C45804HyK;
import X.C5MM;
import X.C60903NvH;
import X.C63081OpJ;
import X.C6VK;
import X.C6VO;
import X.C6WA;
import X.C6Y0;
import X.C6Y2;
import X.C6Y4;
import X.C6YC;
import X.C6YF;
import X.C76800UCe;
import X.C90903hW;
import X.EnumC42282Gic;
import X.EnumC42283Gid;
import X.GGO;
import X.InterfaceC153045zY;
import X.InterfaceC162616Zt;
import X.InterfaceC88472Yns;
import X.OQN;
import X.ProgressDialogC173686rk;
import X.SFS;
import Y.ARunnableS5S0201000_2;
import Y.IDTListenerS69S0000000_2;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.cover.VEMultiEditVideoCoverGeneratorImpl;
import com.ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.views.IDlS62S0100000_2;
import com.ss.android.vesdk.VEEditor;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.jvm.internal.o;
import o3.h0;

/* loaded from: classes3.dex */
public class VEChooseVideoCoverFragment extends Fragment implements C6YC {
    public static final /* synthetic */ int LLFFF = 0;
    public RelativeLayout LJLIL;
    public C6Y4 LJLILLLLZI;
    public TextView LJLJI;
    public View LJLJJI;
    public ViewGroup LJLJJL;
    public FrameLayout LJLJJLL;
    public FrameLayout LJLJL;
    public ViewGroup LJLJLJ;
    public FrameLayout LJLJLLL;
    public FrameLayout LJLL;
    public InterfaceC162616Zt LJLLI;
    public C6Y2 LJLLL;
    public float LJLLLL;
    public boolean LJLZ;
    public boolean LJZ;
    public ProgressDialogC173686rk LJZI;
    public MutableLiveData<Bitmap> LJZL;
    public MutableLiveData<Boolean> LL;
    public final SafeHandler LJLLILLLL = new SafeHandler(this);
    public final SafeHandler LJLLJ = new SafeHandler(this);
    public final SparseArray<EffectTextModel> LJLLLLLL = new SparseArray<>();
    public final MutableLiveData<Integer> LLD = new MutableLiveData<>();
    public int LLF = -1;
    public boolean LLFF = false;

    public final void Gl() {
        if (e1.LIZ(31744, "choose_cover_quit", true, false)) {
            this.LJLLL.LJLJLLL();
            return;
        }
        if (!isAdded()) {
            return;
        }
        FragmentManager requireFragmentManager = requireFragmentManager();
        requireFragmentManager.getClass();
        C1B3 c1b3 = new C1B3(requireFragmentManager);
        c1b3.LJJI(this);
        c1b3.LJI();
    }

    public final void Jl() {
        C6Y2 c6y2;
        Bitmap LLJL;
        C6Y2 c6y22;
        Bitmap LLJL2;
        if (this.LLFF && (c6y22 = this.LJLLL) != null && (LLJL2 = c6y22.getEditor().LLJL()) != null) {
            this.LLFF = false;
            this.LJLILLLLZI.setVideoCoverFrameView(LLJL2);
            LLJL2.recycle();
        }
        if (this.LJLZ && (c6y2 = this.LJLLL) != null && (LLJL = c6y2.getEditor().LLJL()) != null) {
            this.LJLLLL = this.LJLLL.getEditor().LJZL();
            this.LLFF = false;
            this.LJLILLLLZI.setVideoCoverFrameView(LLJL);
            LLJL.recycle();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        C162606Zs c162606Zs;
        C6Y4 c6y4 = this.LJLILLLLZI;
        if (c6y4 != null && (c6y4.getAdapter() instanceof C162606Zs) && (c162606Zs = (C162606Zs) this.LJLILLLLZI.getAdapter()) != null) {
            c162606Zs.LJLJJL.dispose();
        }
        this.LJLLILLLL.removeCallbacksAndMessages(null);
        this.LJLLJ.removeCallbacksAndMessages(null);
        super.onDestroy();
    }

    public final void vl() {
        ProgressDialogC173686rk progressDialogC173686rk = this.LJZI;
        if (progressDialogC173686rk != null) {
            progressDialogC173686rk.dismiss();
            Al(false);
        }
        if (this.LJLLL == null) {
            return;
        }
        this.LJLLILLLL.removeCallbacksAndMessages(null);
        this.LJLLL.LJIIIZ().setValue(C5MM.LIZJ());
        this.LJLLL.getEditor().LLJILJIL(true);
        this.LJLLL.LJIIIZ().setValue(C5MM.LIZ());
        if (getFragmentManager() == null) {
            return;
        }
        Gl();
    }

    public final boolean wl() {
        C6Y2 c6y2 = this.LJLLL;
        if (c6y2 != null && !OQN.LJIIIIZZ(c6y2.LIZLLL().mVideoCoverStartTm, this.LJLLLL / 1000.0f)) {
            return true;
        }
        return false;
    }

    public final void Al(boolean z) {
        GGO ggo;
        if (z) {
            ggo = GGO.SHOW;
        } else {
            ggo = GGO.DISMISS;
        }
        C42303Gix.LIZ(1014, ggo, EnumC42283Gid.PROGRESS_WITH_MESSAGE, EnumC42282Gic.CLOSE_GONE, null);
    }

    public final void Dl(InterfaceC88472Yns<Boolean, Boolean> interfaceC88472Yns) {
        C6Y2 c6y2 = this.LJLLL;
        if (c6y2 == null) {
            return;
        }
        VideoPublishEditModel LIZLLL = c6y2.LIZLLL();
        InterfaceC153045zY editor = this.LJLLL.getEditor();
        EffectTextModel effectTextModel = new EffectTextModel();
        boolean wl = wl();
        C6VO LJFF = C60903NvH.LJIIJJI().LJFF();
        editor.LLILZ();
        editor.LLILZ();
        LJFF.LIZ(LIZLLL, effectTextModel, wl, false, new C162136Xx(1, this, effectTextModel, interfaceC88472Yns));
    }

    public final void Il(long j) {
        if (this.LJLLL == null) {
            return;
        }
        this.LJLLL.LJIIIZ().setValue(C5MM.LIZJ());
        this.LJLLL.LJIIIZ().setValue(C5MM.LIZ());
        this.LJLLILLLL.postDelayed(new C6Y0(j, 1, this), 1000L);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        VEEditor.GET_FRAMES_FLAGS get_frames_flags;
        InterfaceC162616Zt vEVideoCoverGeneratorImpl;
        VEChooseVideoCoverFragment vEChooseVideoCoverFragment = this;
        super.onActivityCreated(bundle);
        C6Y4 c6y4 = vEChooseVideoCoverFragment.LJLILLLLZI;
        if (c6y4 != null) {
            c6y4.setOnScrollListener(vEChooseVideoCoverFragment);
            vEChooseVideoCoverFragment.LJLILLLLZI.setItemCount(7);
            vEChooseVideoCoverFragment.LJLILLLLZI.setTotalPage(1);
        }
        C6Y2 c6y2 = vEChooseVideoCoverFragment.LJLLL;
        if (c6y2 == null) {
            return;
        }
        VideoPublishEditModel LIZLLL = c6y2.LIZLLL();
        vEChooseVideoCoverFragment.LJLLLL = LIZLLL.mVideoCoverStartTm * 1000.0f;
        vEChooseVideoCoverFragment.LJLLLLLL.put(0, LIZLLL.getCoverPublishModel().getEffectTextModel());
        if (C6WA.LIZ()) {
            get_frames_flags = VEEditor.GET_FRAMES_FLAGS.GET_FRAMES_MODE_NORMAL;
        } else {
            get_frames_flags = VEEditor.GET_FRAMES_FLAGS.GET_FRAMES_MODE_NOEFFECT;
        }
        if (vEChooseVideoCoverFragment.xl(LIZLLL)) {
            if (vEChooseVideoCoverFragment.LJLLL.getEditor() != null) {
                vEChooseVideoCoverFragment.LJLLL.getEditor().getDuration();
            }
            vEVideoCoverGeneratorImpl = new MvEffectVideoCoverGeneratorImpl();
        } else if (LIZLLL.isMultiVideoEdit()) {
            vEVideoCoverGeneratorImpl = new VEMultiEditVideoCoverGeneratorImpl(vEChooseVideoCoverFragment.LJLLL.getEditor(), vEChooseVideoCoverFragment, vEChooseVideoCoverFragment.LJLILLLLZI.getCoverSize(), vEChooseVideoCoverFragment.LJLLL.getEditor().getDuration(), 0, get_frames_flags);
        } else {
            InterfaceC153045zY editor = vEChooseVideoCoverFragment.LJLLL.getEditor();
            int coverSize = vEChooseVideoCoverFragment.LJLILLLLZI.getCoverSize();
            vEChooseVideoCoverFragment = vEChooseVideoCoverFragment;
            vEVideoCoverGeneratorImpl = new VEVideoCoverGeneratorImpl(editor, vEChooseVideoCoverFragment, coverSize, get_frames_flags, "choose_cover");
        }
        vEChooseVideoCoverFragment.LJLLI = vEVideoCoverGeneratorImpl;
        C6Y4 c6y42 = vEChooseVideoCoverFragment.LJLILLLLZI;
        if (c6y42 != null) {
            c6y42.post(new ARunnableS5S0201000_2(2, vEChooseVideoCoverFragment, LIZLLL, 5));
        }
        vEChooseVideoCoverFragment.LLD.observe(vEChooseVideoCoverFragment, new Observer() { // from class: X.6YB
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
            }
        });
        C16880lQ.LJIJI(vEChooseVideoCoverFragment.LJLJI, new IDlS62S0100000_2(vEChooseVideoCoverFragment, (AbstractC156316Bn<Object>) 17));
        C16880lQ.LJIIJ(new IDlS62S0100000_2(vEChooseVideoCoverFragment, (AbstractC156316Bn<Object>) 18), vEChooseVideoCoverFragment.LJLJJI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof C6Y2) {
            this.LJLLL = (C6Y2) context;
            this.LJZ = C19N.LJ("is_low_memory_machine_for_tools", false);
            C162696a1.LIZJ(C45804HyK.LJIJJ(context));
            return;
        }
        throw new IllegalStateException("context must implement ArgumentsDependency");
    }

    public final boolean xl(VideoPublishEditModel videoPublishEditModel) {
        if ((videoPublishEditModel.isMvThemeVideoType() && !((Boolean) C6YF.LIZ.getValue()).booleanValue()) || this.LJZ) {
            return true;
        }
        return false;
    }

    public final void Hl(float f, boolean z) {
        this.LJLZ = z;
        Objects.requireNonNull(this.LJLLL);
        C5MM LIZLLL = C5MM.LIZLLL((int) (r0.getEditor().getDuration() * f));
        C6Y2 c6y2 = this.LJLLL;
        if (c6y2 != null) {
            c6y2.LJIIIZ().setValue(LIZLLL);
        }
        if (this.LJLLI != null) {
            Il(LIZLLL.LIZIZ);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        RelativeLayout relativeLayout = (RelativeLayout) h0.LJIIZILJ(R.id.nbr, view);
        this.LJLIL = relativeLayout;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) relativeLayout.getLayoutParams();
        int i = this.LLF;
        if (i == -1) {
            i = C63081OpJ.LJJJJLI(mo49getActivity());
            this.LLF = i;
        }
        marginLayoutParams.topMargin = i;
        this.LJLIL.requestLayout();
        C151555x9 c151555x9 = new C151555x9(getContext());
        c151555x9.LJII = true;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C151915xj(SFS.LJI(250.0d), -1.0f));
        c151555x9.LIZLLL = arrayList;
        c151555x9.LJI = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.bif, this.LJLIL, false);
        c151555x9.LJ = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.bic, this.LJLIL, false);
        c151555x9.LJFF = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.big, this.LJLIL, false);
        this.LJLIL.addView(new C151885xg(c151555x9), 0, new RelativeLayout.LayoutParams(-1, -1));
        this.LJLILLLLZI = (C6Y4) h0.LJIIZILJ(R.id.bbc, view);
        this.LJLJI = (TextView) h0.LJIIZILJ(R.id.m27, view);
        this.LJLJJI = h0.LJIIZILJ(R.id.m26, view);
        this.LJLJJLL = (FrameLayout) h0.LJIIZILJ(R.id.n91, view);
        this.LJLJL = (FrameLayout) h0.LJIIZILJ(R.id.dcw, view);
        this.LJLJJL = (ViewGroup) h0.LJIIZILJ(R.id.e3y, view);
        this.LJLJLJ = (ViewGroup) h0.LJIIZILJ(R.id.ish, view);
        this.LJLJLLL = (FrameLayout) h0.LJIIZILJ(R.id.dcv, view);
        this.LJLL = (FrameLayout) h0.LJIIZILJ(R.id.dcu, view);
        h0.LJIIZILJ(R.id.m2b, view).setVisibility(8);
        EffectTextModel effectTextModel = this.LJLLL.LIZLLL().getCoverPublishModel().getEffectTextModel();
        C6VK c6vk = new C6VK(this.LJLJLLL, this.LJLL, this.LJLJL);
        c6vk.LJFF = effectTextModel;
        c6vk.LJI = this.LJLLL.LIZLLL().getAvetParameter();
        C60903NvH.LJIIJJI().LJFF().LIZLLL((C29S) mo49getActivity(), c6vk);
        h0.LJIIZILJ(R.id.nbr, view).setOnTouchListener(new IDTListenerS69S0000000_2(1));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.j2, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }
}
