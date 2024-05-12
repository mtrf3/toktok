package X;

import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.ErA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37716ErA {
    public final String LIZ;
    public int LIZIZ;
    public final List<AbstractC37717ErB> LIZJ = new ArrayList();

    public final List<AbstractC37717ErB> LIZIZ() {
        AbstractC37717ErB c37721ErF;
        char charAt;
        char charAt2;
        char charAt3;
        while (this.LIZIZ < this.LIZ.length()) {
            char charAt4 = this.LIZ.charAt(this.LIZIZ);
            if (charAt4 == ',') {
                ((ArrayList) this.LIZJ).add(AbstractC37717ErB.LIZ);
            } else if (charAt4 == '\'') {
                ORS.LJJLIIIJJI(this.LIZJ, OJ4.LJJJJLL(new C37655EqB(new C37679EqZ(this, null)), C37718ErC.LJLIL));
            } else if (charAt4 == '0' || charAt4 == '1' || charAt4 == '2' || charAt4 == '3' || charAt4 == '4' || charAt4 == '5' || charAt4 == '6' || charAt4 == '7' || charAt4 == '8' || charAt4 == '9') {
                List<AbstractC37717ErB> list = this.LIZJ;
                int i = this.LIZIZ;
                int i2 = i;
                while (i2 < this.LIZ.length() && '0' <= (charAt3 = this.LIZ.charAt(i2)) && charAt3 < ':') {
                    i2++;
                }
                if (i2 >= this.LIZ.length() || this.LIZ.charAt(i2) != '.' || ('0' <= (charAt2 = this.LIZ.charAt((i2 = i2 + 1))) && charAt2 < ':')) {
                    while (i2 < this.LIZ.length() && '0' <= (charAt = this.LIZ.charAt(i2)) && charAt < ':') {
                        i2++;
                    }
                    String substring = this.LIZ.substring(i, i2);
                    o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    float parseFloat = CastFloatProtector.parseFloat(substring);
                    if (LIZ(i2, "dp")) {
                        i2 += 2;
                        c37721ErF = new C37720ErE(C32151Nz.LJIIZILJ(Float.valueOf(parseFloat)));
                    } else if (LIZ(i2, "sp")) {
                        i2 += 2;
                        c37721ErF = new C37720ErE(C32151Nz.LJJIII(Float.valueOf(parseFloat)));
                    } else if (LIZ(i2, "px")) {
                        i2 += 2;
                        c37721ErF = new C37720ErE((int) parseFloat);
                    } else if (LIZ(i2, "w")) {
                        i2++;
                        c37721ErF = new C37719ErD(CardStruct.IStatusCode.DEFAULT, parseFloat);
                    } else if (LIZ(i2, "%")) {
                        i2++;
                        c37721ErF = new C37721ErF(parseFloat / 100);
                    } else if (LIZ(i2, ",") || i2 == this.LIZ.length()) {
                        c37721ErF = new C37721ErF(parseFloat);
                    } else {
                        throw new IllegalStateException("number end with unexpected token");
                    }
                    if (i2 == this.LIZ.length() || this.LIZ.charAt(i2) == ',') {
                        this.LIZIZ = i2;
                        ((ArrayList) list).add(c37721ErF);
                    } else {
                        throw new IllegalStateException("number end with unexpected token");
                    }
                } else {
                    throw new IllegalStateException("not a legal number!");
                }
            } else {
                throw new IllegalStateException("unknown config");
            }
            if (this.LIZIZ >= this.LIZ.length() || this.LIZ.charAt(this.LIZIZ) == ',') {
                this.LIZIZ++;
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("expect , at ");
                LIZ.append(this.LIZIZ);
                throw new IllegalStateException(X1D.LIZIZ(LIZ));
            }
        }
        if (ujb.o.LJJJJ(this.LIZ, ",", false)) {
            ((ArrayList) this.LIZJ).add(AbstractC37717ErB.LIZ);
        }
        return this.LIZJ;
    }

    public C37716ErA(String str) {
        this.LIZ = str;
    }

    public final boolean LIZ(int i, String str) {
        if (str.length() + i > this.LIZ.length()) {
            return false;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (this.LIZ.charAt(i + i2) != str.charAt(i2)) {
                return false;
            }
        }
        return true;
    }
}
