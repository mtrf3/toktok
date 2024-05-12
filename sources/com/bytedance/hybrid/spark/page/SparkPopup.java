package com.bytedance.hybrid.spark.page;

import X.AbstractC60817Ntt;
import X.ActivityC45651qj;
import X.C03880Dg;
import X.C10A;
import X.C120914op;
import X.C131825Fi;
import X.C141335gf;
import X.C16800lI;
import X.C1B3;
import X.C37682Eqc;
import X.C3C5;
import X.C45621qg;
import X.C60605NqT;
import X.C60928Nvg;
import X.C60934Nvm;
import X.C60936Nvo;
import X.C60937Nvp;
import X.C60939Nvr;
import X.C60941Nvt;
import X.C60942Nvu;
import X.C60946Nvy;
import X.C60952Nw4;
import X.C60953Nw5;
import X.C60954Nw6;
import X.C60955Nw7;
import X.C60956Nw8;
import X.C60957Nw9;
import X.C60958NwA;
import X.C60959NwB;
import X.C60961NwD;
import X.C60962NwE;
import X.C60964NwG;
import X.C60965NwH;
import X.C61325O4z;
import X.C65232Piu;
import X.C65300Pk0;
import X.C76800UCe;
import X.C79605VMb;
import X.DialogC60914NvS;
import X.FCG;
import X.FCH;
import X.FD5;
import X.InterfaceC16710l9;
import X.InterfaceC31125CJl;
import X.InterfaceC32055Ci3;
import X.InterfaceC40159FpT;
import X.InterfaceC58316Mue;
import X.InterfaceC60142Nj0;
import X.InterfaceC60176NjY;
import X.InterfaceC60730NsU;
import X.InterfaceC60761Nsz;
import X.InterfaceC60816Nts;
import X.InterfaceC60871Nul;
import X.InterfaceC60949Nw1;
import X.LC0;
import X.NV7;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import X.X1D;
import Y.ARunnableS41S0100000_5;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.anim.BottomSheetBehavior;
import com.bytedance.lynx.hybrid.settings.HybridSettings;
import com.bytedance.lynx.spark.schema.model.AbsModel.AbsSparkPopupSchemaParam;
import com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import defpackage.i0;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS192S0100000_10;
import kotlin.jvm.internal.AqS63S0000000_10;
import kotlin.jvm.internal.AqS74S0201000_10;
import kotlin.jvm.internal.o;
import o3.h0;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class SparkPopup extends AppCompatDialogFragment implements NV7, InterfaceC40159FpT, InterfaceC31125CJl, InterfaceC32055Ci3, View.OnAttachStateChangeListener, ViewTreeObserver.OnWindowFocusChangeListener {
    public static final C60939Nvr LLIIZ = new C60939Nvr();
    public FrameLayout LJLILLLLZI;
    public LinearLayout LJLJI;
    public C131825Fi LJLJJI;
    public FrameLayout LJLJJL;
    public View LJLJJLL;
    public C45621qg LJLJL;
    public C60941Nvt LJLJLLL;
    public SparkPopupSchemaParam LJLL;
    public SparkContext LJLLI;
    public View LJLLILLLL;
    public SparkFragment LJLLJ;
    public BottomSheetBehavior<LinearLayout> LJLLL;
    public LC0 LJLLLLLL;
    public int LJLZ;
    public InterfaceC58316Mue LJZI;
    public C60928Nvg LL;
    public boolean LLD;
    public int LLF;
    public ViewTreeObserver.OnGlobalLayoutListener LLFF;
    public int LLFFF;
    public boolean LLFII;
    public boolean LLFZ;
    public boolean LLI;
    public C16800lI LLIFFJFJJ;
    public boolean LLII;
    public boolean LLIIII;
    public boolean LLIIIJ;
    public final boolean LLIIIL;
    public final boolean LLIIIZ;
    public final boolean LLIIJI;
    public View LLIIJLIL;
    public boolean LLIIL;
    public Integer[] LLIILII;
    public final C60964NwG LLIILZL;
    public final int LJLIL = C60936Nvo.LIZ(100.0f);
    public final List<InterfaceC60871Nul> LJLJLJ = new ArrayList();
    public final C60965NwH LJLLLL = new C60965NwH();
    public int LJZ = -1;
    public final C60937Nvp LJZL = new C60937Nvp();
    public int LLIIIILZ = -1;

    @Override // X.InterfaceC40159FpT
    public final void LLJIJIL() {
    }

    @Override // X.InterfaceC40159FpT
    public final void close() {
        Nl(true);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public SparkPopup() {
        Object LIZ;
        boolean z;
        Object LIZ2;
        boolean z2;
        Object LIZ3;
        try {
            JSONObject config = HybridSettings.INSTANCE.getConfig("popup_compat_show_event");
            if (config != null) {
                LIZ = Boolean.valueOf(JSONObjectProtectorUtils.getBoolean(config, "enable"));
            } else {
                LIZ = null;
            }
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Boolean bool = (Boolean) (C3C5.m12isFailureimpl(LIZ) ? null : LIZ);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.LLIIIL = z;
        try {
            JSONObject config2 = HybridSettings.INSTANCE.getConfig("fix_popup_anim_lag");
            if (config2 != null) {
                LIZ2 = Boolean.valueOf(JSONObjectProtectorUtils.getBoolean(config2, "enable"));
            } else {
                LIZ2 = null;
            }
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th2) {
            LIZ2 = C141335gf.LIZ(th2);
            C3C5.m7constructorimpl(LIZ2);
        }
        Boolean bool2 = (Boolean) (C3C5.m12isFailureimpl(LIZ2) ? null : LIZ2);
        if (bool2 != null) {
            z2 = bool2.booleanValue();
        } else {
            z2 = true;
        }
        this.LLIIIZ = z2;
        try {
            JSONObject config3 = HybridSettings.INSTANCE.getConfig("optimize_bottom_sheet_behavior_condition");
            if (config3 != null) {
                LIZ3 = Boolean.valueOf(JSONObjectProtectorUtils.getBoolean(config3, "enable"));
            } else {
                LIZ3 = null;
            }
            C3C5.m7constructorimpl(LIZ3);
        } catch (Throwable th3) {
            LIZ3 = C141335gf.LIZ(th3);
            C3C5.m7constructorimpl(LIZ3);
        }
        Boolean bool3 = (Boolean) (C3C5.m12isFailureimpl(LIZ3) ? null : LIZ3);
        this.LLIIJI = bool3 != null ? bool3.booleanValue() : true;
        this.LLIILII = new Integer[0];
        this.LLIILZL = new C60964NwG(this);
    }

    public final int Kl() {
        InterfaceC60142Nj0 interfaceC60142Nj0;
        ViewGroup.LayoutParams layoutParams;
        View view = this.LJLLILLLL;
        if (view == null) {
            SparkContext sparkContext = this.LJLLI;
            if (sparkContext != null && (interfaceC60142Nj0 = (InterfaceC60142Nj0) sparkContext.LIZIZ(InterfaceC60142Nj0.class)) != null) {
                view = interfaceC60142Nj0.LIZ();
            } else {
                view = null;
            }
        }
        this.LJLLILLLL = view;
        LLIIZ.getClass();
        if (view == null || view.getVisibility() != 0 || (layoutParams = view.getLayoutParams()) == null) {
            return 0;
        }
        return layoutParams.height;
    }

    @Override // X.InterfaceC31125CJl
    public final void LLLLLIL() {
        BottomSheetBehavior<LinearLayout> bottomSheetBehavior = this.LJLLL;
        if (bottomSheetBehavior != null && bottomSheetBehavior.LJJIIJ == 3) {
            C60939Nvr c60939Nvr = LLIIZ;
            Window Jl = Jl();
            mo49getActivity();
            SparkPopupSchemaParam sparkPopupSchemaParam = this.LJLL;
            if (sparkPopupSchemaParam != null) {
                c60939Nvr.getClass();
                int LIZIZ = C60939Nvr.LIZIZ(Jl, sparkPopupSchemaParam, this, true);
                BottomSheetBehavior<LinearLayout> bottomSheetBehavior2 = this.LJLLL;
                if (bottomSheetBehavior2 != null) {
                    if (bottomSheetBehavior2.getPeekHeight() != LIZIZ) {
                        BottomSheetBehavior<LinearLayout> bottomSheetBehavior3 = this.LJLLL;
                        if (bottomSheetBehavior3 != null) {
                            bottomSheetBehavior3.setPeekHeight(LIZIZ);
                        } else {
                            o.LJIJI("behavior");
                            throw null;
                        }
                    }
                    BottomSheetBehavior<LinearLayout> bottomSheetBehavior4 = this.LJLLL;
                    if (bottomSheetBehavior4 != null) {
                        bottomSheetBehavior4.LIZIZ(4);
                        Pl(this, false, true, 0, 5);
                        return;
                    } else {
                        o.LJIJI("behavior");
                        throw null;
                    }
                }
                o.LJIJI("behavior");
                throw null;
            }
            o.LJIJI("schemaParam");
            throw null;
        }
    }

    public final boolean Rl() {
        SparkSchemaParam LJIIZILJ;
        SparkContext sparkContext;
        SparkContext sparkContext2 = this.LJLLI;
        if (sparkContext2 != null && (LJIIZILJ = sparkContext2.LJIIZILJ(-1)) != null && (sparkContext = this.LJLLI) != null && (LJIIZILJ instanceof SparkPopupSchemaParam) && ((AbsSparkPopupSchemaParam) LJIIZILJ).getSilentLoadType() == 1) {
            C60937Nvp c60937Nvp = this.LJZL;
            c60937Nvp.getClass();
            if (c60937Nvp.LIZIZ(this, new AqS192S0100000_10(sparkContext, 43))) {
                return true;
            }
        }
        return false;
    }

    public final boolean Sl() {
        if (this.LLIIJI) {
            SparkPopupSchemaParam sparkPopupSchemaParam = this.LJLL;
            if (sparkPopupSchemaParam != null) {
                String realGravityWithoutDefault = sparkPopupSchemaParam.getRealGravityWithoutDefault(getContext());
                if (!o.LJ(realGravityWithoutDefault, "bottom")) {
                    SparkPopupSchemaParam sparkPopupSchemaParam2 = this.LJLL;
                    if (sparkPopupSchemaParam2 != null) {
                        if (!sparkPopupSchemaParam2.getEnablePullDownClose()) {
                            SparkPopupSchemaParam sparkPopupSchemaParam3 = this.LJLL;
                            if (sparkPopupSchemaParam3 != null) {
                                if (!sparkPopupSchemaParam3.getDragByGesture()) {
                                    return false;
                                }
                            } else {
                                o.LJIJI("schemaParam");
                                throw null;
                            }
                        }
                        if (!o.LJ(realGravityWithoutDefault, "")) {
                            return false;
                        }
                    } else {
                        o.LJIJI("schemaParam");
                        throw null;
                    }
                }
                return true;
            }
            o.LJIJI("schemaParam");
            throw null;
        }
        SparkPopupSchemaParam sparkPopupSchemaParam4 = this.LJLL;
        if (sparkPopupSchemaParam4 != null) {
            if (!sparkPopupSchemaParam4.getEnablePullDownClose()) {
                SparkPopupSchemaParam sparkPopupSchemaParam5 = this.LJLL;
                if (sparkPopupSchemaParam5 != null) {
                    if (!sparkPopupSchemaParam5.getDragByGesture()) {
                        SparkPopupSchemaParam sparkPopupSchemaParam6 = this.LJLL;
                        if (sparkPopupSchemaParam6 != null) {
                            if (!o.LJ(sparkPopupSchemaParam6.getRealGravity(getContext()), "bottom")) {
                                return false;
                            }
                        } else {
                            o.LJIJI("schemaParam");
                            throw null;
                        }
                    }
                } else {
                    o.LJIJI("schemaParam");
                    throw null;
                }
            }
            return true;
        }
        o.LJIJI("schemaParam");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        List<InterfaceC60949Nw1> list;
        ViewTreeObserver viewTreeObserver;
        View view;
        ViewTreeObserver viewTreeObserver2;
        C60937Nvp c60937Nvp = this.LJZL;
        c60937Nvp.getClass();
        c60937Nvp.LIZ(this, C60957Nw9.LJLIL);
        super.onDestroy();
        View view2 = getView();
        if (view2 != null && (viewTreeObserver = view2.getViewTreeObserver()) != null && viewTreeObserver.isAlive() && (view = getView()) != null && (viewTreeObserver2 = view.getViewTreeObserver()) != null) {
            viewTreeObserver2.removeOnWindowFocusChangeListener(this);
        }
        View view3 = this.LLIIJLIL;
        if (view3 != null) {
            C60964NwG listener = this.LLIILZL;
            o.LJIIJ(listener, "listener");
            int hashCode = view3.hashCode();
            Map<Integer, List<InterfaceC16710l9>> map = C120914op.LIZ;
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            List list2 = (List) linkedHashMap.get(Integer.valueOf(hashCode));
            if (list2 != null) {
                list2.remove(listener);
            }
            List list3 = (List) linkedHashMap.get(Integer.valueOf(hashCode));
            if (list3 != null && list3.isEmpty()) {
                map.remove(Integer.valueOf(hashCode));
            }
        }
        this.LLIIJLIL = null;
        C60937Nvp c60937Nvp2 = this.LJZL;
        c60937Nvp2.getClass();
        c60937Nvp2.LIZ(this, C60954Nw6.LJLIL);
        C60928Nvg c60928Nvg = this.LL;
        if (c60928Nvg != null && (list = c60928Nvg.LIZ) != null) {
            for (InterfaceC60949Nw1 callback : list) {
                C60937Nvp c60937Nvp3 = this.LJZL;
                c60937Nvp3.getClass();
                o.LJIIJ(callback, "callback");
                c60937Nvp3.LIZ.remove(callback);
            }
        }
        C37682Eqc.LIZIZ(this.LJLLI, "SparkPopupLoadingProcess", "SparkPopup onDestroy");
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        C37682Eqc.LIZIZ(this.LJLLI, "SparkPopupLoadingProcess", "SparkPopup onDetach");
        super.onDetach();
        Dl(false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        SparkFragment sparkFragment;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        InterfaceC60761Nsz kitView;
        C37682Eqc.LIZIZ(this.LJLLI, "SparkPopupLoadingProcess", "SparkPopup onPause");
        C60937Nvp c60937Nvp = this.LJZL;
        c60937Nvp.getClass();
        c60937Nvp.LIZ(this, C60952Nw4.LJLIL);
        this.LLIIII = false;
        Dl(false);
        SparkPopupSchemaParam sparkPopupSchemaParam = this.LJLL;
        if (sparkPopupSchemaParam != null) {
            if (!sparkPopupSchemaParam.getPopupCompatShowEvent() && !this.LLIIIL && (sparkFragment = this.LJLLJ) != null && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = sparkFragment.LJLJI) != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) != null) {
                kitView.onHide();
            }
            super.onPause();
            C60937Nvp c60937Nvp2 = this.LJZL;
            c60937Nvp2.getClass();
            c60937Nvp2.LIZ(this, C60961NwD.LJLIL);
            return;
        }
        o.LJIJI("schemaParam");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        int i;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        InterfaceC60761Nsz kitView;
        String str;
        String str2;
        String str3;
        SparkFragment sparkFragment;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2;
        InterfaceC60761Nsz kitView2;
        C60937Nvp c60937Nvp = this.LJZL;
        c60937Nvp.getClass();
        c60937Nvp.LIZ(this, C60953Nw5.LJLIL);
        super.onResume();
        this.LLIIII = true;
        Dl(true);
        SparkPopupSchemaParam sparkPopupSchemaParam = this.LJLL;
        if (sparkPopupSchemaParam != null) {
            if (!sparkPopupSchemaParam.getPopupCompatShowEvent() && !this.LLIIIL && (sparkFragment = this.LJLLJ) != null && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = sparkFragment.LJLJI) != null && (kitView2 = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2.getKitView()) != null) {
                kitView2.onShow();
            }
            if (this.LJZ == -1) {
                BottomSheetBehavior<LinearLayout> bottomSheetBehavior = this.LJLLL;
                if (bottomSheetBehavior != null) {
                    i = bottomSheetBehavior.LJJIIJ;
                } else {
                    i = 3;
                }
                this.LJZ = i;
                SparkFragment sparkFragment2 = this.LJLLJ;
                if (sparkFragment2 != null && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = sparkFragment2.LJLJI) != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) != null) {
                    JSONObject jSONObject = new JSONObject();
                    if (this.LJZ != 3) {
                        str = "onEnterNormalState";
                    } else {
                        str = "onEnterExpandState";
                    }
                    jSONObject.put("state", str);
                    SparkContext sparkContext = this.LJLLI;
                    String str4 = "";
                    if (sparkContext == null || (str2 = sparkContext.url) == null) {
                        str2 = "";
                    }
                    jSONObject.put("url", str2);
                    SparkContext sparkContext2 = this.LJLLI;
                    if (sparkContext2 != null && (str3 = sparkContext2.containerId) != null) {
                        str4 = str3;
                    }
                    jSONObject.put("container_id", str4);
                    kitView.LJIIIZ("onVariableHeightStateChanged", jSONObject);
                }
            }
            C60937Nvp c60937Nvp2 = this.LJZL;
            c60937Nvp2.getClass();
            c60937Nvp2.LIZ(this, C60962NwE.LJLIL);
            return;
        }
        o.LJIJI("schemaParam");
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        C37682Eqc.LIZIZ(this.LJLLI, "SparkPopupLoadingProcess", "SparkPopup onStart");
        C60937Nvp c60937Nvp = this.LJZL;
        c60937Nvp.getClass();
        c60937Nvp.LIZ(this, C60958NwA.LJLIL);
        super.onStart();
        C60937Nvp c60937Nvp2 = this.LJZL;
        c60937Nvp2.getClass();
        c60937Nvp2.LIZ(this, C60955Nw7.LJLIL);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            ViewTreeLifecycleOwner.set(decorView, this);
            ViewTreeViewModelStoreOwner.set(decorView, this);
            C10A.LIZIZ(decorView, this);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        C37682Eqc.LIZIZ(this.LJLLI, "SparkPopupLoadingProcess", "SparkPopup onStop");
        C60937Nvp c60937Nvp = this.LJZL;
        c60937Nvp.getClass();
        c60937Nvp.LIZ(this, C60959NwB.LJLIL);
        super.onStop();
        C60937Nvp c60937Nvp2 = this.LJZL;
        c60937Nvp2.getClass();
        c60937Nvp2.LIZ(this, C60956Nw8.LJLIL);
    }

    @Override // X.NV7
    public final void refresh() {
        SparkFragment sparkFragment = this.LJLLJ;
        if (sparkFragment != null) {
            sparkFragment.refresh();
        }
        C37682Eqc.LIZIZ(this.LJLLI, "SparkPopupLoadingProcess", "SparkPopup refresh");
    }

    public final Window Jl() {
        Dialog dialog;
        Window window;
        Window window2;
        Dialog dialog2 = getDialog();
        Window window3 = null;
        if (dialog2 != null && (window2 = dialog2.getWindow()) != null) {
            return window2;
        }
        Fragment parentFragment = getParentFragment();
        if (!(parentFragment instanceof DialogFragment)) {
            parentFragment = null;
        }
        DialogFragment dialogFragment = (DialogFragment) parentFragment;
        if (dialogFragment != null && (dialog = dialogFragment.getDialog()) != null && (window = dialog.getWindow()) != null) {
            return window;
        }
        FCH.LIZIZ.getClass();
        Activity LIZIZ = FCG.LIZIZ();
        if (LIZIZ != null) {
            window3 = LIZIZ.getWindow();
        }
        return window3;
    }

    public static final /* synthetic */ BottomSheetBehavior vl(SparkPopup sparkPopup) {
        BottomSheetBehavior<LinearLayout> bottomSheetBehavior = sparkPopup.LJLLL;
        if (bottomSheetBehavior != null) {
            return bottomSheetBehavior;
        }
        o.LJIJI("behavior");
        throw null;
    }

    public static final /* synthetic */ LinearLayout wl(SparkPopup sparkPopup) {
        LinearLayout linearLayout = sparkPopup.LJLJI;
        if (linearLayout != null) {
            return linearLayout;
        }
        o.LJIJI("popupContainer");
        throw null;
    }

    public static final /* synthetic */ SparkPopupSchemaParam xl(SparkPopup sparkPopup) {
        SparkPopupSchemaParam sparkPopupSchemaParam = sparkPopup.LJLL;
        if (sparkPopupSchemaParam != null) {
            return sparkPopupSchemaParam;
        }
        o.LJIJI("schemaParam");
        throw null;
    }

    public final void Dl(boolean z) {
        boolean z2;
        boolean z3;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        InterfaceC60761Nsz kitView;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2;
        InterfaceC60761Nsz kitView2;
        View decorView;
        C16800lI c16800lI;
        if (z == this.LLII) {
            return;
        }
        boolean z4 = this.LLIIII;
        boolean isVisible = isVisible();
        boolean userVisibleHint = getUserVisibleHint();
        View view = getView();
        if (view != null) {
            z2 = view.hasWindowFocus();
        } else {
            z2 = false;
        }
        if (z4 && isVisible && userVisibleHint && z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 != this.LLII) {
            this.LLII = z3;
            SparkPopupSchemaParam sparkPopupSchemaParam = this.LJLL;
            if (sparkPopupSchemaParam != null) {
                if (sparkPopupSchemaParam.getPopupCompatShowEvent() || this.LLIIIL) {
                    if (z3) {
                        SparkFragment sparkFragment = this.LJLLJ;
                        if (sparkFragment != null && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = sparkFragment.LJLJI) != null && (kitView2 = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2.getKitView()) != null) {
                            kitView2.onShow();
                        }
                    } else {
                        SparkFragment sparkFragment2 = this.LJLLJ;
                        if (sparkFragment2 != null && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = sparkFragment2.LJLJI) != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) != null) {
                            kitView.onHide();
                        }
                    }
                }
                Window Jl = Jl();
                if (Jl != null && (decorView = Jl.getDecorView()) != null && (c16800lI = this.LLIFFJFJJ) != null) {
                    Al(decorView, c16800lI);
                    return;
                }
                return;
            }
            o.LJIJI("schemaParam");
            throw null;
        }
    }

    public final void Gl(C1B3 c1b3) {
        String str;
        String str2;
        String str3;
        String str4 = "";
        String str5 = null;
        try {
            C61325O4z.LJFF(new ARunnableS41S0100000_5(c1b3, 329));
            SparkContext sparkContext = this.LJLLI;
            if (sparkContext != null) {
                str2 = sparkContext.containerId;
            } else {
                str2 = null;
            }
            C79605VMb c79605VMb = new C79605VMb("commitNowAllowingStateLossSafely");
            c79605VMb.LIZIZ = "sparkTrace";
            if (sparkContext == null || (str3 = sparkContext.url) == null) {
                str3 = "";
            }
            c79605VMb.LIZ = str3;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", "success");
            c79605VMb.LIZLLL = jSONObject;
            FD5.LJ(str2, c79605VMb.LIZ());
        } catch (Throwable unused) {
            c1b3.LJI();
            SparkContext sparkContext2 = this.LJLLI;
            if (sparkContext2 != null) {
                str5 = sparkContext2.containerId;
            }
            C79605VMb c79605VMb2 = new C79605VMb("commitNowAllowingStateLossSafely");
            c79605VMb2.LIZIZ = "sparkTrace";
            if (sparkContext2 != null && (str = sparkContext2.url) != null) {
                str4 = str;
            }
            c79605VMb2.LIZ = str4;
            c79605VMb2.LIZLLL = C65232Piu.LIZJ("status", "failed");
            FD5.LJ(str5, c79605VMb2.LIZ());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a5, code lost:
    
        if (1 != 0) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Hl(int r9) {
        /*
            r8 = this;
            android.view.Window r0 = r8.Jl()
            r7 = 0
            if (r0 == 0) goto Lb7
            android.view.View r5 = r0.getDecorView()
        Lb:
            android.view.View r0 = r8.getView()
            if (r0 == 0) goto Lb4
            android.view.ViewParent r1 = r0.getParent()
        L15:
            boolean r0 = r1 instanceof android.view.View
            if (r0 != 0) goto L1a
            r1 = r7
        L1a:
            android.view.View r1 = (android.view.View) r1
            r4 = 0
            if (r1 == 0) goto Lb1
            int r2 = r1.getPaddingBottom()
        L23:
            boolean r0 = r5 instanceof android.view.ViewGroup
            if (r0 != 0) goto Lae
            r0 = r7
        L28:
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 == 0) goto Lac
            android.view.View r0 = r0.getChildAt(r4)
            if (r0 == 0) goto Lac
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
        L36:
            boolean r0 = r1 instanceof android.widget.FrameLayout.LayoutParams
            if (r0 != 0) goto L3b
            r1 = r7
        L3b:
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            if (r1 == 0) goto Laa
            int r0 = r1.bottomMargin
        L41:
            int r9 = r9 - r2
            int r9 = r9 - r0
            r3 = 1
            java.lang.String r6 = "schemaParam"
            if (r5 == 0) goto L95
            int r0 = r5.getWindowSystemUiVisibility()
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L95
            com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam r0 = r8.LJLL
            if (r0 == 0) goto Lca
            X.Flg r1 = r0.getEngineType()
            X.Flg r0 = X.EnumC39924Flg.WEB
            if (r1 != r0) goto La4
            r2 = 1
        L5d:
            com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam r0 = r8.LJLL
            if (r0 == 0) goto Lc6
            X.Flg r1 = r0.getEngineType()
            X.Flg r0 = X.EnumC39924Flg.LYNX
            if (r1 != r0) goto La8
            com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam r0 = r8.LJLL
            if (r0 == 0) goto Lc2
            int r1 = r0.getKeyboardAdjust()
            r0 = 2
            if (r1 != r0) goto La8
            com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam r0 = r8.LJLL
            if (r0 == 0) goto Lbe
            boolean r0 = r0.getKeyboardCompat()
            if (r0 == 0) goto La8
            r0 = 1
        L7f:
            if (r2 != 0) goto L83
            if (r0 == 0) goto L95
        L83:
            int r2 = r5.getPaddingLeft()
            int r1 = r5.getPaddingTop()
            int r0 = r5.getPaddingRight()
            r5.setPadding(r2, r1, r0, r9)
            r5.requestLayout()
        L95:
            com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam r0 = r8.LJLL
            if (r0 == 0) goto Lba
            boolean r0 = r0.getSelfAdaptiveHeight()
            if (r0 != 0) goto La3
            r0 = 5
            Pl(r8, r4, r3, r4, r0)
        La3:
            return
        La4:
            r2 = 0
            if (r3 == 0) goto La8
            goto L5d
        La8:
            r0 = 0
            goto L7f
        Laa:
            r0 = 0
            goto L41
        Lac:
            r1 = r7
            goto L36
        Lae:
            r0 = r5
            goto L28
        Lb1:
            r2 = 0
            goto L23
        Lb4:
            r1 = r7
            goto L15
        Lb7:
            r5 = r7
            goto Lb
        Lba:
            kotlin.jvm.internal.o.LJIJI(r6)
            throw r7
        Lbe:
            kotlin.jvm.internal.o.LJIJI(r6)
            throw r7
        Lc2:
            kotlin.jvm.internal.o.LJIJI(r6)
            throw r7
        Lc6:
            kotlin.jvm.internal.o.LJIJI(r6)
            throw r7
        Lca:
            kotlin.jvm.internal.o.LJIJI(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.hybrid.spark.page.SparkPopup.Hl(int):void");
    }

    public final int Il(Integer num) {
        int i;
        if (num != null) {
            i = num.intValue();
        } else {
            BottomSheetBehavior<LinearLayout> bottomSheetBehavior = this.LJLLL;
            if (bottomSheetBehavior != null) {
                i = bottomSheetBehavior.LJJIIJ;
            } else {
                i = -1;
            }
        }
        if (i == 3) {
            SparkPopupSchemaParam sparkPopupSchemaParam = this.LJLL;
            if (sparkPopupSchemaParam != null) {
                if (sparkPopupSchemaParam.getDragMinMarginTop() > 0) {
                    SparkPopupSchemaParam sparkPopupSchemaParam2 = this.LJLL;
                    if (sparkPopupSchemaParam2 != null) {
                        return sparkPopupSchemaParam2.getDragMinMarginTop();
                    }
                    o.LJIJI("schemaParam");
                    throw null;
                }
            } else {
                o.LJIJI("schemaParam");
                throw null;
            }
        }
        SparkPopupSchemaParam sparkPopupSchemaParam3 = this.LJLL;
        if (sparkPopupSchemaParam3 != null) {
            return sparkPopupSchemaParam3.getMinMarginTop();
        }
        o.LJIJI("schemaParam");
        throw null;
    }

    public final void Ll(SparkContext sparkContext) {
        C60928Nvg c60928Nvg;
        List<InterfaceC60949Nw1> list;
        C37682Eqc.LIZIZ(sparkContext, "SparkPopupLoadingProcess", "SparkPopup init");
        this.LJLLI = sparkContext;
        if (sparkContext != null) {
            c60928Nvg = (C60928Nvg) sparkContext.LIZIZ(C60928Nvg.class);
        } else {
            c60928Nvg = null;
        }
        this.LL = c60928Nvg;
        if (c60928Nvg != null && (list = c60928Nvg.LIZ) != null) {
            for (InterfaceC60949Nw1 callback : list) {
                C60937Nvp c60937Nvp = this.LJZL;
                c60937Nvp.getClass();
                o.LJIIJ(callback, "callback");
                c60937Nvp.LIZ.add(callback);
            }
        }
    }

    public final void Ml(int i) {
        boolean z;
        Integer num;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        InterfaceC60761Nsz kitView;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        this.LLFII = z;
        if (!z) {
            i = 0;
        }
        Context context = getContext();
        if (context != null) {
            num = Integer.valueOf(C60605NqT.LJIIJ(i, context));
        } else {
            num = null;
        }
        SparkFragment sparkFragment = this.LJLLJ;
        if (sparkFragment != null && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = sparkFragment.LJLJI) != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("visible", this.LLFII);
            jSONObject.put("height", num);
            kitView.LJIIIZ("keyboardStatusChange", jSONObject);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0069. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Nl(boolean r9) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.hybrid.spark.page.SparkPopup.Nl(boolean):void");
    }

    public final void Ql(boolean z) {
        BottomSheetBehavior<LinearLayout> bottomSheetBehavior = this.LJLLL;
        if (bottomSheetBehavior == null) {
            return;
        }
        bottomSheetBehavior.LJIIZILJ = z;
        SparkPopupSchemaParam sparkPopupSchemaParam = this.LJLL;
        if (sparkPopupSchemaParam != null) {
            sparkPopupSchemaParam.setDragByGesture(z);
        } else {
            o.LJIJI("schemaParam");
            throw null;
        }
    }

    @Override // X.InterfaceC32055Ci3
    public final void ec(InterfaceC58316Mue interfaceC58316Mue) {
        this.LJZI = interfaceC58316Mue;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        o.LJIIJ(context, "context");
        C37682Eqc.LIZIZ(this.LJLLI, "SparkPopupLoadingProcess", "SparkPopup onAttach");
        super.onAttach(context);
        Dl(true);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        o.LJIIJ(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        C60937Nvp c60937Nvp = this.LJZL;
        c60937Nvp.getClass();
        c60937Nvp.LIZ(this, new AqS192S0100000_10(newConfig, 42));
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        SparkSchemaParam sparkSchemaParam;
        C37682Eqc.LIZIZ(this.LJLLI, "SparkPopupLoadingProcess", "SparkPopup onCreateDialog");
        Context requireContext = requireContext();
        o.LJFF(requireContext, "requireContext()");
        DialogC60914NvS dialogC60914NvS = new DialogC60914NvS(this, requireContext);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            dialogC60914NvS.setOwnerActivity(mo49getActivity);
        }
        SparkContext sparkContext = this.LJLLI;
        dialogC60914NvS.LJLJI = sparkContext;
        SparkSchemaParam sparkSchemaParam2 = null;
        if (sparkContext != null) {
            sparkSchemaParam = sparkContext.LJIIZILJ(2);
        } else {
            sparkSchemaParam = null;
        }
        if (sparkSchemaParam instanceof SparkPopupSchemaParam) {
            sparkSchemaParam2 = sparkSchemaParam;
        }
        dialogC60914NvS.LJLJJI = (SparkPopupSchemaParam) sparkSchemaParam2;
        return dialogC60914NvS;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "8053307877735069852");
        if (c03880Dg.LIZJ(10501, "com/bytedance/hybrid/spark/page/SparkPopup", "onHiddenChanged", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10501, "com/bytedance/hybrid/spark/page/SparkPopup", "onHiddenChanged", null, objArr, this, c65300Pk0, false);
            return;
        }
        C37682Eqc.LIZIZ(this.LJLLI, "SparkPopupLoadingProcess", "SparkPopup onHiddenChanged, hidden = " + z);
        super.onHiddenChanged(z);
        Dl(z ^ true);
        c03880Dg.LIZIZ(10501, "com/bytedance/hybrid/spark/page/SparkPopup", "onHiddenChanged", null, objArr, this, c65300Pk0, true);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        o.LJIIJ(outState, "outState");
        C60937Nvp c60937Nvp = this.LJZL;
        c60937Nvp.getClass();
        c60937Nvp.LIZ(this, new AqS192S0100000_10(outState, 48));
        super.onSaveInstanceState(outState);
        C60937Nvp c60937Nvp2 = this.LJZL;
        c60937Nvp2.getClass();
        c60937Nvp2.LIZ(this, new AqS192S0100000_10(outState, 45));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Dl(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (view != null) {
            view.removeOnAttachStateChangeListener(this);
        }
        Dl(false);
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        Dl(z);
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "8053307877735069852");
        if (c03880Dg.LIZJ(10502, "com/bytedance/hybrid/spark/page/SparkPopup", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/bytedance/hybrid/spark/page/SparkPopup", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.setUserVisibleHint(z);
        Dl(z);
        c03880Dg.LIZIZ(10502, "com/bytedance/hybrid/spark/page/SparkPopup", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }

    public final C16800lI Al(View view, C16800lI c16800lI) {
        int i;
        View view2;
        int measuredHeight;
        boolean z;
        if (view != null) {
            C16800lI LJIILIIL = h0.LJIILIIL(view, c16800lI);
            o.LJFF(LJIILIIL, "ViewCompat.onApplyWindowInsets(v, insets)");
            boolean LJII = c16800lI.LJII(8);
            C60939Nvr c60939Nvr = LLIIZ;
            Window Jl = Jl();
            View view3 = getView();
            c60939Nvr.getClass();
            boolean LIZLLL = C60939Nvr.LIZLLL(view, Jl, view3);
            if (c16800lI.LJII(2) && !LIZLLL) {
                i = c16800lI.LIZ(2).LIZLLL;
            } else {
                i = 0;
            }
            if (LJII) {
                i = c16800lI.LIZ(8).LIZLLL;
            }
            int i2 = this.LLIIIILZ;
            if (i2 == -1) {
                this.LLIIIILZ = i;
                return LJIILIIL;
            }
            if (i2 == i) {
                return LJIILIIL;
            }
            SparkPopupSchemaParam sparkPopupSchemaParam = this.LJLL;
            if (sparkPopupSchemaParam != null) {
                if (sparkPopupSchemaParam.getIgnoreKeyboardStatusChange()) {
                    return LJIILIIL;
                }
                if (!this.LLII) {
                    return LJIILIIL;
                }
                int i3 = this.LLIIIILZ;
                int i4 = i - i3;
                int i5 = this.LJLIL;
                if (i4 > i5) {
                    Ml(Math.abs(i4));
                    Math.abs(i4);
                    if (mo49getActivity() != null && (view2 = getView()) != null) {
                        SparkPopupSchemaParam sparkPopupSchemaParam2 = this.LJLL;
                        if (sparkPopupSchemaParam2 != null) {
                            if (!sparkPopupSchemaParam2.getSelfAdaptiveHeight() || this.LLI) {
                                int LIZ = C60939Nvr.LIZ(Jl(), view2, this);
                                if (this.LJLZ == 0) {
                                    SparkPopupSchemaParam sparkPopupSchemaParam3 = this.LJLL;
                                    if (sparkPopupSchemaParam3 != null) {
                                        if (sparkPopupSchemaParam3.getSelfAdaptiveHeight()) {
                                            SparkPopupSchemaParam sparkPopupSchemaParam4 = this.LJLL;
                                            if (sparkPopupSchemaParam4 != null) {
                                                measuredHeight = sparkPopupSchemaParam4.getHeight();
                                                int Il = LIZ - Il(null);
                                                if (measuredHeight > Il) {
                                                    measuredHeight = Il;
                                                }
                                                if (measuredHeight < 0) {
                                                    measuredHeight = 0;
                                                }
                                            } else {
                                                o.LJIJI("schemaParam");
                                                throw null;
                                            }
                                        } else {
                                            LinearLayout linearLayout = this.LJLJI;
                                            if (linearLayout != null) {
                                                measuredHeight = linearLayout.getMeasuredHeight();
                                            } else {
                                                o.LJIJI("popupContainer");
                                                throw null;
                                            }
                                        }
                                        this.LJLZ = measuredHeight;
                                    } else {
                                        o.LJIJI("schemaParam");
                                        throw null;
                                    }
                                }
                                int i6 = this.LJLZ;
                                int Il2 = LIZ - Il(null);
                                if (i6 > Il2) {
                                    i6 = Il2;
                                }
                                LinearLayout linearLayout2 = this.LJLJI;
                                if (linearLayout2 != null) {
                                    ViewGroup.LayoutParams layoutParams = linearLayout2.getLayoutParams();
                                    if (layoutParams != null) {
                                        layoutParams.height = i6;
                                    }
                                    int Kl = i6 - Kl();
                                    C131825Fi c131825Fi = this.LJLJJI;
                                    if (c131825Fi != null) {
                                        ViewGroup.LayoutParams layoutParams2 = c131825Fi.getLayoutParams();
                                        if (layoutParams2 != null) {
                                            layoutParams2.height = Kl;
                                        }
                                        LinearLayout linearLayout3 = this.LJLJI;
                                        if (linearLayout3 != null) {
                                            int LIZ2 = C60942Nvu.LIZ(linearLayout3) & 7;
                                            LinearLayout linearLayout4 = this.LJLJI;
                                            if (linearLayout4 != null) {
                                                C60942Nvu.LIZJ(LIZ2 | 80, linearLayout4);
                                                BottomSheetBehavior<LinearLayout> bottomSheetBehavior = this.LJLLL;
                                                if (bottomSheetBehavior != null) {
                                                    bottomSheetBehavior.LJJIII = true;
                                                    if (this.LLFFF == 0) {
                                                        this.LLFFF = bottomSheetBehavior.getPeekHeight();
                                                    }
                                                    BottomSheetBehavior<LinearLayout> bottomSheetBehavior2 = this.LJLLL;
                                                    if (bottomSheetBehavior2 != null) {
                                                        if (bottomSheetBehavior2.LJJIIJ != 3) {
                                                            bottomSheetBehavior2.setPeekHeight(Kl);
                                                        } else {
                                                            bottomSheetBehavior2.LJIJJLI = Kl;
                                                        }
                                                    } else {
                                                        o.LJIJI("behavior");
                                                        throw null;
                                                    }
                                                }
                                            } else {
                                                o.LJIJI("popupContainer");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("popupContainer");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("popupInnerContainer");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("popupContainer");
                                    throw null;
                                }
                            }
                            BottomSheetBehavior<LinearLayout> bottomSheetBehavior3 = this.LJLLL;
                            if (bottomSheetBehavior3 != null && (z = bottomSheetBehavior3.LJIIZILJ)) {
                                bottomSheetBehavior3.LJJIII = true;
                                this.LLFZ = z;
                                Ql(false);
                                BottomSheetBehavior<LinearLayout> bottomSheetBehavior4 = this.LJLLL;
                                if (bottomSheetBehavior4 != null) {
                                    bottomSheetBehavior4.setHideable(false);
                                } else {
                                    o.LJIJI("behavior");
                                    throw null;
                                }
                            }
                            LinearLayout linearLayout5 = this.LJLJI;
                            if (linearLayout5 != null) {
                                linearLayout5.requestLayout();
                                C131825Fi c131825Fi2 = this.LJLJJI;
                                if (c131825Fi2 != null) {
                                    c131825Fi2.requestLayout();
                                } else {
                                    o.LJIJI("popupInnerContainer");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("popupContainer");
                                throw null;
                            }
                        } else {
                            o.LJIJI("schemaParam");
                            throw null;
                        }
                    }
                    Hl(i);
                    this.LLIIIILZ = i;
                    return LJIILIIL;
                }
                if (i3 - i > i5) {
                    Ml(-Math.abs(i4));
                    if (mo49getActivity() != null) {
                        View view4 = getView();
                        if (view4 != null) {
                            SparkPopupSchemaParam sparkPopupSchemaParam5 = this.LJLL;
                            if (sparkPopupSchemaParam5 != null) {
                                if (!sparkPopupSchemaParam5.getSelfAdaptiveHeight() || this.LLI) {
                                    LinearLayout linearLayout6 = this.LJLJI;
                                    if (linearLayout6 != null) {
                                        ViewGroup.LayoutParams layoutParams3 = linearLayout6.getLayoutParams();
                                        Window Jl2 = Jl();
                                        mo49getActivity();
                                        SparkPopupSchemaParam sparkPopupSchemaParam6 = this.LJLL;
                                        if (sparkPopupSchemaParam6 != null) {
                                            layoutParams3.height = C60939Nvr.LIZIZ(Jl2, sparkPopupSchemaParam6, this, false);
                                            C131825Fi c131825Fi3 = this.LJLJJI;
                                            if (c131825Fi3 != null) {
                                                ViewGroup.LayoutParams layoutParams4 = c131825Fi3.getLayoutParams();
                                                LinearLayout linearLayout7 = this.LJLJI;
                                                if (linearLayout7 != null) {
                                                    layoutParams4.height = linearLayout7.getLayoutParams().height - Kl();
                                                    BottomSheetBehavior<LinearLayout> bottomSheetBehavior5 = this.LJLLL;
                                                    if (bottomSheetBehavior5 != null) {
                                                        bottomSheetBehavior5.LJJIII = true;
                                                        if (bottomSheetBehavior5.LJJIIJ != 3) {
                                                            LinearLayout linearLayout8 = this.LJLJI;
                                                            if (linearLayout8 != null) {
                                                                bottomSheetBehavior5.setPeekHeight(linearLayout8.getLayoutParams().height);
                                                            } else {
                                                                o.LJIJI("popupContainer");
                                                                throw null;
                                                            }
                                                        } else {
                                                            LinearLayout linearLayout9 = this.LJLJI;
                                                            if (linearLayout9 != null) {
                                                                bottomSheetBehavior5.LJIJJLI = linearLayout9.getLayoutParams().height;
                                                            } else {
                                                                o.LJIJI("popupContainer");
                                                                throw null;
                                                            }
                                                        }
                                                    }
                                                    SparkPopupSchemaParam sparkPopupSchemaParam7 = this.LJLL;
                                                    if (sparkPopupSchemaParam7 != null) {
                                                        int LIZIZ = C60942Nvu.LIZIZ(sparkPopupSchemaParam7, view4, this.LLIILII);
                                                        LinearLayout linearLayout10 = this.LJLJI;
                                                        if (linearLayout10 != null) {
                                                            C60942Nvu.LIZJ(LIZIZ, linearLayout10);
                                                        } else {
                                                            o.LJIJI("popupContainer");
                                                            throw null;
                                                        }
                                                    } else {
                                                        o.LJIJI("schemaParam");
                                                        throw null;
                                                    }
                                                } else {
                                                    o.LJIJI("popupContainer");
                                                    throw null;
                                                }
                                            } else {
                                                o.LJIJI("popupInnerContainer");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("schemaParam");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("popupContainer");
                                        throw null;
                                    }
                                }
                            } else {
                                o.LJIJI("schemaParam");
                                throw null;
                            }
                        }
                        BottomSheetBehavior<LinearLayout> bottomSheetBehavior6 = this.LJLLL;
                        if (bottomSheetBehavior6 != null) {
                            bottomSheetBehavior6.LJJIII = true;
                            if (this.LLFZ) {
                                Ql(true);
                            }
                            BottomSheetBehavior<LinearLayout> bottomSheetBehavior7 = this.LJLLL;
                            if (bottomSheetBehavior7 != null) {
                                SparkPopupSchemaParam sparkPopupSchemaParam8 = this.LJLL;
                                if (sparkPopupSchemaParam8 != null) {
                                    bottomSheetBehavior7.setHideable(sparkPopupSchemaParam8.getEnablePullDownClose());
                                } else {
                                    o.LJIJI("schemaParam");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("behavior");
                                throw null;
                            }
                        }
                        C45621qg c45621qg = this.LJLJL;
                        if (c45621qg != null) {
                            c45621qg.requestLayout();
                        }
                    }
                    Hl(i);
                    this.LLIIIILZ = i;
                }
                return LJIILIIL;
            }
            o.LJIJI("schemaParam");
            throw null;
        }
        C16800lI c16800lI2 = C16800lI.LIZIZ;
        o.LJFF(c16800lI2, "WindowInsetsCompat.CONSUMED");
        return c16800lI2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0191, code lost:
    
        if (r1.getRealHeight(mo49getActivity()) <= (r3 - Il(null))) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01bc, code lost:
    
        r13.setPadding(r13.getPaddingLeft(), Il(null) + r13.getPaddingTop(), r13.getPaddingRight(), r13.getPaddingBottom());
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01ba, code lost:
    
        if (r1.getRealHeight(mo49getActivity()) > (r3 - (Il(null) * 2))) goto L84;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r13, android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.hybrid.spark.page.SparkPopup.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void show(FragmentManager manager, String str) {
        o.LJIIJ(manager, "manager");
        C37682Eqc.LIZIZ(this.LJLLI, "SparkPopupLoadingProcess", i0.LJFF("SparkPopup show, tag = ", str));
        SparkContext sparkContext = this.LJLLI;
        if (sparkContext != null) {
            sparkContext.LJIIZILJ(2);
        }
        try {
            Field mDismissedField = DialogFragment.class.getDeclaredField("mDismissed");
            o.LJFF(mDismissedField, "mDismissedField");
            mDismissedField.setAccessible(true);
            mDismissedField.set(this, Boolean.FALSE);
            Field mShownByMeField = DialogFragment.class.getDeclaredField("mShownByMe");
            o.LJFF(mShownByMeField, "mShownByMeField");
            mShownByMeField.setAccessible(true);
            mShownByMeField.set(this, Boolean.TRUE);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SparkPopup mDismissedField = ");
            LIZ.append(mDismissedField.get(this));
            LIZ.append(", mShownByMeField = ");
            LIZ.append(mShownByMeField.get(this));
            C37682Eqc.LIZIZ(this.LJLLI, "SparkPopupLoadingProcess", X1D.LIZIZ(LIZ));
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        C1B3 c1b3 = new C1B3(manager);
        c1b3.LJIIIIZZ(0, 1, this, str);
        Gl(c1b3);
        C37682Eqc.LIZIZ(this.LJLLI, "SparkPopupLoadingProcess", "SparkPopup commitNowAllowingStateLoss, tag = " + str);
    }

    public final void Ol(Context context, SparkContext sparkContext, InterfaceC60816Nts interfaceC60816Nts) {
        o.LJIIJ(context, "context");
        o.LJIIJ(sparkContext, "sparkContext");
        C37682Eqc.LIZIZ(sparkContext, "SparkPopupLoadingProcess", "SparkPopup preload");
        sparkContext.LJII(InterfaceC60730NsU.class, new C60934Nvm(this));
        SparkFragment sparkFragment = this.LJLLJ;
        if (sparkFragment == null) {
            sparkFragment = new SparkFragment();
        }
        this.LJLLJ = sparkFragment;
        if (sparkContext.LJIILL() == null) {
            sparkContext.LJIJJ(this);
        }
        SparkFragment sparkFragment2 = this.LJLLJ;
        if (sparkFragment2 != null) {
            sparkFragment2.LJLJLJ = true;
            sparkFragment2.LJLJJL = sparkContext;
            sparkContext.LJII(InterfaceC60816Nts.class, interfaceC60816Nts);
            sparkFragment2.vl(context, sparkContext);
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = sparkFragment2.LJLJI;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
                sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LIZIZ();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        AbstractC60817Ntt abstractC60817Ntt;
        InterfaceC60176NjY interfaceC60176NjY;
        C60937Nvp c60937Nvp = this.LJZL;
        c60937Nvp.getClass();
        c60937Nvp.LIZ(this, new AqS63S0000000_10(i, i2, intent, 15));
        super.onActivityResult(i, i2, intent);
        InterfaceC58316Mue interfaceC58316Mue = this.LJZI;
        if (interfaceC58316Mue != null) {
            interfaceC58316Mue.onActivityResult(i, i2, intent);
        }
        SparkContext sparkContext = this.LJLLI;
        if (sparkContext != null && (interfaceC60176NjY = (InterfaceC60176NjY) sparkContext.LIZIZ(InterfaceC60176NjY.class)) != null) {
            interfaceC60176NjY.onActivityResult(i, i2, intent);
        }
        SparkContext sparkContext2 = this.LJLLI;
        if (sparkContext2 == null || (abstractC60817Ntt = (AbstractC60817Ntt) sparkContext2.LIZIZ(AbstractC60817Ntt.class)) == null) {
            return;
        }
        do {
            abstractC60817Ntt.onActivityResult(i, i2, intent);
            AbstractC60817Ntt next = abstractC60817Ntt.next();
            if (next != null && (next instanceof AbstractC60817Ntt)) {
                abstractC60817Ntt = next;
            } else {
                return;
            }
        } while (abstractC60817Ntt != null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:56|(1:58)(1:318)|59|(1:61)(1:317)|62|(1:64)(1:316)|65|(1:67)(1:315)|68|(1:70)(1:314)|71|(1:73)(1:313)|(8:(1:311)|93|(2:95|(2:97|(2:99|(4:101|(6:103|(1:105)(1:117)|106|(1:108)|109|(2:111|(1:113)(2:114|115)))|118|(2:120|(6:122|(1:124)|125|(1:127)|128|(2:130|(2:132|(2:134|(2:136|(2:138|(4:140|(1:232)|142|(2:144|(2:146|(8:148|(4:150|(2:152|(2:154|(1:156)(2:157|158))(2:159|160))|161|(2:163|(2:165|(6:167|(1:169)(1:193)|(1:192)|(1:172)(1:191)|173|(4:175|(1:177)(1:188)|178|(2:180|(2:182|(1:184))(2:185|186))(1:187))(2:189|190))(2:194|195))(2:196|197))(2:198|199))|200|(1:225)|202|(1:204)(1:224)|205|(2:207|(1:209)(2:220|221))(2:222|223))(2:226|227))(2:228|229))(2:230|231))(2:233|234))(2:235|236))(2:237|238))(2:239|240))(2:241|242))(2:243|244))(2:245|246))(2:247|248))(2:249|250))(2:251|252))(2:253|254))(6:255|(1:306)|257|(1:259)(1:305)|260|(2:262|(2:264|(2:266|(2:268|(3:270|(2:272|(2:274|(1:276)(2:278|279))(2:280|281))(2:282|(4:284|(1:286)(1:292)|287|(1:289)(2:290|291))(2:293|294))|277)(2:295|296))(2:297|298))(2:299|300))(2:301|302))(2:303|304))|210|211|(1:213)(1:217)|214|215)(2:76|(9:308|92|93|(0)(0)|210|211|(0)(0)|214|215)(3:84|(8:307|93|(0)(0)|210|211|(0)(0)|214|215)|90))|91|92|93|(0)(0)|210|211|(0)(0)|214|215) */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x05f2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x05f3, code lost:
    
        X.C3C5.m7constructorimpl(X.C141335gf.LIZ(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x041c, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r9.getGravity(), "bottom") != false) goto L200;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:213:0x05e5 A[Catch: all -> 0x05f2, TryCatch #0 {all -> 0x05f2, blocks: (B:211:0x05d0, B:213:0x05e5, B:214:0x05e7), top: B:210:0x05d0 }] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01be  */
    /* JADX WARN: Type inference failed for: r1v57 */
    /* JADX WARN: Type inference failed for: r1v58, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r1v60 */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r21, android.view.ViewGroup r22, android.os.Bundle r23) {
        /*
            Method dump skipped, instructions count: 1584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.hybrid.spark.page.SparkPopup.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i, String[] permissions, int[] grantResults) {
        o.LJIIJ(permissions, "permissions");
        o.LJIIJ(grantResults, "grantResults");
        super.onRequestPermissionsResult(i, permissions, grantResults);
        C60937Nvp c60937Nvp = this.LJZL;
        c60937Nvp.getClass();
        c60937Nvp.LIZ(this, new AqS74S0201000_10(i, permissions, grantResults, 1));
    }

    public static void Pl(SparkPopup sparkPopup, boolean z, boolean z2, int i, int i2) {
        BottomSheetBehavior<LinearLayout> bottomSheetBehavior;
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        if ((i2 & 4) != 0) {
            i = -1;
        }
        C60939Nvr c60939Nvr = LLIIZ;
        Window Jl = sparkPopup.Jl();
        sparkPopup.mo49getActivity();
        SparkPopupSchemaParam sparkPopupSchemaParam = sparkPopup.LJLL;
        if (sparkPopupSchemaParam != null) {
            c60939Nvr.getClass();
            int LIZIZ = C60939Nvr.LIZIZ(Jl, sparkPopupSchemaParam, sparkPopup, false);
            if (i <= -1) {
                i = LIZIZ;
            }
            if (z2 && (bottomSheetBehavior = sparkPopup.LJLLL) != null && bottomSheetBehavior.getPeekHeight() != i) {
                BottomSheetBehavior<LinearLayout> bottomSheetBehavior2 = sparkPopup.LJLLL;
                if (bottomSheetBehavior2 != null) {
                    if (bottomSheetBehavior2.LJJIIJ != 3) {
                        bottomSheetBehavior2.setPeekHeight(i);
                    } else {
                        bottomSheetBehavior2.LJIJJLI = i;
                    }
                    LinearLayout linearLayout = sparkPopup.LJLJI;
                    if (linearLayout != null) {
                        linearLayout.requestLayout();
                    } else {
                        o.LJIJI("popupContainer");
                        throw null;
                    }
                } else {
                    o.LJIJI("behavior");
                    throw null;
                }
            }
            if (z) {
                SparkPopupSchemaParam sparkPopupSchemaParam2 = sparkPopup.LJLL;
                if (sparkPopupSchemaParam2 != null) {
                    C131825Fi c131825Fi = sparkPopup.LJLJJI;
                    if (c131825Fi != null) {
                        new C60946Nvy(sparkPopupSchemaParam2, c131825Fi, sparkPopup, sparkPopup.Jl(), sparkPopup.mo49getActivity(), 0).invoke();
                        int Kl = sparkPopup.Kl();
                        SparkPopupSchemaParam sparkPopupSchemaParam3 = sparkPopup.LJLL;
                        if (sparkPopupSchemaParam3 != null) {
                            LinearLayout linearLayout2 = sparkPopup.LJLJI;
                            if (linearLayout2 != null) {
                                new C60946Nvy(sparkPopupSchemaParam3, linearLayout2, sparkPopup, sparkPopup.Jl(), sparkPopup.mo49getActivity(), Kl).invoke();
                                SparkPopupSchemaParam sparkPopupSchemaParam4 = sparkPopup.LJLL;
                                if (sparkPopupSchemaParam4 != null) {
                                    if (sparkPopupSchemaParam4.getSelfAdaptiveHeight() && !sparkPopup.LLIIIJ) {
                                        sparkPopup.LLIIIJ = true;
                                        return;
                                    }
                                    return;
                                }
                                o.LJIJI("schemaParam");
                                throw null;
                            }
                            o.LJIJI("popupContainer");
                            throw null;
                        }
                        o.LJIJI("schemaParam");
                        throw null;
                    }
                    o.LJIJI("popupInnerContainer");
                    throw null;
                }
                o.LJIJI("schemaParam");
                throw null;
            }
            return;
        }
        o.LJIJI("schemaParam");
        throw null;
    }
}
