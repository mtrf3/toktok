package X;

import com.bytedance.retrofit2.mime.TypedFile;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.io.OutputStream;
import java.util.Map;

/* renamed from: X.EaX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36685EaX implements TypedOutput {
    public final TypedFile LIZ;
    public final java.util.Map<String, String> LIZIZ;

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public final String fileName() {
        StringBuilder sb = new StringBuilder(this.LIZ.fileName());
        sb.append("\"");
        for (Map.Entry<String, String> entry : this.LIZIZ.entrySet()) {
            YE1.LIZLLL(sb, "; ", entry.getKey(), "=\"", entry.getValue());
            sb.append("\"");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public final long length() {
        return this.LIZ.length();
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public final String md5Stub() {
        return this.LIZ.md5Stub();
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public final String mimeType() {
        return this.LIZ.mimeType();
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public final void writeTo(OutputStream outputStream) {
        this.LIZ.writeTo(outputStream);
    }

    public C36685EaX(java.util.Map<String, String> map, TypedFile typedFile) {
        this.LIZIZ = map;
        this.LIZ = typedFile;
    }
}
