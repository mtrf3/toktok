package X;

/* renamed from: X.WuG, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83772WuG extends AbstractC83786WuU {
    public final boolean LIZIZ;

    @Override // X.AbstractC83786WuU
    public final EnumC83774WuI LIZ() {
        EnumC83774WuI enumC83774WuI = this.LIZ;
        EnumC83774WuI enumC83774WuI2 = EnumC83774WuI.START;
        if ((enumC83774WuI == enumC83774WuI2 || enumC83774WuI == EnumC83774WuI.END) && this.LIZIZ) {
            return EnumC83774WuI.LIVE_PHOTO_INIT;
        }
        if ((enumC83774WuI != enumC83774WuI2 && enumC83774WuI != EnumC83774WuI.END) || this.LIZIZ) {
            return enumC83774WuI;
        }
        return EnumC83774WuI.NORMAL_SHOOT;
    }

    public C83772WuG(EnumC83774WuI enumC83774WuI, boolean z) {
        super(enumC83774WuI);
        this.LIZIZ = z;
    }
}
