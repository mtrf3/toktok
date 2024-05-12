package X;

import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.internal.o;

/* renamed from: X.MqQ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58054MqQ {
    public final TuxTextView LIZ;
    public final String LIZIZ;
    public int LIZJ;
    public float LIZLLL;
    public final EnumC58058MqU LJ;
    public final /* synthetic */ C58053MqP LJFF;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Piece:[container:");
        LIZ.append(this.LIZ.hashCode());
        LIZ.append(", display:\"");
        LIZ.append(LIZ(this.LIZJ));
        LIZ.append("\", text:");
        LIZ.append(this.LIZIZ);
        LIZ.append(", last:");
        LIZ.append(this.LIZJ);
        LIZ.append(", width:");
        LIZ.append(this.LIZLLL);
        LIZ.append(", type:");
        LIZ.append(this.LJ);
        LIZ.append(']');
        return X1D.LIZIZ(LIZ);
    }

    public final String LIZ(int i) {
        if (i < 0) {
            return "...";
        }
        if (i <= this.LIZIZ.length() - 2) {
            StringBuilder LIZ = X1D.LIZ();
            String substring = this.LIZIZ.substring(0, i + 1);
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            LIZ.append(substring);
            LIZ.append("...");
            return X1D.LIZIZ(LIZ);
        }
        return this.LIZIZ;
    }

    public final float LIZIZ(float f) {
        float measureText;
        float f2 = this.LIZLLL;
        if (this.LIZJ < 0) {
            return 0.0f;
        }
        do {
            int i = this.LIZJ;
            if (i >= 0) {
                int i2 = i - 1;
                this.LIZJ = i2;
                measureText = this.LJFF.LIZJ.getPaint().measureText(LIZ(i2));
                this.LIZLLL = measureText;
            } else {
                return f2 - this.LIZLLL;
            }
        } while (measureText > f2 - f);
        return f2 - measureText;
    }

    public C58054MqQ(C58053MqP c58053MqP, TuxTextView container, String text, int i, float f, EnumC58058MqU type) {
        o.LJIIIZ(container, "container");
        o.LJIIIZ(text, "text");
        o.LJIIIZ(type, "type");
        this.LJFF = c58053MqP;
        this.LIZ = container;
        this.LIZIZ = text;
        this.LIZJ = i;
        this.LIZLLL = f;
        this.LJ = type;
    }
}
