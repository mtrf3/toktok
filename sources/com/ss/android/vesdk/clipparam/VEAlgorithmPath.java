package com.ss.android.vesdk.clipparam;

import X.X1D;
import defpackage.b1;

/* loaded from: classes8.dex */
public class VEAlgorithmPath {
    public static int BEATES_FILE_BEATS_A0 = 2;
    public static int BEATES_FILE_CUSTOM = 3;
    public static int BEATES_FILE_DEFAULT = 0;
    public static int BEATES_FILE_SERVER_C = 1;
    public static int INTMODE_ONSET = 0;
    public static int MODE_SUCCESSIVELY = 1;
    public String downBeatsPath;
    public String manMadePath;
    public int mode = INTMODE_ONSET;
    public String noStrengthBeatsPath;
    public String onlineBeatsPath;
    public int type;
    public String veBeatsPath;

    public String toString() {
        String str = "";
        if (this.veBeatsPath != null) {
            StringBuilder LIZJ = b1.LIZJ("", " veBeatsPath: ");
            LIZJ.append(this.veBeatsPath);
            str = X1D.LIZIZ(LIZJ);
        }
        if (this.downBeatsPath != null) {
            StringBuilder LIZJ2 = b1.LIZJ(str, " downBeatsPath: ");
            LIZJ2.append(this.downBeatsPath);
            str = X1D.LIZIZ(LIZJ2);
        }
        if (this.noStrengthBeatsPath != null) {
            StringBuilder LIZJ3 = b1.LIZJ(str, " noStrengthBeatsPath: ");
            LIZJ3.append(this.noStrengthBeatsPath);
            str = X1D.LIZIZ(LIZJ3);
        }
        if (this.onlineBeatsPath != null) {
            StringBuilder LIZJ4 = b1.LIZJ(str, " onlineBeatsPath: ");
            LIZJ4.append(this.onlineBeatsPath);
            str = X1D.LIZIZ(LIZJ4);
        }
        if (this.manMadePath != null) {
            StringBuilder LIZJ5 = b1.LIZJ(str, " manMadePath: ");
            LIZJ5.append(this.manMadePath);
            str = X1D.LIZIZ(LIZJ5);
        }
        StringBuilder LIZJ6 = b1.LIZJ(str, " mode: ");
        LIZJ6.append(this.mode);
        StringBuilder LIZJ7 = b1.LIZJ(X1D.LIZIZ(LIZJ6), " type: ");
        LIZJ7.append(this.type);
        return X1D.LIZIZ(LIZJ7);
    }

    public String getDownBeatsPath() {
        return this.downBeatsPath;
    }

    public String getManMadePath() {
        return this.manMadePath;
    }

    public int getMode() {
        return this.mode;
    }

    public String getNoStrengthBeatsPath() {
        return this.noStrengthBeatsPath;
    }

    public String getOnlineBeatsPath() {
        return this.onlineBeatsPath;
    }

    public int getType() {
        return this.type;
    }

    public String getVeBeatsPath() {
        return this.veBeatsPath;
    }

    public void setDownBeatsPath(String str) {
        this.downBeatsPath = str;
    }

    public void setManMadePath(String str) {
        this.manMadePath = str;
    }

    public void setMode(int i) {
        this.mode = i;
    }

    public void setNoStrengthBeatsPath(String str) {
        this.noStrengthBeatsPath = str;
    }

    public void setOnlineBeatsPath(String str) {
        this.onlineBeatsPath = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setVeBeatsPath(String str) {
        this.veBeatsPath = str;
    }
}
