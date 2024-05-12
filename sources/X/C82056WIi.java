package X;

import java.util.LinkedList;
import kotlin.jvm.internal.o;

/* renamed from: X.WIi, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82056WIi {
    public final LinkedList<C81975WFf> LIZ = new LinkedList<>();

    public final void LIZ(C81975WFf item, InterfaceC65784Pro predict) {
        o.LJIIIZ(item, "item");
        o.LJIIIZ(predict, "predict");
        if (!((Boolean) predict.invoke()).booleanValue()) {
            return;
        }
        this.LIZ.addLast(item);
    }
}
