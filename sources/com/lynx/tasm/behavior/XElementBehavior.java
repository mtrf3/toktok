package com.lynx.tasm.behavior;

import X.C39934Flq;
import X.C40197Fq5;
import X.InterfaceC39937Flt;
import X.X1D;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public class XElementBehavior implements InterfaceC39937Flt {
    public static final HashSet<String> GENERATOR_FILE_NAME_SETS = new C39934Flq();
    public static volatile List<C40197Fq5> sCacheBehaviors;

    @Override // X.InterfaceC39937Flt
    public List<C40197Fq5> create() {
        synchronized (XElementBehavior.class) {
            if (sCacheBehaviors != null && !sCacheBehaviors.isEmpty()) {
                return new ArrayList(sCacheBehaviors);
            }
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = GENERATOR_FILE_NAME_SETS.iterator();
            while (it.hasNext()) {
                arrayList.addAll(getModuleBehaviors(it.next()));
            }
            sCacheBehaviors = arrayList;
            return new ArrayList(arrayList);
        }
    }

    private List<C40197Fq5> getModuleBehaviors(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append(".BehaviorGenerator");
            return (List) Class.forName(X1D.LIZIZ(LIZ)).getMethod("getBehaviors", new Class[0]).invoke(null, new Object[0]);
        } catch (Throwable unused) {
            return arrayList;
        }
    }
}
