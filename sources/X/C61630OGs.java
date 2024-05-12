package X;

import kotlin.jvm.internal.o;

/* renamed from: X.OGs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61630OGs {
    public static final int LIZ(EnumC61629OGr enumC61629OGr, boolean z) {
        o.LJIIIZ(enumC61629OGr, "<this>");
        switch (C61631OGt.LIZ[enumC61629OGr.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return enumC61629OGr.getPosition();
            case 5:
                if (C59859NeR.LIZIZ()) {
                    return 3;
                }
                return 2;
            case 6:
                if (z) {
                    if (C59859NeR.LIZIZ()) {
                        return enumC61629OGr.getPosition();
                    }
                    return 3;
                }
                return enumC61629OGr.getPosition();
            default:
                throw new C162476Zf();
        }
    }

    public static final EnumC61629OGr LIZIZ(int i, boolean z) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return EnumC61629OGr.DEFAULT;
                    }
                    if (z) {
                        if (C59859NeR.LIZIZ()) {
                            return EnumC61629OGr.TAB_TYPE_LOCAL;
                        }
                        return EnumC61629OGr.TAB_TYPE_MORE;
                    }
                    return EnumC61629OGr.DEFAULT;
                }
                if (C59859NeR.LIZIZ()) {
                    return EnumC61629OGr.TAB_TYPE_MORE;
                }
                if (z) {
                    return EnumC61629OGr.TAB_TYPE_LOCAL;
                }
                if (C59859NeR.LIZ()) {
                    return EnumC61629OGr.TAB_TYPE_MORE;
                }
                return EnumC61629OGr.DEFAULT;
            }
            return EnumC61629OGr.TAB_TYPE_COLLECT;
        }
        if (C59859NeR.LIZ()) {
            return EnumC61629OGr.TAB_TYPE_FOR_YOU;
        }
        return EnumC61629OGr.TAB_TYPE_DISCOVER;
    }
}
