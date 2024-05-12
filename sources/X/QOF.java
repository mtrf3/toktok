package X;

import com.bytedance.retrofit2.mime.TypedOutput;
import java.io.OutputStream;

/* loaded from: classes12.dex */
public final class QOF implements TypedOutput {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ long LIZIZ;
    public final /* synthetic */ byte[] LIZJ;
    public final /* synthetic */ String LIZLLL;

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public final String fileName() {
        return null;
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public final long length() {
        return this.LIZIZ;
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public final String md5Stub() {
        return this.LIZLLL;
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public final String mimeType() {
        return this.LIZ;
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public final void writeTo(OutputStream outputStream) {
        outputStream.write(this.LIZJ);
    }

    public QOF(String str, long j, byte[] bArr, String str2) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = bArr;
        this.LIZLLL = str2;
    }
}
