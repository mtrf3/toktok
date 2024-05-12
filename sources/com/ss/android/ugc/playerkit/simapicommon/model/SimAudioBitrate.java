package com.ss.android.ugc.playerkit.simapicommon.model;

import X.C47055IdP;
import X.C58825N6v;
import X.IYN;
import X.X1D;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public class SimAudioBitrate implements IYN {
    public String audioExtra;
    public C47055IdP audioMeta;
    public int quality;
    public List<String> urlList;

    @Override // X.IYN
    public /* bridge */ /* synthetic */ String getAudioFileId() {
        return null;
    }

    @Override // X.IYN
    public /* bridge */ /* synthetic */ long getFps() {
        return -1L;
    }

    @Override // X.IYN
    public int getHdrBit() {
        return 0;
    }

    @Override // X.IYN
    public int getHdrType() {
        return 0;
    }

    @Override // X.IYN
    public /* bridge */ /* synthetic */ int getVideoHeight() {
        return -1;
    }

    @Override // X.IYN
    public /* bridge */ /* synthetic */ int getVideoWidth() {
        return -1;
    }

    @Override // X.IYN
    public int isBytevc1() {
        return 0;
    }

    @Override // X.IYN
    public int getBitRate() {
        C47055IdP c47055IdP = this.audioMeta;
        if (c47055IdP != null) {
            return (int) c47055IdP.LJIIJ;
        }
        return 0;
    }

    @Override // X.IYN
    public String getChecksum() {
        C47055IdP c47055IdP = this.audioMeta;
        if (c47055IdP != null) {
            return c47055IdP.LJIILL;
        }
        return "";
    }

    @Override // X.IYN
    public String getGearName() {
        C47055IdP c47055IdP = this.audioMeta;
        if (c47055IdP != null) {
            return c47055IdP.LJI;
        }
        return "";
    }

    @Override // X.IYN
    public int getSize() {
        C47055IdP c47055IdP = this.audioMeta;
        if (c47055IdP != null) {
            return (int) c47055IdP.LJIIL;
        }
        return 0;
    }

    @Override // X.IYN
    public String getUrlKey() {
        C47055IdP c47055IdP = this.audioMeta;
        if (c47055IdP != null) {
            return c47055IdP.LJFF;
        }
        return "";
    }

    @Override // X.IYN
    public List<String> urlList() {
        C58825N6v c58825N6v;
        if (this.urlList == null) {
            ArrayList arrayList = new ArrayList();
            C47055IdP c47055IdP = this.audioMeta;
            if (c47055IdP != null && (c58825N6v = c47055IdP.LIZ) != null) {
                if (!TextUtils.isEmpty((String) c58825N6v.LIZ)) {
                    arrayList.add(this.audioMeta.LIZ.LIZ);
                }
                if (!TextUtils.isEmpty((String) this.audioMeta.LIZ.LIZIZ)) {
                    arrayList.add(this.audioMeta.LIZ.LIZIZ);
                }
                if (!TextUtils.isEmpty((String) this.audioMeta.LIZ.LIZJ)) {
                    arrayList.add(this.audioMeta.LIZ.LIZJ);
                }
            }
            this.urlList = arrayList;
        }
        return this.urlList;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SimAudioBitrate{audioMeta=");
        LIZ.append(this.audioMeta);
        LIZ.append(", audioExtra='");
        LIZ.append(this.audioExtra);
        LIZ.append('\'');
        LIZ.append(", urlList=");
        LIZ.append(urlList());
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public String getAudioExtra() {
        return this.audioExtra;
    }

    public C47055IdP getAudioMeta() {
        return this.audioMeta;
    }

    @Override // X.IYN
    public int getQualityType() {
        return this.quality;
    }

    public void setAudioExtra(String str) {
        this.audioExtra = str;
    }

    public void setAudioMeta(C47055IdP c47055IdP) {
        this.audioMeta = c47055IdP;
    }

    public void setQualityType(int i) {
        this.quality = i;
    }
}
