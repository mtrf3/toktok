package X;

import kotlin.jvm.internal.o;

/* renamed from: X.7ng, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C196647ng {
    public static final EnumC196637nf LIZ(EnumC196637nf enumC196637nf) {
        o.LJIIIZ(enumC196637nf, "<this>");
        int i = C196657nh.LIZ[enumC196637nf.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return EnumC196637nf.BACK_IMAGE_THUMBNAIL;
                    }
                    throw new C162476Zf();
                }
                return EnumC196637nf.BACK_IMAGE;
            }
            return EnumC196637nf.FRONT_IMAGE_THUMBNAIL;
        }
        return EnumC196637nf.FRONT_IMAGE;
    }
}
