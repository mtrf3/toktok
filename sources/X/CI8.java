package X;

import android.text.InputFilter;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CI8 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C31089CIb et, InputFilter inputFilter) {
        o.LJIIIZ(et, "et");
        if (inputFilter != null) {
            InputFilter[] filters = et.getFilters();
            o.LJIIIIZZ(filters, "filters");
            ArrayList arrayList = (ArrayList) ORY.LJLIIIL(filters);
            arrayList.remove(inputFilter);
            et.setFilters((InputFilter[]) arrayList.toArray(new InputFilter[0]));
        }
    }
}
