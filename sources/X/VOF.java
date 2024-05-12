package X;

import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import java.lang.ref.WeakReference;

/* loaded from: classes15.dex */
public class VOF {
    public final WeakReference<LynxBaseUI> LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final ReadableMap LJ;

    public final int hashCode() {
        LynxBaseUI lynxBaseUI = this.LIZ.get();
        if (lynxBaseUI != null) {
            return lynxBaseUI.hashCode();
        }
        return 0;
    }

    public VOF(LynxBaseUI lynxBaseUI) {
        this.LIZ = new WeakReference<>(lynxBaseUI);
        this.LIZIZ = lynxBaseUI.mExposureID;
        String str = lynxBaseUI.mExposureScene;
        if (str == null) {
            this.LIZJ = "";
        } else {
            this.LIZJ = str;
        }
        this.LIZLLL = lynxBaseUI.getSign();
        this.LJ = lynxBaseUI.mDataset;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || VOF.class != obj.getClass()) {
            return false;
        }
        VOF vof = (VOF) obj;
        if (this.LIZLLL == vof.LIZLLL && this.LIZJ.equals(vof.LIZJ) && this.LIZIZ.equals(vof.LIZIZ)) {
            return true;
        }
        return false;
    }
}
