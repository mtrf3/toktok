package X;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.YIz, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87169YIz {
    public static final C87169YIz LIZJ = new C87169YIz();
    public final ConcurrentMap<Class<?>, YIU<?>> LIZIZ = new ConcurrentHashMap();
    public final YJE LIZ = new YJE();

    public final <T> YIU<T> LIZ(Class<T> cls) {
        YIU<T> LIZ;
        Class<?> cls2;
        if (cls != null) {
            YIU<T> yiu = (YIU) ((ConcurrentHashMap) this.LIZIZ).get(cls);
            if (yiu == null) {
                YJE yje = this.LIZ;
                yje.getClass();
                if (YIO.class.isAssignableFrom(cls) || (cls2 = C87163YIt.LIZ) == null || cls2.isAssignableFrom(cls)) {
                    InterfaceC87181YJl LIZIZ = yje.LIZ.LIZIZ(cls);
                    if (LIZIZ.LIZJ()) {
                        if (YIO.class.isAssignableFrom(cls)) {
                            LIZ = new C87168YIy<>(C87163YIt.LIZLLL, YJG.LIZ, LIZIZ.LIZ());
                        } else {
                            YJA<?, ?> yja = C87163YIt.LIZIZ;
                            YJ7<?> yj7 = YJG.LIZIZ;
                            if (yj7 != null) {
                                LIZ = new C87168YIy<>(yja, yj7, LIZIZ.LIZ());
                            } else {
                                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                            }
                        }
                    } else if (YIO.class.isAssignableFrom(cls)) {
                        if (LIZIZ.LIZIZ() == 1) {
                            LIZ = C87164YIu.LIZ(LIZIZ, VKM.LIZIZ, AbstractC84699XLz.LIZIZ, C87163YIt.LIZLLL, YJG.LIZ, C65876PtI.LIZIZ);
                        } else {
                            LIZ = C87164YIu.LIZ(LIZIZ, VKM.LIZIZ, AbstractC84699XLz.LIZIZ, C87163YIt.LIZLLL, null, C65876PtI.LIZIZ);
                        }
                    } else if (LIZIZ.LIZIZ() == 1) {
                        VKO vko = VKM.LIZ;
                        C84697XLx c84697XLx = AbstractC84699XLz.LIZ;
                        YJA<?, ?> yja2 = C87163YIt.LIZIZ;
                        YJ7<?> yj72 = YJG.LIZIZ;
                        if (yj72 != null) {
                            LIZ = C87164YIu.LIZ(LIZIZ, vko, c84697XLx, yja2, yj72, C65876PtI.LIZ);
                        } else {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                    } else {
                        LIZ = C87164YIu.LIZ(LIZIZ, VKM.LIZ, AbstractC84699XLz.LIZ, C87163YIt.LIZJ, null, C65876PtI.LIZ);
                    }
                    YIU<T> yiu2 = (YIU) ((ConcurrentHashMap) this.LIZIZ).putIfAbsent(cls, LIZ);
                    if (yiu2 != null) {
                        return yiu2;
                    }
                    return LIZ;
                }
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
            return yiu;
        }
        throw new NullPointerException("messageType");
    }
}
