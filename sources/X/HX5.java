package X;

/* loaded from: classes8.dex */
public enum HX5 implements HXV {
    DEFAULT(0),
    ACTIVITY_CREATED(1),
    ACTIVITY_STARTED(2),
    ACTIVITY_RESUME(3),
    UI_FRAME_AVAILABLE(4),
    ACTIVITY_ENTER_ANIMATION_END(5),
    CAMERA_FRAME_AVAILABLE(6);

    public final int LJLIL;

    public static HX5 valueOf(String str) {
        return (HX5) V0N.LJJJ(HX5.class, str);
    }

    @Override // X.HXV
    public int getValue() {
        return this.LJLIL;
    }

    HX5(int i) {
        this.LJLIL = i;
    }
}
