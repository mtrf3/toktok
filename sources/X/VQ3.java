package X;

import com.lynx.react.bridge.ReadableArray;
import com.lynx.tasm.behavior.ui.utils.BackgroundDrawable;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes15.dex */
public class VQ3 {
    public final VNU LIZ;
    public BackgroundDrawable LIZIZ;
    public VQA LIZJ;
    public float LIZLLL;
    public int LJ;

    public BackgroundDrawable LIZ() {
        return new BackgroundDrawable(this.LIZ, this.LIZLLL);
    }

    public final VQQ LIZIZ() {
        BackgroundDrawable backgroundDrawable = this.LIZIZ;
        if (backgroundDrawable == null) {
            return null;
        }
        return backgroundDrawable.LJIL;
    }

    public final BackgroundDrawable LIZJ() {
        if (this.LIZIZ == null) {
            BackgroundDrawable LIZ = LIZ();
            this.LIZIZ = LIZ;
            LIZ.setCallback(this.LIZJ);
        }
        return this.LIZIZ;
    }

    public final void LIZLLL() {
        BackgroundDrawable backgroundDrawable = this.LIZIZ;
        if (backgroundDrawable == null) {
            return;
        }
        Iterator it = ((ArrayList) backgroundDrawable.LJIJJLI.LJLIL).iterator();
        while (it.hasNext()) {
            ((VR1) it.next()).LJ();
        }
    }

    public VQ3(VNU vnu) {
        this.LIZ = vnu;
    }

    public final void LJ(int i) {
        this.LJ = i;
        if (i == 0 && this.LIZIZ == null) {
            return;
        }
        LIZJ().setColor(i);
    }

    public final void LJI(int i, Integer num) {
        float intValue;
        float f = 1.0E21f;
        if (num == null) {
            intValue = 1.0E21f;
        } else {
            intValue = num.intValue() & 16777215;
            f = num.intValue() >>> 24;
        }
        LJFF(intValue, f, i);
    }

    public final boolean LJII(int i, ReadableArray readableArray) {
        int i2;
        int i3 = 0;
        if (readableArray == null || readableArray.size() <= 0) {
            if (i == 0) {
                int i4 = 0;
                do {
                    i4++;
                    LJIIIIZZ(i4, new C79699VPr());
                } while (i4 < 4);
            } else {
                LJIIIIZZ(i, new C79699VPr());
            }
            return false;
        }
        if (i == 0) {
            readableArray.size();
            do {
                i2 = i3 + 1;
                LJIIIIZZ(i2, C79699VPr.LIZ(i3 * 4, readableArray));
                i3 = i2;
            } while (i2 < 4);
            return true;
        }
        readableArray.size();
        LJIIIIZZ(i, C79699VPr.LIZ(0, readableArray));
        return true;
    }

    public final void LJIIIIZZ(int i, C79699VPr c79699VPr) {
        BackgroundDrawable LIZJ = LIZJ();
        LIZJ.getClass();
        if (i <= 0 || i > 8) {
            return;
        }
        VQQ vqq = LIZJ.LJIL;
        if (vqq == null) {
            LIZJ.LJIL = new VQQ();
            LIZJ.LJIILLIIL();
        } else {
            vqq.LJ = null;
        }
        if (!LIZJ.LJIL.LIZLLL(i - 1, c79699VPr)) {
            return;
        }
        LIZJ.LJIIZILJ = true;
        LIZJ.invalidateSelf();
    }

    public final void LJIIIZ(int i, int i2) {
        BackgroundDrawable LIZJ = LIZJ();
        LIZJ.getClass();
        if (i > 8 || i < 0) {
            return;
        }
        if (LIZJ.LJ == null) {
            LIZJ.LJ = new EnumC79725VQr[9];
        }
        try {
            EnumC79725VQr parse = EnumC79725VQr.parse(i2);
            EnumC79725VQr[] enumC79725VQrArr = LIZJ.LJ;
            if (enumC79725VQrArr[i] == parse) {
                return;
            }
            enumC79725VQrArr[i] = parse;
            LIZJ.invalidateSelf();
        } catch (Throwable unused) {
        }
    }

    public final void LJIIJ(float f, int i) {
        BackgroundDrawable LIZJ = LIZJ();
        if (!VJJ.LIZ(LIZJ.LIZ.LIZ[i], f)) {
            LIZJ.LIZ.LIZIZ(f, i);
            LIZJ.LJIIZILJ = true;
            LIZJ.LJIILL();
            LIZJ.invalidateSelf();
        }
    }

    public final void LJFF(float f, float f2, int i) {
        BackgroundDrawable LIZJ = LIZJ();
        if (LIZJ.LIZJ == null) {
            LIZJ.LIZJ = new VQ9(0.0f);
        }
        if (!VJJ.LIZ(LIZJ.LIZJ.LIZ[i], f)) {
            LIZJ.LIZJ.LIZIZ(f, i);
            LIZJ.invalidateSelf();
        }
        if (LIZJ.LIZLLL == null) {
            LIZJ.LIZLLL = new VQ9(255.0f);
        }
        if (!VJJ.LIZ(LIZJ.LIZLLL.LIZ[i], f2)) {
            LIZJ.LIZLLL.LIZIZ(f2, i);
            LIZJ.invalidateSelf();
        }
    }
}
