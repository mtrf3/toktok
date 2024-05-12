package com.bytedance.effectcreatormobile.behaviour.view.preview;

import X.AbstractC030109x;
import X.AbstractC03490Bt;
import X.AbstractC94370afu;
import X.ActivityC45651qj;
import X.C16880lQ;
import X.C47261Igj;
import X.C62822Ol8;
import X.C76800UCe;
import X.C78924UyG;
import X.C93421aQb;
import X.C93729aVZ;
import X.C93745aVp;
import X.C93747aVr;
import X.C93748aVs;
import X.C93792aWa;
import X.C93815aWx;
import X.C93816aWy;
import X.C94010aa6;
import X.C94048aai;
import X.C94057aar;
import X.C94073ab7;
import X.C94194ad4;
import X.C94267aeF;
import X.C94269aeH;
import X.C94526aiQ;
import X.C94529aiT;
import X.C94530aiU;
import X.C94850ane;
import X.EnumC93441aQv;
import X.InterfaceC06750Oh;
import X.InterfaceC70352pT;
import X.XKX;
import Y.IDObjectS0S0101000;
import Y.IDObserverS227S0100000_42;
import Y.IDrS54S0100000_42;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.effectcreatormobile.behaviour.BehaviourImpl;
import com.bytedance.effectcreatormobile.behaviour.base.BehaviourContentFragment;
import com.bytedance.effectcreatormobile.behaviour.viewmodel.PreviewViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.IDqS419S0100000_42;
import kotlin.jvm.internal.IDqS423S0100000_42;
import kotlin.jvm.internal.IDqS442S0100000_42;
import kotlin.jvm.internal.IDqS446S0100000_42;
import kotlin.jvm.internal.IDqS457S0100000_42;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class BehaviourPreviewFragment extends BehaviourContentFragment<C94194ad4> {
    public static final /* synthetic */ int LJLJLJ = 0;
    public final C93748aVs LJLJJI = new C93748aVs(100);
    public final C62822Ol8 LJLJJL = C93745aVp.LIZJ(this, PreviewViewModel.class);
    public C94057aar LJLJJLL;
    public C93792aWa LJLJL;

    public final PreviewViewModel Jl() {
        return (PreviewViewModel) this.LJLJJL.getValue();
    }

    @Override // com.bytedance.effectcreatormobile.behaviour.base.BehaviourContentFragment, com.bytedance.effectcreatormobile.behaviour.base.BehaviourBaseFragment, com.ugc.effectcreator.foundation.bottomdrawerviewpager.BottomDrawerFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C93792aWa c93792aWa = this.LJLJL;
        if (c93792aWa != null) {
            ActivityC45651qj requireActivity = requireActivity();
            o.LJIIIIZZ(requireActivity, "requireActivity()");
            c93792aWa.LIZ(requireActivity);
            return;
        }
        o.LJIJI("touchHelper");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C93747aVr.LIZ(-1L, false);
    }

    public static boolean Kl(View view) {
        if ((view instanceof EditText) && view.getVisibility() == 0) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            view = null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup == null) {
            return false;
        }
        Iterator<View> it = C78924UyG.LIZLLL(viewGroup).iterator();
        while (true) {
            boolean z = false;
            while (true) {
                IDObjectS0S0101000 iDObjectS0S0101000 = (IDObjectS0S0101000) it;
                if (!iDObjectS0S0101000.hasNext()) {
                    return z;
                }
                View view2 = (View) iDObjectS0S0101000.next();
                if (z || Kl(view2)) {
                    z = true;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Ll(AbstractC94370afu abstractC94370afu) {
        View view;
        RecyclerView recyclerView;
        RecyclerView.ViewHolder LJJIZ;
        C94057aar c94057aar = this.LJLJJLL;
        if (c94057aar != null) {
            int i = -1;
            int i2 = 0;
            for (Object obj : c94057aar.LJLJI) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    if (!(obj instanceof C93815aWx)) {
                        obj = null;
                    }
                    C93815aWx c93815aWx = (C93815aWx) obj;
                    if (c93815aWx != null && o.LJ(c93815aWx.LIZ, abstractC94370afu)) {
                        i = i2;
                    }
                    i2 = i3;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            if (i < 0) {
                return;
            }
            C94057aar c94057aar2 = this.LJLJJLL;
            if (c94057aar2 != null) {
                Object obj2 = ListProtector.get(c94057aar2.LJLJI, i);
                if (!(obj2 instanceof C93815aWx)) {
                    obj2 = null;
                }
                C93815aWx c93815aWx2 = (C93815aWx) obj2;
                if (c93815aWx2 != null) {
                    C94194ad4 c94194ad4 = (C94194ad4) Al();
                    if (c94194ad4 != null && (recyclerView = c94194ad4.LJLJI) != null && (LJJIZ = recyclerView.LJJIZ(i)) != null) {
                        view = LJJIZ.itemView;
                    } else {
                        view = null;
                    }
                    if (!(view instanceof C94526aiQ)) {
                        view = null;
                    }
                    C94526aiQ c94526aiQ = (C94526aiQ) view;
                    if (c94526aiQ != null) {
                        AbstractC030109x itemAnimator = c94526aiQ.getItemAnimator();
                        if (itemAnimator != null) {
                            itemAnimator.LJIILL(new C94073ab7(c94526aiQ, this, c93815aWx2));
                            return;
                        } else {
                            Il(c93815aWx2, c94526aiQ, false);
                            return;
                        }
                    }
                    C94057aar c94057aar3 = this.LJLJJLL;
                    if (c94057aar3 != null) {
                        c94057aar3.notifyItemChanged(i);
                        return;
                    } else {
                        o.LJIJI("commandAdapter");
                        throw null;
                    }
                }
                return;
            }
            o.LJIJI("commandAdapter");
            throw null;
        }
        o.LJIJI("commandAdapter");
        throw null;
    }

    public static void Ml(BehaviourPreviewFragment behaviourPreviewFragment, AbstractC03490Bt abstractC03490Bt) {
        PathInterpolator LIZ = C94010aa6.LIZ();
        abstractC03490Bt.LJJIII(350L);
        abstractC03490Bt.LJJIIJZLJL(LIZ);
    }

    @Override // com.bytedance.effectcreatormobile.behaviour.base.BehaviourBaseFragment
    public final InterfaceC06750Oh Dl(LayoutInflater inflater, ViewGroup viewGroup) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.dv6, viewGroup, false);
        int i = R.id.cd9;
        View findViewById = LLLLIILL.findViewById(R.id.cd9);
        if (findViewById != null) {
            i = R.id.nou;
            RecyclerView recyclerView = (RecyclerView) LLLLIILL.findViewById(R.id.nou);
            if (recyclerView != null) {
                return new C94194ad4((FrameLayout) LLLLIILL, findViewById, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(LLLLIILL.getResources().getResourceName(i)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.effectcreatormobile.behaviour.base.BehaviourBaseFragment
    public final void xl(View view, Bundle bundle) {
        InterfaceC70352pT<C76800UCe> commandListChangeEvent;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        o.LJIIIZ(view, "view");
        postponeEnterTransition();
        C94194ad4 c94194ad4 = (C94194ad4) Al();
        if (c94194ad4 != null && (recyclerView2 = c94194ad4.LJLJI) != null) {
            requireContext();
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
            linearLayoutManager.LLJJIII(1);
            recyclerView2.setLayoutManager(linearLayoutManager);
            C93421aQb c93421aQb = new C93421aQb();
            C94269aeH c94269aeH = new C94269aeH();
            c94269aeH.LIZ = new IDqS442S0100000_42(this, 4);
            c93421aQb.LIZ(C93816aWy.class, c94269aeH);
            C94267aeF c94267aeF = new C94267aeF();
            c94267aeF.LIZ = new IDqS442S0100000_42(this, 5);
            c93421aQb.LIZ(C93815aWx.class, c94267aeF);
            C94057aar c94057aar = c93421aQb.LIZ;
            this.LJLJJLL = c94057aar;
            if (c94057aar != null) {
                recyclerView2.setAdapter(c94057aar);
                AbstractC030109x itemAnimator = recyclerView2.getItemAnimator();
                if (itemAnimator != null) {
                    itemAnimator.LJFF = 0L;
                }
            } else {
                o.LJIJI("commandAdapter");
                throw null;
            }
        }
        TextView f8 = f8();
        if (f8 != null) {
            C93729aVZ.LIZJ(f8);
        }
        TextView zh = zh();
        if (zh != null) {
            C93729aVZ.LJI(zh);
        }
        TextView zh2 = zh();
        if (zh2 != null) {
            BehaviourContentFragment.Gl(this, zh2, new IDqS419S0100000_42(this, 76));
        }
        TextView zg = zg();
        if (zg != null) {
            zg.setText(requireContext().getString(R.string.fwe));
        }
        Jl().jv0(null);
        C94194ad4 c94194ad42 = (C94194ad4) Al();
        if (c94194ad42 != null && (recyclerView = c94194ad42.LJLJI) != null) {
            recyclerView.LJIIJJI(new IDrS54S0100000_42(this, 1));
        }
        ActivityC45651qj requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        C93792aWa c93792aWa = new C93792aWa(requireActivity);
        ((ArrayList) c93792aWa.LIZIZ).add(new IDqS446S0100000_42(this, 8));
        this.LJLJL = c93792aWa;
        Jl().LJLILLLLZI.LIZ.observe(getViewLifecycleOwner(), new IDObserverS227S0100000_42(this, 20));
        BehaviourImpl LIZIZ = C94048aai.LIZIZ();
        if (LIZIZ != null && (commandListChangeEvent = LIZIZ.getCommandListChangeEvent()) != null) {
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            o.LJIIIIZZ(viewLifecycleOwner, "viewLifecycleOwner");
            XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C94850ane(commandListChangeEvent, viewLifecycleOwner, Lifecycle.State.STARTED, null, this), 3);
        }
        wl(new IDqS423S0100000_42(this, 121));
    }

    public final void Il(C93815aWx c93815aWx, C94526aiQ c94526aiQ, boolean z) {
        int i;
        AbstractC94370afu abstractC94370afu = c93815aWx.LIZ;
        C94529aiT visitor = C94529aiT.LJLIL;
        c94526aiQ.getClass();
        o.LJIIIZ(visitor, "visitor");
        c94526aiQ.LLLII = visitor;
        c94526aiQ.LLLIIII = new IDqS457S0100000_42(abstractC94370afu, 1);
        c94526aiQ.LJLJL(abstractC94370afu, true, c93815aWx.LIZIZ, -1, EnumC93441aQv.VIEW_TYPE_MORE, z, new C94530aiU(this, abstractC94370afu, c94526aiQ, c93815aWx));
        List<C93815aWx> value = Jl().LJLILLLLZI.LIZ.getValue();
        if (value != null) {
            int indexOf = value.indexOf(c93815aWx);
            Bundle arguments = getArguments();
            if (arguments != null) {
                i = arguments.getInt("cke_behaviour_share_element_position");
            } else {
                i = -1;
            }
            if (indexOf == i) {
                c94526aiQ.setTransitionName(getString(R.string.tz8));
            }
        }
    }
}
