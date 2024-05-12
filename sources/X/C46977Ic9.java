package X;

import java.util.List;

/* renamed from: X.Ic9, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46977Ic9 implements IYN {
    public final /* synthetic */ InterfaceC46978IcA LJLIL;

    @Override // X.IYN
    public final /* synthetic */ String getAudioFileId() {
        return null;
    }

    @Override // X.IYN
    public final int getBitRate() {
        return this.LJLIL.getBitRate();
    }

    @Override // X.IYN
    public final String getChecksum() {
        return this.LJLIL.getChecksum();
    }

    @Override // X.IYN
    public final long getFps() {
        return this.LJLIL.getFps();
    }

    @Override // X.IYN
    public final String getGearName() {
        return this.LJLIL.getGearName();
    }

    @Override // X.IYN
    public final int getHdrBit() {
        return this.LJLIL.getHdrBit();
    }

    @Override // X.IYN
    public final int getHdrType() {
        return this.LJLIL.getHdrType();
    }

    @Override // X.IYN
    public final int getQualityType() {
        return this.LJLIL.getQualityType();
    }

    @Override // X.IYN
    public final int getSize() {
        return this.LJLIL.getSize();
    }

    @Override // X.IYN
    public final String getUrlKey() {
        return this.LJLIL.getUrlKey();
    }

    @Override // X.IYN
    public final int getVideoHeight() {
        return this.LJLIL.getVideoHeight();
    }

    @Override // X.IYN
    public final int getVideoWidth() {
        return this.LJLIL.getVideoWidth();
    }

    @Override // X.IYN
    public final int isBytevc1() {
        return this.LJLIL.isBytevc1();
    }

    @Override // X.IYN
    public final List<String> urlList() {
        return this.LJLIL.urlList();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SimBitRate{bitRate=");
        LIZ.append(this.LJLIL.getBitRate());
        LIZ.append(", gearName='");
        LIZ.append(this.LJLIL.getGearName());
        LIZ.append('\'');
        LIZ.append(", qualityType=");
        LIZ.append(this.LJLIL.getQualityType());
        LIZ.append(", isBytevc1=");
        LIZ.append(this.LJLIL.isBytevc1());
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public C46977Ic9(InterfaceC46978IcA interfaceC46978IcA) {
        this.LJLIL = interfaceC46978IcA;
    }
}
