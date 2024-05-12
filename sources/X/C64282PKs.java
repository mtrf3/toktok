package X;

import com.bytedance.crash.entity.Header;
import org.json.JSONException;

/* renamed from: X.PKs, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64282PKs extends PKT {
    @Override // X.PKT
    public final PKN LIZIZ(int i, PKN pkn) {
        PKN LIZIZ = super.LIZIZ(i, pkn);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 5) {
                        Header.LIZ(LIZIZ.LJIIIIZZ());
                    }
                } else {
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

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C64282PKs(android.content.Context r2, X.C64269PKf r3, X.C47949Irp r4, boolean r5) {
        /*
            r1 = this;
            if (r5 == 0) goto L8
            com.bytedance.crash.CrashType r0 = com.bytedance.crash.CrashType.LAUNCH
        L4:
            r1.<init>(r0, r2, r3, r4)
            return
        L8:
            com.bytedance.crash.CrashType r0 = com.bytedance.crash.CrashType.JAVA
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64282PKs.<init>(android.content.Context, X.PKf, X.Irp, boolean):void");
    }
}
