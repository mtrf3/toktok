package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.Un2, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78228Un2 {
    public final C32224Ckm LIZ;
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS163S0100000_13(this, 329));

    public C78228Un2(C32224Ckm c32224Ckm) {
        this.LIZ = c32224Ckm;
    }

    public final List<InterfaceC78233Un7> LIZ(C32449CoP request) {
        o.LJIIIZ(request, "request");
        List list = (List) this.LIZIZ.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            C78230Un4 c78230Un4 = (C78230Un4) obj;
            InterfaceC78233Un7 interfaceC78233Un7 = c78230Un4.LIZIZ;
            if (interfaceC78233Un7 != null && interfaceC78233Un7.support() && c78230Un4.LIZIZ.canRender(request)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC78233Un7 interfaceC78233Un72 = ((C78230Un4) it.next()).LIZIZ;
            if (interfaceC78233Un72 != null) {
                arrayList2.add(interfaceC78233Un72);
            }
        }
        return arrayList2;
    }
}
