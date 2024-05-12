package X;

import com.ss.android.ugc.aweme.legoImp.task.pumbaa.TTPSystemAPIInit;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OHX implements OHY {
    public final /* synthetic */ TTPSystemAPIInit LIZ;

    public OHX(TTPSystemAPIInit tTPSystemAPIInit) {
        this.LIZ = tTPSystemAPIInit;
    }

    @Override // X.OHY
    public final boolean LIZ(OHW context) {
        List<String> list;
        List<String> list2;
        o.LJIIIZ(context, "context");
        Object LIZ = context.LIZ("isPreCheck");
        if (!(LIZ instanceof Boolean)) {
            LIZ = null;
        }
        if (o.LJ(LIZ, Boolean.TRUE)) {
            return false;
        }
        Integer num = context.LJ;
        int type = EnumC39200Fa0.DIRECT_AUTH.getType();
        if (num != null && num.intValue() == type && !o.LJ(context.LIZ("sdkName"), "LiveCore")) {
            return false;
        }
        for (C58708N2i c58708N2i : this.LIZ.LIZ) {
            c58708N2i.getClass();
            String[] strArr = context.LIZLLL;
            if (strArr != null && ORY.LJJIJIIJIL(c58708N2i.LIZ, strArr) && ((list = c58708N2i.LIZIZ) == null || list.isEmpty() || ((list2 = c58708N2i.LIZIZ) != null && ORZ.LJLJJI(context.LIZJ, list2)))) {
                return true;
            }
        }
        return false;
    }
}
