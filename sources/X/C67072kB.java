package X;

import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.2kB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67072kB extends AbstractC65781Prl implements InterfaceC88471Ynr<String, String, Boolean> {
    public static final C67072kB LJLIL = new C67072kB();

    public C67072kB() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final Boolean invoke(String str, String str2) {
        Object LIZ;
        Object LIZ2;
        String schema1 = str;
        String schema2 = str2;
        o.LJIIIZ(schema1, "schema1");
        o.LJIIIZ(schema2, "schema2");
        try {
            LIZ = UriProtector.getQueryParameter(UriProtector.parse(schema1), "url");
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Object obj = null;
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        String str3 = (String) LIZ;
        try {
            LIZ2 = UriProtector.getQueryParameter(UriProtector.parse(schema2), "url");
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th2) {
            LIZ2 = C141335gf.LIZ(th2);
            C3C5.m7constructorimpl(LIZ2);
        }
        if (!C3C5.m12isFailureimpl(LIZ2)) {
            obj = LIZ2;
        }
        return Boolean.valueOf(ujb.o.LJJJJIZL(str3, (String) obj, false));
    }
}
