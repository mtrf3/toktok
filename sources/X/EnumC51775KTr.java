package X;

/* renamed from: X.KTr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public enum EnumC51775KTr {
    PREFETCH(0),
    PRELOAD(1),
    FIRST_REQUEST(2),
    REFRESH(3),
    ERROR_RETRY(4),
    RETURN_MALL(5);

    public final int LJLIL;

    public static EnumC51775KTr valueOf(String str) {
        return (EnumC51775KTr) V0N.LJJJ(EnumC51775KTr.class, str);
    }

    public final int getType() {
        return this.LJLIL;
    }

    EnumC51775KTr(int i) {
        this.LJLIL = i;
    }
}
