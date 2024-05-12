package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes13.dex */
public final class SW7 {
    public static final /* synthetic */ SW7[] LJLIL;
    public static final SW7 TT_TO_DSP;

    public static SW7 valueOf(String str) {
        return (SW7) V0N.LJJJ(SW7.class, str);
    }

    public static SW7[] values() {
        return (SW7[]) LJLIL.clone();
    }

    static {
        SW7 sw7 = new SW7();
        TT_TO_DSP = sw7;
        LJLIL = new SW7[]{sw7};
    }

    public final int getValue() {
        return ordinal() + 1;
    }
}
