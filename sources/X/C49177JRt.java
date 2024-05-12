package X;

import com.lynx.tasm.behavior.ui.LynxBaseUI;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.JRt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49177JRt {
    public final LynxBaseUI LIZ;
    public final java.util.Set<String> LIZIZ;

    public C49177JRt(LynxBaseUI lynxUI, java.util.Set<String> eventFilter) {
        o.LJIIIZ(lynxUI, "lynxUI");
        o.LJIIIZ(eventFilter, "eventFilter");
        this.LIZ = lynxUI;
        this.LIZIZ = eventFilter;
    }

    public static void LIZ(C49177JRt c49177JRt, String str, java.util.Map map) {
        LynxBaseUI lynxBaseUI = c49177JRt.LIZ;
        VNL vnl = lynxBaseUI.mContext.LJLJJL;
        C49615Jdb c49615Jdb = new C49615Jdb(lynxBaseUI.getSign(), str);
        for (Map.Entry entry : map.entrySet()) {
            c49615Jdb.LIZJ(entry.getValue(), (String) entry.getKey());
        }
        vnl.LIZIZ(c49615Jdb);
    }
}
