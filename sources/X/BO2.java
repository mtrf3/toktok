package X;

import com.bytedance.android.livesdk.model.ItemTab;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BO2 {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(BO7.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(BOA.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(BO9.LJLIL);

    public static java.util.Map LIZ() {
        return (java.util.Map) LIZJ.getValue();
    }

    public static String LIZIZ() {
        List<ItemTab> LIZJ2 = BOX.LJFF().LIZJ();
        if (LIZJ2 != null && ((ArrayList) LIZJ2).size() > 0) {
            String url = ((ItemTab) ListProtector.get(LIZJ2, 0)).getUrl();
            o.LJIIIIZZ(url, "tabs[0].url");
            return url;
        }
        return "";
    }
}
