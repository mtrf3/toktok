package X;

/* renamed from: X.321, reason: invalid class name */
/* loaded from: classes2.dex */
public enum AnonymousClass321 {
    ADD(1),
    REMOVE(2);

    public final int LJLIL;

    public static AnonymousClass321 valueOf(String str) {
        return (AnonymousClass321) V0N.LJJJ(AnonymousClass321.class, str);
    }

    public final int getAction() {
        return this.LJLIL;
    }

    AnonymousClass321(int i) {
        this.LJLIL = i;
    }
}
