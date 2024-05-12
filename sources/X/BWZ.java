package X;

/* loaded from: classes6.dex */
public enum BWZ {
    KARAOKE(3),
    BGM(3),
    VOICE_EFFECT(1),
    PAID_LIVE_EVENT(2),
    SUB_ONLY(2),
    COMMERCE(2),
    COMMERCE_GOODS(2);

    public final int LJLIL;

    public static BWZ valueOf(String str) {
        return (BWZ) V0N.LJJJ(BWZ.class, str);
    }

    public final boolean canCoexist() {
        return !BYI.LIZ(this);
    }

    public final boolean checkExclusive() {
        return BYI.LIZ(this);
    }

    public final int getFlag() {
        return this.LJLIL;
    }

    BWZ(int i) {
        this.LJLIL = i;
    }
}
