package X;

import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Q2b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66345Q2b extends Q2V {
    public C66345Q2b() {
        super("==", LiveChatShowDelayForHotLiveSetting.DEFAULT, 2);
    }

    @Override // X.Q2V
    public final Object LIZ(List<? extends Object> list) {
        boolean z = false;
        LIZJ(list, false);
        if (o.LJ(LIZIZ(list), "param_type_double")) {
            Object obj = ListProtector.get(list, 0);
            if (obj != null) {
                double doubleValue = ((Number) obj).doubleValue();
                Object obj2 = ListProtector.get(list, 1);
                if (obj2 != null) {
                    if (doubleValue == ((Number) obj2).doubleValue()) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
                throw new C37692Eqm("null cannot be cast to non-null type kotlin.Number");
            }
            throw new C37692Eqm("null cannot be cast to non-null type kotlin.Number");
        }
        return Boolean.valueOf(o.LJ(String.valueOf(ListProtector.get(list, 0)), String.valueOf(ListProtector.get(list, 1))));
    }
}
