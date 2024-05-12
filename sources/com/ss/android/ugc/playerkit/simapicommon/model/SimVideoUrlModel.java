package com.ss.android.ugc.playerkit.simapicommon.model;

import X.C05040Hs;
import X.C47123IeV;
import X.IYN;
import X.IZ8;
import X.IZG;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.O5Y;
import X.Q89;
import X.SFS;
import X.X1D;
import Y.IDComparatorS36S0000000_8;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.b0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class SimVideoUrlModel extends SimUrlModel {
    public static final long serialVersionUID = 4566748102483196885L;
    public String LJLIL;
    public String LJLILLLLZI;
    public boolean LJLJI;
    public int LJLJJI;
    public String LJLJJL;
    public List<C47123IeV> LJLJL;
    public boolean LJLJLJ;
    public long LJLJLLL;
    public List<SimAudioBitrate> LJLL;
    public transient IYN LJLLI;
    public String LJLLILLLL;
    public String LJLLJ;
    public long LJLLLL;
    public float LJLLLLLL;
    public int LJLZ;
    public String LJZ;
    public String LJZI;
    public String LJZL;
    public long LL;
    public boolean LLD;
    public int LLF;
    public String LLFF;
    public SimBitRate LLFZ;
    public SimAudioBitrate LLI;
    public Boolean LLIFFJFJJ;

    @InterfaceC65349Pkn("bit_rate")
    public List<SimBitRate> bitRate;

    @InterfaceC65349Pkn("duration")
    public double duration;
    public int LJLJJLL = -1;
    public String LLFFF = "";
    public boolean LLFII = true;
    public final long LJLLL = SystemClock.elapsedRealtime();

    public String getBitRatedRatioUri() {
        IYN iyn = this.LJLLI;
        if (iyn != null) {
            String urlKey = iyn.getUrlKey();
            if (TextUtils.isEmpty(urlKey)) {
                String LJIIL = SFS.LJIIL(iyn.isBytevc1());
                if (iyn.isBytevc1() == 0) {
                    LJIIL = "";
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(getUri());
                LIZ.append(LJIIL);
                LIZ.append("T");
                LIZ.append(iyn.getBitRate());
                return X1D.LIZIZ(LIZ);
            }
            return urlKey;
        }
        return getUri();
    }

    public String getRatioUri() {
        if (this.LJLLJ == null) {
            String LJIIL = SFS.LJIIL(this.LJLJJI);
            String str = "";
            if (this.LJLJJI == 0) {
                LJIIL = "";
            }
            if (this.uri != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(this.uri);
                String str2 = this.LJLILLLLZI;
                if (str2 != null) {
                    str = str2;
                }
                str = JBR.LJFF(LIZ, str, LJIIL, LIZ);
            }
            this.LJLLJ = str;
        }
        return this.LJLLJ;
    }

    public boolean isBytevc1() {
        if (this.LJLJJI == 1) {
            return true;
        }
        return false;
    }

    public boolean isHaveHdr() {
        List<SimBitRate> list = this.bitRate;
        if (list != null) {
            for (SimBitRate simBitRate : list) {
                if (simBitRate != null && (simBitRate.getHdrType() == 1 || simBitRate.getHdrType() == 2)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final void LIZ() {
        if (O5Y.LJIILJJIL()) {
            return;
        }
        if (!TextUtils.isEmpty(this.LJLLILLLL)) {
            try {
                if (TextUtils.equals(IZG.from(this.LJLLILLLL).getJson().optString("format"), "dash")) {
                    this.LLIFFJFJJ = Boolean.TRUE;
                    return;
                }
            } catch (Throwable unused) {
            }
        }
        this.LLIFFJFJJ = Boolean.FALSE;
    }

    public List<SimBitRate> getBitRate() {
        if (hasDashBitrate()) {
            return Collections.emptyList();
        }
        List<SimBitRate> list = this.bitRate;
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    public List<SimBitRate> getDashBitRate() {
        if (hasDashBitrate()) {
            return this.bitRate;
        }
        return Collections.emptyList();
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.model.SimUrlModel
    public String getUri() {
        if (!TextUtils.isEmpty(getUrlKey())) {
            return getUrlKey();
        }
        return getRatioUri();
    }

    public boolean hasDashBitrate() {
        Boolean bool;
        if (O5Y.LJIILJJIL()) {
            return TextUtils.equals("dash", this.LJZ);
        }
        Object value = IZ8.LIZJ.getValue();
        o.LJIIIIZZ(value, "<get-enableDashBitrateResultCache>(...)");
        if (((Boolean) value).booleanValue() && (bool = this.LLIFFJFJJ) != null) {
            return bool.booleanValue();
        }
        LIZ();
        return this.LLIFFJFJJ.booleanValue();
    }

    public boolean hasDashBitrateAndSelectAsMp4() {
        if (hasDashBitrate() && IZ8.LJIILL()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.model.SimUrlModel
    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int hashCode = super.hashCode() * 31;
        String str = this.LJLIL;
        int i5 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i6 = (((hashCode + i) * 31) + this.LJLJJI) * 31;
        List<SimBitRate> list = this.bitRate;
        if (list != null) {
            i2 = list.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        String str2 = this.LJLLJ;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        String str3 = this.LJZI;
        if (str3 != null) {
            i4 = str3.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        String str4 = this.LJZL;
        if (str4 != null) {
            i5 = str4.hashCode();
        }
        return i9 + i5;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SimVideoUrlModel{uri='");
        Q89.LIZIZ(LIZ, this.uri, '\'', ", urlList=");
        LIZ.append(this.urlList);
        LIZ.append("sourceId='");
        Q89.LIZIZ(LIZ, this.LJLIL, '\'', ",dashVideoID=");
        Q89.LIZIZ(LIZ, this.LJZL, '\'', ", ratio='");
        Q89.LIZIZ(LIZ, this.LJLILLLLZI, '\'', ", mVr=");
        LIZ.append(this.LJLJI);
        LIZ.append(", duration=");
        LIZ.append(this.duration);
        LIZ.append(", bitRate=");
        LIZ.append(this.bitRate);
        LIZ.append(", createTime=");
        LIZ.append(this.LJLLL);
        LIZ.append(", codecType=");
        return b0.LIZJ(LIZ, this.LJLJJI, '}', LIZ);
    }

    public float getAspectRatio() {
        return this.LJLLLLLL;
    }

    public List<SimAudioBitrate> getAudioBitrate() {
        return this.LJLL;
    }

    public long getCdnUrlExpired() {
        return this.LJLLLL;
    }

    public int getCodecType() {
        return this.LJLJJI;
    }

    public long getCreateTime() {
        return this.LJLLL;
    }

    public String getDashVideoId() {
        return this.LJZL;
    }

    public String getDashVideoModelStr() {
        return this.LJZI;
    }

    public long getDubbedAudioPreloadSize() {
        return this.LJLJLLL;
    }

    public double getDuration() {
        return this.duration;
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.model.SimUrlModel
    public String getFileCheckSum() {
        return this.fileCheckSum;
    }

    public String getFileKey() {
        return this.LLFF;
    }

    public String getFirstSubMediaId() {
        return this.LJLJJL;
    }

    public String getFormat() {
        return this.LJZ;
    }

    public int getHVideoIndex() {
        return this.LJLJJLL;
    }

    public IYN getHitBitrate() {
        return this.LJLLI;
    }

    public SimAudioBitrate getHitDashAudioBitrate() {
        return this.LLI;
    }

    public SimBitRate getHitDashVideoBitrate() {
        return this.LLFZ;
    }

    public int getInfoId() {
        return this.LLF;
    }

    public String getMeta() {
        return this.LJLLILLLL;
    }

    public String getOriginUri() {
        return this.uri;
    }

    public long getPreloadMillSec() {
        return this.LL;
    }

    public String getRatio() {
        return this.LJLILLLLZI;
    }

    public List<SimBitRate> getRawBitRate() {
        return this.bitRate;
    }

    public int getScCategory() {
        return this.LJLZ;
    }

    public List<C47123IeV> getSimAudios() {
        return this.LJLJL;
    }

    public String getSourceId() {
        return this.LJLIL;
    }

    public String getSubTag() {
        return this.LLFFF;
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.model.SimUrlModel
    public String getaK() {
        return this.aK;
    }

    public boolean isColdBoot() {
        return this.LLD;
    }

    public boolean isIsEnablePreloadDubbedAudio() {
        return this.LJLJLJ;
    }

    public boolean isUseMdlAndVideoCache() {
        return this.LLFII;
    }

    public boolean isVr() {
        return this.LJLJI;
    }

    public static SimVideoUrlModel fromUrl(String str) {
        SimVideoUrlModel simVideoUrlModel = new SimVideoUrlModel();
        simVideoUrlModel.urlList = C05040Hs.LIZIZ(str);
        return simVideoUrlModel;
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.model.SimUrlModel
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        SimVideoUrlModel simVideoUrlModel = (SimVideoUrlModel) obj;
        if (this.LJLJJI != simVideoUrlModel.LJLJJI) {
            return false;
        }
        String str = this.LJLIL;
        if (str == null ? simVideoUrlModel.LJLIL != null : !str.equals(simVideoUrlModel.LJLIL)) {
            return false;
        }
        List<SimBitRate> list = this.bitRate;
        if (list == null ? simVideoUrlModel.bitRate != null : !list.equals(simVideoUrlModel.bitRate)) {
            return false;
        }
        String str2 = this.LJLLJ;
        if (str2 == null ? simVideoUrlModel.LJLLJ != null : !str2.equals(simVideoUrlModel.LJLLJ)) {
            return false;
        }
        String str3 = this.LJZI;
        if (str3 == null ? simVideoUrlModel.LJZI != null : !str3.equals(simVideoUrlModel.LJZI)) {
            return false;
        }
        String str4 = this.LJZL;
        String str5 = simVideoUrlModel.LJZL;
        if (str4 != null) {
            return str4.equals(str5);
        }
        if (str5 == null) {
            return true;
        }
        return false;
    }

    public void setAspectRatio(float f) {
        this.LJLLLLLL = f;
    }

    public void setAudioBitRate(List<SimAudioBitrate> list) {
        this.LJLL = list;
    }

    public void setBitRate(List<SimBitRate> list) {
        this.bitRate = list;
        Object value = IZ8.LJIIIIZZ.getValue();
        o.LJIIIIZZ(value, "<get-isRemoveHighBitrateLowResolution>(...)");
        if (!((Boolean) value).booleanValue() || this.bitRate == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.bitRate);
        Collections.sort(arrayList, new IDComparatorS36S0000000_8(5));
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (i < arrayList.size() - 1) {
            SimBitRate simBitRate = (SimBitRate) ListProtector.get(arrayList, i);
            i++;
            SimBitRate simBitRate2 = (SimBitRate) ListProtector.get(arrayList, i);
            int videoWidth = simBitRate.getVideoWidth();
            int videoWidth2 = simBitRate2.getVideoWidth();
            if (videoWidth > 0 && videoWidth2 > 0 && videoWidth < videoWidth2) {
                arrayList2.add(simBitRate);
            }
        }
        if (arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.remove(it.next());
            }
        }
        this.bitRate = arrayList;
    }

    public void setBytevc1(boolean z) {
        this.LJLJJI = z ? 1 : 0;
    }

    public void setCdnUrlExpired(long j) {
        this.LJLLLL = j;
    }

    public void setCodecType(int i) {
        this.LJLJJI = i;
    }

    public void setColdBoot(boolean z) {
        this.LLD = z;
    }

    public void setDashVideoId(String str) {
        this.LJZL = str;
    }

    public void setDashVideoModelStr(String str) {
        this.LJZI = str;
    }

    public void setDubbedAudioPreloadSize(long j) {
        this.LJLJLLL = j;
    }

    public void setDuration(double d) {
        this.duration = d;
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.model.SimUrlModel
    public void setFileCheckSum(String str) {
        this.fileCheckSum = str;
    }

    public void setFileKey(String str) {
        this.LLFF = str;
    }

    public void setFirstSubMediaId(String str) {
        this.LJLJJL = str;
    }

    public void setFormat(String str) {
        this.LJZ = str;
    }

    public void setHVideoIndex(int i) {
        this.LJLJJLL = i;
    }

    public void setHitBitrate(IYN iyn) {
        this.LJLLI = iyn;
    }

    public void setHitDashAudioBitrate(SimAudioBitrate simAudioBitrate) {
        this.LLI = simAudioBitrate;
    }

    public void setHitDashVideoBitrate(SimBitRate simBitRate) {
        this.LLFZ = simBitRate;
    }

    public void setInfoId(int i) {
        this.LLF = i;
    }

    public void setIsEnablePreloadDubbedAudio(boolean z) {
        this.LJLJLJ = z;
    }

    public void setMeta(String str) {
        this.LJLLILLLL = str;
        LIZ();
    }

    public void setPreloadMillSec(long j) {
        this.LL = j;
    }

    public SimVideoUrlModel setRatio(String str) {
        this.LJLILLLLZI = str;
        return this;
    }

    public void setScCategory(int i) {
        this.LJLZ = i;
    }

    public void setSimAudios(List<C47123IeV> list) {
        this.LJLJL = list;
    }

    public SimVideoUrlModel setSourceId(String str) {
        this.LJLIL = str;
        return this;
    }

    public void setSubTag(String str) {
        this.LLFFF = str;
    }

    public void setUseMdlAndVideoCache(boolean z) {
        this.LLFII = z;
    }

    public void setVr(boolean z) {
        this.LJLJI = z;
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.model.SimUrlModel
    public void setaK(String str) {
        this.aK = str;
    }
}
