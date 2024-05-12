package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.0Uq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C08400Uq {
    public final StringBuilder LIZ;
    public final List<C08390Up<C0VD>> LIZIZ;
    public final List<C08390Up<C0V2>> LIZJ;
    public final List<C08390Up<? extends Object>> LIZLLL;
    public final List<C08390Up<? extends Object>> LJ;

    public final void LIZIZ() {
        if (!this.LJ.isEmpty()) {
            ((C08390Up) ListProtector.remove(this.LJ, ((ArrayList) r1).size() - 1)).LIZJ = this.LIZ.length();
            return;
        }
        "Nothing to pop.".toString();
        throw new IllegalStateException("Nothing to pop.");
    }

    public final C08440Uu LJ() {
        String sb = this.LIZ.toString();
        o.LJIIIIZZ(sb, "text.toString()");
        ArrayList arrayList = (ArrayList) this.LIZIZ;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((C08390Up) ListProtector.get(arrayList, i)).LIZ(this.LIZ.length()));
        }
        ArrayList arrayList3 = (ArrayList) this.LIZJ;
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        int size2 = arrayList3.size();
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList4.add(((C08390Up) ListProtector.get(arrayList3, i2)).LIZ(this.LIZ.length()));
        }
        ArrayList arrayList5 = (ArrayList) this.LIZLLL;
        ArrayList arrayList6 = new ArrayList(arrayList5.size());
        int size3 = arrayList5.size();
        for (int i3 = 0; i3 < size3; i3++) {
            arrayList6.add(((C08390Up) ListProtector.get(arrayList5, i3)).LIZ(this.LIZ.length()));
        }
        return new C08440Uu(sb, arrayList2, arrayList4, arrayList6);
    }

    public C08400Uq() {
        this.LIZ = new StringBuilder(16);
        this.LIZIZ = new ArrayList();
        this.LIZJ = new ArrayList();
        this.LIZLLL = new ArrayList();
        this.LJ = new ArrayList();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C08400Uq(C08440Uu text) {
        this();
        o.LJIIIZ(text, "text");
        LIZ(text);
    }

    public final void LIZ(C08440Uu text) {
        o.LJIIIZ(text, "text");
        int length = this.LIZ.length();
        this.LIZ.append(text.LJLIL);
        List<C08410Ur<C0VD>> list = text.LJLILLLLZI;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C08410Ur c08410Ur = (C08410Ur) ListProtector.get(list, i);
            T style = c08410Ur.LIZ;
            int i2 = c08410Ur.LIZIZ + length;
            int i3 = c08410Ur.LIZJ + length;
            o.LJIIIZ(style, "style");
            ((ArrayList) this.LIZIZ).add(new C08390Up(style, i2, i3, null, 8));
        }
        List<C08410Ur<C0V2>> list2 = text.LJLJI;
        int size2 = list2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            C08410Ur c08410Ur2 = (C08410Ur) ListProtector.get(list2, i4);
            T style2 = c08410Ur2.LIZ;
            int i5 = length + c08410Ur2.LIZIZ;
            int i6 = length + c08410Ur2.LIZJ;
            o.LJIIIZ(style2, "style");
            ((ArrayList) this.LIZJ).add(new C08390Up(style2, i5, i6, null, 8));
        }
        List<C08410Ur<? extends Object>> list3 = text.LJLJJI;
        int size3 = list3.size();
        for (int i7 = 0; i7 < size3; i7++) {
            C08410Ur c08410Ur3 = (C08410Ur) ListProtector.get(list3, i7);
            ((ArrayList) this.LIZLLL).add(new C08390Up(c08410Ur3.LIZ, c08410Ur3.LIZIZ + length, c08410Ur3.LIZJ + length, c08410Ur3.LIZLLL));
        }
    }

    public final void LIZJ(int i) {
        if (i < ((ArrayList) this.LJ).size()) {
            while (((ArrayList) this.LJ).size() - 1 >= i) {
                LIZIZ();
            }
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(i);
        LIZ.append(" should be less than ");
        LIZ.append(((ArrayList) this.LJ).size());
        String LIZIZ = X1D.LIZIZ(LIZ);
        LIZIZ.toString();
        throw new IllegalStateException(LIZIZ);
    }

    public final int LIZLLL(C0VD c0vd) {
        C08390Up c08390Up = new C08390Up(c0vd, this.LIZ.length(), 0, null, 12);
        ((ArrayList) this.LJ).add(c08390Up);
        ((ArrayList) this.LIZIZ).add(c08390Up);
        return ((ArrayList) this.LJ).size() - 1;
    }
}
