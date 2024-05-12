package X;

import android.text.TextUtils;
import com.lynx.tasm.behavior.ui.LynxUI;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes15.dex */
public final class VQZ {
    public final WeakReference<LynxUI> LIZ;
    public C79713VQf[] LIZIZ;
    public HashMap<String, C79714VQg> LIZJ = new HashMap<>();

    public final void LIZ() {
        C79714VQg c79714VQg;
        if (this.LIZIZ != null) {
            if (this.LIZ.get().getHeight() == 0 && this.LIZ.get().getWidth() == 0) {
                return;
            }
            HashMap<String, C79714VQg> hashMap = new HashMap<>();
            for (C79713VQf c79713VQf : this.LIZIZ) {
                if (c79713VQf != null && !TextUtils.isEmpty(c79713VQf.LJLIL)) {
                    HashMap<String, C79714VQg> hashMap2 = this.LIZJ;
                    if (hashMap2 == null || (c79714VQg = hashMap2.get(c79713VQf.LJLIL)) == null) {
                        c79714VQg = new C79714VQg(this.LIZ.get().mView, this.LIZ.get());
                    } else {
                        this.LIZJ.remove(c79713VQf.LJLIL);
                    }
                    hashMap.put(c79713VQf.LJLIL, c79714VQg);
                }
            }
            HashMap<String, C79714VQg> hashMap3 = this.LIZJ;
            if (hashMap3 != null) {
                Iterator<C79714VQg> it = hashMap3.values().iterator();
                while (it.hasNext()) {
                    it.next().LJ();
                }
            }
            for (C79713VQf c79713VQf2 : this.LIZIZ) {
                if (c79713VQf2 != null && !TextUtils.isEmpty(c79713VQf2.LJLIL)) {
                    hashMap.get(c79713VQf2.LJLIL).LIZ(c79713VQf2);
                }
            }
            this.LIZJ = hashMap;
        }
    }

    public VQZ(LynxUI lynxUI) {
        this.LIZ = new WeakReference<>(lynxUI);
    }

    public final void LIZIZ(Object obj, String str) {
        HashMap<String, C79714VQg> hashMap = this.LIZJ;
        if (hashMap == null) {
            return;
        }
        for (C79714VQg c79714VQg : hashMap.values()) {
            if (c79714VQg.LIZLLL.containsKey(str)) {
                c79714VQg.LIZLLL.put(str, obj);
            }
            if (str.equals("BackgroundColor") && c79714VQg.LIZLLL.containsKey("Color")) {
                c79714VQg.LIZLLL.put("Color", obj);
            }
        }
    }
}
