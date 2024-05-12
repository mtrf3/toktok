package X;

import kotlin.jvm.internal.o;

/* renamed from: X.a65, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92149a65 implements InterfaceC14810i5 {
    public final C92148a64 LIZIZ = new C92148a64();

    @Override // X.InterfaceC14810i5
    public final C14770i1 LIZ(C08440Uu text) {
        o.LJIIIZ(text, "text");
        StringBuffer stringBuffer = new StringBuffer();
        String str = text.LJLIL;
        int length = str.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            stringBuffer.append(str.charAt(i));
            if (i != 1 && i != 4) {
                if (i != 7) {
                    if (i == 11) {
                        stringBuffer.append("-");
                    }
                } else {
                    stringBuffer.append("/");
                }
            } else {
                stringBuffer.append(".");
            }
            i = i2;
        }
        String stringBuffer2 = stringBuffer.toString();
        o.LJIIIIZZ(stringBuffer2, "out.toString()");
        return new C14770i1(new C08440Uu(stringBuffer2, null, 6), this.LIZIZ);
    }
}
