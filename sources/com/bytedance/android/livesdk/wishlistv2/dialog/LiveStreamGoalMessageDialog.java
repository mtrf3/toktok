package com.bytedance.android.livesdk.wishlistv2.dialog;

import X.C10A;
import X.C15380j0;
import X.C16880lQ;
import X.C28507BGt;
import X.C29946Bp8;
import X.C47121t6;
import X.InterfaceC05190Ih;
import X.InterfaceC29942Bp4;
import X.ViewOnClickListenerC29941Bp3;
import Y.ACListenerS25S0100000_5;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveStreamGoalMessageDialog extends LiveDialogFragment implements InterfaceC29942Bp4 {
    public InterfaceC05190Ih LJLILLLLZI;
    public C47121t6 LJLJI;
    public LiveEditText LJLJJL;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();
    public final ArrayList<C29946Bp8> LJLIL = new ArrayList<>();
    public Long LJLJJI = 0L;

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
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
        C28507BGt c28507BGt = new C28507BGt(R.layout.d14);
        c28507BGt.LJIILIIL = 32;
        c28507BGt.LJII = 80;
        return c28507BGt;
    }

    @Override // X.InterfaceC29942Bp4
    public final void j8() {
        Iterator<C29946Bp8> it = this.LJLIL.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().LIZ) {
                i++;
            }
        }
        if (i > 0) {
            C47121t6 c47121t6 = this.LJLJI;
            if (c47121t6 != null) {
                c47121t6.setText(C15380j0.LJIILL(R.string.lqt, Integer.valueOf(i)));
            }
            C47121t6 c47121t62 = this.LJLJI;
            if (c47121t62 != null) {
                C16880lQ.LJJIIZ(c47121t62, new ACListenerS25S0100000_5(this, 258));
            }
            C47121t6 c47121t63 = this.LJLJI;
            if (c47121t63 != null) {
                c47121t63.setTextColor(C15380j0.LIZIZ(R.color.ar));
            }
            C47121t6 c47121t64 = this.LJLJI;
            if (c47121t64 != null) {
                c47121t64.setBackgroundColor(C15380j0.LIZIZ(R.color.c1));
                return;
            }
            return;
        }
        C47121t6 c47121t65 = this.LJLJI;
        if (c47121t65 != null) {
            c47121t65.setText(C15380j0.LJIILJJIL(R.string.o1j));
        }
        C47121t6 c47121t66 = this.LJLJI;
        if (c47121t66 != null) {
            C16880lQ.LJJIIZ(c47121t66, ViewOnClickListenerC29941Bp3.LJLIL);
        }
        C47121t6 c47121t67 = this.LJLJI;
        if (c47121t67 != null) {
            c47121t67.setTextColor(C15380j0.LIZIZ(R.color.cn));
        }
        C47121t6 c47121t68 = this.LJLJI;
        if (c47121t68 == null) {
            return;
        }
        c47121t68.setBackgroundColor(C15380j0.LIZIZ(R.color.al));
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Context context;
        Dialog dialog;
        View currentFocus;
        if (this.isViewValid && (context = getContext()) != null && (dialog = getDialog()) != null && (currentFocus = dialog.getCurrentFocus()) != null) {
            Object LLILL = C16880lQ.LLILL(context, "input_method");
            o.LJII(LLILL, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            InputMethodManager inputMethodManager = (InputMethodManager) LLILL;
            if (inputMethodManager.isActive()) {
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            }
        }
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0102, code lost:
    
        if (r7 != null) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vb() {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.wishlistv2.dialog.LiveStreamGoalMessageDialog.vb():void");
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        Window window2;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.setLayout(-1, -1);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window = dialog2.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            ViewTreeLifecycleOwner.set(decorView, this);
            ViewTreeViewModelStoreOwner.set(decorView, this);
            C10A.LIZIZ(decorView, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0167 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0176  */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r14, android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.wishlistv2.dialog.LiveStreamGoalMessageDialog.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
