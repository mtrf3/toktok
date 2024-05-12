package com.bytedance.retrofit2.mime;

import X.X1D;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

/* loaded from: classes7.dex */
public final class MultipartTypedOutput implements TypedOutput {
    public final String boundary;
    public final byte[] footer;
    public long length;
    public final List<MimePart> mimeParts;

    /* loaded from: classes7.dex */
    public static final class MimePart {
        public final TypedOutput body;
        public final String boundary;
        public boolean isBuilt;
        public final boolean isFirst;
        public final String name;
        public byte[] partBoundary;
        public byte[] partHeader;
        public final String transferEncoding;

        private void build() {
            if (this.isBuilt) {
                return;
            }
            this.partBoundary = MultipartTypedOutput.buildBoundary(this.boundary, this.isFirst, false);
            this.partHeader = MultipartTypedOutput.buildHeader(this.name, this.transferEncoding, this.body);
            this.isBuilt = true;
        }

        public long size() {
            build();
            if (this.body.length() <= -1) {
                return -1L;
            }
            return this.body.length() + this.partBoundary.length + this.partHeader.length;
        }

        public void writeTo(OutputStream outputStream) {
            build();
            outputStream.write(this.partBoundary);
            outputStream.write(this.partHeader);
            this.body.writeTo(outputStream);
        }

        public MimePart(String str, String str2, TypedOutput typedOutput, String str3, boolean z) {
            this.name = str;
            this.transferEncoding = str2;
            this.body = typedOutput;
            this.isFirst = z;
            this.boundary = str3;
        }
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public String fileName() {
        return null;
    }

    public int getPartCount() {
        return this.mimeParts.size();
    }

    public List<byte[]> getParts() {
        ArrayList arrayList = new ArrayList(this.mimeParts.size());
        for (MimePart mimePart : this.mimeParts) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            mimePart.writeTo(byteArrayOutputStream);
            arrayList.add(byteArrayOutputStream.toByteArray());
        }
        return arrayList;
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public String md5Stub() {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayInputStream byteArrayInputStream;
        if (this.length == -1) {
            return null;
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                writeTo(byteArrayOutputStream);
                byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            } catch (Throwable unused) {
                byteArrayInputStream = null;
            }
        } catch (Throwable unused2) {
            byteArrayOutputStream = null;
            byteArrayInputStream = null;
        }
        try {
            String md5Hex = DigestUtil.md5Hex(byteArrayInputStream);
            try {
                byteArrayOutputStream.close();
            } catch (Throwable unused3) {
            }
            try {
                byteArrayInputStream.close();
            } catch (Throwable unused4) {
            }
            return md5Hex;
        } catch (Throwable unused5) {
            if (byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable unused6) {
                }
            }
            if (byteArrayInputStream != null) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable unused7) {
                }
            }
            return null;
        }
    }

    public MultipartTypedOutput() {
        this(UUID.randomUUID().toString());
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public String mimeType() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("multipart/form-data; boundary=");
        LIZ.append(this.boundary);
        return X1D.LIZIZ(LIZ);
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public long length() {
        return this.length;
    }

    public MultipartTypedOutput(String str) {
        this.mimeParts = new LinkedList();
        this.boundary = str;
        this.footer = buildBoundary(str, false, true);
        this.length = r0.length;
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public void writeTo(OutputStream outputStream) {
        Iterator<MimePart> it = this.mimeParts.iterator();
        while (it.hasNext()) {
            it.next().writeTo(outputStream);
        }
        outputStream.write(this.footer);
    }

    public void addPart(String str, TypedOutput typedOutput) {
        addPart(str, "binary", typedOutput);
    }

    public static byte[] buildBoundary(String str, boolean z, boolean z2) {
        try {
            StringBuilder sb = new StringBuilder(str.length() + 8);
            if (!z) {
                sb.append("\r\n");
            }
            sb.append("--");
            sb.append(str);
            if (z2) {
                sb.append("--");
            }
            sb.append("\r\n");
            return sb.toString().getBytes("UTF-8");
        } catch (IOException e) {
            throw new RuntimeException("Unable to write multipart boundary", e);
        }
    }

    public static byte[] buildHeader(String str, String str2, TypedOutput typedOutput) {
        try {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Content-Disposition: form-data; name=\"");
            sb.append(str);
            String fileName = typedOutput.fileName();
            if (fileName != null) {
                sb.append("\"; filename=\"");
                sb.append(fileName);
            }
            sb.append("\"\r\nContent-Type: ");
            sb.append(typedOutput.mimeType());
            long length = typedOutput.length();
            if (length != -1) {
                sb.append("\r\nContent-Length: ");
                sb.append(length);
            }
            sb.append("\r\nContent-Transfer-Encoding: ");
            sb.append(str2);
            sb.append("\r\n\r\n");
            return sb.toString().getBytes("UTF-8");
        } catch (IOException e) {
            throw new RuntimeException("Unable to write multipart header", e);
        }
    }

    public void addPart(String str, String str2, TypedOutput typedOutput) {
        if (str != null) {
            if (str2 != null) {
                if (typedOutput != null) {
                    MimePart mimePart = new MimePart(str, str2, typedOutput, this.boundary, this.mimeParts.isEmpty());
                    this.mimeParts.add(mimePart);
                    long size = mimePart.size();
                    if (size == -1) {
                        this.length = -1L;
                        return;
                    }
                    long j = this.length;
                    if (j == -1) {
                        return;
                    }
                    this.length = j + size;
                    return;
                }
                throw new NullPointerException("Part body must not be null.");
            }
            throw new NullPointerException("Transfer encoding must not be null.");
        }
        throw new NullPointerException("Part name must not be null.");
    }
}
