package X;

import com.bytedance.retrofit2.mime.TypedInput;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* renamed from: X.PhB, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65125PhB implements TypedInput {
    public final /* synthetic */ C65126PhC LIZ;

    @Override // com.bytedance.retrofit2.mime.TypedInput
    public final InputStream in() {
        return new ByteArrayInputStream(this.LIZ.LJ);
    }

    @Override // com.bytedance.retrofit2.mime.TypedInput
    public final long length() {
        if (this.LIZ.LJ != null) {
            return r0.length;
        }
        return 0L;
    }

    @Override // com.bytedance.retrofit2.mime.TypedInput
    public final String mimeType() {
        return this.LIZ.LIZLLL;
    }

    public C65125PhB(C65126PhC c65126PhC) {
        this.LIZ = c65126PhC;
    }
}
