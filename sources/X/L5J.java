package X;

/* loaded from: classes10.dex */
public final class L5J extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final L5J LJLIL = new L5J();

    public L5J() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        Integer num;
        java.util.Map map = (java.util.Map) L5I.LJIIIZ.getValue();
        if (map != null && (num = (Integer) map.get("higher_fps_threshold")) != null) {
            i = num.intValue();
        } else {
            i = 40;
        }
        return Integer.valueOf(i);
    }
}
