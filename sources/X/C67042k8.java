package X;

import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.2k8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67042k8 extends AbstractC65781Prl implements InterfaceC88471Ynr<String, String, Boolean> {
    public static final C67042k8 LJLIL = new C67042k8();

    public C67042k8() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final Boolean invoke(String schema1, String str) {
        Boolean bool;
        String schema2 = str;
        o.LJIIIZ(schema1, "schema1");
        o.LJIIIZ(schema2, "schema2");
        try {
            Boolean valueOf = Boolean.valueOf(o.LJ(UriProtector.getQueryParameter(UriProtector.parse(schema2), "key_biz"), "biz_glb_live_gift_render_lynx"));
            C3C5.m7constructorimpl(valueOf);
            bool = valueOf;
        } catch (Throwable th) {
            C3C4 LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
            bool = LIZ;
        }
        Boolean bool2 = Boolean.FALSE;
        if (C3C5.m12isFailureimpl(bool)) {
            return bool2;
        }
        return bool;
    }
}
