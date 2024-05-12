package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.ODy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61558ODy {
    public static C61548ODo LIZ(List list) {
        return new C61548ODo(Collections.unmodifiableList(new ArrayList(list)), 0, new C61580OEu(), null);
    }

    public static C61548ODo LIZIZ(List list, C61548ODo c61548ODo, AbstractC61551ODr abstractC61551ODr) {
        if (list != null) {
            InterfaceC61582OEw interfaceC61582OEw = c61548ODo.LJLIL;
            if (interfaceC61582OEw == null) {
                interfaceC61582OEw = new C61580OEu();
            }
            C61548ODo c61548ODo2 = new C61548ODo(Collections.unmodifiableList(new ArrayList(list)), 0, interfaceC61582OEw, abstractC61551ODr);
            c61548ODo2.LJLJJL = c61548ODo.LJLJJL;
            return c61548ODo2;
        }
        throw new IllegalArgumentException("interceptors == null !");
    }
}
