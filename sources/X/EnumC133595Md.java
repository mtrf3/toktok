package X;

/* renamed from: X.5Md, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC133595Md {
    EDITOR_SEEK_FLAG_OnGoing(0),
    EDITOR_SEEK_FLAG_LastSeek(1),
    EDITOR_SEEK_FLAG_LAST_UpdateInOut(2),
    EDITOR_SEEK_FLAG_LAST_UpdateIn(3),
    EDITOR_SEEK_FLAG_LAST_UpdateOut(4);

    public final int LJLIL;

    public final int swigValue() {
        return this.LJLIL;
    }

    public static EnumC133595Md swigToEnum(int i) {
        EnumC133595Md[] enumC133595MdArr = (EnumC133595Md[]) EnumC133595Md.class.getEnumConstants();
        if (i < enumC133595MdArr.length && i >= 0) {
            EnumC133595Md enumC133595Md = enumC133595MdArr[i];
            if (enumC133595Md.LJLIL == i) {
                return enumC133595Md;
            }
        }
        for (EnumC133595Md enumC133595Md2 : enumC133595MdArr) {
            if (enumC133595Md2.LJLIL == i) {
                return enumC133595Md2;
            }
        }
        throw new IllegalArgumentException(AnonymousClass073.LIZ("No enum ", EnumC133595Md.class, " with value ", i));
    }

    public static EnumC133595Md valueOf(String str) {
        return (EnumC133595Md) V0N.LJJJ(EnumC133595Md.class, str);
    }

    EnumC133595Md(int i) {
        this.LJLIL = i;
    }
}
