package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class TZL {
    public static final TZL ANCHOR_MUTE_AUDIO_WHEN_FIRST_FRAME;
    public static final /* synthetic */ TZL[] LJLILLLLZI;
    public final int LJLIL = 1;

    public static TZL valueOf(String str) {
        return (TZL) V0N.LJJJ(TZL.class, str);
    }

    public static TZL[] values() {
        return (TZL[]) LJLILLLLZI.clone();
    }

    static {
        TZL tzl = new TZL();
        ANCHOR_MUTE_AUDIO_WHEN_FIRST_FRAME = tzl;
        LJLILLLLZI = new TZL[]{tzl};
    }

    public final int getFlag() {
        return this.LJLIL;
    }
}
