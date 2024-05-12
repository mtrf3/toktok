package X;

import kotlin.jvm.internal.o;

/* renamed from: X.7cw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C189987cw {
    public static EnumC189997cx LIZ(String str, boolean z) {
        EnumC189997cx enumC189997cx = EnumC189997cx.REGIONAL;
        if (o.LJ(str, enumC189997cx.typeCode)) {
            return enumC189997cx;
        }
        EnumC189997cx enumC189997cx2 = EnumC189997cx.UN_CLAIMED_STORE;
        if (o.LJ(str, enumC189997cx2.typeCode)) {
            if (!z) {
                return enumC189997cx2;
            }
            return EnumC189997cx.CLAIMED_STORE;
        }
        EnumC189997cx enumC189997cx3 = EnumC189997cx.INDEPENDENT;
        o.LJ(str, enumC189997cx3.typeCode);
        return enumC189997cx3;
    }
}
