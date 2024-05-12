package X;

import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.internal.o;

/* renamed from: X.4gO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C115684gO {
    public final TuxTextView LIZ;
    public final View LIZIZ;
    public final TuxIconView LIZJ;
    public final TuxIconView LIZLLL;
    public final TextView LJ;
    public final FrameLayout LJFF;
    public SparseArray<Integer> LJI;

    public C115684gO() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C115684gO)) {
            return false;
        }
        C115684gO c115684gO = (C115684gO) obj;
        return o.LJ(this.LIZ, c115684gO.LIZ) && o.LJ(this.LIZIZ, c115684gO.LIZIZ) && o.LJ(this.LIZJ, c115684gO.LIZJ) && o.LJ(this.LIZLLL, c115684gO.LIZLLL) && o.LJ(this.LJ, c115684gO.LJ) && o.LJ(this.LJFF, c115684gO.LJFF) && o.LJ(this.LJI, c115684gO.LJI);
    }

    public final int hashCode() {
        TuxTextView tuxTextView = this.LIZ;
        int hashCode = (tuxTextView == null ? 0 : tuxTextView.hashCode()) * 31;
        View view = this.LIZIZ;
        int hashCode2 = (hashCode + (view == null ? 0 : view.hashCode())) * 31;
        TuxIconView tuxIconView = this.LIZJ;
        int hashCode3 = (hashCode2 + (tuxIconView == null ? 0 : tuxIconView.hashCode())) * 31;
        TuxIconView tuxIconView2 = this.LIZLLL;
        int hashCode4 = (hashCode3 + (tuxIconView2 == null ? 0 : tuxIconView2.hashCode())) * 31;
        TextView textView = this.LJ;
        int hashCode5 = (hashCode4 + (textView == null ? 0 : textView.hashCode())) * 31;
        FrameLayout frameLayout = this.LJFF;
        return this.LJI.hashCode() + ((hashCode5 + (frameLayout != null ? frameLayout.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoShareViewProvider(shareTipsTv=");
        LIZ.append(this.LIZ);
        LIZ.append(", shareTipsRl=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", shareLeftIcon=");
        LIZ.append(this.LIZJ);
        LIZ.append(", shareRightEnter=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", shareRightUndo=");
        LIZ.append(this.LJ);
        LIZ.append(", bottomView=");
        LIZ.append(this.LJFF);
        LIZ.append(", bottomChildren=");
        LIZ.append(this.LJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C115684gO(TuxTextView tuxTextView, View view, TuxIconView tuxIconView, TuxIconView tuxIconView2, TextView textView) {
        SparseArray<Integer> sparseArray = new SparseArray<>();
        this.LIZ = tuxTextView;
        this.LIZIZ = view;
        this.LIZJ = tuxIconView;
        this.LIZLLL = tuxIconView2;
        this.LJ = textView;
        this.LJFF = null;
        this.LJI = sparseArray;
    }
}
