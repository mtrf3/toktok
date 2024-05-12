package com.ss.android.ugc.aweme.ecommerce.common;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C221108m2;
import X.C238659Yf;
import X.C45621qg;
import X.C61712OJw;
import X.C61713OJx;
import X.C62822Ol8;
import X.DialogInterfaceOnKeyListenerC70548RmS;
import X.InterfaceC25830ABu;
import Y.ARunnableS48S0100000_12;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.utils.Au2S20S0100000_12;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public abstract class ECBaseSheetFragment extends ECBaseFragment implements InterfaceC25830ABu, DialogInterface.OnDismissListener {
    public boolean LJLJJI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 314));
    public int LJLILLLLZI = 4;
    public boolean LJLJI = true;

    public abstract void Al(TuxSheet tuxSheet, float f);

    public abstract void Dl(int i, int i2, boolean z);

    public abstract void Gl();

    public abstract void Il();

    public boolean LJIIJ() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
    public View _$_findCachedViewById(int i) {
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

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public abstract void wl(C45621qg c45621qg);

    public abstract boolean xl();

    public final Dialog getDialog() {
        DialogFragment dialogFragment;
        Fragment parentFragment = getParentFragment();
        if (!(parentFragment instanceof DialogFragment) || (dialogFragment = (DialogFragment) parentFragment) == null) {
            return null;
        }
        return dialogFragment.getDialog();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.LJLJJI = true;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        C61713OJx LIZIZ;
        Window window;
        int i;
        super.onResume();
        boolean z = false;
        try {
            Dialog dialog = getDialog();
            if (dialog != null && (window = dialog.getWindow()) != null) {
                if (this.LJLJJI) {
                    if (!shouldDowngrade()) {
                        i = R.style.a60;
                        window.setWindowAnimations(i);
                    } else {
                        i = R.style.a61;
                        window.setWindowAnimations(i);
                    }
                } else {
                    if (!shouldDowngrade()) {
                        i = R.style.a5w;
                        window.setWindowAnimations(i);
                    }
                    i = R.style.a61;
                    window.setWindowAnimations(i);
                }
            }
            View view = getView();
            if (view != null) {
                view.postDelayed(new ARunnableS48S0100000_12(this, 26), 100L);
            }
            this.LJLJJI = false;
            boolean xl = xl();
            if (xl) {
                Dialog dialog2 = getDialog();
                if (dialog2 != null) {
                    ActivityC45651qj requireActivity = requireActivity();
                    o.LJIIIIZZ(requireActivity, "requireActivity()");
                    LIZIZ = C61712OJw.LIZLLL(requireActivity, dialog2);
                } else {
                    LIZIZ = C61712OJw.LIZIZ(this);
                }
            } else {
                LIZIZ = C61712OJw.LIZIZ(this);
            }
            if (!xl || this.LJLILLLLZI != 4) {
                z = true;
            }
            LIZIZ.LIZIZ.LJIIJ(z);
            LIZIZ.LIZIZ.LJIIL();
            LIZIZ.LJ(R.attr.cl);
            LIZIZ.LIZIZ.LJII(true);
            LIZIZ.LIZJ();
        } catch (Throwable th) {
            this.LJLJJI = false;
            throw th;
        }
    }

    public final boolean shouldDowngrade() {
        if (downgrade()) {
            C238659Yf.LIZ.getClass();
            if (C238659Yf.LIZ()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x000f, code lost:
    
        r1 = (android.view.View) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0013, code lost:
    
        if ((r1 instanceof X.C45621qg) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0018, code lost:
    
        return (X.C45621qg) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0021, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0005, code lost:
    
        if (r1 != null) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0007, code lost:
    
        r1 = r1.getParent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if ((r1 instanceof X.C45621qg) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if ((r1 instanceof android.view.View) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
    
        r1 = (android.view.View) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r1 != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C45621qg vl() {
        /*
            r3 = this;
            android.view.View r1 = r3.getView()
            r2 = 0
            if (r1 == 0) goto L21
        L7:
            android.view.ViewParent r1 = r1.getParent()
            boolean r0 = r1 instanceof X.C45621qg
            if (r0 == 0) goto L19
            android.view.View r1 = (android.view.View) r1
        L11:
            boolean r0 = r1 instanceof X.C45621qg
            if (r0 == 0) goto L18
            r2 = r1
            X.1qg r2 = (X.C45621qg) r2
        L18:
            return r2
        L19:
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L21
            android.view.View r1 = (android.view.View) r1
            if (r1 != 0) goto L7
        L21:
            r1 = r2
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment.vl():X.1qg");
    }

    public static final void Hl(TuxSheet tuxSheet, boolean z) {
        Dialog dialog = tuxSheet.getDialog();
        if (dialog != null) {
            ActivityC45651qj requireActivity = tuxSheet.requireActivity();
            o.LJIIIIZZ(requireActivity, "sheet.requireActivity()");
            C61713OJx LIZLLL = C61712OJw.LIZLLL(requireActivity, dialog);
            LIZLLL.LIZIZ.LJIIJ(z);
            LIZLLL.LIZIZ.LJIIL();
            LIZLLL.LJFF(-16777216);
            LIZLLL.LIZIZ.LJII(true);
            LIZLLL.LIZ(false);
            LIZLLL.LIZJ();
        }
    }

    @Override // X.InterfaceC25830ABu
    public final void I7(TuxSheet sheet, float f) {
        o.LJIIIZ(sheet, "sheet");
        if (Float.isNaN(f)) {
            return;
        }
        Al(sheet, f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003c, code lost:
    
        if (r9 != 5) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
    
        if (r9 != 3) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
    
        if (r9 != 5) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002c A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Pg(com.bytedance.tux.sheet.sheet.TuxSheet r8, int r9) {
        /*
            r7 = this;
            java.lang.String r0 = "sheet"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            r6 = 0
            r5 = 1
            r4 = 4
            r3 = 3
            r2 = 5
            if (r9 == r3) goto L43
            if (r9 == r4) goto L3f
            if (r9 == r2) goto L3f
            if (r9 == r3) goto L46
        L12:
            if (r9 == r4) goto L46
            if (r9 == r2) goto L46
        L16:
            boolean r0 = r7.LJLJI
            if (r0 == 0) goto L35
            if (r9 != r2) goto L35
            r7.Gl()
            r8.dismiss()
        L22:
            r7.LJLJI = r5
        L24:
            r7.LJLILLLLZI = r9
        L26:
            X.1qg r1 = r7.vl()
            if (r1 != 0) goto L2d
        L2c:
            return
        L2d:
            r0 = 2
            if (r9 == r0) goto L31
            r6 = 1
        L31:
            r1.setEnabled(r6)
            goto L2c
        L35:
            if (r9 != r2) goto L38
            goto L22
        L38:
            if (r9 == r3) goto L24
            if (r9 == r4) goto L24
            if (r9 == r2) goto L24
            goto L26
        L3f:
            Hl(r8, r6)
            goto L12
        L43:
            Hl(r8, r5)
        L46:
            int r1 = r7.LJLILLLLZI
            boolean r0 = r7.LJLJI
            r7.Dl(r1, r9, r0)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment.Pg(com.bytedance.tux.sheet.sheet.TuxSheet, int):void");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        DialogFragment dialogFragment;
        Dialog dialog;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (xl()) {
            C45621qg vl = vl();
            wl(vl);
            if (vl != null) {
                View findViewById = vl.findViewById(R.id.liz);
                o.LJIIIIZZ(findViewById, "findViewById<View>(R.id.touch_outside)");
                C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 107, 42), findViewById);
            }
            Fragment parentFragment = getParentFragment();
            if ((parentFragment instanceof DialogFragment) && (dialogFragment = (DialogFragment) parentFragment) != null && (dialog = dialogFragment.getDialog()) != null) {
                dialog.setOnKeyListener(new DialogInterfaceOnKeyListenerC70548RmS(this));
            }
        }
    }
}
