package X;

/* renamed from: X.3Lf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C82393Lf {
    public static EnumC82403Lg LIZ(int i) {
        EnumC82403Lg enumC82403Lg = EnumC82403Lg.ALL;
        if (i == enumC82403Lg.getValue()) {
            return enumC82403Lg;
        }
        EnumC82403Lg enumC82403Lg2 = EnumC82403Lg.UNREAD;
        if (i == enumC82403Lg2.getValue()) {
            return enumC82403Lg2;
        }
        EnumC82403Lg enumC82403Lg3 = EnumC82403Lg.NOT_REPLY;
        if (i == enumC82403Lg3.getValue()) {
            return enumC82403Lg3;
        }
        EnumC82403Lg enumC82403Lg4 = EnumC82403Lg.FOLLOWING;
        if (i == enumC82403Lg4.getValue()) {
            return enumC82403Lg4;
        }
        return EnumC82403Lg.NULL;
    }
}
