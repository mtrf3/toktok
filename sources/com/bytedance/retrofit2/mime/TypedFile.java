package com.bytedance.retrofit2.mime;

import X.X1D;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes7.dex */
public class TypedFile implements TypedInput, TypedOutput {
    public final File file;
    public final String mimeType;

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public String md5Stub() {
        return null;
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public String fileName() {
        return this.file.getName();
    }

    public int hashCode() {
        return this.file.hashCode();
    }

    @Override // com.bytedance.retrofit2.mime.TypedInput
    public InputStream in() {
        return new FileInputStream(this.file);
    }

    @Override // com.bytedance.retrofit2.mime.TypedInput
    public long length() {
        return this.file.length();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.file.getAbsolutePath());
        LIZ.append(" (");
        LIZ.append(mimeType());
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    public File file() {
        return this.file;
    }

    @Override // com.bytedance.retrofit2.mime.TypedInput
    public String mimeType() {
        return this.mimeType;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TypedFile) {
            return this.file.equals(((TypedFile) obj).file);
        }
        return false;
    }

    public void moveTo(TypedFile typedFile) {
        if (mimeType().equals(typedFile.mimeType())) {
            if (this.file.renameTo(typedFile.file())) {
                return;
            } else {
                throw new IOException("Rename failed!");
            }
        }
        throw new IOException("Type mismatch.");
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public void writeTo(OutputStream outputStream) {
        byte[] bArr = new byte[4096];
        FileInputStream fileInputStream = new FileInputStream(this.file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                } else {
                    return;
                }
            } finally {
                fileInputStream.close();
            }
        }
    }

    public TypedFile(String str, File file) {
        str = str == null ? "application/octet-stream" : str;
        if (file != null) {
            this.mimeType = str;
            this.file = file;
            return;
        }
        throw new NullPointerException("file");
    }
}
