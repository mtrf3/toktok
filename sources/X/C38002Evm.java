package X;

/* renamed from: X.Evm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38002Evm {
    public static EnumC38003Evn LIZ(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -977423767:
                    if (str.equals("public")) {
                        return EnumC38003Evn.PUBLIC;
                    }
                    break;
                case -906273929:
                    if (str.equals("secure")) {
                        return EnumC38003Evn.SECURE;
                    }
                    break;
                case -608539730:
                    if (str.equals("protected")) {
                        return EnumC38003Evn.PROTECT;
                    }
                    break;
                case -314497661:
                    if (str.equals("private")) {
                        return EnumC38003Evn.PRIVATE;
                    }
                    break;
                case -309012785:
                    if (str.equals("protect")) {
                        return EnumC38003Evn.PROTECT;
                    }
                    break;
            }
        }
        return EnumC38003Evn.PUBLIC;
    }
}
