package X;

import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.aigc.AIGCQuota;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ST7 {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C246569m0.LJLIL);

    public static C244459ib LIZ(ST8 aigcTaskProcess) {
        ST9 st9;
        int i;
        List<String> list;
        List<AIGCQuota> list2;
        String str;
        o.LJIIIZ(aigcTaskProcess, "aigcTaskProcess");
        STF stf = aigcTaskProcess.LIZ;
        o.LJIIIZ(stf, "<this>");
        int i2 = STJ.LIZ[stf.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            st9 = ST9.IDLE;
                        } else {
                            throw new C162476Zf();
                        }
                    } else {
                        st9 = ST9.FAILED;
                    }
                } else {
                    st9 = ST9.SUCCESSFUL;
                }
            } else {
                st9 = ST9.IN_QUEUE;
            }
        } else {
            st9 = ST9.GENERATING;
        }
        Integer num = aigcTaskProcess.LJFF;
        int i3 = 0;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        C72121SSf c72121SSf = new C72121SSf();
        ST6 st6 = aigcTaskProcess.LJI;
        OPL opl = null;
        if (st6 != null) {
            list = st6.LIZ;
        } else {
            list = null;
        }
        c72121SSf.setAvatarUris(list);
        ST6 st62 = aigcTaskProcess.LJI;
        if (st62 != null) {
            list2 = st62.LIZIZ;
        } else {
            list2 = null;
        }
        c72121SSf.setRemainingQuota(list2);
        ST6 st63 = aigcTaskProcess.LJI;
        if (st63 != null) {
            str = st63.LIZJ;
        } else {
            str = null;
        }
        c72121SSf.setTaskId(str);
        String str2 = aigcTaskProcess.LJII;
        if (str2 != null) {
            opl = c72121SSf.getPathMode(str2);
        }
        c72121SSf.setPathMode(opl);
        Integer num2 = aigcTaskProcess.LJIIIIZZ;
        if (num2 != null && (i3 = num2.intValue()) > 40) {
            i3 = 40;
        }
        return new C244459ib(st9, i, c72121SSf, i3);
    }

    public static void LIZIZ(TuxIconView tuxIconView, int i, Integer num) {
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = i;
        if (num != null) {
            c2068389v.LJ = Integer.valueOf(num.intValue());
        }
        tuxIconView.setTuxIcon(c2068389v);
    }
}
