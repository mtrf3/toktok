package com.bytedance.retrofit2.mime;

import java.io.OutputStream;

/* loaded from: classes7.dex */
public abstract class AbsTypedOutput implements TypedOutput {
    public volatile boolean mIsBodyEncrypted;
    public volatile String mType;

    public abstract String compressRequestBody(String str, boolean z);

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public String fileName() {
        return null;
    }

    public abstract boolean interceptRequestBody();

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public long length() {
        return 0L;
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public String md5Stub() {
        return null;
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public String mimeType() {
        return null;
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public void writeTo(OutputStream outputStream) {
    }

    public String bodyCompressType() {
        return this.mType;
    }

    public boolean isBodyEncrypted() {
        return this.mIsBodyEncrypted;
    }
}
