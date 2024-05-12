package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1NB, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1NB implements C0V1 {
    public final C08440Uu LIZ;
    public final List<C08410Ur<C0V4>> LIZIZ;
    public final C5H3 LIZJ;
    public final C5H3 LIZLLL;
    public final List<C1ND> LJ;

    @Override // X.C0V1
    public final float LIZ() {
        return ((Number) this.LIZLLL.getValue()).floatValue();
    }

    @Override // X.C0V1
    public final boolean LIZIZ() {
        ArrayList arrayList = (ArrayList) this.LJ;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((C1ND) ListProtector.get(arrayList, i)).LJLIL.LIZIZ()) {
                return true;
            }
        }
        return false;
    }

    @Override // X.C0V1
    public final float LIZJ() {
        return ((Number) this.LIZJ.getValue()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v14, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.List<X.0Ur<X.0VD>>] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.List] */
    public C1NB(C08440Uu annotatedString, C08370Un c08370Un, List<C08410Ur<C0V4>> placeholders, InterfaceC23370vt density, InterfaceC13480fw fontFamilyResolver) {
        String str;
        ?? arrayList;
        o.LJIIIZ(annotatedString, "annotatedString");
        o.LJIIIZ(placeholders, "placeholders");
        o.LJIIIZ(density, "density");
        o.LJIIIZ(fontFamilyResolver, "fontFamilyResolver");
        this.LIZ = annotatedString;
        this.LIZIZ = placeholders;
        EnumC221088m0 enumC221088m0 = EnumC221088m0.NONE;
        this.LIZJ = C221108m2.LIZ(enumC221088m0, new IDqS420S0100000(this, 92));
        this.LIZLLL = C221108m2.LIZ(enumC221088m0, new IDqS420S0100000(this, 91));
        C0V2 defaultParagraphStyle = c08370Un.LIZIZ;
        o.LJIIIZ(defaultParagraphStyle, "defaultParagraphStyle");
        int length = annotatedString.LJLIL.length();
        List<C08410Ur<C0V2>> list = annotatedString.LJLJI;
        ArrayList arrayList2 = new ArrayList();
        int size = list.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            C08410Ur c08410Ur = (C08410Ur) ListProtector.get(list, i);
            C0V2 c0v2 = (C0V2) c08410Ur.LIZ;
            int i3 = c08410Ur.LIZIZ;
            int i4 = c08410Ur.LIZJ;
            if (i3 != i2) {
                arrayList2.add(new C08410Ur(i2, i3, defaultParagraphStyle));
            }
            arrayList2.add(new C08410Ur(i3, i4, defaultParagraphStyle.LIZ(c0v2)));
            i++;
            i2 = i4;
        }
        if (i2 != length) {
            arrayList2.add(new C08410Ur(i2, length, defaultParagraphStyle));
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new C08410Ur(0, 0, defaultParagraphStyle));
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size2 = arrayList2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            C08410Ur c08410Ur2 = (C08410Ur) ListProtector.get(arrayList2, i5);
            int i6 = c08410Ur2.LIZIZ;
            int i7 = c08410Ur2.LIZJ;
            if (i6 != i7) {
                str = annotatedString.LJLIL.substring(i6, i7);
                o.LJIIIIZZ(str, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                str = "";
            }
            if (i6 == i7) {
                arrayList = C61878OQg.INSTANCE;
            } else if (i6 == 0 && i7 >= annotatedString.LJLIL.length()) {
                arrayList = annotatedString.LJLILLLLZI;
            } else {
                List<C08410Ur<C0VD>> list2 = annotatedString.LJLILLLLZI;
                ArrayList arrayList4 = new ArrayList(list2.size());
                int size3 = list2.size();
                for (int i8 = 0; i8 < size3; i8++) {
                    Object obj = ListProtector.get(list2, i8);
                    C08410Ur c08410Ur3 = (C08410Ur) obj;
                    if (C08460Uw.LIZIZ(i6, i7, c08410Ur3.LIZIZ, c08410Ur3.LIZJ)) {
                        arrayList4.add(obj);
                    }
                }
                arrayList = new ArrayList(arrayList4.size());
                int size4 = arrayList4.size();
                for (int i9 = 0; i9 < size4; i9++) {
                    C08410Ur c08410Ur4 = (C08410Ur) ListProtector.get(arrayList4, i9);
                    arrayList.add(new C08410Ur(C78842Uww.LJIIL(c08410Ur4.LIZIZ, i6, i7) - i6, C78842Uww.LJIIL(c08410Ur4.LIZJ, i6, i7) - i6, c08410Ur4.LIZ));
                }
            }
            C08440Uu c08440Uu = new C08440Uu(str, arrayList, 4);
            C0V2 c0v22 = (C0V2) c08410Ur2.LIZ;
            c0v22 = c0v22.LIZIZ == null ? new C0V2(c0v22.LIZ, defaultParagraphStyle.LIZIZ, c0v22.LIZJ, c0v22.LIZLLL, c0v22.LJ, c0v22.LJFF, c0v22.LJI, c0v22.LJII) : c0v22;
            String text = c08440Uu.LJLIL;
            C08370Un c08370Un2 = new C08370Un(c08370Un.LIZ, c08370Un.LIZIZ.LIZ(c0v22));
            List<C08410Ur<C0VD>> spanStyles = c08440Uu.LJLILLLLZI;
            List<C08410Ur<C0V4>> list3 = this.LIZIZ;
            int i10 = c08410Ur2.LIZIZ;
            int i11 = c08410Ur2.LIZJ;
            ArrayList arrayList5 = new ArrayList(list3.size());
            int size5 = list3.size();
            for (int i12 = 0; i12 < size5; i12++) {
                Object obj2 = ListProtector.get(list3, i12);
                C08410Ur c08410Ur5 = (C08410Ur) obj2;
                if (C08460Uw.LIZIZ(i10, i11, c08410Ur5.LIZIZ, c08410Ur5.LIZJ)) {
                    arrayList5.add(obj2);
                }
            }
            ArrayList arrayList6 = new ArrayList(arrayList5.size());
            int size6 = arrayList5.size();
            for (int i13 = 0; i13 < size6; i13++) {
                C08410Ur c08410Ur6 = (C08410Ur) ListProtector.get(arrayList5, i13);
                int i14 = c08410Ur6.LIZIZ;
                if (i10 <= i14 && c08410Ur6.LIZJ <= i11) {
                    arrayList6.add(new C08410Ur(i14 - i10, c08410Ur6.LIZJ - i10, c08410Ur6.LIZ));
                } else {
                    "placeholder can not overlap with paragraph.".toString();
                    throw new IllegalArgumentException("placeholder can not overlap with paragraph.");
                }
            }
            o.LJIIIZ(text, "text");
            o.LJIIIZ(spanStyles, "spanStyles");
            arrayList3.add(new C1ND(new C34361Wm(c08370Un2, fontFamilyResolver, density, text, spanStyles, arrayList6), c08410Ur2.LIZIZ, c08410Ur2.LIZJ));
        }
        this.LJ = arrayList3;
    }
}
