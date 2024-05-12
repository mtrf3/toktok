package com.ss.android.ugc.playerkit.simapicommon.model;

import X.C72972SkS;
import X.IVV;
import X.IYN;
import X.InterfaceC65349Pkn;
import X.O5Y;
import X.Q89;
import X.X1D;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class SimBitRate implements Serializable, IYN {
    public static final long serialVersionUID = 1609388073496567510L;
    public int LJLIL;
    public long LJLILLLLZI;
    public String LJLJI;
    public float LJLJJI;
    public float LJLJJL;
    public float LJLJJLL;
    public String LJLJL;
    public String LJLJLJ;
    public IVV LJLJLLL;

    @InterfaceC65349Pkn("bit_rate")
    public int bitRate;

    @InterfaceC65349Pkn("gear_name")
    public String gearName;

    @InterfaceC65349Pkn("HDR_bit")
    public String hdrBit;

    @InterfaceC65349Pkn("HDR_type")
    public String hdrType;
    public Object origin;

    @InterfaceC65349Pkn("play_addr")
    public SimUrlModel playAddr;

    @InterfaceC65349Pkn("play_addr_bytevc1")
    public SimUrlModel playAddrBytevc1;

    @InterfaceC65349Pkn("quality_type")
    public int qualityType;

    @InterfaceC65349Pkn("video_extra")
    public String videoExtra;

    @Override // X.IYN
    public int getHdrBit() {
        try {
            if (TextUtils.isEmpty(this.hdrBit)) {
                return 0;
            }
            return CastIntegerProtector.parseInt(this.hdrBit);
        } catch (Throwable unused) {
            return 0;
        }
    }

    @Override // X.IYN
    public int getHdrType() {
        try {
            if (TextUtils.isEmpty(this.hdrType)) {
                return 0;
            }
            return CastIntegerProtector.parseInt(this.hdrType);
        } catch (Throwable unused) {
            return 0;
        }
    }

    @Override // X.IYN
    public String getAudioFileId() {
        if (!TextUtils.isEmpty(this.LJLJLJ)) {
            return this.LJLJLJ;
        }
        if (TextUtils.isEmpty(this.videoExtra)) {
            this.LJLJLJ = "";
        } else {
            try {
                this.LJLJLJ = new JSONObject(this.videoExtra).optString("audio_file_id");
            } catch (JSONException unused) {
            }
        }
        return this.LJLJLJ;
    }

    @Override // X.IYN
    public String getChecksum() {
        SimUrlModel simUrlModel = this.playAddr;
        if (simUrlModel != null && !TextUtils.isEmpty(simUrlModel.getFileCheckSum())) {
            return this.playAddr.getFileCheckSum();
        }
        return null;
    }

    public IVV getSimVideoExtra() {
        if (this.LJLJLLL == null) {
            this.LJLJLLL = IVV.from(this.videoExtra);
        }
        return this.LJLJLLL;
    }

    @Override // X.IYN
    public int getSize() {
        SimUrlModel simUrlModel = this.playAddr;
        if (simUrlModel != null) {
            return (int) simUrlModel.getSize();
        }
        return 0;
    }

    @Override // X.IYN
    public String getUrlKey() {
        SimUrlModel simUrlModel = this.playAddr;
        if (simUrlModel != null && !TextUtils.isEmpty(simUrlModel.getUrlKey())) {
            return this.playAddr.getUrlKey();
        }
        return null;
    }

    @Override // X.IYN
    public int getVideoHeight() {
        SimUrlModel simUrlModel = this.playAddr;
        if (simUrlModel == null) {
            return -1;
        }
        return simUrlModel.getHeight();
    }

    @Override // X.IYN
    public int getVideoWidth() {
        SimUrlModel simUrlModel = this.playAddr;
        if (simUrlModel == null) {
            return -1;
        }
        return simUrlModel.getWidth();
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = this.bitRate * 31;
        String str = this.gearName;
        int i4 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i5 = (((i3 + i) * 31) + this.qualityType) * 31;
        SimUrlModel simUrlModel = this.playAddr;
        if (simUrlModel != null) {
            i2 = simUrlModel.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (((i5 + i2) * 31) + this.LJLIL) * 31;
        SimUrlModel simUrlModel2 = this.playAddrBytevc1;
        if (simUrlModel2 != null) {
            i4 = simUrlModel2.hashCode();
        }
        return i6 + i4;
    }

    @Override // X.IYN
    public int getBitRate() {
        IVV ivv;
        if (isDash() && (ivv = this.LJLJLLL) != null && ivv.getRealBitrate() > 0) {
            return this.LJLJLLL.getRealBitrate();
        }
        return this.bitRate;
    }

    public int getIsBytevc1() {
        return isBytevc1();
    }

    public boolean isDash() {
        if (O5Y.LJIILJJIL()) {
            return TextUtils.equals("dash", this.LJLJI);
        }
        getSimVideoExtra();
        IVV ivv = this.LJLJLLL;
        if (ivv != null) {
            return TextUtils.equals(ivv.getFormat(), "dash");
        }
        return false;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SimBitRate{origin=");
        LIZ.append(this.origin);
        LIZ.append(", bitRate=");
        LIZ.append(this.bitRate);
        LIZ.append(", gearName='");
        Q89.LIZIZ(LIZ, this.gearName, '\'', ", qualityType=");
        LIZ.append(this.qualityType);
        LIZ.append(", quality=");
        LIZ.append(this.LJLJL);
        LIZ.append(", playAddr=");
        LIZ.append(this.playAddr);
        LIZ.append(", codecType=");
        LIZ.append(this.LJLIL);
        LIZ.append(", fps=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", hdrType=");
        LIZ.append(this.hdrType);
        LIZ.append(", hdrBit=");
        LIZ.append(this.hdrBit);
        LIZ.append(", qualityScore=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", qualityScoreSr1d5=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", qualityScoreSr2=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", playAddrBytevc1=");
        LIZ.append(this.playAddrBytevc1);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.IYN
    public List<String> urlList() {
        if (getPlayAddr() != null) {
            return getPlayAddr().getUrlList();
        }
        return Collections.emptyList();
    }

    public int getCodecType() {
        return this.LJLIL;
    }

    public String getFormat() {
        return this.LJLJI;
    }

    @Override // X.IYN
    public long getFps() {
        return this.LJLILLLLZI;
    }

    @Override // X.IYN
    public String getGearName() {
        return this.gearName;
    }

    public SimUrlModel getPlayAddr() {
        return this.playAddr;
    }

    public String getQuality() {
        return this.LJLJL;
    }

    public float getQualityScore() {
        return this.LJLJJI;
    }

    public float getQualityScoreSr1d5() {
        return this.LJLJJL;
    }

    public float getQualityScoreSr2() {
        return this.LJLJJLL;
    }

    @Override // X.IYN
    public int getQualityType() {
        return this.qualityType;
    }

    public String getVideoExtra() {
        return this.videoExtra;
    }

    @Override // X.IYN
    public int isBytevc1() {
        return this.LJLIL;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SimBitRate simBitRate = (SimBitRate) obj;
        if (this.bitRate != simBitRate.bitRate || this.qualityType != simBitRate.qualityType || this.LJLIL != simBitRate.LJLIL) {
            return false;
        }
        String str = this.gearName;
        if (str == null ? simBitRate.gearName != null : !str.equals(simBitRate.gearName)) {
            return false;
        }
        SimUrlModel simUrlModel = this.playAddr;
        if (simUrlModel == null ? simBitRate.playAddr != null : !simUrlModel.equals(simBitRate.playAddr)) {
            return false;
        }
        SimUrlModel simUrlModel2 = this.playAddrBytevc1;
        SimUrlModel simUrlModel3 = simBitRate.playAddrBytevc1;
        if (simUrlModel2 != null) {
            return simUrlModel2.equals(simUrlModel3);
        }
        if (simUrlModel3 == null) {
            return true;
        }
        return false;
    }

    public void setBitRate(int i) {
        this.bitRate = i;
    }

    public void setBytevc1(int i) {
        setCodecType(i);
    }

    public void setCodecType(int i) {
        this.LJLIL = i;
    }

    public void setFormat(String str) {
        this.LJLJI = str;
    }

    public void setFps(long j) {
        this.LJLILLLLZI = j;
    }

    public void setGearName(String str) {
        this.gearName = str;
    }

    public void setHdrBit(int i) {
        this.hdrBit = C72972SkS.LIZLLL(i, "");
    }

    public void setHdrType(int i) {
        this.hdrType = C72972SkS.LIZLLL(i, "");
    }

    public void setPlayAddr(SimUrlModel simUrlModel) {
        this.playAddr = simUrlModel;
    }

    public void setQuality(String str) {
        this.LJLJL = str;
    }

    public void setQualityScore(float f) {
        this.LJLJJI = f;
    }

    public void setQualityScoreSr1d5(float f) {
        this.LJLJJL = f;
    }

    public void setQualityScoreSr2(float f) {
        this.LJLJJLL = f;
    }

    public void setQualityType(int i) {
        this.qualityType = i;
    }

    public void setVideoExtra(String str) {
        this.videoExtra = str;
    }
}
