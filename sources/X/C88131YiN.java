package X;

/* renamed from: X.YiN, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88131YiN {
    public static EnumC88128YiK LIZ(int i) {
        EnumC88128YiK[] valuesCustom = EnumC88128YiK.valuesCustom();
        int length = valuesCustom.length;
        int i2 = 0;
        while (i2 < length) {
            EnumC88128YiK enumC88128YiK = valuesCustom[i2];
            i2++;
            if (enumC88128YiK.code == i) {
                return enumC88128YiK;
            }
        }
        return EnumC88128YiK.Unknown;
    }
}
