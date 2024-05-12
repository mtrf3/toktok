package com.bytedance.android.live.effect.input;

import X.C08780Wc;
import X.C0P2;
import X.C0WB;
import X.C0YJ;
import X.C10A;
import X.C12880ey;
import X.C15380j0;
import X.C15G;
import X.C16880lQ;
import X.C28507BGt;
import X.C76800UCe;
import X.C78983UzD;
import X.InterfaceC88472Yns;
import Y.IDCListenerS135S0100000;
import Y.IDObjectS173S0100000;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.common.keyboard.MeasureLinearLayout;
import com.bytedance.android.live.effect.input.EffectTextInputFragment;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class EffectTextInputFragment extends LiveDialogFragment implements C15G {
    public boolean LJLILLLLZI;
    public InterfaceC88472Yns<? super Boolean, C76800UCe> LJLJI;
    public C0YJ LJLJJI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();
    public final int LJLIL = 50;

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJL;
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

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.dcj);
        C78983UzD.LJIILIIL(c28507BGt);
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        if (this.LJLILLLLZI) {
            dismiss();
        }
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        Window window2;
        Window window3;
        super.onStart();
        C78983UzD.LJJLIIIJJIZ(this);
        _$_findCachedViewById(R.id.cq8).requestFocus();
        Dialog dialog = getDialog();
        if (dialog != null && (window3 = dialog.getWindow()) != null) {
            C0P2.LIZ(window3);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window2 = dialog2.getWindow()) != null) {
            window2.setSoftInputMode(5);
        }
        InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns = this.LJLJI;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Boolean.TRUE);
        }
        Dialog dialog3 = getDialog();
        if (dialog3 != null && (window = dialog3.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            ViewTreeLifecycleOwner.set(decorView, this);
            ViewTreeViewModelStoreOwner.set(decorView, this);
            C10A.LIZIZ(decorView, this);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        C0WB c0wb;
        o.LJIIIZ(dialog, "dialog");
        C08780Wc c08780Wc = C12880ey.LIZ().LJ;
        if (c08780Wc != null && (c0wb = c08780Wc.LIZJ) != null) {
            c0wb.LJ();
        }
        InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns = this.LJLJI;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Boolean.FALSE);
        }
        super.onDismiss(dialog);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        mo49getActivity();
        o.LJIIIIZZ(onGetLayoutInflater, "getLayoutInflater(\n     …      activity,\n        )");
        return onGetLayoutInflater;
    }

    @Override // X.C15G
    public final void LLILLL(int i, boolean z) {
        if (this.isViewValid) {
            if (z) {
                this.LJLILLLLZI = true;
                return;
            }
            if (this.LJLILLLLZI) {
                dismiss();
            }
            this.LJLILLLLZI = false;
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) _$_findCachedViewById(R.id.cq8);
        if (textView != null) {
            textView.addTextChangedListener(new IDObjectS173S0100000(this, 3));
        }
        TextView textView2 = (TextView) _$_findCachedViewById(R.id.cq8);
        if (textView2 != null) {
            textView2.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: X.0qR
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView3, int i, KeyEvent keyEvent) {
                    EffectTextInputFragment.this.dismiss();
                    return true;
                }
            });
        }
        View view2 = getView();
        if (view2 != null) {
            C16880lQ.LJIIJ(new IDCListenerS135S0100000(this, 75), view2);
        }
        ((MeasureLinearLayout) _$_findCachedViewById(R.id.ggi)).setWindowInsetsEnable(true);
        ((MeasureLinearLayout) _$_findCachedViewById(R.id.ggi)).setWindowInsetsKeyboardObserver(this);
        if (C15380j0.LJIIZILJ()) {
            TextView textView3 = (TextView) _$_findCachedViewById(R.id.cq8);
            if (textView3 == null) {
                return;
            }
            textView3.setGravity(8388629);
            return;
        }
        TextView textView4 = (TextView) _$_findCachedViewById(R.id.cq8);
        if (textView4 == null) {
            return;
        }
        textView4.setGravity(8388627);
    }
}
