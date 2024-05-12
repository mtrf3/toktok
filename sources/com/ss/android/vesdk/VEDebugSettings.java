package com.ss.android.vesdk;

import X.C025908h;
import X.JBR;
import X.P49;
import X.P4Q;
import X.X1D;
import java.io.File;

/* loaded from: classes12.dex */
public class VEDebugSettings {
    public String mCaptureDir;
    public boolean mEnableImageDump;
    public String mImageDumpDir;
    public P49 mImageDumpType;
    public String mPreviewDir;

    public int getImageDumpTypeValue() {
        return this.mImageDumpType.ordinal();
    }

    public void init() {
        if (this.mEnableImageDump) {
            File file = new File(this.mImageDumpDir);
            if (!file.exists() && !file.isDirectory()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Dump directory is not exist, so do mkdir {");
                LIZ.append(this.mImageDumpDir);
                LIZ.append("}");
                P4Q.LJFF("VEDebugSettings", X1D.LIZIZ(LIZ));
                file.mkdir();
            }
            if (isNeedDumpCapture()) {
                File file2 = new File(this.mCaptureDir);
                if (!file2.exists() && !file2.isDirectory()) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("Dump capture directory is not exist, so do mkdir {");
                    LIZ2.append(this.mCaptureDir);
                    LIZ2.append("}");
                    P4Q.LJFF("VEDebugSettings", X1D.LIZIZ(LIZ2));
                    file2.mkdir();
                }
            }
            if (isNeedDumpPreview()) {
                File file3 = new File(this.mPreviewDir);
                if (!file3.exists() && !file3.isDirectory()) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("Dump preview directory is not exist, so do mkdir {");
                    LIZ3.append(this.mPreviewDir);
                    LIZ3.append("}");
                    P4Q.LJFF("VEDebugSettings", X1D.LIZIZ(LIZ3));
                    file3.mkdir();
                }
            }
        }
    }

    public boolean isNeedDumpCapture() {
        if (this.mEnableImageDump) {
            P49 p49 = this.mImageDumpType;
            if (p49 == P49.BOTH || p49 == P49.CAPTURE) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean isNeedDumpPreview() {
        if (this.mEnableImageDump) {
            P49 p49 = this.mImageDumpType;
            if (p49 == P49.BOTH || p49 == P49.PREVIEW) {
                return true;
            }
            return false;
        }
        return false;
    }

    public VEDebugSettings() {
        this.mImageDumpType = P49.CAPTURE;
        this.mImageDumpDir = "sdcard/vemo";
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.mImageDumpDir);
        String str = File.separator;
        this.mCaptureDir = JBR.LJFF(LIZ, str, "capture", LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        this.mPreviewDir = C025908h.LIZIZ(LIZ2, this.mImageDumpDir, str, "preview", LIZ2);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DebugSettings{mEnableImageDump=");
        LIZ.append(this.mEnableImageDump);
        LIZ.append(", mImageDumpType=");
        LIZ.append(this.mImageDumpType);
        LIZ.append(", mImageDumpDir=");
        LIZ.append(this.mImageDumpDir);
        LIZ.append(", mCaptureDir=");
        LIZ.append(this.mCaptureDir);
        LIZ.append(", mPreviewDir=");
        return JBR.LJFF(LIZ, this.mPreviewDir, "}", LIZ);
    }

    public String getCapDumpDir() {
        return this.mCaptureDir;
    }

    public boolean getEnableImageDump() {
        return this.mEnableImageDump;
    }

    public String getImageDumpDir() {
        return this.mImageDumpDir;
    }

    public P49 getImageDumpType() {
        return this.mImageDumpType;
    }

    public String getPrvDumpDir() {
        return this.mPreviewDir;
    }
}
