package com.zhihu.matisse.internal.ui;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C29S;
import X.C3C5;
import X.C76800UCe;
import X.C90903hW;
import X.InterfaceC80644Vku;
import X.X1D;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class PreviewItemFragment extends Fragment {
    public InterfaceC80644Vku LJLIL;

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.LJLIL = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof InterfaceC80644Vku) {
            this.LJLIL = (InterfaceC80644Vku) context;
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(context.toString());
        LIZ.append(" must implement OnFragmentInteractionListener");
        throw new RuntimeException(X1D.LIZIZ(LIZ));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:5|(1:7)(1:75)|8|(2:9|10)|(2:12|13)|(3:15|16|17)|21|22|23|(5:25|(1:27)|(1:33)(2:40|(1:42)(1:43))|34|(2:36|37)(2:38|39))(2:44|(1:46)(2:47|48))|28|(1:31)|(0)(0)|34|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0090, code lost:
    
        if (r2 == 0) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a4 A[Catch: IOException | NullPointerException -> 0x00d5, TryCatch #0 {IOException | NullPointerException -> 0x00d5, blocks: (B:23:0x009e, B:25:0x00a4, B:27:0x00aa, B:44:0x00b0, B:46:0x00b7, B:47:0x00bd, B:48:0x00c4), top: B:22:0x009e }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b0 A[Catch: IOException | NullPointerException -> 0x00d5, TryCatch #0 {IOException | NullPointerException -> 0x00d5, blocks: (B:23:0x009e, B:25:0x00a4, B:27:0x00aa, B:44:0x00b0, B:46:0x00b7, B:47:0x00bd, B:48:0x00c4), top: B:22:0x009e }] */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12, types: [X.W5O, REQUEST] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r7v1, types: [X.V9s, android.widget.ImageView, X.Vko, X.Vkk] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r15, android.os.Bundle r16) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zhihu.matisse.internal.ui.PreviewItemFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.ax3, viewGroup, false);
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
