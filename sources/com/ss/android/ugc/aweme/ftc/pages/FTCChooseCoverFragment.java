package com.ss.android.ugc.aweme.ftc.pages;

import X.AbstractC029409q;
import X.AbstractC156316Bn;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C162606Zs;
import X.C162696a1;
import X.C16880lQ;
import X.C19N;
import X.C1B3;
import X.C29S;
import X.C3C5;
import X.C45804HyK;
import X.C5MM;
import X.C60903NvH;
import X.C6VK;
import X.C6VO;
import X.C6WA;
import X.C6Y8;
import X.C6Y9;
import X.C76800UCe;
import X.C90903hW;
import X.InterfaceC153045zY;
import X.InterfaceC162066Xq;
import X.InterfaceC162616Zt;
import Y.ARunnableS11S0100100_2;
import Y.ARunnableS21S0200000_2;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.cover.VEMultiEditVideoCoverGeneratorImpl;
import com.ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.MvEffectVideoCoverGeneratorImpl;
import com.ss.android.ugc.aweme.views.IDlS17S0200000_2;
import com.ss.android.ugc.aweme.views.IDlS62S0100000_2;
import com.ss.android.vesdk.VEEditor;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class FTCChooseCoverFragment extends Fragment implements C6Y9 {
    public InterfaceC162066Xq LJLIL;
    public float LJLILLLLZI;
    public boolean LJLJI;
    public MutableLiveData<Bitmap> LJLJJI;
    public MutableLiveData<Boolean> LJLJJL;
    public SafeHandler LJLJJLL;
    public boolean LJLJL;
    public InterfaceC162616Zt LJLJLJ;
    public AbstractC029409q<RecyclerView.ViewHolder> LJLJLLL;
    public final Map<Integer, View> LJLL = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.C6Y9
    public final void lf() {
        SafeHandler safeHandler = this.LJLJJLL;
        if (safeHandler != null) {
            safeHandler.removeCallbacksAndMessages(null);
            C5MM LIZJ = C5MM.LIZJ();
            InterfaceC162066Xq interfaceC162066Xq = this.LJLIL;
            if (interfaceC162066Xq != null) {
                interfaceC162066Xq.LJIIIZ().setValue(LIZJ);
                return;
            } else {
                o.LJIJI("mDependency");
                throw null;
            }
        }
        o.LJIJI("mSafeHandler");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        AbstractC029409q<RecyclerView.ViewHolder> abstractC029409q = this.LJLJLLL;
        if (abstractC029409q instanceof C162606Zs) {
            ((C162606Zs) abstractC029409q).LJLJJL.dispose();
        }
        super.onDestroy();
    }

    public final void vl() {
        SafeHandler safeHandler = this.LJLJJLL;
        if (safeHandler != null) {
            safeHandler.removeCallbacksAndMessages(null);
            C5MM LIZJ = C5MM.LIZJ();
            InterfaceC162066Xq interfaceC162066Xq = this.LJLIL;
            if (interfaceC162066Xq != null) {
                interfaceC162066Xq.LJIIIZ().setValue(LIZJ);
                InterfaceC162066Xq interfaceC162066Xq2 = this.LJLIL;
                if (interfaceC162066Xq2 != null) {
                    interfaceC162066Xq2.getEditor().LLJILJIL(true);
                    C5MM LIZ = C5MM.LIZ();
                    InterfaceC162066Xq interfaceC162066Xq3 = this.LJLIL;
                    if (interfaceC162066Xq3 != null) {
                        interfaceC162066Xq3.LJIIIZ().setValue(LIZ);
                        if (getFragmentManager() == null || !isAdded()) {
                            return;
                        }
                        FragmentManager requireFragmentManager = requireFragmentManager();
                        requireFragmentManager.getClass();
                        C1B3 c1b3 = new C1B3(requireFragmentManager);
                        c1b3.LJJI(this);
                        c1b3.LJI();
                        return;
                    }
                    o.LJIJI("mDependency");
                    throw null;
                }
                o.LJIJI("mDependency");
                throw null;
            }
            o.LJIJI("mDependency");
            throw null;
        }
        o.LJIJI("mSafeHandler");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLL).clear();
    }

    @Override // X.C6Y9
    public final void LLILLIZIL(float f) {
        this.LJLJL = true;
        if (this.LJLIL != null) {
            C5MM LIZIZ = C5MM.LIZIZ((int) (r0.getEditor().getDuration() * f));
            InterfaceC162066Xq interfaceC162066Xq = this.LJLIL;
            if (interfaceC162066Xq != null) {
                interfaceC162066Xq.LJIIIZ().setValue(LIZIZ);
                return;
            } else {
                o.LJIJI("mDependency");
                throw null;
            }
        }
        o.LJIJI("mDependency");
        throw null;
    }

    @Override // X.C6Y9
    public final void W9(float f) {
        wl(f);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        VEEditor.GET_FRAMES_FLAGS get_frames_flags;
        boolean z;
        InterfaceC162616Zt vEVideoCoverGeneratorImpl;
        FTCChooseCoverFragment fTCChooseCoverFragment = this;
        super.onActivityCreated(bundle);
        fTCChooseCoverFragment.LJLJJLL = new SafeHandler(fTCChooseCoverFragment);
        InterfaceC162066Xq interfaceC162066Xq = fTCChooseCoverFragment.LJLIL;
        if (interfaceC162066Xq != null) {
            VideoPublishEditModel LIZLLL = interfaceC162066Xq.LIZLLL();
            if (C6WA.LIZ()) {
                get_frames_flags = VEEditor.GET_FRAMES_FLAGS.GET_FRAMES_MODE_NORMAL;
            } else {
                get_frames_flags = VEEditor.GET_FRAMES_FLAGS.GET_FRAMES_MODE_NOEFFECT;
            }
            InterfaceC162066Xq interfaceC162066Xq2 = fTCChooseCoverFragment.LJLIL;
            if (interfaceC162066Xq2 != null) {
                VideoPublishEditModel LIZLLL2 = interfaceC162066Xq2.LIZLLL();
                if (fTCChooseCoverFragment.LJLJI || LIZLLL2.isMvThemeVideoType()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    InterfaceC162066Xq interfaceC162066Xq3 = fTCChooseCoverFragment.LJLIL;
                    if (interfaceC162066Xq3 != null) {
                        interfaceC162066Xq3.getEditor().getDuration();
                        vEVideoCoverGeneratorImpl = new MvEffectVideoCoverGeneratorImpl();
                    } else {
                        o.LJIJI("mDependency");
                        throw null;
                    }
                } else if (LIZLLL.isMultiVideoEdit()) {
                    InterfaceC162066Xq interfaceC162066Xq4 = fTCChooseCoverFragment.LJLIL;
                    if (interfaceC162066Xq4 != null) {
                        int duration = interfaceC162066Xq4.getEditor().getDuration();
                        InterfaceC162066Xq interfaceC162066Xq5 = fTCChooseCoverFragment.LJLIL;
                        if (interfaceC162066Xq5 != null) {
                            vEVideoCoverGeneratorImpl = new VEMultiEditVideoCoverGeneratorImpl(interfaceC162066Xq5.getEditor(), fTCChooseCoverFragment, ((C6Y8) fTCChooseCoverFragment._$_findCachedViewById(R.id.n3z)).getCoverSize(), duration, 0, get_frames_flags);
                        } else {
                            o.LJIJI("mDependency");
                            throw null;
                        }
                    } else {
                        o.LJIJI("mDependency");
                        throw null;
                    }
                } else {
                    InterfaceC162066Xq interfaceC162066Xq6 = fTCChooseCoverFragment.LJLIL;
                    if (interfaceC162066Xq6 != null) {
                        InterfaceC153045zY editor = interfaceC162066Xq6.getEditor();
                        int coverSize = ((C6Y8) fTCChooseCoverFragment._$_findCachedViewById(R.id.n3z)).getCoverSize();
                        fTCChooseCoverFragment = fTCChooseCoverFragment;
                        vEVideoCoverGeneratorImpl = new VEVideoCoverGeneratorImpl(editor, fTCChooseCoverFragment, coverSize, get_frames_flags, "choose_cover");
                    } else {
                        o.LJIJI("mDependency");
                        throw null;
                    }
                }
                fTCChooseCoverFragment.LJLJLJ = vEVideoCoverGeneratorImpl;
                ((C6Y8) fTCChooseCoverFragment._$_findCachedViewById(R.id.n3z)).setOnScrollListener(fTCChooseCoverFragment);
                fTCChooseCoverFragment._$_findCachedViewById(R.id.n3z).post(new ARunnableS21S0200000_2(LIZLLL, fTCChooseCoverFragment, 8));
                C16880lQ.LJJJJI((TuxTextView) fTCChooseCoverFragment._$_findCachedViewById(R.id.lvw), new IDlS62S0100000_2(fTCChooseCoverFragment, (AbstractC156316Bn<Object>) 10));
                C16880lQ.LJJJJI((TuxTextView) fTCChooseCoverFragment._$_findCachedViewById(R.id.lvv), new IDlS17S0200000_2(fTCChooseCoverFragment, LIZLLL, 0));
                return;
            }
            o.LJIJI("mDependency");
            throw null;
        }
        o.LJIJI("mDependency");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        o.LJIIIZ(context, "context");
        super.onAttach(context);
        if (context instanceof InterfaceC162066Xq) {
            this.LJLIL = (InterfaceC162066Xq) context;
            this.LJLJI = C19N.LJ("is_low_memory_machine_for_tools", false);
            C162696a1.LIZJ(C45804HyK.LJIJJ(context));
            return;
        }
        throw new IllegalStateException("context must implement ArgumentsDependency");
    }

    public final void wl(float f) {
        this.LJLJL = true;
        if (this.LJLIL != null) {
            C5MM LIZLLL = C5MM.LIZLLL((int) (r0.getEditor().getDuration() * f));
            InterfaceC162066Xq interfaceC162066Xq = this.LJLIL;
            if (interfaceC162066Xq != null) {
                interfaceC162066Xq.LJIIIZ().setValue(LIZLLL);
                xl(LIZLLL.LIZIZ);
                return;
            } else {
                o.LJIJI("mDependency");
                throw null;
            }
        }
        o.LJIJI("mDependency");
        throw null;
    }

    public final void xl(long j) {
        C5MM LIZJ = C5MM.LIZJ();
        InterfaceC162066Xq interfaceC162066Xq = this.LJLIL;
        if (interfaceC162066Xq != null) {
            interfaceC162066Xq.LJIIIZ().setValue(LIZJ);
            C5MM LIZ = C5MM.LIZ();
            InterfaceC162066Xq interfaceC162066Xq2 = this.LJLIL;
            if (interfaceC162066Xq2 != null) {
                interfaceC162066Xq2.LJIIIZ().setValue(LIZ);
                SafeHandler safeHandler = this.LJLJJLL;
                if (safeHandler != null) {
                    safeHandler.postDelayed(new ARunnableS11S0100100_2(this, j, 0), 1000L);
                    return;
                } else {
                    o.LJIJI("mSafeHandler");
                    throw null;
                }
            }
            o.LJIJI("mDependency");
            throw null;
        }
        o.LJIJI("mDependency");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity instanceof C29S) {
            _$_findCachedViewById(R.id.lw1).setVisibility(8);
            C6VO LJFF = C60903NvH.LJIIJJI().LJFF();
            C29S c29s = (C29S) mo49getActivity;
            FrameLayout effectTextPanelContainer = (FrameLayout) _$_findCachedViewById(R.id.cra);
            o.LJIIIIZZ(effectTextPanelContainer, "effectTextPanelContainer");
            FrameLayout effectTextInputContainer = (FrameLayout) _$_findCachedViewById(R.id.cr_);
            o.LJIIIIZZ(effectTextInputContainer, "effectTextInputContainer");
            FrameLayout effectTextPreviewContainer = (FrameLayout) _$_findCachedViewById(R.id.crb);
            o.LJIIIIZZ(effectTextPreviewContainer, "effectTextPreviewContainer");
            C6VK c6vk = new C6VK(effectTextPanelContainer, effectTextInputContainer, effectTextPreviewContainer);
            InterfaceC162066Xq interfaceC162066Xq = this.LJLIL;
            if (interfaceC162066Xq != null) {
                c6vk.LJFF = interfaceC162066Xq.LIZLLL().getCoverPublishModel().getEffectTextModel();
                InterfaceC162066Xq interfaceC162066Xq2 = this.LJLIL;
                if (interfaceC162066Xq2 != null) {
                    c6vk.LJI = interfaceC162066Xq2.LIZLLL().getAvetParameter();
                    new AqS168S0100000_2(this, 69);
                    LJFF.LIZLLL(c29s, c6vk);
                } else {
                    o.LJIJI("mDependency");
                    throw null;
                }
            } else {
                o.LJIJI("mDependency");
                throw null;
            }
        } else {
            _$_findCachedViewById(R.id.lw1).setVisibility(0);
        }
        _$_findCachedViewById(R.id.n_0).setOnTouchListener(new View.OnTouchListener() { // from class: X.6Xu
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return true;
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.awj, viewGroup, false);
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
