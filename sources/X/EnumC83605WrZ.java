package X;

import kotlin.jvm.internal.o;

/* renamed from: X.WrZ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public enum EnumC83605WrZ {
    AS_ENCODE_PROFILE_UNKNOWN,
    AS_ENCODE_PROFILE_BASELINE,
    AS_ENCODE_PROFILE_MAIN,
    AS_ENCODE_PROFILE_HIGH;

    public static final C83614Wri Companion = new C83614Wri();

    public static EnumC83605WrZ valueOf(String str) {
        return (EnumC83605WrZ) V0N.LJJJ(EnumC83605WrZ.class, str);
    }

    public static final EnumC83605WrZ fromOrdinal(int i) {
        Companion.getClass();
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return AS_ENCODE_PROFILE_UNKNOWN;
                    }
                    return AS_ENCODE_PROFILE_HIGH;
                }
                return AS_ENCODE_PROFILE_MAIN;
            }
            return AS_ENCODE_PROFILE_BASELINE;
        }
        return AS_ENCODE_PROFILE_UNKNOWN;
    }

    public static final int toIntValue(EnumC83605WrZ asEncodeProfile) {
        Companion.getClass();
        o.LJIIIZ(asEncodeProfile, "asEncodeProfile");
        int i = C83606Wra.LIZ[asEncodeProfile.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            if (i != 3) {
                if (i == 4) {
                    return 3;
                }
                throw new C162476Zf();
            }
            return 2;
        }
        return 0;
    }
}
