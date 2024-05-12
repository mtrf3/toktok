package X;

import android.content.Context;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.common.jato.logcut.LogCut;
import kotlin.jvm.internal.o;

/* renamed from: X.EFt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36125EFt {
    public static void LIZ(Context context) {
        o.LJIIIZ(context, "context");
        if (JatoXL.isInited()) {
            return;
        }
        boolean z = true;
        if (C34835Dln.LIZ) {
            C78996UzQ.LJLIL = true;
        }
        if (C34835Dln.LIZIZ) {
            C78996UzQ.LJLILLLLZI = true;
        }
        C36126EFu c36126EFu = new C36126EFu();
        c36126EFu.LIZIZ(context);
        c36126EFu.LIZJ(C38995FSd.LIZLLL());
        c36126EFu.LIZLLL(true);
        c36126EFu.LJII(C35214Dru.LIZ);
        c36126EFu.LJ(C34681DjJ.LIZ);
        c36126EFu.LJIIIIZZ(C35214Dru.LJ);
        if (C34837Dlp.LIZ) {
            C34281Dcr.LIZ().LJIIJJI();
        } else {
            z = false;
        }
        c36126EFu.LJIIIZ(z);
        c36126EFu.LJFF(LogCut.LOGCUT_ALL_LOG);
        int LIZ = C35820E4a.LIZ(FKM.LIZ(), -1, "gc_block_max_duration_key");
        if (LIZ >= 0) {
            c36126EFu.LJI(LIZ);
        }
        JatoXL.init(c36126EFu.LIZ());
    }

    public static void LIZIZ(Context context) {
        o.LJIIIZ(context, "context");
        if (JatoXL.isInited()) {
            return;
        }
        C36126EFu c36126EFu = new C36126EFu();
        c36126EFu.LIZIZ(context);
        c36126EFu.LIZJ(C38995FSd.LIZLLL());
        c36126EFu.LIZLLL(false);
        int LIZ = C35820E4a.LIZ(FKM.LIZ(), -1, "gc_block_max_duration_key");
        if (LIZ >= 0) {
            c36126EFu.LJI(LIZ);
        }
        JatoXL.init(c36126EFu.LIZ());
    }
}
