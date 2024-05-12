package X;

import java.util.List;

/* loaded from: classes9.dex */
public final class IYP implements InterfaceC46978IcA {
    public final /* synthetic */ IYN LIZ;

    @Override // X.InterfaceC46978IcA
    public final int getBitRate() {
        return this.LIZ.getBitRate();
    }

    @Override // X.InterfaceC46978IcA
    public final String getChecksum() {
        return this.LIZ.getChecksum();
    }

    @Override // X.InterfaceC46978IcA
    public final long getFps() {
        return this.LIZ.getFps();
    }

    @Override // X.InterfaceC46978IcA
    public final String getGearName() {
        return this.LIZ.getGearName();
    }

    @Override // X.InterfaceC46978IcA
    public final int getHdrBit() {
        return this.LIZ.getHdrBit();
    }

    @Override // X.InterfaceC46978IcA
    public final int getHdrType() {
        return this.LIZ.getHdrType();
    }

    @Override // X.InterfaceC46978IcA
    public final int getQualityType() {
        return this.LIZ.getQualityType();
    }

    @Override // X.InterfaceC46978IcA
    public final int getSize() {
        return this.LIZ.getSize();
    }

    @Override // X.InterfaceC46978IcA
    public final String getUrlKey() {
        return this.LIZ.getUrlKey();
    }

    @Override // X.InterfaceC46978IcA
    public final int getVideoHeight() {
        return this.LIZ.getVideoHeight();
    }

    @Override // X.InterfaceC46978IcA
    public final int getVideoWidth() {
        return this.LIZ.getVideoWidth();
    }

    @Override // X.InterfaceC46978IcA
    public final int isBytevc1() {
        return this.LIZ.isBytevc1();
    }

    @Override // X.InterfaceC46978IcA
    public final List<String> urlList() {
        return this.LIZ.urlList();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SimBitRate{bitRate=");
        LIZ.append(this.LIZ.getBitRate());
        LIZ.append(", gearName='");
        LIZ.append(this.LIZ.getGearName());
        LIZ.append('\'');
        LIZ.append(", qualityType=");
        LIZ.append(this.LIZ.getQualityType());
        LIZ.append(", isBytevc1=");
        LIZ.append(this.LIZ.isBytevc1());
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public IYP(IYN iyn) {
        this.LIZ = iyn;
    }
}
