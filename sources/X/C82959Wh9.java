package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Wh9, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82959Wh9 {
    public final /* synthetic */ AbstractC82962WhC LIZ;
    public final /* synthetic */ InterfaceC31943CgF LIZIZ;

    public final void LIZ() {
        AbstractC37780EsC.LJFF(this.LIZ, this.LIZIZ, 0, "getContainerID not implemented in ContainerDepend", 8);
    }

    public C82959Wh9(AbstractC82962WhC abstractC82962WhC, InterfaceC31943CgF interfaceC31943CgF) {
        this.LIZ = abstractC82962WhC;
        this.LIZIZ = interfaceC31943CgF;
    }

    public final void LIZIZ(C79524VIy c79524VIy, String msg) {
        o.LJIIJ(msg, "msg");
        if (c79524VIy.LIZ != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str = c79524VIy.LIZ;
            if (str != null) {
                linkedHashMap.put("containerID", str);
            }
            AbstractC82962WhC abstractC82962WhC = this.LIZ;
            InterfaceC31943CgF interfaceC31943CgF = this.LIZIZ;
            abstractC82962WhC.getClass();
            AbstractC37780EsC.LJI(interfaceC31943CgF, msg, linkedHashMap);
            return;
        }
        AbstractC37780EsC.LJFF(this.LIZ, this.LIZIZ, -5, null, 12);
    }
}
