package X;

/* renamed from: X.15B, reason: invalid class name */
/* loaded from: classes.dex */
public final class C15B {
    public static Class LIZ(String str) {
        if (C15C.map.isEmpty()) {
            for (C15C c15c : C15C.values()) {
                C15C.map.put(c15c.getMethod(), c15c.getMessageClass());
            }
        }
        return C15C.map.get(str);
    }
}
