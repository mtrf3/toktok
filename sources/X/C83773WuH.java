package X;

/* renamed from: X.WuH, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83773WuH extends AbstractC83786WuU {
    @Override // X.AbstractC83786WuU
    public final EnumC83774WuI LIZ() {
        int i = C83776WuK.LIZ[this.LIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return this.LIZ;
                }
                return EnumC83774WuI.END;
            }
            return EnumC83774WuI.NORMAL_SHOOT;
        }
        return EnumC83774WuI.TAKING_PHOTO;
    }

    public C83773WuH(EnumC83774WuI enumC83774WuI) {
        super(enumC83774WuI);
    }
}
