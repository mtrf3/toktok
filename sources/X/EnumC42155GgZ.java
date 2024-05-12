package X;

/* renamed from: X.GgZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public enum EnumC42155GgZ {
    NEW("New"),
    RUNNING("Running"),
    END("End"),
    CANCELED("Canceled"),
    PENDING("Pending");

    public final String LJLIL;

    public static EnumC42155GgZ valueOf(String str) {
        return (EnumC42155GgZ) V0N.LJJJ(EnumC42155GgZ.class, str);
    }

    public final String getState() {
        return this.LJLIL;
    }

    EnumC42155GgZ(String str) {
        this.LJLIL = str;
    }
}
