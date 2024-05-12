package X;

import com.ss.android.ugc.aweme.ecommerce.core.ab.AddressSearchMapConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.Alt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27197Alt extends AbstractC65781Prl implements InterfaceC65784Pro<AddressSearchMapConfig> {
    public static final C27197Alt LJLIL = new C27197Alt();

    public C27197Alt() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final AddressSearchMapConfig invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        AddressSearchMapConfig addressSearchMapConfig = C27196Als.LIZIZ;
        LJIIIZ.getClass();
        Object LJIJ = FFL.LJIJ(true, "ecom_address_search_map_opt", 31744, AddressSearchMapConfig.class, addressSearchMapConfig);
        if (LJIJ == 0) {
            C27196Als.LIZ.getClass();
        } else {
            addressSearchMapConfig = LJIJ;
        }
        o.LJIIIIZZ(addressSearchMapConfig, "ABManager.getInstance()\n…a)\n            ?: DEFAULT");
        return addressSearchMapConfig;
    }
}
