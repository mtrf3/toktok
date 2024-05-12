package X;

import com.bytedance.ies.abmock.ClientExpManager;

/* renamed from: X.2km, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67442km extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C67442km LJLIL = new C67442km();

    public C67442km() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        Boolean bool;
        try {
            boolean z = true;
            if (FFL.LJIIIZ().LJIIJJI(ClientExpManager.nuj_report_page_start(), "nuj_report_page_start") != 1) {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
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
