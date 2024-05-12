package X;

import com.bytedance.mt.protector.impl.string2number.CastByteProtector;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.mt.protector.impl.string2number.CastShortProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.EdT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36867EdT {
    public static final /* synthetic */ int LIZ = 0;

    public static Object LIZ(Class cls, String str) {
        if (o.LJ(cls, Integer.class)) {
            return Integer.valueOf(CastIntegerProtector.parseInt(str));
        }
        if (o.LJ(cls, Boolean.class)) {
            return Boolean.valueOf(Boolean.parseBoolean(str));
        }
        if (o.LJ(cls, Short.class)) {
            return Short.valueOf(CastShortProtector.parseShort(str));
        }
        if (o.LJ(cls, Long.class)) {
            return Long.valueOf(CastLongProtector.parseLong(str));
        }
        if (o.LJ(cls, Float.class)) {
            return Float.valueOf(CastFloatProtector.parseFloat(str));
        }
        if (o.LJ(cls, Double.class)) {
            return Double.valueOf(CastDoubleProtector.parseDouble(str));
        }
        if (o.LJ(cls, Byte.class)) {
            return Byte.valueOf(CastByteProtector.parseByte(str));
        }
        if (!o.LJ(cls, Character.class)) {
            return str;
        }
        return Character.valueOf(C40689Fy1.LLFII(str));
    }
}
