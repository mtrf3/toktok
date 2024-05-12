package X;

import java.util.Collections;
import java.util.List;

/* loaded from: classes9.dex */
public class IYO implements IYN {
    public IYN LJLIL;
    public C46892Iam LJLILLLLZI;
    public double LJLJI;
    public StringBuilder LJLJJI = new StringBuilder();
    public String LJLJJL = "non";

    @Override // X.IYN
    public final String getAudioFileId() {
        IYN iyn = this.LJLIL;
        if (iyn != null) {
            return iyn.getAudioFileId();
        }
        return "";
    }

    @Override // X.IYN
    public final int getBitRate() {
        IYN iyn = this.LJLIL;
        if (iyn != null) {
            return iyn.getBitRate();
        }
        return 0;
    }

    @Override // X.IYN
    public final String getChecksum() {
        IYN iyn = this.LJLIL;
        if (iyn != null) {
            return iyn.getChecksum();
        }
        return "";
    }

    @Override // X.IYN
    public final long getFps() {
        IYN iyn = this.LJLIL;
        if (iyn != null) {
            return iyn.getFps();
        }
        return -1L;
    }

    @Override // X.IYN
    public final String getGearName() {
        IYN iyn = this.LJLIL;
        if (iyn != null) {
            return iyn.getGearName();
        }
        return "";
    }

    @Override // X.IYN
    public final int getHdrBit() {
        IYN iyn = this.LJLIL;
        if (iyn != null) {
            return iyn.getHdrBit();
        }
        return 8;
    }

    @Override // X.IYN
    public final int getHdrType() {
        IYN iyn = this.LJLIL;
        if (iyn != null) {
            return iyn.getHdrType();
        }
        return 0;
    }

    @Override // X.IYN
    public final int getQualityType() {
        IYN iyn = this.LJLIL;
        if (iyn != null) {
            return iyn.getQualityType();
        }
        return 0;
    }

    @Override // X.IYN
    public final int getSize() {
        IYN iyn = this.LJLIL;
        if (iyn != null) {
            return iyn.getSize();
        }
        return 0;
    }

    @Override // X.IYN
    public final String getUrlKey() {
        IYN iyn = this.LJLIL;
        if (iyn != null) {
            return iyn.getUrlKey();
        }
        return "";
    }

    @Override // X.IYN
    public final int getVideoHeight() {
        IYN iyn = this.LJLIL;
        if (iyn != null) {
            return iyn.getVideoHeight();
        }
        return -1;
    }

    @Override // X.IYN
    public final int getVideoWidth() {
        IYN iyn = this.LJLIL;
        if (iyn != null) {
            return iyn.getVideoWidth();
        }
        return -1;
    }

    @Override // X.IYN
    public final int isBytevc1() {
        IYN iyn = this.LJLIL;
        if (iyn != null) {
            return iyn.isBytevc1();
        }
        return 0;
    }

    @Override // X.IYN
    public final List<String> urlList() {
        IYN iyn = this.LJLIL;
        if (iyn != null) {
            return iyn.urlList();
        }
        return Collections.emptyList();
    }
}
