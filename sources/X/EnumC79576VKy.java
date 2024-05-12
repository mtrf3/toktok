package X;

/* renamed from: X.VKy, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public enum EnumC79576VKy {
    YES,
    NO,
    UNSET;

    public boolean asBoolean() {
        int i = C79577VKz.LIZ[ordinal()];
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            if (i != 3) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Unrecognized TriState value: ");
                LIZ.append(this);
                throw new IllegalStateException(X1D.LIZIZ(LIZ));
            }
            throw new IllegalStateException("No boolean equivalent for UNSET");
        }
        return false;
    }

    public Boolean asBooleanObject() {
        int i = C79577VKz.LIZ[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return null;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Unrecognized TriState value: ");
                LIZ.append(this);
                throw new IllegalStateException(X1D.LIZIZ(LIZ));
            }
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    public int getDbValue() {
        int i = C79577VKz.LIZ[ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 3;
            }
        }
        return i2;
    }

    public boolean isSet() {
        if (this != UNSET) {
            return true;
        }
        return false;
    }

    public static EnumC79576VKy fromDbValue(int i) {
        if (i != 1) {
            if (i != 2) {
                return UNSET;
            }
            return NO;
        }
        return YES;
    }

    public static EnumC79576VKy valueOf(Boolean bool) {
        if (bool != null) {
            return valueOf(bool.booleanValue());
        }
        return UNSET;
    }

    public boolean asBoolean(boolean z) {
        int i = C79577VKz.LIZ[ordinal()];
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            if (i == 3) {
                return z;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Unrecognized TriState value: ");
            LIZ.append(this);
            throw new IllegalStateException(X1D.LIZIZ(LIZ));
        }
        return false;
    }

    public static EnumC79576VKy valueOf(boolean z) {
        if (z) {
            return YES;
        }
        return NO;
    }
}
