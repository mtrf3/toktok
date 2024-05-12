package X;

/* renamed from: X.STn, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public enum EnumC72155STn {
    SUBMIT(1),
    PROCESS(2),
    SUCCESS(3),
    FAILED(4),
    DISCARD_SUBMIT(5),
    DISCARD_PROCESS(6),
    DISCARD_FAILED(7);

    public final int LJLIL;

    public static EnumC72155STn valueOf(String str) {
        return (EnumC72155STn) V0N.LJJJ(EnumC72155STn.class, str);
    }

    public final int getStatus() {
        return this.LJLIL;
    }

    EnumC72155STn(int i) {
        this.LJLIL = i;
    }
}
