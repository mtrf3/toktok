package X;

import android.content.Context;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.entity.Header;
import org.json.JSONException;

/* renamed from: X.PKr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64281PKr extends PKT {
    @Override // X.PKT
    public final PKN LIZ(PKN pkn) {
        Header LIZJ = Header.LIZJ();
        Header.addRuntimeHeader(LIZJ.LIZ);
        Header.LIZ(LIZJ);
        LIZJ.LJ();
        LIZJ.LJIIJ();
        try {
            C64257PJt LIZIZ = PK0.LIZIZ();
            LIZIZ.getClass();
            try {
                long userId = LIZIZ.LIZIZ.getUserId();
                if (userId > 0) {
                    LIZJ.LIZ.put("user_id", userId);
                }
            } catch (Throwable unused) {
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        pkn.LJIIZILJ(LIZJ);
        pkn.LJIIJJI("process_name", C64264PKa.LIZJ(this.LIZIZ));
        C78915Uy7.LJJIIJ(pkn, LIZJ, this.LIZ);
        return pkn;
    }

    public C64281PKr(CrashType crashType, Context context, C64269PKf c64269PKf, C47949Irp c47949Irp) {
        super(crashType, context, c64269PKf, c47949Irp);
    }
}
