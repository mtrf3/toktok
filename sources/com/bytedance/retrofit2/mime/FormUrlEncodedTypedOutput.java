package com.bytedance.retrofit2.mime;

import android.util.Pair;
import com.bytedance.frameworks.encryptor.EncryptorUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;

/* loaded from: classes7.dex */
public final class FormUrlEncodedTypedOutput extends AbsTypedOutput {
    public ByteArrayOutputStream content = new ByteArrayOutputStream();

    @Override // com.bytedance.retrofit2.mime.AbsTypedOutput, com.bytedance.retrofit2.mime.TypedOutput
    public String fileName() {
        return null;
    }

    @Override // com.bytedance.retrofit2.mime.AbsTypedOutput, com.bytedance.retrofit2.mime.TypedOutput
    public String mimeType() {
        return "application/x-www-form-urlencoded; charset=UTF-8";
    }

    @Override // com.bytedance.retrofit2.mime.AbsTypedOutput
    public boolean interceptRequestBody() {
        byte[] LIZ;
        byte[] byteArray = this.content.toByteArray();
        if (byteArray == null || byteArray.length > 102400 || (LIZ = EncryptorUtil.LIZ(byteArray.length, byteArray)) == null) {
            return false;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(LIZ.length);
        this.content = byteArrayOutputStream;
        byteArrayOutputStream.write(LIZ, 0, LIZ.length);
        this.mIsBodyEncrypted = true;
        return true;
    }

    @Override // com.bytedance.retrofit2.mime.AbsTypedOutput, com.bytedance.retrofit2.mime.TypedOutput
    public long length() {
        return this.content.size();
    }

    @Override // com.bytedance.retrofit2.mime.AbsTypedOutput, com.bytedance.retrofit2.mime.TypedOutput
    public String md5Stub() {
        return DigestUtil.md5Hex(this.content.toByteArray());
    }

    @Override // com.bytedance.retrofit2.mime.AbsTypedOutput, com.bytedance.retrofit2.mime.TypedOutput
    public void writeTo(OutputStream outputStream) {
        outputStream.write(this.content.toByteArray());
    }

    public void addField(String str, String str2) {
        addField(str, true, str2, true);
    }

    @Override // com.bytedance.retrofit2.mime.AbsTypedOutput
    public String compressRequestBody(String str, boolean z) {
        Pair<byte[], String> compressBody;
        byte[] byteArray = this.content.toByteArray();
        if (byteArray == null || (compressBody = TTRequestCompressManager.compressBody(byteArray, byteArray.length, str, z)) == null || compressBody.first == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(((byte[]) compressBody.first).length);
        this.content = byteArrayOutputStream;
        Object obj = compressBody.first;
        byteArrayOutputStream.write((byte[]) obj, 0, ((byte[]) obj).length);
        this.mType = (String) compressBody.second;
        return this.mType;
    }

    public void addField(String str, boolean z, String str2, boolean z2) {
        if (str != null) {
            if (str2 != null) {
                if (this.content.size() > 0) {
                    this.content.write(38);
                }
                if (z) {
                    try {
                        str = URLEncoder.encode(str, "UTF-8");
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
                if (z2) {
                    str2 = URLEncoder.encode(str2, "UTF-8");
                }
                this.content.write(str.getBytes("UTF-8"));
                this.content.write(61);
                this.content.write(str2.getBytes("UTF-8"));
                return;
            }
            throw new NullPointerException("value");
        }
        throw new NullPointerException("name");
    }
}
