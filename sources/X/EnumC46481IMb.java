package X;

/* renamed from: X.IMb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public enum EnumC46481IMb {
    type_Unknown(-1),
    type_AudioVideo(0),
    type_Video(1),
    type_Audio(2),
    type_Image(3),
    type_Camera(4),
    type_Color(5),
    type_ImageVideo(6);

    public final int LJLIL;

    public int getValue() {
        return this.LJLIL;
    }

    public static EnumC46481IMb valueOf(String str) {
        return (EnumC46481IMb) V0N.LJJJ(EnumC46481IMb.class, str);
    }

    EnumC46481IMb(int i) {
        this.LJLIL = i;
    }
}
