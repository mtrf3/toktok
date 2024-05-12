package X;

import java.util.HashMap;

/* loaded from: classes12.dex */
public final class Q6A {
    public final synchronized void LIZ(int i, Q6C q6c) {
        java.util.Map<Integer, Q6C> map = Q6B.LIZJ;
        if (((HashMap) map).containsKey(Integer.valueOf(i))) {
            return;
        }
        ((HashMap) map).put(Integer.valueOf(i), q6c);
    }
}
