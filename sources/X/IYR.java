package X;

import java.util.Collections;
import java.util.List;

/* loaded from: classes9.dex */
public final class IYR implements InterfaceC46978IcA {
    public IYP LIZ;
    public C46893Ian LIZIZ;
    public double LIZJ;

    @Override // X.InterfaceC46978IcA
    public final int getHdrBit() {
        return 0;
    }

    @Override // X.InterfaceC46978IcA
    public final int getHdrType() {
        return 0;
    }

    @Override // X.InterfaceC46978IcA
    public final int getBitRate() {
        IYP iyp = this.LIZ;
        if (iyp != null) {
            return iyp.getBitRate();
        }
        return 0;
    }

    @Override // X.InterfaceC46978IcA
    public final String getChecksum() {
        IYP iyp = this.LIZ;
        if (iyp != null) {
            return iyp.getChecksum();
        }
        return "";
    }

    @Override // X.InterfaceC46978IcA
    public final long getFps() {
        IYP iyp = this.LIZ;
        if (iyp != null) {
            return iyp.getFps();
        }
        return -1L;
    }

    @Override // X.InterfaceC46978IcA
    public final String getGearName() {
        IYP iyp = this.LIZ;
        if (iyp != null) {
            return iyp.getGearName();
        }
        return "";
    }

    @Override // X.InterfaceC46978IcA
    public final int getQualityType() {
        IYP iyp = this.LIZ;
        if (iyp != null) {
            return iyp.getQualityType();
        }
        return 0;
    }

    @Override // X.InterfaceC46978IcA
    public final int getSize() {
        IYP iyp = this.LIZ;
        if (iyp != null) {
            return iyp.getSize();
        }
        return 0;
    }

    @Override // X.InterfaceC46978IcA
    public final String getUrlKey() {
        IYP iyp = this.LIZ;
        if (iyp != null) {
            return iyp.getUrlKey();
        }
        return "";
    }

    @Override // X.InterfaceC46978IcA
    public final int getVideoHeight() {
        IYP iyp = this.LIZ;
        if (iyp != null) {
            return iyp.getVideoHeight();
        }
        return -1;
    }

    @Override // X.InterfaceC46978IcA
    public final int getVideoWidth() {
        IYP iyp = this.LIZ;
        if (iyp != null) {
            return iyp.getVideoWidth();
        }
        return -1;
    }

    @Override // X.InterfaceC46978IcA
    public final int isBytevc1() {
        IYP iyp = this.LIZ;
        if (iyp != null) {
            return iyp.isBytevc1();
        }
        return 0;
    }

    @Override // X.InterfaceC46978IcA
    public final List<String> urlList() {
        IYP iyp = this.LIZ;
        if (iyp != null) {
            return iyp.urlList();
        }
        return Collections.emptyList();
    }
}
