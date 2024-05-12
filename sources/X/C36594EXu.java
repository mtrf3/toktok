package X;

import android.content.ComponentName;
import android.content.Intent;
import com.ss.android.ugc.aweme.childhook.MajorComponentsAllowList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.EXu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36594EXu implements F61 {
    @Override // X.F61
    public final boolean LIZ(Intent intent) {
        List<String> list;
        String str;
        o.LJIIIZ(intent, "intent");
        MajorComponentsAllowList majorComponentsAllowList = C36945Eej.LIZ;
        if (majorComponentsAllowList == null || (list = majorComponentsAllowList.activities) == null) {
            list = C61878OQg.INSTANCE;
        }
        if (!list.isEmpty()) {
            for (String str2 : list) {
                ComponentName component = intent.getComponent();
                if (component == null || (str = component.getClassName()) == null) {
                    str = "";
                }
                if (C38354F3m.LIZJ(str2, str)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // X.F61
    public final boolean LIZIZ(Intent intent) {
        o.LJIIIZ(intent, "intent");
        if (intent.getComponent() != null) {
            return true;
        }
        return false;
    }
}
