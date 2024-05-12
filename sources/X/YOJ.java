package X;

import java.util.Iterator;

/* loaded from: classes16.dex */
public final class YOJ implements InterfaceC134025Nu {
    public final /* synthetic */ YO7 LIZ;

    public YOJ(YO7 yo7) {
        this.LIZ = yo7;
    }

    @Override // X.InterfaceC134025Nu
    public final void LIZ() {
        Iterator<InterfaceC134025Nu> it = this.LIZ.LJI.iterator();
        while (it.hasNext()) {
            it.next().LIZ();
        }
    }
}
