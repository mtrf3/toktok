package X;

/* renamed from: X.3Mj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C82693Mj {
    public static EnumC82443Lk LIZ(int i) {
        EnumC82443Lk enumC82443Lk = EnumC82443Lk.ALL;
        if (i == enumC82443Lk.getValue()) {
            return enumC82443Lk;
        }
        EnumC82443Lk enumC82443Lk2 = EnumC82443Lk.PRIMARY;
        if (i == enumC82443Lk2.getValue()) {
            return enumC82443Lk2;
        }
        EnumC82443Lk enumC82443Lk3 = EnumC82443Lk.SECONDARY;
        if (i == enumC82443Lk3.getValue()) {
            return enumC82443Lk3;
        }
        return EnumC82443Lk.NULL;
    }
}
