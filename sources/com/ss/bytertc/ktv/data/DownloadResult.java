package com.ss.bytertc.ktv.data;

import X.X1D;

/* loaded from: classes33.dex */
public class DownloadResult {
    public String filePath;
    public DownloadFileType fileType;
    public String musicId;

    public String toString() {
        String LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DownloadResult{musicId='");
        LIZ.append(this.musicId);
        LIZ.append('\'');
        LIZ.append(", fileType=");
        LIZ.append(this.fileType);
        if (DownloadFileType.MUSIC == this.fileType) {
            LIZIZ = "";
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(", filePath='");
            LIZ2.append(this.filePath);
            LIZ2.append('\'');
            LIZIZ = X1D.LIZIZ(LIZ2);
        }
        LIZ.append(LIZIZ);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public DownloadResult(String str, DownloadFileType downloadFileType, String str2) {
        this.musicId = str;
        this.fileType = downloadFileType;
        this.filePath = str2;
    }
}
