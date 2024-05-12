package X;

/* renamed from: X.0sI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC21140sI {
    PLAY("play"),
    PAUSE("pause"),
    NEXT("cut_off"),
    NEXT_DIALOG_CONFIRM("cut_off_continue"),
    NEXT_DIALOG_CANCEL("cut_off_cancel"),
    PIN_TOP("top"),
    QUEUE_REMOVE("remove"),
    QUEUE_REMOVE_DIALOG_CONFIRM("remove_continue"),
    QUEUE_REMOVE_DIALOG_CANCEL("remove_cancel");

    public final String LJLIL;

    public static EnumC21140sI valueOf(String str) {
        return (EnumC21140sI) V0N.LJJJ(EnumC21140sI.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    EnumC21140sI(String str) {
        this.LJLIL = str;
    }
}
