package X;

/* loaded from: classes10.dex */
public final class L5L extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final L5L LJLIL = new L5L();

    public L5L() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        Integer num;
        java.util.Map map = (java.util.Map) L5I.LJIIJ.getValue();
        if (map != null && (num = (Integer) map.get("higher_fps_threshold")) != null) {
            i = num.intValue();
        } else {
            i = 40;
        }
        return Integer.valueOf(i);
    }
}
