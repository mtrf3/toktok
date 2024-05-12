package X;

/* loaded from: classes7.dex */
public final class FKQ extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final FKQ LJLIL = new FKQ();

    public FKQ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (!C35820E4a.LIZIZ(FKM.LIZ(), "string_hot_update_need_block_on_tablet", true)) {
            z = C35820E4a.LIZIZ(FKM.LIZ(), "string_hot_update_online", false);
        }
        return Boolean.valueOf(z);
    }
}
