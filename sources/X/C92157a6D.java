package X;

import kotlin.jvm.internal.o;

/* renamed from: X.a6D, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92157a6D implements InterfaceC14810i5 {
    public final Integer LIZIZ = null;

    public static final C14770i1 LIZIZ(C08440Uu c08440Uu) {
        int length = c08440Uu.length();
        String str = "";
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            if (i > 0 && i % 4 == 0 && i < 19) {
                str = o.LJIILLIIL(' ', str);
            }
            str = o.LJIILLIIL(Character.valueOf(c08440Uu.charAt(i)), str);
            i = i2;
        }
        return new C14770i1(new C08440Uu(str, null, 6), new C92156a6C());
    }

    @Override // X.InterfaceC14810i5
    public final C14770i1 LIZ(C08440Uu text) {
        o.LJIIIZ(text, "text");
        Integer num = this.LIZIZ;
        int i = 0;
        String str = "";
        if (num != null) {
            if (num.intValue() == 14 || num.intValue() == 15) {
                int length = text.length();
                while (i < length) {
                    int i2 = i + 1;
                    str = o.LJIILLIIL(Character.valueOf(text.charAt(i)), str);
                    if (i == 3 || i == 9) {
                        str = o.LJIILLIIL(' ', str);
                    }
                    i = i2;
                }
                return new C14770i1(new C08440Uu(str, null, 6), new C92154a6A());
            }
            if (num.intValue() == 16) {
                int length2 = text.length();
                while (i < length2) {
                    int i3 = i + 1;
                    str = o.LJIILLIIL(Character.valueOf(text.charAt(i)), str);
                    if (i % 4 == 3 && i < 15) {
                        str = o.LJIILLIIL(' ', str);
                    }
                    i = i3;
                }
                return new C14770i1(new C08440Uu(str, null, 6), new C92155a6B());
            }
            if (num.intValue() == 19) {
                return LIZIZ(text);
            }
        }
        return LIZIZ(text);
    }
}
