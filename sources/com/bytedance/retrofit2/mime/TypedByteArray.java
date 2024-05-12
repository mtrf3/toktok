package com.bytedance.retrofit2.mime;

import X.X1D;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.frameworks.encryptor.EncryptorUtil;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

/* loaded from: classes7.dex */
public class TypedByteArray extends AbsTypedOutput implements TypedInput {
    public byte[] bytes;
    public final String fakeFileName;
    public final String mimeType;

    @Override // com.bytedance.retrofit2.mime.AbsTypedOutput, com.bytedance.retrofit2.mime.TypedOutput
    public String fileName() {
        if (TextUtils.isEmpty(this.fakeFileName)) {
            return null;
        }
        return this.fakeFileName;
    }

    public int hashCode() {
        return Arrays.hashCode(this.bytes) + (this.mimeType.hashCode() * 31);
    }

    @Override // com.bytedance.retrofit2.mime.TypedInput
    public InputStream in() {
        return new ByteArrayInputStream(this.bytes);
    }

    @Override // com.bytedance.retrofit2.mime.AbsTypedOutput
    public boolean interceptRequestBody() {
        byte[] LIZ;
        byte[] bArr = this.bytes;
        if (bArr == null || bArr.length > 102400 || (LIZ = EncryptorUtil.LIZ(bArr.length, bArr)) == null) {
            return false;
        }
        this.bytes = LIZ;
        this.mIsBodyEncrypted = true;
        return true;
    }

    @Override // com.bytedance.retrofit2.mime.AbsTypedOutput, com.bytedance.retrofit2.mime.TypedOutput
    public long length() {
        return this.bytes.length;
    }

    @Override // com.bytedance.retrofit2.mime.AbsTypedOutput, com.bytedance.retrofit2.mime.TypedOutput
    public String md5Stub() {
        byte[] bArr = this.bytes;
        if (bArr == null) {
            return null;
        }
        return DigestUtil.md5Hex(bArr);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TypedByteArray[length=");
        LIZ.append(length());
        LIZ.append("]");
        return X1D.LIZIZ(LIZ);
    }

    public byte[] getBytes() {
        return this.bytes;
    }

    @Override // com.bytedance.retrofit2.mime.AbsTypedOutput, com.bytedance.retrofit2.mime.TypedOutput
    public String mimeType() {
        return this.mimeType;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TypedByteArray typedByteArray = (TypedByteArray) obj;
        if (Arrays.equals(this.bytes, typedByteArray.bytes) && this.mimeType.equals(typedByteArray.mimeType)) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.retrofit2.mime.AbsTypedOutput, com.bytedance.retrofit2.mime.TypedOutput
    public void writeTo(OutputStream outputStream) {
        outputStream.write(this.bytes);
    }

    @Override // com.bytedance.retrofit2.mime.AbsTypedOutput
    public String compressRequestBody(String str, boolean z) {
        Pair<byte[], String> compressBody;
        Object obj;
        byte[] bArr = this.bytes;
        if (bArr == null || (compressBody = TTRequestCompressManager.compressBody(bArr, bArr.length, str, z)) == null || (obj = compressBody.first) == null) {
            return null;
        }
        this.bytes = (byte[]) obj;
        this.mType = (String) compressBody.second;
        return this.mType;
    }

    public TypedByteArray(String str, byte[] bArr, String... strArr) {
        String str2;
        if (strArr != null && strArr.length > 0) {
            str2 = strArr[0];
        } else {
            str2 = null;
        }
        if (str == null) {
            if (TextUtils.isEmpty(str2)) {
                str = "application/unknown";
            } else {
                str = "application/octet-stream";
            }
        }
        if (bArr != null) {
            this.mimeType = str;
            this.bytes = bArr;
            this.fakeFileName = str2;
            return;
        }
        throw new NullPointerException("bytes");
    }
}
