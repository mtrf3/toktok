package X;

/* renamed from: X.4ta, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC123864ta {
    NONE(0),
    AUDIO(1),
    VIDEO(2),
    STICKER(3),
    EFFECT(4),
    FILTER(5),
    IMAGE(6),
    MV(7),
    EFFECT_STICKER(8),
    IMAGE_TEMPLATE_EFFECT(9);

    public final int LJLIL;

    public final int swigValue() {
        return this.LJLIL;
    }

    public static EnumC123864ta swigToEnum(int i) {
        EnumC123864ta[] enumC123864taArr = (EnumC123864ta[]) EnumC123864ta.class.getEnumConstants();
        if (i < enumC123864taArr.length && i >= 0) {
            EnumC123864ta enumC123864ta = enumC123864taArr[i];
            if (enumC123864ta.LJLIL == i) {
                return enumC123864ta;
            }
        }
        for (EnumC123864ta enumC123864ta2 : enumC123864taArr) {
            if (enumC123864ta2.LJLIL == i) {
                return enumC123864ta2;
            }
        }
        throw new IllegalArgumentException(AnonymousClass073.LIZ("No enum ", EnumC123864ta.class, " with value ", i));
    }

    public static EnumC123864ta valueOf(String str) {
        return (EnumC123864ta) V0N.LJJJ(EnumC123864ta.class, str);
    }

    EnumC123864ta(int i) {
        this.LJLIL = i;
    }
}
