package X;

import android.content.res.Resources;
import android.content.res.TypedArray;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HND<T> implements InterfaceC139745e6 {
    public static final HND<T> LJLIL = new HND<>();

    @Override // X.InterfaceC139745e6
    public final Object get() {
        Resources resources = C60903NvH.LJ.getResources();
        String[] stringArray = resources.getStringArray(R.array.at);
        o.LJIIIIZZ(stringArray, "resources.getStringArray…array.ss_filter_optimize)");
        String[] stringArray2 = resources.getStringArray(R.array.as);
        o.LJIIIIZZ(stringArray2, "resources.getStringArray….ss_filter_name_optimize)");
        TypedArray obtainTypedArray = resources.obtainTypedArray(R.array.au);
        o.LJIIIIZZ(obtainTypedArray, "resources.obtainTypedArr….array.ss_image_optimize)");
        ArrayList arrayList = new ArrayList(stringArray.length);
        int length = stringArray.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            arrayList.add(Integer.valueOf(obtainTypedArray.getResourceId(i2, 0)));
            i++;
            i2++;
        }
        Integer[] numArr = (Integer[]) arrayList.toArray(new Integer[0]);
        obtainTypedArray.recycle();
        ArrayList arrayList2 = new ArrayList(stringArray.length);
        int length2 = stringArray.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length2) {
            String LLLZ = C16880lQ.LLLZ("Filter_%02d/", Arrays.copyOf(new Object[]{Integer.valueOf(i4)}, 1));
            o.LJIIIIZZ(LLLZ, "format(format, *args)");
            arrayList2.add(LLLZ);
            i3++;
            i4++;
        }
        return new WRE(stringArray, stringArray2, numArr, (String[]) arrayList2.toArray(new String[0]));
    }
}
