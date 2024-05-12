package X;

/* loaded from: classes10.dex */
public final class L5M extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final L5M LJLIL = new L5M();

    public L5M() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        Integer num;
        java.util.Map map = (java.util.Map) L5I.LJIIJ.getValue();
        if (map != null && (num = (Integer) map.get("lower_fps_min_side_threshold_for_editor_pro")) != null) {
            i = num.intValue();
        } else {
            i = 1090;
        }
        return Integer.valueOf(i);
    }
}
