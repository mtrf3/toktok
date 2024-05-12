package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class IOV {
    public static final IOV INSTANCE;
    public static final /* synthetic */ IOV[] LJLIL;

    public static IOV valueOf(String str) {
        return (IOV) V0N.LJJJ(IOV.class, str);
    }

    public static IOV[] values() {
        return (IOV[]) LJLIL.clone();
    }

    static {
        IOV iov = new IOV();
        INSTANCE = iov;
        LJLIL = new IOV[]{iov};
    }
}
