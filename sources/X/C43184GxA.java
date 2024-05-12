package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.GxA, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43184GxA extends AbstractC43178Gx4 {
    @Override // X.AbstractC43178Gx4
    public final String LIZJ() {
        return "abnor_im";
    }

    @Override // X.AbstractC43178Gx4
    public final long LIZLLL() {
        return TimeUnit.HOURS.toMillis(2L);
    }

    @Override // X.AbstractC43178Gx4
    public final String LIZIZ() {
        long currentTimeMillis = System.currentTimeMillis() - LIZLLL();
        C43176Gx2.LIZ.getClass();
        List LJ = C43176Gx2.LJ(currentTimeMillis, "message_send_fail");
        List LJ2 = C43176Gx2.LJ(currentTimeMillis, "message_self_visiable");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(LJ);
        arrayList.addAll(LJ2);
        StringBuilder sb = new StringBuilder("[");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append(((C43189GxF) ListProtector.get(arrayList, i)).LIZLLL);
            if (i != arrayList.size() - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        String LIZLLL = IMService.createIIMServicebyMonsterPlugin(false).getPerformanceService().LIZLLL();
        if (C78685UuP.LJJJZ(LIZLLL)) {
            C1DI.LIZIZ(sb, "\n[", LIZLLL, "]");
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "result.toString()");
        return sb2;
    }

    @Override // X.AbstractC43178Gx4
    public final boolean LIZ(String type) {
        o.LJIIIZ(type, "type");
        if (o.LJ(type, "message_send_fail")) {
            return true;
        }
        return o.LJ(type, "message_self_visiable");
    }
}
