package X;

/* loaded from: classes13.dex */
public enum SVJ {
    DSP_ITEM_MUSIC(1),
    DSP_FULL_CLIP(2),
    TTM_TRACK_ID(4);

    public final int LJLIL;

    public static SVJ valueOf(String str) {
        return (SVJ) V0N.LJJJ(SVJ.class, str);
    }

    public final int getNumber() {
        return this.LJLIL;
    }

    SVJ(int i) {
        this.LJLIL = i;
    }
}
