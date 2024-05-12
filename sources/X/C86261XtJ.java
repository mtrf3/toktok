package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.XtJ, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86261XtJ implements InterfaceC86244Xt2 {
    public final /* synthetic */ AbstractC86269XtR LIZ;
    public final /* synthetic */ InterfaceC31943CgF LIZIZ;

    public C86261XtJ(AbstractC86269XtR abstractC86269XtR, InterfaceC31943CgF interfaceC31943CgF) {
        this.LIZ = abstractC86269XtR;
        this.LIZIZ = interfaceC31943CgF;
    }

    @Override // X.InterfaceC86244Xt2
    public final void LIZ(C86262XtK c86262XtK, String msg) {
        o.LJIIJ(msg, "msg");
        if (c86262XtK.LIZ != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ArrayList arrayList = new ArrayList();
            List<C86260XtI> list = c86262XtK.LIZ;
            if (list != null) {
                Iterator it = ((ArrayList) list).iterator();
                while (it.hasNext()) {
                    C86260XtI c86260XtI = (C86260XtI) it.next();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("tempFilePath", c86260XtI.LIZJ);
                    linkedHashMap2.put("size", Long.valueOf(c86260XtI.LIZLLL));
                    linkedHashMap2.put("mediaType", c86260XtI.LJ);
                    Object obj = c86260XtI.LJFF;
                    if (obj == null) {
                        obj = "";
                    }
                    linkedHashMap2.put("binaryData", obj);
                    String str = c86260XtI.LIZ;
                    if (str != null) {
                        linkedHashMap2.put("base64Data", str);
                    }
                    String str2 = c86260XtI.LIZIZ;
                    if (str2 != null) {
                        linkedHashMap2.put("mimeType", str2);
                    }
                    arrayList.add(linkedHashMap2);
                }
            }
            linkedHashMap.put("tempFiles", arrayList);
            AbstractC86269XtR abstractC86269XtR = this.LIZ;
            InterfaceC31943CgF interfaceC31943CgF = this.LIZIZ;
            abstractC86269XtR.getClass();
            AbstractC37780EsC.LJI(interfaceC31943CgF, msg, linkedHashMap);
            return;
        }
        AbstractC37780EsC.LJFF(this.LIZ, this.LIZIZ, -5, null, 12);
    }

    @Override // X.InterfaceC86244Xt2
    public final void onFailure(int i, String msg) {
        o.LJIIJ(msg, "msg");
        AbstractC37780EsC.LJFF(this.LIZ, this.LIZIZ, i, msg, 8);
    }
}
