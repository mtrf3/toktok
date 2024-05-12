package X;

/* loaded from: classes10.dex */
public final class L5G extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final L5G LJLIL = new L5G();

    public L5G() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        Integer num;
        java.util.Map map = (java.util.Map) L5I.LJIIJ.getValue();
        if (map != null && (num = (Integer) map.get("higher_fps_min_side_threshold_for_editor_pro")) != null) {
            i = num.intValue();
        } else {
            i = 1090;
        }
        return Integer.valueOf(i);
    }
}
