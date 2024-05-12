package X;

/* loaded from: classes10.dex */
public final class L5E extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final L5E LJLIL = new L5E();

    public L5E() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        java.util.Map map = (java.util.Map) L5I.LJIIIZ.getValue();
        if (map == null || map.isEmpty()) {
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }
}
