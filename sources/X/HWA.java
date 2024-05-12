package X;

import android.os.Bundle;
import com.bytedance.ies.sdk.widgets.DataCenter;
import java.lang.ref.Reference;
import java.util.LinkedHashMap;

/* loaded from: classes8.dex */
public final /* synthetic */ class HWA implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;

    @Override // java.lang.Runnable
    public final void run() {
        HWB hwb;
        switch (this.LJLIL) {
            case 0:
                ((DataCenter) this.LJLILLLLZI).lambda$put$0((Bundle) this.LJLJI);
                return;
            default:
                Object obj = this.LJLILLLLZI;
                HW9 hw9 = (HW9) this.LJLJI;
                Reference reference = (Reference) ((LinkedHashMap) HWC.LIZIZ).get(obj);
                if (reference == null || (hwb = (HWB) reference.get()) == null) {
                    HWC.LIZIZ.remove(obj);
                    return;
                } else {
                    if (hw9 == null) {
                        return;
                    }
                    hwb.LIZIZ = hw9;
                    if (!hwb.LIZJ) {
                        return;
                    }
                    hw9.cancel();
                    return;
                }
        }
    }

    public /* synthetic */ HWA(int i, Object obj, Object obj2) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
        this.LJLJI = obj2;
    }
}
