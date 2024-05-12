package com.bytedance.tux.sheet;

import X.ASP;
import X.C10A;
import X.C1B3;
import X.C32151Nz;
import X.C45804HyK;
import X.C61712OJw;
import X.C61713OJx;
import X.C63081OpJ;
import X.X1D;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tux.sheet.BaseSheet;
import com.ss.android.agilelogger.ALog;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class BaseSheet extends AppCompatDialogFragment {
    public static final float LJLL = C32151Nz.LJIIZILJ(12);
    public DialogInterface.OnCancelListener LJLIL;
    public DialogInterface.OnDismissListener LJLILLLLZI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public Integer LJLJJLL;
    public Integer LJLJL;
    public boolean LJLJLJ;
    public final Map<Integer, View> LJLJLLL = new LinkedHashMap();
    public boolean LJLJI = true;

    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLLL).clear();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public int vl() {
        return R.style.ad6;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        View decorView;
        ViewTreeObserver viewTreeObserver;
        super.onStart();
        if (!this.LJLJLJ) {
            Dialog dialog = getDialog();
            o.LJII(dialog, "null cannot be cast to non-null type com.bytedance.tux.sheet.BaseSheet.InnerBottomSheetDialog");
            final int i = ((ASP) dialog).LJLJLLL;
            C61713OJx LIZ = C61712OJw.LIZ(this);
            LIZ.LIZIZ.LJIIL();
            LIZ.LJFF(i);
            LIZ.LIZ(true);
            LIZ.LIZJ();
            View view = getView();
            if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
                viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.4ah
                    public int LJLIL = -1;

                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public final void onGlobalLayout() {
                        Object obj;
                        Window window2;
                        View decorView2;
                        BaseSheet baseSheet = BaseSheet.this;
                        View view2 = baseSheet.getView();
                        baseSheet.getClass();
                        do {
                            if (view2 != null) {
                                obj = view2.getParent();
                            } else {
                                obj = null;
                            }
                            if (obj instanceof C45621qg) {
                                View view3 = (View) obj;
                                if (view3 != null && this.LJLIL != view3.getMeasuredHeight()) {
                                    this.LJLIL = view3.getMeasuredHeight();
                                    int[] iArr = new int[2];
                                    view3.getLocationInWindow(iArr);
                                    int measuredHeight = view3.getMeasuredHeight() + iArr[1];
                                    GradientDrawable gradientDrawable = new GradientDrawable();
                                    GradientDrawable LIZIZ = T28.LIZIZ(0);
                                    LIZIZ.setColor(i);
                                    LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, LIZIZ});
                                    layerDrawable.setLayerInset(1, 0, measuredHeight, 0, 0);
                                    Dialog dialog2 = BaseSheet.this.getDialog();
                                    if (dialog2 == null || (window2 = dialog2.getWindow()) == null || (decorView2 = window2.getDecorView()) == null) {
                                        return;
                                    }
                                    decorView2.setBackground(layerDrawable);
                                    return;
                                }
                                return;
                            }
                            if (!(obj instanceof View)) {
                                return;
                            } else {
                                view2 = (View) obj;
                            }
                        } while (view2 != null);
                    }
                });
            }
            this.LJLJLJ = true;
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window = dialog2.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            ViewTreeLifecycleOwner.set(decorView, this);
            ViewTreeViewModelStoreOwner.set(decorView, this);
            C10A.LIZIZ(decorView, this);
        }
        if (getContext() != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("context is ");
            LIZ2.append(getContext().getClass());
            LIZ2.append(", this is ");
            LIZ2.append(this);
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("TUX", X1D.LIZIZ(LIZ2));
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialog) {
        o.LJIIIZ(dialog, "dialog");
        super.onCancel(dialog);
        DialogInterface.OnCancelListener onCancelListener = this.LJLIL;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialog);
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            dismissAllowingStateLoss();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Context context;
        if (this.LJLJL != null) {
            Context context2 = getContext();
            o.LJI(context2);
            Context context3 = getContext();
            o.LJI(context3);
            Integer num = this.LJLJL;
            o.LJI(num);
            context = new ContextThemeWrapper(context2, C45804HyK.LJJIII(context3, C45804HyK.LJJIL(num.intValue())));
        } else if (this.LJLJJLL != null) {
            Context context4 = getContext();
            o.LJI(context4);
            Integer num2 = this.LJLJJLL;
            o.LJI(num2);
            context = new ContextThemeWrapper(context4, num2.intValue());
        } else {
            context = getContext();
            o.LJI(context);
        }
        ASP asp = new ASP(context, this.LJLJL);
        asp.setCanceledOnTouchOutside(this.LJLJI);
        asp.LJLLILLLL = this.LJLJJI;
        asp.LJLLJ = this.LJLJJL;
        Window window = asp.getWindow();
        if (window != null) {
            window.setWindowAnimations(vl());
        }
        return asp;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        o.LJIIIZ(dialog, "dialog");
        super.onDismiss(dialog);
        DialogInterface.OnDismissListener onDismissListener = this.LJLILLLLZI;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialog);
        }
        this.LJLJLJ = false;
    }

    public final int wl(int i) {
        if (getContext() != null) {
            float LJJJJJL = i / C63081OpJ.LJJJJJL(r0);
            if (LJJJJJL < 0.33333334f) {
                return R.style.ad5;
            }
            if (LJJJJJL >= 0.6666667f) {
                return R.style.ad4;
            }
        }
        return R.style.ad6;
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void show(FragmentManager manager, String str) {
        o.LJIIIZ(manager, "manager");
        try {
            Field declaredField = DialogFragment.class.getDeclaredField("mDismissed");
            declaredField.setAccessible(true);
            declaredField.set(this, Boolean.FALSE);
            Field declaredField2 = DialogFragment.class.getDeclaredField("mShownByMe");
            declaredField2.setAccessible(true);
            declaredField2.set(this, Boolean.TRUE);
        } catch (Exception unused) {
        }
        C1B3 c1b3 = new C1B3(manager);
        if (isAdded()) {
            c1b3.LJIIL(this);
        } else {
            c1b3.LJIIIIZZ(0, 1, this, str);
        }
        c1b3.LJI();
    }
}
