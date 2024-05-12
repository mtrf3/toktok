package com.ugc.effectcreator.layer;

import X.AbstractC030109x;
import X.AbstractC28931Bp;
import X.AbstractC94471ahX;
import X.ActivityC45651qj;
import X.C10A;
import X.C113554cx;
import X.C141335gf;
import X.C16330kX;
import X.C16880lQ;
import X.C221108m2;
import X.C29S;
import X.C3C5;
import X.C51029K0z;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C76800UCe;
import X.C90903hW;
import X.C93408aQO;
import X.C93425aQf;
import X.C93651aUJ;
import X.C93670aUc;
import X.C93677aUj;
import X.C93722aVS;
import X.C93723aVT;
import X.C93738aVi;
import X.C93792aWa;
import X.C93829aXB;
import X.C93858aXe;
import X.C93939aYx;
import X.C93971aZT;
import X.C94010aa6;
import X.C94172aci;
import X.C94173acj;
import X.C94175acl;
import X.C94176acm;
import X.C94285aeX;
import X.C94287aeZ;
import X.C94289aeb;
import X.C94290aec;
import X.C94291aed;
import X.C94342afS;
import X.C94614ajq;
import X.C94855anj;
import X.EnumC93638aU6;
import X.EnumC93712aVI;
import X.InterfaceC65784Pro;
import X.InterfaceC93966aZO;
import X.InterfaceC94376ag0;
import X.OSZ;
import X.ViewOnClickListenerC13880ga;
import Y.IDCListenerS139S0100000_42;
import Y.IDCListenerS149S0200000_42;
import Y.IDCListenerS210S0100000_42;
import Y.IDObserverS227S0100000_42;
import Y.IDUListenerS171S0200000_42;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.effectcreatormobile.ckeapi.api.ICameraRender;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.statistic.StatisticReporter;
import com.bytedance.effectcreatormobile.ckeapi.api.main.IAutoChangeModel;
import com.bytedance.effectcreatormobile.ckeapi.api.main.IMain;
import com.bytedance.ies.effectcreator.swig.Canvas;
import com.bytedance.ies.effectcreator.swig.Feature;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;
import com.ugc.effectcreator.foundation.widgets.hook.WrapContentLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.IDqS419S0100000_42;
import kotlin.jvm.internal.IDqS423S0100000_42;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class EffectLayerEditorFragment extends Fragment implements InterfaceC93966aZO {
    public RecyclerView LJLIL;
    public CheckBox LJLILLLLZI;
    public LinearLayout LJLJI;
    public C94176acm LJLJJI;
    public final C94173acj LJLJJL = new C94173acj(this);
    public final ViewModelLazy LJLJJLL = C93408aQO.LIZ(this, C65352Pkq.LIZ(LayerViewModel.class), new IDqS423S0100000_42((InterfaceC65784Pro) new IDqS423S0100000_42((Fragment) this, 112), 113), null);
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(C94614ajq.LJLIL);
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new IDqS423S0100000_42(this, 114));
    public C93738aVi LJLJLLL;
    public C93792aWa LJLL;
    public boolean LJLLI;

    public final C94855anj Al() {
        return (C94855anj) this.LJLJLJ.getValue();
    }

    public final List<AbstractC94471ahX<InterfaceC94376ag0>> getData() {
        return (List) this.LJLJL.getValue();
    }

    public final LayerViewModel xl() {
        return (LayerViewModel) this.LJLJJLL.getValue();
    }

    @Override // X.InterfaceC93966aZO
    public final boolean LJIIJ() {
        wl();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        StatisticReporter LIZ = C93670aUc.LIZ();
        if (LIZ != null) {
            LIZ.onEvent("layer_back");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        CKEffectEditorContext.LJIIL(this.LJLJJL);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        xl().iv0();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        C93677aUj.LJI(1);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        C93677aUj.LJII(1);
    }

    public final void wl() {
        C93651aUJ<C94291aed> c93651aUJ;
        C94855anj Al = Al();
        if (Al != null && (c93651aUJ = Al.LJLLJ) != null) {
            c93651aUJ.dismiss();
        }
        if (this.LJLLI) {
            return;
        }
        LinearLayout linearLayout = this.LJLJI;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
            this.LJLLI = true;
            float[] fArr = new float[2];
            fArr[0] = 0.0f;
            if (this.LJLJJI != null) {
                fArr[1] = r0.getWidth();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                ofFloat.setInterpolator(C94010aa6.LIZ());
                ofFloat.addUpdateListener(new IDUListenerS171S0200000_42(ofFloat, this, 0));
                ofFloat.setDuration(350L);
                ofFloat.addListener(new C94172aci(this));
                ofFloat.start();
                return;
            }
            o.LJIJI("rootLayout");
            throw null;
        }
        o.LJIJI("checkBoxContainer");
        throw null;
    }

    public static void Gl(long j) {
        Feature LJFF;
        C93829aXB LJI;
        Canvas LJ;
        C93829aXB LJI2 = CKEffectEditorContext.LJI();
        if (LJI2 != null && (LJFF = LJI2.LJFF(j)) != null && (LJI = CKEffectEditorContext.LJI()) != null && (LJ = LJI.LJ()) != null) {
            LJ.stopAnimationWithFeatureID(LJFF.id());
        }
    }

    public static final /* synthetic */ CheckBox vl(EffectLayerEditorFragment effectLayerEditorFragment) {
        CheckBox checkBox = effectLayerEditorFragment.LJLILLLLZI;
        if (checkBox != null) {
            return checkBox;
        }
        o.LJIJI("checkBox");
        throw null;
    }

    public final void onEventLayerDetailsClose(String str) {
        StatisticReporter LIZ = C93670aUc.LIZ();
        if (LIZ != null) {
            LIZ.onEvent("layer_objectdetail_close", C51029K0z.LJJIIZI(new OSZ("close_method", str)));
        }
    }

    public final void onEventObjectAction(String str) {
        StatisticReporter LIZ = C93670aUc.LIZ();
        if (LIZ != null) {
            LIZ.onEvent("object_action", C113554cx.LJJL(new OSZ("action_type", str), new OSZ("current_page_name", "layer")));
        }
    }

    public final void Dl(long j, EnumC93638aU6 enumC93638aU6) {
        IAutoChangeModel LIZ;
        xl().LJLJI.set(false);
        IDqS419S0100000_42 iDqS419S0100000_42 = new IDqS419S0100000_42(this, 43);
        int i = C93858aXe.LIZ[enumC93638aU6.ordinal()];
        if (i != 1) {
            if (i != 2 || (LIZ = C93722aVS.LIZ()) == null) {
                return;
            }
            LIZ.autoChangeModelWhenCopy(j, iDqS419S0100000_42);
            return;
        }
        IAutoChangeModel LIZ2 = C93722aVS.LIZ();
        if (LIZ2 == null) {
            return;
        }
        LIZ2.autoChangeModelWhenLayerSelect(j, iDqS419S0100000_42);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        LiveData<C94342afS> modelPathChangeData;
        LiveData<Rect> previewLocationInWindow;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        LayerImpl LIZ = C93425aQf.LIZ();
        if (LIZ != null) {
            LIZ.updatePageStatus(EnumC93712aVI.SHOW);
        }
        View findViewById = view.findViewById(R.id.nnx);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.layer_root)");
        this.LJLJJI = (C94176acm) findViewById;
        View findViewById2 = view.findViewById(R.id.nok);
        o.LJIIIIZZ(findViewById2, "view.findViewById<RecyclerView>(R.id.rcv_layer)");
        this.LJLIL = (RecyclerView) findViewById2;
        View findViewById3 = view.findViewById(R.id.b_o);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.checkbox)");
        this.LJLILLLLZI = (CheckBox) findViewById3;
        View findViewById4 = view.findViewById(R.id.b_p);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.checkbox_container)");
        this.LJLJI = (LinearLayout) findViewById4;
        boolean z = true;
        if (C16330kX.LIZJ(view) && !view.isLayoutRequested()) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(view.getWidth(), 0.0f);
            ofFloat.setInterpolator(C94010aa6.LIZ());
            ofFloat.addUpdateListener(new IDUListenerS171S0200000_42(ofFloat, view, 2));
            ofFloat.addListener(new C94175acl(this, view));
            ofFloat.setDuration(400L);
            ofFloat.start();
        } else {
            view.addOnLayoutChangeListener(new IDCListenerS149S0200000_42(this, view, 0));
        }
        IMain LIZ2 = C93723aVT.LIZ();
        if (LIZ2 != null && (previewLocationInWindow = LIZ2.getPreviewLocationInWindow()) != null) {
            previewLocationInWindow.observe(getViewLifecycleOwner(), new IDObserverS227S0100000_42(this, 5));
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            this.LJLJLLL = new C93738aVi(mo49getActivity, getLifecycle());
        }
        C94176acm c94176acm = this.LJLJJI;
        if (c94176acm != null) {
            c94176acm.setOnDispatchTouchListener(new C94289aeb(this));
            C94176acm c94176acm2 = this.LJLJJI;
            if (c94176acm2 != null) {
                c94176acm2.setOnSlideBackListener(new C94290aec(this));
                RecyclerView recyclerView = this.LJLIL;
                if (recyclerView != null) {
                    Context requireContext = requireContext();
                    o.LJIIIIZZ(requireContext, "requireContext()");
                    recyclerView.setLayoutManager(new WrapContentLinearLayoutManager(requireContext));
                    RecyclerView recyclerView2 = this.LJLIL;
                    if (recyclerView2 != null) {
                        recyclerView2.setAdapter(Al());
                        RecyclerView recyclerView3 = this.LJLIL;
                        if (recyclerView3 != null) {
                            AbstractC030109x itemAnimator = recyclerView3.getItemAnimator();
                            if (!(itemAnimator instanceof AbstractC28931Bp)) {
                                itemAnimator = null;
                            }
                            AbstractC28931Bp abstractC28931Bp = (AbstractC28931Bp) itemAnimator;
                            if (abstractC28931Bp != null) {
                                abstractC28931Bp.LJI = false;
                            }
                            CheckBox checkBox = this.LJLILLLLZI;
                            if (checkBox != null) {
                                checkBox.setOnCheckedChangeListener(new IDCListenerS210S0100000_42(this, 1));
                                CheckBox checkBox2 = this.LJLILLLLZI;
                                if (checkBox2 != null) {
                                    checkBox2.setOnClickListener(new ViewOnClickListenerC13880ga(new IDCListenerS139S0100000_42(this, 18)));
                                    CheckBox checkBox3 = this.LJLILLLLZI;
                                    if (checkBox3 != null) {
                                        LayerImpl LIZ3 = C93425aQf.LIZ();
                                        if (LIZ3 != null) {
                                            z = LIZ3.getLayerDetailStatus();
                                        }
                                        checkBox3.setChecked(z);
                                        LinearLayout linearLayout = this.LJLJI;
                                        if (linearLayout != null) {
                                            C16880lQ.LJIIZILJ(linearLayout, new IDCListenerS139S0100000_42(this, 19));
                                            C94173acj onDataChange = this.LJLJJL;
                                            o.LJIIIZ(onDataChange, "onDataChange");
                                            CKEffectEditorContext.LJIILIIL.add(onDataChange);
                                            xl().LJLILLLLZI.LIZ.observe(getViewLifecycleOwner(), new IDObserverS227S0100000_42(this, 21));
                                            CKEffectEditorContext.LJIIIIZZ.observe(getViewLifecycleOwner(), new IDObserverS227S0100000_42(this, 22));
                                            C94855anj Al = Al();
                                            C94285aeX c94285aeX = new C94285aeX(this);
                                            Al.getClass();
                                            Al.LJLJLJ = c94285aeX;
                                            RecyclerView recyclerView4 = this.LJLIL;
                                            if (recyclerView4 != null) {
                                                recyclerView4.LJII(new C94287aeZ(this), -1);
                                                ICameraRender iCameraRender = (ICameraRender) C93971aZT.LIZ().LIZ(ICameraRender.class);
                                                if (iCameraRender != null && (modelPathChangeData = iCameraRender.getModelPathChangeData()) != null) {
                                                    modelPathChangeData.observe(getViewLifecycleOwner(), new IDObserverS227S0100000_42(this, 23));
                                                }
                                                C93939aYx.LIZ().getRenderModeData().observe(getViewLifecycleOwner(), new IDObserverS227S0100000_42(this, 24));
                                                StatisticReporter LIZ4 = C93670aUc.LIZ();
                                                if (LIZ4 != null) {
                                                    LIZ4.onEvent("layer_enter");
                                                    return;
                                                }
                                                return;
                                            }
                                            o.LJIJI("recycleView");
                                            throw null;
                                        }
                                        o.LJIJI("checkBoxContainer");
                                        throw null;
                                    }
                                    o.LJIJI("checkBox");
                                    throw null;
                                }
                                o.LJIJI("checkBox");
                                throw null;
                            }
                            o.LJIJI("checkBox");
                            throw null;
                        }
                        o.LJIJI("recycleView");
                        throw null;
                    }
                    o.LJIJI("recycleView");
                    throw null;
                }
                o.LJIJI("recycleView");
                throw null;
            }
            o.LJIJI("rootLayout");
            throw null;
        }
        o.LJIJI("rootLayout");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        C29S c29s = null;
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.dw7, inflater, null);
        o.LJIIIIZZ(LLLZIIL, "inflater.inflate(R.layou…_effect_layer_edit, null)");
        try {
            ViewTreeLifecycleOwner.set(LLLZIIL, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LLLZIIL, this);
            C10A.LIZIZ(LLLZIIL, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LLLZIIL;
    }
}
