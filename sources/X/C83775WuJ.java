package X;

/* renamed from: X.WuJ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83775WuJ extends AbstractC83786WuU {
    @Override // X.AbstractC83786WuU
    public final EnumC83774WuI LIZ() {
        int i = C83780WuO.LIZ[this.LIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return this.LIZ;
            }
            return EnumC83774WuI.END;
        }
        return EnumC83774WuI.LIVE_PHOTO_TAKING;
    }

    public C83775WuJ(EnumC83774WuI enumC83774WuI) {
        super(enumC83774WuI);
    }
}
