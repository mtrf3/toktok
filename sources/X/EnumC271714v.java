package X;

/* renamed from: X.14v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC271714v {
    Merge,
    Add,
    Subtract,
    Intersect,
    ExcludeIntersections;

    public static EnumC271714v forId(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return Merge;
                        }
                        return ExcludeIntersections;
                    }
                    return Intersect;
                }
                return Subtract;
            }
            return Add;
        }
        return Merge;
    }

    public static EnumC271714v valueOf(String str) {
        return (EnumC271714v) V0N.LJJJ(EnumC271714v.class, str);
    }
}
