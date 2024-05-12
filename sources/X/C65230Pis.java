package X;

import com.bytedance.retrofit2.mime.TypedOutput;
import java.io.OutputStream;

/* renamed from: X.Pis, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65230Pis implements TypedOutput {
    public final /* synthetic */ byte[] LIZ;

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public final String fileName() {
        return null;
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public final String md5Stub() {
        return null;
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public final String mimeType() {
        return null;
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public final long length() {
        return this.LIZ.length;
    }

    public C65230Pis(byte[] bArr) {
        this.LIZ = bArr;
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public final void writeTo(OutputStream outputStream) {
        outputStream.write(this.LIZ);
    }
}
