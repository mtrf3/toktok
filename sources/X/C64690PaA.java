package X;

import com.bytedance.retrofit2.mime.TypedInput;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* renamed from: X.PaA, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64690PaA implements TypedInput {
    public final /* synthetic */ HttpURLConnection LIZ;
    public final /* synthetic */ C64692PaC LIZIZ;

    @Override // com.bytedance.retrofit2.mime.TypedInput
    public final InputStream in() {
        InputStream errorStream;
        try {
            errorStream = C64718Pac.LIZIZ(this.LIZ.getInputStream(), this.LIZ.getHeaderFields(), false, this.LIZIZ.LJLIL);
        } catch (Exception e) {
            if (C64693PaD.LJIILJJIL(this.LIZIZ.LJLJLJ)) {
                errorStream = this.LIZ.getErrorStream();
            } else {
                String responseMessage = this.LIZ.getResponseMessage();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("reason = ");
                if (responseMessage == null) {
                    responseMessage = "";
                }
                LIZ.append(responseMessage);
                LIZ.append("  exception = ");
                LIZ.append(e.getMessage());
                throw new C64802Pby(this.LIZ.getResponseCode(), X1D.LIZIZ(LIZ));
            }
        }
        return new C64663PZj(errorStream, this.LIZIZ);
    }

    @Override // com.bytedance.retrofit2.mime.TypedInput
    public final long length() {
        return this.LIZ.getContentLength();
    }

    @Override // com.bytedance.retrofit2.mime.TypedInput
    public final String mimeType() {
        return C64693PaD.LJIIJ("Content-Type", this.LIZ);
    }

    public C64690PaA(C64692PaC c64692PaC, HttpURLConnection httpURLConnection) {
        this.LIZIZ = c64692PaC;
        this.LIZ = httpURLConnection;
    }
}
