package X;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.IGo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46338IGo {
    public final RecyclerView LIZ;

    public C46338IGo(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        this.LIZ = recyclerView;
    }

    public final void LIZ(Integer num, InterfaceC88472Yns<? super InterfaceC46334IGk, C76800UCe> interfaceC88472Yns) {
        InterfaceC49148JQq interfaceC49148JQq;
        InterfaceC46334IGk preload;
        if (num != null) {
            num.intValue();
            Object LJJIZ = this.LIZ.LJJIZ(num.intValue() + 1);
            if ((LJJIZ instanceof InterfaceC49148JQq) && (interfaceC49148JQq = (InterfaceC49148JQq) LJJIZ) != null && (preload = interfaceC49148JQq.getPreload()) != null && preload.LJJZZIII()) {
                interfaceC88472Yns.invoke(preload);
            }
        }
    }
}
