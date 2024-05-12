package X;

import com.bytedance.retrofit2.mime.TypedInput;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.PZi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64662PZi implements TypedInput {
    public final /* synthetic */ PVM LIZ;
    public final /* synthetic */ java.util.Map LIZIZ;
    public final /* synthetic */ boolean LIZJ;
    public final /* synthetic */ C64661PZh LIZLLL;

    @Override // com.bytedance.retrofit2.mime.TypedInput
    public final InputStream in() {
        try {
            return new C64663PZj(C64718Pac.LIZIZ(this.LIZ.byteStream(), this.LIZIZ, this.LIZJ, this.LIZLLL.LJLJLLL), this.LIZLLL);
        } catch (Throwable th) {
            C64598PWw c64598PWw = this.LIZLLL.LJLJL;
            if (c64598PWw != null) {
                String str = c64598PWw.LJLJJI;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("reason = ");
                if (str == null) {
                    str = "";
                }
                throw new C64802Pby(this.LIZLLL.LJLJL.LJLJI, C61328O5c.LIZLLL(LIZ, str, "  exception = ", th, LIZ));
            }
            throw new IOException(th);
        }
    }

    @Override // com.bytedance.retrofit2.mime.TypedInput
    public final long length() {
        return this.LIZ.contentLength();
    }

    @Override // com.bytedance.retrofit2.mime.TypedInput
    public final String mimeType() {
        C39745Fin contentType = this.LIZ.contentType();
        if (contentType == null) {
            return null;
        }
        return contentType.LIZ;
    }

    public C64662PZi(C64661PZh c64661PZh, PVM pvm, java.util.Map map, boolean z) {
        this.LIZLLL = c64661PZh;
        this.LIZ = pvm;
        this.LIZIZ = map;
        this.LIZJ = z;
    }
}
