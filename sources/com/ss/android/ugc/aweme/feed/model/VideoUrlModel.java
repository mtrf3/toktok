package com.ss.android.ugc.aweme.feed.model;

import X.IYN;
import X.IZ8;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.O5Y;
import X.Q89;
import X.X1D;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import defpackage.b0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class VideoUrlModel extends UrlModel {
    public static final long serialVersionUID = 4566748102483196885L;
    public float aspectRatio;
    public List<BitrateAudioStruct> audioBitrate;

    @InterfaceC65349Pkn("bit_rate")
    public List<BitRate> bitRate;

    @InterfaceC65349Pkn("cdn_url_expired")
    public long cdnUrlExpired;
    public int codecType;
    public long createTime = SystemClock.elapsedRealtime();

    @InterfaceC65349Pkn("duration")
    public double duration;

    @InterfaceC65349Pkn("file_cs")
    public String fileCheckSum;
    public String format;
    public Boolean hasDashBitrate;
    public transient IYN hitBitrate;
    public BitrateAudioStruct hitDashAudioBitrate;
    public BitRate hitDashVideoBitrate;
    public String mDashVideoId;
    public String mDashVideoModelString;
    public boolean mVr;
    public String meta;
    public String ratio;
    public String ratioUri;
    public String sourceId;
    public String videoAdTag;

    public String getBitRatedRatioUri() {
        String str;
        IYN iyn = this.hitBitrate;
        if (iyn != null) {
            String urlKey = iyn.getUrlKey();
            if (TextUtils.isEmpty(urlKey)) {
                if (iyn.isBytevc1() == 1) {
                    str = "bytevc1";
                } else {
                    str = "";
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(getUri());
                LIZ.append(str);
                LIZ.append("T");
                LIZ.append(iyn.getBitRate());
                return X1D.LIZIZ(LIZ);
            }
            return urlKey;
        }
        return getUri();
    }

    public String getRatioUri() {
        String str;
        if (this.ratioUri == null) {
            int i = this.codecType;
            String str2 = "";
            if (i == 2) {
                str = "bytevc2";
            } else if (i != 1) {
                str = "";
            } else {
                str = "bytevc1";
            }
            if (this.uri != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(this.uri);
                String str3 = this.ratio;
                if (str3 != null) {
                    str2 = str3;
                }
                str2 = JBR.LJFF(LIZ, str2, str, LIZ);
            }
            this.ratioUri = str2;
        }
        return this.ratioUri;
    }

    public boolean isBytevc1() {
        if (this.codecType == 1) {
            return true;
        }
        return false;
    }

    public boolean isHaveHdr() {
        List<BitRate> list = this.bitRate;
        if (list != null) {
            for (BitRate bitRate : list) {
                if (bitRate != null && (bitRate.getHdrType() == 1 || bitRate.getHdrType() == 2)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public String toString() {
        List list = this.urlList;
        if (list != null && !list.isEmpty()) {
            list = new ArrayList(this.urlList);
        }
        List list2 = this.bitRate;
        if (list2 != null && !list2.isEmpty()) {
            list2 = new ArrayList(this.bitRate);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoUrlModel{uri='");
        Q89.LIZIZ(LIZ, this.uri, '\'', "aK='");
        LIZ.append(this.aK);
        LIZ.append('\'');
        LIZ.append(", urlList=");
        LIZ.append(list);
        LIZ.append("sourceId='");
        Q89.LIZIZ(LIZ, this.sourceId, '\'', ", ratio='");
        Q89.LIZIZ(LIZ, this.ratio, '\'', ", mVr=");
        LIZ.append(this.mVr);
        LIZ.append(", duration=");
        LIZ.append(this.duration);
        LIZ.append(", bitRate=");
        LIZ.append(list2);
        LIZ.append(", createTime=");
        LIZ.append(this.createTime);
        LIZ.append(", codecType=");
        return b0.LIZJ(LIZ, this.codecType, '}', LIZ);
    }

    private void calculateHasDashBitrate() {
        if (O5Y.LJIILJJIL()) {
            return;
        }
        if (!TextUtils.isEmpty(this.meta)) {
            try {
                if (TextUtils.equals(new JSONObject(this.meta).optString("format"), "dash")) {
                    this.hasDashBitrate = Boolean.TRUE;
                    return;
                }
            } catch (Throwable unused) {
            }
        }
        this.hasDashBitrate = Boolean.FALSE;
    }

    public List<BitRate> getBitRate() {
        if (hasDashBitrate()) {
            return Collections.emptyList();
        }
        List<BitRate> list = this.bitRate;
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    @Override // com.ss.android.ugc.aweme.base.model.UrlModel
    public String getUri() {
        if (!TextUtils.isEmpty(getUrlKey())) {
            return getUrlKey();
        }
        return getRatioUri();
    }

    public boolean hasDashBitrate() {
        Boolean bool;
        if (O5Y.LJIILJJIL()) {
            return TextUtils.equals("dash", this.format);
        }
        Object value = IZ8.Z0.getValue();
        o.LJIIIIZZ(value, "<get-dashBitrateResultCachEnable>(...)");
        if (((Boolean) value).booleanValue() && (bool = this.hasDashBitrate) != null) {
            return bool.booleanValue();
        }
        calculateHasDashBitrate();
        return this.hasDashBitrate.booleanValue();
    }

    public float getAspectRatio() {
        return this.aspectRatio;
    }

    public List<BitrateAudioStruct> getAudioBitrate() {
        return this.audioBitrate;
    }

    public long getCdnUrlExpired() {
        return this.cdnUrlExpired;
    }

    public int getCodecType() {
        return this.codecType;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public String getDashVideoId() {
        return this.mDashVideoId;
    }

    public String getDashVideoModelStr() {
        return this.mDashVideoModelString;
    }

    public double getDuration() {
        return this.duration;
    }

    public String getFileCheckSum() {
        return this.fileCheckSum;
    }

    public String getFormat() {
        return this.format;
    }

    public IYN getHitBitrate() {
        return this.hitBitrate;
    }

    public BitrateAudioStruct getHitDashAudioBitrate() {
        return this.hitDashAudioBitrate;
    }

    public BitRate getHitDashVideoBitrate() {
        return this.hitDashVideoBitrate;
    }

    public String getMeta() {
        return this.meta;
    }

    public String getOriginUri() {
        return this.uri;
    }

    public String getRatio() {
        return this.ratio;
    }

    public List<BitRate> getRawBitRate() {
        return this.bitRate;
    }

    public String getSourceId() {
        return this.sourceId;
    }

    public String getVideoAdTag() {
        return this.videoAdTag;
    }

    @Override // com.ss.android.ugc.aweme.base.model.UrlModel
    public String getaK() {
        return this.aK;
    }

    public boolean isVr() {
        return this.mVr;
    }

    public void setAspectRatio(float f) {
        this.aspectRatio = f;
    }

    public void setAudioBitrate(List<BitrateAudioStruct> list) {
        this.audioBitrate = list;
    }

    public void setBitRate(List<BitRate> list) {
        this.bitRate = list;
    }

    public void setBytevc1(boolean z) {
        this.codecType = z ? 1 : 0;
    }

    public void setCdnUrlExpired(long j) {
        this.cdnUrlExpired = j;
    }

    public void setCodecType(int i) {
        this.codecType = i;
    }

    public void setDashVideoId(String str) {
        this.mDashVideoId = str;
    }

    public void setDashVideoModelStr(String str) {
        this.mDashVideoModelString = str;
    }

    public void setDuration(double d) {
        this.duration = d;
    }

    public void setFileCheckSum(String str) {
        this.fileCheckSum = str;
    }

    public void setFormat(String str) {
        this.format = str;
    }

    public void setHitBitrate(IYN iyn) {
        this.hitBitrate = iyn;
    }

    public void setHitDashAudioBitrate(BitrateAudioStruct bitrateAudioStruct) {
        this.hitDashAudioBitrate = bitrateAudioStruct;
    }

    public void setHitDashVideoBitrate(BitRate bitRate) {
        this.hitDashVideoBitrate = bitRate;
    }

    public void setMeta(String str) {
        this.meta = str;
    }

    public VideoUrlModel setRatio(String str) {
        this.ratio = str;
        return this;
    }

    public VideoUrlModel setSourceId(String str) {
        this.sourceId = str;
        return this;
    }

    public void setVideoAdTag(String str) {
        this.videoAdTag = str;
    }

    public void setVr(boolean z) {
        this.mVr = z;
    }

    @Override // com.ss.android.ugc.aweme.base.model.UrlModel
    public void setaK(String str) {
        this.aK = str;
    }
}
