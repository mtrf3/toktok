package X;

/* renamed from: X.Tm1, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public enum EnumC75617Tm1 {
    NONE(0),
    RANDOM_LINK_MIC_RECOMMEND(7),
    TOPIC_PAIR(13),
    TOPIC_INVITE(14);

    public long LJLIL;

    public static EnumC75617Tm1 valueOf(String str) {
        return (EnumC75617Tm1) V0N.LJJJ(EnumC75617Tm1.class, str);
    }

    public final long getType() {
        return this.LJLIL;
    }

    public final void setType(long j) {
        this.LJLIL = j;
    }

    EnumC75617Tm1(long j) {
        this.LJLIL = j;
    }
}
