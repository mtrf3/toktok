package X;

import com.google.gson.m;
import kotlin.jvm.internal.o;

/* renamed from: X.DhE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34552DhE implements InterfaceC34553DhF {
    @Override // X.InterfaceC34553DhF
    public final Integer LIZ(m jsonObject) {
        Object LIZ;
        o.LJIIIZ(jsonObject, "jsonObject");
        try {
            LIZ = Integer.valueOf(jsonObject.LJJIJ("schema_settings_unique_id").LJIILJJIL());
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        Integer num = (Integer) LIZ;
        if (num == null) {
            return -1;
        }
        return num;
    }

    @Override // X.InterfaceC34553DhF
    public final String LIZIZ(m jsonObject) {
        Object LIZ;
        o.LJIIIZ(jsonObject, "jsonObject");
        try {
            LIZ = jsonObject.LJJIJ("identifier").LJJIFFI();
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        String str = (String) LIZ;
        if (str == null) {
            return "";
        }
        return str;
    }
}
