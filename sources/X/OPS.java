package X;

import android.text.InputFilter;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OPS {
    public static final void LIZ(T5T t5t, int i) {
        InputFilter[] inputFilterArr;
        if (t5t == null || i < 0) {
            return;
        }
        InputFilter[] filters = t5t.getFilters();
        o.LJIIIIZZ(filters, "editText.filters");
        if (filters.length == 0) {
            inputFilterArr = new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(i)};
        } else {
            InputFilter[] filters2 = t5t.getFilters();
            o.LJIIIIZZ(filters2, "editText.filters");
            inputFilterArr = (InputFilter[]) C47261Igj.LJJIJLIJ(OJ4.LJJLIIIJ(OJ4.LJJJLL(OJ4.LJJJJ(ORY.LJJIIZ(filters2), OPV.LJLIL), new InputFilter.LengthFilter(i)))).toArray(new InputFilter[0]);
        }
        t5t.setFilters(inputFilterArr);
    }
}
