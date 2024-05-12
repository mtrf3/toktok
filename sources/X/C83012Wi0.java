package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Wi0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83012Wi0 {
    public final /* synthetic */ AbstractC83011Whz LIZ;
    public final /* synthetic */ InterfaceC31943CgF LIZIZ;

    public final void LIZ(String str) {
        AbstractC37780EsC.LJFF(this.LIZ, this.LIZIZ, 0, str, 8);
    }

    public C83012Wi0(AbstractC83011Whz abstractC83011Whz, InterfaceC31943CgF interfaceC31943CgF) {
        this.LIZ = abstractC83011Whz;
        this.LIZIZ = interfaceC31943CgF;
    }

    public final void LIZIZ(C83014Wi2 c83014Wi2, String msg) {
        o.LJIIJ(msg, "msg");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = c83014Wi2.LIZ;
        if (str != null) {
            linkedHashMap.put("socketTaskID", str);
        }
        AbstractC83011Whz abstractC83011Whz = this.LIZ;
        InterfaceC31943CgF interfaceC31943CgF = this.LIZIZ;
        abstractC83011Whz.getClass();
        AbstractC37780EsC.LJI(interfaceC31943CgF, msg, linkedHashMap);
    }
}
