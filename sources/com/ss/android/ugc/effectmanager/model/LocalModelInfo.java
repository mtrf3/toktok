package com.ss.android.ugc.effectmanager.model;

import X.X1D;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.effectmanager.common.ModelNameProcessor;
import java.io.File;

/* loaded from: classes16.dex */
public class LocalModelInfo {
    public boolean mIsBuilt;
    public final Uri mUri;
    public String md5;
    public String name;
    public int size = -1;
    public String version;

    public String getMD5() {
        Uri uri;
        String str = this.md5;
        if ((str == null || str.isEmpty()) && (uri = this.mUri) != null) {
            this.md5 = ModelNameProcessor.getMD5OfModel(new File(uri.getPath()).getName());
        }
        return this.md5;
    }

    public String getName() {
        Uri uri;
        String str = this.name;
        if ((str == null || str.isEmpty()) && (uri = this.mUri) != null) {
            this.name = ModelNameProcessor.getNameOfModel(new File(uri.getPath()).getName());
        }
        return this.name;
    }

    public int getSize() {
        Uri uri;
        if (this.size == -1 && (uri = this.mUri) != null) {
            this.size = ModelNameProcessor.getSizeOfModel(new File(uri.getPath()).getName());
        }
        return this.size;
    }

    public String getVersion() {
        Uri uri;
        String str = this.version;
        if ((str == null || str.isEmpty()) && (uri = this.mUri) != null) {
            this.version = getVersionOfModel(uri.getPath());
        }
        return this.version;
    }

    public LocalModelInfo() {
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LocalModelInfo{name=");
        LIZ.append(getName());
        LIZ.append('\'');
        LIZ.append(",version=");
        LIZ.append(getVersion());
        LIZ.append('\'');
        LIZ.append(",size=");
        LIZ.append(getSize());
        LIZ.append('\'');
        LIZ.append(",md5=");
        LIZ.append(getMD5());
        LIZ.append('\'');
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public Uri getUri() {
        return this.mUri;
    }

    public boolean isBuilt() {
        return this.mIsBuilt;
    }

    public LocalModelInfo(Uri uri) {
        this.mUri = uri;
    }

    public static LocalModelInfo fromFile(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("file://");
        LIZ.append(str);
        return new LocalModelInfo(UriProtector.parse(X1D.LIZIZ(LIZ)));
    }

    public static String getVersionOfModel(String str) {
        int lastIndexOf;
        if (str == null) {
            return "1.0";
        }
        str.lastIndexOf("/");
        int lastIndexOf2 = str.lastIndexOf("_v");
        if (str.contains("size")) {
            lastIndexOf = str.lastIndexOf("_size");
        } else {
            lastIndexOf = str.lastIndexOf("_model");
        }
        if (lastIndexOf2 <= 0) {
            return "1.0";
        }
        return str.substring(lastIndexOf2 + 2, lastIndexOf).replace('_', '.');
    }

    public void setBuilt(boolean z) {
        this.mIsBuilt = z;
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setSize(int i) {
        this.size = i;
    }

    public void setVersion(String str) {
        this.version = str;
    }
}
