package X;

import com.ss.android.ugc.aweme.api.model.AnchorCell;
import com.ss.android.ugc.aweme.api.model.AnchorModule;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Gq8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42748Gq8<T> implements InterfaceC31400CUa {
    public static final C42748Gq8<T> LIZ = new C42748Gq8<>();

    @Override // X.InterfaceC31400CUa
    public final int LIZ(Object obj) {
        ArrayList<AnchorCell> arrayList;
        ArrayList<AnchorCell> arrayList2;
        AnchorModule module = (AnchorModule) obj;
        o.LJIIIZ(module, "module");
        Integer num = module.type;
        if (num == null || num.intValue() != 1) {
            Integer num2 = module.type;
            if (num2 == null || num2.intValue() != 2 || (arrayList = module.cells) == null || arrayList.isEmpty()) {
                Integer num3 = module.type;
                if (num3 == null || num3.intValue() != 3 || (arrayList2 = module.cells) == null || arrayList2.isEmpty()) {
                    return 0;
                }
                return 4;
            }
            return 3;
        }
        ArrayList<AnchorCell> arrayList3 = module.cells;
        if (arrayList3 == null || arrayList3.isEmpty()) {
            return 1;
        }
        return 2;
    }
}
