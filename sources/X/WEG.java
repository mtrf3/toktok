package X;

import java.io.File;

/* loaded from: classes15.dex */
public class WEG implements WE9 {
    public final String LIZ;
    public final WEK LIZIZ;
    public long LIZJ;
    public long LIZLLL;

    @Override // X.WE9
    public final long getSize() {
        if (this.LIZJ < 0) {
            this.LIZJ = this.LIZIZ.LIZ.length();
        }
        return this.LIZJ;
    }

    @Override // X.WE9
    public final long getTimestamp() {
        if (this.LIZLLL < 0) {
            this.LIZLLL = this.LIZIZ.LIZ.lastModified();
        }
        return this.LIZLLL;
    }

    @Override // X.WE9
    public final String getId() {
        return this.LIZ;
    }

    public WEG(String str, File file) {
        str.getClass();
        this.LIZ = str;
        this.LIZIZ = new WEK(file);
        this.LIZJ = -1L;
        this.LIZLLL = -1L;
    }
}
