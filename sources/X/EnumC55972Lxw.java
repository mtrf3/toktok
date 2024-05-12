package X;

/* renamed from: X.Lxw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC55972Lxw {
    OLD(0),
    NEW(1);

    public long LJLIL;

    public static EnumC55972Lxw valueOf(String str) {
        return (EnumC55972Lxw) V0N.LJJJ(EnumC55972Lxw.class, str);
    }

    public final long getVersion() {
        return this.LJLIL;
    }

    public final void setVersion(long j) {
        this.LJLIL = j;
    }

    EnumC55972Lxw(long j) {
        this.LJLIL = j;
    }
}
