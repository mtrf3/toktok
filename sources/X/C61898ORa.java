package X;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.ORa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C61898ORa extends OQN {
    public static final <T> List<T> LJIILL(T[] tArr) {
        o.LJIIIZ(tArr, "<this>");
        List<T> asList = Arrays.asList(tArr);
        o.LJIIIIZZ(asList, "asList(this)");
        return asList;
    }

    public static final <T> void LJJIIJ(T[] tArr) {
        o.LJIIIZ(tArr, "<this>");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    public static void LJJI(int[] iArr, int i) {
        int length = iArr.length;
        o.LJIIIZ(iArr, "<this>");
        Arrays.fill(iArr, 0, length, i);
    }

    public static void LJJIFFI(Object[] objArr, C3BS c3bs) {
        int length = objArr.length;
        o.LJIIIZ(objArr, "<this>");
        Arrays.fill(objArr, 0, length, c3bs);
    }

    public static final Object[] LJJII(Object obj, Object[] objArr) {
        o.LJIIIZ(objArr, "<this>");
        int length = objArr.length;
        Object[] copyOf = Arrays.copyOf(objArr, length + 1);
        copyOf[length] = obj;
        return copyOf;
    }

    public static final <T> T[] LJJIII(T[] tArr, T[] elements) {
        o.LJIIIZ(tArr, "<this>");
        o.LJIIIZ(elements, "elements");
        int length = tArr.length;
        int length2 = elements.length;
        T[] result = (T[]) Arrays.copyOf(tArr, length + length2);
        System.arraycopy(elements, 0, result, length, length2);
        o.LJIIIIZZ(result, "result");
        return result;
    }

    public static final void LJJIIJZLJL(Comparator comparator, Object[] objArr) {
        o.LJIIIZ(objArr, "<this>");
        o.LJIIIZ(comparator, "comparator");
        if (objArr.length > 1) {
            Arrays.sort(objArr, comparator);
        }
    }

    public static final float[] LJIJJLI(int i, int i2, float[] fArr) {
        OQN.LJFF(i2, fArr.length);
        float[] copyOfRange = Arrays.copyOfRange(fArr, i, i2);
        o.LJIIIIZZ(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    public static final Object[] LJIL(int i, int i2, Object[] objArr) {
        o.LJIIIZ(objArr, "<this>");
        OQN.LJFF(i2, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i, i2);
        o.LJIIIIZZ(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    public static final void LJJ(int i, int i2, Object[] objArr) {
        o.LJIIIZ(objArr, "<this>");
        Arrays.fill(objArr, i, i2, (Object) null);
    }

    public static /* synthetic */ void LJIJI(int[] iArr, int[] iArr2, int i, int i2) {
        if ((i2 & 8) != 0) {
            i = iArr.length;
        }
        LJIILLIIL(0, 0, i, iArr, iArr2);
    }

    public static final void LJIILLIIL(int i, int i2, int i3, int[] iArr, int[] destination) {
        o.LJIIIZ(iArr, "<this>");
        o.LJIIIZ(destination, "destination");
        System.arraycopy(iArr, i2, destination, i, i3 - i2);
    }

    public static final void LJIIZILJ(int i, int i2, int i3, Object[] objArr, Object[] destination) {
        o.LJIIIZ(objArr, "<this>");
        o.LJIIIZ(destination, "destination");
        System.arraycopy(objArr, i2, destination, i, i3 - i2);
    }

    public static final void LJIJ(char[] cArr, char[] destination, int i, int i2, int i3) {
        o.LJIIIZ(cArr, "<this>");
        o.LJIIIZ(destination, "destination");
        System.arraycopy(cArr, i2, destination, i, i3 - i2);
    }

    public static /* synthetic */ void LJIJJ(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        LJIIZILJ(i, i2, i3, objArr, objArr2);
    }
}
