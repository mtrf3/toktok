package X;

import android.view.View;
import android.widget.EditText;
import com.bytedance.tux.icon.TuxIconView;
import kotlin.jvm.internal.o;

/* renamed from: X.4Xv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C111154Xv {
    public final View LIZ;
    public final View LIZIZ;
    public final TuxIconView LIZJ;
    public final View LIZLLL;
    public final EditText LJ;
    public final View LJFF;
    public final C4EF LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C111154Xv)) {
            return false;
        }
        C111154Xv c111154Xv = (C111154Xv) obj;
        return o.LJ(this.LIZ, c111154Xv.LIZ) && o.LJ(this.LIZIZ, c111154Xv.LIZIZ) && o.LJ(this.LIZJ, c111154Xv.LIZJ) && o.LJ(this.LIZLLL, c111154Xv.LIZLLL) && o.LJ(this.LJ, c111154Xv.LJ) && o.LJ(this.LJFF, c111154Xv.LJFF) && o.LJ(this.LJI, c111154Xv.LJI);
    }

    public final int hashCode() {
        int hashCode = (this.LIZJ.hashCode() + ((this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31)) * 31;
        View view = this.LIZLLL;
        int hashCode2 = (this.LJFF.hashCode() + ((this.LJ.hashCode() + ((hashCode + (view == null ? 0 : view.hashCode())) * 31)) * 31)) * 31;
        C4EF c4ef = this.LJI;
        return hashCode2 + (c4ef != null ? c4ef.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ViewRefs(chatContainer=");
        LIZ.append(this.LIZ);
        LIZ.append(", sendBtn=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", micBtn=");
        LIZ.append(this.LIZJ);
        LIZ.append(", keyboardBtn=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", editText=");
        LIZ.append(this.LJ);
        LIZ.append(", inputArea=");
        LIZ.append(this.LJFF);
        LIZ.append(", httView=");
        LIZ.append(this.LJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C111154Xv(View view, View view2, TuxIconView tuxIconView, TuxIconView tuxIconView2, C4YG c4yg, View view3, C4EF c4ef) {
        this.LIZ = view;
        this.LIZIZ = view2;
        this.LIZJ = tuxIconView;
        this.LIZLLL = tuxIconView2;
        this.LJ = c4yg;
        this.LJFF = view3;
        this.LJI = c4ef;
    }
}
