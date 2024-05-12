package X;

import kotlin.jvm.internal.o;

/* renamed from: X.a69, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92153a69 implements InterfaceC14810i5 {
    public final C92152a68 LIZIZ = new C92152a68();

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
            if (i != 2 && i != 5) {
                if (i == 8) {
                    stringBuffer.append("-");
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
