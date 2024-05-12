package X;

/* loaded from: classes12.dex */
public enum POP {
    PAGE(1),
    EVENT(2),
    CUSTOM_EVENT(3),
    NET_API(101);

    public final int LJLIL;

    public static POP valueOf(String str) {
        return (POP) V0N.LJJJ(POP.class, str);
    }

    public final int getType() {
        return this.LJLIL;
    }

    POP(int i) {
        this.LJLIL = i;
    }
}
