package X;

import java.io.File;
import org.json.JSONObject;

/* renamed from: X.PJe, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64242PJe implements InterfaceC64239PJb {
    public final /* synthetic */ File LIZ;
    public final /* synthetic */ long LIZIZ;

    @Override // X.InterfaceC64239PJb
    public final boolean LIZ(JSONObject jSONObject) {
        C63986P9i.LJIIJ("ensure_zip", PK0.LJIIIIZZ.getExceptionZipUploadUrl(), jSONObject.toString(), null, new PK7(this.LIZ, true), new PK7(PJ7.LIZIZ(), false), C64263PJz.LJ(this.LIZIZ));
        return true;
    }

    public C64242PJe(File file, long j) {
        this.LIZ = file;
        this.LIZIZ = j;
    }
}
