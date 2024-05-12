package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.internal.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS32S0001000_8;
import kotlin.jvm.internal.IDqS172S0200000;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class ORZ extends C40658FxW {
    public static final C51653KOz LJLIIIL(Iterable iterable) {
        o.LJIIIZ(iterable, "<this>");
        return new C51653KOz(iterable);
    }

    public static final double LJLIIL(Iterable<Double> iterable) {
        Iterator it = ((ArrayList) iterable).iterator();
        double d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        int i = 0;
        while (it.hasNext()) {
            d += ((Number) it.next()).doubleValue();
            i++;
            if (i < 0) {
                C47261Igj.LJJJJIZL();
                throw null;
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return d / i;
    }

    public static final double LJLIL(Iterable<Long> iterable) {
        o.LJIIIZ(iterable, "<this>");
        Iterator<Long> it = iterable.iterator();
        double d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        int i = 0;
        while (it.hasNext()) {
            d += it.next().longValue();
            i++;
            if (i < 0) {
                C47261Igj.LJJJJIZL();
                throw null;
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return d / i;
    }

    public static final <T> List<T> LJLJJL(Iterable<? extends T> iterable) {
        o.LJIIIZ(iterable, "<this>");
        return LLJI(LLJILLL(iterable));
    }

    public static final <T> List<T> LJLL(Iterable<? extends T> iterable) {
        o.LJIIIZ(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        LJLLI(iterable, arrayList);
        return arrayList;
    }

    public static final <T> T LJLLILLLL(Iterable<? extends T> iterable) {
        o.LJIIIZ(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) LJLLJ((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final <T> T LJLLJ(List<? extends T> list) {
        o.LJIIIZ(list, "<this>");
        if (!list.isEmpty()) {
            return (T) ListProtector.get(list, 0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final <T> T LJLLL(Iterable<? extends T> iterable) {
        o.LJIIIZ(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) ListProtector.get(list, 0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    public static final <T> T LJLLLL(List<? extends T> list) {
        o.LJIIIZ(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return (T) ListProtector.get(list, 0);
    }

    public static final <T> T LLF(Iterable<? extends T> iterable) {
        o.LJIIIZ(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) LLFF((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final <T> T LLFF(List<? extends T> list) {
        o.LJIIIZ(list, "<this>");
        if (!list.isEmpty()) {
            return (T) ListProtector.get(list, C47261Igj.LJJI(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final <T> T LLFFF(Iterable<? extends T> iterable) {
        o.LJIIIZ(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) C64504PTg.LIZIZ(list, -1, list);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static final <T> T LLFII(List<? extends T> list) {
        o.LJIIIZ(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return (T) C64504PTg.LIZIZ(list, -1, list);
    }

    public static final <T extends Comparable<? super T>> T LLFZ(Iterable<? extends T> iterable) {
        o.LJIIIZ(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    public static final Float LLI(Iterable<Float> iterable) {
        o.LJIIIZ(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = it.next().floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, it.next().floatValue());
        }
        return Float.valueOf(floatValue);
    }

    public static final <T extends Comparable<? super T>> T LLIFFJFJJ(Iterable<? extends T> iterable) {
        o.LJIIIZ(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (next.compareTo(next2) < 0) {
                    next = next2;
                }
            }
            return next;
        }
        throw new NoSuchElementException();
    }

    public static final <T extends Comparable<? super T>> T LLII(Iterable<? extends T> iterable) {
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    public static final Float LLIIII(Iterable<Float> iterable) {
        o.LJIIIZ(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = it.next().floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, it.next().floatValue());
        }
        return Float.valueOf(floatValue);
    }

    public static final <T> List<T> LLIILII(Iterable<? extends T> iterable) {
        o.LJIIIZ(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return LLJI(iterable);
        }
        List<T> LLJILJIL = LLJILJIL(iterable);
        Collections.reverse(LLJILJIL);
        return LLJILJIL;
    }

    public static final <T extends Comparable<? super T>> List<T> LLIL(Iterable<? extends T> iterable) {
        o.LJIIIZ(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return LLJI(iterable);
            }
            Object[] array = collection.toArray(new Comparable[0]);
            C61898ORa.LJJIIJ(array);
            return C61898ORa.LJIILL(array);
        }
        List<T> LLJILJIL = LLJILJIL(iterable);
        C40675Fxn.LJJLIIIIJ(LLJILJIL);
        return LLJILJIL;
    }

    public static final float LLILL(Iterable<Float> iterable) {
        o.LJIIIZ(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        float f = 0.0f;
        while (it.hasNext()) {
            f += it.next().floatValue();
        }
        return f;
    }

    public static final int LLILLIZIL(Iterable<Integer> iterable) {
        o.LJIIIZ(iterable, "<this>");
        Iterator<Integer> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().intValue();
        }
        return i;
    }

    public static final long LLILLJJLI(Iterable<Long> iterable) {
        Iterator<Long> it = iterable.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += it.next().longValue();
        }
        return j;
    }

    public static final byte[] LLILZIL(Collection<Byte> collection) {
        o.LJIIIZ(collection, "<this>");
        byte[] bArr = new byte[collection.size()];
        Iterator<Byte> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            bArr[i] = it.next().byteValue();
            i++;
        }
        return bArr;
    }

    public static final float[] LLIZ(Collection<Float> collection) {
        float[] fArr = new float[collection.size()];
        Iterator<Float> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            fArr[i] = it.next().floatValue();
            i++;
        }
        return fArr;
    }

    public static final <T> HashSet<T> LLIZLLLIL(Iterable<? extends T> iterable) {
        o.LJIIIZ(iterable, "<this>");
        HashSet<T> hashSet = new HashSet<>(C51029K0z.LJJIIZ(C32I.LJJL(iterable, 12)));
        LLILZLL(iterable, hashSet);
        return hashSet;
    }

    public static final int[] LLJ(Collection<Integer> collection) {
        o.LJIIIZ(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = it.next().intValue();
            i++;
        }
        return iArr;
    }

    public static final <T> List<T> LLJI(Iterable<? extends T> iterable) {
        Object next;
        o.LJIIIZ(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return LLJILJILJ(collection);
                }
                if (iterable instanceof List) {
                    next = ListProtector.get((List) iterable, 0);
                } else {
                    next = iterable.iterator().next();
                }
                return C47261Igj.LJJIJ(next);
            }
            return C61878OQg.INSTANCE;
        }
        return C47261Igj.LJJIJLIJ(LLJILJIL(iterable));
    }

    public static final long[] LLJIJIL(Collection<Long> collection) {
        o.LJIIIZ(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator<Long> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = it.next().longValue();
            i++;
        }
        return jArr;
    }

    public static final <T> List<T> LLJILJIL(Iterable<? extends T> iterable) {
        o.LJIIIZ(iterable, "<this>");
        if (iterable instanceof Collection) {
            return LLJILJILJ((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        LLILZLL(iterable, arrayList);
        return arrayList;
    }

    public static final <T> List<T> LLJILJILJ(Collection<? extends T> collection) {
        o.LJIIIZ(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final <T> java.util.Set<T> LLJILLL(Iterable<? extends T> iterable) {
        o.LJIIIZ(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LLILZLL(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static final <T> java.util.Set<T> LLJJ(Iterable<? extends T> iterable) {
        Object next;
        o.LJIIIZ(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(C51029K0z.LJJIIZ(collection.size()));
                    LLILZLL(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                if (iterable instanceof List) {
                    next = ListProtector.get((List) iterable, 0);
                } else {
                    next = iterable.iterator().next();
                }
                return C77275UUl.LJII(next);
            }
            return OQY.INSTANCE;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        LLILZLL(iterable, linkedHashSet2);
        return C77275UUl.LJFF(linkedHashSet2);
    }

    public static final C199807sm LLJJI(Iterable iterable) {
        o.LJIIIZ(iterable, "<this>");
        return new C199807sm(new AqS153S0100000_3(iterable, (Iterable<Object>) 1777));
    }

    public static final <T> List<List<T>> LJLILLLLZI(Iterable<? extends T> iterable, int i) {
        ArrayList arrayList;
        int i2;
        o.LJIIIZ(iterable, "<this>");
        C45804HyK.LJIIJJI(i, i);
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            List list = (List) iterable;
            int size = list.size();
            int i3 = size / i;
            if (size % i == 0) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            arrayList = new ArrayList(i3 + i2);
            int i4 = 0;
            while (i4 < size) {
                int i5 = size - i4;
                if (i <= i5) {
                    i5 = i;
                }
                ArrayList arrayList2 = new ArrayList(i5);
                for (int i6 = 0; i6 < i5; i6++) {
                    arrayList2.add(ListProtector.get(list, i6 + i4));
                }
                arrayList.add(arrayList2);
                i4 += i;
                if (i4 < 0) {
                    break;
                }
            }
        } else {
            arrayList = new ArrayList();
            Iterator LJJZ = C45804HyK.LJJZ(iterable.iterator(), i, i, false);
            while (LJJZ.hasNext()) {
                arrayList.add(LJJZ.next());
            }
        }
        return arrayList;
    }

    public static final boolean LJLJJI(Object obj, Iterable iterable) {
        o.LJIIIZ(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (LJLZ(obj, iterable) >= 0) {
            return true;
        }
        return false;
    }

    public static final <T> List<T> LJLJJLL(Iterable<? extends T> iterable, int i) {
        ArrayList arrayList;
        o.LJIIIZ(iterable, "<this>");
        int i2 = 0;
        if (i >= 0) {
            if (i == 0) {
                return LLJI(iterable);
            }
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                int size = collection.size() - i;
                if (size <= 0) {
                    return C61878OQg.INSTANCE;
                }
                if (size == 1) {
                    return C47261Igj.LJJIJ(LLF(iterable));
                }
                arrayList = new ArrayList(size);
                if (iterable instanceof List) {
                    if (iterable instanceof RandomAccess) {
                        int size2 = collection.size();
                        while (i < size2) {
                            arrayList.add(ListProtector.get((List) iterable, i));
                            i++;
                        }
                    } else {
                        ListIterator listIterator = ((List) iterable).listIterator(i);
                        while (listIterator.hasNext()) {
                            arrayList.add(listIterator.next());
                        }
                    }
                    return arrayList;
                }
            } else {
                arrayList = new ArrayList();
            }
            for (T t : iterable) {
                if (i2 >= i) {
                    arrayList.add(t);
                } else {
                    i2++;
                }
            }
            return C47261Igj.LJJIJLIJ(arrayList);
        }
        String LIZIZ = C0NY.LIZIZ("Requested element count ", i, " is less than zero.");
        LIZIZ.toString();
        throw new IllegalArgumentException(LIZIZ);
    }

    public static final List LJLJL(int i, List list) {
        o.LJIIIZ(list, "<this>");
        int i2 = 0;
        if (i >= 0) {
            int size = list.size() - i;
            if (size >= 0) {
                i2 = size;
            }
            return LLILLL(list, i2);
        }
        String LIZIZ = C0NY.LIZIZ("Requested element count ", i, " is less than zero.");
        LIZIZ.toString();
        throw new IllegalArgumentException(LIZIZ);
    }

    public static final <T> T LJLJLJ(Iterable<? extends T> iterable, int i) {
        o.LJIIIZ(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) ListProtector.get((List) iterable, i);
        }
        AqS32S0001000_8 aqS32S0001000_8 = new AqS32S0001000_8(i, 9);
        if (i >= 0) {
            int i2 = 0;
            for (T t : iterable) {
                int i3 = i2 + 1;
                if (i == i2) {
                    return t;
                }
                i2 = i3;
            }
            aqS32S0001000_8.invoke(Integer.valueOf(i));
            throw null;
        }
        aqS32S0001000_8.invoke(Integer.valueOf(i));
        throw null;
    }

    public static final <T> T LJLJLLL(Iterable<? extends T> iterable, int i) {
        o.LJIIIZ(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) LJLLLLLL(i, (List) iterable);
        }
        if (i < 0) {
            return null;
        }
        int i2 = 0;
        for (T t : iterable) {
            int i3 = i2 + 1;
            if (i == i2) {
                return t;
            }
            i2 = i3;
        }
        return null;
    }

    public static final void LJLLI(Iterable iterable, Collection destination) {
        o.LJIIIZ(iterable, "<this>");
        o.LJIIIZ(destination, "destination");
        for (Object obj : iterable) {
            if (obj != null) {
                destination.add(obj);
            }
        }
    }

    public static final Object LJLLLLLL(int i, List list) {
        o.LJIIIZ(list, "<this>");
        if (i >= 0 && i <= C47261Igj.LJJI(list)) {
            return ListProtector.get(list, i);
        }
        return null;
    }

    public static final int LJLZ(Object obj, Iterable iterable) {
        o.LJIIIZ(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i = 0;
        for (Object obj2 : iterable) {
            if (i >= 0) {
                if (o.LJ(obj, obj2)) {
                    return i;
                }
                i++;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        return -1;
    }

    public static final int LJZ(Object obj, List list) {
        o.LJIIIZ(list, "<this>");
        return list.indexOf(obj);
    }

    public static final <T> java.util.Set<T> LJZI(Iterable<? extends T> iterable, Iterable<? extends T> other) {
        o.LJIIIZ(iterable, "<this>");
        o.LJIIIZ(other, "other");
        java.util.Set<T> LLJILLL = LLJILLL(iterable);
        C65777Prh.LIZ(LLJILLL).retainAll(b.LJII(other, LLJILLL));
        return LLJILLL;
    }

    public static final <T> List<T> LLIIIILZ(Iterable<? extends T> iterable, Iterable<? extends T> elements) {
        o.LJIIIZ(iterable, "<this>");
        o.LJIIIZ(elements, "elements");
        Collection LJII = b.LJII(elements, iterable);
        if (LJII.isEmpty()) {
            return LLJI(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            if (!LJII.contains(t)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static final List LLIIIJ(Object obj, Iterable iterable) {
        o.LJIIIZ(iterable, "<this>");
        ArrayList arrayList = new ArrayList(C32I.LJJL(iterable, 10));
        boolean z = false;
        for (Object obj2 : iterable) {
            if (!z && o.LJ(obj2, obj)) {
                z = true;
            } else {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static final <T> List<T> LLIIIL(Iterable<? extends T> iterable, Iterable<? extends T> elements) {
        o.LJIIIZ(iterable, "<this>");
        o.LJIIIZ(elements, "elements");
        if (iterable instanceof Collection) {
            return LLIIIZ(elements, (Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        ORS.LJJLIIIJILLIZJL(iterable, arrayList);
        ORS.LJJLIIIJILLIZJL(elements, arrayList);
        return arrayList;
    }

    public static final List LLIIIZ(Iterable elements, Collection collection) {
        o.LJIIIZ(collection, "<this>");
        o.LJIIIZ(elements, "elements");
        if (elements instanceof Collection) {
            Collection collection2 = (Collection) elements;
            ArrayList arrayList = new ArrayList(collection2.size() + collection.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        ORS.LJJLIIIJILLIZJL(elements, arrayList2);
        return arrayList2;
    }

    public static final List LLIIJI(Object obj, Collection collection) {
        o.LJIIIZ(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static final Object LLIIJLIL(Collection collection, V0R random) {
        o.LJIIIZ(collection, "<this>");
        o.LJIIIZ(random, "random");
        if (!collection.isEmpty()) {
            return LJLJLJ(collection, random.nextInt(collection.size()));
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final Object LLIIL(Collection collection, V0R random) {
        o.LJIIIZ(collection, "<this>");
        o.LJIIIZ(random, "random");
        if (collection.isEmpty()) {
            return null;
        }
        return LJLJLJ(collection, random.nextInt(collection.size()));
    }

    public static final List LLIILZL(Iterable iterable, List list) {
        o.LJIIIZ(list, "<this>");
        int LJJL = C32I.LJJL(iterable, 10);
        if (LJJL == 0) {
            return C61878OQg.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(LJJL);
        Iterator it = ((ArrayList) iterable).iterator();
        while (it.hasNext()) {
            arrayList.add(ListProtector.get(list, ((Number) it.next()).intValue()));
        }
        return arrayList;
    }

    public static final <T> List<T> LLIIZ(List<? extends T> list, C40517FvF c40517FvF) {
        o.LJIIIZ(list, "<this>");
        if (c40517FvF.isEmpty()) {
            return C61878OQg.INSTANCE;
        }
        return LLJI(list.subList(c40517FvF.getStart().intValue(), c40517FvF.LJIIIIZZ().intValue() + 1));
    }

    public static final List LLILII(Comparator comparator, Iterable iterable) {
        o.LJIIIZ(iterable, "<this>");
        o.LJIIIZ(comparator, "comparator");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return LLJI(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            C61898ORa.LJJIIJZLJL(comparator, array);
            return C61898ORa.LJIILL(array);
        }
        List LLJILJIL = LLJILJIL(iterable);
        C40675Fxn.LJJLIIIJ(LLJILJIL, comparator);
        return LLJILJIL;
    }

    public static final <T> java.util.Set<T> LLILIL(Iterable<? extends T> iterable, Iterable<? extends T> other) {
        o.LJIIIZ(iterable, "<this>");
        o.LJIIIZ(other, "other");
        java.util.Set<T> LLJILLL = LLJILLL(iterable);
        C65777Prh.LIZ(LLJILLL).removeAll(b.LJII(other, LLJILLL));
        return LLJILLL;
    }

    public static final <T> List<T> LLILLL(Iterable<? extends T> iterable, int i) {
        o.LJIIIZ(iterable, "<this>");
        int i2 = 0;
        if (i >= 0) {
            if (i == 0) {
                return C61878OQg.INSTANCE;
            }
            if (iterable instanceof Collection) {
                if (i >= ((Collection) iterable).size()) {
                    return LLJI(iterable);
                }
                if (i == 1) {
                    return C47261Igj.LJJIJ(LJLLILLLL(iterable));
                }
            }
            ArrayList arrayList = new ArrayList(i);
            Iterator<? extends T> it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            return C47261Igj.LJJIJLIJ(arrayList);
        }
        String LIZIZ = C0NY.LIZIZ("Requested element count ", i, " is less than zero.");
        LIZIZ.toString();
        throw new IllegalArgumentException(LIZIZ);
    }

    public static final List LLILZ(int i, List list) {
        o.LJIIIZ(list, "<this>");
        if (i >= 0) {
            if (i == 0) {
                return C61878OQg.INSTANCE;
            }
            int size = list.size();
            if (i >= size) {
                return LLJI(list);
            }
            if (i == 1) {
                return C47261Igj.LJJIJ(LLFF(list));
            }
            ArrayList arrayList = new ArrayList(i);
            if (list instanceof RandomAccess) {
                for (int i2 = size - i; i2 < size; i2++) {
                    arrayList.add(ListProtector.get(list, i2));
                }
            } else {
                ListIterator listIterator = list.listIterator(size - i);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
            }
            return arrayList;
        }
        String LIZIZ = C0NY.LIZIZ("Requested element count ", i, " is less than zero.");
        LIZIZ.toString();
        throw new IllegalArgumentException(LIZIZ);
    }

    public static final void LLILZLL(Iterable iterable, Collection collection) {
        o.LJIIIZ(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static final <T, R> List<OSZ<T, R>> LLJJIII(Iterable<? extends T> iterable, Iterable<? extends R> other) {
        o.LJIIIZ(iterable, "<this>");
        o.LJIIIZ(other, "other");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(C32I.LJJL(iterable, 10), C32I.LJJL(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new OSZ(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static final void LJLJI(Iterable iterable, int i, InterfaceC88472Yns interfaceC88472Yns) {
        int i2;
        C45804HyK.LJIIJJI(i, i);
        List list = (List) iterable;
        int size = list.size();
        int i3 = size / i;
        if (size % i == 0) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        ArrayList arrayList = new ArrayList(i3 + i2);
        C61895OQx c61895OQx = new C61895OQx(list);
        int i4 = 0;
        while (i4 < size) {
            int i5 = size - i4;
            if (i <= i5) {
                i5 = i;
            }
            int i6 = i5 + i4;
            C61880OQi.LIZJ(i4, i6, c61895OQx.LJLILLLLZI.size());
            c61895OQx.LJLJI = i4;
            c61895OQx.LJLJJI = i6 - i4;
            arrayList.add(interfaceC88472Yns.invoke(c61895OQx));
            i4 += i;
            if (i4 < 0) {
                return;
            }
        }
    }

    public static /* synthetic */ void LL(Iterable iterable, Appendable appendable, CharSequence charSequence, IDqS172S0200000 iDqS172S0200000, int i) {
        CharSequence charSequence2;
        int i2;
        String str;
        CharSequence charSequence3 = charSequence;
        if ((i & 2) != 0) {
            charSequence3 = ", ";
        }
        IDqS172S0200000 iDqS172S02000002 = null;
        String str2 = "";
        if ((i & 4) != 0) {
            charSequence2 = "";
        } else {
            charSequence2 = null;
        }
        if ((i & 8) == 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        if ((i & 32) != 0) {
            str = "...";
        } else {
            str = null;
        }
        if ((i & 64) == 0) {
            iDqS172S02000002 = iDqS172S0200000;
        }
        LJZL(iterable, appendable, charSequence3, charSequence2, str2, i2, str, iDqS172S02000002);
    }

    public static String LLD(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, InterfaceC88472Yns interfaceC88472Yns, int i) {
        int i2;
        String truncated;
        CharSequence separator = charSequence;
        CharSequence prefix = charSequence2;
        if ((i & 1) != 0) {
            separator = ", ";
        }
        CharSequence postfix = "";
        if ((i & 2) != 0) {
            prefix = "";
        }
        if ((i & 4) == 0) {
            postfix = charSequence3;
        }
        if ((i & 8) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        InterfaceC88472Yns interfaceC88472Yns2 = null;
        if ((i & 16) != 0) {
            truncated = "...";
        } else {
            truncated = null;
        }
        if ((i & 32) == 0) {
            interfaceC88472Yns2 = interfaceC88472Yns;
        }
        o.LJIIIZ(iterable, "<this>");
        o.LJIIIZ(separator, "separator");
        o.LJIIIZ(prefix, "prefix");
        o.LJIIIZ(postfix, "postfix");
        o.LJIIIZ(truncated, "truncated");
        StringBuilder sb = new StringBuilder();
        LJZL(iterable, sb, separator, prefix, postfix, i2, truncated, interfaceC88472Yns2);
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
    
        if (r10 >= 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJZL(java.lang.Iterable r5, java.lang.Appendable r6, java.lang.CharSequence r7, java.lang.CharSequence r8, java.lang.CharSequence r9, int r10, java.lang.CharSequence r11, X.InterfaceC88472Yns r12) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.lang.String r0 = "separator"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            java.lang.String r0 = "postfix"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            java.lang.String r0 = "truncated"
            kotlin.jvm.internal.o.LJIIIZ(r11, r0)
            r4 = r6
            java.lang.StringBuilder r4 = (java.lang.StringBuilder) r4
            r4.append(r8)
            java.util.Iterator r3 = r5.iterator()
            r2 = 0
        L24:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3e
            java.lang.Object r1 = r3.next()
            int r2 = r2 + 1
            r0 = 1
            if (r2 <= r0) goto L36
            r4.append(r7)
        L36:
            if (r10 < 0) goto L3a
            if (r2 > r10) goto L40
        L3a:
            X.C77119UOl.LIZ(r6, r1, r12)
            goto L24
        L3e:
            if (r10 < 0) goto L45
        L40:
            if (r2 <= r10) goto L45
            r4.append(r11)
        L45:
            r4.append(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ORZ.LJZL(java.lang.Iterable, java.lang.Appendable, java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence, X.Yns):void");
    }
}
