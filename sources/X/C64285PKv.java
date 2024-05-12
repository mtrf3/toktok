package X;

import android.content.Context;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.entity.Header;
import org.json.JSONException;

/* renamed from: X.PKv, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64285PKv extends PKT {
    @Override // X.PKT
    public final void LIZJ() {
    }

    @Override // X.PKT
    public final PKN LIZIZ(int i, PKN pkn) {
        PKN LIZIZ = super.LIZIZ(i, pkn);
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    Header.addRuntimeHeader(LIZIZ.LJIIIIZZ().LIZ);
                }
            } else {
                Header LJIIIIZZ = LIZIZ.LJIIIIZZ();
                LJIIIIZZ.LJIIJ();
                try {
                    C64257PJt LIZIZ2 = PK0.LIZIZ();
                    LIZIZ2.getClass();
                    try {
                        long userId = LIZIZ2.LIZIZ.getUserId();
                        if (userId > 0) {
                            LJIIIIZZ.LIZ.put("user_id", userId);
                        }
                    } catch (Throwable unused) {
                    }
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        } else {
            Header LIZJ = Header.LIZJ();
            LIZJ.LJ();
            LIZIZ.LJIIZILJ(LIZJ);
            C78915Uy7.LJJIIJ(LIZIZ, LIZJ, this.LIZ);
        }
        return LIZIZ;
    }

    public C64285PKv(Context context, C64269PKf c64269PKf, C47949Irp c47949Irp) {
        super(CrashType.NATIVE, context, c64269PKf, c47949Irp);
    }
}
