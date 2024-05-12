package X;

import com.bytedance.pipo.ocr.bean.PipoOcrResult;
import ij2.a;
import yi2.b;

/* renamed from: X.Y5i, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86814Y5i implements b {
    public final /* synthetic */ b LIZ;

    public C86814Y5i(b bVar) {
        this.LIZ = bVar;
    }

    @Override // yi2.b
    public final void LIZ(int i, int i2, String str, PipoOcrResult pipoOcrResult, String str2) {
        String str3;
        if (a.LJIILLIIL) {
            if (i != -1) {
                str3 = "pitaya";
            } else {
                str3 = "server";
            }
            a.LJIILJJIL = str3;
            a.LJIILLIIL = false;
        }
        if (i == 1) {
            a.LJIILL = "pitaya";
        }
        this.LIZ.LIZ(i, i2, str, pipoOcrResult, str2);
    }
}
