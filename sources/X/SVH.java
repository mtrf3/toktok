package X;

/* loaded from: classes13.dex */
public enum SVH {
    FULL_CLIP_ANCHOR_SHOW(1),
    FULL_CLIP_ANCHOR_CLICK(2),
    FULL_CLIP_TRACK_SHOW(3),
    DSP_ACTION_SHOW(4),
    DSP_ACTION_CLICK(5);

    public final int LJLIL;

    public static SVH valueOf(String str) {
        return (SVH) V0N.LJJJ(SVH.class, str);
    }

    public final int getNumber() {
        return this.LJLIL;
    }

    SVH(int i) {
        this.LJLIL = i;
    }
}
