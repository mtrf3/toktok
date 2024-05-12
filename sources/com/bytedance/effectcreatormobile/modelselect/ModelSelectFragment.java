package com.bytedance.effectcreatormobile.modelselect;

import X.AbstractC029409q;
import X.ActivityC45651qj;
import X.C0CM;
import X.C10A;
import X.C113554cx;
import X.C141335gf;
import X.C16880lQ;
import X.C170576mj;
import X.C29S;
import X.C3C5;
import X.C62822Ol8;
import X.C76732zl;
import X.C76800UCe;
import X.C90903hW;
import X.C93410aQQ;
import X.C93499aRr;
import X.C93643aUB;
import X.C93670aUc;
import X.C93745aVp;
import X.C93750aVu;
import X.C93788aWW;
import X.C93829aXB;
import X.C93916aYa;
import X.C93950aZ8;
import X.C94048aai;
import X.C94090abO;
import X.C94256ae4;
import X.C94343afT;
import X.C94344afU;
import X.C94364afo;
import X.C94373afx;
import X.C94385ag9;
import X.C94386agA;
import X.C94388agC;
import X.EnumC93477aRV;
import X.GestureDetectorOnGestureListenerC93948aZ6;
import X.InterfaceC65784Pro;
import X.InterfaceC93411aQR;
import X.InterfaceC93645aUD;
import X.InterfaceC93966aZO;
import X.KL2;
import X.OSZ;
import X.ViewOnTouchListenerC93947aZ5;
import X.ViewTreeObserverOnPreDrawListenerC16840lM;
import Y.IDObserverS227S0100000_42;
import Y.IDRunnableS92S0100000_42;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.statistic.StatisticReporter;
import com.bytedance.effectcreatormobile.modelselect.api.IModelResProvider;
import com.bytedance.effectcreatormobile.modelselect.model.ModelViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.IDqS179S0200000_42;
import kotlin.jvm.internal.IDqS419S0100000_42;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class ModelSelectFragment extends Fragment implements InterfaceC93966aZO {
    public C94364afo LJLILLLLZI;
    public C94388agC LJLJI;
    public final InterfaceC93645aUD LJLJJLL;
    public final C62822Ol8 LJLIL = C93745aVp.LIZJ(this, ModelViewModel.class);
    public C94256ae4 LJLJJI = new C94256ae4("", "", "", "", "", "", null, 192);
    public final InterfaceC93411aQR LJLJJL = C93410aQQ.LIZJ().providePageLoadingView();

    @Override // X.InterfaceC93966aZO
    public final boolean LJIIJ() {
        wl(null);
        return true;
    }

    public final ModelViewModel xl() {
        return (ModelViewModel) this.LJLIL.getValue();
    }

    public final void Al() {
        this.LJLJJL.LIZIZ();
        this.LJLJJLL.hide();
        ModelViewModel xl = xl();
        IDqS419S0100000_42 iDqS419S0100000_42 = new IDqS419S0100000_42(this, 110);
        xl.getClass();
        ((IModelResProvider) C93745aVp.LIZ(IModelResProvider.class)).getResourceList(new C94373afx(xl, iDqS419S0100000_42));
    }

    public ModelSelectFragment() {
        InterfaceC93645aUD provideStatusPage;
        provideStatusPage = C93643aUB.LIZ().provideStatusPage(EnumC93477aRV.Large);
        this.LJLJJLL = provideStatusPage;
    }

    public final void Dl() {
        String str;
        String str2;
        C93829aXB LJI = CKEffectEditorContext.LJI();
        if (LJI != null && (str = LJI.LIZ) != null) {
            boolean z = !o.LJ(C93950aZ8.LIZ(), this.LJLJJI.LJLJJLL);
            OSZ[] oszArr = new OSZ[3];
            oszArr[0] = new OSZ("project_id", str);
            oszArr[1] = new OSZ("action_type", "click_done");
            if (z) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            oszArr[2] = new OSZ("is_change", str2);
            Map<String, String> LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
            if (z) {
                LJJLIIIIJ.put("after_model_tab", this.LJLJJI.LJLILLLLZI);
                LJJLIIIIJ.put("after_model", this.LJLJJI.LJLIL);
            }
            StatisticReporter LIZ = C93670aUc.LIZ();
            if (LIZ != null) {
                LIZ.onEvent("modelphoto_action", LJJLIIIIJ);
            }
        }
    }

    public static final /* synthetic */ C94364afo vl(ModelSelectFragment modelSelectFragment) {
        C94364afo c94364afo = modelSelectFragment.LJLILLLLZI;
        if (c94364afo != null) {
            return c94364afo;
        }
        o.LJIJI("binding");
        throw null;
    }

    public final void wl(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        C93916aYa c93916aYa = new C93916aYa();
        C94364afo c94364afo = this.LJLILLLLZI;
        if (c94364afo != null) {
            ConstraintLayout constraintLayout = c94364afo.LJLIL;
            o.LJIIIIZZ(constraintLayout, "binding.root");
            c93916aYa.LIZIZ(constraintLayout, new IDqS179S0200000_42(this, interfaceC65784Pro, 0));
            return;
        }
        o.LJIJI("binding");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        View childAt;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        InterfaceC93411aQR interfaceC93411aQR = this.LJLJJL;
        LayoutInflater LLZIL = C16880lQ.LLZIL(getContext());
        C94364afo c94364afo = this.LJLILLLLZI;
        if (c94364afo != null) {
            FrameLayout frameLayout = c94364afo.LJLJJI;
            o.LJIIIIZZ(frameLayout, "binding.loadingContainer");
            interfaceC93411aQR.LIZ(LLZIL, frameLayout);
            InterfaceC93645aUD interfaceC93645aUD = this.LJLJJLL;
            LayoutInflater LLZIL2 = C16880lQ.LLZIL(getContext());
            C94364afo c94364afo2 = this.LJLILLLLZI;
            if (c94364afo2 != null) {
                FrameLayout frameLayout2 = c94364afo2.LJLJJI;
                o.LJIIIIZZ(frameLayout2, "binding.loadingContainer");
                interfaceC93645aUD.LIZ(LLZIL2, frameLayout2);
                C94388agC c94388agC = new C94388agC(new IDqS419S0100000_42(this, 106));
                this.LJLJI = c94388agC;
                C94364afo c94364afo3 = this.LJLILLLLZI;
                if (c94364afo3 != null) {
                    C0CM c0cm = c94364afo3.LJLJLJ;
                    c0cm.setAdapter(c94388agC);
                    c0cm.LIZIZ(new C94343afT(this));
                    C94364afo c94364afo4 = this.LJLILLLLZI;
                    if (c94364afo4 != null) {
                        ConstraintLayout constraintLayout = c94364afo4.LJLIL;
                        o.LJIIIIZZ(constraintLayout, "binding.root");
                        float LIZJ = (C170576mj.LIZJ(c0cm.getContext()) / 375.0f) * 73.0f;
                        if (c0cm.getPaddingStart() == 0 && c0cm.getPaddingEnd() == 0) {
                            int i = (int) LIZJ;
                            c0cm.setPadding(i, 0, i, 0);
                        }
                        c0cm.setClipToPadding(false);
                        c0cm.setClipChildren(false);
                        c0cm.setPageTransformer(C94048aai.LIZ);
                        c0cm.setOffscreenPageLimit(3);
                        constraintLayout.setClickable(true);
                        View childAt2 = c0cm.getChildAt(0);
                        if (!(childAt2 instanceof RecyclerView)) {
                            childAt2 = null;
                        }
                        RecyclerView recyclerView = (RecyclerView) childAt2;
                        if (recyclerView != null) {
                            recyclerView.setOverScrollMode(2);
                        }
                        C76732zl c76732zl = new C76732zl();
                        c76732zl.element = 0;
                        constraintLayout.setOnTouchListener(new ViewOnTouchListenerC93947aZ5(c0cm, new GestureDetector(c0cm.getContext(), new GestureDetectorOnGestureListenerC93948aZ6(c0cm, c76732zl, recyclerView)), c76732zl));
                        C94364afo c94364afo5 = this.LJLILLLLZI;
                        if (c94364afo5 != null) {
                            C93499aRr c93499aRr = c94364afo5.LJLJL;
                            c93499aRr.getClass();
                            AbstractC029409q adapter = c0cm.getAdapter();
                            if (adapter != null) {
                                c93499aRr.LJLIL = adapter.getItemCount();
                                adapter.registerAdapterDataObserver(new C94385ag9(adapter, c93499aRr));
                            }
                            c0cm.LIZIZ(new C94386agA(c93499aRr));
                            C94364afo c94364afo6 = this.LJLILLLLZI;
                            if (c94364afo6 != null) {
                                C94090abO c94090abO = c94364afo6.LJLJJL;
                                C94344afU c94344afU = new C94344afU(this);
                                c94090abO.getClass();
                                ((ArrayList) c94090abO.LJLIL).add(c94344afU);
                                int i2 = c94090abO.LJLILLLLZI;
                                if (i2 >= 1 && i2 <= c94090abO.LJLJJL.getChildCount() - 2 && (childAt = c94090abO.LJLJJL.getChildAt(c94090abO.LJLILLLLZI)) != null) {
                                    c94344afU.LIZIZ(c94090abO.LJLILLLLZI - 1, childAt);
                                }
                                C94364afo c94364afo7 = this.LJLILLLLZI;
                                if (c94364afo7 != null) {
                                    TextView textView = c94364afo7.LJLJI;
                                    o.LJIIIIZZ(textView, "binding.btDone");
                                    textView.setBackground(new C93788aWW());
                                    C94364afo c94364afo8 = this.LJLILLLLZI;
                                    if (c94364afo8 != null) {
                                        TextView textView2 = c94364afo8.LJLJI;
                                        o.LJIIIIZZ(textView2, "binding.btDone");
                                        C93750aVu.LIZ(textView2, 800L, new IDqS419S0100000_42(this, 107));
                                        C94364afo c94364afo9 = this.LJLILLLLZI;
                                        if (c94364afo9 != null) {
                                            TextView textView3 = c94364afo9.LJLILLLLZI;
                                            o.LJIIIIZZ(textView3, "binding.btCancel");
                                            textView3.setBackground(new C93788aWW());
                                            C94364afo c94364afo10 = this.LJLILLLLZI;
                                            if (c94364afo10 != null) {
                                                TextView textView4 = c94364afo10.LJLILLLLZI;
                                                o.LJIIIIZZ(textView4, "binding.btCancel");
                                                C93750aVu.LIZ(textView4, 800L, new IDqS419S0100000_42(this, 108));
                                                Al();
                                                xl().LJLJI.LIZ.observe(getViewLifecycleOwner(), new IDObserverS227S0100000_42(this, 39));
                                                xl().LJLILLLLZI.LIZ.observe(getViewLifecycleOwner(), new IDObserverS227S0100000_42(this, 40));
                                                xl().LJLJJI.LIZ.observe(getViewLifecycleOwner(), new IDObserverS227S0100000_42(this, 41));
                                                C94364afo c94364afo11 = this.LJLILLLLZI;
                                                if (c94364afo11 != null) {
                                                    ConstraintLayout constraintLayout2 = c94364afo11.LJLIL;
                                                    o.LJIIIIZZ(constraintLayout2, "binding.root");
                                                    ViewTreeObserverOnPreDrawListenerC16840lM.LIZ(constraintLayout2, new IDRunnableS92S0100000_42(constraintLayout2, 0));
                                                    return;
                                                }
                                                o.LJIJI("binding");
                                                throw null;
                                            }
                                            o.LJIJI("binding");
                                            throw null;
                                        }
                                        o.LJIJI("binding");
                                        throw null;
                                    }
                                    o.LJIJI("binding");
                                    throw null;
                                }
                                o.LJIJI("binding");
                                throw null;
                            }
                            o.LJIJI("binding");
                            throw null;
                        }
                        o.LJIJI("binding");
                        throw null;
                    }
                    o.LJIJI("binding");
                    throw null;
                }
                o.LJIJI("binding");
                throw null;
            }
            o.LJIJI("binding");
            throw null;
        }
        o.LJIJI("binding");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.dvk, viewGroup, false);
        int i = R.id.nlt;
        TextView textView = (TextView) LLLLIILL.findViewById(R.id.nlt);
        if (textView != null) {
            i = R.id.nlu;
            TextView textView2 = (TextView) LLLLIILL.findViewById(R.id.nlu);
            if (textView2 != null) {
                i = R.id.g8a;
                FrameLayout frameLayout = (FrameLayout) LLLLIILL.findViewById(R.id.g8a);
                if (frameLayout != null) {
                    i = R.id.npg;
                    C94090abO c94090abO = (C94090abO) LLLLIILL.findViewById(R.id.npg);
                    if (c94090abO != null) {
                        i = R.id.npu;
                        TextView textView3 = (TextView) LLLLIILL.findViewById(R.id.npu);
                        if (textView3 != null) {
                            i = R.id.nqb;
                            C93499aRr c93499aRr = (C93499aRr) LLLLIILL.findViewById(R.id.nqb);
                            if (c93499aRr != null) {
                                i = R.id.nqk;
                                C0CM c0cm = (C0CM) LLLLIILL.findViewById(R.id.nqk);
                                if (c0cm != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) LLLLIILL;
                                    this.LJLILLLLZI = new C94364afo(constraintLayout, textView, textView2, frameLayout, c94090abO, textView3, c93499aRr, c0cm);
                                    constraintLayout.setPadding(0, KL2.LJIIL(requireContext()), 0, 0);
                                    C94364afo c94364afo = this.LJLILLLLZI;
                                    C29S c29s = null;
                                    if (c94364afo != null) {
                                        ConstraintLayout constraintLayout2 = c94364afo.LJLIL;
                                        o.LJIIIIZZ(constraintLayout2, "binding.root");
                                        try {
                                            ViewTreeLifecycleOwner.set(constraintLayout2, getViewLifecycleOwner());
                                            ViewTreeViewModelStoreOwner.set(constraintLayout2, this);
                                            C10A.LIZIZ(constraintLayout2, this);
                                            ActivityC45651qj mo49getActivity = mo49getActivity();
                                            if (mo49getActivity instanceof C29S) {
                                                c29s = (C29S) mo49getActivity;
                                            }
                                            C90903hW.LIZ(c29s);
                                            C3C5.m7constructorimpl(C76800UCe.LIZ);
                                        } catch (Throwable th) {
                                            C3C5.m7constructorimpl(C141335gf.LIZ(th));
                                        }
                                        return constraintLayout2;
                                    }
                                    o.LJIJI("binding");
                                    throw null;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(LLLLIILL.getResources().getResourceName(i)));
    }
}
