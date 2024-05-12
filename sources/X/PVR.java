package X;

import com.bytedance.retrofit2.mime.TypedOutput;
import java.io.OutputStream;

/* loaded from: classes12.dex */
public final class PVR implements TypedOutput {
    public final /* synthetic */ PVP LIZ;

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public final String fileName() {
        return null;
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public final String md5Stub() {
        return null;
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public final long length() {
        try {
            return this.LIZ.LIZ();
        } catch (Throwable unused) {
            return -1L;
        }
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public final String mimeType() {
        if (this.LIZ.LIZIZ() != null) {
            return this.LIZ.LIZIZ().LIZ;
        }
        return "";
    }

    public PVR(PVP pvp) {
        this.LIZ = pvp;
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public final void writeTo(OutputStream outputStream) {
        C64535PUl c64535PUl = new C64535PUl(PU7.LIZLLL(outputStream));
        this.LIZ.LJ(c64535PUl);
        c64535PUl.flush();
        c64535PUl.close();
    }
}
