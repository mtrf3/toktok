package X;

import android.view.View;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes11.dex */
public final class OCV {
    public final ConcurrentHashMap<String, WeakReference<View>> LIZ = new ConcurrentHashMap<>();
    public final WeakHashMap<LynxUI, C79713VQf> LIZIZ = new WeakHashMap<>();
    public final WeakHashMap<LynxUI, C79713VQf> LIZJ = new WeakHashMap<>();
    public final WeakHashMap<LynxUI, C79713VQf> LIZLLL = new WeakHashMap<>();
    public final WeakHashMap<LynxUI, C79713VQf> LJ = new WeakHashMap<>();
    public final WeakHashMap<LynxUI, String> LJFF = new WeakHashMap<>();
    public volatile boolean LJI = true;

    public final void LIZIZ(VNS vns) {
        for (LynxUI lynxUI : this.LIZLLL.keySet()) {
            if (lynxUI.mContext.LJLJLLL.LJLIL == vns) {
                lynxUI.execResumeAnim();
            }
        }
    }

    public static void LIZ(java.util.Map map, VNS vns) {
        Iterator it = ((WeakHashMap) map).entrySet().iterator();
        while (it.hasNext()) {
            LynxBaseUI lynxBaseUI = (LynxBaseUI) ((Map.Entry) it.next()).getKey();
            if (lynxBaseUI != null && lynxBaseUI.mContext.LJLJLLL.LJLIL == vns) {
                it.remove();
            }
        }
    }
}
