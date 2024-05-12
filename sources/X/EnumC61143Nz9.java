package X;

/* renamed from: X.Nz9, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public enum EnumC61143Nz9 {
    STEP_START("step_start"),
    STEP_ROMA("step_roma"),
    STEP_SPARK("step_spark"),
    STEP_LOAD("step_load"),
    STEP_RENDER_NATIVE("step_render_native"),
    STEP_RENDER_LYNX("step_render_lynx"),
    STEP_PRE_FETCH("step_pre_fetch"),
    STEP_FETCH("step_fetch"),
    STEP_JSB("step_jsb"),
    STEP_EXIT("step_exit");

    public final String LJLIL;

    public static EnumC61143Nz9 valueOf(String str) {
        return (EnumC61143Nz9) V0N.LJJJ(EnumC61143Nz9.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    EnumC61143Nz9(String str) {
        this.LJLIL = str;
    }
}
