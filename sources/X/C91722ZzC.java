package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.ZzC, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91722ZzC {
    public final AbstractC91695Zyl<C92143a5z> LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final java.util.Map<String, C91698Zyo> LIZLLL;
    public final List<C91712Zz2> LJ;
    public final java.util.Map<Integer, C91696Zym> LJFF;
    public final C91700Zyq LJI;
    public final String LJII;
    public final List<C91720ZzA> LJIIIIZZ;

    /* JADX WARN: Multi-variable type inference failed */
    public final C92143a5z LIZ() {
        C92143a5z LIZ = this.LIZ.LIZ();
        String str = this.LIZJ;
        if (str != null) {
            LIZ.LJIILLIIL(str);
        }
        int i = this.LIZIZ;
        if (i != -1) {
            LIZ.LJLJJLL = i;
        }
        LIZ.getClass();
        for (Map.Entry entry : ((LinkedHashMap) this.LIZLLL).entrySet()) {
            Object argumentName = entry.getKey();
            Object argument = entry.getValue();
            o.LJIIIZ(argumentName, "argumentName");
            o.LJIIIZ(argument, "argument");
            LIZ.LJLJJL.put(argumentName, argument);
        }
        Iterator it = ((ArrayList) this.LJ).iterator();
        while (it.hasNext()) {
            LIZ.LIZJ((C91712Zz2) it.next());
        }
        for (Map.Entry entry2 : ((LinkedHashMap) this.LJFF).entrySet()) {
            int intValue = ((Number) entry2.getKey()).intValue();
            Object action = entry2.getValue();
            o.LJIIIZ(action, "action");
            if (!(LIZ instanceof C92123a5f)) {
                if (intValue != 0) {
                    LIZ.LJLJJI.LJI(intValue, action);
                } else {
                    "Cannot have an action with actionId 0".toString();
                    throw new IllegalArgumentException("Cannot have an action with actionId 0");
                }
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Cannot add action ");
                LIZ2.append(intValue);
                LIZ2.append(" to ");
                LIZ2.append(LIZ);
                LIZ2.append(" as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
                throw new UnsupportedOperationException(X1D.LIZIZ(LIZ2));
            }
        }
        return LIZ;
    }

    public C91722ZzC(C91700Zyq provider, String startDestination, String str) {
        o.LJIIIZ(provider, "provider");
        o.LJIIIZ(startDestination, "startDestination");
        this.LIZ = provider.LIZIZ(C91699Zyp.LIZ(C92144a60.class));
        this.LIZIZ = -1;
        this.LIZJ = str;
        this.LIZLLL = new LinkedHashMap();
        this.LJ = new ArrayList();
        this.LJFF = new LinkedHashMap();
        this.LJIIIIZZ = new ArrayList();
        this.LJI = provider;
        this.LJII = startDestination;
    }
}
