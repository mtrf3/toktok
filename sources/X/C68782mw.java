package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import ujb.o;

/* renamed from: X.2mw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C68782mw {
    public static C68772mv LIZ(long j, long j2, String str, String str2) {
        if (str != null && !o.LJJJJJL(str) && str2 != null && !o.LJJJJJL(str2) && j2 > 0 && j > 0) {
            try {
                return new C68772mv(CastLongProtector.parseLong(str), CastLongProtector.parseLong(str2), j, j2);
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
