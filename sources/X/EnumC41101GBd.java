package X;

/* renamed from: X.GBd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public enum EnumC41101GBd {
    NO_SHOW(0),
    SHOW(1),
    GRAYED_OUT_FOR_MODERATION(2),
    GRAYED_OUT_FOR_FREQ_CONTROL(3),
    GRAYED_OUT_FOR_TIME_EXPIRATION(4),
    GRAYED_OUT_FOR_IN_PROCESS(5);

    public final int LJLIL;

    public static EnumC41101GBd valueOf(String str) {
        return (EnumC41101GBd) V0N.LJJJ(EnumC41101GBd.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EnumC41101GBd(int i) {
        this.LJLIL = i;
    }
}
