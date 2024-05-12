package X;

/* renamed from: X.OoY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63034OoY {
    public static EnumC63033OoX LIZ(int i) {
        EnumC63033OoX enumC63033OoX = EnumC63033OoX.PRIMARY;
        if (i == enumC63033OoX.getValue()) {
            return enumC63033OoX;
        }
        EnumC63033OoX enumC63033OoX2 = EnumC63033OoX.SECONDARY;
        if (i != enumC63033OoX2.getValue()) {
            enumC63033OoX2 = EnumC63033OoX.DESTRUCTIVE;
            if (i != enumC63033OoX2.getValue()) {
                return enumC63033OoX;
            }
        }
        return enumC63033OoX2;
    }
}
