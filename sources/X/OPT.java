package X;

import android.text.InputFilter;
import android.widget.EditText;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OPT {
    public static final void LIZ(EditText editText, int i) {
        InputFilter[] inputFilterArr;
        if (editText == null || i < 0) {
            return;
        }
        InputFilter[] filters = editText.getFilters();
        o.LJIIIIZZ(filters, "editText.filters");
        if (filters.length == 0) {
            inputFilterArr = new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(i)};
        } else {
            InputFilter[] filters2 = editText.getFilters();
            o.LJIIIIZZ(filters2, "editText.filters");
            inputFilterArr = (InputFilter[]) C47261Igj.LJJIJLIJ(OJ4.LJJLIIIJ(OJ4.LJJJLL(OJ4.LJJJJ(ORY.LJJIIZ(filters2), OPU.LJLIL), new InputFilter.LengthFilter(i)))).toArray(new InputFilter[0]);
        }
        editText.setFilters(inputFilterArr);
    }
}
