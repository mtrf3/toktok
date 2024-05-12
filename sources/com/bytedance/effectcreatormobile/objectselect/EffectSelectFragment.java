package com.bytedance.effectcreatormobile.objectselect;

import X.ActivityC45651qj;
import X.C03880Dg;
import X.C10A;
import X.C113554cx;
import X.C141335gf;
import X.C16880lQ;
import X.C221108m2;
import X.C29S;
import X.C3C5;
import X.C51029K0z;
import X.C62822Ol8;
import X.C65300Pk0;
import X.C76800UCe;
import X.C90903hW;
import X.C93410aQQ;
import X.C93625aTt;
import X.C93670aUc;
import X.C93729aVZ;
import X.C93742aVm;
import X.C93745aVp;
import X.C93750aVu;
import X.C93829aXB;
import X.C93970aZS;
import X.C93971aZT;
import X.C93977aZZ;
import X.C94033aaT;
import X.C94040aaa;
import X.C94092abQ;
import X.C94213adN;
import X.C94545aij;
import X.C94963apT;
import X.InterfaceC88472Yns;
import X.InterfaceC93411aQR;
import X.OSZ;
import X.RunnableC93754aVy;
import X.XKX;
import Y.IDObserverS227S0100000_42;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.effectcreatormobile.ckeapi.api.CameraApi;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.statistic.StatisticReporter;
import com.bytedance.effectcreatormobile.objectselect.api.IEffectDataResProvider;
import com.bytedance.effectcreatormobile.objectselect.viewmodel.EffectLibViewModel;
import com.bytedance.news.common.service.manager.IService;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;
import com.ugc.effectcreator.foundation.bottomdrawerviewpager.BottomDrawerFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.IDqS419S0100000_42;
import kotlin.jvm.internal.IDqS423S0100000_42;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class EffectSelectFragment extends BottomDrawerFragment {
    public static final /* synthetic */ int LJLLI = 0;
    public C94040aaa LJLILLLLZI;
    public final C62822Ol8 LJLJI = C93745aVp.LIZJ(this, EffectLibViewModel.class);
    public final C94092abQ LJLJJI = new C94092abQ(this);
    public LinearLayoutManager LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public final CameraApi LJLJLJ;
    public final InterfaceC93411aQR LJLJLLL;
    public final C62822Ol8 LJLL;

    public final EffectLibViewModel wl() {
        return (EffectLibViewModel) this.LJLJI.getValue();
    }

    public final void xl() {
        this.LJLJLLL.LIZIZ();
        EffectLibViewModel wl = wl();
        IDqS419S0100000_42 iDqS419S0100000_42 = new IDqS419S0100000_42(this, 123);
        wl.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        ((ArrayList) wl.LJLIL).add(iDqS419S0100000_42);
        C93625aTt c93625aTt = new C93625aTt(wl, iDqS419S0100000_42);
        IEffectDataResProvider LIZ = C93977aZZ.LIZ();
        if (LIZ != null) {
            LIZ.getResourceList(new C94213adN(wl, c93625aTt, currentTimeMillis));
            return;
        }
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) c93625aTt.get();
        if (interfaceC88472Yns == null) {
            return;
        }
        interfaceC88472Yns.invoke(Boolean.FALSE);
    }

    public EffectSelectFragment() {
        IService iService;
        C93970aZS LIZ = C93971aZT.LIZ();
        if (LIZ != null) {
            iService = (IService) LIZ.LIZ(CameraApi.class);
        } else {
            iService = null;
        }
        this.LJLJLJ = (CameraApi) iService;
        this.LJLJLLL = C93410aQQ.LIZJ().providePageLoadingView();
        this.LJLL = C221108m2.LIZIZ(new IDqS423S0100000_42(this, 31));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        String str;
        super.onDestroy();
        StatisticReporter LIZ = C93670aUc.LIZ();
        if (LIZ != null) {
            OSZ[] oszArr = new OSZ[2];
            Bundle arguments = getArguments();
            if (arguments == null || (str = arguments.getString("enter_from_key")) == null) {
                str = "";
            }
            oszArr[0] = new OSZ("add_enter_from", str);
            oszArr[1] = new OSZ("is_ame_data", "1");
            LIZ.onEvent("effect_sheet_exit", C113554cx.LJJL(oszArr));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        ((ArrayList) wl().LJLIL).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.LJLJL = false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C94963apT(this, null), 3);
    }

    public final void onEventClickFeatureItem(C94033aaT c94033aaT) {
        StatisticReporter LIZ = C93670aUc.LIZ();
        if (LIZ != null) {
            LIZ.onEvent("feature_click", C113554cx.LJJL(new OSZ("feature_id", c94033aaT.LJ), new OSZ("feature_category", c94033aaT.LIZLLL)));
        }
    }

    public final void onEventClickTemplateItem(C94033aaT c94033aaT) {
        StatisticReporter LIZ = C93670aUc.LIZ();
        if (LIZ != null) {
            LIZ.onEvent("addsheet_template_click", C51029K0z.LJJIIZI(new OSZ("template_id", c94033aaT.LJ)));
        }
    }

    @Override // com.ugc.effectcreator.foundation.bottomdrawerviewpager.BottomDrawerFragment, androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "-5515148118117678995");
        if (c03880Dg.LIZJ(10501, "com/bytedance/effectcreatormobile/objectselect/EffectSelectFragment", "onHiddenChanged", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10501, "com/bytedance/effectcreatormobile/objectselect/EffectSelectFragment", "onHiddenChanged", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.onHiddenChanged(z);
        if (!z && isResumed()) {
            this.LJLJL = false;
        }
        c03880Dg.LIZIZ(10501, "com/bytedance/effectcreatormobile/objectselect/EffectSelectFragment", "onHiddenChanged", null, objArr, this, c65300Pk0, true);
    }

    @Override // com.ugc.effectcreator.foundation.bottomdrawerviewpager.BottomDrawerFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            z = arguments.getBoolean("sub_page_style");
        } else {
            z = false;
        }
        this.LJLJJLL = z;
        if (z) {
            C94040aaa c94040aaa = this.LJLILLLLZI;
            if (c94040aaa != null) {
                C93729aVZ.LJI(c94040aaa.LJLILLLLZI);
            } else {
                o.LJIJI("binding");
                throw null;
            }
        } else {
            C94040aaa c94040aaa2 = this.LJLILLLLZI;
            if (c94040aaa2 != null) {
                ImageView imageView = c94040aaa2.LJLILLLLZI;
                o.LJIIIIZZ(imageView, "binding.ivBack");
                imageView.setVisibility(8);
            } else {
                o.LJIJI("binding");
                throw null;
            }
        }
        C94040aaa c94040aaa3 = this.LJLILLLLZI;
        if (c94040aaa3 != null) {
            ImageView imageView2 = c94040aaa3.LJLILLLLZI;
            if (imageView2 != null) {
                int LIZ = (int) C93742aVm.LIZ(15.0f);
                Object parent = imageView2.getParent();
                if (parent != null) {
                    View view2 = (View) parent;
                    view2.post(new RunnableC93754aVy(imageView2, view2, LIZ));
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                }
            }
            C94040aaa c94040aaa4 = this.LJLILLLLZI;
            if (c94040aaa4 != null) {
                ImageView imageView3 = c94040aaa4.LJLILLLLZI;
                o.LJIIIIZZ(imageView3, "binding.ivBack");
                C93750aVu.LIZIZ(imageView3, new IDqS419S0100000_42(this, 121));
                requireContext();
                this.LJLJJL = new LinearLayoutManager();
                C94040aaa c94040aaa5 = this.LJLILLLLZI;
                if (c94040aaa5 != null) {
                    C94545aij c94545aij = c94040aaa5.LJLJJI;
                    o.LJIIIIZZ(c94545aij, "binding.rvContainer");
                    LinearLayoutManager linearLayoutManager = this.LJLJJL;
                    if (linearLayoutManager != null) {
                        c94545aij.setLayoutManager(linearLayoutManager);
                        C94040aaa c94040aaa6 = this.LJLILLLLZI;
                        if (c94040aaa6 != null) {
                            C94545aij c94545aij2 = c94040aaa6.LJLJJI;
                            o.LJIIIIZZ(c94545aij2, "binding.rvContainer");
                            c94545aij2.setAdapter(this.LJLJJI);
                            InterfaceC93411aQR interfaceC93411aQR = this.LJLJLLL;
                            LayoutInflater LLZIL = C16880lQ.LLZIL(getContext());
                            C94040aaa c94040aaa7 = this.LJLILLLLZI;
                            if (c94040aaa7 != null) {
                                FrameLayout frameLayout = c94040aaa7.LJLJI;
                                o.LJIIIIZZ(frameLayout, "binding.loadingContainer");
                                interfaceC93411aQR.LIZ(LLZIL, frameLayout);
                                C93829aXB LJI = CKEffectEditorContext.LJI();
                                if (LJI != null && LJI.LJIIIZ()) {
                                    C94040aaa c94040aaa8 = this.LJLILLLLZI;
                                    if (c94040aaa8 != null) {
                                        c94040aaa8.LJLJJL.setText(R.string.hs);
                                        C94040aaa c94040aaa9 = this.LJLILLLLZI;
                                        if (c94040aaa9 != null) {
                                            TextView textView = c94040aaa9.LJLJJL;
                                            o.LJIIIIZZ(textView, "binding.tvTitle");
                                            textView.setSelected(true);
                                        } else {
                                            o.LJIJI("binding");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("binding");
                                        throw null;
                                    }
                                }
                                wl().LJLILLLLZI.LIZ.observe(getViewLifecycleOwner(), new IDObserverS227S0100000_42(this, 42));
                                xl();
                                return;
                            }
                            o.LJIJI("binding");
                            throw null;
                        }
                        o.LJIJI("binding");
                        throw null;
                    }
                    o.LJIJI("layoutManager");
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

    public static void Al(boolean z, Long l, String str) {
        String str2;
        OSZ[] oszArr = new OSZ[2];
        oszArr[0] = new OSZ("feature_id", str);
        if (z) {
            str2 = "success";
        } else {
            str2 = "fail";
        }
        oszArr[1] = new OSZ("deliver_result", str2);
        Map<String, String> LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
        if (l != null) {
            LJJLIIIIJ.put("time_cost", String.valueOf(l.longValue()));
        }
        StatisticReporter LIZ = C93670aUc.LIZ();
        if (LIZ != null) {
            LIZ.onEvent("server_deliver_feature", LJJLIIIIJ);
        }
    }

    public static void Dl(C94033aaT c94033aaT, boolean z, Long l) {
        String str;
        OSZ[] oszArr = new OSZ[2];
        oszArr[0] = new OSZ("template_id", c94033aaT.LJ);
        if (z) {
            str = "success";
        } else {
            str = "fail";
        }
        oszArr[1] = new OSZ("deliver_result", str);
        Map<String, String> LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
        if (l != null) {
            LJJLIIIIJ.put("time_cost", String.valueOf(l.longValue()));
        }
        StatisticReporter LIZ = C93670aUc.LIZ();
        if (LIZ != null) {
            LIZ.onEvent("server_deliver_template", LJJLIIIIJ);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.dvc, viewGroup, false);
        int i = R.id.eys;
        ImageView imageView = (ImageView) LLLLIILL.findViewById(R.id.eys);
        if (imageView != null) {
            i = R.id.no1;
            if (LLLLIILL.findViewById(R.id.no1) != null) {
                i = R.id.g8a;
                FrameLayout frameLayout = (FrameLayout) LLLLIILL.findViewById(R.id.g8a);
                if (frameLayout != null) {
                    i = R.id.j9u;
                    C94545aij c94545aij = (C94545aij) LLLLIILL.findViewById(R.id.j9u);
                    if (c94545aij != null) {
                        i = R.id.npn;
                        if (LLLLIILL.findViewById(R.id.npn) != null) {
                            i = R.id.npo;
                            if (LLLLIILL.findViewById(R.id.npo) != null) {
                                i = R.id.npp;
                                if (LLLLIILL.findViewById(R.id.npp) != null) {
                                    i = R.id.npy;
                                    if (LLLLIILL.findViewById(R.id.npy) != null) {
                                        i = R.id.npz;
                                        if (LLLLIILL.findViewById(R.id.npz) != null) {
                                            i = R.id.mo6;
                                            TextView textView = (TextView) LLLLIILL.findViewById(R.id.mo6);
                                            if (textView != null) {
                                                ConstraintLayout constraintLayout = (ConstraintLayout) LLLLIILL;
                                                this.LJLILLLLZI = new C94040aaa(constraintLayout, imageView, frameLayout, c94545aij, textView);
                                                try {
                                                    ViewTreeLifecycleOwner.set(constraintLayout, getViewLifecycleOwner());
                                                    ViewTreeViewModelStoreOwner.set(constraintLayout, this);
                                                    C10A.LIZIZ(constraintLayout, this);
                                                    ActivityC45651qj mo49getActivity = mo49getActivity();
                                                    if (mo49getActivity instanceof C29S) {
                                                        c29s = (C29S) mo49getActivity;
                                                    } else {
                                                        c29s = null;
                                                    }
                                                    C90903hW.LIZ(c29s);
                                                    C3C5.m7constructorimpl(C76800UCe.LIZ);
                                                } catch (Throwable th) {
                                                    C3C5.m7constructorimpl(C141335gf.LIZ(th));
                                                }
                                                return constraintLayout;
                                            }
                                        }
                                    }
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
