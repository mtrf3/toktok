package X;

import kotlin.jvm.internal.o;

/* renamed from: X.a67, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92151a67 implements InterfaceC14810i5 {
    public final C92150a66 LIZIZ = new C92150a66();

    @Override // X.InterfaceC14810i5
    public final C14770i1 LIZ(C08440Uu text) {
        o.LJIIIZ(text, "text");
        String str = text.LJLIL;
        int length = str.length();
        String str2 = "";
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            str2 = o.LJIILLIIL(Character.valueOf(str.charAt(i)), str2);
            if (i == 1) {
                str2 = o.LJIILLIIL("/", str2);
            }
            i = i2;
        }
        return new C14770i1(new C08440Uu(str2, null, 6), this.LIZIZ);
    }
}
