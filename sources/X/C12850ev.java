package X;

import android.app.Dialog;
import android.os.Build;
import android.util.LongSparseArray;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0ev, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12850ev {
    public final LongSparseArray<C12830et> LIZ = new LongSparseArray<>();
    public final List<C12830et> LIZIZ = new ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:38:0x008e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0132 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12850ev.LIZIZ():void");
    }

    public final void LIZJ() {
        Dialog dialog;
        InterfaceC32911Qx LIZLLL;
        Fragment fragment;
        int Ng;
        if (((ArrayList) this.LIZIZ).isEmpty()) {
            return;
        }
        C12830et c12830et = (C12830et) ListProtector.get(this.LIZIZ, ((ArrayList) r1).size() - 1);
        if (!c12830et.LJIIJJI && (dialog = c12830et.LIZLLL.getDialog()) != null && dialog.getWindow() != null && (LIZLLL = c12830et.LIZLLL()) != null && (fragment = LIZLLL.getFragment()) != null && fragment.getView() != null) {
            View view = fragment.getView();
            Object tag = view.getTag(R.id.fyv);
            if (tag != null) {
                Ng = ((Integer) tag).intValue();
            } else {
                Ng = LIZLLL.Ng(new ContextThemeWrapper(view.getContext(), LIZLLL.getThemeOverlay(view.getContext())));
                view.setTag(R.id.fyv, Integer.valueOf(Ng));
            }
            C42661lu c42661lu = c12830et.LIZLLL.LJLJJLL;
            if (c42661lu != null) {
                c42661lu.setColor(Ng);
            }
        }
    }

    public final void LIZLLL() {
        int i;
        SheetOptions g1;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 23 || ((ArrayList) this.LIZIZ).isEmpty()) {
            return;
        }
        C12830et c12830et = (C12830et) ListProtector.get(this.LIZIZ, ((ArrayList) r1).size() - 1);
        View view = c12830et.LIZLLL.getView();
        if (view == null) {
            return;
        }
        InterfaceC32911Qx LIZLLL = c12830et.LIZLLL();
        int systemUiVisibility = view.getSystemUiVisibility();
        if (LIZLLL != null && (g1 = LIZLLL.g1()) != null) {
            if (!g1.fullscreenEnabled || !LIZLLL.LJJJLZIJ() || LIZLLL.n5()) {
                i = systemUiVisibility & (-8193);
            } else {
                i = systemUiVisibility | FileUtils.BUFFER_SIZE;
            }
        } else {
            i = systemUiVisibility;
        }
        if (i2 >= 26) {
            if (LIZLLL instanceof InterfaceC32901Qw) {
                i &= -17;
            } else {
                i |= 16;
            }
        }
        if (i != systemUiVisibility) {
            view.setSystemUiVisibility(i);
        }
    }

    public final boolean LIZ(long j) {
        if (((ArrayList) this.LIZIZ).isEmpty()) {
            return false;
        }
        for (int i = 0; i < ((ArrayList) this.LIZIZ).size(); i++) {
            if (((C12830et) ListProtector.get(this.LIZIZ, i)).LJIIIIZZ == j) {
                return true;
            }
        }
        return false;
    }
}
