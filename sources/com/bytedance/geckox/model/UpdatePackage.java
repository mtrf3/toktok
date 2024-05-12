package com.bytedance.geckox.model;

import X.C16880lQ;
import X.C61571OEl;
import X.C77800Ug8;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.ODS;
import X.OE3;
import X.Q89;
import X.X1D;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class UpdatePackage {

    @InterfaceC65349Pkn("access_key")
    public String accessKey;
    public String apiVersion;

    @InterfaceC65349Pkn("biz_extra")
    public Map<String, String> bizExtra;

    @InterfaceC65349Pkn("channel")
    public String channel;

    @InterfaceC65349Pkn("channel_index")
    public int channelIndex;

    @InterfaceC65349Pkn("content")
    public Content content;

    @InterfaceC65349Pkn("from")
    public List<String> from;

    @InterfaceC65349Pkn("group_name")
    public String groupName;
    public boolean ignoreLowStorageLimit;
    public long initTime;

    @InterfaceC65349Pkn("is_zstd")
    public boolean isZstd;
    public boolean isZstdFallback;
    public long localVersion;
    public long localVersionOld;
    public String logId;
    public int notUsePatchReason;

    @InterfaceC65349Pkn("package_type")
    public int packageType;
    public ODS statisticModel;
    public boolean updateWithPatch;
    public boolean usePatched;

    @InterfaceC65349Pkn("package_version")
    public long version;

    /* loaded from: classes11.dex */
    public static final class FileType {
    }

    public String toString() {
        return C16880lQ.LLLZ("ak:%s, channel:%s, version:%d, packageType:%d, isZstd:%b, updateWithPatch:%b", new Object[]{this.accessKey, this.channel, Long.valueOf(this.version), Integer.valueOf(this.packageType), Boolean.valueOf(this.isZstd), Boolean.valueOf(this.updateWithPatch)});
    }

    /* loaded from: classes11.dex */
    public static class Package {

        @InterfaceC65349Pkn("decompress_md5")
        public String decompressMd5;

        @InterfaceC65349Pkn("fallback")
        public Fallback fallback;

        @InterfaceC65349Pkn("id")
        public long id;

        @InterfaceC65349Pkn("size")
        public long length;

        @InterfaceC65349Pkn("md5")
        public String md5;
        public String url;

        @InterfaceC65349Pkn("url_list")
        public List<String> urlList;

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Package{url='");
            Q89.LIZIZ(LIZ, this.url, '\'', ", md5='");
            return C77800Ug8.LIZJ(LIZ, this.md5, '\'', '}', LIZ);
        }

        public Package() {
        }

        public String getDecompressMd5() {
            return this.decompressMd5;
        }

        public Fallback getFallback() {
            return this.fallback;
        }

        public long getId() {
            return this.id;
        }

        public long getLength() {
            return this.length;
        }

        public String getMd5() {
            return this.md5;
        }

        public String getUrl() {
            return this.url;
        }

        public List<String> getUrlList() {
            return this.urlList;
        }

        public void setId(int i) {
            this.id = i;
        }

        public void setLength(long j) {
            this.length = j;
        }

        public void setMd5(String str) {
            this.md5 = str;
        }

        public void setUrl(String str) {
            this.url = str;
        }

        public void setUrlList(List<String> list) {
            this.urlList = list;
        }

        public Package(long j, List<String> list, String str) {
            this.id = j;
            this.urlList = list;
            this.md5 = str;
        }
    }

    public UpdatePackage fallbackInstance() {
        UpdatePackage updatePackage = new UpdatePackage();
        updatePackage.groupName = this.groupName;
        updatePackage.channelIndex = this.channelIndex;
        updatePackage.version = this.version;
        updatePackage.channel = this.channel;
        updatePackage.accessKey = this.accessKey;
        updatePackage.from = this.from;
        updatePackage.packageType = this.packageType;
        updatePackage.statisticModel = this.statisticModel;
        updatePackage.apiVersion = this.apiVersion;
        updatePackage.logId = this.logId;
        updatePackage.localVersion = this.localVersion;
        updatePackage.localVersionOld = this.localVersionOld;
        updatePackage.notUsePatchReason = this.notUsePatchReason;
        updatePackage.usePatched = this.usePatched;
        updatePackage.isZstd = false;
        updatePackage.isZstdFallback = true;
        Content content = new Content();
        updatePackage.content = content;
        Content content2 = this.content;
        content.strategy = content2.strategy;
        Package r3 = content2.fullPackage;
        Package r2 = new Package();
        r2.id = r3.id;
        Fallback fallback = r3.fallback;
        r2.urlList = fallback.urlList;
        r2.md5 = fallback.md5;
        updatePackage.content.fullPackage = r2;
        return updatePackage;
    }

    public Package getFullPackage() {
        return this.content.fullPackage;
    }

    public Package getPackage() {
        if (this.updateWithPatch) {
            return this.content.patch;
        }
        return this.content.fullPackage;
    }

    public Package getPatch() {
        return this.content.patch;
    }

    public Strategy getStrategy() {
        return this.content.strategy;
    }

    public boolean hasFallback() {
        if (this.content.fullPackage.fallback != null) {
            return true;
        }
        return false;
    }

    public boolean isLastStep() {
        if (this.isZstdFallback) {
            return true;
        }
        if (isPatchUpdate()) {
            return false;
        }
        return !hasFallback();
    }

    public UpdatePackage() {
        this.content = new Content();
        this.groupName = "default";
    }

    public boolean isFullUpdate() {
        if (getFullPackage() != null && getFullPackage().getUrlList().size() > 0) {
            return true;
        }
        return false;
    }

    public boolean isPatchUpdate() {
        if (getPatch() != null && getPatch().getUrlList().size() > 0) {
            return true;
        }
        return false;
    }

    /* loaded from: classes11.dex */
    public static class Content {

        @InterfaceC65349Pkn("package")
        public Package fullPackage;

        @InterfaceC65349Pkn("patch")
        public Package patch;

        @InterfaceC65349Pkn("strategies")
        public Strategy strategy;

        public Strategy getStrategy() {
            return this.strategy;
        }
    }

    /* loaded from: classes11.dex */
    public static class Fallback {

        @InterfaceC65349Pkn("md5")
        public String md5;

        @InterfaceC65349Pkn("url_list")
        public List<String> urlList;

        public String getMd5() {
            return this.md5;
        }

        public List<String> getUrlList() {
            return this.urlList;
        }
    }

    /* loaded from: classes11.dex */
    public static class Strategy {

        @InterfaceC65349Pkn("del_if_download_failed")
        public int deleteIfFail;

        @InterfaceC65349Pkn("del_old_pkg_before_download")
        public int deleteOldPackageBeforeDownload;

        @InterfaceC65349Pkn("need_unzip")
        public int needUnzip;

        public int getDeleteIfFail() {
            return this.deleteIfFail;
        }

        public int getDeleteOldPackageBeforeDownload() {
            return this.deleteOldPackageBeforeDownload;
        }

        public int getNeedUnzip() {
            return this.needUnzip;
        }

        public void setDeleteIfFail(int i) {
            this.deleteIfFail = i;
        }

        public void setDeleteOldPackageBeforeDownload(int i) {
            this.deleteOldPackageBeforeDownload = i;
        }

        public void setNeedUnzip(int i) {
            this.needUnzip = i;
        }
    }

    public String getAccessKey() {
        return this.accessKey;
    }

    public Map<String, String> getBizExtra() {
        return this.bizExtra;
    }

    public String getChannel() {
        return this.channel;
    }

    public int getChannelIndex() {
        return this.channelIndex;
    }

    public Content getContent() {
        return this.content;
    }

    public List<String> getFrom() {
        return this.from;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public boolean getIsZstd() {
        return this.isZstd;
    }

    public long getLocalVersion() {
        return this.localVersion;
    }

    public int getPackageType() {
        return this.packageType;
    }

    public ODS getStatisticModel() {
        return this.statisticModel;
    }

    public boolean getUpdateWithPatch() {
        return this.updateWithPatch;
    }

    public long getVersion() {
        return this.version;
    }

    public boolean getZstdFallback() {
        return this.isZstdFallback;
    }

    public boolean isIgnoreLowStorageLimit() {
        return this.ignoreLowStorageLimit;
    }

    public void putStatisticModelToJson(JSONObject jSONObject) {
        int i;
        jSONObject.put("access_key", this.accessKey);
        jSONObject.put("group_name", this.groupName);
        jSONObject.put("channel", this.channel);
        jSONObject.put("id", getFullPackage().getId());
        if (this.isZstd || this.isZstdFallback) {
            i = 1;
        } else {
            i = 0;
        }
        jSONObject.put("is_zstd", i);
        jSONObject.put("api_version", this.apiVersion);
        jSONObject.put("ignore_low_storage_limit", this.ignoreLowStorageLimit ? 1 : 0);
        if (!TextUtils.isEmpty(this.logId)) {
            jSONObject.put("x_tt_logid", this.logId);
        }
        long j = this.localVersion;
        if (j != 0) {
            jSONObject.put("local_version", j);
        }
        if (getPatch() != null) {
            jSONObject.put("patch_id", getPatch().getId());
        }
        long j2 = this.localVersionOld;
        if (j2 != 0) {
            jSONObject.put("local_version_old", j2);
        }
        int i2 = this.packageType;
        if (i2 > 0) {
            jSONObject.put("package_type", i2);
        }
        int i3 = this.notUsePatchReason;
        if (i3 != 0) {
            jSONObject.put("not_use_patch_reason", i3);
        } else if (this.localVersion != 0 && !this.usePatched) {
            jSONObject.put("not_use_patch_reason", 10);
        }
        ODS ods = this.statisticModel;
        if (ods != null) {
            jSONObject.put("dur_wait_download", ods.LJIILL - this.initTime);
            ODS ods2 = this.statisticModel;
            jSONObject.put("req_type", ods2.LIZIZ);
            jSONObject.put("update_priority", ods2.LIZ);
            jSONObject.put("update_result", !ods2.LIZLLL ? 1 : 0);
            jSONObject.put("is_resume", ods2.LJIL ? 1 : 0);
            jSONObject.put("is_resume_open", ods2.LJIJJLI ? 1 : 0);
            jSONObject.put("resume_size", ods2.LJJ);
            jSONObject.put("resume_percent", ods2.LJJI);
            jSONObject.put("resume_threshold", C61571OEl.LIZ.LJII);
            int i4 = ods2.LIZJ;
            if (i4 != 0) {
                jSONObject.put("sync_task_id", i4);
            }
            boolean z = ods2.LJ;
            if (z) {
                jSONObject.put("create_by_error", z);
            }
            long j3 = ods2.LJFF;
            if (j3 > 0) {
                jSONObject.put("dur_total", j3);
            }
            long j4 = ods2.LJI;
            if (j4 > 0) {
                jSONObject.put("dur_last_stage", j4);
            }
            long j5 = ods2.LJII;
            if (j5 > 0) {
                jSONObject.put("dur_download", j5);
            }
            long j6 = ods2.LJIIIIZZ;
            if (j6 > 0) {
                jSONObject.put("dur_download_last_time", j6);
            }
            long j7 = ods2.LJIIIZ;
            if (j7 > 0) {
                jSONObject.put("dur_active", j7);
            }
            long j8 = ods2.LJIIJ;
            if (j8 > 0) {
                jSONObject.put("dur_unzip", j8);
            }
            long j9 = ods2.LJIIJJI;
            if (j9 > 0) {
                jSONObject.put("dur_decompress_zstd", j9);
            }
            long j10 = ods2.LJIIL;
            if (j10 > 0) {
                jSONObject.put("dur_bytepatch", j10);
            }
            long j11 = ods2.LJIILIIL;
            if (j11 > 0) {
                jSONObject.put("dur_zip_patch", j11);
            }
            long j12 = ods2.LJIILJJIL;
            if (j12 > 0) {
                jSONObject.put("dur_from_cold_start", j12);
            }
            for (OE3 oe3 : ((HashMap) ods2.LJJIFFI).values()) {
                oe3.getClass();
                StringBuilder LIZ = X1D.LIZ();
                jSONObject.put(JBR.LJFF(LIZ, oe3.LIZ, "result", LIZ), !oe3.LIZIZ ? 1 : 0);
                StringBuilder LIZ2 = X1D.LIZ();
                jSONObject.put(JBR.LJFF(LIZ2, oe3.LIZ, "url", LIZ2), oe3.LJ);
                if (!TextUtils.isEmpty(oe3.LIZLLL)) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    jSONObject.put(JBR.LJFF(LIZ3, oe3.LIZ, "err_msg", LIZ3), oe3.LIZLLL);
                }
                if (oe3.LIZJ != 0) {
                    StringBuilder LIZ4 = X1D.LIZ();
                    jSONObject.put(JBR.LJFF(LIZ4, oe3.LIZ, "err_code", LIZ4), oe3.LIZJ);
                }
                if (oe3.LJFF > 0) {
                    StringBuilder LIZ5 = X1D.LIZ();
                    jSONObject.put(JBR.LJFF(LIZ5, oe3.LIZ, "download_failed_times", LIZ5), oe3.LJFF);
                }
                if (oe3.LJI) {
                    StringBuilder LIZ6 = X1D.LIZ();
                    LIZ6.append(oe3.LIZ);
                    LIZ6.append("create_by_error");
                    jSONObject.put(X1D.LIZIZ(LIZ6), 1);
                }
            }
        }
        if (this.updateWithPatch) {
            if (getPatch() != null) {
                jSONObject.put("package_size", getPatch().getLength());
            }
        } else {
            if (getFullPackage() == null) {
                return;
            }
            jSONObject.put("package_size", getFullPackage().getLength());
        }
    }

    public void setAccessKey(String str) {
        this.accessKey = str;
    }

    public void setApiVersion(String str) {
        this.apiVersion = str;
    }

    public void setChannel(String str) {
        this.channel = str;
    }

    public void setChannelIndex(int i) {
        this.channelIndex = i;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public void setFrom(List<String> list) {
        this.from = list;
    }

    public void setFullPackage(Package r2) {
        this.content.fullPackage = r2;
    }

    public void setGroupName(String str) {
        this.groupName = str;
    }

    public void setIgnoreLowStorageLimit(boolean z) {
        this.ignoreLowStorageLimit = z;
    }

    public void setInitTime(long j) {
        this.initTime = j;
    }

    public void setLocalVersion(long j) {
        this.localVersion = j;
    }

    public void setLocalVersionOld(long j) {
        this.localVersionOld = j;
    }

    public void setLogId(String str) {
        this.logId = str;
    }

    public void setNotUsePatchReason(int i) {
        this.notUsePatchReason = i;
    }

    public void setPackageType(int i) {
        this.packageType = i;
    }

    public void setPatch(Package r2) {
        this.content.patch = r2;
    }

    public void setStatisticModel(ODS ods) {
        this.statisticModel = ods;
    }

    public void setStrategy(Strategy strategy) {
        this.content.strategy = strategy;
    }

    public void setUpdateWithPatch(boolean z) {
        this.updateWithPatch = z;
        if (z) {
            this.usePatched = true;
        }
    }

    public void setVersion(long j) {
        this.version = j;
    }

    public void setZstdFallback(boolean z) {
        this.isZstdFallback = z;
    }

    public UpdatePackage(long j, String str, Package r5, Package r6) {
        this.version = j;
        this.channel = str;
        Content content = new Content();
        this.content = content;
        content.fullPackage = r5;
        content.patch = r6;
        this.groupName = "default";
    }
}
