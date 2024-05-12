package X;

import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import java.util.List;

/* loaded from: classes9.dex */
public final class IYM implements InterfaceC46978IcA {
    public final /* synthetic */ IYN LIZ;

    @Override // X.InterfaceC46978IcA
    public final /* synthetic */ long getFps() {
        return -1L;
    }

    @Override // X.InterfaceC46978IcA
    public final /* synthetic */ int getVideoHeight() {
        return -1;
    }

    @Override // X.InterfaceC46978IcA
    public final /* synthetic */ int getVideoWidth() {
        return -1;
    }

    @Override // X.InterfaceC46978IcA
    public final int getBitRate() {
        return this.LIZ.getBitRate();
    }

    @Override // X.InterfaceC46978IcA
    public final String getChecksum() {
        return this.LIZ.getChecksum();
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

    public IYM(SimBitRate simBitRate) {
        this.LIZ = simBitRate;
    }
}
