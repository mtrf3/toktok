package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YHL extends YHP {
    @Override // X.YHP
    public final void LIZ(YHN chain, YHM yhm) {
        String sb;
        long j;
        o.LJIIIZ(chain, "chain");
        YHH yhh = chain.LIZ;
        List<String> list = yhh.LJI;
        if (yhh.LJII) {
            if (yhm != null) {
                yhm.LIZ(-1, "Task is cancel.", chain);
                return;
            }
            return;
        }
        YHS.LIZ.getClass();
        o.LJIIIZ(list, "list");
        if (list.isEmpty()) {
            sb = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            for (String str : list) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(str);
                LIZ.append(',');
                sb2.append(X1D.LIZIZ(LIZ));
            }
            if (sb2.length() > 0) {
                sb2.deleteCharAt(sb2.length() - 1);
            }
            sb = sb2.toString();
            o.LJIIIIZZ(sb, "sv.toString()");
        }
        YHK yhk = chain.LIZ.LJ;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("status", "request_success");
        long currentTimeMillis = System.currentTimeMillis();
        YHY yhy = yhk.LJ;
        if (yhy != null) {
            j = yhy.LJLJJI;
        } else {
            j = 0;
        }
        c188727au.LJ(currentTimeMillis - j, "duration");
        c188727au.LJIIIZ("return_item_list", sb);
        YHS.LIZ.getClass();
        YHS.LIZJ(c188727au, yhk);
        if (!list.isEmpty()) {
            LIZIZ(sb, yhk, false);
        } else {
            LIZIZ(sb, yhk, true);
        }
        if (yhm == null) {
            return;
        }
        yhm.LIZIZ(chain);
    }

    public static void LIZIZ(String str, YHK yhk, boolean z) {
        String str2;
        long j;
        if (z) {
            str2 = "request_success_empty";
        } else {
            str2 = "request_success_not_empty";
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("status", str2);
        long currentTimeMillis = System.currentTimeMillis();
        YHY yhy = yhk.LJ;
        if (yhy != null) {
            j = yhy.LJLJJI;
        } else {
            j = 0;
        }
        c188727au.LJ(currentTimeMillis - j, "duration");
        c188727au.LJIIIZ("return_item_list", str);
        YHS.LIZ.getClass();
        YHS.LIZJ(c188727au, yhk);
    }
}
