package X;

import java.lang.reflect.Method;
import java.util.HashMap;

/* loaded from: classes7.dex */
public final class EWZ extends F9E {
    public final HashMap<Method, C36548EWa> LJLIL;
    public final HashMap<String, C36548EWa> LJLILLLLZI;

    public EWZ() {
        this(null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public EWZ(Object obj) {
        HashMap<Method, C36548EWa> hashMap = new HashMap<>();
        HashMap<String, C36548EWa> hashMap2 = new HashMap<>();
        this.LJLIL = hashMap;
        this.LJLILLLLZI = hashMap2;
    }
}
