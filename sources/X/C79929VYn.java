package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.VYn, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79929VYn {
    public static final List<String> LJIILIIL = Arrays.asList("1", "3", "5", "7", "8", "10", "12");
    public static final List<String> LJIILJJIL = Arrays.asList("4", "6", "9", "11");
    public final View LIZ;
    public final C79762VSc LIZIZ;
    public final C79762VSc LIZJ;
    public final C79762VSc LIZLLL;
    public int LJ = 1900;
    public int LJFF = 2100;
    public int LJI = 1;
    public int LJII = 12;
    public int LJIIIIZZ = 1;
    public int LJIIIZ = 31;
    public int LJIIJ;
    public int LJIIJJI;
    public int LJIIL;

    public C79929VYn(View view, boolean[] zArr, InterfaceC58352MvE interfaceC58352MvE) {
        int i;
        int i2;
        this.LIZ = view;
        C79762VSc c79762VSc = (C79762VSc) view.findViewById(R.id.nkh);
        this.LIZIZ = c79762VSc;
        C79762VSc c79762VSc2 = (C79762VSc) view.findViewById(R.id.gls);
        this.LIZJ = c79762VSc2;
        C79762VSc c79762VSc3 = (C79762VSc) view.findViewById(R.id.c3p);
        this.LIZLLL = c79762VSc3;
        c79762VSc.setLocalizeAdapter(interfaceC58352MvE);
        c79762VSc2.setLocalizeAdapter(interfaceC58352MvE);
        c79762VSc3.setLocalizeAdapter(interfaceC58352MvE);
        if (zArr.length == 3) {
            if (zArr[0]) {
                i = 0;
            } else {
                i = 8;
            }
            c79762VSc.setVisibility(i);
            if (zArr[1]) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            c79762VSc2.setVisibility(i2);
            c79762VSc3.setVisibility(zArr[2] ? 0 : 8);
            c79762VSc.setGravity(17);
            c79762VSc2.setGravity(17);
            c79762VSc3.setGravity(17);
            float f = 18;
            c79762VSc3.setTextSize(f);
            c79762VSc2.setTextSize(f);
            c79762VSc.setTextSize(f);
            c79762VSc.setOnItemSelectedListener(new C79933VYr(this));
            c79762VSc2.setOnItemSelectedListener(new C79934VYs(this));
            c79762VSc3.setOnItemSelectedListener(new C79940VYy(this));
            return;
        }
        throw new IllegalArgumentException("type[] length is not 3");
    }

    public static int LIZ(int i, int i2, int i3) {
        if (LJIILIIL.contains(String.valueOf(i2))) {
            return Math.min(i3, 31);
        }
        if (LJIILJJIL.contains(String.valueOf(i2))) {
            return Math.min(i3, 30);
        }
        if (i % 4 == 0 && i % 100 != 0) {
            return Math.min(i3, 29);
        }
        return Math.min(i3, 28);
    }

    public final void LIZIZ(int i, int i2, int i3, boolean z) {
        this.LIZLLL.setAdapter(new VZ1(i2, i3));
        if (z) {
            this.LIZLLL.setCurrentIndex(i);
        } else if (i > this.LIZLLL.getAdapter().LIZ() - 1) {
            i = this.LIZLLL.getAdapter().LIZ() - 1;
            this.LIZLLL.setCurrentIndex(i);
        }
        this.LJIIL = i + i2;
    }

    public final void LIZJ(int i, int i2, int i3, boolean z) {
        int i4;
        int i5;
        int currentItem;
        int i6 = this.LJ;
        int i7 = this.LJFF;
        if (i6 == i7 && this.LJI == this.LJII) {
            i4 = this.LJIIIIZZ;
            i5 = this.LJIIIZ;
        } else {
            if (i == i6 && i2 == this.LJI) {
                i4 = this.LJIIIIZZ;
            } else {
                i4 = 1;
                if (i == i7 && i2 == this.LJII) {
                    i5 = this.LJIIIZ;
                }
            }
            i5 = 31;
        }
        int LIZ = LIZ(i, i2, i5);
        if (z) {
            currentItem = i3 - i4;
        } else {
            currentItem = this.LIZLLL.getCurrentItem();
        }
        LIZIZ(currentItem, i4, LIZ, z);
    }
}
