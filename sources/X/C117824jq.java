package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import ujb.o;

/* renamed from: X.4jq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C117824jq implements Serializable {
    public String algorithm;
    public String displayType;
    public String encryptUrl;
    public java.util.Map<String, String> ext;
    public String hash;
    public int index;
    public long length;
    public String localPath;
    public String mimeType;
    public String msgUuid;
    public String remoteUrl;
    public String secretKey;
    public int status;
    public String type;
    public int uploadProgress;
    public android.net.Uri uploadUri;

    public String getAlgorithm() {
        if (!TextUtils.isEmpty(this.algorithm)) {
            return this.algorithm;
        }
        String str = getExt().get("s:algorithm");
        this.algorithm = str;
        return str;
    }

    public String getEncryptUrl() {
        if (!TextUtils.isEmpty(this.encryptUrl)) {
            return this.encryptUrl;
        }
        String str = getExt().get("s:encryptUrl");
        this.encryptUrl = str;
        return str;
    }

    public java.util.Map<String, String> getExt() {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        return this.ext;
    }

    public String getExtStr() {
        return C63682Oz0.LIZ(this.ext);
    }

    public android.net.Uri getLocalUri() {
        return android.net.Uri.fromFile(new File(this.localPath));
    }

    public int getOriginalHeight() {
        String str;
        java.util.Map<String, String> map = this.ext;
        if (map == null || !map.containsKey("s:file_ext_key_original_height")) {
            str = "";
        } else {
            str = this.ext.get("s:file_ext_key_original_height");
        }
        if (str != null && !str.equals("")) {
            try {
                return CastIntegerProtector.parseInt(str);
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    public int getOriginalWidth() {
        String str;
        java.util.Map<String, String> map = this.ext;
        if (map == null || !map.containsKey("s:file_ext_key_original_width")) {
            str = "";
        } else {
            str = this.ext.get("s:file_ext_key_original_width");
        }
        if (str != null && !str.equals("")) {
            try {
                return CastIntegerProtector.parseInt(str);
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    public String getSecretKey() {
        if (!TextUtils.isEmpty(this.secretKey)) {
            return this.secretKey;
        }
        String str = getExt().get("s:secretKey");
        this.secretKey = str;
        return str;
    }

    public int getUploadState() {
        String str;
        java.util.Map<String, String> map = this.ext;
        if (map != null && map.containsKey("s:file_ext_key_upload_state")) {
            str = this.ext.get("s:file_ext_key_upload_state");
        } else {
            str = "";
        }
        int i = 0;
        if (str == null) {
            return 0;
        }
        try {
            i = CastIntegerProtector.parseInt(str);
            return i;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public String getUri() {
        java.util.Map<String, String> map = this.ext;
        if (map != null && map.containsKey("s:file_ext_key_uri")) {
            return this.ext.get("s:file_ext_key_uri");
        }
        return "";
    }

    public String getVid() {
        java.util.Map<String, String> map = this.ext;
        if (map != null && map.containsKey("s:file_ext_key_vid")) {
            return this.ext.get("s:file_ext_key_vid");
        }
        return "";
    }

    public String getVideoCoverUrl() {
        java.util.Map<String, String> map = this.ext;
        if (map != null && map.containsKey("s:file_ext_key_video_cover_url")) {
            return this.ext.get("s:file_ext_key_video_cover_url");
        }
        return "";
    }

    public boolean isEncrypt() {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        return "1".equals(this.ext.get("s:file_ext_key_need_encrypt"));
    }

    public boolean isUseImageX() {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        if (isEncrypt() || "1".equals(this.ext.get("s:file_ext_key_use_imagex"))) {
            return true;
        }
        return false;
    }

    public String toString() {
        return GsonProtectorUtils.toJson(C63682Oz0.LIZ, this);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String getDisplayType() {
        return this.displayType;
    }

    public String getHash() {
        return this.hash;
    }

    public int getIndex() {
        return this.index;
    }

    public long getLength() {
        return this.length;
    }

    public String getLocalPath() {
        return this.localPath;
    }

    public String getMimeType() {
        return this.mimeType;
    }

    public String getMsgUuid() {
        return this.msgUuid;
    }

    public String getRemoteUrl() {
        return this.remoteUrl;
    }

    public int getStatus() {
        return this.status;
    }

    public String getType() {
        return this.type;
    }

    public int getUploadProgress() {
        return this.uploadProgress;
    }

    public android.net.Uri getUploadUri() {
        return this.uploadUri;
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2 = false;
        if (!(obj instanceof C117824jq)) {
            return false;
        }
        C117824jq c117824jq = (C117824jq) obj;
        if (o.LJJJI(this.msgUuid, c117824jq.msgUuid) && o.LJJJI(this.localPath, c117824jq.localPath) && o.LJJJI(this.remoteUrl, c117824jq.remoteUrl) && this.length == c117824jq.length && this.index == c117824jq.index && this.status == c117824jq.status && o.LJJJI(this.hash, c117824jq.hash) && o.LJJJI(this.displayType, c117824jq.displayType) && o.LJJJI(this.mimeType, c117824jq.mimeType) && o.LJJJI(this.encryptUrl, c117824jq.encryptUrl) && o.LJJJI(this.secretKey, c117824jq.secretKey) && o.LJJJI(this.algorithm, c117824jq.algorithm)) {
            z = true;
        } else {
            z = false;
        }
        java.util.Map<String, String> map = this.ext;
        if (map != null) {
            if (z && map.equals(c117824jq.ext)) {
                z = true;
            } else {
                z = false;
            }
        }
        android.net.Uri uri = this.uploadUri;
        if (uri != null) {
            if (z && uri.equals(c117824jq.uploadUri)) {
                z2 = true;
            }
            return z2;
        }
        return z;
    }

    public void setAlgorithm(String str) {
        this.algorithm = str;
        getExt().put("s:algorithm", str);
    }

    public void setCoverUri(String str) {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        if (!TextUtils.isEmpty(str)) {
            this.ext.put("s:file_ext_key_video_cover_uri", str);
        }
    }

    public void setDisplayType(String str) {
        this.displayType = str;
    }

    public void setEncryptUrl(String str) {
        this.encryptUrl = str;
        getExt().put("s:encryptUrl", str);
    }

    public void setExt(java.util.Map<String, String> map) {
        updateExt(map);
    }

    public void setExtStr(String str) {
        this.ext = C63682Oz0.LIZIZ(str);
    }

    public void setHash(String str) {
        this.hash = str;
    }

    public void setIndex(int i) {
        this.index = i;
    }

    public void setLength(long j) {
        this.length = j;
    }

    public void setLocalPath(String str) {
        this.localPath = str;
    }

    public void setLocalUri(android.net.Uri uri) {
        String str;
        if (uri != null) {
            str = uri.getPath();
        } else {
            str = "";
        }
        this.localPath = str;
    }

    public void setMimeType(String str) {
        this.mimeType = str;
    }

    public void setMsgUuid(String str) {
        this.msgUuid = str;
    }

    public void setNeedEncrypt(boolean z) {
        String str;
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        java.util.Map<String, String> map = this.ext;
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("s:file_ext_key_need_encrypt", str);
    }

    public void setOriginalHeight(int i) {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        this.ext.put("s:file_ext_key_original_height", String.valueOf(i));
    }

    public void setOriginalWidth(int i) {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        this.ext.put("s:file_ext_key_original_width", String.valueOf(i));
    }

    public void setRemoteUrl(String str) {
        this.remoteUrl = str;
    }

    public void setSecretKey(String str) {
        this.secretKey = str;
        getExt().put("s:secretKey", str);
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUploadProgress(int i) {
        this.uploadProgress = i;
    }

    public void setUploadState(int i) {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        this.ext.put("s:file_ext_key_upload_state", String.valueOf(i));
    }

    public void setUploadUri(android.net.Uri uri) {
        this.uploadUri = uri;
    }

    public void setUri(String str) {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        if (!TextUtils.isEmpty(str)) {
            this.ext.put("s:file_ext_key_uri", str);
        }
    }

    public void setUseImageX(boolean z) {
        String str;
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        java.util.Map<String, String> map = this.ext;
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("s:file_ext_key_use_imagex", str);
    }

    public void setVid(String str) {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        if (!TextUtils.isEmpty(str)) {
            this.ext.put("s:file_ext_key_vid", str);
        }
    }

    public void updateExt(java.util.Map<String, String> map) {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        if (map != null && !map.isEmpty()) {
            this.ext.putAll(map);
        }
    }

    public void setEncryptUri(String str, String str2, String str3, String str4) {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        if (!TextUtils.isEmpty(str)) {
            this.ext.put("s:file_ext_key_uri", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            this.ext.put("s:file_ext_key_encrypt_uri", str2);
        }
        this.secretKey = str3;
        this.algorithm = str4;
    }
}
