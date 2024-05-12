package X;

/* renamed from: X.Gts, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public enum EnumC42980Gts {
    START("start"),
    SUCCESS("success"),
    FAILED("failed"),
    CANCEL_EXTERNAL("cancel_external"),
    CANCEL_INTERNAL("cancel_internal"),
    PAUSED("paused"),
    CALLBACK_TIMEOUT("callback_timeout");

    public final String LJLIL;

    public static EnumC42980Gts valueOf(String str) {
        return (EnumC42980Gts) V0N.LJJJ(EnumC42980Gts.class, str);
    }

    public final String getDesc() {
        return this.LJLIL;
    }

    EnumC42980Gts(String str) {
        this.LJLIL = str;
    }
}
