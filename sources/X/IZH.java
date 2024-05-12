package X;

import android.text.TextUtils;
import defpackage.b0;
import java.io.Serializable;

/* loaded from: classes9.dex */
public final class IZH implements Serializable {
    public String LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;
    public String LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public int LJLJL;

    public boolean isValid() {
        if (!TextUtils.isEmpty(this.LJLJI) && !TextUtils.isEmpty(this.LJLIL)) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BarrageMaskInfo{fileId='");
        Q89.LIZIZ(LIZ, this.LJLIL, '\'', ", fileHash='");
        Q89.LIZIZ(LIZ, this.LJLILLLLZI, '\'', ", barrageMaskUrl='");
        Q89.LIZIZ(LIZ, this.LJLJI, '\'', ", version='");
        Q89.LIZIZ(LIZ, this.LJLJJI, '\'', ", fileSize=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", headLen=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", bitrate=");
        return b0.LIZJ(LIZ, this.LJLJL, '}', LIZ);
    }

    public String getBarrageMaskUrl() {
        return this.LJLJI;
    }

    public int getBitrate() {
        return this.LJLJL;
    }

    public String getFileHash() {
        return this.LJLILLLLZI;
    }

    public String getFileId() {
        return this.LJLIL;
    }

    public int getFileSize() {
        return this.LJLJJL;
    }

    public int getHeadLen() {
        return this.LJLJJLL;
    }

    public String getVersion() {
        return this.LJLJJI;
    }

    public void setBarrageMaskUrl(String str) {
        this.LJLJI = str;
    }

    public void setBitrate(int i) {
        this.LJLJL = i;
    }

    public void setFileHash(String str) {
        this.LJLILLLLZI = str;
    }

    public void setFileId(String str) {
        this.LJLIL = str;
    }

    public void setFileSize(int i) {
        this.LJLJJL = i;
    }

    public void setHeadLen(int i) {
        this.LJLJJLL = i;
    }

    public void setVersion(String str) {
        this.LJLJJI = str;
    }

    public IZH(String str, String str2, int i) {
        this.LJLIL = str;
        this.LJLJI = str2;
        this.LJLJJLL = i;
    }
}
