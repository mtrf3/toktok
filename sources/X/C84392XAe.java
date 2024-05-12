package X;

import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.XAe, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84392XAe implements InterfaceC84400XAm {
    public final /* synthetic */ C84397XAj LIZ;
    public final /* synthetic */ String LIZIZ;

    @Override // X.InterfaceC84400XAm
    public final void LIZ(Exception exc) {
        this.LIZ.LIZIZ.put(this.LIZIZ, exc);
        C12310e3.LIZIZ.getClass();
        C12310e3.LIZIZ("FetchModelListTask", "fetch model list error happens!", exc);
        this.LIZ.LIZJ.remove(this.LIZIZ);
        this.LIZ.LJFF.put(this.LIZIZ, Boolean.FALSE);
    }

    @Override // X.InterfaceC84400XAm
    public final void LIZIZ(C84394XAg c84394XAg) {
        ModelInfo modelInfo;
        String name;
        C84397XAj.LJIIJJI.getClass();
        C40601ia<String, XAS> c40601ia = C84397XAj.LJII;
        String str = this.LIZIZ;
        XAS xas = c84394XAg.LIZ;
        if (xas == null) {
            HashMap hashMap = new HashMap();
            Iterator it = ((ArrayList) c84394XAg.LIZIZ.LIZJ()).iterator();
            while (it.hasNext() && (name = (modelInfo = (ModelInfo) it.next()).getName()) != null) {
                if (hashMap.containsKey(name)) {
                    if (!o.LJ(hashMap.get(name), modelInfo.getVersion())) {
                        throw new RuntimeException(a1.LJ("model ", name, " has different versions in ServerTable,Please modify the file to the correct format "));
                    }
                } else {
                    hashMap.put(name, modelInfo.getVersion());
                }
            }
            xas = new XAS();
            C1UD c1ud = new C1UD();
            for (Object obj : ((C40601ia) c84394XAg.LIZIZ.LIZ).keySet()) {
                Collection collection = (C46141rW) ((C40601ia) c84394XAg.LIZIZ.LIZ).get(obj);
                if (collection == null) {
                    collection = new ArrayList();
                }
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    c1ud.LIZIZ(obj, new X9E((ModelInfo) it2.next()));
                }
            }
            xas.LIZ = c1ud;
            xas.LIZIZ.clear();
            Iterator it3 = ((ArrayList) c1ud.LIZJ()).iterator();
            while (it3.hasNext()) {
                X9E x9e = (X9E) it3.next();
                xas.LIZIZ.put(x9e.LIZ.getName(), x9e.LIZ);
            }
            c84394XAg.LIZ = xas;
        }
        c40601ia.put(str, xas);
        this.LIZ.LIZJ.remove(this.LIZIZ);
    }

    public C84392XAe(C84397XAj c84397XAj, String str) {
        this.LIZ = c84397XAj;
        this.LIZIZ = str;
    }
}
