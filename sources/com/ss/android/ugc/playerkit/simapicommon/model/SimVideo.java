package com.ss.android.ugc.playerkit.simapicommon.model;

import X.IZ6;
import X.IZ8;
import X.IZG;
import X.InterfaceC65349Pkn;
import X.O5Y;
import X.Q89;
import X.X1D;
import android.text.TextUtils;
import com.google.gson.j;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class SimVideo implements Serializable {
    public SimVideoUrlModel LJLIL;
    public SimVideoUrlModel LJLILLLLZI;
    public boolean LJLJI;
    public String LJLJJI;
    public String LJLJJL = "";
    public Boolean LJLJJLL;
    public Object LJLJL;
    public IZG LJLJLJ;

    @InterfaceC65349Pkn("bit_rate_audio")
    public List<SimAudioBitrate> audioBitrate;

    @InterfaceC65349Pkn("bit_rate")
    public List<SimBitRate> bitRate;

    @InterfaceC65349Pkn("cdn_url_expired")
    public long cdnUrlExpired;

    @InterfaceC65349Pkn("cla_info")
    public IZ6 claInfo;

    @InterfaceC65349Pkn("video_model")
    public String dVideoModel;

    @InterfaceC65349Pkn("token_auth")
    public SimPlayTokenAuth drmTokenAuth;

    @InterfaceC65349Pkn("is_drm_source")
    public boolean enableIntertrustDrm;

    @InterfaceC65349Pkn("play_addr_h264")
    public SimVideoUrlModel h264PlayAddr;

    @InterfaceC65349Pkn("height")
    public int height;

    @InterfaceC65349Pkn("is_bytevc1")
    public Integer isBytevc1;

    @InterfaceC65349Pkn("is_long_video")
    public Integer isLongVideo;

    @InterfaceC65349Pkn("meta")
    public String meta;

    @InterfaceC65349Pkn("need_set_token")
    public boolean needSetCookie;
    public Object origin;

    @InterfaceC65349Pkn("play_addr_lowbr")
    public SimUrlModel playAddrLowbr;

    @InterfaceC65349Pkn("ratio")
    public String ratio;

    @InterfaceC65349Pkn("duration")
    public int videoLength;

    @InterfaceC65349Pkn("big_thumbs")
    public List<j> videoThumbs;

    @InterfaceC65349Pkn("width")
    public int width;

    public boolean isLowBr() {
        return false;
    }

    public final void LIZIZ() {
        SimVideoUrlModel simVideoUrlModel = this.LJLILLLLZI;
        if (simVideoUrlModel != null) {
            List<SimBitRate> bitRate = simVideoUrlModel.getBitRate();
            List<SimBitRate> list = this.bitRate;
            if (bitRate != list) {
                this.LJLILLLLZI.setBitRate(list);
                this.LJLILLLLZI.setAudioBitRate(this.audioBitrate);
                this.LJLILLLLZI.setDuration(this.videoLength);
                this.LJLILLLLZI.setCodecType(1);
                this.LJLILLLLZI.setMeta(this.meta);
                this.LJLILLLLZI.setFormat(this.LJLJJI);
                this.LJLILLLLZI.setDashVideoModelStr(getVideoModelStr());
            }
        }
        SimVideoUrlModel simVideoUrlModel2 = this.LJLIL;
        if (simVideoUrlModel2 != null) {
            List<SimBitRate> bitRate2 = simVideoUrlModel2.getBitRate();
            List<SimBitRate> list2 = this.bitRate;
            if (bitRate2 != list2) {
                this.LJLIL.setBitRate(list2);
                this.LJLIL.setAudioBitRate(this.audioBitrate);
                this.LJLIL.setDuration(this.videoLength);
                this.LJLIL.setCodecType(0);
                this.LJLIL.setMeta(this.meta);
                this.LJLIL.setFormat(this.LJLJJI);
                this.LJLIL.setDashVideoModelStr(getVideoModelStr());
            }
        }
    }

    public IZG getMetaInfo() {
        IZG izg = this.LJLJLJ;
        if (izg == null) {
            IZG metaInfo = getMetaInfo(this);
            this.LJLJLJ = metaInfo;
            return metaInfo;
        }
        return izg;
    }

    public int getVidPlayVersion() {
        SimPlayTokenAuth simPlayTokenAuth = this.drmTokenAuth;
        if (simPlayTokenAuth != null && simPlayTokenAuth.isValid()) {
            return this.drmTokenAuth.getVersion();
        }
        if (getMetaInfo().getVidToken() != null) {
            return getMetaInfo().getVidToken().getVersion();
        }
        return 1;
    }

    public String getVideoId() {
        SimPlayTokenAuth simPlayTokenAuth = this.drmTokenAuth;
        if (simPlayTokenAuth != null && simPlayTokenAuth.isValid()) {
            return this.drmTokenAuth.getVid();
        }
        if (getMetaInfo().getVidToken() != null) {
            return getMetaInfo().getVidToken().getVid();
        }
        return null;
    }

    public String getVideoIdApiHost() {
        SimPlayTokenAuth simPlayTokenAuth = this.drmTokenAuth;
        if (simPlayTokenAuth != null && simPlayTokenAuth.isValid()) {
            return this.drmTokenAuth.tryGetHost();
        }
        if (getMetaInfo().getVidToken() != null) {
            return getMetaInfo().getVidToken().tryGetHost();
        }
        return null;
    }

    public String getVideoIdAuth() {
        SimPlayTokenAuth simPlayTokenAuth = this.drmTokenAuth;
        if (simPlayTokenAuth != null) {
            return simPlayTokenAuth.getAuth();
        }
        return null;
    }

    public String getVideoIdPToken() {
        SimPlayTokenAuth simPlayTokenAuth = this.drmTokenAuth;
        if (simPlayTokenAuth != null && simPlayTokenAuth.isValid()) {
            return this.drmTokenAuth.getToken();
        }
        if (getMetaInfo().getVidToken() != null) {
            return getMetaInfo().getVidToken().getToken();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0283 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02aa A[Catch: all -> 0x02c7, TryCatch #0 {all -> 0x02c7, blocks: (B:22:0x0045, B:26:0x0061, B:27:0x0098, B:30:0x00b8, B:32:0x00c6, B:37:0x00e3, B:38:0x00ea, B:42:0x0103, B:45:0x010e, B:48:0x0122, B:51:0x0133, B:54:0x0153, B:57:0x015e, B:59:0x0167, B:61:0x016d, B:63:0x0173, B:69:0x01c3, B:70:0x01bd, B:72:0x01aa, B:75:0x01b4, B:76:0x017a, B:79:0x0184, B:80:0x018a, B:83:0x0194, B:84:0x019a, B:87:0x01a4, B:88:0x015a, B:89:0x0151, B:90:0x012d, B:91:0x011c, B:92:0x010a, B:93:0x00ff, B:94:0x00e6, B:95:0x00d8, B:98:0x01cf, B:99:0x01e3, B:101:0x01e9, B:104:0x0202, B:107:0x020f, B:110:0x0223, B:113:0x0234, B:116:0x0241, B:119:0x024e, B:123:0x0262, B:127:0x0278, B:131:0x028e, B:134:0x029d, B:138:0x02ac, B:139:0x02aa, B:141:0x029b, B:142:0x0284, B:144:0x028a, B:145:0x026e, B:147:0x0274, B:148:0x0258, B:150:0x025e, B:151:0x024c, B:152:0x023f, B:153:0x022e, B:154:0x021d, B:155:0x020d, B:156:0x01fc, B:158:0x02b4, B:162:0x005d), top: B:21:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x029b A[Catch: all -> 0x02c7, TryCatch #0 {all -> 0x02c7, blocks: (B:22:0x0045, B:26:0x0061, B:27:0x0098, B:30:0x00b8, B:32:0x00c6, B:37:0x00e3, B:38:0x00ea, B:42:0x0103, B:45:0x010e, B:48:0x0122, B:51:0x0133, B:54:0x0153, B:57:0x015e, B:59:0x0167, B:61:0x016d, B:63:0x0173, B:69:0x01c3, B:70:0x01bd, B:72:0x01aa, B:75:0x01b4, B:76:0x017a, B:79:0x0184, B:80:0x018a, B:83:0x0194, B:84:0x019a, B:87:0x01a4, B:88:0x015a, B:89:0x0151, B:90:0x012d, B:91:0x011c, B:92:0x010a, B:93:0x00ff, B:94:0x00e6, B:95:0x00d8, B:98:0x01cf, B:99:0x01e3, B:101:0x01e9, B:104:0x0202, B:107:0x020f, B:110:0x0223, B:113:0x0234, B:116:0x0241, B:119:0x024e, B:123:0x0262, B:127:0x0278, B:131:0x028e, B:134:0x029d, B:138:0x02ac, B:139:0x02aa, B:141:0x029b, B:142:0x0284, B:144:0x028a, B:145:0x026e, B:147:0x0274, B:148:0x0258, B:150:0x025e, B:151:0x024c, B:152:0x023f, B:153:0x022e, B:154:0x021d, B:155:0x020d, B:156:0x01fc, B:158:0x02b4, B:162:0x005d), top: B:21:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0284 A[Catch: all -> 0x02c7, TryCatch #0 {all -> 0x02c7, blocks: (B:22:0x0045, B:26:0x0061, B:27:0x0098, B:30:0x00b8, B:32:0x00c6, B:37:0x00e3, B:38:0x00ea, B:42:0x0103, B:45:0x010e, B:48:0x0122, B:51:0x0133, B:54:0x0153, B:57:0x015e, B:59:0x0167, B:61:0x016d, B:63:0x0173, B:69:0x01c3, B:70:0x01bd, B:72:0x01aa, B:75:0x01b4, B:76:0x017a, B:79:0x0184, B:80:0x018a, B:83:0x0194, B:84:0x019a, B:87:0x01a4, B:88:0x015a, B:89:0x0151, B:90:0x012d, B:91:0x011c, B:92:0x010a, B:93:0x00ff, B:94:0x00e6, B:95:0x00d8, B:98:0x01cf, B:99:0x01e3, B:101:0x01e9, B:104:0x0202, B:107:0x020f, B:110:0x0223, B:113:0x0234, B:116:0x0241, B:119:0x024e, B:123:0x0262, B:127:0x0278, B:131:0x028e, B:134:0x029d, B:138:0x02ac, B:139:0x02aa, B:141:0x029b, B:142:0x0284, B:144:0x028a, B:145:0x026e, B:147:0x0274, B:148:0x0258, B:150:0x025e, B:151:0x024c, B:152:0x023f, B:153:0x022e, B:154:0x021d, B:155:0x020d, B:156:0x01fc, B:158:0x02b4, B:162:0x005d), top: B:21:0x0045 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getVideoModelStr() {
        /*
            Method dump skipped, instructions count: 715
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.playerkit.simapicommon.model.SimVideo.getVideoModelStr():java.lang.String");
    }

    public final void LIZ() {
        if (O5Y.LJIILJJIL()) {
            return;
        }
        if (!TextUtils.isEmpty(this.meta)) {
            try {
                if (TextUtils.equals(new JSONObject(this.meta).optString("format"), "dash")) {
                    this.LJLJJLL = Boolean.TRUE;
                    return;
                }
            } catch (Throwable unused) {
            }
        }
        this.LJLJJLL = Boolean.FALSE;
    }

    public List<SimBitRate> getBitRate() {
        if (hasDashBitrate()) {
            return Collections.emptyList();
        }
        return this.bitRate;
    }

    public List<SimBitRate> getDashVideoBitRate() {
        if (hasDashBitrate()) {
            return this.bitRate;
        }
        return null;
    }

    public SimVideoUrlModel getPlayAddr() {
        LIZIZ();
        SimVideoUrlModel simVideoUrlModel = this.LJLILLLLZI;
        if (simVideoUrlModel != null) {
            simVideoUrlModel.setCodecType(1);
            this.LJLILLLLZI.setRatio(this.ratio);
        }
        SimVideoUrlModel simVideoUrlModel2 = this.LJLIL;
        if (simVideoUrlModel2 != null) {
            simVideoUrlModel2.setCodecType(0);
            this.LJLIL.setRatio(this.ratio);
        }
        if (checkVideo(this.LJLILLLLZI)) {
            return this.LJLILLLLZI;
        }
        return this.LJLIL;
    }

    public SimVideoUrlModel getPlayAddrBytevc1() {
        LIZIZ();
        SimVideoUrlModel simVideoUrlModel = this.LJLILLLLZI;
        if (simVideoUrlModel != null) {
            simVideoUrlModel.setCodecType(1);
            this.LJLILLLLZI.setRatio(this.ratio);
        }
        return this.LJLILLLLZI;
    }

    public SimVideoUrlModel getPlayAddrH264() {
        LIZIZ();
        SimVideoUrlModel simVideoUrlModel = this.LJLIL;
        if (simVideoUrlModel != null) {
            simVideoUrlModel.setCodecType(0);
            this.LJLIL.setRatio(this.ratio);
        }
        return this.LJLIL;
    }

    public SimVideoUrlModel getProperPlayAddr() {
        return getPlayAddr();
    }

    public boolean hasDashBitrate() {
        Boolean bool;
        if (O5Y.LJIILJJIL()) {
            return TextUtils.equals("dash", this.LJLJJI);
        }
        Object value = IZ8.LIZJ.getValue();
        o.LJIIIIZZ(value, "<get-enableDashBitrateResultCache>(...)");
        if (((Boolean) value).booleanValue() && (bool = this.LJLJJLL) != null) {
            return bool.booleanValue();
        }
        LIZ();
        return this.LJLJJLL.booleanValue();
    }

    public boolean hasDashBitrateAndSelectAsMp4() {
        if (hasDashBitrate() && IZ8.LJIILL()) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SimVideo{playAddr=");
        LIZ.append(this.LJLIL);
        LIZ.append(", playAddrBytevc1=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", height=");
        LIZ.append(this.height);
        LIZ.append(", width=");
        LIZ.append(this.width);
        LIZ.append(", ratio='");
        Q89.LIZIZ(LIZ, this.ratio, '\'', ", downloadAddr=, hasWaterMark=, videoLength=");
        LIZ.append(this.videoLength);
        LIZ.append(", bitRate=");
        LIZ.append(this.bitRate);
        LIZ.append(", newDownloadAddr=, suffixLogoAddr=, hasSuffixWaterMark=, needSetCookie=");
        LIZ.append(this.needSetCookie);
        LIZ.append(", misc_download_addrs=, isCallback=");
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public boolean enableIntertrustDrm() {
        return this.enableIntertrustDrm;
    }

    public List<SimAudioBitrate> getAudioBitRate() {
        return this.audioBitrate;
    }

    public IZ6 getClaInfo() {
        return this.claInfo;
    }

    public SimPlayTokenAuth getDrmTokenAuth() {
        return this.drmTokenAuth;
    }

    public int getDuration() {
        return this.videoLength;
    }

    public String getFormat() {
        return this.LJLJJI;
    }

    public SimVideoUrlModel getH264PlayAddr() {
        return this.h264PlayAddr;
    }

    public int getHeight() {
        return this.height;
    }

    public Integer getIsBytevc1() {
        return this.isBytevc1;
    }

    public String getMeta() {
        return this.meta;
    }

    public String getRatio() {
        return this.ratio;
    }

    public List<SimBitRate> getRawBitrate() {
        return this.bitRate;
    }

    public String getSourceId() {
        return this.LJLJJL;
    }

    public int getVideoLength() {
        return this.videoLength;
    }

    public Object getVideoModel() {
        return this.LJLJL;
    }

    public List<j> getVideoThumbs() {
        return this.videoThumbs;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isColdBoot() {
        return this.LJLJI;
    }

    public boolean isNeedSetCookie() {
        return this.needSetCookie;
    }

    public static IZG getMetaInfo(SimVideo simVideo) {
        if (simVideo == null) {
            return IZG.from(null);
        }
        if (TextUtils.isEmpty(simVideo.getMeta())) {
            return IZG.from(null);
        }
        return IZG.from(simVideo.getMeta());
    }

    public boolean checkVideo(SimUrlModel simUrlModel) {
        List<String> urlList;
        if (simUrlModel == null || (urlList = simUrlModel.getUrlList()) == null || urlList.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : urlList) {
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        simUrlModel.setUrlList(arrayList);
        if (urlList.isEmpty() || TextUtils.isEmpty(simUrlModel.getUri())) {
            return false;
        }
        return true;
    }

    public void setAudioBitRate(List<SimAudioBitrate> list) {
        this.audioBitrate = list;
    }

    public void setBitRate(List<SimBitRate> list) {
        this.bitRate = list;
    }

    public void setClaInfo(IZ6 iz6) {
        this.claInfo = iz6;
    }

    public void setColdBoot(boolean z) {
        this.LJLJI = z;
    }

    public void setDrmTokenAuth(SimPlayTokenAuth simPlayTokenAuth) {
        this.drmTokenAuth = simPlayTokenAuth;
    }

    public void setDuration(double d) {
        this.videoLength = (int) d;
    }

    public void setEnableIntertrustDrm(boolean z) {
        this.enableIntertrustDrm = z;
    }

    public void setFormat(String str) {
        this.LJLJJI = str;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setIsBytevc1(Integer num) {
        this.isBytevc1 = num;
    }

    public void setMeta(String str) {
        this.meta = str;
        LIZ();
    }

    public void setNeedSetCookie(boolean z) {
        this.needSetCookie = z;
    }

    public void setPlayAddr(SimVideoUrlModel simVideoUrlModel) {
        this.LJLIL = simVideoUrlModel;
    }

    public void setPlayAddrBytevc1(SimVideoUrlModel simVideoUrlModel) {
        this.LJLILLLLZI = simVideoUrlModel;
    }

    public void setPlayAddrH264(SimVideoUrlModel simVideoUrlModel) {
        this.h264PlayAddr = simVideoUrlModel;
    }

    public void setRatio(String str) {
        this.ratio = str;
    }

    public void setRationAndSourceId(String str) {
        SimVideoUrlModel simVideoUrlModel = this.LJLILLLLZI;
        if (simVideoUrlModel != null) {
            simVideoUrlModel.setRatio(this.ratio);
            simVideoUrlModel.setSourceId(str);
            this.LJLILLLLZI.setCodecType(1);
        }
        SimVideoUrlModel simVideoUrlModel2 = this.LJLIL;
        if (simVideoUrlModel2 != null) {
            simVideoUrlModel2.setRatio(this.ratio);
            simVideoUrlModel2.setSourceId(str);
            this.LJLIL.setCodecType(0);
        }
        this.LJLJJL = str;
    }

    public void setSourceId(String str) {
        setRationAndSourceId(str);
    }

    public void setVideoLength(int i) {
        this.videoLength = i;
    }

    public void setVideoModel(Object obj) {
        this.LJLJL = obj;
    }

    public void setVideoModelStr(String str) {
        this.dVideoModel = str;
    }

    public void setVideoThumbs(List<j> list) {
        this.videoThumbs = list;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}
