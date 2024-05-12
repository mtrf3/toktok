package X;

import android.view.View;
import android.widget.EditText;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.Pxa, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66142Pxa implements InterfaceC66039Pvv {
    public static final C66142Pxa LIZIZ = new C66142Pxa();
    public static final java.util.Set<Integer> LIZ = new LinkedHashSet();

    @Override // X.InterfaceC66039Pvv
    public final int LIZ() {
        return 4;
    }

    @Override // X.InterfaceC66039Pvv
    public final void LIZIZ(C66120PxE event) {
        o.LJIIIZ(event, "event");
        if (event.LJLJI == 104000 && (!event.LLI.getRuleModels().isEmpty())) {
            Object thisOrClass = event.LLI.getThisOrClass();
            if (thisOrClass instanceof EditText) {
                int hashCode = event.LJLLI.hashCode() + ((View) thisOrClass).getId();
                java.util.Set<Integer> set = LIZ;
                if (set.contains(Integer.valueOf(hashCode))) {
                    event.LLI.getRuleModels().clear();
                } else {
                    set.add(Integer.valueOf(hashCode));
                    event.LJLLLL.put("component", Integer.valueOf(hashCode));
                }
            }
        }
    }
}
