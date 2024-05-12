package X;

import com.google.gson.internal.h;
import com.ss.android.ugc.aweme.dsp.common.model.MusicPlayInfo;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.Zpx, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91149Zpx {
    public static String LIZ(InterfaceC91296ZsK interfaceC91296ZsK) {
        if (interfaceC91296ZsK == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("invalid preload cache key, dataSource:");
            LIZ.append((String) null);
            X1D.LIZIZ(LIZ);
            return "";
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("id = ");
        LIZ2.append(interfaceC91296ZsK.getId());
        LIZ2.append(", playUri = ");
        LIZ2.append(interfaceC91296ZsK.LJIILJJIL());
        X1D.LIZIZ(LIZ2);
        if (!C78857UxB.LJJJIL(interfaceC91296ZsK.getId())) {
            return "";
        }
        String id = interfaceC91296ZsK.getId();
        String LJIILJJIL = interfaceC91296ZsK.LJIILJJIL();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(id);
        LIZ3.append('_');
        LIZ3.append(h.LJIIIIZZ(LJIILJJIL));
        return X1D.LIZIZ(LIZ3);
    }

    public static String LIZJ(Long l) {
        String str;
        if (l != null) {
            float longValue = (float) l.longValue();
            if (longValue > 1048576.0f) {
                StringBuilder LIZ = X1D.LIZ();
                String LLLZ = C16880lQ.LLLZ("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(longValue / 1048576.0f)}, 1));
                o.LJIIIIZZ(LLLZ, "format(format, *args)");
                LIZ.append(LLLZ);
                LIZ.append("MB");
                str = X1D.LIZIZ(LIZ);
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                String LLLZ2 = C16880lQ.LLLZ("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(longValue / 1024.0f)}, 1));
                o.LJIIIIZZ(LLLZ2, "format(format, *args)");
                LIZ2.append(LLLZ2);
                LIZ2.append("KB");
                str = X1D.LIZIZ(LIZ2);
            }
        } else {
            str = null;
        }
        return String.valueOf(str);
    }

    public static void LIZIZ(MusicPlayInfo playInfo, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(playInfo, "playInfo");
        C47164IfA LIZJ = C91257Zrh.LIZJ(playInfo.getVideoModel());
        if (LIZJ == null) {
            return;
        }
        C47398Iiw c47398Iiw = new C47398Iiw(LIZJ, EnumC47176IfM.Auto, 819200L, 0L);
        c47398Iiw.LJIIJ = new C91364ZtQ(playInfo, interfaceC88472Yns);
        C91150Zpy.LIZ = System.currentTimeMillis();
        C47148Ieu.LIZ.LJIIZILJ(c47398Iiw);
    }
}
