package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AG5 {
    public static final void LIZ(C25851ACp unitManager, List<String> showedList) {
        o.LJIIIZ(unitManager, "unitManager");
        o.LJIIIZ(showedList, "showedList");
        List<AG6<?>> LIZIZ = unitManager.LIZIZ();
        int size = LIZIZ.size();
        for (int i = 0; i < size; i++) {
            AG6 ag6 = (AG6) ListProtector.get(LIZIZ, i);
            Object LIZ = ag6.LJFF().LIZ();
            if (LIZ == null) {
                ag6.LJIIIZ(false);
            } else if (LIZ instanceof String) {
                if (!TextUtils.isEmpty((CharSequence) LIZ) && !showedList.contains(LIZ)) {
                    ag6.LJIIIZ(false);
                }
            } else if (LIZ instanceof C85946XoE) {
                String str = ((C85946XoE) LIZ).LIZ;
                if (!TextUtils.isEmpty(str) && !showedList.contains(str)) {
                    ag6.LJIIIZ(false);
                }
            }
        }
    }
}
