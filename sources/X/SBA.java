package X;

import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SBA extends AbstractC65781Prl implements InterfaceC88472Yns<String, Boolean> {
    public static final SBA LJLIL = new SBA();

    public SBA() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(String it) {
        o.LJIIIZ(it, "it");
        return Boolean.valueOf(o.LJ(it, "eg_ccdc_global_billing_address_country_regin"));
    }
}
