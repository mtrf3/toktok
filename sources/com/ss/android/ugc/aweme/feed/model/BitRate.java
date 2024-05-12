package com.ss.android.ugc.aweme.feed.model;

import X.C72972SkS;
import X.IYN;
import X.InterfaceC65349Pkn;
import X.O5Y;
import X.Q89;
import X.X1D;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.google.gson.a;
import com.google.gson.b;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import defpackage.q;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/* loaded from: classes9.dex */
public class BitRate implements Serializable, IYN {
    public static final long serialVersionUID = 4166900069421013042L;

    @InterfaceC65349Pkn("bit_rate")
    public int bitRate;

    @InterfaceC65349Pkn("format")
    public String format;

    @InterfaceC65349Pkn("FPS")
    public long fps;

    @InterfaceC65349Pkn("gear_name")
    public String gearName;

    @InterfaceC65349Pkn("HDR_bit")
    public String hdrBit;

    @InterfaceC65349Pkn("HDR_type")
    public String hdrType;

    @InterfaceC65349Pkn("is_bytevc1")
    public int isBytevc1;

    @InterfaceC65349Pkn("play_addr")
    public UrlModel playAddr;

    @InterfaceC65349Pkn("quality_type")
    public int qualityType;
    public VideoExtra simVideoExtra;

    @InterfaceC65349Pkn("video_extra")
    public String videoExtra;

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
    public /* bridge */ /* synthetic */ int getVideoHeight() {
        return -1;
    }

    @Override // X.IYN
    public /* bridge */ /* synthetic */ int getVideoWidth() {
        return -1;
    }

    @Override // X.IYN
    public String getChecksum() {
        UrlModel urlModel = this.playAddr;
        if (urlModel != null && (urlModel instanceof VideoUrlModel) && !TextUtils.isEmpty(((VideoUrlModel) urlModel).getFileCheckSum())) {
            return ((VideoUrlModel) this.playAddr).getFileCheckSum();
        }
        return null;
    }

    public VideoExtra getSimVideoExtra() {
        if (this.simVideoExtra == null) {
            this.simVideoExtra = VideoExtra.from(this.videoExtra);
        }
        return this.simVideoExtra;
    }

    @Override // X.IYN
    public int getSize() {
        UrlModel urlModel = this.playAddr;
        if (urlModel != null) {
            return (int) urlModel.getSize();
        }
        return 0;
    }

    @Override // X.IYN
    public String getUrlKey() {
        UrlModel urlModel = this.playAddr;
        if (urlModel != null && !TextUtils.isEmpty(urlModel.getUrlKey())) {
            return this.playAddr.getUrlKey();
        }
        return null;
    }

    @Override // X.IYN
    public int getBitRate() {
        VideoExtra videoExtra;
        if (isDash() && (videoExtra = this.simVideoExtra) != null && videoExtra.getRealBitrate() > 0) {
            return this.simVideoExtra.getRealBitrate();
        }
        return this.bitRate;
    }

    public boolean isDash() {
        if (O5Y.LJIILJJIL()) {
            return TextUtils.equals("dash", this.format);
        }
        getSimVideoExtra();
        VideoExtra videoExtra = this.simVideoExtra;
        if (videoExtra != null) {
            return TextUtils.equals(videoExtra.getFormat(), "dash");
        }
        return false;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BitRate{bitRate=");
        LIZ.append(this.bitRate);
        LIZ.append(", gearName='");
        Q89.LIZIZ(LIZ, this.gearName, '\'', ", qualityType=");
        LIZ.append(this.qualityType);
        LIZ.append(", playAddr=");
        LIZ.append(this.playAddr);
        LIZ.append(", isBytevc1=");
        LIZ.append(this.isBytevc1);
        LIZ.append(", hdrType=");
        LIZ.append(this.hdrType);
        LIZ.append(", hdrBit=");
        return q.LIZIZ(LIZ, this.hdrBit, '}', LIZ);
    }

    @Override // X.IYN
    public List<String> urlList() {
        if (getPlayAddr() != null) {
            return getPlayAddr().getUrlList();
        }
        return Collections.emptyList();
    }

    public String getFormat() {
        return this.format;
    }

    @Override // X.IYN
    public String getGearName() {
        return this.gearName;
    }

    public UrlModel getPlayAddr() {
        return this.playAddr;
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
        return this.isBytevc1;
    }

    /* loaded from: classes12.dex */
    public static class ExcludeStrategy implements a {
        @Override // com.google.gson.a
        public boolean shouldSkipClass(Class<?> cls) {
            return false;
        }

        @Override // com.google.gson.a
        public boolean shouldSkipField(b bVar) {
            if (bVar.LIZ.getDeclaringClass() == BitRate.class && (bVar.LIZ.getName().equals("playAddr") || bVar.LIZ.getName().equals("playAddrBytevc1") || bVar.LIZ.getName().equals("gear_name"))) {
                return true;
            }
            return false;
        }
    }

    public void setBitRate(int i) {
        this.bitRate = i;
    }

    public void setBytevc1(int i) {
        this.isBytevc1 = i;
    }

    public void setFormat(String str) {
        this.format = str;
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

    public void setPlayAddr(UrlModel urlModel) {
        this.playAddr = urlModel;
    }

    public void setQualityType(int i) {
        this.qualityType = i;
    }
}
