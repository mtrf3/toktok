package X;

import com.bytedance.retrofit2.mime.TypedInput;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* renamed from: X.Pa9, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64689Pa9 implements TypedInput {
    public final /* synthetic */ HttpURLConnection LIZ;
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ C64688Pa8 LIZJ;

    @Override // com.bytedance.retrofit2.mime.TypedInput
    public final InputStream in() {
        InputStream errorStream;
        try {
            errorStream = C64718Pac.LIZIZ(this.LIZ.getInputStream(), this.LIZ.getHeaderFields(), this.LIZIZ, this.LIZJ.LJLJL);
        } catch (Exception e) {
            if (C64693PaD.LJIILJJIL(this.LIZJ.LJLILLLLZI)) {
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
        return new C64663PZj(errorStream, this.LIZJ);
    }

    @Override // com.bytedance.retrofit2.mime.TypedInput
    public final long length() {
        return this.LIZ.getContentLength();
    }

    @Override // com.bytedance.retrofit2.mime.TypedInput
    public final String mimeType() {
        return C64693PaD.LJIIJ("Content-Type", this.LIZ);
    }

    public C64689Pa9(C64688Pa8 c64688Pa8, HttpURLConnection httpURLConnection, boolean z) {
        this.LIZJ = c64688Pa8;
        this.LIZ = httpURLConnection;
        this.LIZIZ = z;
    }
}
