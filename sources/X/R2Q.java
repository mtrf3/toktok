package X;

import com.bytedance.retrofit2.mime.TypedInput;
import java.io.InputStream;

/* loaded from: classes12.dex */
public final class R2Q implements TypedInput {
    public final /* synthetic */ InputStream LIZ;

    @Override // com.bytedance.retrofit2.mime.TypedInput
    public final String mimeType() {
        return "application/json";
    }

    @Override // com.bytedance.retrofit2.mime.TypedInput
    public final long length() {
        return this.LIZ.available();
    }

    @Override // com.bytedance.retrofit2.mime.TypedInput
    public final InputStream in() {
        return this.LIZ;
    }

    public R2Q(InputStream inputStream) {
        this.LIZ = inputStream;
    }
}
