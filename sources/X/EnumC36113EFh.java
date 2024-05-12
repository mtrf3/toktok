package X;

/* renamed from: X.EFh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public enum EnumC36113EFh {
    NOT_NEED_CLEAN_STORAGE(1),
    CLEAN_STORAGE_WITH_LOADING(2),
    CLEAN_STORAGE_SILENCE(3),
    CLICK_CANCEL_CLEAN_LOADING(4);

    public final int LJLIL;

    public static EnumC36113EFh valueOf(String str) {
        return (EnumC36113EFh) V0N.LJJJ(EnumC36113EFh.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EnumC36113EFh(int i) {
        this.LJLIL = i;
    }
}
