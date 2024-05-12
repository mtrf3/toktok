package X;

/* renamed from: X.WuP, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83781WuP extends AbstractC83786WuU {
    public final boolean LIZIZ;

    @Override // X.AbstractC83786WuU
    public final EnumC83774WuI LIZ() {
        EnumC83774WuI enumC83774WuI = this.LIZ;
        if (enumC83774WuI == EnumC83774WuI.NORMAL_SHOOT && this.LIZIZ) {
            return EnumC83774WuI.LIVE_PHOTO_INIT;
        }
        if ((enumC83774WuI != EnumC83774WuI.LIVE_PHOTO_RECORDING && enumC83774WuI != EnumC83774WuI.LIVE_PHOTO_INIT) || this.LIZIZ) {
            return enumC83774WuI;
        }
        return EnumC83774WuI.LIVE_PHOTO_SWITCHING;
    }

    public C83781WuP(EnumC83774WuI enumC83774WuI, boolean z) {
        super(enumC83774WuI);
        this.LIZIZ = z;
    }
}
