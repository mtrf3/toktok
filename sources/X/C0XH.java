package X;

import android.text.Layout;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.0XH, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0XH {
    public final Layout LIZ;
    public final List<Integer> LIZIZ;
    public final List<Bidi> LIZJ;
    public final boolean[] LIZLLL;
    public char[] LJ;

    public C0XH(Layout layout) {
        o.LJIIIZ(layout, "layout");
        this.LIZ = layout;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            CharSequence text = this.LIZ.getText();
            o.LJIIIIZZ(text, "layout.text");
            int LJJLIIIJJIZ = s.LJJLIIIJJIZ(text, '\n', i, false, 4);
            if (LJJLIIIJJIZ < 0) {
                i = this.LIZ.getText().length();
            } else {
                i = LJJLIIIJJIZ + 1;
            }
            arrayList.add(Integer.valueOf(i));
        } while (i < this.LIZ.getText().length());
        this.LIZIZ = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(null);
        }
        this.LIZJ = arrayList2;
        this.LIZLLL = new boolean[((ArrayList) this.LIZIZ).size()];
        ((ArrayList) this.LIZIZ).size();
    }

    public final int LIZIZ(int i) {
        while (i > 0) {
            char charAt = this.LIZ.getText().charAt(i - 1);
            if (charAt != ' ' && charAt != '\n' && charAt != 5760) {
                if (8192 <= charAt) {
                    if (charAt < 8203) {
                        if (charAt == 8199) {
                            break;
                        }
                    } else if (charAt != 8287 && charAt != 12288) {
                        break;
                    }
                } else {
                    break;
                }
            }
            i--;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x0160, code lost:
    
        if (r0.getRunCount() == 1) goto L90;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float LIZ(int r24, boolean r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0XH.LIZ(int, boolean, boolean):float");
    }
}
