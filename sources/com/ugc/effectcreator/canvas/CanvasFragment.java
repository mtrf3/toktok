package com.ugc.effectcreator.canvas;

import X.AbstractC93937aYv;
import X.ActivityC45651qj;
import X.C10A;
import X.C113554cx;
import X.C141335gf;
import X.C16330kX;
import X.C16880lQ;
import X.C29S;
import X.C32I;
import X.C3C5;
import X.C61878OQg;
import X.C65352Pkq;
import X.C76800UCe;
import X.C90903hW;
import X.C93408aQO;
import X.C93601aTV;
import X.C93603aTX;
import X.C93670aUc;
import X.C93714aVK;
import X.C93723aVT;
import X.C93727aVX;
import X.C93729aVZ;
import X.C93742aVm;
import X.C93825aX7;
import X.C93829aXB;
import X.C93939aYx;
import X.C93991aZn;
import X.C94002aZy;
import X.C94034aaU;
import X.C94140acC;
import X.C94141acD;
import X.C94142acE;
import X.C94209adJ;
import X.C94211adL;
import X.C94212adM;
import X.C94252ae0;
import X.C94279aeR;
import X.C94338afO;
import X.C94362afm;
import X.C94363afn;
import X.C94458ahK;
import X.C94613ajp;
import X.EnumC93697aV3;
import X.EnumC93715aVL;
import X.EnumC93725aVV;
import X.InterfaceC65784Pro;
import X.InterfaceC93980aZc;
import X.ORZ;
import X.OSZ;
import X.ViewTreeObserverOnPreDrawListenerC16840lM;
import X.X1D;
import Y.IDCListenerS262S0100000_42;
import Y.IDRunnableS33S0200000_42;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Size;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.effectcreatormobile.ckeapi.api.ICameraRender;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.statistic.StatisticReporter;
import com.bytedance.effectcreatormobile.ckeapi.api.main.IMain;
import com.bytedance.ies.effectcreator.swig.AssetImageTexture;
import com.bytedance.ies.effectcreator.swig.AssetType;
import com.bytedance.ies.effectcreator.swig.Canvas;
import com.bytedance.ies.effectcreator.swig.EESize;
import com.bytedance.ies.effectcreator.swig.Feature;
import com.bytedance.ies.effectcreator.swig.Project;
import com.bytedance.ies.effectcreator.swig.UIAnnotationAssetTexture;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.IDqS423S0100000_42;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public class CanvasFragment extends Fragment {
    public boolean LJLIL;
    public C94338afO LJLILLLLZI;
    public InterfaceC93980aZc LJLJJI;
    public final C93714aVK LJLJI = new C93714aVK();
    public final C94140acC LJLJJL = new C94140acC(this);
    public final ViewModelLazy LJLJJLL = C93408aQO.LIZ(this, C65352Pkq.LIZ(CanvasViewModel.class), new IDqS423S0100000_42((InterfaceC65784Pro) new IDqS423S0100000_42(this, 108), 109), null);
    public final C94141acD LJLJL = new C94141acD(this);

    /* JADX WARN: Multi-variable type inference failed */
    public static Feature xl() {
        Long l = (Long) CKEffectEditorContext.LJIIIIZZ.getValue();
        if (l != null) {
            long longValue = l.longValue();
            C93829aXB LJI = CKEffectEditorContext.LJI();
            if (LJI != null) {
                return LJI.LJFF(longValue);
            }
        }
        return null;
    }

    public final void Il() {
        C94613ajp c94613ajp;
        C93603aTX c93603aTX;
        C93603aTX c93603aTX2;
        C94363afn LJFF;
        C93603aTX c93603aTX3;
        C93603aTX c93603aTX4;
        C94279aeR c94279aeR = CKEffectEditorContext.LIZJ;
        if (c94279aeR == null || c94279aeR.getEffectHandle() == 0) {
            return;
        }
        ArrayList arrayList = null;
        if (this.LJLJJI == null || !Al()) {
            C94338afO c94338afO = this.LJLILLLLZI;
            if (c94338afO != null && (c93603aTX2 = c94338afO.LJLJJI) != null) {
                EnumC93697aV3 shape = EnumC93697aV3.RECTANGLE;
                o.LJIIIZ(shape, "shape");
                ArrayList arrayList2 = new ArrayList();
                c93603aTX2.LJLJLJ = null;
                ArrayList arrayList3 = new ArrayList(C32I.LJJL(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    C94211adL c94211adL = (C94211adL) it.next();
                    float f = c94211adL.LJLIL;
                    float f2 = c93603aTX2.LJLLILLLL;
                    if (f >= f2) {
                        f2 = f;
                    }
                    float f3 = c94211adL.LJLILLLLZI;
                    float f4 = c93603aTX2.LJLLJ;
                    if (f3 >= f4) {
                        f4 = f3;
                    }
                    arrayList3.add(C94211adL.L(c94211adL, f2, f4, 0.0f, 0.0f, 0.0f, 28));
                }
                c93603aTX2.LJLL = arrayList3;
                c93603aTX2.LJLLI = shape;
                c93603aTX2.LIZIZ();
            }
            C94338afO c94338afO2 = this.LJLILLLLZI;
            if (c94338afO2 != null && (c93603aTX = c94338afO2.LJLJJI) != null) {
                c93603aTX.LIZJ(null, false);
            }
            C94338afO c94338afO3 = this.LJLILLLLZI;
            if (c94338afO3 != null && (c94613ajp = c94338afO3.LJLJI) != null) {
                c94613ajp.setVisibility(4);
                return;
            }
            return;
        }
        Feature xl = xl();
        C94338afO c94338afO4 = this.LJLILLLLZI;
        if (c94338afO4 != null && (c93603aTX4 = c94338afO4.LJLJJI) != null && !c93603aTX4.LJLJJI && c93603aTX4.getTouchMoving()) {
            Kl(xl, null, EnumC93697aV3.RECTANGLE);
        } else {
            if (xl != null) {
                xl.willBeSelected();
            }
            InterfaceC93980aZc interfaceC93980aZc = this.LJLJJI;
            if (interfaceC93980aZc != null && (LJFF = interfaceC93980aZc.LJFF()) != null) {
                C94338afO c94338afO5 = this.LJLILLLLZI;
                if (c94338afO5 != null && (c93603aTX3 = c94338afO5.LJLJJI) != null) {
                    List<C94212adM> list = LJFF.LJLIL;
                    arrayList = new ArrayList(C32I.LJJL(list, 10));
                    Iterator<C94212adM> it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(C94002aZy.LIZJ(it2.next(), c93603aTX3));
                    }
                }
                Kl(xl, arrayList, LJFF.LJLILLLLZI);
            } else {
                Kl(xl, null, EnumC93697aV3.RECTANGLE);
            }
        }
        Jl(xl);
    }

    public static boolean Al() {
        AbstractC93937aYv value = C93939aYx.LIZ().getRenderModeData().getValue();
        if (value != null && C93939aYx.LIZIZ(value)) {
            return true;
        }
        return false;
    }

    public static Canvas vl() {
        C93829aXB LJI = CKEffectEditorContext.LJI();
        if (LJI != null) {
            return LJI.LJ();
        }
        return null;
    }

    public final void Dl() {
        ICameraRender LIZ = C93939aYx.LIZ();
        C94142acE c94142acE = new C94142acE(this);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        o.LJIIIIZZ(viewLifecycleOwner, "viewLifecycleOwner");
        LIZ.onAlgorithmReady(c94142acE, 10, viewLifecycleOwner.getLifecycle());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        StatisticReporter LIZ = C93670aUc.LIZ();
        if (LIZ != null) {
            LIZ.onEvent("canvas_exit");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LJLILLLLZI = null;
        CKEffectEditorContext.LJIIL(this.LJLJL);
        Canvas vl = vl();
        if (vl != null) {
            vl.setAnimationListenerPtr(null);
        }
    }

    public final void Jl(Feature feature) {
        C94613ajp c94613ajp;
        InterfaceC93980aZc interfaceC93980aZc;
        EnumC93725aVV enumC93725aVV;
        boolean z;
        String str;
        C93603aTX c93603aTX;
        InterfaceC93980aZc interfaceC93980aZc2;
        C94363afn LJFF;
        List<C94212adM> list;
        C94212adM c94212adM;
        C94211adL LIZJ;
        C94613ajp c94613ajp2;
        C94613ajp c94613ajp3;
        C94613ajp c94613ajp4;
        C94338afO c94338afO;
        C94613ajp c94613ajp5;
        C94613ajp c94613ajp6;
        Project project;
        Canvas canvasPtr;
        LiveData<EnumC93725aVV> mainPageStatus;
        C94362afm LJ;
        if (feature == null || ((interfaceC93980aZc = this.LJLJJI) != null && (LJ = interfaceC93980aZc.LJ()) != null && LJ.LJLIL)) {
            C94338afO c94338afO2 = this.LJLILLLLZI;
            if (c94338afO2 != null && (c94613ajp = c94338afO2.LJLJI) != null) {
                c94613ajp.setVisibility(4);
                return;
            }
            return;
        }
        IMain LIZ = C93723aVT.LIZ();
        List<C94252ae0> list2 = null;
        if (LIZ != null && (mainPageStatus = LIZ.getMainPageStatus()) != null) {
            enumC93725aVV = mainPageStatus.getValue();
        } else {
            enumC93725aVV = null;
        }
        if (enumC93725aVV == EnumC93725aVV.NARROW) {
            z = true;
        } else {
            z = false;
        }
        ArrayList arrayList = new ArrayList();
        if (z || ((project = CKEffectEditorContext.LIZIZ) != null && (canvasPtr = project.getCanvasPtr()) != null && canvasPtr.isAnimatableWithFeatureID(feature.id()))) {
            str = null;
        } else {
            str = getString(R.string.gz);
        }
        arrayList.add(new C94252ae0(str, Integer.valueOf(R.drawable.dgw), 2, null));
        if (CKEffectEditorContext.LIZ(feature)) {
            arrayList.add(new C94252ae0(null, Integer.valueOf(R.drawable.dgv), 4, Long.valueOf(feature.id().objectId())));
        }
        if (!o.LJ(feature.getSecondPanelType(), "face_stretch_edit_panel") && !o.LJ(feature.getSecondPanelType(), "prefab_select_panel") && !o.LJ(feature.getSecondPanelType(), "face_liquify_edit_panel")) {
            arrayList.add(new C94252ae0(null, Integer.valueOf(R.drawable.dh0), 1, null));
        }
        arrayList.add(new C94252ae0(null, Integer.valueOf(R.drawable.dgu), 0, null));
        C94338afO c94338afO3 = this.LJLILLLLZI;
        if (c94338afO3 != null && (c94613ajp6 = c94338afO3.LJLJI) != null) {
            list2 = c94613ajp6.getDatalist();
        }
        if ((!o.LJ(arrayList, list2)) && (c94338afO = this.LJLILLLLZI) != null && (c94613ajp5 = c94338afO.LJLJI) != null) {
            c94613ajp5.setDatalist(arrayList);
        }
        if (o.LJ(feature.getSecondPanelType(), "face_stretch_edit_panel") || o.LJ(feature.getSecondPanelType(), "prefab_select_panel")) {
            C94338afO c94338afO4 = this.LJLILLLLZI;
            if (c94338afO4 != null && (c94613ajp4 = c94338afO4.LJLJI) != null) {
                c94613ajp4.setVisibility(0);
                return;
            }
            return;
        }
        C94338afO c94338afO5 = this.LJLILLLLZI;
        if (c94338afO5 == null || (c93603aTX = c94338afO5.LJLJJI) == null || (interfaceC93980aZc2 = this.LJLJJI) == null || (LJFF = interfaceC93980aZc2.LJFF()) == null || (list = LJFF.LJLIL) == null || (c94212adM = (C94212adM) ORZ.LJLLLL(list)) == null || (LIZJ = C94002aZy.LIZJ(c94212adM, c93603aTX)) == null) {
            return;
        }
        if (wl(LIZJ.LJLJI, LIZJ.LJLJJI, LIZJ.LJLIL, LIZJ.LJLILLLLZI, LIZJ.LJLJJL) < C93727aVX.LIZIZ(2)) {
            C94338afO c94338afO6 = this.LJLILLLLZI;
            if (c94338afO6 == null || (c94613ajp3 = c94338afO6.LJLJI) == null) {
                return;
            }
            c94613ajp3.setVisibility(0);
            return;
        }
        C94338afO c94338afO7 = this.LJLILLLLZI;
        if (c94338afO7 == null || (c94613ajp2 = c94338afO7.LJLJI) == null) {
            return;
        }
        c94613ajp2.setVisibility(8);
    }

    public final void onEventObjectAction(String str) {
        StatisticReporter LIZ = C93670aUc.LIZ();
        if (LIZ != null) {
            LIZ.onEvent("object_action", C113554cx.LJJL(new OSZ("action_type", str), new OSZ("current_page_name", "canvas")));
        }
    }

    public final boolean Gl(C94211adL c94211adL, C94211adL c94211adL2) {
        float wl = wl(c94211adL.LJLJI, c94211adL.LJLJJI, c94211adL.LJLIL, c94211adL.LJLILLLLZI, c94211adL.LJLJJL);
        float wl2 = wl(c94211adL2.LJLJI, c94211adL2.LJLJJI, c94211adL2.LJLIL, c94211adL2.LJLILLLLZI, c94211adL2.LJLJJL);
        if (wl2 <= 0 || wl2 <= wl) {
            return false;
        }
        return true;
    }

    public final void Ll(double d, double d2) {
        C93601aTV c93601aTV;
        C94362afm LJ;
        C94338afO c94338afO;
        C93601aTV c93601aTV2;
        C94338afO c94338afO2;
        C93601aTV c93601aTV3;
        InterfaceC93980aZc interfaceC93980aZc = this.LJLJJI;
        if (interfaceC93980aZc == null || (LJ = interfaceC93980aZc.LJ()) == null || !LJ.LJLILLLLZI) {
            this.LJLJI.LIZ(EnumC93715aVL.NONE);
            C94338afO c94338afO3 = this.LJLILLLLZI;
            if (c94338afO3 != null && (c93601aTV = c94338afO3.LJLILLLLZI) != null) {
                c93601aTV.postInvalidate();
                return;
            }
            return;
        }
        C93714aVK c93714aVK = this.LJLJI;
        EnumC93715aVL enumC93715aVL = c93714aVK.LIZ;
        double d3 = 0.49f;
        if (d >= d3) {
            double d4 = 0.51f;
            if (d <= d4 && d2 >= d3 && d2 <= d4) {
                c93714aVK.LIZ(EnumC93715aVL.ALL);
            } else if (d <= 0.51f) {
                c93714aVK.LIZ(EnumC93715aVL.X);
            }
            if (this.LJLJI.LIZ != enumC93715aVL && (c94338afO2 = this.LJLILLLLZI) != null && (c93601aTV3 = c94338afO2.LJLILLLLZI) != null) {
                c93601aTV3.postInvalidate();
            }
            if (enumC93715aVL.compareTo(this.LJLJI.LIZ) >= 0 && (c94338afO = this.LJLILLLLZI) != null && (c93601aTV2 = c94338afO.LJLILLLLZI) != null) {
                C93729aVZ.LJFF(c93601aTV2);
                return;
            }
            return;
        }
        if (d2 >= d3 && d2 <= 0.51f) {
            c93714aVK.LIZ(EnumC93715aVL.Y);
        } else {
            c93714aVK.LIZ(EnumC93715aVL.NONE);
        }
        if (this.LJLJI.LIZ != enumC93715aVL) {
            c93601aTV3.postInvalidate();
        }
        if (enumC93715aVL.compareTo(this.LJLJI.LIZ) >= 0) {
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C93601aTV c93601aTV;
        FrameLayout frameLayout;
        WindowManager windowManager;
        Display defaultDisplay;
        ViewGroup.LayoutParams layoutParams;
        FrameLayout frameLayout2;
        C94613ajp c94613ajp;
        C94613ajp c94613ajp2;
        C94613ajp c94613ajp3;
        C93603aTX c93603aTX;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C94338afO c94338afO = this.LJLILLLLZI;
        if (c94338afO != null && (c93603aTX = c94338afO.LJLJJI) != null) {
            c93603aTX.setActionListener(new C94458ahK(this));
        }
        C94338afO c94338afO2 = this.LJLILLLLZI;
        if (c94338afO2 != null && (c94613ajp3 = c94338afO2.LJLJI) != null) {
            c94613ajp3.setActionListener(new C94209adJ(this));
        }
        C94338afO c94338afO3 = this.LJLILLLLZI;
        if (c94338afO3 != null && (frameLayout = c94338afO3.LJLIL) != null) {
            if (C16330kX.LIZJ(frameLayout) && !frameLayout.isLayoutRequested()) {
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity != null && (windowManager = mo49getActivity.getWindowManager()) != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    defaultDisplay.getMetrics(displayMetrics);
                    int i = displayMetrics.heightPixels;
                    C94338afO c94338afO4 = this.LJLILLLLZI;
                    ViewGroup.LayoutParams layoutParams2 = null;
                    if (c94338afO4 != null && (c94613ajp2 = c94338afO4.LJLJI) != null) {
                        layoutParams = c94613ajp2.getLayoutParams();
                    } else {
                        layoutParams = null;
                    }
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        layoutParams2 = layoutParams;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                    C94338afO c94338afO5 = this.LJLILLLLZI;
                    if (c94338afO5 != null && (frameLayout2 = c94338afO5.LJLIL) != null && marginLayoutParams != null) {
                        marginLayoutParams.bottomMargin = C93742aVm.LIZJ(163.0f) - (i - frameLayout2.getMeasuredHeight());
                        C94338afO c94338afO6 = this.LJLILLLLZI;
                        if (c94338afO6 != null && (c94613ajp = c94338afO6.LJLJI) != null) {
                            c94613ajp.setLayoutParams(marginLayoutParams);
                        }
                    }
                }
            } else {
                frameLayout.addOnLayoutChangeListener(new IDCListenerS262S0100000_42(this, 0));
            }
        }
        ViewTreeObserverOnPreDrawListenerC16840lM.LIZ(view, new IDRunnableS33S0200000_42(view, this, 1));
        C94338afO c94338afO7 = this.LJLILLLLZI;
        if (c94338afO7 != null && (c93601aTV = c94338afO7.LJLILLLLZI) != null) {
            c93601aTV.setTransAdsorptionHelper(this.LJLJI);
        }
    }

    public final boolean Hl(float f, float f2, C94211adL c94211adL) {
        float f3 = c94211adL.LJLIL * f;
        float f4 = c94211adL.LJLILLLLZI * f2;
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        int LJFF = C93742aVm.LJFF(requireContext) * 4;
        int LIZJ = C93742aVm.LIZJ(20.0f);
        float f5 = LJFF;
        if (f3 <= f5 || f <= 1) {
            float f6 = LIZJ;
            if ((f3 >= f6 || f >= 1) && ((f4 <= f5 || f2 <= 1) && (f4 >= f6 || f2 >= 1))) {
                return false;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("feature scale limit size  ");
        LIZ.append(f);
        LIZ.append("; ");
        LIZ.append(f2);
        C94034aaU.LIZ("CKE-editor", X1D.LIZIZ(LIZ));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List<X.adL>] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.ArrayList] */
    public final void Kl(Feature feature, List<C94211adL> list, EnumC93697aV3 shape) {
        C93603aTX c93603aTX;
        C94211adL c94211adL;
        UIAnnotationAssetTexture LIZJ;
        AssetImageTexture assetTexture;
        C93603aTX c93603aTX2;
        C94211adL c94211adL2;
        ?? r8;
        C94211adL c94211adL3;
        C93603aTX c93603aTX3;
        C94211adL c94211adL4;
        C94338afO c94338afO;
        C93603aTX c93603aTX4;
        List<C94211adL> list2 = list;
        if (list2 != null && (c94211adL4 = (C94211adL) ORZ.LJLLLL(list2)) != null && (c94338afO = this.LJLILLLLZI) != null && (c93603aTX4 = c94338afO.LJLJJI) != null) {
            Rect LIZIZ = C93729aVZ.LIZIZ(c93603aTX4);
            CanvasImpl LIZIZ2 = C93991aZn.LIZIZ();
            if (LIZIZ2 != null) {
                LIZIZ2.updateOperatorCenter(new PointF(c94211adL4.LJLJI + LIZIZ.left, c94211adL4.LJLJJI + LIZIZ.top));
            }
        }
        C94338afO c94338afO2 = this.LJLILLLLZI;
        boolean z = true;
        AssetType assetType = null;
        if (c94338afO2 != null && (c93603aTX3 = c94338afO2.LJLJJI) != null && !c93603aTX3.LJLJJI && c93603aTX3.getTouchMoving()) {
            list2 = null;
        }
        C94338afO c94338afO3 = this.LJLILLLLZI;
        if (c94338afO3 != null && (c93603aTX2 = c94338afO3.LJLJJI) != null) {
            o.LJIIIZ(shape, "shape");
            if (list2 != null && (c94211adL3 = (C94211adL) ORZ.LJLLLL(list2)) != null) {
                c93603aTX2.LJLJLLL = c94211adL3;
                float f = c94211adL3.LJLIL;
                float f2 = c93603aTX2.LJLLILLLL;
                if (f >= f2) {
                    f2 = f;
                }
                float f3 = c94211adL3.LJLILLLLZI;
                float f4 = c93603aTX2.LJLLJ;
                if (f3 >= f4) {
                    f4 = f3;
                }
                c94211adL2 = C94211adL.L(c94211adL3, f2, f4, 0.0f, 0.0f, 0.0f, 28);
            } else {
                c94211adL2 = null;
            }
            c93603aTX2.LJLJLJ = c94211adL2;
            if (list2 != null) {
                r8 = new ArrayList(C32I.LJJL(list2, 10));
                for (C94211adL c94211adL5 : list2) {
                    float f5 = c94211adL5.LJLIL;
                    float f6 = c93603aTX2.LJLLILLLL;
                    if (f5 >= f6) {
                        f6 = f5;
                    }
                    float f7 = c94211adL5.LJLILLLLZI;
                    float f8 = c93603aTX2.LJLLJ;
                    if (f7 >= f8) {
                        f8 = f7;
                    }
                    r8.add(C94211adL.L(c94211adL5, f6, f8, 0.0f, 0.0f, 0.0f, 28));
                }
            } else {
                r8 = C61878OQg.INSTANCE;
            }
            c93603aTX2.LJLL = r8;
            c93603aTX2.LJLLI = shape;
            c93603aTX2.LIZIZ();
        }
        C94338afO c94338afO4 = this.LJLILLLLZI;
        if (c94338afO4 != null && (c93603aTX = c94338afO4.LJLJJI) != null) {
            if (list2 != null) {
                c94211adL = (C94211adL) ORZ.LJLLLL(list2);
            } else {
                c94211adL = null;
            }
            AssetType assetType2 = AssetType.AssetType_Gif;
            if (feature != null && (LIZJ = C93825aX7.LIZJ(feature)) != null && (assetTexture = LIZJ.getAssetTexture()) != null) {
                assetType = assetTexture.getAssetType();
            }
            if (assetType2 != assetType) {
                z = false;
            }
            c93603aTX.LIZJ(c94211adL, z);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.dw5, viewGroup, false);
        int i = R.id.nm4;
        C93601aTV c93601aTV = (C93601aTV) LLLLIILL.findViewById(R.id.nm4);
        if (c93601aTV != null) {
            i = R.id.nma;
            C94613ajp c94613ajp = (C94613ajp) LLLLIILL.findViewById(R.id.nma);
            if (c94613ajp != null) {
                i = R.id.np1;
                C93603aTX c93603aTX = (C93603aTX) LLLLIILL.findViewById(R.id.np1);
                if (c93603aTX != null) {
                    FrameLayout frameLayout = (FrameLayout) LLLLIILL;
                    this.LJLILLLLZI = new C94338afO(frameLayout, c93601aTV, c94613ajp, c93603aTX, frameLayout);
                    try {
                        ViewTreeLifecycleOwner.set(frameLayout, getViewLifecycleOwner());
                        ViewTreeViewModelStoreOwner.set(frameLayout, this);
                        C10A.LIZIZ(frameLayout, this);
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
                    return frameLayout;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(LLLLIILL.getResources().getResourceName(i)));
    }

    public final float wl(float f, float f2, float f3, float f4, float f5) {
        C93829aXB LJI;
        Project project;
        Canvas canvasPtr;
        EESize canvasSize;
        C94338afO c94338afO = this.LJLILLLLZI;
        float f6 = 0.0f;
        if (c94338afO == null || (LJI = CKEffectEditorContext.LJI()) == null || (project = LJI.LIZJ) == null || (canvasPtr = project.getCanvasPtr()) == null || (canvasSize = canvasPtr.getCanvasSize()) == null) {
            return 0.0f;
        }
        o.LJIIIIZZ(c94338afO.LJLJJI, "binding.selectFrame");
        double width = r0.getWidth() / canvasSize.getWidth();
        C93603aTX c93603aTX = c94338afO.LJLJJI;
        o.LJIIIIZZ(c93603aTX, "binding.selectFrame");
        Size size = new Size(c93603aTX.getWidth(), (int) (canvasSize.getHeight() * width));
        Matrix matrix = new Matrix();
        matrix.setRotate(f5, f, f2);
        float f7 = 2;
        float f8 = f3 / f7;
        float f9 = (f4 / f7) + f2;
        float[] fArr = {f + f8, f9};
        float[] fArr2 = {f - f8, f9};
        matrix.mapPoints(fArr);
        matrix.mapPoints(fArr2);
        float max = Math.max(Math.abs(fArr[0] - f), Math.abs(fArr2[0] - f));
        float max2 = Math.max(Math.abs(fArr[1] - f2), Math.abs(fArr2[1] - f2));
        float min = Math.min(C93727aVX.LIZ(40.0f), Math.max(max, max2));
        float f10 = f + max;
        if (f10 < min) {
            f6 = 0.0f + (min - f10);
        }
        float f11 = f - max;
        if (f11 > size.getWidth() - min) {
            f6 -= (size.getWidth() - min) - f11;
        }
        float f12 = f2 + max2;
        if (f12 < min) {
            f6 += min - f12;
        }
        float f13 = f2 - max2;
        if (f13 > size.getHeight() - min) {
            return f6 - ((size.getHeight() - min) - f13);
        }
        return f6;
    }
}
