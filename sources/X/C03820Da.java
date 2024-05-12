package X;

import android.content.Context;
import android.util.SparseArray;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;

/* renamed from: X.0Da, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03820Da {
    public final Context LIZ;
    public final int LIZIZ;
    public final ViewGroup LIZJ;

    public final void LIZ() {
        if (this.LIZIZ > 0) {
            this.LIZJ.removeAllViews();
            if (this.LIZIZ > 0) {
                C16880lQ.LLLZIIL(this.LIZIZ, C16880lQ.LLZIL(this.LIZ), this.LIZJ);
            } else {
                this.LIZJ.addView(null);
            }
        }
        this.LIZJ.setTag(R.id.ljk, this);
    }

    public C03820Da(Context context, int i, ViewGroup viewGroup) {
        this.LIZIZ = -1;
        this.LIZ = context;
        this.LIZJ = viewGroup;
        this.LIZIZ = i;
    }

    public static C03820Da LIZIZ(Context context, int i, ViewGroup viewGroup) {
        SparseArray sparseArray = (SparseArray) viewGroup.getTag(R.id.ljz);
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            viewGroup.setTag(R.id.ljz, sparseArray);
        }
        C03820Da c03820Da = (C03820Da) sparseArray.get(i);
        if (c03820Da != null) {
            return c03820Da;
        }
        C03820Da c03820Da2 = new C03820Da(context, i, viewGroup);
        sparseArray.put(i, c03820Da2);
        return c03820Da2;
    }
}
