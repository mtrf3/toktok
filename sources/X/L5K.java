package X;

/* loaded from: classes10.dex */
public final class L5K extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final L5K LJLIL = new L5K();

    public L5K() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        Integer num;
        java.util.Map map = (java.util.Map) L5I.LJIIIZ.getValue();
        if (map != null && (num = (Integer) map.get("lower_fps_min_side_threshold_for_editor_pro")) != null) {
            i = num.intValue();
        } else {
            i = 1090;
        }
        return Integer.valueOf(i);
    }
}
