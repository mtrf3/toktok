package X;

import com.bytedance.ies.abmock.ClientExpManager;

/* loaded from: classes7.dex */
public final class ELX extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final ELX LJLIL = new ELX();

    public ELX() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        try {
            i = FFL.LJIIIZ().LJIIJJI(ClientExpManager.low_storage_gecko_unload_high_type(), "low_storage_gecko_unload_high_type");
        } catch (Exception unused) {
            i = 0;
        }
        return Integer.valueOf(i);
    }
}
