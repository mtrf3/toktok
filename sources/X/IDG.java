package X;

import Y.ARunnableS43S0100000_7;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class IDG implements InterfaceC83974WxW {
    public final /* synthetic */ ARunnableS43S0100000_7 LIZ;

    public IDG(ARunnableS43S0100000_7 aRunnableS43S0100000_7) {
        this.LIZ = aRunnableS43S0100000_7;
    }

    @Override // X.InterfaceC83974WxW
    public final void onResult(String[] strArr) {
        ArrayList arrayList;
        AbstractC46244ICy abstractC46244ICy = (AbstractC46244ICy) this.LIZ.l0;
        if (strArr.length == 0) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(ORY.LJJZZIII(strArr));
        }
        abstractC46244ICy.LLIIIILZ = arrayList;
    }
}
